package bw5;

/* loaded from: classes2.dex */
public class o extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f30855d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f30856e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f30857f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f30858g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f30859h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f30860i = new boolean[6];

    static {
        new bw5.o();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.o parseFrom(byte[] bArr) {
        return (bw5.o) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.o)) {
            return false;
        }
        bw5.o oVar = (bw5.o) fVar;
        return n51.f.a(this.f30855d, oVar.f30855d) && n51.f.a(this.f30856e, oVar.f30856e) && n51.f.a(this.f30857f, oVar.f30857f) && n51.f.a(this.f30858g, oVar.f30858g) && n51.f.a(this.f30859h, oVar.f30859h);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.o();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f30860i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f30855d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f30856e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f30857f;
            if (str3 != null && zArr[3]) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f30858g;
            if (str4 != null && zArr[4]) {
                fVar.j(4, str4);
            }
            java.lang.String str5 = this.f30859h;
            if (str5 != null && zArr[5]) {
                fVar.j(5, str5);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str6 = this.f30855d;
            if (str6 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str6);
            }
            java.lang.String str7 = this.f30856e;
            if (str7 != null && zArr[2]) {
                i18 += b36.f.j(2, str7);
            }
            java.lang.String str8 = this.f30857f;
            if (str8 != null && zArr[3]) {
                i18 += b36.f.j(3, str8);
            }
            java.lang.String str9 = this.f30858g;
            if (str9 != null && zArr[4]) {
                i18 += b36.f.j(4, str9);
            }
            java.lang.String str10 = this.f30859h;
            return (str10 == null || !zArr[5]) ? i18 : i18 + b36.f.j(5, str10);
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
            this.f30855d = aVar2.k(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f30856e = aVar2.k(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f30857f = aVar2.k(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue == 4) {
            this.f30858g = aVar2.k(intValue);
            zArr[4] = true;
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        this.f30859h = aVar2.k(intValue);
        zArr[5] = true;
        return 0;
    }
}
