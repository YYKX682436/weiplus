package bw5;

/* loaded from: classes4.dex */
public class v80 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f115745d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f115746e;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f115748g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f115749h;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f115747f = new java.util.LinkedList();

    /* renamed from: i, reason: collision with root package name */
    public final java.util.LinkedList f115750i = new java.util.LinkedList();

    /* renamed from: m, reason: collision with root package name */
    public final boolean[] f115751m = new boolean[7];

    static {
        new bw5.v80();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.v80 mo11468x92b714fd(byte[] bArr) {
        return (bw5.v80) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.v80)) {
            return false;
        }
        bw5.v80 v80Var = (bw5.v80) fVar;
        return n51.f.a(this.f115745d, v80Var.f115745d) && n51.f.a(this.f115746e, v80Var.f115746e) && n51.f.a(this.f115747f, v80Var.f115747f) && n51.f.a(this.f115748g, v80Var.f115748g) && n51.f.a(this.f115749h, v80Var.f115749h) && n51.f.a(this.f115750i, v80Var.f115750i);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.v80();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f115750i;
        java.util.LinkedList linkedList2 = this.f115747f;
        int i18 = 0;
        boolean[] zArr = this.f115751m;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f115745d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f115746e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            fVar.g(3, 8, linkedList2);
            java.lang.String str3 = this.f115748g;
            if (str3 != null && zArr[4]) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f115749h;
            if (str4 != null && zArr[5]) {
                fVar.j(5, str4);
            }
            fVar.g(6, 1, linkedList);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f115745d;
            if (str5 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str5);
            }
            java.lang.String str6 = this.f115746e;
            if (str6 != null && zArr[2]) {
                i18 += b36.f.j(2, str6);
            }
            int g17 = i18 + b36.f.g(3, 8, linkedList2);
            java.lang.String str7 = this.f115748g;
            if (str7 != null && zArr[4]) {
                g17 += b36.f.j(4, str7);
            }
            java.lang.String str8 = this.f115749h;
            if (str8 != null && zArr[5]) {
                g17 += b36.f.j(5, str8);
            }
            return g17 + b36.f.g(6, 1, linkedList);
        }
        if (i17 == 2) {
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
                this.f115745d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f115746e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    bw5.u80 u80Var = new bw5.u80();
                    if (bArr != null && bArr.length > 0) {
                        u80Var.mo11468x92b714fd(bArr);
                    }
                    linkedList2.add(u80Var);
                }
                zArr[3] = true;
                return 0;
            case 4:
                this.f115748g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f115749h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                linkedList.add(aVar2.k(intValue));
                zArr[6] = true;
                return 0;
            default:
                return -1;
        }
    }
}
