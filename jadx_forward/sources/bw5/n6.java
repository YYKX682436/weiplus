package bw5;

/* loaded from: classes9.dex */
public class n6 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public bw5.x9 f112036d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f112037e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f112038f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f112039g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f112040h = new boolean[5];

    static {
        new bw5.n6();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.n6 mo11468x92b714fd(byte[] bArr) {
        return (bw5.n6) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.n6)) {
            return false;
        }
        bw5.n6 n6Var = (bw5.n6) fVar;
        return n51.f.a(this.f112036d, n6Var.f112036d) && n51.f.a(this.f112037e, n6Var.f112037e) && n51.f.a(this.f112038f, n6Var.f112038f) && n51.f.a(this.f112039g, n6Var.f112039g);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.n6();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        bw5.x9 x9Var;
        int i18 = 0;
        boolean[] zArr = this.f112040h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            bw5.x9 x9Var2 = this.f112036d;
            if (x9Var2 != null && zArr[1]) {
                fVar.e(1, x9Var2.f116547d);
            }
            java.lang.String str = this.f112037e;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f112038f;
            if (str2 != null && zArr[3]) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f112039g;
            if (str3 != null && zArr[4]) {
                fVar.j(4, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            bw5.x9 x9Var3 = this.f112036d;
            if (x9Var3 != null && zArr[1]) {
                i18 = 0 + b36.f.e(1, x9Var3.f116547d);
            }
            java.lang.String str4 = this.f112037e;
            if (str4 != null && zArr[2]) {
                i18 += b36.f.j(2, str4);
            }
            java.lang.String str5 = this.f112038f;
            if (str5 != null && zArr[3]) {
                i18 += b36.f.j(3, str5);
            }
            java.lang.String str6 = this.f112039g;
            return (str6 == null || !zArr[4]) ? i18 : i18 + b36.f.j(4, str6);
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
            if (intValue == 2) {
                this.f112037e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            }
            if (intValue == 3) {
                this.f112038f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            }
            if (intValue != 4) {
                return -1;
            }
            this.f112039g = aVar2.k(intValue);
            zArr[4] = true;
            return 0;
        }
        switch (aVar2.g(intValue)) {
            case 0:
                x9Var = bw5.x9.EcsWordDecryptType_Default;
                break;
            case 1:
                x9Var = bw5.x9.EcsWordDecryptType_Username_2_Nickname;
                break;
            case 2:
                x9Var = bw5.x9.EcsWordDecryptType_String_Decrypt;
                break;
            case 3:
                x9Var = bw5.x9.EcsWordDecryptType_String_Encrypt;
                break;
            case 4:
                x9Var = bw5.x9.EcsWordDecryptType_EncryptedUsername_2_Nickname;
                break;
            case 5:
                x9Var = bw5.x9.EcsWordDecryptType_EncryptedUsername_2_NicknameAndStatus;
                break;
            case 6:
                x9Var = bw5.x9.EcsWordDecryptType_EncryptedUsername_2_Nickname_InGroup;
                break;
            default:
                x9Var = null;
                break;
        }
        this.f112036d = x9Var;
        zArr[1] = true;
        return 0;
    }
}
