package bw5;

/* loaded from: classes2.dex */
public class wq extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f34823d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f34824e;

    /* renamed from: f, reason: collision with root package name */
    public int f34825f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f34826g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f34827h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f34828i = new boolean[6];

    static {
        new bw5.wq();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.wq parseFrom(byte[] bArr) {
        return (bw5.wq) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.wq)) {
            return false;
        }
        bw5.wq wqVar = (bw5.wq) fVar;
        return n51.f.a(this.f34823d, wqVar.f34823d) && n51.f.a(this.f34824e, wqVar.f34824e) && n51.f.a(java.lang.Integer.valueOf(this.f34825f), java.lang.Integer.valueOf(wqVar.f34825f)) && n51.f.a(this.f34826g, wqVar.f34826g) && n51.f.a(this.f34827h, wqVar.f34827h);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.wq();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f34828i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f34823d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f34824e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            if (zArr[3]) {
                fVar.e(3, this.f34825f);
            }
            java.lang.String str3 = this.f34826g;
            if (str3 != null && zArr[4]) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f34827h;
            if (str4 != null && zArr[5]) {
                fVar.j(5, str4);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f34823d;
            if (str5 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str5);
            }
            java.lang.String str6 = this.f34824e;
            if (str6 != null && zArr[2]) {
                i18 += b36.f.j(2, str6);
            }
            if (zArr[3]) {
                i18 += b36.f.e(3, this.f34825f);
            }
            java.lang.String str7 = this.f34826g;
            if (str7 != null && zArr[4]) {
                i18 += b36.f.j(4, str7);
            }
            java.lang.String str8 = this.f34827h;
            return (str8 == null || !zArr[5]) ? i18 : i18 + b36.f.j(5, str8);
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
            this.f34823d = aVar2.k(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f34824e = aVar2.k(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f34825f = aVar2.g(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue == 4) {
            this.f34826g = aVar2.k(intValue);
            zArr[4] = true;
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        this.f34827h = aVar2.k(intValue);
        zArr[5] = true;
        return 0;
    }
}
