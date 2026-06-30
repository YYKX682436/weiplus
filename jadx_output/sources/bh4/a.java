package bh4;

/* loaded from: classes4.dex */
public class a extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f20914d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.LinkedList f20915e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public int f20916f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bh4.a)) {
            return false;
        }
        bh4.a aVar = (bh4.a) fVar;
        return n51.f.a(this.f20914d, aVar.f20914d) && n51.f.a(this.f20915e, aVar.f20915e) && n51.f.a(java.lang.Integer.valueOf(this.f20916f), java.lang.Integer.valueOf(aVar.f20916f));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f20914d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.g(2, 8, this.f20915e);
            fVar.e(3, this.f20916f);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f20914d;
            return (str2 != null ? 0 + b36.f.j(1, str2) : 0) + b36.f.g(2, 8, this.f20915e) + b36.f.e(3, this.f20916f);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f20915e.clear();
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
        bh4.a aVar3 = (bh4.a) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            aVar3.f20914d = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 2) {
            if (intValue != 3) {
                return -1;
            }
            aVar3.f20916f = aVar2.g(intValue);
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr2 = (byte[]) j17.get(i18);
            r45.nk6 nk6Var = new r45.nk6();
            if (bArr2 != null && bArr2.length > 0) {
                nk6Var.parseFrom(bArr2);
            }
            aVar3.f20915e.add(nk6Var);
        }
        return 0;
    }
}
