package bw5;

/* loaded from: classes2.dex */
public class k30 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f110746d;

    /* renamed from: e, reason: collision with root package name */
    public int f110747e;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f110749g;

    /* renamed from: h, reason: collision with root package name */
    public int f110750h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f110751i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f110752m;

    /* renamed from: o, reason: collision with root package name */
    public boolean f110754o;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f110756q;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f110748f = new java.util.LinkedList();

    /* renamed from: n, reason: collision with root package name */
    public final java.util.LinkedList f110753n = new java.util.LinkedList();

    /* renamed from: p, reason: collision with root package name */
    public final java.util.LinkedList f110755p = new java.util.LinkedList();

    /* renamed from: r, reason: collision with root package name */
    public final java.util.LinkedList f110757r = new java.util.LinkedList();

    /* renamed from: s, reason: collision with root package name */
    public final java.util.LinkedList f110758s = new java.util.LinkedList();

    /* renamed from: t, reason: collision with root package name */
    public final boolean[] f110759t = new boolean[14];

    static {
        new bw5.k30();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.k30 mo11468x92b714fd(byte[] bArr) {
        return (bw5.k30) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.k30)) {
            return false;
        }
        bw5.k30 k30Var = (bw5.k30) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f110746d), java.lang.Integer.valueOf(k30Var.f110746d)) && n51.f.a(java.lang.Integer.valueOf(this.f110747e), java.lang.Integer.valueOf(k30Var.f110747e)) && n51.f.a(this.f110748f, k30Var.f110748f) && n51.f.a(this.f110749g, k30Var.f110749g) && n51.f.a(java.lang.Integer.valueOf(this.f110750h), java.lang.Integer.valueOf(k30Var.f110750h)) && n51.f.a(this.f110751i, k30Var.f110751i) && n51.f.a(this.f110752m, k30Var.f110752m) && n51.f.a(this.f110753n, k30Var.f110753n) && n51.f.a(java.lang.Boolean.valueOf(this.f110754o), java.lang.Boolean.valueOf(k30Var.f110754o)) && n51.f.a(this.f110755p, k30Var.f110755p) && n51.f.a(this.f110756q, k30Var.f110756q) && n51.f.a(this.f110757r, k30Var.f110757r) && n51.f.a(this.f110758s, k30Var.f110758s);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.k30();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f110758s;
        java.util.LinkedList linkedList2 = this.f110757r;
        java.util.LinkedList linkedList3 = this.f110755p;
        java.util.LinkedList linkedList4 = this.f110753n;
        java.util.LinkedList linkedList5 = this.f110748f;
        boolean[] zArr = this.f110759t;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f110746d);
            }
            if (zArr[2]) {
                fVar.e(2, this.f110747e);
            }
            fVar.g(3, 8, linkedList5);
            java.lang.String str = this.f110749g;
            if (str != null && zArr[4]) {
                fVar.j(4, str);
            }
            if (zArr[5]) {
                fVar.e(5, this.f110750h);
            }
            java.lang.String str2 = this.f110751i;
            if (str2 != null && zArr[6]) {
                fVar.j(6, str2);
            }
            java.lang.String str3 = this.f110752m;
            if (str3 != null && zArr[7]) {
                fVar.j(7, str3);
            }
            fVar.g(8, 8, linkedList4);
            if (zArr[9]) {
                fVar.a(9, this.f110754o);
            }
            fVar.g(10, 8, linkedList3);
            java.lang.String str4 = this.f110756q;
            if (str4 != null && zArr[11]) {
                fVar.j(11, str4);
            }
            fVar.g(12, 8, linkedList2);
            fVar.g(13, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? b36.f.e(1, this.f110746d) + 0 : 0;
            if (zArr[2]) {
                e17 += b36.f.e(2, this.f110747e);
            }
            int g17 = e17 + b36.f.g(3, 8, linkedList5);
            java.lang.String str5 = this.f110749g;
            if (str5 != null && zArr[4]) {
                g17 += b36.f.j(4, str5);
            }
            if (zArr[5]) {
                g17 += b36.f.e(5, this.f110750h);
            }
            java.lang.String str6 = this.f110751i;
            if (str6 != null && zArr[6]) {
                g17 += b36.f.j(6, str6);
            }
            java.lang.String str7 = this.f110752m;
            if (str7 != null && zArr[7]) {
                g17 += b36.f.j(7, str7);
            }
            int g18 = g17 + b36.f.g(8, 8, linkedList4);
            if (zArr[9]) {
                g18 += b36.f.a(9, this.f110754o);
            }
            int g19 = g18 + b36.f.g(10, 8, linkedList3);
            java.lang.String str8 = this.f110756q;
            if (str8 != null && zArr[11]) {
                g19 += b36.f.j(11, str8);
            }
            return g19 + b36.f.g(12, 8, linkedList2) + b36.f.g(13, 8, linkedList);
        }
        if (i17 == 2) {
            linkedList5.clear();
            linkedList4.clear();
            linkedList3.clear();
            linkedList2.clear();
            linkedList.clear();
            c36.a aVar = new c36.a((byte[]) objArr[0], com.p314xaae8f345.mm.p2495xc50a8b8b.f.f38879xd1e823a);
            for (int m75958x5767edba = com.p314xaae8f345.mm.p2495xc50a8b8b.f.m75958x5767edba(aVar); m75958x5767edba > 0; m75958x5767edba = com.p314xaae8f345.mm.p2495xc50a8b8b.f.m75958x5767edba(aVar)) {
                if (!super.mo75949x4476b383(aVar, this, m75958x5767edba)) {
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
                this.f110746d = aVar2.g(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f110747e = aVar2.g(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    bw5.j30 j30Var = new bw5.j30();
                    if (bArr != null && bArr.length > 0) {
                        j30Var.mo11468x92b714fd(bArr);
                    }
                    linkedList5.add(j30Var);
                }
                zArr[3] = true;
                return 0;
            case 4:
                this.f110749g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f110750h = aVar2.g(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f110751i = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f110752m = aVar2.k(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j18.get(i19);
                    bw5.xn xnVar = new bw5.xn();
                    if (bArr2 != null && bArr2.length > 0) {
                        xnVar.mo11468x92b714fd(bArr2);
                    }
                    linkedList4.add(xnVar);
                }
                zArr[8] = true;
                return 0;
            case 9:
                this.f110754o = aVar2.c(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr3 = (byte[]) j19.get(i27);
                    bw5.xn xnVar2 = new bw5.xn();
                    if (bArr3 != null && bArr3.length > 0) {
                        xnVar2.mo11468x92b714fd(bArr3);
                    }
                    linkedList3.add(xnVar2);
                }
                zArr[10] = true;
                return 0;
            case 11:
                this.f110756q = aVar2.k(intValue);
                zArr[11] = true;
                return 0;
            case 12:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i28 = 0; i28 < size4; i28++) {
                    byte[] bArr4 = (byte[]) j27.get(i28);
                    bw5.wn wnVar = new bw5.wn();
                    if (bArr4 != null && bArr4.length > 0) {
                        wnVar.mo11468x92b714fd(bArr4);
                    }
                    linkedList2.add(wnVar);
                }
                zArr[12] = true;
                return 0;
            case 13:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i29 = 0; i29 < size5; i29++) {
                    byte[] bArr5 = (byte[]) j28.get(i29);
                    bw5.wn wnVar2 = new bw5.wn();
                    if (bArr5 != null && bArr5.length > 0) {
                        wnVar2.mo11468x92b714fd(bArr5);
                    }
                    linkedList.add(wnVar2);
                }
                zArr[13] = true;
                return 0;
            default:
                return -1;
        }
    }
}
