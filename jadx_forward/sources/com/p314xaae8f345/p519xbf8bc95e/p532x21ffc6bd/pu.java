package com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd;

/* loaded from: classes13.dex */
public final class pu extends com.p314xaae8f345.map.lib.p496xc04b6a6a.AbstractC4234xc56d2fbc {

    /* renamed from: a, reason: collision with root package name */
    private com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.an f132318a;

    /* renamed from: b, reason: collision with root package name */
    private com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tr f132319b;

    public pu(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tr trVar, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.an anVar) {
        this.f132319b = trVar;
        this.f132318a = anVar;
    }

    private static android.graphics.Rect a(android.graphics.Rect rect) {
        if (rect == null) {
            return null;
        }
        int i17 = rect.left;
        int i18 = rect.right;
        int i19 = rect.top;
        int i27 = rect.bottom;
        int i28 = (i18 + i17) / 2;
        int i29 = (i19 + i27) / 2;
        int i37 = i27 - i19;
        if (i18 - i17 < com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hn.o() * 40.0f) {
            float f17 = i28;
            int o17 = (int) (f17 - (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hn.o() * 20.0f));
            i18 = (int) (f17 + (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hn.o() * 20.0f));
            i17 = o17;
        }
        if (i37 < com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hn.o() * 40.0f) {
            float f18 = i29;
            i19 = (int) (f18 - (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hn.o() * 20.0f));
            i27 = (int) (f18 + (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hn.o() * 20.0f));
        }
        return new android.graphics.Rect(i17, i19, i18, i27);
    }

    @Override // com.p314xaae8f345.map.lib.p496xc04b6a6a.AbstractC4234xc56d2fbc
    /* renamed from: getBounds */
    public final android.graphics.Rect mo35238x12a519ab() {
        android.graphics.Rect j17;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.an anVar = this.f132318a;
        if (anVar == null || (j17 = anVar.j()) == null) {
            return null;
        }
        int i17 = j17.left;
        int i18 = j17.right;
        int i19 = j17.top;
        int i27 = j17.bottom;
        int i28 = (i18 + i17) / 2;
        int i29 = (i19 + i27) / 2;
        int i37 = i27 - i19;
        if (i18 - i17 < com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hn.o() * 40.0f) {
            float f17 = i28;
            int o17 = (int) (f17 - (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hn.o() * 20.0f));
            i18 = (int) (f17 + (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hn.o() * 20.0f));
            i17 = o17;
        }
        if (i37 < com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hn.o() * 40.0f) {
            float f18 = i29;
            i19 = (int) (f18 - (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hn.o() * 20.0f));
            i27 = (int) (f18 + (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hn.o() * 20.0f));
        }
        return new android.graphics.Rect(i17, i19, i18, i27);
    }

    @Override // com.p314xaae8f345.map.lib.p496xc04b6a6a.AbstractC4234xc56d2fbc
    /* renamed from: getContentDescription */
    public final java.lang.String mo35239xc77303b9() {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.an anVar = this.f132318a;
        if (anVar == null) {
            return null;
        }
        return anVar.mo36435xc77303b9();
    }

    @Override // com.p314xaae8f345.map.lib.p496xc04b6a6a.AbstractC4234xc56d2fbc
    /* renamed from: onClick */
    public final void mo35240xaf6b9ae9() {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tr trVar = this.f132319b;
        if (trVar != null) {
            com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7.OnMarkerClickListener U = trVar.U();
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.an anVar = this.f132318a;
            if (anVar == null || U == null) {
                return;
            }
            U.mo36533x289a5e0f(anVar);
        }
    }
}
