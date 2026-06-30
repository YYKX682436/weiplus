package az0;

/* loaded from: classes5.dex */
public final class pc implements com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4073xbc40c54.OnComplete {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f97350a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 f97351b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f97352c;

    public pc(java.lang.String str, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57, long j17) {
        this.f97350a = str;
        this.f97351b = interfaceC29045xdcb5ca57;
        this.f97352c = j17;
    }

    @Override // com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4073xbc40c54.OnComplete
    /* renamed from: onComplete */
    public final void mo9354x815f5438(com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b c4093x6b88526b) {
        long j17 = this.f97352c;
        bz0.b bVar = bz0.b.f118257a;
        p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57 = this.f97351b;
        if (c4093x6b88526b == null) {
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            interfaceC29045xdcb5ca57.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(java.lang.Boolean.TRUE));
            bz0.b.d(bVar, this.f97350a, java.lang.System.currentTimeMillis() - j17, 0, 4, null);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MaasFuncUtils", this.f97350a + " call error: " + c4093x6b88526b.f129708ec + ' ' + c4093x6b88526b.f16057x38eb0007, new java.lang.Throwable());
        p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
        interfaceC29045xdcb5ca57.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(java.lang.Boolean.FALSE));
        bz0.b.b(bVar, this.f97350a, c4093x6b88526b, java.lang.System.currentTimeMillis() - j17, 0, 8, null);
    }
}
