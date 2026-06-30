package j85;

/* loaded from: classes15.dex */
public final class c extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f379775d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f379776e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(java.lang.String str, java.lang.String str2) {
        super(0);
        this.f379775d = str;
        this.f379776e = str2;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6952x82e688b0 c6952x82e688b0 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6952x82e688b0();
        c6952x82e688b0.f142561d = 0;
        c6952x82e688b0.f142568k = c6952x82e688b0.b("ProcessName", bm5.f1.a(), true);
        c6952x82e688b0.f142569l = c6952x82e688b0.b("ErrStack", r26.i0.v(this.f379775d + " \n " + android.util.Log.getStackTraceString(new java.lang.Throwable()), ",", ";", false, 4, null), true);
        c6952x82e688b0.f142564g = c6952x82e688b0.b("CurrentActivity", com.p314xaae8f345.mm.app.w.INSTANCE.h(), true);
        c6952x82e688b0.f142562e = c6952x82e688b0.b("ServiceName", this.f379776e, true);
        c6952x82e688b0.f142571n = 3;
        j85.g.a(j85.g.f379784a, c6952x82e688b0);
        return jz5.f0.f384359a;
    }
}
