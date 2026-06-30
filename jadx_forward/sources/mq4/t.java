package mq4;

/* loaded from: classes8.dex */
public class t implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mq4.u f412340d;

    public t(mq4.u uVar) {
        this.f412340d = uVar;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        mq4.u uVar = this.f412340d;
        vq4.d0.a(uVar.f412341h, "onSceneEnd type:" + m1Var.mo808xfb85f7b0() + " errType:" + i17 + " errCode:" + i18);
        if (i17 != 0 || i18 != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(uVar.f412341h, "onSceneEnd: error %d %d %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        } else {
            r45.m37 m37Var = (r45.m37) uVar.f412326d.f152243a.f152217a;
            if (m37Var != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.j0.m(m37Var.f461660e, m37Var.f461661f, 0);
            }
        }
    }
}
