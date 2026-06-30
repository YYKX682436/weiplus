package az0;

/* loaded from: classes5.dex */
public final class i extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 f97082d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f97083e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f97084f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57, java.lang.String str, long j17) {
        super(1);
        this.f97082d = interfaceC29045xdcb5ca57;
        this.f97083e = str;
        this.f97084f = j17;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b c4093x6b88526b = (com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b) obj;
        bz0.b bVar = bz0.b.f118257a;
        long j17 = this.f97084f;
        p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57 = this.f97082d;
        if (c4093x6b88526b != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MaasFuncUtils", c4093x6b88526b.f129708ec + ' ' + c4093x6b88526b.f16057x38eb0007, new java.lang.Throwable());
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            interfaceC29045xdcb5ca57.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(java.lang.Boolean.FALSE));
            bz0.b.b(bVar, this.f97083e, c4093x6b88526b, java.lang.System.currentTimeMillis() - j17, 0, 8, null);
        } else {
            p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            interfaceC29045xdcb5ca57.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(java.lang.Boolean.TRUE));
            bz0.b.d(bVar, this.f97083e, java.lang.System.currentTimeMillis() - j17, 0, 4, null);
        }
        return jz5.f0.f384359a;
    }
}
