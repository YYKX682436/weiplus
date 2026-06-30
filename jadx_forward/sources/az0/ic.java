package az0;

/* loaded from: classes5.dex */
public final class ic implements com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4079x793f83.OnComplete {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 f97126a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f97127b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f97128c;

    public ic(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57, java.lang.String str, long j17) {
        this.f97126a = interfaceC29045xdcb5ca57;
        this.f97127b = str;
        this.f97128c = j17;
    }

    @Override // com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4079x793f83.OnComplete
    /* renamed from: onComplete */
    public final void mo9331x815f5438(com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b c4093x6b88526b) {
        p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57 = this.f97126a;
        if (c4093x6b88526b == null) {
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            interfaceC29045xdcb5ca57.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(java.lang.Boolean.TRUE));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MaasFuncUtils", c4093x6b88526b.f129708ec + ' ' + c4093x6b88526b.f16057x38eb0007, new java.lang.Throwable());
        p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
        interfaceC29045xdcb5ca57.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(java.lang.Boolean.FALSE));
        bz0.b.b(bz0.b.f118257a, this.f97127b, c4093x6b88526b, java.lang.System.currentTimeMillis() - this.f97128c, 0, 8, null);
    }
}
