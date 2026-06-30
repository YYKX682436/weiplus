package com.tencent.mm.flutter.plugin.proto;

/* loaded from: classes10.dex */
public class b extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public long f67933d;

    /* renamed from: e, reason: collision with root package name */
    public long f67934e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f67935f;

    /* renamed from: g, reason: collision with root package name */
    public int f67936g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f67937h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.LinkedList f67938i = new java.util.LinkedList();

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f67939m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f67940n;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.mm.flutter.plugin.proto.b)) {
            return false;
        }
        com.tencent.mm.flutter.plugin.proto.b bVar = (com.tencent.mm.flutter.plugin.proto.b) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f67933d), java.lang.Long.valueOf(bVar.f67933d)) && n51.f.a(java.lang.Long.valueOf(this.f67934e), java.lang.Long.valueOf(bVar.f67934e)) && n51.f.a(this.f67935f, bVar.f67935f) && n51.f.a(java.lang.Integer.valueOf(this.f67936g), java.lang.Integer.valueOf(bVar.f67936g)) && n51.f.a(this.f67937h, bVar.f67937h) && n51.f.a(this.f67938i, bVar.f67938i) && n51.f.a(this.f67939m, bVar.f67939m) && n51.f.a(this.f67940n, bVar.f67940n);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f67938i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.h(1, this.f67933d);
            fVar.h(2, this.f67934e);
            java.lang.String str = this.f67935f;
            if (str != null) {
                fVar.j(3, str);
            }
            fVar.e(4, this.f67936g);
            java.lang.String str2 = this.f67937h;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            fVar.g(6, 8, linkedList);
            java.lang.String str3 = this.f67939m;
            if (str3 != null) {
                fVar.j(7, str3);
            }
            java.lang.String str4 = this.f67940n;
            if (str4 != null) {
                fVar.j(8, str4);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = b36.f.h(1, this.f67933d) + 0 + b36.f.h(2, this.f67934e);
            java.lang.String str5 = this.f67935f;
            if (str5 != null) {
                h17 += b36.f.j(3, str5);
            }
            int e17 = h17 + b36.f.e(4, this.f67936g);
            java.lang.String str6 = this.f67937h;
            if (str6 != null) {
                e17 += b36.f.j(5, str6);
            }
            int g17 = e17 + b36.f.g(6, 8, linkedList);
            java.lang.String str7 = this.f67939m;
            if (str7 != null) {
                g17 += b36.f.j(7, str7);
            }
            java.lang.String str8 = this.f67940n;
            return str8 != null ? g17 + b36.f.j(8, str8) : g17;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList.clear();
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
        com.tencent.mm.flutter.plugin.proto.b bVar = (com.tencent.mm.flutter.plugin.proto.b) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                bVar.f67933d = aVar2.i(intValue);
                return 0;
            case 2:
                bVar.f67934e = aVar2.i(intValue);
                return 0;
            case 3:
                bVar.f67935f = aVar2.k(intValue);
                return 0;
            case 4:
                bVar.f67936g = aVar2.g(intValue);
                return 0;
            case 5:
                bVar.f67937h = aVar2.k(intValue);
                return 0;
            case 6:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j17.get(i18);
                    com.tencent.mm.flutter.plugin.proto.c cVar = new com.tencent.mm.flutter.plugin.proto.c();
                    if (bArr2 != null && bArr2.length > 0) {
                        cVar.parseFrom(bArr2);
                    }
                    bVar.f67938i.add(cVar);
                }
                return 0;
            case 7:
                bVar.f67939m = aVar2.k(intValue);
                return 0;
            case 8:
                bVar.f67940n = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
