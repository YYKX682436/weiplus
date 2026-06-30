package bw5;

/* loaded from: classes2.dex */
public class wm extends com.tencent.mm.protobuf.f {

    /* renamed from: e, reason: collision with root package name */
    public int f34775e;

    /* renamed from: f, reason: collision with root package name */
    public int f34776f;

    /* renamed from: g, reason: collision with root package name */
    public int f34777g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f34778h;

    /* renamed from: i, reason: collision with root package name */
    public int f34779i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f34780m;

    /* renamed from: n, reason: collision with root package name */
    public bw5.rd0 f34781n;

    /* renamed from: o, reason: collision with root package name */
    public int f34782o;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f34774d = new java.util.LinkedList();

    /* renamed from: p, reason: collision with root package name */
    public final boolean[] f34783p = new boolean[10];

    static {
        new bw5.wm();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.wm parseFrom(byte[] bArr) {
        return (bw5.wm) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.wm)) {
            return false;
        }
        bw5.wm wmVar = (bw5.wm) fVar;
        return n51.f.a(this.f34774d, wmVar.f34774d) && n51.f.a(java.lang.Integer.valueOf(this.f34775e), java.lang.Integer.valueOf(wmVar.f34775e)) && n51.f.a(java.lang.Integer.valueOf(this.f34776f), java.lang.Integer.valueOf(wmVar.f34776f)) && n51.f.a(java.lang.Integer.valueOf(this.f34777g), java.lang.Integer.valueOf(wmVar.f34777g)) && n51.f.a(java.lang.Boolean.valueOf(this.f34778h), java.lang.Boolean.valueOf(wmVar.f34778h)) && n51.f.a(java.lang.Integer.valueOf(this.f34779i), java.lang.Integer.valueOf(wmVar.f34779i)) && n51.f.a(this.f34780m, wmVar.f34780m) && n51.f.a(this.f34781n, wmVar.f34781n) && n51.f.a(java.lang.Integer.valueOf(this.f34782o), java.lang.Integer.valueOf(wmVar.f34782o));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.wm();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f34774d;
        boolean[] zArr = this.f34783p;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.g(1, 8, linkedList);
            if (zArr[2]) {
                fVar.e(2, this.f34775e);
            }
            if (zArr[3]) {
                fVar.e(3, this.f34776f);
            }
            if (zArr[4]) {
                fVar.e(4, this.f34777g);
            }
            if (zArr[5]) {
                fVar.a(5, this.f34778h);
            }
            if (zArr[6]) {
                fVar.e(6, this.f34779i);
            }
            java.lang.String str = this.f34780m;
            if (str != null && zArr[7]) {
                fVar.j(7, str);
            }
            bw5.rd0 rd0Var = this.f34781n;
            if (rd0Var != null && zArr[8]) {
                fVar.i(8, rd0Var.computeSize());
                this.f34781n.writeFields(fVar);
            }
            if (zArr[9]) {
                fVar.e(9, this.f34782o);
            }
            return 0;
        }
        if (i17 == 1) {
            int g17 = b36.f.g(1, 8, linkedList) + 0;
            if (zArr[2]) {
                g17 += b36.f.e(2, this.f34775e);
            }
            if (zArr[3]) {
                g17 += b36.f.e(3, this.f34776f);
            }
            if (zArr[4]) {
                g17 += b36.f.e(4, this.f34777g);
            }
            if (zArr[5]) {
                g17 += b36.f.a(5, this.f34778h);
            }
            if (zArr[6]) {
                g17 += b36.f.e(6, this.f34779i);
            }
            java.lang.String str2 = this.f34780m;
            if (str2 != null && zArr[7]) {
                g17 += b36.f.j(7, str2);
            }
            bw5.rd0 rd0Var2 = this.f34781n;
            if (rd0Var2 != null && zArr[8]) {
                g17 += b36.f.i(8, rd0Var2.computeSize());
            }
            return zArr[9] ? g17 + b36.f.e(9, this.f34782o) : g17;
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
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    bw5.vm vmVar = new bw5.vm();
                    if (bArr != null && bArr.length > 0) {
                        vmVar.parseFrom(bArr);
                    }
                    linkedList.add(vmVar);
                }
                zArr[1] = true;
                return 0;
            case 2:
                this.f34775e = aVar2.g(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f34776f = aVar2.g(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f34777g = aVar2.g(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f34778h = aVar2.c(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f34779i = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f34780m = aVar2.k(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j18.get(i19);
                    bw5.rd0 rd0Var3 = new bw5.rd0();
                    if (bArr2 != null && bArr2.length > 0) {
                        rd0Var3.parseFrom(bArr2);
                    }
                    this.f34781n = rd0Var3;
                }
                zArr[8] = true;
                return 0;
            case 9:
                this.f34782o = aVar2.g(intValue);
                zArr[9] = true;
                return 0;
            default:
                return -1;
        }
    }
}
