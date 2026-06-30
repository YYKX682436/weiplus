package bw5;

/* loaded from: classes2.dex */
public class zy extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public long f36201d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f36202e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f36203f;

    /* renamed from: g, reason: collision with root package name */
    public int f36204g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f36205h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f36206i;

    /* renamed from: m, reason: collision with root package name */
    public int f36207m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean[] f36208n = new boolean[8];

    static {
        new bw5.zy();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.zy parseFrom(byte[] bArr) {
        return (bw5.zy) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.zy)) {
            return false;
        }
        bw5.zy zyVar = (bw5.zy) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f36201d), java.lang.Long.valueOf(zyVar.f36201d)) && n51.f.a(this.f36202e, zyVar.f36202e) && n51.f.a(this.f36203f, zyVar.f36203f) && n51.f.a(java.lang.Integer.valueOf(this.f36204g), java.lang.Integer.valueOf(zyVar.f36204g)) && n51.f.a(this.f36205h, zyVar.f36205h) && n51.f.a(this.f36206i, zyVar.f36206i) && n51.f.a(java.lang.Integer.valueOf(this.f36207m), java.lang.Integer.valueOf(zyVar.f36207m));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.zy();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f36208n;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.h(1, this.f36201d);
            }
            java.lang.String str = this.f36202e;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f36203f;
            if (str2 != null && zArr[3]) {
                fVar.j(3, str2);
            }
            if (zArr[4]) {
                fVar.e(4, this.f36204g);
            }
            java.lang.String str3 = this.f36205h;
            if (str3 != null && zArr[5]) {
                fVar.j(5, str3);
            }
            java.lang.String str4 = this.f36206i;
            if (str4 != null && zArr[6]) {
                fVar.j(6, str4);
            }
            if (zArr[7]) {
                fVar.e(7, this.f36207m);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = zArr[1] ? 0 + b36.f.h(1, this.f36201d) : 0;
            java.lang.String str5 = this.f36202e;
            if (str5 != null && zArr[2]) {
                h17 += b36.f.j(2, str5);
            }
            java.lang.String str6 = this.f36203f;
            if (str6 != null && zArr[3]) {
                h17 += b36.f.j(3, str6);
            }
            if (zArr[4]) {
                h17 += b36.f.e(4, this.f36204g);
            }
            java.lang.String str7 = this.f36205h;
            if (str7 != null && zArr[5]) {
                h17 += b36.f.j(5, str7);
            }
            java.lang.String str8 = this.f36206i;
            if (str8 != null && zArr[6]) {
                h17 += b36.f.j(6, str8);
            }
            return zArr[7] ? h17 + b36.f.e(7, this.f36207m) : h17;
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
                this.f36201d = aVar2.i(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f36202e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f36203f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f36204g = aVar2.g(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f36205h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f36206i = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f36207m = aVar2.g(intValue);
                zArr[7] = true;
                return 0;
            default:
                return -1;
        }
    }
}
