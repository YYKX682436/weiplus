package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f;

/* loaded from: classes7.dex */
public final class o4 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.atomic.AtomicBoolean f166379d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 f166380e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.q4 f166381f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o4(java.util.concurrent.atomic.AtomicBoolean atomicBoolean, com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.q4 q4Var) {
        super(3);
        this.f166379d = atomicBoolean;
        this.f166380e = b4Var;
        this.f166381f = q4Var;
    }

    @Override // yz5.q
    /* renamed from: invoke */
    public java.lang.Object mo147xb9724478(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        int intValue = ((java.lang.Number) obj).intValue();
        int intValue2 = ((java.lang.Number) obj2).intValue();
        java.lang.String str = (java.lang.String) obj3;
        if (!this.f166379d.get()) {
            this.f166380e.d();
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.a6 a6Var = 4 == intValue ? com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.a6.f166026n : com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.a6.f166024i;
            yz5.p pVar = this.f166381f.f166598h;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("(");
            sb6.append(intValue);
            sb6.append(',');
            sb6.append(intValue2);
            sb6.append(") ");
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            if (str == null) {
                str = "";
            }
            sb6.append(str);
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.j4) pVar).mo149xb9724478(a6Var, sb6.toString());
        }
        return jz5.f0.f384359a;
    }
}
