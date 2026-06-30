package bw5;

/* loaded from: classes2.dex */
public class uo extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f34005d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f34006e;

    /* renamed from: f, reason: collision with root package name */
    public bw5.ui f34007f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f34008g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f34009h = new boolean[5];

    static {
        new bw5.uo();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.uo parseFrom(byte[] bArr) {
        return (bw5.uo) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.uo)) {
            return false;
        }
        bw5.uo uoVar = (bw5.uo) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f34005d), java.lang.Integer.valueOf(uoVar.f34005d)) && n51.f.a(this.f34006e, uoVar.f34006e) && n51.f.a(this.f34007f, uoVar.f34007f) && n51.f.a(this.f34008g, uoVar.f34008g);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.uo();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f34009h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f34005d);
            }
            java.lang.String str = this.f34006e;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            bw5.ui uiVar = this.f34007f;
            if (uiVar != null && zArr[3]) {
                fVar.i(3, uiVar.computeSize());
                this.f34007f.writeFields(fVar);
            }
            java.lang.String str2 = this.f34008g;
            if (str2 != null && zArr[4]) {
                fVar.j(4, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f34005d) : 0;
            java.lang.String str3 = this.f34006e;
            if (str3 != null && zArr[2]) {
                e17 += b36.f.j(2, str3);
            }
            bw5.ui uiVar2 = this.f34007f;
            if (uiVar2 != null && zArr[3]) {
                e17 += b36.f.i(3, uiVar2.computeSize());
            }
            java.lang.String str4 = this.f34008g;
            return (str4 == null || !zArr[4]) ? e17 : e17 + b36.f.j(4, str4);
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
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            this.f34005d = aVar2.g(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f34006e = aVar2.k(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue != 3) {
            if (intValue != 4) {
                return -1;
            }
            this.f34008g = aVar2.k(intValue);
            zArr[4] = true;
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            bw5.ui uiVar3 = new bw5.ui();
            if (bArr != null && bArr.length > 0) {
                uiVar3.parseFrom(bArr);
            }
            this.f34007f = uiVar3;
        }
        zArr[3] = true;
        return 0;
    }
}
