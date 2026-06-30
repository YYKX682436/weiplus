package bw5;

/* loaded from: classes2.dex */
public class b70 extends r45.js5 {

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f25553e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f25554f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f25555g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f25556h;

    /* renamed from: i, reason: collision with root package name */
    public bw5.m40 f25557i;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f25552d = new java.util.LinkedList();

    /* renamed from: m, reason: collision with root package name */
    public final boolean[] f25558m = new boolean[8];

    static {
        new bw5.b70();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.b70 parseFrom(byte[] bArr) {
        return (bw5.b70) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.b70)) {
            return false;
        }
        bw5.b70 b70Var = (bw5.b70) fVar;
        return n51.f.a(this.BaseResponse, b70Var.BaseResponse) && n51.f.a(this.f25552d, b70Var.f25552d) && n51.f.a(this.f25553e, b70Var.f25553e) && n51.f.a(java.lang.Boolean.valueOf(this.f25554f), java.lang.Boolean.valueOf(b70Var.f25554f)) && n51.f.a(java.lang.Boolean.valueOf(this.f25555g), java.lang.Boolean.valueOf(b70Var.f25555g)) && n51.f.a(this.f25556h, b70Var.f25556h) && n51.f.a(this.f25557i, b70Var.f25557i);
    }

    @Override // r45.js5, r45.ny3
    public r45.ie getBaseResponse() {
        return this.f25558m[1] ? this.BaseResponse : new r45.ie();
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.b70();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f25552d;
        int i18 = 0;
        boolean[] zArr = this.f25558m;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.BaseResponse;
            if (ieVar != null && zArr[1]) {
                fVar.i(1, ieVar.computeSize());
                this.BaseResponse.writeFields(fVar);
            }
            fVar.g(2, 8, linkedList);
            com.tencent.mm.protobuf.g gVar = this.f25553e;
            if (gVar != null && zArr[3]) {
                fVar.b(3, gVar);
            }
            if (zArr[4]) {
                fVar.a(4, this.f25554f);
            }
            if (zArr[5]) {
                fVar.a(5, this.f25555g);
            }
            java.lang.String str = this.f25556h;
            if (str != null && zArr[6]) {
                fVar.j(6, str);
            }
            bw5.m40 m40Var = this.f25557i;
            if (m40Var != null && zArr[7]) {
                fVar.i(7, m40Var.computeSize());
                this.f25557i.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            if (ieVar2 != null && zArr[1]) {
                i18 = 0 + b36.f.i(1, ieVar2.computeSize());
            }
            int g17 = i18 + b36.f.g(2, 8, linkedList);
            com.tencent.mm.protobuf.g gVar2 = this.f25553e;
            if (gVar2 != null && zArr[3]) {
                g17 += b36.f.b(3, gVar2);
            }
            if (zArr[4]) {
                g17 += b36.f.a(4, this.f25554f);
            }
            if (zArr[5]) {
                g17 += b36.f.a(5, this.f25555g);
            }
            java.lang.String str2 = this.f25556h;
            if (str2 != null && zArr[6]) {
                g17 += b36.f.j(6, str2);
            }
            bw5.m40 m40Var2 = this.f25557i;
            return (m40Var2 == null || !zArr[7]) ? g17 : g17 + b36.f.i(7, m40Var2.computeSize());
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
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    r45.ie ieVar3 = new r45.ie();
                    if (bArr != null && bArr.length > 0) {
                        ieVar3.parseFrom(bArr);
                    }
                    this.BaseResponse = ieVar3;
                }
                zArr[1] = true;
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    bw5.x40 x40Var = new bw5.x40();
                    if (bArr2 != null && bArr2.length > 0) {
                        x40Var.parseFrom(bArr2);
                    }
                    linkedList.add(x40Var);
                }
                zArr[2] = true;
                return 0;
            case 3:
                this.f25553e = aVar2.d(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f25554f = aVar2.c(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f25555g = aVar2.c(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f25556h = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    bw5.m40 m40Var3 = new bw5.m40();
                    if (bArr3 != null && bArr3.length > 0) {
                        m40Var3.parseFrom(bArr3);
                    }
                    this.f25557i = m40Var3;
                }
                zArr[7] = true;
                return 0;
            default:
                return -1;
        }
    }

    @Override // r45.js5, r45.ny3
    public r45.ny3 setBaseResponse(r45.ie ieVar) {
        this.BaseResponse = ieVar;
        this.f25558m[1] = true;
        return this;
    }
}
