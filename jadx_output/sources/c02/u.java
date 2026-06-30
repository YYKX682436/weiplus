package c02;

/* loaded from: classes2.dex */
public class u extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f37629d;

    /* renamed from: e, reason: collision with root package name */
    public int f37630e;

    /* renamed from: f, reason: collision with root package name */
    public int f37631f;

    /* renamed from: g, reason: collision with root package name */
    public int f37632g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof c02.u)) {
            return false;
        }
        c02.u uVar = (c02.u) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f37629d), java.lang.Integer.valueOf(uVar.f37629d)) && n51.f.a(java.lang.Integer.valueOf(this.f37630e), java.lang.Integer.valueOf(uVar.f37630e)) && n51.f.a(java.lang.Integer.valueOf(this.f37631f), java.lang.Integer.valueOf(uVar.f37631f)) && n51.f.a(java.lang.Integer.valueOf(this.f37632g), java.lang.Integer.valueOf(uVar.f37632g));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f37629d);
            fVar.e(2, this.f37630e);
            fVar.e(3, this.f37631f);
            fVar.e(4, this.f37632g);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.e(1, this.f37629d) + 0 + b36.f.e(2, this.f37630e) + b36.f.e(3, this.f37631f) + b36.f.e(4, this.f37632g);
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
        c02.u uVar = (c02.u) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            uVar.f37629d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            uVar.f37630e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            uVar.f37631f = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        uVar.f37632g = aVar2.g(intValue);
        return 0;
    }
}
