package va2;

/* loaded from: classes2.dex */
public final class a extends x92.e {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
    }

    @Override // x92.e
    public v92.g X6() {
        return new ta2.b((r45.r03) this.f534252d, m158354x19263085());
    }

    @Override // x92.e
    public java.lang.String Y6() {
        java.lang.String m75945x2fec8307;
        java.lang.String stringExtra = m158359x1e885992().getStringExtra("key_topic_title");
        if (stringExtra == null) {
            stringExtra = "";
        }
        r45.r03 r03Var = (r45.r03) this.f534252d;
        if (r03Var != null && (m75945x2fec8307 = r03Var.m75945x2fec8307(0)) != null) {
            stringExtra = m75945x2fec8307;
        }
        return "#".concat(stringExtra);
    }
}
