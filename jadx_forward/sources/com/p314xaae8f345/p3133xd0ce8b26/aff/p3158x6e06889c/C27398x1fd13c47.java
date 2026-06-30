package com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c;

/* renamed from: com.tencent.wechat.aff.newlife.FinderCmdItem */
/* loaded from: classes8.dex */
public class C27398x1fd13c47 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: DEFAULT_INSTANCE */
    private static final com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27398x1fd13c47 f59836xb3e828f3 = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27398x1fd13c47();

    /* renamed from: cmdId */
    public int f59838x5a623f5 = 0;

    /* renamed from: cmdBuf */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f59837xaf1e42d9 = com.p314xaae8f345.mm.p2495xc50a8b8b.g.f273688b;

    /* renamed from: finderUsername */
    public java.lang.String f59839xa53ddf1c = "";

    /* renamed from: create */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27398x1fd13c47 m114384xaf65a0fc() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27398x1fd13c47();
    }

    /* renamed from: getDefaultInstance */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27398x1fd13c47 m114385x7c90cfc0() {
        return f59836xb3e828f3;
    }

    /* renamed from: newBuilder */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27398x1fd13c47 m114386x3136c9db() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27398x1fd13c47();
    }

    /* renamed from: build */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27398x1fd13c47 m114387x59bc66e() {
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27398x1fd13c47)) {
            return false;
        }
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27398x1fd13c47 c27398x1fd13c47 = (com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27398x1fd13c47) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f59838x5a623f5), java.lang.Integer.valueOf(c27398x1fd13c47.f59838x5a623f5)) && n51.f.a(this.f59837xaf1e42d9, c27398x1fd13c47.f59837xaf1e42d9) && n51.f.a(this.f59839xa53ddf1c, c27398x1fd13c47.f59839xa53ddf1c);
    }

    /* renamed from: getCmdBuf */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g m114388x143565cf() {
        return this.f59837xaf1e42d9;
    }

    /* renamed from: getCmdId */
    public int m114389x7443ca3f() {
        return this.f59838x5a623f5;
    }

    /* renamed from: getFinderUsername */
    public java.lang.String m114390x93d5ac12() {
        return this.f59839xa53ddf1c;
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27398x1fd13c47 m114391x60f45402(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        mo11468x92b714fd(fVar.m75960xfb7e5820());
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27398x1fd13c47();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f59838x5a623f5);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f59837xaf1e42d9;
            if (gVar != null) {
                fVar.b(2, gVar);
            }
            java.lang.String str = this.f59839xa53ddf1c;
            if (str != null) {
                fVar.j(3, str);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f59838x5a623f5) + 0;
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f59837xaf1e42d9;
            if (gVar2 != null) {
                e17 += b36.f.b(2, gVar2);
            }
            java.lang.String str2 = this.f59839xa53ddf1c;
            return str2 != null ? e17 + b36.f.j(3, str2) : e17;
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
            this.f59838x5a623f5 = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            this.f59837xaf1e42d9 = aVar2.d(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        this.f59839xa53ddf1c = aVar2.k(intValue);
        return 0;
    }

    /* renamed from: setCmdBuf */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27398x1fd13c47 m114393x76a99db(com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar) {
        this.f59837xaf1e42d9 = gVar;
        return this;
    }

    /* renamed from: setCmdId */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27398x1fd13c47 m114394x52d1e4b3(int i17) {
        this.f59838x5a623f5 = i17;
        return this;
    }

    /* renamed from: setFinderUsername */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27398x1fd13c47 m114395x5bcc141e(java.lang.String str) {
        this.f59839xa53ddf1c = str;
        return this;
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27398x1fd13c47 m114392x60f45402(byte[] bArr) {
        mo11468x92b714fd(bArr);
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27398x1fd13c47 mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27398x1fd13c47) super.mo11468x92b714fd(bArr);
    }
}
