package bw5;

/* loaded from: classes2.dex */
public class vl extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f34391d;

    /* renamed from: e, reason: collision with root package name */
    public int f34392e;

    /* renamed from: f, reason: collision with root package name */
    public int f34393f;

    /* renamed from: g, reason: collision with root package name */
    public int f34394g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.LinkedList f34395h = new java.util.LinkedList();

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f34396i = new boolean[6];

    static {
        new bw5.vl();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.vl parseFrom(byte[] bArr) {
        return (bw5.vl) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.vl)) {
            return false;
        }
        bw5.vl vlVar = (bw5.vl) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f34391d), java.lang.Integer.valueOf(vlVar.f34391d)) && n51.f.a(java.lang.Integer.valueOf(this.f34392e), java.lang.Integer.valueOf(vlVar.f34392e)) && n51.f.a(java.lang.Integer.valueOf(this.f34393f), java.lang.Integer.valueOf(vlVar.f34393f)) && n51.f.a(java.lang.Integer.valueOf(this.f34394g), java.lang.Integer.valueOf(vlVar.f34394g)) && n51.f.a(this.f34395h, vlVar.f34395h);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.vl();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f34395h;
        boolean[] zArr = this.f34396i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f34391d);
            }
            if (zArr[2]) {
                fVar.e(2, this.f34392e);
            }
            if (zArr[3]) {
                fVar.e(3, this.f34393f);
            }
            if (zArr[4]) {
                fVar.e(4, this.f34394g);
            }
            fVar.g(5, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f34391d) : 0;
            if (zArr[2]) {
                e17 += b36.f.e(2, this.f34392e);
            }
            if (zArr[3]) {
                e17 += b36.f.e(3, this.f34393f);
            }
            if (zArr[4]) {
                e17 += b36.f.e(4, this.f34394g);
            }
            return e17 + b36.f.g(5, 8, linkedList);
        }
        if (i17 == 2) {
            linkedList.clear();
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
            this.f34391d = aVar2.g(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f34392e = aVar2.g(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f34393f = aVar2.g(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue == 4) {
            this.f34394g = aVar2.g(intValue);
            zArr[4] = true;
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            bw5.qi0 qi0Var = new bw5.qi0();
            if (bArr != null && bArr.length > 0) {
                qi0Var.parseFrom(bArr);
            }
            linkedList.add(qi0Var);
        }
        zArr[5] = true;
        return 0;
    }
}
