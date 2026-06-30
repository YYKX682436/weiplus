package p10;

/* loaded from: classes8.dex */
public final class p extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.ui.C10541x905158a3 f432508d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.ui.C10541x905158a3 c10541x905158a3) {
        super(2);
        this.f432508d = c10541x905158a3;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        java.lang.String cpuProfilePath = (java.lang.String) obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cpuProfilePath, "cpuProfilePath");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("finishProfile done, success=");
        sb6.append(booleanValue);
        sb6.append(", cpuProfilePath=");
        sb6.append(cpuProfilePath);
        sb6.append(", shouldUpload=");
        com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.ui.C10541x905158a3 c10541x905158a3 = this.f432508d;
        sb6.append(c10541x905158a3.f147362v);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicDebugPanelView", sb6.toString());
        c10541x905158a3.f147347d.post(new p10.o(c10541x905158a3));
        return jz5.f0.f384359a;
    }
}
