package bw5;

/* loaded from: classes11.dex */
public class r1 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public long f32362d;

    /* renamed from: e, reason: collision with root package name */
    public bw5.dj0 f32363e;

    /* renamed from: f, reason: collision with root package name */
    public long f32364f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f32365g = new boolean[4];

    static {
        new bw5.r1();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.r1 parseFrom(byte[] bArr) {
        return (bw5.r1) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.r1)) {
            return false;
        }
        bw5.r1 r1Var = (bw5.r1) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f32362d), java.lang.Long.valueOf(r1Var.f32362d)) && n51.f.a(this.f32363e, r1Var.f32363e) && n51.f.a(java.lang.Long.valueOf(this.f32364f), java.lang.Long.valueOf(r1Var.f32364f));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.r1();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f32365g;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.h(1, this.f32362d);
            }
            bw5.dj0 dj0Var = this.f32363e;
            if (dj0Var != null && zArr[2]) {
                fVar.i(2, dj0Var.computeSize());
                this.f32363e.writeFields(fVar);
            }
            if (zArr[3]) {
                fVar.h(3, this.f32364f);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = zArr[1] ? 0 + b36.f.h(1, this.f32362d) : 0;
            bw5.dj0 dj0Var2 = this.f32363e;
            if (dj0Var2 != null && zArr[2]) {
                h17 += b36.f.i(2, dj0Var2.computeSize());
            }
            return zArr[3] ? h17 + b36.f.h(3, this.f32364f) : h17;
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
            this.f32362d = aVar2.i(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue != 2) {
            if (intValue != 3) {
                return -1;
            }
            this.f32364f = aVar2.i(intValue);
            zArr[3] = true;
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            bw5.dj0 dj0Var3 = new bw5.dj0();
            if (bArr != null && bArr.length > 0) {
                dj0Var3.parseFrom(bArr);
            }
            this.f32363e = dj0Var3;
        }
        zArr[2] = true;
        return 0;
    }
}
