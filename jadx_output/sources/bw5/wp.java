package bw5;

/* loaded from: classes2.dex */
public class wp extends r45.js5 {

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f34809f;

    /* renamed from: g, reason: collision with root package name */
    public int f34810g;

    /* renamed from: h, reason: collision with root package name */
    public int f34811h;

    /* renamed from: i, reason: collision with root package name */
    public bw5.mu f34812i;

    /* renamed from: m, reason: collision with root package name */
    public bw5.ju f34813m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f34814n;

    /* renamed from: o, reason: collision with root package name */
    public bw5.yp f34815o;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f34807d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f34808e = new java.util.LinkedList();

    /* renamed from: p, reason: collision with root package name */
    public final boolean[] f34816p = new boolean[11];

    static {
        new bw5.wp();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.wp)) {
            return false;
        }
        bw5.wp wpVar = (bw5.wp) fVar;
        return n51.f.a(this.BaseResponse, wpVar.BaseResponse) && n51.f.a(this.f34807d, wpVar.f34807d) && n51.f.a(this.f34808e, wpVar.f34808e) && n51.f.a(this.f34809f, wpVar.f34809f) && n51.f.a(java.lang.Integer.valueOf(this.f34810g), java.lang.Integer.valueOf(wpVar.f34810g)) && n51.f.a(java.lang.Integer.valueOf(this.f34811h), java.lang.Integer.valueOf(wpVar.f34811h)) && n51.f.a(this.f34812i, wpVar.f34812i) && n51.f.a(this.f34813m, wpVar.f34813m) && n51.f.a(this.f34814n, wpVar.f34814n) && n51.f.a(this.f34815o, wpVar.f34815o);
    }

    @Override // r45.js5, r45.ny3
    public r45.ie getBaseResponse() {
        return this.f34816p[1] ? this.BaseResponse : new r45.ie();
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.wp();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f34808e;
        java.util.LinkedList linkedList2 = this.f34807d;
        boolean[] zArr = this.f34816p;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.BaseResponse;
            if (ieVar != null && zArr[1]) {
                fVar.i(1, ieVar.computeSize());
                this.BaseResponse.writeFields(fVar);
            }
            fVar.g(2, 8, linkedList2);
            fVar.g(3, 8, linkedList);
            com.tencent.mm.protobuf.g gVar = this.f34809f;
            if (gVar != null && zArr[4]) {
                fVar.b(4, gVar);
            }
            if (zArr[5]) {
                fVar.e(5, this.f34810g);
            }
            if (zArr[6]) {
                fVar.e(6, this.f34811h);
            }
            bw5.mu muVar = this.f34812i;
            if (muVar != null && zArr[7]) {
                fVar.i(7, muVar.computeSize());
                this.f34812i.writeFields(fVar);
            }
            bw5.ju juVar = this.f34813m;
            if (juVar != null && zArr[8]) {
                fVar.i(8, juVar.computeSize());
                this.f34813m.writeFields(fVar);
            }
            com.tencent.mm.protobuf.g gVar2 = this.f34814n;
            if (gVar2 != null && zArr[9]) {
                fVar.b(9, gVar2);
            }
            bw5.yp ypVar = this.f34815o;
            if (ypVar == null || !zArr[10]) {
                return 0;
            }
            fVar.i(10, ypVar.computeSize());
            this.f34815o.writeFields(fVar);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = ((ieVar2 == null || !zArr[1]) ? 0 : 0 + b36.f.i(1, ieVar2.computeSize())) + b36.f.g(2, 8, linkedList2) + b36.f.g(3, 8, linkedList);
            com.tencent.mm.protobuf.g gVar3 = this.f34809f;
            if (gVar3 != null && zArr[4]) {
                i18 += b36.f.b(4, gVar3);
            }
            if (zArr[5]) {
                i18 += b36.f.e(5, this.f34810g);
            }
            if (zArr[6]) {
                i18 += b36.f.e(6, this.f34811h);
            }
            bw5.mu muVar2 = this.f34812i;
            if (muVar2 != null && zArr[7]) {
                i18 += b36.f.i(7, muVar2.computeSize());
            }
            bw5.ju juVar2 = this.f34813m;
            if (juVar2 != null && zArr[8]) {
                i18 += b36.f.i(8, juVar2.computeSize());
            }
            com.tencent.mm.protobuf.g gVar4 = this.f34814n;
            if (gVar4 != null && zArr[9]) {
                i18 += b36.f.b(9, gVar4);
            }
            bw5.yp ypVar2 = this.f34815o;
            return (ypVar2 == null || !zArr[10]) ? i18 : i18 + b36.f.i(10, ypVar2.computeSize());
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
                    bw5.xp xpVar = new bw5.xp();
                    if (bArr2 != null && bArr2.length > 0) {
                        xpVar.parseFrom(bArr2);
                    }
                    linkedList2.add(xpVar);
                }
                zArr[2] = true;
                return 0;
            case 3:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    bw5.xp xpVar2 = new bw5.xp();
                    if (bArr3 != null && bArr3.length > 0) {
                        xpVar2.parseFrom(bArr3);
                    }
                    linkedList.add(xpVar2);
                }
                zArr[3] = true;
                return 0;
            case 4:
                this.f34809f = aVar2.d(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f34810g = aVar2.g(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f34811h = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr4 = (byte[]) j27.get(i29);
                    bw5.mu muVar3 = new bw5.mu();
                    if (bArr4 != null && bArr4.length > 0) {
                        muVar3.parseFrom(bArr4);
                    }
                    this.f34812i = muVar3;
                }
                zArr[7] = true;
                return 0;
            case 8:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr5 = (byte[]) j28.get(i37);
                    bw5.ju juVar3 = new bw5.ju();
                    if (bArr5 != null && bArr5.length > 0) {
                        juVar3.parseFrom(bArr5);
                    }
                    this.f34813m = juVar3;
                }
                zArr[8] = true;
                return 0;
            case 9:
                this.f34814n = aVar2.d(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i38 = 0; i38 < size6; i38++) {
                    byte[] bArr6 = (byte[]) j29.get(i38);
                    bw5.yp ypVar3 = new bw5.yp();
                    if (bArr6 != null && bArr6.length > 0) {
                        ypVar3.parseFrom(bArr6);
                    }
                    this.f34815o = ypVar3;
                }
                zArr[10] = true;
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (bw5.wp) super.parseFrom(bArr);
    }

    @Override // r45.js5, r45.ny3
    public r45.ny3 setBaseResponse(r45.ie ieVar) {
        this.BaseResponse = ieVar;
        this.f34816p[1] = true;
        return this;
    }
}
