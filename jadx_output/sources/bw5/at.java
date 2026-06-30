package bw5;

/* loaded from: classes2.dex */
public class at extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f25428d;

    /* renamed from: e, reason: collision with root package name */
    public int f25429e;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f25431g;

    /* renamed from: h, reason: collision with root package name */
    public bw5.st f25432h;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f25430f = new java.util.LinkedList();

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f25433i = new boolean[51];

    static {
        new bw5.at();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.at parseFrom(byte[] bArr) {
        return (bw5.at) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.at)) {
            return false;
        }
        bw5.at atVar = (bw5.at) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f25428d), java.lang.Integer.valueOf(atVar.f25428d)) && n51.f.a(java.lang.Integer.valueOf(this.f25429e), java.lang.Integer.valueOf(atVar.f25429e)) && n51.f.a(this.f25430f, atVar.f25430f) && n51.f.a(this.f25431g, atVar.f25431g) && n51.f.a(this.f25432h, atVar.f25432h);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.at();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f25430f;
        boolean[] zArr = this.f25433i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f25428d);
            }
            if (zArr[2]) {
                fVar.e(2, this.f25429e);
            }
            fVar.g(3, 8, linkedList);
            java.lang.String str = this.f25431g;
            if (str != null && zArr[4]) {
                fVar.j(4, str);
            }
            bw5.st stVar = this.f25432h;
            if (stVar != null && zArr[50]) {
                fVar.i(50, stVar.computeSize());
                this.f25432h.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f25428d) : 0;
            if (zArr[2]) {
                e17 += b36.f.e(2, this.f25429e);
            }
            int g17 = e17 + b36.f.g(3, 8, linkedList);
            java.lang.String str2 = this.f25431g;
            if (str2 != null && zArr[4]) {
                g17 += b36.f.j(4, str2);
            }
            bw5.st stVar2 = this.f25432h;
            return (stVar2 == null || !zArr[50]) ? g17 : g17 + b36.f.i(50, stVar2.computeSize());
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
            this.f25428d = aVar2.g(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f25429e = aVar2.g(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr = (byte[]) j17.get(i18);
                bw5.h3 h3Var = new bw5.h3();
                if (bArr != null && bArr.length > 0) {
                    h3Var.parseFrom(bArr);
                }
                linkedList.add(h3Var);
            }
            zArr[3] = true;
            return 0;
        }
        if (intValue == 4) {
            this.f25431g = aVar2.k(intValue);
            zArr[4] = true;
            return 0;
        }
        if (intValue != 50) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i19 = 0; i19 < size2; i19++) {
            byte[] bArr2 = (byte[]) j18.get(i19);
            bw5.st stVar3 = new bw5.st();
            if (bArr2 != null && bArr2.length > 0) {
                stVar3.parseFrom(bArr2);
            }
            this.f25432h = stVar3;
        }
        zArr[50] = true;
        return 0;
    }
}
