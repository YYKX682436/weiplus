package com.tencent.mm.flutter.plugin.proto;

/* loaded from: classes4.dex */
public class r0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f68072d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f68073e;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.mm.flutter.plugin.proto.r0)) {
            return false;
        }
        com.tencent.mm.flutter.plugin.proto.r0 r0Var = (com.tencent.mm.flutter.plugin.proto.r0) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f68072d), java.lang.Integer.valueOf(r0Var.f68072d)) && n51.f.a(this.f68073e, r0Var.f68073e);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f68072d);
            java.lang.String str = this.f68073e;
            if (str != null) {
                fVar.j(2, str);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f68072d) + 0;
            java.lang.String str2 = this.f68073e;
            return str2 != null ? e17 + b36.f.j(2, str2) : e17;
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
        com.tencent.mm.flutter.plugin.proto.r0 r0Var = (com.tencent.mm.flutter.plugin.proto.r0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            r0Var.f68072d = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        r0Var.f68073e = aVar2.k(intValue);
        return 0;
    }
}
