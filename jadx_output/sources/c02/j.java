package c02;

/* loaded from: classes2.dex */
public class j extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public c02.e f37602d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f37603e;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof c02.j)) {
            return false;
        }
        c02.j jVar = (c02.j) fVar;
        return n51.f.a(this.f37602d, jVar.f37602d) && n51.f.a(this.f37603e, jVar.f37603e);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            c02.e eVar = this.f37602d;
            if (eVar != null) {
                fVar.i(1, eVar.computeSize());
                this.f37602d.writeFields(fVar);
            }
            java.lang.String str = this.f37603e;
            if (str != null) {
                fVar.j(2, str);
            }
            return 0;
        }
        if (i17 == 1) {
            c02.e eVar2 = this.f37602d;
            int i18 = eVar2 != null ? 0 + b36.f.i(1, eVar2.computeSize()) : 0;
            java.lang.String str2 = this.f37603e;
            return str2 != null ? i18 + b36.f.j(2, str2) : i18;
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
        c02.j jVar = (c02.j) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue != 1) {
            if (intValue != 2) {
                return -1;
            }
            jVar.f37603e = aVar2.k(intValue);
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i19 = 0; i19 < size; i19++) {
            byte[] bArr = (byte[]) j17.get(i19);
            c02.e eVar3 = new c02.e();
            if (bArr != null && bArr.length > 0) {
                eVar3.parseFrom(bArr);
            }
            jVar.f37602d = eVar3;
        }
        return 0;
    }
}
