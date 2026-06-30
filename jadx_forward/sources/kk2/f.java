package kk2;

/* loaded from: classes3.dex */
public final class f extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kk2.p f390021d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(kk2.p pVar) {
        super(0);
        this.f390021d = pVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        kk2.p pVar = this.f390021d;
        fg2.s1 s1Var = pVar.f390043o;
        if (s1Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
            throw null;
        }
        s1Var.f343837j.setVisibility(0);
        fg2.s1 s1Var2 = pVar.f390043o;
        if (s1Var2 != null) {
            s1Var2.f343829b.setVisibility(4);
            return jz5.f0.f384359a;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
        throw null;
    }
}
