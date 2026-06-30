package ep2;

/* loaded from: classes2.dex */
public final class g extends ym5.n0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f337246a;

    public g(android.widget.ImageView imageView) {
        this.f337246a = imageView;
    }

    @Override // ym5.n0
    /* renamed from: onViewExposed */
    public void mo976xcdf5f75c(android.view.View view, long j17, long j18, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        if (z17) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NearbyLiveViewCallback", "#bindActivityIcon onViewExposedListener false, cancel it");
        android.widget.ImageView iconView = this.f337246a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(iconView, "$iconView");
        java.lang.Object tag = iconView.getTag(com.p314xaae8f345.mm.R.id.fuo);
        if (tag instanceof p3325xe03a0797.p3326xc267989b.r2) {
            p3325xe03a0797.p3326xc267989b.p2.a((p3325xe03a0797.p3326xc267989b.r2) tag, null, 1, null);
        }
    }
}
