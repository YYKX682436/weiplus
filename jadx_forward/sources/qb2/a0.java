package qb2;

/* loaded from: classes10.dex */
public final class a0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qb2.b0 f442690d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f442691e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f442692f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(qb2.b0 b0Var, java.util.List list, boolean z17) {
        super(0);
        this.f442690d = b0Var;
        this.f442691e = list;
        this.f442692f = z17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        qb2.b0 b0Var = this.f442690d;
        int mo1894x7e414b06 = b0Var.mo1894x7e414b06();
        java.util.List<qb2.t> list = this.f442691e;
        for (qb2.t tVar : list) {
            java.util.HashMap hashMap = b0Var.f442706o;
            if (!hashMap.containsKey(tVar.f65866xbed8694c)) {
                java.lang.String field_sessionId = tVar.f65866xbed8694c;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_sessionId, "field_sessionId");
                hashMap.put(field_sessionId, tVar);
                b0Var.f442705n.add(tVar);
            }
        }
        if (this.f442692f) {
            b0Var.m8146xced61ae5();
        } else {
            b0Var.r(mo1894x7e414b06, list.size());
        }
        return jz5.f0.f384359a;
    }
}
