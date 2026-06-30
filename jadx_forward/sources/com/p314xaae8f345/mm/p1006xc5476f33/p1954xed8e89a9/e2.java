package com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9;

/* loaded from: classes.dex */
public final class e2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f234992d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.z3 f234993e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e2(android.content.Intent intent, com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var) {
        super(1);
        this.f234992d = intent;
        this.f234993e = z3Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.String phone = (java.lang.String) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(phone, "phone");
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.d2 d2Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.d2(this.f234992d, this.f234993e, phone);
        android.text.SpannableString spannableString = new android.text.SpannableString(phone);
        spannableString.setSpan(d2Var, 0, phone.length(), 17);
        return spannableString;
    }
}
