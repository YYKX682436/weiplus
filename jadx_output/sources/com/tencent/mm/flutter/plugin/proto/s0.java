package com.tencent.mm.flutter.plugin.proto;

/* loaded from: classes10.dex */
public class s0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f68074d;

    /* renamed from: e, reason: collision with root package name */
    public long f68075e;

    /* renamed from: f, reason: collision with root package name */
    public int f68076f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f68077g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f68078h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f68079i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f68080m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f68081n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f68082o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f68083p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f68084q;

    /* renamed from: r, reason: collision with root package name */
    public com.tencent.mm.flutter.plugin.proto.b f68085r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f68086s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f68087t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f68088u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f68089v;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.mm.flutter.plugin.proto.s0)) {
            return false;
        }
        com.tencent.mm.flutter.plugin.proto.s0 s0Var = (com.tencent.mm.flutter.plugin.proto.s0) fVar;
        return n51.f.a(this.f68074d, s0Var.f68074d) && n51.f.a(java.lang.Long.valueOf(this.f68075e), java.lang.Long.valueOf(s0Var.f68075e)) && n51.f.a(java.lang.Integer.valueOf(this.f68076f), java.lang.Integer.valueOf(s0Var.f68076f)) && n51.f.a(this.f68077g, s0Var.f68077g) && n51.f.a(this.f68078h, s0Var.f68078h) && n51.f.a(this.f68079i, s0Var.f68079i) && n51.f.a(this.f68080m, s0Var.f68080m) && n51.f.a(this.f68081n, s0Var.f68081n) && n51.f.a(this.f68082o, s0Var.f68082o) && n51.f.a(this.f68083p, s0Var.f68083p) && n51.f.a(this.f68084q, s0Var.f68084q) && n51.f.a(this.f68085r, s0Var.f68085r) && n51.f.a(java.lang.Boolean.valueOf(this.f68086s), java.lang.Boolean.valueOf(s0Var.f68086s)) && n51.f.a(this.f68087t, s0Var.f68087t) && n51.f.a(this.f68088u, s0Var.f68088u) && n51.f.a(this.f68089v, s0Var.f68089v);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f68074d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.h(2, this.f68075e);
            fVar.e(3, this.f68076f);
            java.lang.String str2 = this.f68077g;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f68078h;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            java.lang.String str4 = this.f68079i;
            if (str4 != null) {
                fVar.j(6, str4);
            }
            java.lang.String str5 = this.f68080m;
            if (str5 != null) {
                fVar.j(7, str5);
            }
            java.lang.String str6 = this.f68081n;
            if (str6 != null) {
                fVar.j(8, str6);
            }
            java.lang.String str7 = this.f68082o;
            if (str7 != null) {
                fVar.j(9, str7);
            }
            java.lang.String str8 = this.f68083p;
            if (str8 != null) {
                fVar.j(10, str8);
            }
            java.lang.String str9 = this.f68084q;
            if (str9 != null) {
                fVar.j(11, str9);
            }
            com.tencent.mm.flutter.plugin.proto.b bVar = this.f68085r;
            if (bVar != null) {
                fVar.i(12, bVar.computeSize());
                this.f68085r.writeFields(fVar);
            }
            fVar.a(13, this.f68086s);
            java.lang.String str10 = this.f68087t;
            if (str10 != null) {
                fVar.j(14, str10);
            }
            java.lang.String str11 = this.f68088u;
            if (str11 != null) {
                fVar.j(15, str11);
            }
            java.lang.String str12 = this.f68089v;
            if (str12 != null) {
                fVar.j(16, str12);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str13 = this.f68074d;
            int j17 = (str13 != null ? b36.f.j(1, str13) + 0 : 0) + b36.f.h(2, this.f68075e) + b36.f.e(3, this.f68076f);
            java.lang.String str14 = this.f68077g;
            if (str14 != null) {
                j17 += b36.f.j(4, str14);
            }
            java.lang.String str15 = this.f68078h;
            if (str15 != null) {
                j17 += b36.f.j(5, str15);
            }
            java.lang.String str16 = this.f68079i;
            if (str16 != null) {
                j17 += b36.f.j(6, str16);
            }
            java.lang.String str17 = this.f68080m;
            if (str17 != null) {
                j17 += b36.f.j(7, str17);
            }
            java.lang.String str18 = this.f68081n;
            if (str18 != null) {
                j17 += b36.f.j(8, str18);
            }
            java.lang.String str19 = this.f68082o;
            if (str19 != null) {
                j17 += b36.f.j(9, str19);
            }
            java.lang.String str20 = this.f68083p;
            if (str20 != null) {
                j17 += b36.f.j(10, str20);
            }
            java.lang.String str21 = this.f68084q;
            if (str21 != null) {
                j17 += b36.f.j(11, str21);
            }
            com.tencent.mm.flutter.plugin.proto.b bVar2 = this.f68085r;
            if (bVar2 != null) {
                j17 += b36.f.i(12, bVar2.computeSize());
            }
            int a17 = j17 + b36.f.a(13, this.f68086s);
            java.lang.String str22 = this.f68087t;
            if (str22 != null) {
                a17 += b36.f.j(14, str22);
            }
            java.lang.String str23 = this.f68088u;
            if (str23 != null) {
                a17 += b36.f.j(15, str23);
            }
            java.lang.String str24 = this.f68089v;
            return str24 != null ? a17 + b36.f.j(16, str24) : a17;
        }
        if (i17 == 2) {
            c36.a aVar = new c36.a((byte[]) objArr[0], com.tencent.mm.protobuf.f.unknownTagHandler);
            for (int nextFieldNumber = com.tencent.mm.protobuf.f.getNextFieldNumber(aVar); nextFieldNumber > 0; nextFieldNumber = com.tencent.mm.protobuf.f.getNextFieldNumber(aVar)) {
                if (!super.populateBuilderWithField(aVar, this, nextFieldNumber)) {
                    aVar.b();
                }
            }
            return 0;
        }
        if (i17 != 3) {
            return -1;
        }
        c36.a aVar2 = (c36.a) objArr[0];
        com.tencent.mm.flutter.plugin.proto.s0 s0Var = (com.tencent.mm.flutter.plugin.proto.s0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                s0Var.f68074d = aVar2.k(intValue);
                return 0;
            case 2:
                s0Var.f68075e = aVar2.i(intValue);
                return 0;
            case 3:
                s0Var.f68076f = aVar2.g(intValue);
                return 0;
            case 4:
                s0Var.f68077g = aVar2.k(intValue);
                return 0;
            case 5:
                s0Var.f68078h = aVar2.k(intValue);
                return 0;
            case 6:
                s0Var.f68079i = aVar2.k(intValue);
                return 0;
            case 7:
                s0Var.f68080m = aVar2.k(intValue);
                return 0;
            case 8:
                s0Var.f68081n = aVar2.k(intValue);
                return 0;
            case 9:
                s0Var.f68082o = aVar2.k(intValue);
                return 0;
            case 10:
                s0Var.f68083p = aVar2.k(intValue);
                return 0;
            case 11:
                s0Var.f68084q = aVar2.k(intValue);
                return 0;
            case 12:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j18.get(i18);
                    com.tencent.mm.flutter.plugin.proto.b bVar3 = new com.tencent.mm.flutter.plugin.proto.b();
                    if (bArr != null && bArr.length > 0) {
                        bVar3.parseFrom(bArr);
                    }
                    s0Var.f68085r = bVar3;
                }
                return 0;
            case 13:
                s0Var.f68086s = aVar2.c(intValue);
                return 0;
            case 14:
                s0Var.f68087t = aVar2.k(intValue);
                return 0;
            case 15:
                s0Var.f68088u = aVar2.k(intValue);
                return 0;
            case 16:
                s0Var.f68089v = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
