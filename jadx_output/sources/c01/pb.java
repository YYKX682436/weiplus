package c01;

/* loaded from: classes9.dex */
public class pb extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f37379d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f37380e;

    /* renamed from: f, reason: collision with root package name */
    public long f37381f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof c01.pb)) {
            return false;
        }
        c01.pb pbVar = (c01.pb) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f37379d), java.lang.Integer.valueOf(pbVar.f37379d)) && n51.f.a(this.f37380e, pbVar.f37380e) && n51.f.a(java.lang.Long.valueOf(this.f37381f), java.lang.Long.valueOf(pbVar.f37381f));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f37379d);
            java.lang.String str = this.f37380e;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.h(3, this.f37381f);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f37379d) + 0;
            java.lang.String str2 = this.f37380e;
            if (str2 != null) {
                e17 += b36.f.j(2, str2);
            }
            return e17 + b36.f.h(3, this.f37381f);
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
        c01.pb pbVar = (c01.pb) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            pbVar.f37379d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            pbVar.f37380e = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        pbVar.f37381f = aVar2.i(intValue);
        return 0;
    }
}
