package yx;

/* loaded from: classes3.dex */
public final class i implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f548565d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f548566e;

    public i(android.view.ViewGroup viewGroup, android.widget.TextView textView) {
        this.f548565d = viewGroup;
        this.f548566e = textView;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        android.view.ViewGroup onlineInfoLayout = this.f548565d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(onlineInfoLayout, "$onlineInfoLayout");
        ly.g.c(onlineInfoLayout, 350L, null, null, null, null, null, new yx.h(this.f548566e, (java.lang.String) obj), 62, null);
    }
}
