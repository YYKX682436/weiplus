package bw5;

/* loaded from: classes2.dex */
public class xj extends com.tencent.mm.protobuf.f {
    public bw5.dg A;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f35129d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f35130e;

    /* renamed from: f, reason: collision with root package name */
    public long f35131f;

    /* renamed from: g, reason: collision with root package name */
    public int f35132g;

    /* renamed from: h, reason: collision with root package name */
    public int f35133h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f35134i;

    /* renamed from: m, reason: collision with root package name */
    public long f35135m;

    /* renamed from: n, reason: collision with root package name */
    public int f35136n;

    /* renamed from: o, reason: collision with root package name */
    public bw5.ee f35137o;

    /* renamed from: p, reason: collision with root package name */
    public int f35138p;

    /* renamed from: q, reason: collision with root package name */
    public int f35139q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f35140r;

    /* renamed from: s, reason: collision with root package name */
    public int f35141s;

    /* renamed from: t, reason: collision with root package name */
    public int f35142t;

    /* renamed from: u, reason: collision with root package name */
    public int f35143u;

    /* renamed from: v, reason: collision with root package name */
    public int f35144v;

    /* renamed from: w, reason: collision with root package name */
    public int f35145w;

    /* renamed from: x, reason: collision with root package name */
    public bw5.eu f35146x;

    /* renamed from: z, reason: collision with root package name */
    public bw5.dh f35148z;

    /* renamed from: y, reason: collision with root package name */
    public final java.util.LinkedList f35147y = new java.util.LinkedList();
    public final boolean[] B = new boolean[23];

