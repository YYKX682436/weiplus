package bo1;

/* loaded from: classes2.dex */
public class e extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f22990d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f22991e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public boolean f22992f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f22993g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bo1.e)) {
            return false;
        }
        bo1.e eVar = (bo1.e) fVar;
        return n51.f.a(this.f22990d, eVar.f22990d) && n51.f.a(this.f22991e, eVar.f22991e) && n51.f.a(java.lang.Boolean.valueOf(this.f22992f), java.lang.Boolean.valueOf(eVar.f22992f)) && n51.f.a(this.f22993g, eVar.f22993g);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f22991e;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f22990d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.g(2, 8, linkedList);
            fVar.a(3, this.f22992f);
            java.lang.String str2 = this.f22993g;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f22990d;
            int j17 = (str3 != null ? 0 + b36.f.j(1, str3) : 0) + b36.f.g(2, 8, linkedList) + b36.f.a(3, this.f22992f);
            java.lang.String str4 = this.f22993g;
            return str4 != null ? j17 + b36.f.j(4, str4) : j17;
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
        bo1.e eVar = (bo1.e) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            eVar.f22990d = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 2) {
            if (intValue == 3) {
                eVar.f22992f = aVar2.c(intValue);
                return 0;
            }
            if (intValue != 4) {
                return -1;
            }
            eVar.f22993g = aVar2.k(intValue);
            return 0;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size = j18.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr2 = (byte[]) j18.get(i18);
            bo1.d dVar = new bo1.d();
            if (bArr2 != null && bArr2.length > 0) {
                dVar.parseFrom(bArr2);
            }
            eVar.f22991e.add(dVar);
        }
        return 0;
    }
}
