package gf4;

/* loaded from: classes4.dex */
public final class b extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f352875d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var) {
        super(0);
        this.f352875d = h0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.util.Iterator it = gf4.l.f352896p.iterator();
        while (it.hasNext()) {
            yz5.r rVar = (yz5.r) it.next();
            p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = this.f352875d;
            java.lang.Long valueOf = java.lang.Long.valueOf(((nf4.b) h0Var.f391656d).f66010x44346ab);
            java.lang.Boolean bool = java.lang.Boolean.TRUE;
            nf4.b bVar = (nf4.b) h0Var.f391656d;
            rVar.C(valueOf, bool, bVar.f418373x, bVar.f418374y);
        }
        return jz5.f0.f384359a;
    }
}
