package com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c;

/* renamed from: com.tencent.wechat.aff.newlife.ReddotInfo */
/* loaded from: classes2.dex */
public class C27453xc05a2006 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: DEFAULT_INSTANCE */
    private static final com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27453xc05a2006 f60277xb3e828f3 = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27453xc05a2006();

    /* renamed from: expose_interval */
    public long f60280x6dfbfee0 = 0;

    /* renamed from: ctrl_type */
    public int f60279xb4c2508e = 0;

    /* renamed from: bypass_info */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f60278x3d9b81a5 = com.p314xaae8f345.mm.p2495xc50a8b8b.g.f273688b;

    /* renamed from: mention_count */
    public long f60281x7fd13a7a = 0;

    /* renamed from: create */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27453xc05a2006 m116197xaf65a0fc() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27453xc05a2006();
    }

    /* renamed from: getDefaultInstance */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27453xc05a2006 m116198x7c90cfc0() {
        return f60277xb3e828f3;
    }

    /* renamed from: newBuilder */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27453xc05a2006 m116199x3136c9db() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27453xc05a2006();
    }

    /* renamed from: build */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27453xc05a2006 m116200x59bc66e() {
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27453xc05a2006)) {
            return false;
        }
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27453xc05a2006 c27453xc05a2006 = (com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27453xc05a2006) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f60280x6dfbfee0), java.lang.Long.valueOf(c27453xc05a2006.f60280x6dfbfee0)) && n51.f.a(java.lang.Integer.valueOf(this.f60279xb4c2508e), java.lang.Integer.valueOf(c27453xc05a2006.f60279xb4c2508e)) && n51.f.a(this.f60278x3d9b81a5, c27453xc05a2006.f60278x3d9b81a5) && n51.f.a(java.lang.Long.valueOf(this.f60281x7fd13a7a), java.lang.Long.valueOf(c27453xc05a2006.f60281x7fd13a7a));
    }

    /* renamed from: getBypassInfo */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g m116201xcf2b49ac() {
        return this.f60278x3d9b81a5;
    }

    /* renamed from: getBypass_info */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g m116202x1771c86f() {
        return this.f60278x3d9b81a5;
    }

    /* renamed from: getCtrlType */
    public int m116203x68e3d5bb() {
        return this.f60279xb4c2508e;
    }

    /* renamed from: getCtrl_type */
    public int m116204xb42fc1d8() {
        return this.f60279xb4c2508e;
    }

    /* renamed from: getExposeInterval */
    public long m116205x273d259f() {
        return this.f60280x6dfbfee0;
    }

    /* renamed from: getExpose_interval */
    public long m116206x525dd0aa() {
        return this.f60280x6dfbfee0;
    }

    /* renamed from: getMentionCount */
    public long m116207xd729f7bb() {
        return this.f60281x7fd13a7a;
    }

    /* renamed from: getMention_count */
    public long m116208x3d30f6c4() {
        return this.f60281x7fd13a7a;
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27453xc05a2006 m116209x60f45402(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        mo11468x92b714fd(fVar.m75960xfb7e5820());
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27453xc05a2006();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.h(1, this.f60280x6dfbfee0);
            fVar.e(2, this.f60279xb4c2508e);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f60278x3d9b81a5;
            if (gVar != null) {
                fVar.b(3, gVar);
            }
            fVar.h(4, this.f60281x7fd13a7a);
            return 0;
        }
        if (i17 == 1) {
            int h17 = b36.f.h(1, this.f60280x6dfbfee0) + 0 + b36.f.e(2, this.f60279xb4c2508e);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f60278x3d9b81a5;
            if (gVar2 != null) {
                h17 += b36.f.b(3, gVar2);
            }
            return h17 + b36.f.h(4, this.f60281x7fd13a7a);
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
            this.f60280x6dfbfee0 = aVar2.i(intValue);
            return 0;
        }
        if (intValue == 2) {
            this.f60279xb4c2508e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            this.f60278x3d9b81a5 = aVar2.d(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        this.f60281x7fd13a7a = aVar2.i(intValue);
        return 0;
    }

    /* renamed from: setBypassInfo */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27453xc05a2006 m116211xfd4f97b8(com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar) {
        this.f60278x3d9b81a5 = gVar;
        return this;
    }

    /* renamed from: setBypass_info */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27453xc05a2006 m116212xadd73be3(com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar) {
        this.f60278x3d9b81a5 = gVar;
        return this;
    }

    /* renamed from: setCtrlType */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27453xc05a2006 m116213x639c36c7(int i17) {
        this.f60279xb4c2508e = i17;
        return this;
    }

    /* renamed from: setCtrl_type */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27453xc05a2006 m116214x1083824c(int i17) {
        this.f60279xb4c2508e = i17;
        return this;
    }

    /* renamed from: setExposeInterval */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27453xc05a2006 m116215xef338dab(long j17) {
        this.f60280x6dfbfee0 = j17;
        return this;
    }

    /* renamed from: setExpose_interval */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27453xc05a2006 m116216x89346a1e(long j17) {
        this.f60280x6dfbfee0 = j17;
        return this;
    }

    /* renamed from: setMentionCount */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27453xc05a2006 m116217xd72f2c7(long j17) {
        this.f60281x7fd13a7a = j17;
        return this;
    }

    /* renamed from: setMention_count */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27453xc05a2006 m116218xd0075d38(long j17) {
        this.f60281x7fd13a7a = j17;
        return this;
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27453xc05a2006 m116210x60f45402(byte[] bArr) {
        mo11468x92b714fd(bArr);
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27453xc05a2006 mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27453xc05a2006) super.mo11468x92b714fd(bArr);
    }
}
