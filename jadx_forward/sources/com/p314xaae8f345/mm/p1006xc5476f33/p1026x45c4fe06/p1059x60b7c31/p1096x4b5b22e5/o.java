package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1096x4b5b22e5;

/* loaded from: classes7.dex */
public class o implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1096x4b5b22e5.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y f163785a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f163786b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1096x4b5b22e5.r f163787c;

    public o(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1096x4b5b22e5.r rVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y yVar, int i17) {
        this.f163787c = rVar;
        this.f163785a = yVar;
        this.f163786b = i17;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1096x4b5b22e5.g
    public void a(boolean z17, java.lang.String str) {
        java.lang.String str2;
        java.lang.String sb6;
        if (z17) {
            sb6 = "ok";
        } else {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("fail");
            if (android.text.TextUtils.isEmpty(str)) {
                str2 = "";
            } else {
                str2 = " " + str;
            }
            sb7.append(str2);
            sb6 = sb7.toString();
        }
        this.f163785a.a(this.f163786b, this.f163787c.o(sb6));
    }
}
