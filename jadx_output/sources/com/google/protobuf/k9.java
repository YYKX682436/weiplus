package com.google.protobuf;

/* loaded from: classes16.dex */
public final class k9 implements com.google.protobuf.l8 {

    /* renamed from: a, reason: collision with root package name */
    public final com.google.protobuf.o8 f45268a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f45269b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.Object[] f45270c;

    /* renamed from: d, reason: collision with root package name */
    public final int f45271d;

    public k9(com.google.protobuf.o8 o8Var, java.lang.String str, java.lang.Object[] objArr) {
        this.f45268a = o8Var;
        this.f45269b = str;
        this.f45270c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.f45271d = charAt;
            return;
        }
        int i17 = charAt & 8191;
        int i18 = 13;
        int i19 = 1;
        while (true) {
            int i27 = i19 + 1;
            char charAt2 = str.charAt(i19);
            if (charAt2 < 55296) {
                this.f45271d = i17 | (charAt2 << i18);
                return;
            } else {
                i17 |= (charAt2 & 8191) << i18;
                i18 += 13;
                i19 = i27;
            }
        }
    }

    @Override // com.google.protobuf.l8
    public boolean a() {
        return (this.f45271d & 2) == 2;
    }

    @Override // com.google.protobuf.l8
    public com.google.protobuf.o8 b() {
        return this.f45268a;
    }

    @Override // com.google.protobuf.l8
    public com.google.protobuf.g9 c() {
        return (this.f45271d & 1) == 1 ? com.google.protobuf.g9.PROTO2 : com.google.protobuf.g9.PROTO3;
    }
}
