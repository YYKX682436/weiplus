package com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd;

/* loaded from: classes13.dex */
public final class pv extends com.p314xaae8f345.map.lib.p496xc04b6a6a.AbstractC4234xc56d2fbc {

    /* renamed from: a, reason: collision with root package name */
    private com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26055x88f0336e f132320a;

    /* renamed from: b, reason: collision with root package name */
    private com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tr f132321b;

    public pv(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tr trVar, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26055x88f0336e c26055x88f0336e) {
        this.f132320a = c26055x88f0336e;
        this.f132321b = trVar;
    }

    @Override // com.p314xaae8f345.map.lib.p496xc04b6a6a.AbstractC4234xc56d2fbc
    /* renamed from: getBounds */
    public final android.graphics.Rect mo35238x12a519ab() {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fu a17 = ((com.p314xaae8f345.p519xbf8bc95e.p541xcf19e143.C4430xc2040f9) this.f132321b.e_).mo37464x78d58245().a(com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df.m35328x3017aa(new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26(this.f132320a.m99622x2605e9e2(), this.f132320a.m99623x79d7af9())));
        return new android.graphics.Rect((int) (a17.f131000a - (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hn.o() * 20.0f)), (int) (a17.f131001b - (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hn.o() * 20.0f)), (int) (a17.f131000a + (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hn.o() * 20.0f)), (int) (a17.f131001b + (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hn.o() * 20.0f)));
    }

    @Override // com.p314xaae8f345.map.lib.p496xc04b6a6a.AbstractC4234xc56d2fbc
    /* renamed from: getContentDescription */
    public final java.lang.String mo35239xc77303b9() {
        return this.f132320a.m99624xfb82e301();
    }

    @Override // com.p314xaae8f345.map.lib.p496xc04b6a6a.AbstractC4234xc56d2fbc
    /* renamed from: onClick */
    public final void mo35240xaf6b9ae9() {
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7.OnMapPoiClickListener onMapPoiClickListener;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tr trVar = this.f132321b;
        if (trVar == null || (onMapPoiClickListener = trVar.f133741w) == null) {
            return;
        }
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26055x88f0336e c26055x88f0336e = new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26055x88f0336e();
        c26055x88f0336e.f49554x2c929929 = new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26(this.f132320a.m99622x2605e9e2(), this.f132320a.m99623x79d7af9());
        c26055x88f0336e.f49552x337a8b = this.f132320a.m99624xfb82e301();
        onMapPoiClickListener.mo99162x82f09148(c26055x88f0336e);
    }
}
