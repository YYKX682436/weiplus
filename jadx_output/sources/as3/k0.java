package as3;

/* loaded from: classes5.dex */
public final class k0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.tab.view.ProfileLiveNotifyTextLayout f13520d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f13521e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f13522f;

    public k0(com.tencent.mm.plugin.profile.ui.tab.view.ProfileLiveNotifyTextLayout profileLiveNotifyTextLayout, android.view.View view, android.view.View view2) {
        this.f13520d = profileLiveNotifyTextLayout;
        this.f13521e = view;
        this.f13522f = view2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.graphics.Rect rect = new android.graphics.Rect();
        int b17 = i65.a.b(this.f13520d.getContext(), 24);
        android.view.View view = this.f13521e;
        view.getHitRect(rect);
        rect.left -= b17;
        rect.top -= b17;
        rect.right += b17;
        rect.bottom += b17;
        this.f13522f.setTouchDelegate(new android.view.TouchDelegate(rect, view));
    }
}
