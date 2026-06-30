package sf2;

/* loaded from: classes3.dex */
public final class a0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dk2.p f488557d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.u82 f488558e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f488559f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(dk2.p pVar, r45.u82 u82Var, yz5.l lVar) {
        super(0);
        this.f488557d = pVar;
        this.f488558e = u82Var;
        this.f488559f = lVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        dk2.p pVar = this.f488557d;
        java.lang.String str = pVar.f315412h;
        r45.u82 u82Var = this.f488558e;
        pVar.n(str, u82Var);
        java.util.LinkedList m75941xfb821914 = u82Var.m75941xfb821914(1);
        this.f488559f.mo146xb9724478(java.lang.Integer.valueOf(m75941xfb821914 != null ? m75941xfb821914.size() : 0));
        return jz5.f0.f384359a;
    }
}
