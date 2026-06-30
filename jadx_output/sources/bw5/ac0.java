package bw5;

/* loaded from: classes2.dex */
public class ac0 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public bw5.xb0 f25126d;

    /* renamed from: e, reason: collision with root package name */
    public int f25127e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f25128f;

    /* renamed from: g, reason: collision with root package name */
    public bw5.xb0 f25129g;

    /* renamed from: h, reason: collision with root package name */
    public bw5.xb0 f25130h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f25131i;

    /* renamed from: n, reason: collision with root package name */
    public bw5.xb0 f25133n;

    /* renamed from: o, reason: collision with root package name */
    public bw5.xb0 f25134o;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.LinkedList f25132m = new java.util.LinkedList();

    /* renamed from: p, reason: collision with root package name */
    public final boolean[] f25135p = new boolean[11];

    static {
        new bw5.ac0();
    }

    public bw5.xb0 b() {
        return this.f25135p[2] ? this.f25126d : new bw5.xb0();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.ac0)) {
            return false;
        }
        bw5.ac0 ac0Var = (bw5.ac0) fVar;
        return n51.f.a(this.BaseResponse, ac0Var.BaseResponse) && n51.f.a(this.f25126d, ac0Var.f25126d) && n51.f.a(java.lang.Integer.valueOf(this.f25127e), java.lang.Integer.valueOf(ac0Var.f25127e)) && n51.f.a(this.f25128f, ac0Var.f25128f) && n51.f.a(this.f25129g, ac0Var.f25129g) && n51.f.a(this.f25130h, ac0Var.f25130h) && n51.f.a(this.f25131i, ac0Var.f25131i) && n51.f.a(this.f25132m, ac0Var.f25132m) && n51.f.a(this.f25133n, ac0Var.f25133n) && n51.f.a(this.f25134o, ac0Var.f25134o);
    }

    @Override // r45.js5, r45.ny3
    public r45.ie getBaseResponse() {
        return this.f25135p[1] ? this.BaseResponse : new r45.ie();
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.ac0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f25132m;
        int i18 = 0;
        boolean[] zArr = this.f25135p;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.BaseResponse;
            if (ieVar != null && zArr[1]) {
                fVar.i(1, ieVar.computeSize());
                this.BaseResponse.writeFields(fVar);
            }
            bw5.xb0 xb0Var = this.f25126d;
            if (xb0Var != null && zArr[2]) {
                fVar.i(2, xb0Var.computeSize());
                this.f25126d.writeFields(fVar);
            }
            if (zArr[3]) {
                fVar.e(3, this.f25127e);
            }
            com.tencent.mm.protobuf.g gVar = this.f25128f;
            if (gVar != null && zArr[4]) {
                fVar.b(4, gVar);
            }
            bw5.xb0 xb0Var2 = this.f25129g;
            if (xb0Var2 != null && zArr[5]) {
                fVar.i(5, xb0Var2.computeSize());
                this.f25129g.writeFields(fVar);
            }
            bw5.xb0 xb0Var3 = this.f25130h;
            if (xb0Var3 != null && zArr[6]) {
                fVar.i(6, xb0Var3.computeSize());
                this.f25130h.writeFields(fVar);
            }
            com.tencent.mm.protobuf.g gVar2 = this.f25131i;
            if (gVar2 != null && zArr[7]) {
                fVar.b(7, gVar2);
            }
            fVar.g(8, 8, linkedList);
            bw5.xb0 xb0Var4 = this.f25133n;
            if (xb0Var4 != null && zArr[9]) {
                fVar.i(9, xb0Var4.computeSize());
                this.f25133n.writeFields(fVar);
            }
            bw5.xb0 xb0Var5 = this.f25134o;
            if (xb0Var5 != null && zArr[10]) {
                fVar.i(10, xb0Var5.computeSize());
                this.f25134o.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            if (ieVar2 != null && zArr[1]) {
                i18 = 0 + b36.f.i(1, ieVar2.computeSize());
            }
            bw5.xb0 xb0Var6 = this.f25126d;
            if (xb0Var6 != null && zArr[2]) {
                i18 += b36.f.i(2, xb0Var6.computeSize());
            }
            if (zArr[3]) {
                i18 += b36.f.e(3, this.f25127e);
            }
            com.tencent.mm.protobuf.g gVar3 = this.f25128f;
            if (gVar3 != null && zArr[4]) {
                i18 += b36.f.b(4, gVar3);
            }
            bw5.xb0 xb0Var7 = this.f25129g;
            if (xb0Var7 != null && zArr[5]) {
                i18 += b36.f.i(5, xb0Var7.computeSize());
            }
            bw5.xb0 xb0Var8 = this.f25130h;
            if (xb0Var8 != null && zArr[6]) {
                i18 += b36.f.i(6, xb0Var8.computeSize());
            }
            com.tencent.mm.protobuf.g gVar4 = this.f25131i;
            if (gVar4 != null && zArr[7]) {
                i18 += b36.f.b(7, gVar4);
            }
            int g17 = i18 + b36.f.g(8, 8, linkedList);
            bw5.xb0 xb0Var9 = this.f25133n;
            if (xb0Var9 != null && zArr[9]) {
                g17 += b36.f.i(9, xb0Var9.computeSize());
            }
            bw5.xb0 xb0Var10 = this.f25134o;
            return (xb0Var10 == null || !zArr[10]) ? g17 : g17 + b36.f.i(10, xb0Var10.computeSize());
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
                    bw5.xb0 xb0Var11 = new bw5.xb0();
                    if (bArr2 != null && bArr2.length > 0) {
                        xb0Var11.parseFrom(bArr2);
                    }
                    this.f25126d = xb0Var11;
                }
                zArr[2] = true;
                return 0;
            case 3:
                this.f25127e = aVar2.g(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f25128f = aVar2.d(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    bw5.xb0 xb0Var12 = new bw5.xb0();
                    if (bArr3 != null && bArr3.length > 0) {
                        xb0Var12.parseFrom(bArr3);
                    }
                    this.f25129g = xb0Var12;
                }
                zArr[5] = true;
                return 0;
            case 6:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr4 = (byte[]) j27.get(i29);
                    bw5.xb0 xb0Var13 = new bw5.xb0();
                    if (bArr4 != null && bArr4.length > 0) {
                        xb0Var13.parseFrom(bArr4);
                    }
                    this.f25130h = xb0Var13;
                }
                zArr[6] = true;
                return 0;
            case 7:
                this.f25131i = aVar2.d(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr5 = (byte[]) j28.get(i37);
                    bw5.wb0 wb0Var = new bw5.wb0();
                    if (bArr5 != null && bArr5.length > 0) {
                        wb0Var.parseFrom(bArr5);
                    }
                    linkedList.add(wb0Var);
                }
                zArr[8] = true;
                return 0;
            case 9:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i38 = 0; i38 < size6; i38++) {
                    byte[] bArr6 = (byte[]) j29.get(i38);
                    bw5.xb0 xb0Var14 = new bw5.xb0();
                    if (bArr6 != null && bArr6.length > 0) {
                        xb0Var14.parseFrom(bArr6);
                    }
                    this.f25133n = xb0Var14;
                }
                zArr[9] = true;
                return 0;
            case 10:
                java.util.LinkedList j37 = aVar2.j(intValue);
                int size7 = j37.size();
                for (int i39 = 0; i39 < size7; i39++) {
                    byte[] bArr7 = (byte[]) j37.get(i39);
                    bw5.xb0 xb0Var15 = new bw5.xb0();
                    if (bArr7 != null && bArr7.length > 0) {
                        xb0Var15.parseFrom(bArr7);
                    }
                    this.f25134o = xb0Var15;
                }
                zArr[10] = true;
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (bw5.ac0) super.parseFrom(bArr);
    }

    @Override // r45.js5, r45.ny3
    public r45.ny3 setBaseResponse(r45.ie ieVar) {
        this.BaseResponse = ieVar;
        this.f25135p[1] = true;
        return this;
    }
}
