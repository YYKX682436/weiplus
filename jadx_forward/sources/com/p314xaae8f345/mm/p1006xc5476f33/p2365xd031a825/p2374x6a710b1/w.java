package com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1;

/* loaded from: classes.dex */
public final class w extends com.p314xaae8f345.mm.p606xf34bc14e.p607x2e06d1.AbstractViewTreeObserverOnGlobalLayoutListenerC4836x37397ddf {

    /* renamed from: d, reason: collision with root package name */
    public boolean f262529d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
    }

    @Override // com.p314xaae8f345.mm.p606xf34bc14e.p607x2e06d1.AbstractViewTreeObserverOnGlobalLayoutListenerC4836x37397ddf
    /* renamed from: initConfig */
    public void mo10031xf3d9c872() {
        m42284x3580e2(com.p314xaae8f345.mm.R.C30864xbddafb2a.d5z).m42300x373aa5(com.p314xaae8f345.mm.R.id.hdh).m42342xb328de9a(12, 12, 12, 12);
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onUserVisibleFocused */
    public void mo58275xd317978f() {
        super.mo58275xd317978f();
        if (this.f262529d) {
            return;
        }
        this.f262529d = true;
        ((android.widget.TextView) m80379x76847179().findViewById(com.p314xaae8f345.mm.R.id.pen)).sendAccessibilityEvent(128);
    }
}
