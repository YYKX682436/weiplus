package o24;

/* loaded from: classes.dex */
public final class i implements js4.o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2060xf8bc3f31.p2062x5582bc23.p2076x229fdf4d.C17648x39856631 f423995a;

    public i(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2060xf8bc3f31.p2062x5582bc23.p2076x229fdf4d.C17648x39856631 c17648x39856631) {
        this.f423995a = c17648x39856631;
    }

    @Override // js4.o
    public void a(int i17, int i18, java.lang.String str) {
    }

    @Override // js4.o
    /* renamed from: onSuccess */
    public void mo14245xe05b4124(java.lang.Object obj) {
        java.lang.String str;
        r45.fs3 response = (r45.fs3) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(response, "response");
        boolean z17 = response.f456119e;
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2060xf8bc3f31.p2062x5582bc23.p2076x229fdf4d.C17648x39856631 c17648x39856631 = this.f423995a;
        if (z17) {
            str = c17648x39856631.m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.isy);
        } else if (response.f456118d > 0) {
            str = response.f456118d + ' ' + c17648x39856631.m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.j1_);
        } else {
            str = "";
        }
        c17648x39856631.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str, "<set-?>");
        c17648x39856631.f243520q = str;
        c17648x39856631.w7();
    }
}
