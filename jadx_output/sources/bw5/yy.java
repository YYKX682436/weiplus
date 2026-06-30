package bw5;

/* loaded from: classes2.dex */
public class yy extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public bw5.ae f35727d;

    /* renamed from: e, reason: collision with root package name */
    public bw5.fr f35728e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f35729f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f35730g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f35731h = new boolean[5];

    static {
        new bw5.yy();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.yy parseFrom(byte[] bArr) {
        return (bw5.yy) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.yy)) {
            return false;
        }
        bw5.yy yyVar = (bw5.yy) fVar;
        return n51.f.a(this.f35727d, yyVar.f35727d) && n51.f.a(this.f35728e, yyVar.f35728e) && n51.f.a(this.f35729f, yyVar.f35729f) && n51.f.a(this.f35730g, yyVar.f35730g);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.yy();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f35731h;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            bw5.ae aeVar = this.f35727d;
            if (aeVar != null && zArr[1]) {
                fVar.i(1, aeVar.computeSize());
                this.f35727d.writeFields(fVar);
            }
            bw5.fr frVar = this.f35728e;
            if (frVar != null && zArr[2]) {
                fVar.i(2, frVar.computeSize());
                this.f35728e.writeFields(fVar);
            }
            java.lang.String str = this.f35729f;
            if (str != null && zArr[3]) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f35730g;
            if (str2 != null && zArr[4]) {
                fVar.j(4, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            bw5.ae aeVar2 = this.f35727d;
            if (aeVar2 != null && zArr[1]) {
                i18 = 0 + b36.f.i(1, aeVar2.computeSize());
            }
            bw5.fr frVar2 = this.f35728e;
            if (frVar2 != null && zArr[2]) {
                i18 += b36.f.i(2, frVar2.computeSize());
            }
            java.lang.String str3 = this.f35729f;
            if (str3 != null && zArr[3]) {
                i18 += b36.f.j(3, str3);
            }
            java.lang.String str4 = this.f35730g;
            return (str4 == null || !zArr[4]) ? i18 : i18 + b36.f.j(4, str4);
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
                bw5.ae aeVar3 = new bw5.ae();
                if (bArr != null && bArr.length > 0) {
                    aeVar3.parseFrom(bArr);
                }
                this.f35727d = aeVar3;
            }
            zArr[1] = true;
            return 0;
        }
        if (intValue != 2) {
            if (intValue == 3) {
                this.f35729f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            }
            if (intValue != 4) {
                return -1;
            }
            this.f35730g = aVar2.k(intValue);
            zArr[4] = true;
            return 0;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr2 = (byte[]) j18.get(i27);
            bw5.fr frVar3 = new bw5.fr();
            if (bArr2 != null && bArr2.length > 0) {
                frVar3.parseFrom(bArr2);
            }
            this.f35728e = frVar3;
        }
        zArr[2] = true;
        return 0;
    }
}
