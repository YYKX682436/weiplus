package bw5;

/* loaded from: classes2.dex */
public class pl extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public bw5.ol f31712d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f31713e;

    /* renamed from: f, reason: collision with root package name */
    public int f31714f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f31715g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f31716h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f31717i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f31718m;

    /* renamed from: n, reason: collision with root package name */
    public bw5.fo f31719n;

    /* renamed from: p, reason: collision with root package name */
    public int f31721p;

    /* renamed from: q, reason: collision with root package name */
    public int f31722q;

    /* renamed from: r, reason: collision with root package name */
    public bw5.ll f31723r;

    /* renamed from: s, reason: collision with root package name */
    public bw5.zj f31724s;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.LinkedList f31720o = new java.util.LinkedList();

    /* renamed from: t, reason: collision with root package name */
    public final boolean[] f31725t = new boolean[14];

    static {
        new bw5.pl();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.pl parseFrom(byte[] bArr) {
        return (bw5.pl) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.pl)) {
            return false;
        }
        bw5.pl plVar = (bw5.pl) fVar;
        return n51.f.a(this.f31712d, plVar.f31712d) && n51.f.a(this.f31713e, plVar.f31713e) && n51.f.a(java.lang.Integer.valueOf(this.f31714f), java.lang.Integer.valueOf(plVar.f31714f)) && n51.f.a(this.f31715g, plVar.f31715g) && n51.f.a(this.f31716h, plVar.f31716h) && n51.f.a(this.f31717i, plVar.f31717i) && n51.f.a(this.f31718m, plVar.f31718m) && n51.f.a(this.f31719n, plVar.f31719n) && n51.f.a(this.f31720o, plVar.f31720o) && n51.f.a(java.lang.Integer.valueOf(this.f31721p), java.lang.Integer.valueOf(plVar.f31721p)) && n51.f.a(java.lang.Integer.valueOf(this.f31722q), java.lang.Integer.valueOf(plVar.f31722q)) && n51.f.a(this.f31723r, plVar.f31723r) && n51.f.a(this.f31724s, plVar.f31724s);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.pl();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f31720o;
        boolean[] zArr = this.f31725t;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            bw5.ol olVar = this.f31712d;
            if (olVar != null && zArr[1]) {
                fVar.e(1, olVar.f31148d);
            }
            java.lang.String str = this.f31713e;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            if (zArr[3]) {
                fVar.e(3, this.f31714f);
            }
            java.lang.String str2 = this.f31715g;
            if (str2 != null && zArr[4]) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f31716h;
            if (str3 != null && zArr[5]) {
                fVar.j(5, str3);
            }
            java.lang.String str4 = this.f31717i;
            if (str4 != null && zArr[6]) {
                fVar.j(6, str4);
            }
            java.lang.String str5 = this.f31718m;
            if (str5 != null && zArr[7]) {
                fVar.j(7, str5);
            }
            bw5.fo foVar = this.f31719n;
            if (foVar != null && zArr[8]) {
                fVar.i(8, foVar.computeSize());
                this.f31719n.writeFields(fVar);
            }
            fVar.g(9, 8, linkedList);
            if (zArr[10]) {
                fVar.e(10, this.f31721p);
            }
            if (zArr[11]) {
                fVar.e(11, this.f31722q);
            }
            bw5.ll llVar = this.f31723r;
            if (llVar != null && zArr[12]) {
                fVar.i(12, llVar.computeSize());
                this.f31723r.writeFields(fVar);
            }
            bw5.zj zjVar = this.f31724s;
            if (zjVar == null || !zArr[13]) {
                return 0;
            }
            fVar.i(13, zjVar.computeSize());
            this.f31724s.writeFields(fVar);
            return 0;
        }
        if (i17 == 1) {
            bw5.ol olVar2 = this.f31712d;
            int e17 = (olVar2 == null || !zArr[1]) ? 0 : 0 + b36.f.e(1, olVar2.f31148d);
            java.lang.String str6 = this.f31713e;
            if (str6 != null && zArr[2]) {
                e17 += b36.f.j(2, str6);
            }
            if (zArr[3]) {
                e17 += b36.f.e(3, this.f31714f);
            }
            java.lang.String str7 = this.f31715g;
            if (str7 != null && zArr[4]) {
                e17 += b36.f.j(4, str7);
            }
            java.lang.String str8 = this.f31716h;
            if (str8 != null && zArr[5]) {
                e17 += b36.f.j(5, str8);
            }
            java.lang.String str9 = this.f31717i;
            if (str9 != null && zArr[6]) {
                e17 += b36.f.j(6, str9);
            }
            java.lang.String str10 = this.f31718m;
            if (str10 != null && zArr[7]) {
                e17 += b36.f.j(7, str10);
            }
            bw5.fo foVar2 = this.f31719n;
            if (foVar2 != null && zArr[8]) {
                e17 += b36.f.i(8, foVar2.computeSize());
            }
            int g17 = e17 + b36.f.g(9, 8, linkedList);
            if (zArr[10]) {
                g17 += b36.f.e(10, this.f31721p);
            }
            if (zArr[11]) {
                g17 += b36.f.e(11, this.f31722q);
            }
            bw5.ll llVar2 = this.f31723r;
            if (llVar2 != null && zArr[12]) {
                g17 += b36.f.i(12, llVar2.computeSize());
            }
            bw5.zj zjVar2 = this.f31724s;
            return (zjVar2 == null || !zArr[13]) ? g17 : g17 + b36.f.i(13, zjVar2.computeSize());
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
                int g18 = aVar2.g(intValue);
                this.f31712d = g18 != 0 ? g18 != 1 ? g18 != 2 ? g18 != 3 ? g18 != 4 ? g18 != 5 ? null : bw5.ol.NET_5G : bw5.ol.NET_4G : bw5.ol.NET_3G : bw5.ol.NET_2G : bw5.ol.NET_WIFI : bw5.ol.NET_NULL;
                zArr[1] = true;
                return 0;
            case 2:
                this.f31713e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f31714f = aVar2.g(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f31715g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f31716h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f31717i = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f31718m = aVar2.k(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    bw5.fo foVar3 = new bw5.fo();
                    if (bArr != null && bArr.length > 0) {
                        foVar3.parseFrom(bArr);
                    }
                    this.f31719n = foVar3;
                }
                zArr[8] = true;
                return 0;
            case 9:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j18.get(i19);
                    bw5.fo foVar4 = new bw5.fo();
                    if (bArr2 != null && bArr2.length > 0) {
                        foVar4.parseFrom(bArr2);
                    }
                    linkedList.add(foVar4);
                }
                zArr[9] = true;
                return 0;
            case 10:
                this.f31721p = aVar2.g(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                this.f31722q = aVar2.g(intValue);
                zArr[11] = true;
                return 0;
            case 12:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr3 = (byte[]) j19.get(i27);
                    bw5.ll llVar3 = new bw5.ll();
                    if (bArr3 != null && bArr3.length > 0) {
                        llVar3.parseFrom(bArr3);
                    }
                    this.f31723r = llVar3;
                }
                zArr[12] = true;
                return 0;
            case 13:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i28 = 0; i28 < size4; i28++) {
                    byte[] bArr4 = (byte[]) j27.get(i28);
                    bw5.zj zjVar3 = new bw5.zj();
                    if (bArr4 != null && bArr4.length > 0) {
                        zjVar3.parseFrom(bArr4);
                    }
                    this.f31724s = zjVar3;
                }
                zArr[13] = true;
                return 0;
            default:
                return -1;
        }
    }
}
