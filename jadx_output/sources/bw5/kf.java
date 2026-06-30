package bw5;

/* loaded from: classes9.dex */
public class kf extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f29362d;

    /* renamed from: e, reason: collision with root package name */
    public bw5.c7 f29363e;

    /* renamed from: f, reason: collision with root package name */
    public bw5.x7 f29364f;

    /* renamed from: g, reason: collision with root package name */
    public bw5.w9 f29365g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f29366h = new boolean[5];

    static {
        new bw5.kf();
    }

    public bw5.x7 b() {
        return this.f29366h[3] ? this.f29364f : new bw5.x7();
    }

    public bw5.c7 c() {
        return this.f29366h[2] ? this.f29363e : new bw5.c7();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.kf)) {
            return false;
        }
        bw5.kf kfVar = (bw5.kf) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f29362d), java.lang.Integer.valueOf(kfVar.f29362d)) && n51.f.a(this.f29363e, kfVar.f29363e) && n51.f.a(this.f29364f, kfVar.f29364f) && n51.f.a(this.f29365g, kfVar.f29365g);
    }

    public bw5.w9 d() {
        return this.f29366h[4] ? this.f29365g : new bw5.w9();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public bw5.kf parseFrom(byte[] bArr) {
        return (bw5.kf) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.kf();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f29366h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f29362d);
            }
            bw5.c7 c7Var = this.f29363e;
            if (c7Var != null && zArr[2]) {
                fVar.i(2, c7Var.computeSize());
                this.f29363e.writeFields(fVar);
            }
            bw5.x7 x7Var = this.f29364f;
            if (x7Var != null && zArr[3]) {
                fVar.i(3, x7Var.computeSize());
                this.f29364f.writeFields(fVar);
            }
            bw5.w9 w9Var = this.f29365g;
            if (w9Var != null && zArr[4]) {
                fVar.i(4, w9Var.computeSize());
                this.f29365g.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f29362d) : 0;
            bw5.c7 c7Var2 = this.f29363e;
            if (c7Var2 != null && zArr[2]) {
                e17 += b36.f.i(2, c7Var2.computeSize());
            }
            bw5.x7 x7Var2 = this.f29364f;
            if (x7Var2 != null && zArr[3]) {
                e17 += b36.f.i(3, x7Var2.computeSize());
            }
            bw5.w9 w9Var2 = this.f29365g;
            return (w9Var2 == null || !zArr[4]) ? e17 : e17 + b36.f.i(4, w9Var2.computeSize());
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
            this.f29362d = aVar2.g(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr = (byte[]) j17.get(i18);
                bw5.c7 c7Var3 = new bw5.c7();
                if (bArr != null && bArr.length > 0) {
                    c7Var3.parseFrom(bArr);
                }
                this.f29363e = c7Var3;
            }
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i19 = 0; i19 < size2; i19++) {
                byte[] bArr2 = (byte[]) j18.get(i19);
                bw5.x7 x7Var3 = new bw5.x7();
                if (bArr2 != null && bArr2.length > 0) {
                    x7Var3.parseFrom(bArr2);
                }
                this.f29364f = x7Var3;
            }
            zArr[3] = true;
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        java.util.LinkedList j19 = aVar2.j(intValue);
        int size3 = j19.size();
        for (int i27 = 0; i27 < size3; i27++) {
            byte[] bArr3 = (byte[]) j19.get(i27);
            bw5.w9 w9Var3 = new bw5.w9();
            if (bArr3 != null && bArr3.length > 0) {
                w9Var3.parseFrom(bArr3);
            }
            this.f29365g = w9Var3;
        }
        zArr[4] = true;
        return 0;
    }
}
