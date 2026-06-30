package com.p314xaae8f345.mm.p2793xcfa97743;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\b\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u001c\u0010\t\u001a\u00020\u00072\u0014\u0010\b\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u00070\u0005¨\u0006\u0010"}, d2 = {"Lcom/tencent/mm/voipmp/LifeCycledFrameLayout;", "Landroid/widget/FrameLayout;", "Landroidx/lifecycle/y;", "Landroidx/lifecycle/o;", "getLifecycle", "Lkotlin/Function1;", "Landroid/content/res/Configuration;", "Ljz5/f0;", com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1928x4237fde6.CastExtraArgs.f5946x7ee2b4b4, "setOnConfigurationChangedListener", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-voipmp_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.voipmp.LifeCycledFrameLayout */
/* loaded from: classes5.dex */
public final class C22882x6b43f41d extends android.widget.FrameLayout implements p012xc85e97e9.p093xedfae76a.y {

    /* renamed from: d, reason: collision with root package name */
    public final p012xc85e97e9.p093xedfae76a.b0 f295293d;

    /* renamed from: e, reason: collision with root package name */
    public yz5.l f295294e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22882x6b43f41d(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f295293d = new p012xc85e97e9.p093xedfae76a.b0(this, true);
    }

    @Override // p012xc85e97e9.p093xedfae76a.y
    /* renamed from: getLifecycle */
    public p012xc85e97e9.p093xedfae76a.o mo273xed6858b4() {
        return this.f295293d;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ILinkVoIP.LifeCycledFrameLayout", "onAttachedToWindow: ");
        p012xc85e97e9.p093xedfae76a.b0 b0Var = this.f295293d;
        b0Var.f(p012xc85e97e9.p093xedfae76a.m.ON_START);
        b0Var.f(p012xc85e97e9.p093xedfae76a.m.ON_RESUME);
    }

    @Override // android.view.View
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        super.onConfigurationChanged(configuration);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ILinkVoIP.LifeCycledFrameLayout", "onConfigurationChanged: " + configuration);
        yz5.l lVar = this.f295294e;
        if (lVar != null) {
            lVar.mo146xb9724478(configuration);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ILinkVoIP.LifeCycledFrameLayout", "onDetachedFromWindow: ");
        p012xc85e97e9.p093xedfae76a.b0 b0Var = this.f295293d;
        b0Var.f(p012xc85e97e9.p093xedfae76a.m.ON_PAUSE);
        b0Var.f(p012xc85e97e9.p093xedfae76a.m.ON_STOP);
    }

    /* renamed from: setOnConfigurationChangedListener */
    public final void m82955x4f5c2e33(yz5.l listener) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listener, "listener");
        this.f295294e = listener;
    }
}
