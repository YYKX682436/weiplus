package bw5;

/* loaded from: classes2.dex */
public class no extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public boolean f30757d;

    /* renamed from: e, reason: collision with root package name */
    public long f30758e;

    /* renamed from: f, reason: collision with root package name */
    public long f30759f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f30760g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f30761h;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f30763m;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.LinkedList f30762i = new java.util.LinkedList();

    /* renamed from: n, reason: collision with root package name */
    public final boolean[] f30764n = new boolean[8];

    static {
        new bw5.no();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.no parseFrom(byte[] bArr) {
        return (bw5.no) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.no)) {
            return false;
        }
        bw5.no noVar = (bw5.no) fVar;
        return n51.f.a(java.lang.Boolean.valueOf(this.f30757d), java.lang.Boolean.valueOf(noVar.f30757d)) && n51.f.a(java.lang.Long.valueOf(this.f30758e), java.lang.Long.valueOf(noVar.f30758e)) && n51.f.a(java.lang.Long.valueOf(this.f30759f), java.lang.Long.valueOf(noVar.f30759f)) && n51.f.a(this.f30760g, noVar.f30760g) && n51.f.a(this.f30761h, noVar.f30761h) && n51.f.a(this.f30762i, noVar.f30762i) && n51.f.a(this.f30763m, noVar.f30763m);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.no();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f30762i;
        boolean[] zArr = this.f30764n;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.a(1, this.f30757d);
            }
            if (zArr[2]) {
                fVar.h(2, this.f30758e);
            }
            if (zArr[3]) {
                fVar.h(3, this.f30759f);
            }
            java.lang.String str = this.f30760g;
            if (str != null && zArr[4]) {
                fVar.j(4, str);
            }
            java.lang.String str2 = this.f30761h;
            if (str2 != null && zArr[5]) {
                fVar.j(5, str2);
            }
            fVar.g(6, 8, linkedList);
            java.lang.String str3 = this.f30763m;
            if (str3 != null && zArr[7]) {
                fVar.j(7, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            int a17 = zArr[1] ? 0 + b36.f.a(1, this.f30757d) : 0;
            if (zArr[2]) {
                a17 += b36.f.h(2, this.f30758e);
            }
            if (zArr[3]) {
                a17 += b36.f.h(3, this.f30759f);
            }
            java.lang.String str4 = this.f30760g;
            if (str4 != null && zArr[4]) {
                a17 += b36.f.j(4, str4);
            }
            java.lang.String str5 = this.f30761h;
            if (str5 != null && zArr[5]) {
                a17 += b36.f.j(5, str5);
            }
            int g17 = a17 + b36.f.g(6, 8, linkedList);
            java.lang.String str6 = this.f30763m;
            return (str6 == null || !zArr[7]) ? g17 : g17 + b36.f.j(7, str6);
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
        switch (intValue) {
            case 1:
                this.f30757d = aVar2.c(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f30758e = aVar2.i(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f30759f = aVar2.i(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f30760g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f30761h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    bw5.u30 u30Var = new bw5.u30();
                    if (bArr != null && bArr.length > 0) {
                        u30Var.parseFrom(bArr);
                    }
                    linkedList.add(u30Var);
                }
                zArr[6] = true;
                return 0;
            case 7:
                this.f30763m = aVar2.k(intValue);
                zArr[7] = true;
                return 0;
            default:
                return -1;
        }
    }
}
