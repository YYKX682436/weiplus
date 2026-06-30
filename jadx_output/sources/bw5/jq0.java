package bw5;

/* loaded from: classes11.dex */
public class jq0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public bw5.dr0 f29109d;

    /* renamed from: e, reason: collision with root package name */
    public int f29110e;

    /* renamed from: f, reason: collision with root package name */
    public bw5.lp0 f29111f;

    /* renamed from: g, reason: collision with root package name */
    public bw5.eq0 f29112g;

    /* renamed from: h, reason: collision with root package name */
    public bw5.lq0 f29113h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f29114i;

    /* renamed from: m, reason: collision with root package name */
    public final boolean[] f29115m = new boolean[7];

    static {
        new bw5.jq0();
    }

    public bw5.lp0 b() {
        return this.f29115m[3] ? this.f29111f : new bw5.lp0();
    }

    public bw5.dr0 c() {
        return this.f29115m[1] ? this.f29109d : new bw5.dr0();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.jq0)) {
            return false;
        }
        bw5.jq0 jq0Var = (bw5.jq0) fVar;
        return n51.f.a(this.f29109d, jq0Var.f29109d) && n51.f.a(java.lang.Integer.valueOf(this.f29110e), java.lang.Integer.valueOf(jq0Var.f29110e)) && n51.f.a(this.f29111f, jq0Var.f29111f) && n51.f.a(this.f29112g, jq0Var.f29112g) && n51.f.a(this.f29113h, jq0Var.f29113h) && n51.f.a(this.f29114i, jq0Var.f29114i);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.jq0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f29115m;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            bw5.dr0 dr0Var = this.f29109d;
            if (dr0Var != null && zArr[1]) {
                fVar.i(1, dr0Var.computeSize());
                this.f29109d.writeFields(fVar);
            }
            if (zArr[2]) {
                fVar.e(2, this.f29110e);
            }
            bw5.lp0 lp0Var = this.f29111f;
            if (lp0Var != null && zArr[3]) {
                fVar.i(3, lp0Var.computeSize());
                this.f29111f.writeFields(fVar);
            }
            bw5.eq0 eq0Var = this.f29112g;
            if (eq0Var != null && zArr[4]) {
                fVar.e(4, eq0Var.f27025d);
            }
            bw5.lq0 lq0Var = this.f29113h;
            if (lq0Var != null && zArr[5]) {
                fVar.e(5, lq0Var.f29930d);
            }
            com.tencent.mm.protobuf.g gVar = this.f29114i;
            if (gVar != null && zArr[6]) {
                fVar.b(6, gVar);
            }
            return 0;
        }
        if (i17 == 1) {
            bw5.dr0 dr0Var2 = this.f29109d;
            if (dr0Var2 != null && zArr[1]) {
                i18 = 0 + b36.f.i(1, dr0Var2.computeSize());
            }
            if (zArr[2]) {
                i18 += b36.f.e(2, this.f29110e);
            }
            bw5.lp0 lp0Var2 = this.f29111f;
            if (lp0Var2 != null && zArr[3]) {
                i18 += b36.f.i(3, lp0Var2.computeSize());
            }
            bw5.eq0 eq0Var2 = this.f29112g;
            if (eq0Var2 != null && zArr[4]) {
                i18 += b36.f.e(4, eq0Var2.f27025d);
            }
            bw5.lq0 lq0Var2 = this.f29113h;
            if (lq0Var2 != null && zArr[5]) {
                i18 += b36.f.e(5, lq0Var2.f29930d);
            }
            com.tencent.mm.protobuf.g gVar2 = this.f29114i;
            return (gVar2 == null || !zArr[6]) ? i18 : i18 + b36.f.b(6, gVar2);
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
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    bw5.dr0 dr0Var3 = new bw5.dr0();
                    if (bArr != null && bArr.length > 0) {
                        dr0Var3.parseFrom(bArr);
                    }
                    this.f29109d = dr0Var3;
                }
                zArr[1] = true;
                return 0;
            case 2:
                this.f29110e = aVar2.g(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    bw5.lp0 lp0Var3 = new bw5.lp0();
                    if (bArr2 != null && bArr2.length > 0) {
                        lp0Var3.parseFrom(bArr2);
                    }
                    this.f29111f = lp0Var3;
                }
                zArr[3] = true;
                return 0;
            case 4:
                this.f29112g = bw5.eq0.a(aVar2.g(intValue));
                zArr[4] = true;
                return 0;
            case 5:
                this.f29113h = bw5.lq0.a(aVar2.g(intValue));
                zArr[5] = true;
                return 0;
            case 6:
                this.f29114i = aVar2.d(intValue);
                zArr[6] = true;
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (bw5.jq0) super.parseFrom(bArr);
    }
}
