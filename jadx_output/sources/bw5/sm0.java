package bw5;

/* loaded from: classes11.dex */
public class sm0 extends com.tencent.mm.protobuf.f {

    /* renamed from: u, reason: collision with root package name */
    public static final bw5.sm0 f33050u = new bw5.sm0();

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f33051d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f33052e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f33053f;

    /* renamed from: g, reason: collision with root package name */
    public long f33054g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f33055h;

    /* renamed from: i, reason: collision with root package name */
    public int f33056i;

    /* renamed from: m, reason: collision with root package name */
    public int f33057m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f33058n;

    /* renamed from: o, reason: collision with root package name */
    public int f33059o;

    /* renamed from: p, reason: collision with root package name */
    public bw5.rn0 f33060p;

    /* renamed from: q, reason: collision with root package name */
    public bw5.ol0 f33061q;

    /* renamed from: r, reason: collision with root package name */
    public bw5.vm0 f33062r;

    /* renamed from: s, reason: collision with root package name */
    public bw5.gi0 f33063s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean[] f33064t = new boolean[14];

    public bw5.vm0 b() {
        return this.f33064t[12] ? this.f33062r : new bw5.vm0();
    }

    public bw5.gi0 c() {
        return this.f33064t[13] ? this.f33063s : new bw5.gi0();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.sm0)) {
            return false;
        }
        bw5.sm0 sm0Var = (bw5.sm0) fVar;
        return n51.f.a(this.f33051d, sm0Var.f33051d) && n51.f.a(this.f33052e, sm0Var.f33052e) && n51.f.a(this.f33053f, sm0Var.f33053f) && n51.f.a(java.lang.Long.valueOf(this.f33054g), java.lang.Long.valueOf(sm0Var.f33054g)) && n51.f.a(this.f33055h, sm0Var.f33055h) && n51.f.a(java.lang.Integer.valueOf(this.f33056i), java.lang.Integer.valueOf(sm0Var.f33056i)) && n51.f.a(java.lang.Integer.valueOf(this.f33057m), java.lang.Integer.valueOf(sm0Var.f33057m)) && n51.f.a(java.lang.Boolean.valueOf(this.f33058n), java.lang.Boolean.valueOf(sm0Var.f33058n)) && n51.f.a(java.lang.Integer.valueOf(this.f33059o), java.lang.Integer.valueOf(sm0Var.f33059o)) && n51.f.a(this.f33060p, sm0Var.f33060p) && n51.f.a(this.f33061q, sm0Var.f33061q) && n51.f.a(this.f33062r, sm0Var.f33062r) && n51.f.a(this.f33063s, sm0Var.f33063s);
    }

    public bw5.rn0 d() {
        return this.f33064t[10] ? this.f33060p : new bw5.rn0();
    }

    public java.lang.String e() {
        return this.f33064t[2] ? this.f33052e : "";
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public bw5.sm0 parseFrom(byte[] bArr) {
        return (bw5.sm0) super.parseFrom(bArr);
    }

    public java.lang.String getIconId() {
        return this.f33064t[5] ? this.f33055h : "";
    }

    public java.lang.String getStatusId() {
        return this.f33064t[1] ? this.f33051d : "";
    }

    public java.lang.String getTopicId() {
        return this.f33064t[3] ? this.f33053f : "";
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.sm0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f33064t;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f33051d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f33052e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f33053f;
            if (str3 != null && zArr[3]) {
                fVar.j(3, str3);
            }
            if (zArr[4]) {
                fVar.h(4, this.f33054g);
            }
            java.lang.String str4 = this.f33055h;
            if (str4 != null && zArr[5]) {
                fVar.j(5, str4);
            }
            if (zArr[6]) {
                fVar.e(6, this.f33056i);
            }
            if (zArr[7]) {
                fVar.e(7, this.f33057m);
            }
            if (zArr[8]) {
                fVar.a(8, this.f33058n);
            }
            if (zArr[9]) {
                fVar.e(9, this.f33059o);
            }
            bw5.rn0 rn0Var = this.f33060p;
            if (rn0Var != null && zArr[10]) {
                fVar.i(10, rn0Var.computeSize());
                this.f33060p.writeFields(fVar);
            }
            bw5.ol0 ol0Var = this.f33061q;
            if (ol0Var != null && zArr[11]) {
                fVar.i(11, ol0Var.computeSize());
                this.f33061q.writeFields(fVar);
            }
            bw5.vm0 vm0Var = this.f33062r;
            if (vm0Var != null && zArr[12]) {
                fVar.i(12, vm0Var.computeSize());
                this.f33062r.writeFields(fVar);
            }
            bw5.gi0 gi0Var = this.f33063s;
            if (gi0Var == null || !zArr[13]) {
                return 0;
            }
            fVar.i(13, gi0Var.computeSize());
            this.f33063s.writeFields(fVar);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f33051d;
            int j17 = (str5 == null || !zArr[1]) ? 0 : 0 + b36.f.j(1, str5);
            java.lang.String str6 = this.f33052e;
            if (str6 != null && zArr[2]) {
                j17 += b36.f.j(2, str6);
            }
            java.lang.String str7 = this.f33053f;
            if (str7 != null && zArr[3]) {
                j17 += b36.f.j(3, str7);
            }
            if (zArr[4]) {
                j17 += b36.f.h(4, this.f33054g);
            }
            java.lang.String str8 = this.f33055h;
            if (str8 != null && zArr[5]) {
                j17 += b36.f.j(5, str8);
            }
            if (zArr[6]) {
                j17 += b36.f.e(6, this.f33056i);
            }
            if (zArr[7]) {
                j17 += b36.f.e(7, this.f33057m);
            }
            if (zArr[8]) {
                j17 += b36.f.a(8, this.f33058n);
            }
            if (zArr[9]) {
                j17 += b36.f.e(9, this.f33059o);
            }
            bw5.rn0 rn0Var2 = this.f33060p;
            if (rn0Var2 != null && zArr[10]) {
                j17 += b36.f.i(10, rn0Var2.computeSize());
            }
            bw5.ol0 ol0Var2 = this.f33061q;
            if (ol0Var2 != null && zArr[11]) {
                j17 += b36.f.i(11, ol0Var2.computeSize());
            }
            bw5.vm0 vm0Var2 = this.f33062r;
            if (vm0Var2 != null && zArr[12]) {
                j17 += b36.f.i(12, vm0Var2.computeSize());
            }
            bw5.gi0 gi0Var2 = this.f33063s;
            return (gi0Var2 == null || !zArr[13]) ? j17 : j17 + b36.f.i(13, gi0Var2.computeSize());
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
                this.f33051d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f33052e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f33053f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f33054g = aVar2.i(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f33055h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f33056i = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f33057m = aVar2.g(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f33058n = aVar2.c(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f33059o = aVar2.g(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j18.get(i18);
                    bw5.rn0 rn0Var3 = new bw5.rn0();
                    if (bArr != null && bArr.length > 0) {
                        rn0Var3.parseFrom(bArr);
                    }
                    this.f33060p = rn0Var3;
                }
                zArr[10] = true;
                return 0;
            case 11:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size2 = j19.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j19.get(i19);
                    bw5.ol0 ol0Var3 = new bw5.ol0();
                    if (bArr2 != null && bArr2.length > 0) {
                        ol0Var3.parseFrom(bArr2);
                    }
                    this.f33061q = ol0Var3;
                }
                zArr[11] = true;
                return 0;
            case 12:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size3 = j27.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr3 = (byte[]) j27.get(i27);
                    bw5.vm0 vm0Var3 = new bw5.vm0();
                    if (bArr3 != null && bArr3.length > 0) {
                        vm0Var3.parseFrom(bArr3);
                    }
                    this.f33062r = vm0Var3;
                }
                zArr[12] = true;
                return 0;
            case 13:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size4 = j28.size();
                for (int i28 = 0; i28 < size4; i28++) {
                    byte[] bArr4 = (byte[]) j28.get(i28);
                    bw5.gi0 gi0Var3 = new bw5.gi0();
                    if (bArr4 != null && bArr4.length > 0) {
                        gi0Var3.parseFrom(bArr4);
                    }
                    this.f33063s = gi0Var3;
                }
                zArr[13] = true;
                return 0;
            default:
                return -1;
        }
    }
}
