package bw5;

/* loaded from: classes2.dex */
public class vc extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f34280d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f34281e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f34282f;

    /* renamed from: g, reason: collision with root package name */
    public int f34283g;

    /* renamed from: h, reason: collision with root package name */
    public int f34284h;

    /* renamed from: i, reason: collision with root package name */
    public bw5.uc f34285i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f34286m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean[] f34287n = new boolean[8];

    static {
        new bw5.vc();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.vc parseFrom(byte[] bArr) {
        return (bw5.vc) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.vc)) {
            return false;
        }
        bw5.vc vcVar = (bw5.vc) fVar;
        return n51.f.a(this.f34280d, vcVar.f34280d) && n51.f.a(this.f34281e, vcVar.f34281e) && n51.f.a(this.f34282f, vcVar.f34282f) && n51.f.a(java.lang.Integer.valueOf(this.f34283g), java.lang.Integer.valueOf(vcVar.f34283g)) && n51.f.a(java.lang.Integer.valueOf(this.f34284h), java.lang.Integer.valueOf(vcVar.f34284h)) && n51.f.a(this.f34285i, vcVar.f34285i) && n51.f.a(this.f34286m, vcVar.f34286m);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.vc();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f34287n;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f34280d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f34281e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f34282f;
            if (str3 != null && zArr[3]) {
                fVar.j(3, str3);
            }
            if (zArr[4]) {
                fVar.e(4, this.f34283g);
            }
            if (zArr[5]) {
                fVar.e(5, this.f34284h);
            }
            bw5.uc ucVar = this.f34285i;
            if (ucVar != null && zArr[6]) {
                fVar.i(6, ucVar.computeSize());
                this.f34285i.writeFields(fVar);
            }
            java.lang.String str4 = this.f34286m;
            if (str4 != null && zArr[7]) {
                fVar.j(7, str4);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f34280d;
            if (str5 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str5);
            }
            java.lang.String str6 = this.f34281e;
            if (str6 != null && zArr[2]) {
                i18 += b36.f.j(2, str6);
            }
            java.lang.String str7 = this.f34282f;
            if (str7 != null && zArr[3]) {
                i18 += b36.f.j(3, str7);
            }
            if (zArr[4]) {
                i18 += b36.f.e(4, this.f34283g);
            }
            if (zArr[5]) {
                i18 += b36.f.e(5, this.f34284h);
            }
            bw5.uc ucVar2 = this.f34285i;
            if (ucVar2 != null && zArr[6]) {
                i18 += b36.f.i(6, ucVar2.computeSize());
            }
            java.lang.String str8 = this.f34286m;
            return (str8 == null || !zArr[7]) ? i18 : i18 + b36.f.j(7, str8);
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
                this.f34280d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f34281e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f34282f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f34283g = aVar2.g(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f34284h = aVar2.g(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    bw5.uc ucVar3 = new bw5.uc();
                    if (bArr != null && bArr.length > 0) {
                        ucVar3.parseFrom(bArr);
                    }
                    this.f34285i = ucVar3;
                }
                zArr[6] = true;
                return 0;
            case 7:
                this.f34286m = aVar2.k(intValue);
                zArr[7] = true;
                return 0;
            default:
                return -1;
        }
    }
}