    static {
        new bw5.xj();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.xj parseFrom(byte[] bArr) {
        return (bw5.xj) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.xj)) {
            return false;
        }
        bw5.xj xjVar = (bw5.xj) fVar;
        return n51.f.a(this.f35129d, xjVar.f35129d) && n51.f.a(this.f35130e, xjVar.f35130e) && n51.f.a(java.lang.Long.valueOf(this.f35131f), java.lang.Long.valueOf(xjVar.f35131f)) && n51.f.a(java.lang.Integer.valueOf(this.f35132g), java.lang.Integer.valueOf(xjVar.f35132g)) && n51.f.a(java.lang.Integer.valueOf(this.f35133h), java.lang.Integer.valueOf(xjVar.f35133h)) && n51.f.a(this.f35134i, xjVar.f35134i) && n51.f.a(java.lang.Long.valueOf(this.f35135m), java.lang.Long.valueOf(xjVar.f35135m)) && n51.f.a(java.lang.Integer.valueOf(this.f35136n), java.lang.Integer.valueOf(xjVar.f35136n)) && n51.f.a(this.f35137o, xjVar.f35137o) && n51.f.a(java.lang.Integer.valueOf(this.f35138p), java.lang.Integer.valueOf(xjVar.f35138p)) && n51.f.a(java.lang.Integer.valueOf(this.f35139q), java.lang.Integer.valueOf(xjVar.f35139q)) && n51.f.a(this.f35140r, xjVar.f35140r) && n51.f.a(java.lang.Integer.valueOf(this.f35141s), java.lang.Integer.valueOf(xjVar.f35141s)) && n51.f.a(java.lang.Integer.valueOf(this.f35142t), java.lang.Integer.valueOf(xjVar.f35142t)) && n51.f.a(java.lang.Integer.valueOf(this.f35143u), java.lang.Integer.valueOf(xjVar.f35143u)) && n51.f.a(java.lang.Integer.valueOf(this.f35144v), java.lang.Integer.valueOf(xjVar.f35144v)) && n51.f.a(java.lang.Integer.valueOf(this.f35145w), java.lang.Integer.valueOf(xjVar.f35145w)) && n51.f.a(this.f35146x, xjVar.f35146x) && n51.f.a(this.f35147y, xjVar.f35147y) && n51.f.a(this.f35148z, xjVar.f35148z) && n51.f.a(this.A, xjVar.A);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.xj();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.B;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f35129d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f35130e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            if (zArr[3]) {
                fVar.h(3, this.f35131f);
            }
            if (zArr[4]) {
                fVar.e(4, this.f35132g);
            }
            if (zArr[5]) {
                fVar.e(5, this.f35133h);
            }
            java.lang.String str3 = this.f35134i;
            if (str3 != null && zArr[6]) {
                fVar.j(6, str3);
            }
            if (zArr[7]) {
                fVar.h(7, this.f35135m);
            }
            if (zArr[8]) {
                fVar.e(8, this.f35136n);
            }
            bw5.ee eeVar = this.f35137o;
            if (eeVar != null && zArr[9]) {
                fVar.i(9, eeVar.computeSize());
                this.f35137o.writeFields(fVar);
            }
            if (zArr[10]) {
                fVar.e(10, this.f35138p);
            }
            if (zArr[11]) {
                fVar.e(11, this.f35139q);
            }
            java.lang.String str4 = this.f35140r;
            if (str4 != null && zArr[12]) {
                fVar.j(12, str4);
            }
            if (zArr[13]) {
                fVar.e(13, this.f35141s);
            }
            if (zArr[14]) {
                fVar.e(14, this.f35142t);
            }
            if (zArr[15]) {
                fVar.e(15, this.f35143u);
            }
            if (zArr[16]) {
                fVar.e(16, this.f35144v);
            }
            if (zArr[17]) {
                fVar.e(17, this.f35145w);
            }
            bw5.eu euVar = this.f35146x;
            if (euVar != null && zArr[18]) {
                fVar.i(18, euVar.computeSize());
                this.f35146x.writeFields(fVar);
            }
            fVar.g(20, 8, this.f35147y);
            bw5.dh dhVar = this.f35148z;
            if (dhVar != null && zArr[21]) {
                fVar.i(21, dhVar.computeSize());
                this.f35148z.writeFields(fVar);
            }
            bw5.dg dgVar = this.A;
            if (dgVar != null && zArr[22]) {
                fVar.i(22, dgVar.computeSize());
                this.A.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f35129d;
            if (str5 != null && zArr[1]) {
                i18 = b36.f.j(1, str5) + 0;
            }
            java.lang.String str6 = this.f35130e;
            if (str6 != null && zArr[2]) {
                i18 += b36.f.j(2, str6);
            }
            if (zArr[3]) {
                i18 += b36.f.h(3, this.f35131f);
            }
            if (zArr[4]) {
                i18 += b36.f.e(4, this.f35132g);
            }
            if (zArr[5]) {
                i18 += b36.f.e(5, this.f35133h);
            }
            java.lang.String str7 = this.f35134i;
            if (str7 != null && zArr[6]) {
                i18 += b36.f.j(6, str7);
            }
            if (zArr[7]) {
                i18 += b36.f.h(7, this.f35135m);
            }
            if (zArr[8]) {
                i18 += b36.f.e(8, this.f35136n);
            }
            bw5.ee eeVar2 = this.f35137o;
            if (eeVar2 != null && zArr[9]) {
                i18 += b36.f.i(9, eeVar2.computeSize());
            }
            if (zArr[10]) {
                i18 += b36.f.e(10, this.f35138p);
            }
            if (zArr[11]) {
                i18 += b36.f.e(11, this.f35139q);
            }
            java.lang.String str8 = this.f35140r;
            if (str8 != null && zArr[12]) {
                i18 += b36.f.j(12, str8);
            }
            if (zArr[13]) {
                i18 += b36.f.e(13, this.f35141s);
            }
            if (zArr[14]) {
                i18 += b36.f.e(14, this.f35142t);
            }
            if (zArr[15]) {
                i18 += b36.f.e(15, this.f35143u);
            }
            if (zArr[16]) {
                i18 += b36.f.e(16, this.f35144v);
            }
            if (zArr[17]) {
                i18 += b36.f.e(17, this.f35145w);
            }
            bw5.eu euVar2 = this.f35146x;
            if (euVar2 != null && zArr[18]) {
                i18 += b36.f.i(18, euVar2.computeSize());
            }
            int g17 = i18 + b36.f.g(20, 8, this.f35147y);
            bw5.dh dhVar2 = this.f35148z;
            if (dhVar2 != null && zArr[21]) {
                g17 += b36.f.i(21, dhVar2.computeSize());
            }
            bw5.dg dgVar2 = this.A;
            return (dgVar2 == null || !zArr[22]) ? g17 : g17 + b36.f.i(22, dgVar2.computeSize());
        }
        if (i17 == 2) {
            this.f35147y.clear();
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
                this.f35129d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f35130e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f35131f = aVar2.i(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f35132g = aVar2.g(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f35133h = aVar2.g(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f35134i = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f35135m = aVar2.i(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f35136n = aVar2.g(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    bw5.ee eeVar3 = new bw5.ee();
                    if (bArr != null && bArr.length > 0) {
                        eeVar3.parseFrom(bArr);
                    }
                    this.f35137o = eeVar3;
                }
                zArr[9] = true;
                return 0;
            case 10:
                this.f35138p = aVar2.g(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                this.f35139q = aVar2.g(intValue);
                zArr[11] = true;
                return 0;
            case 12:
                this.f35140r = aVar2.k(intValue);
                zArr[12] = true;
                return 0;
            case 13:
                this.f35141s = aVar2.g(intValue);
                zArr[13] = true;
                return 0;
            case 14:
                this.f35142t = aVar2.g(intValue);
                zArr[14] = true;
                return 0;
            case 15:
                this.f35143u = aVar2.g(intValue);
                zArr[15] = true;
                return 0;
            case 16:
                this.f35144v = aVar2.g(intValue);
                zArr[16] = true;
                return 0;
            case 17:
                this.f35145w = aVar2.g(intValue);
                zArr[17] = true;
                return 0;
            case 18:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    bw5.eu euVar3 = new bw5.eu();
                    if (bArr2 != null && bArr2.length > 0) {
                        euVar3.parseFrom(bArr2);
                    }
                    this.f35146x = euVar3;
                }
                zArr[18] = true;
                return 0;
            case 19:
            default:
                return -1;
            case 20:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    bw5.eh ehVar = new bw5.eh();
                    if (bArr3 != null && bArr3.length > 0) {
                        ehVar.parseFrom(bArr3);
                    }
                    this.f35147y.add(ehVar);
                }
                zArr[20] = true;
                return 0;
            case 21:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr4 = (byte[]) j27.get(i29);
                    bw5.dh dhVar3 = new bw5.dh();
                    if (bArr4 != null && bArr4.length > 0) {
                        dhVar3.parseFrom(bArr4);
                    }
                    this.f35148z = dhVar3;
                }
                zArr[21] = true;
                return 0;
            case 22:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr5 = (byte[]) j28.get(i37);
                    bw5.dg dgVar3 = new bw5.dg();
                    if (bArr5 != null && bArr5.length > 0) {
                        dgVar3.parseFrom(bArr5);
                    }
                    this.A = dgVar3;
                }
                zArr[22] = true;
                return 0;
        }
    }
}
