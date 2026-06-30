package fi1;

/* loaded from: classes.dex */
public final class y implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f344332d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1164xa249a171.ui.p1166xb84f61fc.C12479xe0723f03 f344333e;

    public y(java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1164xa249a171.ui.p1166xb84f61fc.C12479xe0723f03 c12479xe0723f03) {
        this.f344332d = str;
        this.f344333e = c12479xe0723f03;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59 c22633x83752a59;
        java.lang.String format = java.lang.String.format("javascript:OpenMaterialJsApi['%s'] && OpenMaterialJsApi.%s(%s)", java.util.Arrays.copyOf(new java.lang.Object[]{"onWindowHeightChange", "onWindowHeightChange", this.f344332d}, 3));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
        c22633x83752a59 = this.f344333e.webView;
        c22633x83752a59.mo14660x738236e6(format, fi1.x.f344331a);
    }
}
