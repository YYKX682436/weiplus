package bw5;

/* loaded from: classes2.dex */
public class bo extends com.tencent.mm.protobuf.f {

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f25769e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f25770f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f25771g;

    /* renamed from: h, reason: collision with root package name */
    public int f25772h;

    /* renamed from: i, reason: collision with root package name */
    public bw5.sn f25773i;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f25768d = new java.util.LinkedList();

    /* renamed from: m, reason: collision with root package name */
    public final boolean[] f25774m = new boolean[12];

    static {
        new bw5.bo();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.bo parseFrom(byte[] bArr) {
        return (bw5.bo) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.bo)) {
            return false;
        }
        bw5.bo boVar = (bw5.bo) fVar;
        return n51.f.a(this.f25768d, boVar.f25768d) && n51.f.a(this.f25769e, boVar.f25769e) && n51.f.a(this.f25770f, boVar.f25770f) && n51.f.a(this.f25771g, boVar.f25771g) && n51.f.a(java.lang.Integer.valueOf(this.f25772h), java.lang.Integer.valueOf(boVar.f25772h)) && n51.f.a(this.f25773i, boVar.f25773i);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.bo();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f25768d;
        boolean[] zArr = this.f25774m;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.g(1, 1, linkedList);
            java.lang.String str = this.f25769e;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f25770f;
            if (str2 != null && zArr[3]) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f25771g;
            if (str3 != null && zArr[4]) {
                fVar.j(4, str3);
            }
            if (zArr[10]) {
                fVar.e(10, this.f25772h);
            }
            bw5.sn snVar = this.f25773i;
            if (snVar != null && zArr[11]) {
                fVar.i(11, snVar.computeSize());
                this.f25773i.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int g17 = b36.f.g(1, 1, linkedList) + 0;
            java.lang.String str4 = this.f25769e;
            if (str4 != null && zArr[2]) {
                g17 += b36.f.j(2, str4);
            }
            java.lang.String str5 = this.f25770f;
            if (str5 != null && zArr[3]) {
                g17 += b36.f.j(3, str5);
            }
            java.lang.String str6 = this.f25771g;
            if (str6 != null && zArr[4]) {
                g17 += b36.f.j(4, str6);
            }
            if (zArr[10]) {
                g17 += b36.f.e(10, this.f25772h);
            }
            bw5.sn snVar2 = this.f25773i;
            return (snVar2 == null || !zArr[11]) ? g17 : g17 + b36.f.i(11, snVar2.computeSize());
        }
        if (i17 == 2) {
            linkedList.clear();
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
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            linkedList.add(aVar2.k(intValue));
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f25769e = aVar2.k(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f25770f = aVar2.k(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue == 4) {
            this.f25771g = aVar2.k(intValue);
            zArr[4] = true;
            return 0;
        }
        if (intValue == 10) {
            this.f25772h = aVar2.g(intValue);
            zArr[10] = true;
            return 0;
        }
        if (intValue != 11) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            bw5.sn snVar3 = new bw5.sn();
            if (bArr != null && bArr.length > 0) {
                snVar3.parseFrom(bArr);
            }
            this.f25773i = snVar3;
        }
        zArr[11] = true;
        return 0;
    }
}
