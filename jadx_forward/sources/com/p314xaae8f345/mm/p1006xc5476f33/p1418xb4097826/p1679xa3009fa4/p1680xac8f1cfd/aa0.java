package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes2.dex */
public final class aa0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f215293d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15482x9b531b34 f215294e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aa0(java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15482x9b531b34 c15482x9b531b34) {
        super(1);
        this.f215293d = str;
        this.f215294e = c15482x9b531b34;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        cw2.da it = (cw2.da) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        cw2.wa f212140n = it.getF212140n();
        java.lang.String str = f212140n != null ? f212140n.f305629c : null;
        java.lang.String mediaId = this.f215293d;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, mediaId) && it.getIsViewFocused() && (it.mo56691xdfac0a65() instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Finder.VideoRecycler", "[videoSourceChange] mediaId=" + mediaId + " isPlaying...");
            cw2.wa f212140n2 = it.getF212140n();
            com.p314xaae8f345.mm.vfs.w6.h(f212140n2 != null ? f212140n2.f305628b : null);
            cu2.x xVar = cu2.x.f303982a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mediaId, "$mediaId");
            so2.i3 c17 = cu2.x.c(xVar, mediaId, false, false, false, 14, null);
            c17.m164896x6761d4f();
            xVar.g(c17, "onlineVideoEventListener");
            this.f215294e.f215208h.mo50293x3498a0(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.z90(it));
        }
        return java.lang.Boolean.FALSE;
    }
}
