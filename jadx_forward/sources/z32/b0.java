package z32;

/* loaded from: classes12.dex */
public final class b0 implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.e6 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f551414a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f551415b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r45.ed6 f551416c;

    public b0(int i17, int i18, java.lang.String str, r45.ed6 ed6Var) {
        this.f551414a = i18;
        this.f551415b = str;
        this.f551416c = ed6Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.e6
    public final void a(k91.v5 v5Var) {
        if (v5Var == null) {
            java.lang.String str = this.f551416c.f454860d;
            return;
        }
        a42.c cVar = a42.c.f82733a;
        int i17 = this.f551414a;
        java.lang.String field_nickname = v5Var.f68913x21f9b213;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_nickname, "field_nickname");
        cVar.a(i17, 3, field_nickname, 2, 2, this.f551415b);
    }
}
