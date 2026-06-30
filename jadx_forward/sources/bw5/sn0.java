package bw5;

/* loaded from: classes11.dex */
public class sn0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: e, reason: collision with root package name */
    public bw5.lr0 f114606e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f114607f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f114608g;

    /* renamed from: h, reason: collision with root package name */
    public bw5.o20 f114609h;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f114605d = new java.util.LinkedList();

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f114610i = new boolean[6];

    static {
        new bw5.sn0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.sn0 mo11468x92b714fd(byte[] bArr) {
        return (bw5.sn0) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.sn0)) {
            return false;
        }
        bw5.sn0 sn0Var = (bw5.sn0) fVar;
        return n51.f.a(this.f114605d, sn0Var.f114605d) && n51.f.a(this.f114606e, sn0Var.f114606e) && n51.f.a(this.f114607f, sn0Var.f114607f) && n51.f.a(this.f114608g, sn0Var.f114608g) && n51.f.a(this.f114609h, sn0Var.f114609h);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.sn0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f114605d;
        boolean[] zArr = this.f114610i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.g(1, 8, linkedList);
            bw5.lr0 lr0Var = this.f114606e;
            if (lr0Var != null && zArr[2]) {
                fVar.e(2, lr0Var.f111473d);
            }
            java.lang.String str = this.f114607f;
            if (str != null && zArr[3]) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f114608g;
            if (str2 != null && zArr[4]) {
                fVar.j(4, str2);
            }
            bw5.o20 o20Var = this.f114609h;
            if (o20Var != null && zArr[5]) {
                fVar.e(5, o20Var.f112453d);
            }
            return 0;
        }
        if (i17 == 1) {
            int g17 = b36.f.g(1, 8, linkedList) + 0;
            bw5.lr0 lr0Var2 = this.f114606e;
            if (lr0Var2 != null && zArr[2]) {
                g17 += b36.f.e(2, lr0Var2.f111473d);
            }
            java.lang.String str3 = this.f114607f;
            if (str3 != null && zArr[3]) {
                g17 += b36.f.j(3, str3);
            }
            java.lang.String str4 = this.f114608g;
            if (str4 != null && zArr[4]) {
                g17 += b36.f.j(4, str4);
            }
            bw5.o20 o20Var2 = this.f114609h;
            return (o20Var2 == null || !zArr[5]) ? g17 : g17 + b36.f.e(5, o20Var2.f112453d);
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
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr = (byte[]) j17.get(i18);
                bw5.sm0 sm0Var = new bw5.sm0();
                if (bArr != null && bArr.length > 0) {
                    sm0Var.mo11468x92b714fd(bArr);
                }
                linkedList.add(sm0Var);
            }
            zArr[1] = true;
            return 0;
        }
        bw5.lr0 lr0Var3 = null;
        bw5.o20 o20Var3 = null;
        if (intValue == 2) {
            int g18 = aVar2.g(intValue);
            if (g18 == 0) {
                lr0Var3 = bw5.lr0.CLUSTER_DES_NONE;
            } else if (g18 == 1) {
                lr0Var3 = bw5.lr0.CLUSTER_DES_ONLY_ME_TYPE;
            } else if (g18 == 2) {
                lr0Var3 = bw5.lr0.CLUSTER_DES_WITH_ME_TYPE;
            } else if (g18 == 3) {
                lr0Var3 = bw5.lr0.CLUSTER_DES_OTHER_TYPE;
            } else if (g18 == 4) {
                lr0Var3 = bw5.lr0.CLUSTER_DES_FRIEND_SAME_TYPE;
            }
            this.f114606e = lr0Var3;
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f114607f = aVar2.k(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue == 4) {
            this.f114608g = aVar2.k(intValue);
            zArr[4] = true;
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        switch (aVar2.g(intValue)) {
            case 0:
                o20Var3 = bw5.o20.DEFAULT;
                break;
            case 1:
                o20Var3 = bw5.o20.WHITE;
                break;
            case 2:
                o20Var3 = bw5.o20.ORANGE;
                break;
            case 3:
                o20Var3 = bw5.o20.GREEN;
                break;
            case 4:
                o20Var3 = bw5.o20.LINK;
                break;
            case 5:
                o20Var3 = bw5.o20.GREY;
                break;
            case 6:
                o20Var3 = bw5.o20.FG_1;
                break;
            case 7:
                o20Var3 = bw5.o20.FG_0;
                break;
            case 8:
                o20Var3 = bw5.o20.FG_2;
                break;
            case 9:
                o20Var3 = bw5.o20.FG_3;
                break;
            case 10:
                o20Var3 = bw5.o20.NORMAL_TXT_COLOR;
                break;
        }
        this.f114609h = o20Var3;
        zArr[5] = true;
        return 0;
    }
}
