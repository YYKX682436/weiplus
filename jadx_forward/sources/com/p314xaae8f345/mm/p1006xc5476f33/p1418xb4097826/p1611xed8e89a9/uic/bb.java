package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic;

/* loaded from: classes2.dex */
public final class bb extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.text.SpannableString f205093d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f205094e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f205095f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.StringBuilder f205096g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.ob f205097h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ ya2.b2 f205098i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bb(android.text.SpannableString spannableString, int i17, int i18, java.lang.StringBuilder sb6, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.ob obVar, ya2.b2 b2Var) {
        super(3);
        this.f205093d = spannableString;
        this.f205094e = i17;
        this.f205095f = i18;
        this.f205096g = sb6;
        this.f205097h = obVar;
        this.f205098i = b2Var;
    }

    @Override // yz5.q
    /* renamed from: invoke */
    public java.lang.Object mo147xb9724478(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        int intValue = ((java.lang.Number) obj).intValue();
        int intValue2 = ((java.lang.Number) obj2).intValue();
        java.lang.String nickname = (java.lang.String) obj3;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nickname, "nickname");
        this.f205093d.setSpan(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.yl(nickname, this.f205094e, this.f205095f, false, false, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.ab(this.f205097h, this.f205098i), 16, null), intValue, intValue2, 17);
        this.f205096g.append(nickname.concat("|"));
        return jz5.f0.f384359a;
    }
}
