package c02;

/* loaded from: classes2.dex */
public class t extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f37626d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f37627e;

    /* renamed from: f, reason: collision with root package name */
    public long f37628f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof c02.t)) {
            return false;
        }
        c02.t tVar = (c02.t) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f37626d), java.lang.Integer.valueOf(tVar.f37626d)) && n51.f.a(java.lang.Boolean.valueOf(this.f37627e), java.lang.Boolean.valueOf(tVar.f37627e)) && n51.f.a(java.lang.Long.valueOf(this.f37628f), java.lang.Long.valueOf(tVar.f37628f));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f37626d);
            fVar.a(2, this.f37627e);
            fVar.h(3, this.f37628f);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.e(1, this.f37626d) + 0 + b36.f.a(2, this.f37627e) + b36.f.h(3, this.f37628f);
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
        c02.t tVar = (c02.t) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            tVar.f37626d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            tVar.f37627e = aVar2.c(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        tVar.f37628f = aVar2.i(intValue);
        return 0;
    }
}
