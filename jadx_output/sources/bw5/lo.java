package bw5;

/* loaded from: classes2.dex */
public class lo extends com.tencent.mm.protobuf.f {

    /* renamed from: e, reason: collision with root package name */
    public int f29875e;

    /* renamed from: f, reason: collision with root package name */
    public int f29876f;

    /* renamed from: g, reason: collision with root package name */
    public long f29877g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f29878h;

    /* renamed from: i, reason: collision with root package name */
    public int f29879i;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f29874d = new java.util.LinkedList();

    /* renamed from: m, reason: collision with root package name */
    public final boolean[] f29880m = new boolean[7];

    static {
        new bw5.lo();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.lo parseFrom(byte[] bArr) {
        return (bw5.lo) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.lo)) {
            return false;
        }
        bw5.lo loVar = (bw5.lo) fVar;
        return n51.f.a(this.f29874d, loVar.f29874d) && n51.f.a(java.lang.Integer.valueOf(this.f29875e), java.lang.Integer.valueOf(loVar.f29875e)) && n51.f.a(java.lang.Integer.valueOf(this.f29876f), java.lang.Integer.valueOf(loVar.f29876f)) && n51.f.a(java.lang.Long.valueOf(this.f29877g), java.lang.Long.valueOf(loVar.f29877g)) && n51.f.a(this.f29878h, loVar.f29878h) && n51.f.a(java.lang.Integer.valueOf(this.f29879i), java.lang.Integer.valueOf(loVar.f29879i));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.lo();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f29874d;
        boolean[] zArr = this.f29880m;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.g(1, 8, linkedList);
            if (zArr[2]) {
                fVar.e(2, this.f29875e);
            }
            if (zArr[3]) {
                fVar.e(3, this.f29876f);
            }
            if (zArr[4]) {
                fVar.h(4, this.f29877g);
            }
            java.lang.String str = this.f29878h;
            if (str != null && zArr[5]) {
                fVar.j(5, str);
            }
            if (zArr[6]) {
                fVar.e(6, this.f29879i);
            }
            return 0;
        }
        if (i17 == 1) {
            int g17 = b36.f.g(1, 8, linkedList) + 0;
            if (zArr[2]) {
                g17 += b36.f.e(2, this.f29875e);
            }
            if (zArr[3]) {
                g17 += b36.f.e(3, this.f29876f);
            }
            if (zArr[4]) {
                g17 += b36.f.h(4, this.f29877g);
            }
            java.lang.String str2 = this.f29878h;
            if (str2 != null && zArr[5]) {
                g17 += b36.f.j(5, str2);
            }
            return zArr[6] ? g17 + b36.f.e(6, this.f29879i) : g17;
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
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    bw5.e3 e3Var = new bw5.e3();
                    if (bArr != null && bArr.length > 0) {
                        e3Var.parseFrom(bArr);
                    }
                    linkedList.add(e3Var);
                }
                zArr[1] = true;
                return 0;
            case 2:
                this.f29875e = aVar2.g(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f29876f = aVar2.g(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f29877g = aVar2.i(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f29878h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f29879i = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            default:
                return -1;
        }
    }
}
