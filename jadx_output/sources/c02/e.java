package c02;

/* loaded from: classes2.dex */
public class e extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public d02.k f37592d;

    /* renamed from: e, reason: collision with root package name */
    public c02.f f37593e;

    /* renamed from: f, reason: collision with root package name */
    public c02.d f37594f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof c02.e)) {
            return false;
        }
        c02.e eVar = (c02.e) fVar;
        return n51.f.a(this.f37592d, eVar.f37592d) && n51.f.a(this.f37593e, eVar.f37593e) && n51.f.a(this.f37594f, eVar.f37594f);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            d02.k kVar = this.f37592d;
            if (kVar != null) {
                fVar.i(1, kVar.computeSize());
                this.f37592d.writeFields(fVar);
            }
            c02.f fVar2 = this.f37593e;
            if (fVar2 != null) {
                fVar.i(2, fVar2.computeSize());
                this.f37593e.writeFields(fVar);
            }
            c02.d dVar = this.f37594f;
            if (dVar != null) {
                fVar.i(3, dVar.computeSize());
                this.f37594f.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            d02.k kVar2 = this.f37592d;
            int i18 = kVar2 != null ? 0 + b36.f.i(1, kVar2.computeSize()) : 0;
            c02.f fVar3 = this.f37593e;
            if (fVar3 != null) {
                i18 += b36.f.i(2, fVar3.computeSize());
            }
            c02.d dVar2 = this.f37594f;
            return dVar2 != null ? i18 + b36.f.i(3, dVar2.computeSize()) : i18;
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
        c02.e eVar = (c02.e) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                d02.k kVar3 = new d02.k();
                if (bArr != null && bArr.length > 0) {
                    kVar3.parseFrom(bArr);
                }
                eVar.f37592d = kVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i27 = 0; i27 < size2; i27++) {
                byte[] bArr2 = (byte[]) j18.get(i27);
                c02.f fVar4 = new c02.f();
                if (bArr2 != null && bArr2.length > 0) {
                    fVar4.parseFrom(bArr2);
                }
                eVar.f37593e = fVar4;
            }
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        java.util.LinkedList j19 = aVar2.j(intValue);
        int size3 = j19.size();
        for (int i28 = 0; i28 < size3; i28++) {
            byte[] bArr3 = (byte[]) j19.get(i28);
            c02.d dVar3 = new c02.d();
            if (bArr3 != null && bArr3.length > 0) {
                dVar3.parseFrom(bArr3);
            }
            eVar.f37594f = dVar3;
        }
        return 0;
    }
}
