package wu;

/* loaded from: classes9.dex */
public abstract class p extends in5.r {

    /* renamed from: g, reason: collision with root package name */
    public static final int f531142g = i65.a.h(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30860x5b28f31.f561251db);

    /* renamed from: e, reason: collision with root package name */
    public final hu.f f531143e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1925x6c8df6be.C16718x7059cefe f531144f;

    public p(hu.f uiParams, com.p314xaae8f345.mm.p1006xc5476f33.p1925x6c8df6be.C16718x7059cefe mvvmList) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(uiParams, "uiParams");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mvvmList, "mvvmList");
        this.f531143e = uiParams;
        this.f531144f = mvvmList;
    }

    @Override // in5.r
    public int e() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f570913em2;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x03f1  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x040e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x042a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x04ae  */
    @Override // in5.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void h(in5.s0 r28, in5.c r29, int r30, int r31, boolean r32, java.util.List r33) {
        /*
            Method dump skipped, instructions count: 2051
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wu.p.h(in5.s0, in5.c, int, int, boolean, java.util.List):void");
    }

    @Override // in5.r
    public void i(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, in5.s0 holder, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) holder.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.cgz);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(frameLayout, "getContentContainer(...)");
        p(frameLayout, i17);
    }

    public abstract void n(android.widget.FrameLayout frameLayout, hu.b bVar, int i17, int i18);

    public void o(android.view.View view, hu.b item) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
    }

    public abstract void p(android.widget.FrameLayout frameLayout, int i17);
}
