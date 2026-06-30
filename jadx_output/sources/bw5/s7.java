package bw5;

/* loaded from: classes7.dex */
public class s7 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f32825d;

    /* renamed from: e, reason: collision with root package name */
    public int f32826e;

    /* renamed from: f, reason: collision with root package name */
    public int f32827f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f32828g;

    /* renamed from: h, reason: collision with root package name */
    public int f32829h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f32830i;

    /* renamed from: m, reason: collision with root package name */
    public bw5.r7 f32831m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f32832n;

    /* renamed from: o, reason: collision with root package name */
    public int f32833o;

    /* renamed from: q, reason: collision with root package name */
    public int f32835q;

    /* renamed from: r, reason: collision with root package name */
    public int f32836r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f32837s;

    /* renamed from: t, reason: collision with root package name */
    public int f32838t;

    /* renamed from: p, reason: collision with root package name */
    public java.util.LinkedList f32834p = new java.util.LinkedList();

    /* renamed from: u, reason: collision with root package name */
    public final boolean[] f32839u = new boolean[15];

    static {
        new bw5.s7();
    }

    public java.lang.String b() {
        return this.f32839u[1] ? this.f32825d : "";
    }

    public java.lang.String c() {
        return this.f32839u[4] ? this.f32828g : "";
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.s7)) {
            return false;
        }
        bw5.s7 s7Var = (bw5.s7) fVar;
        return n51.f.a(this.f32825d, s7Var.f32825d) && n51.f.a(java.lang.Integer.valueOf(this.f32826e), java.lang.Integer.valueOf(s7Var.f32826e)) && n51.f.a(java.lang.Integer.valueOf(this.f32827f), java.lang.Integer.valueOf(s7Var.f32827f)) && n51.f.a(this.f32828g, s7Var.f32828g) && n51.f.a(java.lang.Integer.valueOf(this.f32829h), java.lang.Integer.valueOf(s7Var.f32829h)) && n51.f.a(java.lang.Boolean.valueOf(this.f32830i), java.lang.Boolean.valueOf(s7Var.f32830i)) && n51.f.a(this.f32831m, s7Var.f32831m) && n51.f.a(java.lang.Boolean.valueOf(this.f32832n), java.lang.Boolean.valueOf(s7Var.f32832n)) && n51.f.a(java.lang.Integer.valueOf(this.f32833o), java.lang.Integer.valueOf(s7Var.f32833o)) && n51.f.a(this.f32834p, s7Var.f32834p) && n51.f.a(java.lang.Integer.valueOf(this.f32835q), java.lang.Integer.valueOf(s7Var.f32835q)) && n51.f.a(java.lang.Integer.valueOf(this.f32836r), java.lang.Integer.valueOf(s7Var.f32836r)) && n51.f.a(java.lang.Boolean.valueOf(this.f32837s), java.lang.Boolean.valueOf(s7Var.f32837s)) && n51.f.a(java.lang.Integer.valueOf(this.f32838t), java.lang.Integer.valueOf(s7Var.f32838t));
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public bw5.s7 parseFrom(byte[] bArr) {
        return (bw5.s7) super.parseFrom(bArr);
    }

    public bw5.s7 e(java.lang.String str) {
        this.f32828g = str;
        this.f32839u[4] = true;
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.s7();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f32839u;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f32825d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            if (zArr[2]) {
                fVar.e(2, this.f32826e);
            }
            if (zArr[3]) {
                fVar.e(3, this.f32827f);
            }
            java.lang.String str2 = this.f32828g;
            if (str2 != null && zArr[4]) {
                fVar.j(4, str2);
            }
            if (zArr[5]) {
                fVar.e(5, this.f32829h);
            }
            if (zArr[6]) {
                fVar.a(6, this.f32830i);
            }
            bw5.r7 r7Var = this.f32831m;
            if (r7Var != null && zArr[7]) {
                fVar.i(7, r7Var.computeSize());
                this.f32831m.writeFields(fVar);
            }
            if (zArr[8]) {
                fVar.a(8, this.f32832n);
            }
            if (zArr[9]) {
                fVar.e(9, this.f32833o);
            }
            fVar.g(10, 8, this.f32834p);
            if (zArr[11]) {
                fVar.e(11, this.f32835q);
            }
            if (zArr[12]) {
                fVar.e(12, this.f32836r);
            }
            if (zArr[13]) {
                fVar.a(13, this.f32837s);
            }
            if (!zArr[14]) {
                return 0;
            }
            fVar.e(14, this.f32838t);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f32825d;
            int j17 = (str3 == null || !zArr[1]) ? 0 : 0 + b36.f.j(1, str3);
            if (zArr[2]) {
                j17 += b36.f.e(2, this.f32826e);
            }
            if (zArr[3]) {
                j17 += b36.f.e(3, this.f32827f);
            }
            java.lang.String str4 = this.f32828g;
            if (str4 != null && zArr[4]) {
                j17 += b36.f.j(4, str4);
            }
            if (zArr[5]) {
                j17 += b36.f.e(5, this.f32829h);
            }
            if (zArr[6]) {
                j17 += b36.f.a(6, this.f32830i);
            }
            bw5.r7 r7Var2 = this.f32831m;
            if (r7Var2 != null && zArr[7]) {
                j17 += b36.f.i(7, r7Var2.computeSize());
            }
            if (zArr[8]) {
                j17 += b36.f.a(8, this.f32832n);
            }
            if (zArr[9]) {
                j17 += b36.f.e(9, this.f32833o);
            }
            int g17 = j17 + b36.f.g(10, 8, this.f32834p);
            if (zArr[11]) {
                g17 += b36.f.e(11, this.f32835q);
            }
            if (zArr[12]) {
                g17 += b36.f.e(12, this.f32836r);
            }
            if (zArr[13]) {
                g17 += b36.f.a(13, this.f32837s);
            }
            return zArr[14] ? g17 + b36.f.e(14, this.f32838t) : g17;
        }
        if (i17 == 2) {
            this.f32834p.clear();
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
                this.f32825d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f32826e = aVar2.g(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f32827f = aVar2.g(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f32828g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f32829h = aVar2.g(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f32830i = aVar2.c(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j18.get(i18);
                    bw5.r7 r7Var3 = new bw5.r7();
                    if (bArr != null && bArr.length > 0) {
                        r7Var3.parseFrom(bArr);
                    }
                    this.f32831m = r7Var3;
                }
                zArr[7] = true;
                return 0;
            case 8:
                this.f32832n = aVar2.c(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f32833o = aVar2.g(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size2 = j19.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j19.get(i19);
                    bw5.w7 w7Var = new bw5.w7();
                    if (bArr2 != null && bArr2.length > 0) {
                        w7Var.parseFrom(bArr2);
                    }
                    this.f32834p.add(w7Var);
                }
                zArr[10] = true;
                return 0;
            case 11:
                this.f32835q = aVar2.g(intValue);
                zArr[11] = true;
                return 0;
            case 12:
                this.f32836r = aVar2.g(intValue);
                zArr[12] = true;
                return 0;
            case 13:
                this.f32837s = aVar2.c(intValue);
                zArr[13] = true;
                return 0;
            case 14:
                this.f32838t = aVar2.g(intValue);
                zArr[14] = true;
                return 0;
            default:
                return -1;
        }
    }
}
