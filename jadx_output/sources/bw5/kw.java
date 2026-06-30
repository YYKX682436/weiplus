package bw5;

/* loaded from: classes2.dex */
public class kw extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f29555d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f29556e;

    /* renamed from: f, reason: collision with root package name */
    public int f29557f;

    /* renamed from: g, reason: collision with root package name */
    public long f29558g;

    /* renamed from: h, reason: collision with root package name */
    public bw5.lw f29559h;

    /* renamed from: i, reason: collision with root package name */
    public int f29560i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f29561m;

    /* renamed from: n, reason: collision with root package name */
    public bw5.jw f29562n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean[] f29563o = new boolean[10];

    static {
        new bw5.kw();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.kw parseFrom(byte[] bArr) {
        return (bw5.kw) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.kw)) {
            return false;
        }
        bw5.kw kwVar = (bw5.kw) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f29555d), java.lang.Integer.valueOf(kwVar.f29555d)) && n51.f.a(this.f29556e, kwVar.f29556e) && n51.f.a(java.lang.Integer.valueOf(this.f29557f), java.lang.Integer.valueOf(kwVar.f29557f)) && n51.f.a(java.lang.Long.valueOf(this.f29558g), java.lang.Long.valueOf(kwVar.f29558g)) && n51.f.a(this.f29559h, kwVar.f29559h) && n51.f.a(java.lang.Integer.valueOf(this.f29560i), java.lang.Integer.valueOf(kwVar.f29560i)) && n51.f.a(this.f29561m, kwVar.f29561m) && n51.f.a(this.f29562n, kwVar.f29562n);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.kw();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f29563o;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f29555d);
            }
            java.lang.String str = this.f29556e;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            if (zArr[3]) {
                fVar.e(3, this.f29557f);
            }
            if (zArr[4]) {
                fVar.h(4, this.f29558g);
            }
            bw5.lw lwVar = this.f29559h;
            if (lwVar != null && zArr[5]) {
                fVar.i(5, lwVar.computeSize());
                this.f29559h.writeFields(fVar);
            }
            if (zArr[7]) {
                fVar.e(7, this.f29560i);
            }
            java.lang.String str2 = this.f29561m;
            if (str2 != null && zArr[8]) {
                fVar.j(8, str2);
            }
            bw5.jw jwVar = this.f29562n;
            if (jwVar != null && zArr[9]) {
                fVar.i(9, jwVar.computeSize());
                this.f29562n.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f29555d) : 0;
            java.lang.String str3 = this.f29556e;
            if (str3 != null && zArr[2]) {
                e17 += b36.f.j(2, str3);
            }
            if (zArr[3]) {
                e17 += b36.f.e(3, this.f29557f);
            }
            if (zArr[4]) {
                e17 += b36.f.h(4, this.f29558g);
            }
            bw5.lw lwVar2 = this.f29559h;
            if (lwVar2 != null && zArr[5]) {
                e17 += b36.f.i(5, lwVar2.computeSize());
            }
            if (zArr[7]) {
                e17 += b36.f.e(7, this.f29560i);
            }
            java.lang.String str4 = this.f29561m;
            if (str4 != null && zArr[8]) {
                e17 += b36.f.j(8, str4);
            }
            bw5.jw jwVar2 = this.f29562n;
            return (jwVar2 == null || !zArr[9]) ? e17 : e17 + b36.f.i(9, jwVar2.computeSize());
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
                this.f29555d = aVar2.g(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f29556e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f29557f = aVar2.g(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f29558g = aVar2.i(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    bw5.lw lwVar3 = new bw5.lw();
                    if (bArr != null && bArr.length > 0) {
                        lwVar3.parseFrom(bArr);
                    }
                    this.f29559h = lwVar3;
                }
                zArr[5] = true;
                return 0;
            case 6:
            default:
                return -1;
            case 7:
                this.f29560i = aVar2.g(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f29561m = aVar2.k(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j18.get(i19);
                    bw5.jw jwVar3 = new bw5.jw();
                    if (bArr2 != null && bArr2.length > 0) {
                        jwVar3.parseFrom(bArr2);
                    }
                    this.f29562n = jwVar3;
                }
                zArr[9] = true;
                return 0;
        }
    }
}
