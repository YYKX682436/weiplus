package bw5;

/* loaded from: classes2.dex */
public class i1 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f28423d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f28424e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f28425f;

    /* renamed from: g, reason: collision with root package name */
    public long f28426g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f28427h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f28428i = new boolean[6];

    static {
        new bw5.i1();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.i1 parseFrom(byte[] bArr) {
        return (bw5.i1) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.i1)) {
            return false;
        }
        bw5.i1 i1Var = (bw5.i1) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f28423d), java.lang.Integer.valueOf(i1Var.f28423d)) && n51.f.a(this.f28424e, i1Var.f28424e) && n51.f.a(this.f28425f, i1Var.f28425f) && n51.f.a(java.lang.Long.valueOf(this.f28426g), java.lang.Long.valueOf(i1Var.f28426g)) && n51.f.a(this.f28427h, i1Var.f28427h);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.i1();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f28428i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f28423d);
            }
            java.lang.String str = this.f28424e;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f28425f;
            if (str2 != null && zArr[3]) {
                fVar.j(3, str2);
            }
            if (zArr[4]) {
                fVar.h(4, this.f28426g);
            }
            java.lang.String str3 = this.f28427h;
            if (str3 != null && zArr[5]) {
                fVar.j(5, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f28423d) : 0;
            java.lang.String str4 = this.f28424e;
            if (str4 != null && zArr[2]) {
                e17 += b36.f.j(2, str4);
            }
            java.lang.String str5 = this.f28425f;
            if (str5 != null && zArr[3]) {
                e17 += b36.f.j(3, str5);
            }
            if (zArr[4]) {
                e17 += b36.f.h(4, this.f28426g);
            }
            java.lang.String str6 = this.f28427h;
            return (str6 == null || !zArr[5]) ? e17 : e17 + b36.f.j(5, str6);
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
            this.f28423d = aVar2.g(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f28424e = aVar2.k(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f28425f = aVar2.k(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue == 4) {
            this.f28426g = aVar2.i(intValue);
            zArr[4] = true;
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        this.f28427h = aVar2.k(intValue);
        zArr[5] = true;
        return 0;
    }
}
