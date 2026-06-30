package com.tencent.mm.plugin.fav.ui.widget;

/* loaded from: classes11.dex */
public class FavTagPanel extends com.tencent.mm.ui.base.MMTagPanel {
    public static final /* synthetic */ int Q = 0;
    public final java.util.LinkedList M;
    public w82.l0 N;
    public final android.view.View.OnClickListener P;

    public FavTagPanel(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.M = new java.util.LinkedList();
        this.N = null;
        this.P = new w82.k0(this);
    }

    @Override // com.tencent.mm.ui.base.MMTagPanel
    public void m() {
    }

    public void setCallBack(w82.l0 l0Var) {
        this.N = l0Var;
        super.setCallBack((db5.t6) l0Var);
    }

    public void setType(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.FavTagPanel", "want to add type, but it is null or empty");
            return;
        }
        java.lang.String trim = str.trim();
        java.util.LinkedList linkedList = this.M;
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            if (trim.equals(((db5.b7) it.next()).f228295a)) {
                com.tencent.mars.xlog.Log.w("MicroMsg.FavTagPanel", "want to add type %s, but it exsited!", trim);
                return;
            }
        }
        linkedList.clear();
        db5.b7 i17 = i();
        linkedList.add(i17);
        t(i17, trim, true);
        i17.f228296b.setOnClickListener(this.P);
        removeViews(0, getChildCount() - 1);
        addView(i17.f228296b, 0);
        h();
    }

    public void v(java.lang.String str, java.lang.String str2) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FavTagPanel", "[changeTag] origin = " + str + ", newTag = " + str2);
        if (com.tencent.mm.sdk.platformtools.t8.K0(str) || com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.FavTagPanel", "[changeTag] want to change tag, but it is null or empty");
            return;
        }
        int i17 = 0;
        while (true) {
            java.util.LinkedList linkedList = this.A;
            if (i17 >= linkedList.size()) {
                return;
            }
            db5.b7 b7Var = (db5.b7) linkedList.get(i17);
            com.tencent.mars.xlog.Log.i("MicroMsg.FavTagPanel", "[changeTag] tagStr = " + b7Var.f228295a);
            if (str.equals(b7Var.f228295a)) {
                b7Var.f228295a = str2;
                b7Var.f228296b.invalidate();
                return;
            }
            i17++;
        }
    }

    public FavTagPanel(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.M = new java.util.LinkedList();
        this.N = null;
        this.P = new w82.k0(this);
    }
}
