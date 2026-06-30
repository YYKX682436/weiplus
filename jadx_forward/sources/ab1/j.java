package ab1;

/* loaded from: classes.dex */
public final class j extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.c0 f84256d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f84257e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ab1.l f84258f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1060xbb979bf4.C11955x784e8974 f84259g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f84260h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var, yz5.l lVar, ab1.l lVar2, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1060xbb979bf4.C11955x784e8974 c11955x784e8974, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var) {
        super(1);
        this.f84256d = c0Var;
        this.f84257e = lVar;
        this.f84258f = lVar2;
        this.f84259g = c11955x784e8974;
        this.f84260h = h0Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.p1019x633fb29.C11485x80cda4c8 rcptItem = (com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.p1019x633fb29.C11485x80cda4c8) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rcptItem, "rcptItem");
        this.f84256d.f391645d = true;
        ab1.l lVar = this.f84258f;
        lVar.getClass();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.String post = rcptItem.f155906f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(post, "post");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1060xbb979bf4.C11956x94aa59fc c11956x94aa59fc = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1060xbb979bf4.C11956x94aa59fc(arrayList, java.lang.Integer.parseInt(r26.n0.u0(post).toString()));
        do {
            ab1.c cVar = this.f84259g.f160238d;
            ab1.c cVar2 = ab1.c.f84245h;
            java.lang.String str = rcptItem.f155905e;
            if (cVar == cVar2) {
                str = u46.l.t(str, 0, 6);
            }
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
            int parseInt = java.lang.Integer.parseInt(str);
            java.lang.String name = rcptItem.f155904d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(name, "name");
            c11956x94aa59fc.f160241d.add(0, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1060xbb979bf4.C11954x6b9417d7(name, parseInt));
            rcptItem = lVar.wi().c(rcptItem.f155908h);
        } while (rcptItem != null);
        this.f84257e.mo146xb9724478(c11956x94aa59fc);
        java.lang.Object obj2 = this.f84260h.f391656d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(obj2);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.l1) obj2).dismiss();
        return jz5.f0.f384359a;
    }
}
