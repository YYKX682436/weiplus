package oc5;

/* loaded from: classes4.dex */
public final class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ oc5.b f425921d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f425922e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f425923f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f425924g;

    public c(oc5.b bVar, int i17, int i18, long j17) {
        this.f425921d = bVar;
        this.f425922e = i17;
        this.f425923f = i18;
        this.f425924g = j17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte[] N;
        oc5.b bVar = this.f425921d;
        bVar.getClass();
        if (com.p314xaae8f345.mm.vfs.w6.j("") && (N = com.p314xaae8f345.mm.vfs.w6.N("", 0, -1)) != null) {
            try {
                java.lang.String b17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.b(N);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b17, "getMD5String(...)");
                bVar.f425917a = b17;
            } catch (java.lang.Exception unused) {
            }
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6367x7875a8e4 c6367x7875a8e4 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6367x7875a8e4();
            bVar.getClass();
            c6367x7875a8e4.t("");
            c6367x7875a8e4.f137160e = this.f425922e;
            c6367x7875a8e4.f137161f = this.f425923f;
            c6367x7875a8e4.f137162g = 0;
            c6367x7875a8e4.r(java.lang.String.valueOf(0L));
            c6367x7875a8e4.f137165j = 0;
            c6367x7875a8e4.p("");
            c6367x7875a8e4.s(bVar.f425917a);
            c6367x7875a8e4.f137168m = this.f425924g;
            c6367x7875a8e4.k();
        }
    }
}
