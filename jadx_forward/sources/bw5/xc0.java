package bw5;

/* loaded from: classes2.dex */
public class xc0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f116591d;

    /* renamed from: f, reason: collision with root package name */
    public int f116593f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f116594g;

    /* renamed from: h, reason: collision with root package name */
    public bw5.dd0 f116595h;

    /* renamed from: i, reason: collision with root package name */
    public bw5.yc0 f116596i;

    /* renamed from: m, reason: collision with root package name */
    public bw5.dd0 f116597m;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f116592e = new java.util.LinkedList();

    /* renamed from: n, reason: collision with root package name */
    public final boolean[] f116598n = new boolean[8];

    static {
        new bw5.xc0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.xc0 mo11468x92b714fd(byte[] bArr) {
        return (bw5.xc0) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.xc0)) {
            return false;
        }
        bw5.xc0 xc0Var = (bw5.xc0) fVar;
        return n51.f.a(this.f116591d, xc0Var.f116591d) && n51.f.a(this.f116592e, xc0Var.f116592e) && n51.f.a(java.lang.Integer.valueOf(this.f116593f), java.lang.Integer.valueOf(xc0Var.f116593f)) && n51.f.a(this.f116594g, xc0Var.f116594g) && n51.f.a(this.f116595h, xc0Var.f116595h) && n51.f.a(this.f116596i, xc0Var.f116596i) && n51.f.a(this.f116597m, xc0Var.f116597m);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.xc0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f116592e;
        int i18 = 0;
        boolean[] zArr = this.f116598n;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f116591d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            fVar.g(2, 8, linkedList);
            if (zArr[3]) {
                fVar.e(3, this.f116593f);
            }
            java.lang.String str2 = this.f116594g;
            if (str2 != null && zArr[4]) {
                fVar.j(4, str2);
            }
            bw5.dd0 dd0Var = this.f116595h;
            if (dd0Var != null && zArr[5]) {
                fVar.i(5, dd0Var.mo75928xcd1e8d8());
                this.f116595h.mo75956x3d5d1f78(fVar);
            }
            bw5.yc0 yc0Var = this.f116596i;
            if (yc0Var != null && zArr[6]) {
                fVar.i(6, yc0Var.mo75928xcd1e8d8());
                this.f116596i.mo75956x3d5d1f78(fVar);
            }
            bw5.dd0 dd0Var2 = this.f116597m;
            if (dd0Var2 != null && zArr[7]) {
                fVar.i(7, dd0Var2.mo75928xcd1e8d8());
                this.f116597m.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f116591d;
            if (str3 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str3);
            }
            int g17 = i18 + b36.f.g(2, 8, linkedList);
            if (zArr[3]) {
                g17 += b36.f.e(3, this.f116593f);
            }
            java.lang.String str4 = this.f116594g;
            if (str4 != null && zArr[4]) {
                g17 += b36.f.j(4, str4);
            }
            bw5.dd0 dd0Var3 = this.f116595h;
            if (dd0Var3 != null && zArr[5]) {
                g17 += b36.f.i(5, dd0Var3.mo75928xcd1e8d8());
            }
            bw5.yc0 yc0Var2 = this.f116596i;
            if (yc0Var2 != null && zArr[6]) {
                g17 += b36.f.i(6, yc0Var2.mo75928xcd1e8d8());
            }
            bw5.dd0 dd0Var4 = this.f116597m;
            return (dd0Var4 == null || !zArr[7]) ? g17 : g17 + b36.f.i(7, dd0Var4.mo75928xcd1e8d8());
        }
        if (i17 == 2) {
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
                this.f116591d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    bw5.ed0 ed0Var = new bw5.ed0();
                    if (bArr != null && bArr.length > 0) {
                        ed0Var.mo11468x92b714fd(bArr);
                    }
                    linkedList.add(ed0Var);
                }
                zArr[2] = true;
                return 0;
            case 3:
                this.f116593f = aVar2.g(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f116594g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    bw5.dd0 dd0Var5 = new bw5.dd0();
                    if (bArr2 != null && bArr2.length > 0) {
                        dd0Var5.mo11468x92b714fd(bArr2);
                    }
                    this.f116595h = dd0Var5;
                }
                zArr[5] = true;
                return 0;
            case 6:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    bw5.yc0 yc0Var3 = new bw5.yc0();
                    if (bArr3 != null && bArr3.length > 0) {
                        yc0Var3.mo11468x92b714fd(bArr3);
                    }
                    this.f116596i = yc0Var3;
                }
                zArr[6] = true;
                return 0;
            case 7:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr4 = (byte[]) j27.get(i29);
                    bw5.dd0 dd0Var6 = new bw5.dd0();
                    if (bArr4 != null && bArr4.length > 0) {
                        dd0Var6.mo11468x92b714fd(bArr4);
                    }
                    this.f116597m = dd0Var6;
                }
                zArr[7] = true;
                return 0;
            default:
                return -1;
        }
    }
}
