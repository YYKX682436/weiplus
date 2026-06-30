package bw5;

/* loaded from: classes2.dex */
public class ku extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public boolean f29546d;

    /* renamed from: e, reason: collision with root package name */
    public int f29547e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f29548f;

    /* renamed from: g, reason: collision with root package name */
    public int f29549g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f29550h;

    /* renamed from: i, reason: collision with root package name */
    public bw5.ru f29551i;

    /* renamed from: m, reason: collision with root package name */
    public final boolean[] f29552m = new boolean[7];

    static {
        new bw5.ku();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.ku parseFrom(byte[] bArr) {
        return (bw5.ku) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.ku)) {
            return false;
        }
        bw5.ku kuVar = (bw5.ku) fVar;
        return n51.f.a(java.lang.Boolean.valueOf(this.f29546d), java.lang.Boolean.valueOf(kuVar.f29546d)) && n51.f.a(java.lang.Integer.valueOf(this.f29547e), java.lang.Integer.valueOf(kuVar.f29547e)) && n51.f.a(java.lang.Boolean.valueOf(this.f29548f), java.lang.Boolean.valueOf(kuVar.f29548f)) && n51.f.a(java.lang.Integer.valueOf(this.f29549g), java.lang.Integer.valueOf(kuVar.f29549g)) && n51.f.a(this.f29550h, kuVar.f29550h) && n51.f.a(this.f29551i, kuVar.f29551i);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.ku();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f29552m;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.a(1, this.f29546d);
            }
            if (zArr[2]) {
                fVar.e(2, this.f29547e);
            }
            if (zArr[3]) {
                fVar.a(3, this.f29548f);
            }
            if (zArr[4]) {
                fVar.e(4, this.f29549g);
            }
            com.tencent.mm.protobuf.g gVar = this.f29550h;
            if (gVar != null && zArr[5]) {
                fVar.b(5, gVar);
            }
            bw5.ru ruVar = this.f29551i;
            if (ruVar != null && zArr[6]) {
                fVar.i(6, ruVar.computeSize());
                this.f29551i.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int a17 = zArr[1] ? 0 + b36.f.a(1, this.f29546d) : 0;
            if (zArr[2]) {
                a17 += b36.f.e(2, this.f29547e);
            }
            if (zArr[3]) {
                a17 += b36.f.a(3, this.f29548f);
            }
            if (zArr[4]) {
                a17 += b36.f.e(4, this.f29549g);
            }
            com.tencent.mm.protobuf.g gVar2 = this.f29550h;
            if (gVar2 != null && zArr[5]) {
                a17 += b36.f.b(5, gVar2);
            }
            bw5.ru ruVar2 = this.f29551i;
            return (ruVar2 == null || !zArr[6]) ? a17 : a17 + b36.f.i(6, ruVar2.computeSize());
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
                this.f29546d = aVar2.c(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f29547e = aVar2.g(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f29548f = aVar2.c(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f29549g = aVar2.g(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f29550h = aVar2.d(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    bw5.ru ruVar3 = new bw5.ru();
                    if (bArr != null && bArr.length > 0) {
                        ruVar3.parseFrom(bArr);
                    }
                    this.f29551i = ruVar3;
                }
                zArr[6] = true;
                return 0;
            default:
                return -1;
        }
    }
}
