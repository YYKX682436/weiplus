package lx;

/* loaded from: classes4.dex */
public final class j5 implements q80.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ lx.m5 f403353a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yz5.l f403354b;

    public j5(lx.m5 m5Var, yz5.l lVar) {
        this.f403353a = m5Var;
        this.f403354b = lVar;
    }

    @Override // q80.f0
    /* renamed from: fail */
    public void mo555x2fd71e() {
        lx.m5.a(this.f403353a);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FlutterBizPublishPlugin", "openRedPacketCoverLiteApp: start fail");
        p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
        this.f403354b.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(new java.lang.Exception("Failed to start LiteApp")))));
    }

    @Override // q80.f0
    /* renamed from: success */
    public void mo556x90b54003() {
        lx.m5.a(this.f403353a);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FlutterBizPublishPlugin", "openRedPacketCoverLiteApp: start success");
    }
}
