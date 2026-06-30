package bw5;

/* loaded from: classes8.dex */
public class m9 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public bw5.n9 f111656d;

    /* renamed from: e, reason: collision with root package name */
    public int f111657e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f111658f = new boolean[3];

    static {
        new bw5.m9();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.m9 mo11468x92b714fd(byte[] bArr) {
        return (bw5.m9) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.m9)) {
            return false;
        }
        bw5.m9 m9Var = (bw5.m9) fVar;
        return n51.f.a(this.f111656d, m9Var.f111656d) && n51.f.a(java.lang.Integer.valueOf(this.f111657e), java.lang.Integer.valueOf(m9Var.f111657e));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.m9();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        bw5.n9 n9Var;
        boolean[] zArr = this.f111658f;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            bw5.n9 n9Var2 = this.f111656d;
            if (n9Var2 != null && zArr[1]) {
                fVar.e(1, n9Var2.f112099d);
            }
            if (zArr[2]) {
                fVar.e(2, this.f111657e);
            }
            return 0;
        }
        if (i17 == 1) {
            bw5.n9 n9Var3 = this.f111656d;
            if (n9Var3 != null && zArr[1]) {
                i18 = 0 + b36.f.e(1, n9Var3.f112099d);
            }
            return zArr[2] ? i18 + b36.f.e(2, this.f111657e) : i18;
        }
        if (i17 == 2) {
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
        if (intValue != 1) {
            if (intValue != 2) {
                return -1;
            }
            this.f111657e = aVar2.g(intValue);
            zArr[2] = true;
            return 0;
        }
        switch (aVar2.g(intValue)) {
            case 1:
                n9Var = bw5.n9.RECEIVE_REDDOT;
                break;
            case 2:
                n9Var = bw5.n9.EXPOSE_WITH_REDDOT;
                break;
            case 3:
                n9Var = bw5.n9.EXPOSE_WITHOUT_REDDOT;
                break;
            case 4:
                n9Var = bw5.n9.FOREGROUND;
                break;
            case 5:
                n9Var = bw5.n9.NOTIFY;
                break;
            case 6:
                n9Var = bw5.n9.REVOKE_REDDOT;
                break;
            case 7:
                n9Var = bw5.n9.SHOP_ENTRANCE_CLICK;
                break;
            default:
                n9Var = null;
                break;
        }
        this.f111656d = n9Var;
        zArr[1] = true;
        return 0;
    }
}
