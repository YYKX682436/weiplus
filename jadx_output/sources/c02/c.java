package c02;

/* loaded from: classes2.dex */
public class c extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public boolean f37588d;

    /* renamed from: e, reason: collision with root package name */
    public c02.u f37589e;

    /* renamed from: f, reason: collision with root package name */
    public c02.h f37590f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof c02.c)) {
            return false;
        }
        c02.c cVar = (c02.c) fVar;
        return n51.f.a(java.lang.Boolean.valueOf(this.f37588d), java.lang.Boolean.valueOf(cVar.f37588d)) && n51.f.a(this.f37589e, cVar.f37589e) && n51.f.a(this.f37590f, cVar.f37590f);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.a(1, this.f37588d);
            c02.u uVar = this.f37589e;
            if (uVar != null) {
                fVar.i(2, uVar.computeSize());
                this.f37589e.writeFields(fVar);
            }
            c02.h hVar = this.f37590f;
            if (hVar != null) {
                fVar.i(3, hVar.computeSize());
                this.f37590f.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int a17 = b36.f.a(1, this.f37588d) + 0;
            c02.u uVar2 = this.f37589e;
            if (uVar2 != null) {
                a17 += b36.f.i(2, uVar2.computeSize());
            }
            c02.h hVar2 = this.f37590f;
            return hVar2 != null ? a17 + b36.f.i(3, hVar2.computeSize()) : a17;
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
        c02.c cVar = (c02.c) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            cVar.f37588d = aVar2.c(intValue);
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr = (byte[]) j17.get(i18);
                c02.u uVar3 = new c02.u();
                if (bArr != null && bArr.length > 0) {
                    uVar3.parseFrom(bArr);
                }
                cVar.f37589e = uVar3;
            }
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i19 = 0; i19 < size2; i19++) {
            byte[] bArr2 = (byte[]) j18.get(i19);
            c02.h hVar3 = new c02.h();
            if (bArr2 != null && bArr2.length > 0) {
                hVar3.parseFrom(bArr2);
            }
            cVar.f37590f = hVar3;
        }
        return 0;
    }
}
