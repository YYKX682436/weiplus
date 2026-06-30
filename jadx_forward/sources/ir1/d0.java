package ir1;

/* loaded from: classes11.dex */
public final class d0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ir1.e0 f375485d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f375486e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f375487f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(ir1.e0 e0Var, java.util.List list, boolean z17) {
        super(0);
        this.f375485d = e0Var;
        this.f375486e = list;
        this.f375487f = z17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        ir1.e0 e0Var = this.f375485d;
        int mo1894x7e414b06 = e0Var.mo1894x7e414b06();
        for (hr1.e eVar : this.f375486e) {
            java.util.HashMap hashMap = e0Var.f375495i;
            if (!hashMap.containsKey(eVar.f66326xbed8694c)) {
                java.lang.String field_sessionId = eVar.f66326xbed8694c;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_sessionId, "field_sessionId");
                hashMap.put(field_sessionId, eVar);
                e0Var.f375494h.add(eVar);
            }
        }
        if (this.f375487f) {
            e0Var.m8146xced61ae5();
        } else {
            e0Var.m8153xd399a4d9(mo1894x7e414b06, e0Var.mo1894x7e414b06());
        }
        return jz5.f0.f384359a;
    }
}
