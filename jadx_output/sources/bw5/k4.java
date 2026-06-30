package bw5;

/* loaded from: classes2.dex */
public class k4 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f29227d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f29228e;

    /* renamed from: f, reason: collision with root package name */
    public float f29229f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f29230g;

    /* renamed from: h, reason: collision with root package name */
    public bw5.am f29231h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f29232i;

    /* renamed from: m, reason: collision with root package name */
    public final boolean[] f29233m = new boolean[7];

    static {
        new bw5.k4();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.k4 parseFrom(byte[] bArr) {
        return (bw5.k4) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.k4)) {
            return false;
        }
        bw5.k4 k4Var = (bw5.k4) fVar;
        return n51.f.a(this.f29227d, k4Var.f29227d) && n51.f.a(this.f29228e, k4Var.f29228e) && n51.f.a(java.lang.Float.valueOf(this.f29229f), java.lang.Float.valueOf(k4Var.f29229f)) && n51.f.a(java.lang.Boolean.valueOf(this.f29230g), java.lang.Boolean.valueOf(k4Var.f29230g)) && n51.f.a(this.f29231h, k4Var.f29231h) && n51.f.a(java.lang.Boolean.valueOf(this.f29232i), java.lang.Boolean.valueOf(k4Var.f29232i));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.k4();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f29233m;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f29227d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f29228e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            if (zArr[3]) {
                fVar.d(3, this.f29229f);
            }
            if (zArr[4]) {
                fVar.a(4, this.f29230g);
            }
            bw5.am amVar = this.f29231h;
            if (amVar != null && zArr[5]) {
                fVar.i(5, amVar.computeSize());
                this.f29231h.writeFields(fVar);
            }
            if (zArr[6]) {
                fVar.a(6, this.f29232i);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f29227d;
            if (str3 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str3);
            }
            java.lang.String str4 = this.f29228e;
            if (str4 != null && zArr[2]) {
                i18 += b36.f.j(2, str4);
            }
            if (zArr[3]) {
                i18 += b36.f.d(3, this.f29229f);
            }
            if (zArr[4]) {
                i18 += b36.f.a(4, this.f29230g);
            }
            bw5.am amVar2 = this.f29231h;
            if (amVar2 != null && zArr[5]) {
                i18 += b36.f.i(5, amVar2.computeSize());
            }
            return zArr[6] ? i18 + b36.f.a(6, this.f29232i) : i18;
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
                this.f29227d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f29228e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f29229f = aVar2.f(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f29230g = aVar2.c(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    bw5.am amVar3 = new bw5.am();
                    if (bArr != null && bArr.length > 0) {
                        amVar3.parseFrom(bArr);
                    }
                    this.f29231h = amVar3;
                }
                zArr[5] = true;
                return 0;
            case 6:
                this.f29232i = aVar2.c(intValue);
                zArr[6] = true;
                return 0;
            default:
                return -1;
        }
    }
}
