package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012B#\b\u0016\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0011\u0010\u0015J\b\u0010\u0004\u001a\u00020\u0003H\u0017R\"\u0010\f\u001a\u00020\u00058\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/tencent/mm/plugin/finder/view/FinderVideoBanner;", "Lcom/tencent/mm/plugin/finder/view/FinderBaseMediaBanner;", "Lcom/tencent/mm/plugin/finder/video/FinderVideoLayout;", "", "getContentDescription", "Lcom/tencent/mm/plugin/finder/view/qr;", "n", "Lcom/tencent/mm/plugin/finder/view/qr;", "getMediaType", "()Lcom/tencent/mm/plugin/finder/view/qr;", "setMediaType", "(Lcom/tencent/mm/plugin/finder/view/qr;)V", "mediaType", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.view.FinderVideoBanner */
/* loaded from: classes2.dex */
public final class C15357x7481f361 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.AbstractC15229x2dc379<com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f> {

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.qr mediaType;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15357x7481f361(android.content.Context context) {
        super(context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.mediaType = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.qr.f214440f;
        android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.b2j, (android.view.ViewGroup) this, false);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(inflate, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.video.FinderVideoLayout");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f c15196x85976f5f = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f) inflate;
        addView(c15196x85976f5f, new android.widget.FrameLayout.LayoutParams(-1, -1));
        m61657xdb56be67(c15196x85976f5f);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.AbstractC15229x2dc379
    public android.view.View b() {
        return m61652x7f02fdf3();
    }

    @Override // android.view.View
    public java.lang.CharSequence getContentDescription() {
        cw2.h8 playInfo;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f c15196x85976f5f = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f) m61652x7f02fdf3().findViewById(com.p314xaae8f345.mm.R.id.e_k);
        boolean z17 = false;
        if (c15196x85976f5f != null && (playInfo = c15196x85976f5f.getPlayInfo()) != null && playInfo.f305285h) {
            z17 = true;
        }
        if (z17) {
            java.lang.String string = getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572052xf);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
            return string;
        }
        java.lang.String string2 = getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572044x5);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string2);
        return string2;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.AbstractC15229x2dc379
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.qr getMediaType() {
        return this.mediaType;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.AbstractC15229x2dc379
    /* renamed from: setMediaType */
    public void mo61656xdb5612fc(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.qr qrVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(qrVar, "<set-?>");
        this.mediaType = qrVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15357x7481f361(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.mediaType = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.qr.f214440f;
        android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.b2j, (android.view.ViewGroup) this, false);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(inflate, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.video.FinderVideoLayout");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f c15196x85976f5f = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f) inflate;
        addView(c15196x85976f5f, new android.widget.FrameLayout.LayoutParams(-1, -1));
        m61657xdb56be67(c15196x85976f5f);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15357x7481f361(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.mediaType = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.qr.f214440f;
        android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.b2j, (android.view.ViewGroup) this, false);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(inflate, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.video.FinderVideoLayout");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f c15196x85976f5f = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f) inflate;
        addView(c15196x85976f5f, new android.widget.FrameLayout.LayoutParams(-1, -1));
        m61657xdb56be67(c15196x85976f5f);
    }
}
