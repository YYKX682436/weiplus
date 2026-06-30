package ou4;

/* loaded from: classes8.dex */
public final class k extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ou4.n f430520d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f430521e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(ou4.n nVar, java.lang.String str) {
        super(1);
        this.f430520d = nVar;
        this.f430521e = str;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.Object value = ((p3321xbce91901.C29043x91b2b43d) obj).getValue();
        boolean m143903xa8fbbff4 = p3321xbce91901.C29043x91b2b43d.m143903xa8fbbff4(value);
        ou4.n nVar = this.f430520d;
        if (m143903xa8fbbff4) {
            java.lang.String str = ((com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.m2) nVar).f263102g;
        }
        java.lang.Throwable m143898xd4a2fc34 = p3321xbce91901.C29043x91b2b43d.m143898xd4a2fc34(value);
        if (m143898xd4a2fc34 != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(((com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.m2) nVar).f263102g, "callFlutter: " + this.f430521e + " failed: " + m143898xd4a2fc34.getMessage());
        }
        return jz5.f0.f384359a;
    }
}
