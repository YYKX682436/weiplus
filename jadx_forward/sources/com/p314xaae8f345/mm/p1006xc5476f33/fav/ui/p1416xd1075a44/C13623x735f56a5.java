package com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1416xd1075a44;

/* renamed from: com.tencent.mm.plugin.fav.ui.widget.FavTagPanel */
/* loaded from: classes11.dex */
public class C13623x735f56a5 extends com.p314xaae8f345.mm.ui.p2642x2e06d1.C21516xe823d84a {
    public static final /* synthetic */ int Q = 0;
    public final java.util.LinkedList M;
    public w82.l0 N;
    public final android.view.View.OnClickListener P;

    public C13623x735f56a5(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.M = new java.util.LinkedList();
        this.N = null;
        this.P = new w82.k0(this);
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.C21516xe823d84a
    public void m() {
    }

    /* renamed from: setCallBack */
    public void m55400x6c4032e7(w82.l0 l0Var) {
        this.N = l0Var;
        super.m79124x6c4032e7((db5.t6) l0Var);
    }

    /* renamed from: setType */
    public void m55401x7650bebc(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FavTagPanel", "want to add type, but it is null or empty");
            return;
        }
        java.lang.String trim = str.trim();
        java.util.LinkedList linkedList = this.M;
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            if (trim.equals(((db5.b7) it.next()).f309828a)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FavTagPanel", "want to add type %s, but it exsited!", trim);
                return;
            }
        }
        linkedList.clear();
        db5.b7 i17 = i();
        linkedList.add(i17);
        t(i17, trim, true);
        i17.f309829b.setOnClickListener(this.P);
        removeViews(0, getChildCount() - 1);
        addView(i17.f309829b, 0);
        h();
    }

    public void v(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavTagPanel", "[changeTag] origin = " + str + ", newTag = " + str2);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FavTagPanel", "[changeTag] want to change tag, but it is null or empty");
            return;
        }
        int i17 = 0;
        while (true) {
            java.util.LinkedList linkedList = this.A;
            if (i17 >= linkedList.size()) {
                return;
            }
            db5.b7 b7Var = (db5.b7) linkedList.get(i17);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavTagPanel", "[changeTag] tagStr = " + b7Var.f309828a);
            if (str.equals(b7Var.f309828a)) {
                b7Var.f309828a = str2;
                b7Var.f309829b.invalidate();
                return;
            }
            i17++;
        }
    }

    public C13623x735f56a5(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.M = new java.util.LinkedList();
        this.N = null;
        this.P = new w82.k0(this);
    }
}
