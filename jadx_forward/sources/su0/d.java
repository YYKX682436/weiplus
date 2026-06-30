package su0;

/* loaded from: classes5.dex */
public final class d extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ su0.j f494170d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yu0.q f494171e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 f494172f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(su0.j jVar, yu0.q qVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(1);
        this.f494170d = jVar;
        this.f494171e = qVar;
        this.f494172f = interfaceC29045xdcb5ca57;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        com.p314xaae8f345.p457x3304c6.p482xca9708e2.C4194x93c4c6d6 c4194x93c4c6d6 = (com.p314xaae8f345.p457x3304c6.p482xca9708e2.C4194x93c4c6d6) obj;
        yu0.q qVar = this.f494171e;
        su0.j jVar = this.f494170d;
        if (c4194x93c4c6d6 != null) {
            java.lang.String str = qVar.f547363a;
            java.nio.ByteBuffer byteBuffer = c4194x93c4c6d6.f130072a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(byteBuffer, "getData(...)");
            jVar.getClass();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(str);
            java.lang.String roleID = qVar.f547364b;
            sb6.append(roleID);
            java.lang.String sb7 = sb6.toString();
            jVar.f494194e.put(sb7, byteBuffer);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(roleID, "roleID");
            r26.n0.B(roleID, "vits", false);
            java.lang.String a17 = uu0.l.a("silk", sb7);
            try {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(a17);
                ru0.a.e(byteBuffer, a17);
                byteBuffer.rewind();
            } catch (java.lang.Exception unused) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MJTTSTaskExecutor", "saveSilkBufferToFile: IO failed");
            }
            ((vu0.r) jVar.f494191b).a(qVar.f547367e, qVar.f547363a, qVar.f547364b, qVar.f547365c, byteBuffer);
        } else {
            ((vu0.r) jVar.f494191b).b(qVar.f547367e, qVar.f547364b);
        }
        p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
        this.f494172f.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(java.lang.Boolean.valueOf(c4194x93c4c6d6 != null)));
        return jz5.f0.f384359a;
    }
}
