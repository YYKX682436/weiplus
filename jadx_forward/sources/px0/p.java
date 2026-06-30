package px0;

/* loaded from: classes.dex */
public final class p extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f440325d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.q f440326e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, p3325xe03a0797.p3326xc267989b.q qVar) {
        super(2);
        this.f440325d = h0Var;
        this.f440326e = qVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        r45.q23 info = (r45.q23) obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = this.f440325d;
        h0Var.f391656d = info;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MaterialImportPreviewFragment", "saveAsyncAIGCDraft result " + booleanValue + ' ' + h0Var.f391656d);
        if (!booleanValue) {
            p3325xe03a0797.p3326xc267989b.r rVar = (p3325xe03a0797.p3326xc267989b.r) this.f440326e;
            if (rVar.n()) {
                rVar.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(new jz5.l(null, "saveAsyncAIGCDraft error")));
            }
        }
        return jz5.f0.f384359a;
    }
}
