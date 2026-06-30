package bw5;

/* loaded from: classes16.dex */
public class yk extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public bw5.xk f117062d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f117063e;

    /* renamed from: f, reason: collision with root package name */
    public int f117064f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f117065g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f117066h;

    /* renamed from: i, reason: collision with root package name */
    public int f117067i;

    /* renamed from: m, reason: collision with root package name */
    public final boolean[] f117068m = new boolean[7];

    static {
        new bw5.yk();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.yk mo11468x92b714fd(byte[] bArr) {
        return (bw5.yk) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.yk)) {
            return false;
        }
        bw5.yk ykVar = (bw5.yk) fVar;
        return n51.f.a(this.f117062d, ykVar.f117062d) && n51.f.a(this.f117063e, ykVar.f117063e) && n51.f.a(java.lang.Integer.valueOf(this.f117064f), java.lang.Integer.valueOf(ykVar.f117064f)) && n51.f.a(this.f117065g, ykVar.f117065g) && n51.f.a(this.f117066h, ykVar.f117066h) && n51.f.a(java.lang.Integer.valueOf(this.f117067i), java.lang.Integer.valueOf(ykVar.f117067i));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.yk();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        bw5.xk xkVar;
        int i18 = 0;
        boolean[] zArr = this.f117068m;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            bw5.xk xkVar2 = this.f117062d;
            if (xkVar2 != null && zArr[1]) {
                fVar.e(1, xkVar2.f116710d);
            }
            java.lang.String str = this.f117063e;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            if (zArr[3]) {
                fVar.e(3, this.f117064f);
            }
            java.lang.String str2 = this.f117065g;
            if (str2 != null && zArr[4]) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f117066h;
            if (str3 != null && zArr[5]) {
                fVar.j(5, str3);
            }
            if (zArr[6]) {
                fVar.e(6, this.f117067i);
            }
            return 0;
        }
        if (i17 == 1) {
            bw5.xk xkVar3 = this.f117062d;
            if (xkVar3 != null && zArr[1]) {
                i18 = 0 + b36.f.e(1, xkVar3.f116710d);
            }
            java.lang.String str4 = this.f117063e;
            if (str4 != null && zArr[2]) {
                i18 += b36.f.j(2, str4);
            }
            if (zArr[3]) {
                i18 += b36.f.e(3, this.f117064f);
            }
            java.lang.String str5 = this.f117065g;
            if (str5 != null && zArr[4]) {
                i18 += b36.f.j(4, str5);
            }
            java.lang.String str6 = this.f117066h;
            if (str6 != null && zArr[5]) {
                i18 += b36.f.j(5, str6);
            }
            return zArr[6] ? i18 + b36.f.e(6, this.f117067i) : i18;
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
        switch (intValue) {
            case 1:
                switch (aVar2.g(intValue)) {
                    case 0:
                        xkVar = bw5.xk.Unknown;
                        break;
                    case 1:
                        xkVar = bw5.xk.Reward;
                        break;
                    case 2:
                        xkVar = bw5.xk.GlobalReward;
                        break;
                    case 3:
                        xkVar = bw5.xk.GameRank;
                        break;
                    case 4:
                        xkVar = bw5.xk.Intimacy;
                        break;
                    case 5:
                        xkVar = bw5.xk.Role;
                        break;
                    case 6:
                        xkVar = bw5.xk.GameEsport;
                        break;
                    case 7:
                        xkVar = bw5.xk.Concert;
                        break;
                    case 8:
                        xkVar = bw5.xk.Invisiable;
                        break;
                    case 9:
                        xkVar = bw5.xk.Member;
                        break;
                    case 10:
                        xkVar = bw5.xk.Mysterious;
                        break;
                    case 11:
                        xkVar = bw5.xk.GloryList;
                        break;
                    case 12:
                        xkVar = bw5.xk.SuperFans;
                        break;
                    case 13:
                        xkVar = bw5.xk.PayCnt;
                        break;
                    case 14:
                        xkVar = bw5.xk.OrdinaryBuyer;
                        break;
                    case 15:
                        xkVar = bw5.xk.Follower;
                        break;
                    case 16:
                        xkVar = bw5.xk.FrequentWatch;
                        break;
                    case 17:
                        xkVar = bw5.xk.SeniorBuyer;
                        break;
                    case 18:
                        xkVar = bw5.xk.Anonymity;
                        break;
                    case 19:
                        xkVar = bw5.xk.Location;
                        break;
                    case 20:
                        xkVar = bw5.xk.ShopMember;
                        break;
                    default:
                        xkVar = null;
                        break;
                }
                this.f117062d = xkVar;
                zArr[1] = true;
                return 0;
            case 2:
                this.f117063e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f117064f = aVar2.g(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f117065g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f117066h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f117067i = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            default:
                return -1;
        }
    }
}
