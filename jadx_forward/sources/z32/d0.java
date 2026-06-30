package z32;

/* loaded from: classes12.dex */
public final class d0 implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.e6 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f551434a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r32.d f551435b;

    public d0(int i17, r32.d dVar) {
        this.f551434a = i17;
        this.f551435b = dVar;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.e6
    public final void a(k91.v5 v5Var) {
        if (v5Var != null) {
            a42.c cVar = a42.c.f82733a;
            int i17 = this.f551434a;
            java.lang.String field_nickname = v5Var.f68913x21f9b213;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_nickname, "field_nickname");
            java.lang.String field_username = this.f551435b.f67224xdec927b;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_username, "field_username");
            cVar.a(i17, 3, field_nickname, 2, 2, field_username);
        }
    }
}
