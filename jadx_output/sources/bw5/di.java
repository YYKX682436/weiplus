package bw5;

/* loaded from: classes2.dex */
public class di extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public bw5.ij f26495d;

    /* renamed from: e, reason: collision with root package name */
    public bw5.ij f26496e;

    /* renamed from: f, reason: collision with root package name */
    public int f26497f;

    /* renamed from: g, reason: collision with root package name */
    public int f26498g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f26499h = new boolean[5];

    static {
        new bw5.di();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.di parseFrom(byte[] bArr) {
        return (bw5.di) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.di)) {
            return false;
        }
        bw5.di diVar = (bw5.di) fVar;
        return n51.f.a(this.f26495d, diVar.f26495d) && n51.f.a(this.f26496e, diVar.f26496e) && n51.f.a(java.lang.Integer.valueOf(this.f26497f), java.lang.Integer.valueOf(diVar.f26497f)) && n51.f.a(java.lang.Integer.valueOf(this.f26498g), java.lang.Integer.valueOf(diVar.f26498g));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.di();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f26499h;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            bw5.ij ijVar = this.f26495d;
            if (ijVar != null && zArr[1]) {
                fVar.i(1, ijVar.computeSize());
                this.f26495d.writeFields(fVar);
            }
            bw5.ij ijVar2 = this.f26496e;
            if (ijVar2 != null && zArr[2]) {
                fVar.i(2, ijVar2.computeSize());
                this.f26496e.writeFields(fVar);
            }
            if (zArr[3]) {
                fVar.e(3, this.f26497f);
            }
            if (zArr[4]) {
                fVar.e(4, this.f26498g);
            }
            return 0;
        }
        if (i17 == 1) {
            bw5.ij ijVar3 = this.f26495d;
            if (ijVar3 != null && zArr[1]) {
                i18 = 0 + b36.f.i(1, ijVar3.computeSize());
            }
            bw5.ij ijVar4 = this.f26496e;
            if (ijVar4 != null && zArr[2]) {
                i18 += b36.f.i(2, ijVar4.computeSize());
            }
            if (zArr[3]) {
                i18 += b36.f.e(3, this.f26497f);
            }
            return zArr[4] ? i18 + b36.f.e(4, this.f26498g) : i18;
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
                bw5.ij ijVar5 = new bw5.ij();
                if (bArr != null && bArr.length > 0) {
                    ijVar5.parseFrom(bArr);
                }
                this.f26495d = ijVar5;
            }
            zArr[1] = true;
            return 0;
        }
        if (intValue != 2) {
            if (intValue == 3) {
                this.f26497f = aVar2.g(intValue);
                zArr[3] = true;
                return 0;
            }
            if (intValue != 4) {
                return -1;
            }
            this.f26498g = aVar2.g(intValue);
            zArr[4] = true;
            return 0;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr2 = (byte[]) j18.get(i27);
            bw5.ij ijVar6 = new bw5.ij();
            if (bArr2 != null && bArr2.length > 0) {
                ijVar6.parseFrom(bArr2);
            }
            this.f26496e = ijVar6;
        }
        zArr[2] = true;
        return 0;
    }
}
