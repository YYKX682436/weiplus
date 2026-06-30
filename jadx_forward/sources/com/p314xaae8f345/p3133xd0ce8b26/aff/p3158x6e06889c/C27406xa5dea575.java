package com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c;

/* renamed from: com.tencent.wechat.aff.newlife.FinderContactMsgInfo */
/* loaded from: classes10.dex */
public class C27406xa5dea575 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: DEFAULT_INSTANCE */
    private static final com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27406xa5dea575 f59916xb3e828f3 = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27406xa5dea575();

    /* renamed from: msg_username */
    public java.lang.String f59917x687af3d4 = "";

    /* renamed from: session_id */
    public java.lang.String f59918x630ddf64 = "";

    /* renamed from: create */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27406xa5dea575 m114708xaf65a0fc() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27406xa5dea575();
    }

    /* renamed from: getDefaultInstance */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27406xa5dea575 m114709x7c90cfc0() {
        return f59916xb3e828f3;
    }

    /* renamed from: newBuilder */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27406xa5dea575 m114710x3136c9db() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27406xa5dea575();
    }

    /* renamed from: build */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27406xa5dea575 m114711x59bc66e() {
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27406xa5dea575)) {
            return false;
        }
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27406xa5dea575 c27406xa5dea575 = (com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27406xa5dea575) fVar;
        return n51.f.a(this.f59917x687af3d4, c27406xa5dea575.f59917x687af3d4) && n51.f.a(this.f59918x630ddf64, c27406xa5dea575.f59918x630ddf64);
    }

    /* renamed from: getMsgUsername */
    public java.lang.String m114712x97c0ca41() {
        return this.f59917x687af3d4;
    }

    /* renamed from: getMsg_username */
    public java.lang.String m114713xc96d864a() {
        return this.f59917x687af3d4;
    }

    /* renamed from: getSessionId */
    public java.lang.String m114714x23a7af9b() {
        return this.f59918x630ddf64;
    }

    /* renamed from: getSession_id */
    public java.lang.String m114715x514e975a() {
        return this.f59918x630ddf64;
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27406xa5dea575 m114716x60f45402(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        mo11468x92b714fd(fVar.m75960xfb7e5820());
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27406xa5dea575();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f59917x687af3d4;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f59918x630ddf64;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f59917x687af3d4;
            int j17 = str3 != null ? 0 + b36.f.j(1, str3) : 0;
            java.lang.String str4 = this.f59918x630ddf64;
            return str4 != null ? j17 + b36.f.j(2, str4) : j17;
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
        if (intValue == 1) {
            this.f59917x687af3d4 = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        this.f59918x630ddf64 = aVar2.k(intValue);
        return 0;
    }

    /* renamed from: setMsgUsername */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27406xa5dea575 m114718x2e263db5(java.lang.String str) {
        this.f59917x687af3d4 = str;
        return this;
    }

    /* renamed from: setMsg_username */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27406xa5dea575 m114719xffb68156(java.lang.String str) {
        this.f59917x687af3d4 = str;
        return this;
    }

    /* renamed from: setSessionId */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27406xa5dea575 m114720x7ffb700f(java.lang.String str) {
        this.f59918x630ddf64 = str;
        return this;
    }

    /* renamed from: setSession_id */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27406xa5dea575 m114721x7f72e566(java.lang.String str) {
        this.f59918x630ddf64 = str;
        return this;
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27406xa5dea575 m114717x60f45402(byte[] bArr) {
        mo11468x92b714fd(bArr);
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27406xa5dea575 mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27406xa5dea575) super.mo11468x92b714fd(bArr);
    }
}
