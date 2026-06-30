package bw5;

/* loaded from: classes4.dex */
public class h6 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f28086d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f28087e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f28088f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f28089g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f28090h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f28091i;

    /* renamed from: m, reason: collision with root package name */
    public final boolean[] f28092m = new boolean[7];

    static {
        new bw5.h6();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.h6 parseFrom(byte[] bArr) {
        return (bw5.h6) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.h6)) {
            return false;
        }
        bw5.h6 h6Var = (bw5.h6) fVar;
        return n51.f.a(this.f28086d, h6Var.f28086d) && n51.f.a(this.f28087e, h6Var.f28087e) && n51.f.a(this.f28088f, h6Var.f28088f) && n51.f.a(this.f28089g, h6Var.f28089g) && n51.f.a(this.f28090h, h6Var.f28090h) && n51.f.a(this.f28091i, h6Var.f28091i);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.h6();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f28092m;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f28086d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f28087e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f28088f;
            if (str3 != null && zArr[3]) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f28089g;
            if (str4 != null && zArr[4]) {
                fVar.j(4, str4);
            }
            java.lang.String str5 = this.f28090h;
            if (str5 != null && zArr[5]) {
                fVar.j(5, str5);
            }
            java.lang.String str6 = this.f28091i;
            if (str6 != null && zArr[6]) {
                fVar.j(6, str6);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str7 = this.f28086d;
            if (str7 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str7);
            }
            java.lang.String str8 = this.f28087e;
            if (str8 != null && zArr[2]) {
                i18 += b36.f.j(2, str8);
            }
            java.lang.String str9 = this.f28088f;
            if (str9 != null && zArr[3]) {
                i18 += b36.f.j(3, str9);
            }
            java.lang.String str10 = this.f28089g;
            if (str10 != null && zArr[4]) {
                i18 += b36.f.j(4, str10);
            }
            java.lang.String str11 = this.f28090h;
            if (str11 != null && zArr[5]) {
                i18 += b36.f.j(5, str11);
            }
            java.lang.String str12 = this.f28091i;
            return (str12 == null || !zArr[6]) ? i18 : i18 + b36.f.j(6, str12);
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
                this.f28086d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f28087e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f28088f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f28089g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f28090h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f28091i = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            default:
                return -1;
        }
    }
}
