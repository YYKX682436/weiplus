package bw5;

/* loaded from: classes2.dex */
public class l4 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f29627d;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f29629f;

    /* renamed from: g, reason: collision with root package name */
    public int f29630g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f29631h;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f29628e = new java.util.LinkedList();

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f29632i = new boolean[6];

    static {
        new bw5.l4();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.l4 parseFrom(byte[] bArr) {
        return (bw5.l4) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.l4)) {
            return false;
        }
        bw5.l4 l4Var = (bw5.l4) fVar;
        return n51.f.a(this.f29627d, l4Var.f29627d) && n51.f.a(this.f29628e, l4Var.f29628e) && n51.f.a(this.f29629f, l4Var.f29629f) && n51.f.a(java.lang.Integer.valueOf(this.f29630g), java.lang.Integer.valueOf(l4Var.f29630g)) && n51.f.a(this.f29631h, l4Var.f29631h);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.l4();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f29628e;
        int i18 = 0;
        boolean[] zArr = this.f29632i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f29627d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            fVar.g(2, 8, linkedList);
            java.lang.String str2 = this.f29629f;
            if (str2 != null && zArr[3]) {
                fVar.j(3, str2);
            }
            if (zArr[4]) {
                fVar.e(4, this.f29630g);
            }
            java.lang.String str3 = this.f29631h;
            if (str3 != null && zArr[5]) {
                fVar.j(5, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f29627d;
            if (str4 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str4);
            }
            int g17 = i18 + b36.f.g(2, 8, linkedList);
            java.lang.String str5 = this.f29629f;
            if (str5 != null && zArr[3]) {
                g17 += b36.f.j(3, str5);
            }
            if (zArr[4]) {
                g17 += b36.f.e(4, this.f29630g);
            }
            java.lang.String str6 = this.f29631h;
            return (str6 == null || !zArr[5]) ? g17 : g17 + b36.f.j(5, str6);
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
            this.f29627d = aVar2.k(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue != 2) {
            if (intValue == 3) {
                this.f29629f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            }
            if (intValue == 4) {
                this.f29630g = aVar2.g(intValue);
                zArr[4] = true;
                return 0;
            }
            if (intValue != 5) {
                return -1;
            }
            this.f29631h = aVar2.k(intValue);
            zArr[5] = true;
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i19 = 0; i19 < size; i19++) {
            byte[] bArr = (byte[]) j17.get(i19);
            bw5.k4 k4Var = new bw5.k4();
            if (bArr != null && bArr.length > 0) {
                k4Var.parseFrom(bArr);
            }
            linkedList.add(k4Var);
        }
        zArr[2] = true;
        return 0;
    }
}
