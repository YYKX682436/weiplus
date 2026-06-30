package bw5;

/* loaded from: classes2.dex */
public class hh extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f28211d;

    /* renamed from: e, reason: collision with root package name */
    public int f28212e;

    /* renamed from: f, reason: collision with root package name */
    public int f28213f;

    /* renamed from: g, reason: collision with root package name */
    public bw5.gh f28214g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f28215h;

    /* renamed from: i, reason: collision with root package name */
    public int f28216i;

    /* renamed from: m, reason: collision with root package name */
    public int f28217m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean[] f28218n = new boolean[8];

    static {
        new bw5.hh();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.hh parseFrom(byte[] bArr) {
        return (bw5.hh) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.hh)) {
            return false;
        }
        bw5.hh hhVar = (bw5.hh) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f28211d), java.lang.Integer.valueOf(hhVar.f28211d)) && n51.f.a(java.lang.Integer.valueOf(this.f28212e), java.lang.Integer.valueOf(hhVar.f28212e)) && n51.f.a(java.lang.Integer.valueOf(this.f28213f), java.lang.Integer.valueOf(hhVar.f28213f)) && n51.f.a(this.f28214g, hhVar.f28214g) && n51.f.a(this.f28215h, hhVar.f28215h) && n51.f.a(java.lang.Integer.valueOf(this.f28216i), java.lang.Integer.valueOf(hhVar.f28216i)) && n51.f.a(java.lang.Integer.valueOf(this.f28217m), java.lang.Integer.valueOf(hhVar.f28217m));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.hh();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f28218n;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f28211d);
            }
            if (zArr[2]) {
                fVar.e(2, this.f28212e);
            }
            if (zArr[3]) {
                fVar.e(3, this.f28213f);
            }
            bw5.gh ghVar = this.f28214g;
            if (ghVar != null && zArr[4]) {
                fVar.i(4, ghVar.computeSize());
                this.f28214g.writeFields(fVar);
            }
            java.lang.String str = this.f28215h;
            if (str != null && zArr[5]) {
                fVar.j(5, str);
            }
            if (zArr[6]) {
                fVar.e(6, this.f28216i);
            }
            if (zArr[7]) {
                fVar.e(7, this.f28217m);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f28211d) : 0;
            if (zArr[2]) {
                e17 += b36.f.e(2, this.f28212e);
            }
            if (zArr[3]) {
                e17 += b36.f.e(3, this.f28213f);
            }
            bw5.gh ghVar2 = this.f28214g;
            if (ghVar2 != null && zArr[4]) {
                e17 += b36.f.i(4, ghVar2.computeSize());
            }
            java.lang.String str2 = this.f28215h;
            if (str2 != null && zArr[5]) {
                e17 += b36.f.j(5, str2);
            }
            if (zArr[6]) {
                e17 += b36.f.e(6, this.f28216i);
            }
            return zArr[7] ? e17 + b36.f.e(7, this.f28217m) : e17;
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
                this.f28211d = aVar2.g(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f28212e = aVar2.g(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f28213f = aVar2.g(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    bw5.gh ghVar3 = new bw5.gh();
                    if (bArr != null && bArr.length > 0) {
                        ghVar3.parseFrom(bArr);
                    }
                    this.f28214g = ghVar3;
                }
                zArr[4] = true;
                return 0;
            case 5:
                this.f28215h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f28216i = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f28217m = aVar2.g(intValue);
                zArr[7] = true;
                return 0;
            default:
                return -1;
        }
    }
}
