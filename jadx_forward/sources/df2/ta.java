package df2;

/* loaded from: classes.dex */
public final class ta extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.zb f312963d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ta(df2.zb zbVar) {
        super(1);
        this.f312963d = zbVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.util.List<r45.mf1> results = (java.util.List) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(results, "results");
        for (r45.mf1 mf1Var : results) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f312963d.f313472m, "[aiAssistant] mockEcho: " + mf1Var.m75945x2fec8307(3) + " success=" + mf1Var.m75945x2fec8307(5));
        }
        return jz5.f0.f384359a;
    }
}
