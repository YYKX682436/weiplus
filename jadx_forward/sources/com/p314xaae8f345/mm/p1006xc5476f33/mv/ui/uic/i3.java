package com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic;

/* loaded from: classes10.dex */
public final class i3 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.h4 f232734d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i3(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.h4 h4Var) {
        super(0);
        this.f232734d = h4Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        final com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.h4 h4Var = this.f232734d;
        final com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.h3 h3Var = h4Var.f232701o;
        return new com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf(new in5.s(h4Var, h3Var) { // from class: com.tencent.mm.plugin.mv.ui.uic.MusicMvMakerFixEditUIC$MusicMVVideoItemConverterFactory
            private final com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.e3 sizeResolver;

            /* renamed from: this$0 */
            final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.h4 f37701xcbdd23aa;

            {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(h3Var, "sizeResolver");
                this.sizeResolver = h3Var;
            }

            @Override // in5.s
            /* renamed from: getItemConvert */
            public in5.r mo43555xf2bb75ea(int type) {
                return new lm3.d(this.sizeResolver, new com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.f3(this.f37701xcbdd23aa));
            }

            public final com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.e3 getSizeResolver() {
                return this.sizeResolver;
            }
        }, h4Var.f232694e, true);
    }
}
