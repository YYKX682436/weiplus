package com.tencent.mm.flutter.plugin.proto;

/* loaded from: classes10.dex */
public class d extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public boolean f67953d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.flutter.plugin.proto.a f67954e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f67955f = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.mm.flutter.plugin.proto.d)) {
            return false;
        }
        com.tencent.mm.flutter.plugin.proto.d dVar = (com.tencent.mm.flutter.plugin.proto.d) fVar;
        return n51.f.a(java.lang.Boolean.valueOf(this.f67953d), java.lang.Boolean.valueOf(dVar.f67953d)) && n51.f.a(this.f67954e, dVar.f67954e) && n51.f.a(this.f67955f, dVar.f67955f);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f67955f;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.a(1, this.f67953d);
            com.tencent.mm.flutter.plugin.proto.a aVar = this.f67954e;
            if (aVar != null) {
                fVar.i(2, aVar.computeSize());
                this.f67954e.writeFields(fVar);
            }
            fVar.g(3, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            int a17 = b36.f.a(1, this.f67953d) + 0;
            com.tencent.mm.flutter.plugin.proto.a aVar2 = this.f67954e;
            if (aVar2 != null) {
                a17 += b36.f.i(2, aVar2.computeSize());
            }
            return a17 + b36.f.g(3, 8, linkedList);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList.clear();
            c36.a aVar3 = new c36.a(bArr, com.tencent.mm.protobuf.f.unknownTagHandler);
            for (int nextFieldNumber = com.tencent.mm.protobuf.f.getNextFieldNumber(aVar3); nextFieldNumber > 0; nextFieldNumber = com.tencent.mm.protobuf.f.getNextFieldNumber(aVar3)) {
                if (!super.populateBuilderWithField(aVar3, this, nextFieldNumber)) {
                    aVar3.b();
                }
            }
            return 0;
        }
        if (i17 != 3) {
            return -1;
        }
        c36.a aVar4 = (c36.a) objArr[0];
        com.tencent.mm.flutter.plugin.proto.d dVar = (com.tencent.mm.flutter.plugin.proto.d) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            dVar.f67953d = aVar4.c(intValue);
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j17 = aVar4.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr2 = (byte[]) j17.get(i18);
                com.tencent.mm.flutter.plugin.proto.a aVar5 = new com.tencent.mm.flutter.plugin.proto.a();
                if (bArr2 != null && bArr2.length > 0) {
                    aVar5.parseFrom(bArr2);
                }
                dVar.f67954e = aVar5;
            }
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        java.util.LinkedList j18 = aVar4.j(intValue);
        int size2 = j18.size();
        for (int i19 = 0; i19 < size2; i19++) {
            byte[] bArr3 = (byte[]) j18.get(i19);
            com.tencent.mm.flutter.plugin.proto.b bVar = new com.tencent.mm.flutter.plugin.proto.b();
            if (bArr3 != null && bArr3.length > 0) {
                bVar.parseFrom(bArr3);
            }
            dVar.f67955f.add(bVar);
        }
        return 0;
    }
}
