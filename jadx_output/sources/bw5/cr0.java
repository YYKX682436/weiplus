package bw5;

/* loaded from: classes11.dex */
public class cr0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public bw5.v70 f26206d;

    /* renamed from: e, reason: collision with root package name */
    public bw5.o50 f26207e;

    /* renamed from: f, reason: collision with root package name */
    public bw5.v70 f26208f;

    /* renamed from: g, reason: collision with root package name */
    public int f26209g;

    /* renamed from: h, reason: collision with root package name */
    public int f26210h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f26211i = new boolean[6];

    static {
        new bw5.cr0();
    }

    public bw5.o50 b() {
        return this.f26211i[2] ? this.f26207e : new bw5.o50();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public bw5.cr0 parseFrom(byte[] bArr) {
        return (bw5.cr0) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.cr0)) {
            return false;
        }
        bw5.cr0 cr0Var = (bw5.cr0) fVar;
        return n51.f.a(this.f26206d, cr0Var.f26206d) && n51.f.a(this.f26207e, cr0Var.f26207e) && n51.f.a(this.f26208f, cr0Var.f26208f) && n51.f.a(java.lang.Integer.valueOf(this.f26209g), java.lang.Integer.valueOf(cr0Var.f26209g)) && n51.f.a(java.lang.Integer.valueOf(this.f26210h), java.lang.Integer.valueOf(cr0Var.f26210h));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.cr0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f26211i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            bw5.v70 v70Var = this.f26206d;
            if (v70Var != null && zArr[1]) {
                fVar.i(1, v70Var.computeSize());
                this.f26206d.writeFields(fVar);
            }
            bw5.o50 o50Var = this.f26207e;
            if (o50Var != null && zArr[2]) {
                fVar.i(2, o50Var.computeSize());
                this.f26207e.writeFields(fVar);
            }
            bw5.v70 v70Var2 = this.f26208f;
            if (v70Var2 != null && zArr[3]) {
                fVar.i(3, v70Var2.computeSize());
                this.f26208f.writeFields(fVar);
            }
            if (zArr[4]) {
                fVar.e(4, this.f26209g);
            }
            if (zArr[5]) {
                fVar.e(5, this.f26210h);
            }
            return 0;
        }
        if (i17 == 1) {
            bw5.v70 v70Var3 = this.f26206d;
            if (v70Var3 != null && zArr[1]) {
                i18 = 0 + b36.f.i(1, v70Var3.computeSize());
            }
            bw5.o50 o50Var2 = this.f26207e;
            if (o50Var2 != null && zArr[2]) {
                i18 += b36.f.i(2, o50Var2.computeSize());
            }
            bw5.v70 v70Var4 = this.f26208f;
            if (v70Var4 != null && zArr[3]) {
                i18 += b36.f.i(3, v70Var4.computeSize());
            }
            if (zArr[4]) {
                i18 += b36.f.e(4, this.f26209g);
            }
            return zArr[5] ? i18 + b36.f.e(5, this.f26210h) : i18;
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
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                bw5.v70 v70Var5 = new bw5.v70();
                if (bArr != null && bArr.length > 0) {
                    v70Var5.parseFrom(bArr);
                }
                this.f26206d = v70Var5;
            }
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i27 = 0; i27 < size2; i27++) {
                byte[] bArr2 = (byte[]) j18.get(i27);
                bw5.o50 o50Var3 = new bw5.o50();
                if (bArr2 != null && bArr2.length > 0) {
                    o50Var3.parseFrom(bArr2);
                }
                this.f26207e = o50Var3;
            }
            zArr[2] = true;
            return 0;
        }
        if (intValue != 3) {
            if (intValue == 4) {
                this.f26209g = aVar2.g(intValue);
                zArr[4] = true;
                return 0;
            }
            if (intValue != 5) {
                return -1;
            }
            this.f26210h = aVar2.g(intValue);
            zArr[5] = true;
            return 0;
        }
        java.util.LinkedList j19 = aVar2.j(intValue);
        int size3 = j19.size();
        for (int i28 = 0; i28 < size3; i28++) {
            byte[] bArr3 = (byte[]) j19.get(i28);
            bw5.v70 v70Var6 = new bw5.v70();
            if (bArr3 != null && bArr3.length > 0) {
                v70Var6.parseFrom(bArr3);
            }
            this.f26208f = v70Var6;
        }
        zArr[3] = true;
        return 0;
    }
}
