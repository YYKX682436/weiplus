package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

/* loaded from: classes10.dex */
public final class ij extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f213841d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15342x9031fe70 f213842e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f213843f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ij(boolean z17, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15342x9031fe70 c15342x9031fe70, int i17) {
        super(0);
        this.f213841d = z17;
        this.f213842e = c15342x9031fe70;
        this.f213843f = i17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        boolean z17 = this.f213841d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15342x9031fe70 c15342x9031fe70 = this.f213842e;
        if (z17) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = c15342x9031fe70.f212983m;
            if (c22699x3dcdb352 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("highLightIcon");
                throw null;
            }
            c22699x3dcdb352.m82040x7541828(this.f213843f);
        } else {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3522 = c15342x9031fe70.f212983m;
            if (c22699x3dcdb3522 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("highLightIcon");
                throw null;
            }
            c22699x3dcdb3522.setVisibility(4);
        }
        return jz5.f0.f384359a;
    }
}
