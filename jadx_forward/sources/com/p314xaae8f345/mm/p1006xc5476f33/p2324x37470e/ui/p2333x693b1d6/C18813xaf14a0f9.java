package com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2333x693b1d6;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017B!\b\u0016\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u0016\u0010\u001aJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001b\u0010\u0011\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, d2 = {"Lcom/tencent/mm/plugin/vlog/ui/thumb/SegmentClipThumbSeekBarContainer;", "Landroid/widget/LinearLayout;", "Lbg0/x;", "behaviorHolder", "Ljz5/f0;", "setupBehaviorHolder", "d", "Lbg0/x;", "getBehaviorHolder", "()Lbg0/x;", "setBehaviorHolder", "(Lbg0/x;)V", "Lcom/tencent/mm/plugin/mmsight/segment/e;", "h", "Ljz5/g;", "getTrackViewGestureListener", "()Lcom/tencent/mm/plugin/mmsight/segment/e;", "trackViewGestureListener", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-vlog_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.vlog.ui.thumb.SegmentClipThumbSeekBarContainer */
/* loaded from: classes5.dex */
public final class C18813xaf14a0f9 extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public bg0.x behaviorHolder;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2333x693b1d6.C18808xd1643539 f257583e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.f f257584f;

    /* renamed from: g, reason: collision with root package name */
    public bg0.y f257585g;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public final jz5.g trackViewGestureListener;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18813xaf14a0f9(android.content.Context context) {
        super(context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.trackViewGestureListener = jz5.h.a(jz5.i.f384364f, new kp4.r0(this));
        android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.cjf, (android.view.ViewGroup) this, true);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(inflate, "null cannot be cast to non-null type android.widget.LinearLayout");
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) inflate;
        android.view.KeyEvent.Callback findViewById = linearLayout.findViewById(com.p314xaae8f345.mm.R.id.o6x);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.f fVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.f) findViewById;
        this.f257584f = fVar;
        android.view.View findViewById2 = linearLayout.findViewById(com.p314xaae8f345.mm.R.id.jee);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f257583e = (com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2333x693b1d6.C18808xd1643539) findViewById2;
        fVar.mo66928x9f7795c5(m72648xca3b01e3());
    }

    /* renamed from: getTrackViewGestureListener */
    private final com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.e m72648xca3b01e3() {
        return (com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.e) this.trackViewGestureListener.mo141623x754a37bb();
    }

    public final bg0.x getBehaviorHolder() {
        return this.behaviorHolder;
    }

    /* renamed from: setBehaviorHolder */
    public final void m72650x563a1ba0(bg0.x xVar) {
        this.behaviorHolder = xVar;
    }

    /* renamed from: setupBehaviorHolder */
    public final void m72651x49ac4e7b(bg0.x behaviorHolder) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(behaviorHolder, "behaviorHolder");
        this.behaviorHolder = behaviorHolder;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18813xaf14a0f9(android.content.Context context, android.util.AttributeSet attrs) {
        super(context, attrs);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(attrs, "attrs");
        this.trackViewGestureListener = jz5.h.a(jz5.i.f384364f, new kp4.r0(this));
        android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.cjf, (android.view.ViewGroup) this, true);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(inflate, "null cannot be cast to non-null type android.widget.LinearLayout");
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) inflate;
        android.view.KeyEvent.Callback findViewById = linearLayout.findViewById(com.p314xaae8f345.mm.R.id.o6x);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.f fVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.f) findViewById;
        this.f257584f = fVar;
        android.view.View findViewById2 = linearLayout.findViewById(com.p314xaae8f345.mm.R.id.jee);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f257583e = (com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2333x693b1d6.C18808xd1643539) findViewById2;
        fVar.mo66928x9f7795c5(m72648xca3b01e3());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18813xaf14a0f9(android.content.Context context, android.util.AttributeSet attrs, int i17) {
        super(context, attrs, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(attrs, "attrs");
        this.trackViewGestureListener = jz5.h.a(jz5.i.f384364f, new kp4.r0(this));
        android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.cjf, (android.view.ViewGroup) this, true);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(inflate, "null cannot be cast to non-null type android.widget.LinearLayout");
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) inflate;
        android.view.KeyEvent.Callback findViewById = linearLayout.findViewById(com.p314xaae8f345.mm.R.id.o6x);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.f fVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.f) findViewById;
        this.f257584f = fVar;
        android.view.View findViewById2 = linearLayout.findViewById(com.p314xaae8f345.mm.R.id.jee);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f257583e = (com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2333x693b1d6.C18808xd1643539) findViewById2;
        fVar.mo66928x9f7795c5(m72648xca3b01e3());
    }
}
