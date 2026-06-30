package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011B!\b\u0016\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0010\u0010\u0014J\u0010\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/tencent/mm/plugin/finder/view/LoadingSwitchBtn;", "Lcom/tencent/mm/ui/widget/MMSwitchBtn;", "Laz2/f;", "loadingComponent", "Ljz5/f0;", "setDelayLoading", p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3025x7c20d01a, "Laz2/f;", "getLoadingComponent", "()Laz2/f;", "setLoadingComponent", "(Laz2/f;)V", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder-base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.view.LoadingSwitchBtn */
/* loaded from: classes3.dex */
public final class C15371xf336b8cc extends com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8 {
    public final java.lang.String R;

    /* renamed from: S, reason: from kotlin metadata */
    public az2.f loadingComponent;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15371xf336b8cc(android.content.Context context, android.util.AttributeSet attrs) {
        super(context, attrs);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(attrs, "attrs");
        this.R = "Finder.LoadingSwitchBtn";
    }

    public final void g(p3325xe03a0797.p3326xc267989b.y0 scope, yz5.a currentState, yz5.p onChanged) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scope, "scope");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(currentState, "currentState");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onChanged, "onChanged");
        setEnabled(true);
        m81396xb3e0a10a(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.pr(currentState, this, scope, onChanged));
    }

    public final az2.f getLoadingComponent() {
        return this.loadingComponent;
    }

    /* renamed from: setDelayLoading */
    public final void m62455x247c23bb(az2.f fVar) {
        this.loadingComponent = fVar;
    }

    /* renamed from: setLoadingComponent */
    public final void m62456xbb68fba3(az2.f fVar) {
        this.loadingComponent = fVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15371xf336b8cc(android.content.Context context, android.util.AttributeSet attrs, int i17) {
        super(context, attrs, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(attrs, "attrs");
        this.R = "Finder.LoadingSwitchBtn";
    }
}
