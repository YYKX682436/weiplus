package com.p176xb6135e39.p283xc50a8b8b;

/* loaded from: classes16.dex */
public final class k9 implements com.p176xb6135e39.p283xc50a8b8b.l8 {

    /* renamed from: a, reason: collision with root package name */
    public final com.p176xb6135e39.p283xc50a8b8b.o8 f126801a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f126802b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.Object[] f126803c;

    /* renamed from: d, reason: collision with root package name */
    public final int f126804d;

    public k9(com.p176xb6135e39.p283xc50a8b8b.o8 o8Var, java.lang.String str, java.lang.Object[] objArr) {
        this.f126801a = o8Var;
        this.f126802b = str;
        this.f126803c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.f126804d = charAt;
            return;
        }
        int i17 = charAt & 8191;
        int i18 = 13;
        int i19 = 1;
        while (true) {
            int i27 = i19 + 1;
            char charAt2 = str.charAt(i19);
            if (charAt2 < 55296) {
                this.f126804d = i17 | (charAt2 << i18);
                return;
            } else {
                i17 |= (charAt2 & 8191) << i18;
                i18 += 13;
                i19 = i27;
            }
        }
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l8
    public boolean a() {
        return (this.f126804d & 2) == 2;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l8
    public com.p176xb6135e39.p283xc50a8b8b.o8 b() {
        return this.f126801a;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l8
    public com.p176xb6135e39.p283xc50a8b8b.g9 c() {
        return (this.f126804d & 1) == 1 ? com.p176xb6135e39.p283xc50a8b8b.g9.PROTO2 : com.p176xb6135e39.p283xc50a8b8b.g9.PROTO3;
    }
}
