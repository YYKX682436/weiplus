package com.p314xaae8f345.mm.p1006xc5476f33.p1701xd2ae381c.p1703xb4097826.p1704x32b0ec.p1705x2e06d1.p1706x373aa5;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u000b"}, d2 = {"Lcom/tencent/mm/plugin/flutter/finder/live/base/view/LifeCycledFrameLayout;", "Landroid/widget/FrameLayout;", "Landroidx/lifecycle/y;", "Landroidx/lifecycle/o;", "getLifecycle", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-flutter-live_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.flutter.finder.live.base.view.LifeCycledFrameLayout */
/* loaded from: classes2.dex */
public final class C15545x6b43f41d extends android.widget.FrameLayout implements p012xc85e97e9.p093xedfae76a.y {

    /* renamed from: d, reason: collision with root package name */
    public final p012xc85e97e9.p093xedfae76a.b0 f218826d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15545x6b43f41d(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f218826d = new p012xc85e97e9.p093xedfae76a.b0(this, true);
    }

    @Override // p012xc85e97e9.p093xedfae76a.y
    /* renamed from: getLifecycle */
    public p012xc85e97e9.p093xedfae76a.o mo273xed6858b4() {
        return this.f218826d;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LifeCycledFrameLayout", "onAttachedToWindow...");
        p012xc85e97e9.p093xedfae76a.b0 b0Var = this.f218826d;
        b0Var.f(p012xc85e97e9.p093xedfae76a.m.ON_CREATE);
        b0Var.f(p012xc85e97e9.p093xedfae76a.m.ON_START);
        b0Var.f(p012xc85e97e9.p093xedfae76a.m.ON_RESUME);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LifeCycledFrameLayout", "onDetachedFromWindow... ");
        p012xc85e97e9.p093xedfae76a.b0 b0Var = this.f218826d;
        b0Var.f(p012xc85e97e9.p093xedfae76a.m.ON_PAUSE);
        b0Var.f(p012xc85e97e9.p093xedfae76a.m.ON_STOP);
        b0Var.f(p012xc85e97e9.p093xedfae76a.m.ON_DESTROY);
    }
}
