package az0;

/* loaded from: classes.dex */
public final class c3 implements com.p314xaae8f345.p457x3304c6.C3962x4bd0d642.OnBoolComplete {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f96912a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f96913b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 f96914c;

    public c3(java.lang.String str, long j17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        this.f96912a = str;
        this.f96913b = j17;
        this.f96914c = interfaceC29045xdcb5ca57;
    }

    @Override // com.p314xaae8f345.p457x3304c6.C3962x4bd0d642.OnBoolComplete
    /* renamed from: onComplete */
    public final void mo9333x815f5438(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasManager", "checkLocalTemplate: " + this.f96912a + ", " + this.f96913b + " -> " + z17);
        p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
        this.f96914c.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(java.lang.Boolean.valueOf(z17)));
    }
}
