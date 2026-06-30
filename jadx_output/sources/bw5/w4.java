package bw5;

/* loaded from: classes2.dex */
public class w4 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public bw5.vy f34575d;

    /* renamed from: e, reason: collision with root package name */
    public int f34576e;

    /* renamed from: f, reason: collision with root package name */
    public int f34577f;

    /* renamed from: g, reason: collision with root package name */
    public int f34578g;

    /* renamed from: h, reason: collision with root package name */
    public long f34579h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f34580i = new boolean[6];

    static {
        new bw5.w4();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.w4 parseFrom(byte[] bArr) {
        return (bw5.w4) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.w4)) {
            return false;
        }
        bw5.w4 w4Var = (bw5.w4) fVar;
        return n51.f.a(this.f34575d, w4Var.f34575d) && n51.f.a(java.lang.Integer.valueOf(this.f34576e), java.lang.Integer.valueOf(w4Var.f34576e)) && n51.f.a(java.lang.Integer.valueOf(this.f34577f), java.lang.Integer.valueOf(w4Var.f34577f)) && n51.f.a(java.lang.Integer.valueOf(this.f34578g), java.lang.Integer.valueOf(w4Var.f34578g)) && n51.f.a(java.lang.Long.valueOf(this.f34579h), java.lang.Long.valueOf(w4Var.f34579h));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.w4();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f34580i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            bw5.vy vyVar = this.f34575d;
            if (vyVar != null && zArr[1]) {
                fVar.i(1, vyVar.computeSize());
                this.f34575d.writeFields(fVar);
            }
            if (zArr[2]) {
                fVar.e(2, this.f34576e);
            }
            if (zArr[3]) {
                fVar.e(3, this.f34577f);
            }
            if (zArr[4]) {
                fVar.e(4, this.f34578g);
            }
            if (zArr[5]) {
                fVar.h(5, this.f34579h);
            }
            return 0;
        }
        if (i17 == 1) {
            bw5.vy vyVar2 = this.f34575d;
            if (vyVar2 != null && zArr[1]) {
                i18 = 0 + b36.f.i(1, vyVar2.computeSize());
            }
            if (zArr[2]) {
                i18 += b36.f.e(2, this.f34576e);
            }
            if (zArr[3]) {
                i18 += b36.f.e(3, this.f34577f);
            }
            if (zArr[4]) {
                i18 += b36.f.e(4, this.f34578g);
            }
            return zArr[5] ? i18 + b36.f.h(5, this.f34579h) : i18;
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
                bw5.vy vyVar3 = new bw5.vy();
                if (bArr != null && bArr.length > 0) {
                    vyVar3.parseFrom(bArr);
                }
                this.f34575d = vyVar3;
            }
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f34576e = aVar2.g(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f34577f = aVar2.g(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue == 4) {
            this.f34578g = aVar2.g(intValue);
            zArr[4] = true;
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        this.f34579h = aVar2.i(intValue);
        zArr[5] = true;
        return 0;
    }
}
