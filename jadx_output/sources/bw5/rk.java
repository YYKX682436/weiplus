package bw5;

/* loaded from: classes2.dex */
public class rk extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f32555d;

    /* renamed from: e, reason: collision with root package name */
    public bw5.gn f32556e;

    /* renamed from: f, reason: collision with root package name */
    public bw5.im f32557f;

    /* renamed from: g, reason: collision with root package name */
    public bw5.pk f32558g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f32559h = new boolean[5];

    static {
        new bw5.rk();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.rk parseFrom(byte[] bArr) {
        return (bw5.rk) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.rk)) {
            return false;
        }
        bw5.rk rkVar = (bw5.rk) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f32555d), java.lang.Integer.valueOf(rkVar.f32555d)) && n51.f.a(this.f32556e, rkVar.f32556e) && n51.f.a(this.f32557f, rkVar.f32557f) && n51.f.a(this.f32558g, rkVar.f32558g);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.rk();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f32559h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f32555d);
            }
            bw5.gn gnVar = this.f32556e;
            if (gnVar != null && zArr[2]) {
                fVar.i(2, gnVar.computeSize());
                this.f32556e.writeFields(fVar);
            }
            bw5.im imVar = this.f32557f;
            if (imVar != null && zArr[3]) {
                fVar.i(3, imVar.computeSize());
                this.f32557f.writeFields(fVar);
            }
            bw5.pk pkVar = this.f32558g;
            if (pkVar != null && zArr[4]) {
                fVar.i(4, pkVar.computeSize());
                this.f32558g.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f32555d) : 0;
            bw5.gn gnVar2 = this.f32556e;
            if (gnVar2 != null && zArr[2]) {
                e17 += b36.f.i(2, gnVar2.computeSize());
            }
            bw5.im imVar2 = this.f32557f;
            if (imVar2 != null && zArr[3]) {
                e17 += b36.f.i(3, imVar2.computeSize());
            }
            bw5.pk pkVar2 = this.f32558g;
            return (pkVar2 == null || !zArr[4]) ? e17 : e17 + b36.f.i(4, pkVar2.computeSize());
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
            this.f32555d = aVar2.g(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr = (byte[]) j17.get(i18);
                bw5.gn gnVar3 = new bw5.gn();
                if (bArr != null && bArr.length > 0) {
                    gnVar3.parseFrom(bArr);
                }
                this.f32556e = gnVar3;
            }
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i19 = 0; i19 < size2; i19++) {
                byte[] bArr2 = (byte[]) j18.get(i19);
                bw5.im imVar3 = new bw5.im();
                if (bArr2 != null && bArr2.length > 0) {
                    imVar3.parseFrom(bArr2);
                }
                this.f32557f = imVar3;
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
            bw5.pk pkVar3 = new bw5.pk();
            if (bArr3 != null && bArr3.length > 0) {
                pkVar3.parseFrom(bArr3);
            }
            this.f32558g = pkVar3;
        }
        zArr[4] = true;
        return 0;
    }
}
