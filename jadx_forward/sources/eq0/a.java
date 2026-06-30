package eq0;

/* loaded from: classes7.dex */
public final class a extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ eq0.b f337314d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f337315e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(eq0.b bVar, long j17) {
        super(1);
        this.f337314d = bVar;
        this.f337315e = j17;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.Object value = ((p3321xbce91901.C29043x91b2b43d) obj).getValue();
        java.lang.Throwable m143898xd4a2fc34 = p3321xbce91901.C29043x91b2b43d.m143898xd4a2fc34(value);
        if (m143898xd4a2fc34 != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MagicSclRequestImpl", m143898xd4a2fc34, "preInit fail", new java.lang.Object[0]);
        } else {
            if (p3321xbce91901.C29043x91b2b43d.m143902xc481aacd(value)) {
                value = null;
            }
            java.lang.Double d17 = (java.lang.Double) value;
            com.p314xaae8f345.p3133xd0ce8b26.p3172x390bf7.InterfaceC27679x50db0040.Callback callback = this.f337314d.f337317b;
            if (callback != null) {
                callback.mo119361xd5eff7a2(this.f337315e, d17 != null ? d17.doubleValue() : 0.0d);
            }
        }
        return jz5.f0.f384359a;
    }
}
