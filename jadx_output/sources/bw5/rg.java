package bw5;

/* loaded from: classes2.dex */
public class rg extends r45.js5 {

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f32511e;

    /* renamed from: f, reason: collision with root package name */
    public int f32512f;

    /* renamed from: g, reason: collision with root package name */
    public long f32513g;

    /* renamed from: h, reason: collision with root package name */
    public bw5.dz f32514h;

    /* renamed from: i, reason: collision with root package name */
    public int f32515i;

    /* renamed from: m, reason: collision with root package name */
    public bw5.ri0 f32516m;

    /* renamed from: n, reason: collision with root package name */
    public bw5.fh0 f32517n;

    /* renamed from: o, reason: collision with root package name */
    public bw5.mu f32518o;

    /* renamed from: p, reason: collision with root package name */
    public int f32519p;

    /* renamed from: q, reason: collision with root package name */
    public int f32520q;

    /* renamed from: r, reason: collision with root package name */
    public int f32521r;

    /* renamed from: s, reason: collision with root package name */
    public bw5.zt f32522s;

    /* renamed from: t, reason: collision with root package name */
    public bw5.kd f32523t;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f32510d = new java.util.LinkedList();

    /* renamed from: u, reason: collision with root package name */
    public final boolean[] f32524u = new boolean[16];

