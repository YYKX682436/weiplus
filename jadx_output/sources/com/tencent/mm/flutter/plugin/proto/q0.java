package com.tencent.mm.flutter.plugin.proto;

/* loaded from: classes4.dex */
public class q0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public long f68064d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f68065e;

    /* renamed from: f, reason: collision with root package name */
    public int f68066f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f68067g;

    /* renamed from: h, reason: collision with root package name */
    public java.util.LinkedList f68068h = new java.util.LinkedList();

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f68069i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f68070m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f68071n;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.mm.flutter.plugin.proto.q0)) {
            return false;
        }
        com.tencent.mm.flutter.plugin.proto.q0 q0Var = (com.tencent.mm.flutter.plugin.proto.q0) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f68064d), java.lang.Long.valueOf(q0Var.f68064d)) && n51.f.a(this.f68065e, q0Var.f68065e) && n51.f.a(java.lang.Integer.valueOf(this.f68066f), java.lang.Integer.valueOf(q0Var.f68066f)) && n51.f.a(this.f68067g, q0Var.f68067g) && n51.f.a(this.f68068h, q0Var.f68068h) && n51.f.a(this.f68069i, q0Var.f68069i) && n51.f.a(this.f68070m, q0Var.f68070m) && n51.f.a(this.f68071n, q0Var.f68071n);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.h(1, this.f68064d);
            java.lang.String str = this.f68065e;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.e(3, this.f68066f);
            java.lang.String str2 = this.f68067g;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            fVar.g(5, 8, this.f68068h);
            java.lang.String str3 = this.f68069i;
            if (str3 != null) {
                fVar.j(6, str3);
            }
            java.lang.String str4 = this.f68070m;
            if (str4 != null) {
                fVar.j(7, str4);
            }
            java.lang.String str5 = this.f68071n;
            if (str5 != null) {
                fVar.j(8, str5);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = b36.f.h(1, this.f68064d) + 0;
            java.lang.String str6 = this.f68065e;
            if (str6 != null) {
                h17 += b36.f.j(2, str6);
            }
            int e17 = h17 + b36.f.e(3, this.f68066f);
            java.lang.String str7 = this.f68067g;
            if (str7 != null) {
                e17 += b36.f.j(4, str7);
            }
            int g17 = e17 + b36.f.g(5, 8, this.f68068h);
            java.lang.String str8 = this.f68069i;
            if (str8 != null) {
                g17 += b36.f.j(6, str8);
            }
            java.lang.String str9 = this.f68070m;
            if (str9 != null) {
                g17 += b36.f.j(7, str9);
            }
            java.lang.String str10 = this.f68071n;
            return str10 != null ? g17 + b36.f.j(8, str10) : g17;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f68068h.clear();
            c36.a aVar = new c36.a(bArr, com.tencent.mm.protobuf.f.unknownTagHandler);
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
        com.tencent.mm.flutter.plugin.proto.q0 q0Var = (com.tencent.mm.flutter.plugin.proto.q0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                q0Var.f68064d = aVar2.i(intValue);
                return 0;
            case 2:
                q0Var.f68065e = aVar2.k(intValue);
                return 0;
            case 3:
                q0Var.f68066f = aVar2.g(intValue);
                return 0;
            case 4:
                q0Var.f68067g = aVar2.k(intValue);
                return 0;
            case 5:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j17.get(i18);
                    com.tencent.mm.flutter.plugin.proto.r0 r0Var = new com.tencent.mm.flutter.plugin.proto.r0();
                    if (bArr2 != null && bArr2.length > 0) {
                        r0Var.parseFrom(bArr2);
                    }
                    q0Var.f68068h.add(r0Var);
                }
                return 0;
            case 6:
                q0Var.f68069i = aVar2.k(intValue);
                return 0;
            case 7:
                q0Var.f68070m = aVar2.k(intValue);
                return 0;
            case 8:
                q0Var.f68071n = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
