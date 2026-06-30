package bo1;

/* loaded from: classes2.dex */
public class q extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f23017d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f23018e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f23019f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f23020g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bo1.q)) {
            return false;
        }
        bo1.q qVar = (bo1.q) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f23017d), java.lang.Integer.valueOf(qVar.f23017d)) && n51.f.a(this.f23018e, qVar.f23018e) && n51.f.a(this.f23019f, qVar.f23019f) && n51.f.a(this.f23020g, qVar.f23020g);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f23017d);
            java.lang.String str = this.f23018e;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f23019f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f23020g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f23017d) + 0;
            java.lang.String str4 = this.f23018e;
            if (str4 != null) {
                e17 += b36.f.j(2, str4);
            }
            java.lang.String str5 = this.f23019f;
            if (str5 != null) {
                e17 += b36.f.j(3, str5);
            }
            java.lang.String str6 = this.f23020g;
            return str6 != null ? e17 + b36.f.j(4, str6) : e17;
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
        bo1.q qVar = (bo1.q) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            qVar.f23017d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            qVar.f23018e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            qVar.f23019f = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        qVar.f23020g = aVar2.k(intValue);
        return 0;
    }
}
