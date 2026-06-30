package rf4;

/* loaded from: classes4.dex */
public final class x0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.C18482x82fd8d8f f476656d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f476657e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.C18482x82fd8d8f c18482x82fd8d8f, android.content.Context context) {
        super(2);
        this.f476656d = c18482x82fd8d8f;
        this.f476657e = context;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.C18481x2b6a00e5 c18481x2b6a00e5;
        gf4.a comment = (gf4.a) obj;
        boolean booleanValue = ((java.lang.Boolean) obj2).booleanValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(comment, "comment");
        com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.C18482x82fd8d8f c18482x82fd8d8f = this.f476656d;
        if (booleanValue) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.C18482x82fd8d8f.c(c18482x82fd8d8f);
            java.lang.String str = comment.f352863a;
            c18482x82fd8d8f.C = str;
            c18482x82fd8d8f.D = comment.f352867e;
            rf4.a aVar = c18482x82fd8d8f.f253505x;
            if (aVar != null && (c18481x2b6a00e5 = aVar.f476548f) != null) {
                c18481x2b6a00e5.c((java.lang.CharSequence) c18482x82fd8d8f.B.get(str), c18482x82fd8d8f.C, true);
            }
        } else {
            int i17 = comment.f352874l;
            android.content.Context context = this.f476657e;
            java.lang.String string = i17 == 0 ? context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.jlm) : context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.jlo);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(context);
            u1Var.g(string);
            u1Var.n(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571900t0));
            u1Var.k(-65536);
            u1Var.a(true);
            u1Var.b(new rf4.w0(c18482x82fd8d8f, comment));
            u1Var.q(false);
        }
        return jz5.f0.f384359a;
    }
}
