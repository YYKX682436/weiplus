package bw5;

/* loaded from: classes2.dex */
public class g60 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f27700d;

    /* renamed from: f, reason: collision with root package name */
    public int f27702f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f27703g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f27704h;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f27701e = new java.util.LinkedList();

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f27705i = new boolean[6];

    static {
        new bw5.g60();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.g60 parseFrom(byte[] bArr) {
        return (bw5.g60) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.g60)) {
            return false;
        }
        bw5.g60 g60Var = (bw5.g60) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f27700d), java.lang.Integer.valueOf(g60Var.f27700d)) && n51.f.a(this.f27701e, g60Var.f27701e) && n51.f.a(java.lang.Integer.valueOf(this.f27702f), java.lang.Integer.valueOf(g60Var.f27702f)) && n51.f.a(this.f27703g, g60Var.f27703g) && n51.f.a(this.f27704h, g60Var.f27704h);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.g60();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f27701e;
        boolean[] zArr = this.f27705i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f27700d);
            }
            fVar.g(2, 1, linkedList);
            if (zArr[3]) {
                fVar.e(3, this.f27702f);
            }
            java.lang.String str = this.f27703g;
            if (str != null && zArr[4]) {
                fVar.j(4, str);
            }
            java.lang.String str2 = this.f27704h;
            if (str2 != null && zArr[5]) {
                fVar.j(5, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = (zArr[1] ? 0 + b36.f.e(1, this.f27700d) : 0) + b36.f.g(2, 1, linkedList);
            if (zArr[3]) {
                e17 += b36.f.e(3, this.f27702f);
            }
            java.lang.String str3 = this.f27703g;
            if (str3 != null && zArr[4]) {
                e17 += b36.f.j(4, str3);
            }
            java.lang.String str4 = this.f27704h;
            return (str4 == null || !zArr[5]) ? e17 : e17 + b36.f.j(5, str4);
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
            this.f27700d = aVar2.g(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            linkedList.add(aVar2.k(intValue));
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f27702f = aVar2.g(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue == 4) {
            this.f27703g = aVar2.k(intValue);
            zArr[4] = true;
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        this.f27704h = aVar2.k(intValue);
        zArr[5] = true;
        return 0;
    }
}
