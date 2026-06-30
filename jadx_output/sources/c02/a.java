package c02;

/* loaded from: classes2.dex */
public class a extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.util.LinkedList f37582d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public boolean f37583e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f37584f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f37585g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof c02.a)) {
            return false;
        }
        c02.a aVar = (c02.a) fVar;
        return n51.f.a(this.BaseRequest, aVar.BaseRequest) && n51.f.a(this.f37582d, aVar.f37582d) && n51.f.a(java.lang.Boolean.valueOf(this.f37583e), java.lang.Boolean.valueOf(aVar.f37583e)) && n51.f.a(java.lang.Boolean.valueOf(this.f37584f), java.lang.Boolean.valueOf(aVar.f37584f)) && n51.f.a(java.lang.Boolean.valueOf(this.f37585g), java.lang.Boolean.valueOf(aVar.f37585g));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.he heVar = this.BaseRequest;
            if (heVar != null) {
                fVar.i(1, heVar.computeSize());
                this.BaseRequest.writeFields(fVar);
            }
            fVar.g(2, 1, this.f37582d);
            fVar.a(3, this.f37583e);
            fVar.a(4, this.f37584f);
            fVar.a(5, this.f37585g);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            return (heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0) + b36.f.g(2, 1, this.f37582d) + b36.f.a(3, this.f37583e) + b36.f.a(4, this.f37584f) + b36.f.a(5, this.f37585g);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f37582d.clear();
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
        c02.a aVar3 = (c02.a) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr2 = (byte[]) j17.get(i18);
                r45.he heVar3 = new r45.he();
                if (bArr2 != null && bArr2.length > 0) {
                    heVar3.parseFrom(bArr2);
                }
                aVar3.BaseRequest = heVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            aVar3.f37582d.add(aVar2.k(intValue));
            return 0;
        }
        if (intValue == 3) {
            aVar3.f37583e = aVar2.c(intValue);
            return 0;
        }
        if (intValue == 4) {
            aVar3.f37584f = aVar2.c(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        aVar3.f37585g = aVar2.c(intValue);
        return 0;
    }
}