    static {
        new bw5.rg();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.rg parseFrom(byte[] bArr) {
        return (bw5.rg) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.rg)) {
            return false;
        }
        bw5.rg rgVar = (bw5.rg) fVar;
        return n51.f.a(this.BaseResponse, rgVar.BaseResponse) && n51.f.a(this.f32510d, rgVar.f32510d) && n51.f.a(this.f32511e, rgVar.f32511e) && n51.f.a(java.lang.Integer.valueOf(this.f32512f), java.lang.Integer.valueOf(rgVar.f32512f)) && n51.f.a(java.lang.Long.valueOf(this.f32513g), java.lang.Long.valueOf(rgVar.f32513g)) && n51.f.a(this.f32514h, rgVar.f32514h) && n51.f.a(java.lang.Integer.valueOf(this.f32515i), java.lang.Integer.valueOf(rgVar.f32515i)) && n51.f.a(this.f32516m, rgVar.f32516m) && n51.f.a(this.f32517n, rgVar.f32517n) && n51.f.a(this.f32518o, rgVar.f32518o) && n51.f.a(java.lang.Integer.valueOf(this.f32519p), java.lang.Integer.valueOf(rgVar.f32519p)) && n51.f.a(java.lang.Integer.valueOf(this.f32520q), java.lang.Integer.valueOf(rgVar.f32520q)) && n51.f.a(java.lang.Integer.valueOf(this.f32521r), java.lang.Integer.valueOf(rgVar.f32521r)) && n51.f.a(this.f32522s, rgVar.f32522s) && n51.f.a(this.f32523t, rgVar.f32523t);
    }

    @Override // r45.js5, r45.ny3
    public r45.ie getBaseResponse() {
        return this.f32524u[1] ? this.BaseResponse : new r45.ie();
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.rg();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f32510d;
        int i18 = 0;
        boolean[] zArr = this.f32524u;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.BaseResponse;
            if (ieVar != null && zArr[1]) {
                fVar.i(1, ieVar.computeSize());
                this.BaseResponse.writeFields(fVar);
            }
            fVar.g(2, 8, linkedList);
            com.tencent.mm.protobuf.g gVar = this.f32511e;
            if (gVar != null && zArr[3]) {
                fVar.b(3, gVar);
            }
            if (zArr[4]) {
                fVar.e(4, this.f32512f);
            }
            if (zArr[5]) {
                fVar.h(5, this.f32513g);
            }
            bw5.dz dzVar = this.f32514h;
            if (dzVar != null && zArr[6]) {
                fVar.i(6, dzVar.computeSize());
                this.f32514h.writeFields(fVar);
            }
            if (zArr[7]) {
                fVar.e(7, this.f32515i);
            }
            bw5.ri0 ri0Var = this.f32516m;
            if (ri0Var != null && zArr[8]) {
                fVar.i(8, ri0Var.computeSize());
                this.f32516m.writeFields(fVar);
            }
            bw5.fh0 fh0Var = this.f32517n;
            if (fh0Var != null && zArr[9]) {
                fVar.i(9, fh0Var.computeSize());
                this.f32517n.writeFields(fVar);
            }
            bw5.mu muVar = this.f32518o;
            if (muVar != null && zArr[10]) {
                fVar.i(10, muVar.computeSize());
                this.f32518o.writeFields(fVar);
            }
            if (zArr[11]) {
                fVar.e(11, this.f32519p);
            }
            if (zArr[12]) {
                fVar.e(12, this.f32520q);
            }
            if (zArr[13]) {
                fVar.e(13, this.f32521r);
            }
            bw5.zt ztVar = this.f32522s;
            if (ztVar != null && zArr[14]) {
                fVar.i(14, ztVar.computeSize());
                this.f32522s.writeFields(fVar);
            }
            bw5.kd kdVar = this.f32523t;
            if (kdVar != null && zArr[15]) {
                fVar.i(15, kdVar.computeSize());
                this.f32523t.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            if (ieVar2 != null && zArr[1]) {
                i18 = b36.f.i(1, ieVar2.computeSize()) + 0;
            }
            int g17 = i18 + b36.f.g(2, 8, linkedList);
            com.tencent.mm.protobuf.g gVar2 = this.f32511e;
            if (gVar2 != null && zArr[3]) {
                g17 += b36.f.b(3, gVar2);
            }
            if (zArr[4]) {
                g17 += b36.f.e(4, this.f32512f);
            }
            if (zArr[5]) {
                g17 += b36.f.h(5, this.f32513g);
            }
            bw5.dz dzVar2 = this.f32514h;
            if (dzVar2 != null && zArr[6]) {
                g17 += b36.f.i(6, dzVar2.computeSize());
            }
            if (zArr[7]) {
                g17 += b36.f.e(7, this.f32515i);
            }
            bw5.ri0 ri0Var2 = this.f32516m;
            if (ri0Var2 != null && zArr[8]) {
                g17 += b36.f.i(8, ri0Var2.computeSize());
            }
            bw5.fh0 fh0Var2 = this.f32517n;
            if (fh0Var2 != null && zArr[9]) {
                g17 += b36.f.i(9, fh0Var2.computeSize());
            }
            bw5.mu muVar2 = this.f32518o;
            if (muVar2 != null && zArr[10]) {
                g17 += b36.f.i(10, muVar2.computeSize());
            }
            if (zArr[11]) {
                g17 += b36.f.e(11, this.f32519p);
            }
            if (zArr[12]) {
                g17 += b36.f.e(12, this.f32520q);
            }
            if (zArr[13]) {
                g17 += b36.f.e(13, this.f32521r);
            }
            bw5.zt ztVar2 = this.f32522s;
            if (ztVar2 != null && zArr[14]) {
                g17 += b36.f.i(14, ztVar2.computeSize());
            }
            bw5.kd kdVar2 = this.f32523t;
            return (kdVar2 == null || !zArr[15]) ? g17 : g17 + b36.f.i(15, kdVar2.computeSize());
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
                    bw5.yr yrVar = new bw5.yr();
                    if (bArr2 != null && bArr2.length > 0) {
                        yrVar.parseFrom(bArr2);
                    }
                    linkedList.add(yrVar);
                }
                zArr[2] = true;
                return 0;
            case 3:
                this.f32511e = aVar2.d(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f32512f = aVar2.g(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f32513g = aVar2.i(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    bw5.dz dzVar3 = new bw5.dz();
                    if (bArr3 != null && bArr3.length > 0) {
                        dzVar3.parseFrom(bArr3);
                    }
                    this.f32514h = dzVar3;
                }
                zArr[6] = true;
                return 0;
            case 7:
                this.f32515i = aVar2.g(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr4 = (byte[]) j27.get(i29);
                    bw5.ri0 ri0Var3 = new bw5.ri0();
                    if (bArr4 != null && bArr4.length > 0) {
                        ri0Var3.parseFrom(bArr4);
                    }
                    this.f32516m = ri0Var3;
                }
                zArr[8] = true;
                return 0;
            case 9:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr5 = (byte[]) j28.get(i37);
                    bw5.fh0 fh0Var3 = new bw5.fh0();
                    if (bArr5 != null && bArr5.length > 0) {
                        fh0Var3.parseFrom(bArr5);
                    }
                    this.f32517n = fh0Var3;
                }
                zArr[9] = true;
                return 0;
            case 10:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i38 = 0; i38 < size6; i38++) {
                    byte[] bArr6 = (byte[]) j29.get(i38);
                    bw5.mu muVar3 = new bw5.mu();
                    if (bArr6 != null && bArr6.length > 0) {
                        muVar3.parseFrom(bArr6);
                    }
                    this.f32518o = muVar3;
                }
                zArr[10] = true;
                return 0;
            case 11:
                this.f32519p = aVar2.g(intValue);
                zArr[11] = true;
                return 0;
            case 12:
                this.f32520q = aVar2.g(intValue);
                zArr[12] = true;
                return 0;
            case 13:
                this.f32521r = aVar2.g(intValue);
                zArr[13] = true;
                return 0;
            case 14:
                java.util.LinkedList j37 = aVar2.j(intValue);
                int size7 = j37.size();
                for (int i39 = 0; i39 < size7; i39++) {
                    byte[] bArr7 = (byte[]) j37.get(i39);
                    bw5.zt ztVar3 = new bw5.zt();
                    if (bArr7 != null && bArr7.length > 0) {
                        ztVar3.parseFrom(bArr7);
                    }
                    this.f32522s = ztVar3;
                }
                zArr[14] = true;
                return 0;
            case 15:
                java.util.LinkedList j38 = aVar2.j(intValue);
                int size8 = j38.size();
                for (int i47 = 0; i47 < size8; i47++) {
                    byte[] bArr8 = (byte[]) j38.get(i47);
                    bw5.kd kdVar3 = new bw5.kd();
                    if (bArr8 != null && bArr8.length > 0) {
                        kdVar3.parseFrom(bArr8);
                    }
                    this.f32523t = kdVar3;
                }
                zArr[15] = true;
                return 0;
            default:
                return -1;
        }
    }

    @Override // r45.js5, r45.ny3
    public r45.ny3 setBaseResponse(r45.ie ieVar) {
        this.BaseResponse = ieVar;
        this.f32524u[1] = true;
        return this;
    }
}
