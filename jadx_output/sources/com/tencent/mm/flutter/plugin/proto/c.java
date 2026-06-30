package com.tencent.mm.flutter.plugin.proto;

/* loaded from: classes10.dex */
public class c extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f67947d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f67948e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f67949f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f67950g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f67951h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f67952i;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.mm.flutter.plugin.proto.c)) {
            return false;
        }
        com.tencent.mm.flutter.plugin.proto.c cVar = (com.tencent.mm.flutter.plugin.proto.c) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f67947d), java.lang.Integer.valueOf(cVar.f67947d)) && n51.f.a(this.f67948e, cVar.f67948e) && n51.f.a(this.f67949f, cVar.f67949f) && n51.f.a(this.f67950g, cVar.f67950g) && n51.f.a(this.f67951h, cVar.f67951h) && n51.f.a(this.f67952i, cVar.f67952i);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f67947d);
            java.lang.String str = this.f67948e;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f67949f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f67950g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f67951h;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            java.lang.String str5 = this.f67952i;
            if (str5 != null) {
                fVar.j(6, str5);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f67947d) + 0;
            java.lang.String str6 = this.f67948e;
            if (str6 != null) {
                e17 += b36.f.j(2, str6);
            }
            java.lang.String str7 = this.f67949f;
            if (str7 != null) {
                e17 += b36.f.j(3, str7);
            }
            java.lang.String str8 = this.f67950g;
            if (str8 != null) {
                e17 += b36.f.j(4, str8);
            }
            java.lang.String str9 = this.f67951h;
            if (str9 != null) {
                e17 += b36.f.j(5, str9);
            }
            java.lang.String str10 = this.f67952i;
            return str10 != null ? e17 + b36.f.j(6, str10) : e17;
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
        com.tencent.mm.flutter.plugin.proto.c cVar = (com.tencent.mm.flutter.plugin.proto.c) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                cVar.f67947d = aVar2.g(intValue);
                return 0;
            case 2:
                cVar.f67948e = aVar2.k(intValue);
                return 0;
            case 3:
                cVar.f67949f = aVar2.k(intValue);
                return 0;
            case 4:
                cVar.f67950g = aVar2.k(intValue);
                return 0;
            case 5:
                cVar.f67951h = aVar2.k(intValue);
                return 0;
            case 6:
                cVar.f67952i = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
