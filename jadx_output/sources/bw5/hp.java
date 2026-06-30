package bw5;

/* loaded from: classes2.dex */
public class hp extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f28300d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f28301e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f28302f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f28303g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f28304h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f28305i;

    /* renamed from: n, reason: collision with root package name */
    public int f28307n;

    /* renamed from: o, reason: collision with root package name */
    public long f28308o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f28309p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f28310q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f28311r;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.LinkedList f28306m = new java.util.LinkedList();

    /* renamed from: s, reason: collision with root package name */
    public final java.util.LinkedList f28312s = new java.util.LinkedList();

    /* renamed from: t, reason: collision with root package name */
    public final boolean[] f28313t = new boolean[14];

    static {
        new bw5.hp();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.hp parseFrom(byte[] bArr) {
        return (bw5.hp) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.hp)) {
            return false;
        }
        bw5.hp hpVar = (bw5.hp) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f28300d), java.lang.Integer.valueOf(hpVar.f28300d)) && n51.f.a(this.f28301e, hpVar.f28301e) && n51.f.a(java.lang.Boolean.valueOf(this.f28302f), java.lang.Boolean.valueOf(hpVar.f28302f)) && n51.f.a(java.lang.Boolean.valueOf(this.f28303g), java.lang.Boolean.valueOf(hpVar.f28303g)) && n51.f.a(java.lang.Boolean.valueOf(this.f28304h), java.lang.Boolean.valueOf(hpVar.f28304h)) && n51.f.a(java.lang.Boolean.valueOf(this.f28305i), java.lang.Boolean.valueOf(hpVar.f28305i)) && n51.f.a(this.f28306m, hpVar.f28306m) && n51.f.a(java.lang.Integer.valueOf(this.f28307n), java.lang.Integer.valueOf(hpVar.f28307n)) && n51.f.a(java.lang.Long.valueOf(this.f28308o), java.lang.Long.valueOf(hpVar.f28308o)) && n51.f.a(this.f28309p, hpVar.f28309p) && n51.f.a(this.f28310q, hpVar.f28310q) && n51.f.a(this.f28311r, hpVar.f28311r) && n51.f.a(this.f28312s, hpVar.f28312s);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.hp();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f28312s;
        java.util.LinkedList linkedList2 = this.f28306m;
        boolean[] zArr = this.f28313t;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f28300d);
            }
            java.lang.String str = this.f28301e;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            if (zArr[3]) {
                fVar.a(3, this.f28302f);
            }
            if (zArr[4]) {
                fVar.a(4, this.f28303g);
            }
            if (zArr[5]) {
                fVar.a(5, this.f28304h);
            }
            if (zArr[6]) {
                fVar.a(6, this.f28305i);
            }
            fVar.g(7, 8, linkedList2);
            if (zArr[8]) {
                fVar.e(8, this.f28307n);
            }
            if (zArr[9]) {
                fVar.h(9, this.f28308o);
            }
            java.lang.String str2 = this.f28309p;
            if (str2 != null && zArr[10]) {
                fVar.j(10, str2);
            }
            java.lang.String str3 = this.f28310q;
            if (str3 != null && zArr[11]) {
                fVar.j(11, str3);
            }
            java.lang.String str4 = this.f28311r;
            if (str4 != null && zArr[12]) {
                fVar.j(12, str4);
            }
            fVar.g(13, 1, linkedList);
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? b36.f.e(1, this.f28300d) + 0 : 0;
            java.lang.String str5 = this.f28301e;
            if (str5 != null && zArr[2]) {
                e17 += b36.f.j(2, str5);
            }
            if (zArr[3]) {
                e17 += b36.f.a(3, this.f28302f);
            }
            if (zArr[4]) {
                e17 += b36.f.a(4, this.f28303g);
            }
            if (zArr[5]) {
                e17 += b36.f.a(5, this.f28304h);
            }
            if (zArr[6]) {
                e17 += b36.f.a(6, this.f28305i);
            }
            int g17 = e17 + b36.f.g(7, 8, linkedList2);
            if (zArr[8]) {
                g17 += b36.f.e(8, this.f28307n);
            }
            if (zArr[9]) {
                g17 += b36.f.h(9, this.f28308o);
            }
            java.lang.String str6 = this.f28309p;
            if (str6 != null && zArr[10]) {
                g17 += b36.f.j(10, str6);
            }
            java.lang.String str7 = this.f28310q;
            if (str7 != null && zArr[11]) {
                g17 += b36.f.j(11, str7);
            }
            java.lang.String str8 = this.f28311r;
            if (str8 != null && zArr[12]) {
                g17 += b36.f.j(12, str8);
            }
            return g17 + b36.f.g(13, 1, linkedList);
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
                this.f28300d = aVar2.g(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f28301e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f28302f = aVar2.c(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f28303g = aVar2.c(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f28304h = aVar2.c(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f28305i = aVar2.c(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    bw5.hp hpVar = new bw5.hp();
                    if (bArr != null && bArr.length > 0) {
                        hpVar.parseFrom(bArr);
                    }
                    linkedList2.add(hpVar);
                }
                zArr[7] = true;
                return 0;
            case 8:
                this.f28307n = aVar2.g(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f28308o = aVar2.i(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f28309p = aVar2.k(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                this.f28310q = aVar2.k(intValue);
                zArr[11] = true;
                return 0;
            case 12:
                this.f28311r = aVar2.k(intValue);
                zArr[12] = true;
                return 0;
            case 13:
                linkedList.add(aVar2.k(intValue));
                zArr[13] = true;
                return 0;
            default:
                return -1;
        }
    }
}
