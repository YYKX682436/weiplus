package com.tencent.mm.plugin.exdevice.ui;

/* loaded from: classes12.dex */
public class o3 extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f99602d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f99603e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f99604f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f99605g;

    public o3(android.content.Context context, java.lang.String str) {
        this.f99602d = context;
        this.f99603e = str;
        this.f99604f = c01.z1.r().equals(str);
        kotlin.jvm.internal.o.g(context, "context");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        this.f99605g = ((z32.s) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(z32.s.class)).f469938g;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        java.util.LinkedList linkedList = this.f99605g;
        if (com.tencent.mm.sdk.platformtools.t8.L0(linkedList)) {
            return 2;
        }
        return linkedList.size() + 2;
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        return java.lang.Integer.valueOf(i17);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getItemViewType(int i17) {
        if (i17 == 0) {
            return 0;
        }
        if (i17 > 0) {
            java.util.LinkedList linkedList = this.f99605g;
            if (!com.tencent.mm.sdk.platformtools.t8.L0(linkedList) && i17 <= linkedList.size()) {
                return 1;
            }
        }
        return this.f99604f ? 2 : 3;
    }

    /* JADX WARN: Removed duplicated region for block: B:319:0x084e  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x085a  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x0867  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x086a  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x08bb  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x090a  */
    /* JADX WARN: Removed duplicated region for block: B:342:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x050a  */
    @Override // android.widget.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View getView(int r30, android.view.View r31, android.view.ViewGroup r32) {
        /*
            Method dump skipped, instructions count: 2333
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.exdevice.ui.o3.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getViewTypeCount() {
        return 4;
    }
}
