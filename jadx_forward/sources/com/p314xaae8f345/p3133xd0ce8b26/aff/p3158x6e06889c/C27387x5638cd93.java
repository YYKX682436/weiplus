package com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c;

/* renamed from: com.tencent.wechat.aff.newlife.DSLRender */
/* loaded from: classes8.dex */
public class C27387x5638cd93 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: DEFAULT_INSTANCE */
    private static final com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27387x5638cd93 f59736xb3e828f3 = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27387x5638cd93();

    /* renamed from: render */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081 f59737xc84b4196 = com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081.m115328x7c90cfc0();

    /* renamed from: create */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27387x5638cd93 m113948xaf65a0fc() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27387x5638cd93();
    }

    /* renamed from: getDefaultInstance */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27387x5638cd93 m113949x7c90cfc0() {
        return f59736xb3e828f3;
    }

    /* renamed from: newBuilder */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27387x5638cd93 m113950x3136c9db() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27387x5638cd93();
    }

    /* renamed from: build */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27387x5638cd93 m113951x59bc66e() {
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        return fVar != null && (fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27387x5638cd93) && n51.f.a(this.f59737xc84b4196, ((com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27387x5638cd93) fVar).f59737xc84b4196);
    }

    /* renamed from: getRender */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081 m113952x2d62648c() {
        return this.f59737xc84b4196;
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27387x5638cd93 m113953x60f45402(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        mo11468x92b714fd(fVar.m75960xfb7e5820());
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27387x5638cd93();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081 c27428x69240081 = this.f59737xc84b4196;
            if (c27428x69240081 != null) {
                fVar.i(1, c27428x69240081.mo75928xcd1e8d8());
                this.f59737xc84b4196.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081 c27428x692400812 = this.f59737xc84b4196;
            if (c27428x692400812 != null) {
                return 0 + b36.f.i(1, c27428x692400812.mo75928xcd1e8d8());
            }
            return 0;
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
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081 c27428x692400813 = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081();
            if (bArr != null && bArr.length > 0) {
                c27428x692400813.mo11468x92b714fd(bArr);
            }
            this.f59737xc84b4196 = c27428x692400813;
        }
        return 0;
    }

    /* renamed from: setRender */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27387x5638cd93 m113955x20979898(com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27428x69240081 c27428x69240081) {
        this.f59737xc84b4196 = c27428x69240081;
        return this;
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27387x5638cd93 m113954x60f45402(byte[] bArr) {
        mo11468x92b714fd(bArr);
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27387x5638cd93 mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27387x5638cd93) super.mo11468x92b714fd(bArr);
    }
}
