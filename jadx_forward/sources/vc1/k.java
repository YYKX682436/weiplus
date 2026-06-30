package vc1;

/* loaded from: classes13.dex */
public class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f516528d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f516529e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ vc1.p1 f516530f;

    public k(vc1.p1 p1Var, float f17, float f18) {
        this.f516530f = p1Var;
        this.f516528d = f17;
        this.f516529e = f18;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4394xa89e978e mo98961xd2ef9864;
        vc1.p1 p1Var = this.f516530f;
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25945x718093f7 mo98897xb5885626 = p1Var.f516601e.mo98897xb5885626();
        if (mo98897xb5885626 == null || (mo98961xd2ef9864 = mo98897xb5885626.mo98961xd2ef9864()) == null) {
            return;
        }
        float f17 = this.f516528d;
        if (f17 != -1.0f) {
            p1Var.C = f17;
        } else if (p1Var.C0) {
            f17 = mo98961xd2ef9864.m37101x2fd5b378();
            p1Var.C = f17;
        } else {
            f17 = p1Var.C;
        }
        float f18 = this.f516529e;
        if (f18 != -1.0f) {
            p1Var.D = f18;
        } else if (p1Var.C0) {
            f18 = mo98961xd2ef9864.m37102xfb854d80();
            p1Var.D = f18;
        } else {
            f18 = p1Var.D;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Map.DefaultTencentMapView", "map:%s rotateTo rotate:%f, skew:%f", p1Var, java.lang.Float.valueOf(f17), java.lang.Float.valueOf(f18));
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.C25936xd5528c6e m98887xfd98fd36 = com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.C25937xd3dd04bc.m98887xfd98fd36(new com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4394xa89e978e.Builder(mo98961xd2ef9864).m37107xf20877ae(f17).m37109x35e50a(f18).m37108x59bc66e());
        p1Var.f516592J = false;
        mo98897xb5885626.mo98953x59b77566(m98887xfd98fd36, vc1.p1.F0, p1Var.T);
    }
}
