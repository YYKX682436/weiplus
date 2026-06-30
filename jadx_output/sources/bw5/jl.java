package bw5;

/* loaded from: classes2.dex */
public class jl extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f29007d;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f29010g;

    /* renamed from: h, reason: collision with root package name */
    public int f29011h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f29012i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f29013m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f29014n;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f29008e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f29009f = new java.util.LinkedList();

    /* renamed from: o, reason: collision with root package name */
    public final boolean[] f29015o = new boolean[9];

    static {
        new bw5.jl();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.jl parseFrom(byte[] bArr) {
        return (bw5.jl) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.jl)) {
            return false;
        }
        bw5.jl jlVar = (bw5.jl) fVar;
        return n51.f.a(this.f29007d, jlVar.f29007d) && n51.f.a(this.f29008e, jlVar.f29008e) && n51.f.a(this.f29009f, jlVar.f29009f) && n51.f.a(this.f29010g, jlVar.f29010g) && n51.f.a(java.lang.Integer.valueOf(this.f29011h), java.lang.Integer.valueOf(jlVar.f29011h)) && n51.f.a(java.lang.Boolean.valueOf(this.f29012i), java.lang.Boolean.valueOf(jlVar.f29012i)) && n51.f.a(this.f29013m, jlVar.f29013m) && n51.f.a(this.f29014n, jlVar.f29014n);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.jl();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f29009f;
        java.util.LinkedList linkedList2 = this.f29008e;
        int i18 = 0;
        boolean[] zArr = this.f29015o;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f29007d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            fVar.g(2, 1, linkedList2);
            fVar.g(3, 1, linkedList);
            java.lang.String str2 = this.f29010g;
            if (str2 != null && zArr[4]) {
                fVar.j(4, str2);
            }
            if (zArr[5]) {
                fVar.e(5, this.f29011h);
            }
            if (zArr[6]) {
                fVar.a(6, this.f29012i);
            }
            java.lang.String str3 = this.f29013m;
            if (str3 != null && zArr[7]) {
                fVar.j(7, str3);
            }
            java.lang.String str4 = this.f29014n;
            if (str4 != null && zArr[8]) {
                fVar.j(8, str4);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f29007d;
            if (str5 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str5);
            }
            int g17 = i18 + b36.f.g(2, 1, linkedList2) + b36.f.g(3, 1, linkedList);
            java.lang.String str6 = this.f29010g;
            if (str6 != null && zArr[4]) {
                g17 += b36.f.j(4, str6);
            }
            if (zArr[5]) {
                g17 += b36.f.e(5, this.f29011h);
            }
            if (zArr[6]) {
                g17 += b36.f.a(6, this.f29012i);
            }
            java.lang.String str7 = this.f29013m;
            if (str7 != null && zArr[7]) {
                g17 += b36.f.j(7, str7);
            }
            java.lang.String str8 = this.f29014n;
            return (str8 == null || !zArr[8]) ? g17 : g17 + b36.f.j(8, str8);
        }
        if (i17 == 2) {
            linkedList2.clear();
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
                this.f29007d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                linkedList2.add(aVar2.k(intValue));
                zArr[2] = true;
                return 0;
            case 3:
                linkedList.add(aVar2.k(intValue));
                zArr[3] = true;
                return 0;
            case 4:
                this.f29010g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f29011h = aVar2.g(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f29012i = aVar2.c(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f29013m = aVar2.k(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f29014n = aVar2.k(intValue);
                zArr[8] = true;
                return 0;
            default:
                return -1;
        }
    }
}
