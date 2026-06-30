package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\b\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dB!\b\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001e\u001a\u00020\u0007¢\u0006\u0004\b\u001c\u0010\u001fJ\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003R\u001b\u0010\f\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001b\u0010\u000f\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\t\u001a\u0004\b\u000e\u0010\u000bR*\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006 "}, d2 = {"Lcom/tencent/mm/plugin/finder/live/widget/FinderLiveTaskBannerViewNew;", "Landroid/widget/FrameLayout;", "Lcom/tencent/mm/plugin/finder/live/widget/yl;", "", "str", "Ljz5/f0;", "setMarqueeText", "", "h", "Ljz5/g;", "getEdge13A", "()I", "edge13A", "i", "getEdge2A", "edge2A", "Lkotlin/Function0;", "m", "Lyz5/a;", "getOnSelectedListener", "()Lyz5/a;", "setOnSelectedListener", "(Lyz5/a;)V", "onSelectedListener", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.live.widget.FinderLiveTaskBannerViewNew */
/* loaded from: classes3.dex */
public final class C14408x406bfa38 extends android.widget.FrameLayout implements com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.yl {

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f199219d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14334xd566b302 f199220e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f199221f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f199222g;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public final jz5.g edge13A;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    public final jz5.g edge2A;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    public yz5.a onSelectedListener;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14408x406bfa38(android.content.Context context, android.util.AttributeSet attrs) {
        super(context, attrs);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(attrs, "attrs");
        this.edge13A = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.yw(this));
        this.edge2A = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.zw(this));
        a(context);
    }

    /* renamed from: getEdge13A */
    private final int m57937xcd21574c() {
        return ((java.lang.Number) this.edge13A.mo141623x754a37bb()).intValue();
    }

    /* renamed from: getEdge2A */
    private final int m57938x17221bc2() {
        return ((java.lang.Number) this.edge2A.mo141623x754a37bb()).intValue();
    }

    public final void a(android.content.Context context) {
        android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.dt9, this);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "inflate(...)");
        this.f199219d = inflate;
        android.view.View findViewById = inflate.findViewById(com.p314xaae8f345.mm.R.id.rv7);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f199220e = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14334xd566b302) findViewById;
        android.view.View view = this.f199219d;
        if (view == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("root");
            throw null;
        }
        android.view.View findViewById2 = view.findViewById(com.p314xaae8f345.mm.R.id.rv9);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f199221f = findViewById2;
        android.view.View view2 = this.f199219d;
        if (view2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("root");
            throw null;
        }
        android.view.View findViewById3 = view2.findViewById(com.p314xaae8f345.mm.R.id.rv8);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        this.f199222g = findViewById3;
    }

    public final yz5.a getOnSelectedListener() {
        return this.onSelectedListener;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.yl
    public void j(boolean z17) {
        if (!z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14334xd566b302 c14334xd566b302 = this.f199220e;
            if (c14334xd566b302 != null) {
                c14334xd566b302.b();
                return;
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("txtView");
                throw null;
            }
        }
        yz5.a aVar = this.onSelectedListener;
        if (aVar != null) {
            aVar.mo152xb9724478();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14334xd566b302 c14334xd566b3022 = this.f199220e;
        if (c14334xd566b3022 != null) {
            c14334xd566b3022.c();
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("txtView");
            throw null;
        }
    }

    /* renamed from: setMarqueeText */
    public final void m57940x25977aad(java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str, "str");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14334xd566b302 c14334xd566b302 = this.f199220e;
        if (c14334xd566b302 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("txtView");
            throw null;
        }
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14334xd566b302.f197555q;
        c14334xd566b302.d(str, true);
    }

    /* renamed from: setOnSelectedListener */
    public final void m57941x9904e870(yz5.a aVar) {
        this.onSelectedListener = aVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14408x406bfa38(android.content.Context context, android.util.AttributeSet attrs, int i17) {
        super(context, attrs, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(attrs, "attrs");
        this.edge13A = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.yw(this));
        this.edge2A = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.zw(this));
        a(context);
    }
}
