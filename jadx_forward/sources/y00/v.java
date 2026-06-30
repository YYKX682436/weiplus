package y00;

/* loaded from: classes3.dex */
public final class v implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.LinearLayout f540086d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.r2 f540087e;

    public v(android.widget.LinearLayout linearLayout, p3325xe03a0797.p3326xc267989b.r2 r2Var) {
        this.f540086d = linearLayout;
        this.f540087e = r2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.widget.LinearLayout linearLayout = this.f540086d;
        if (linearLayout.getTag(com.p314xaae8f345.mm.R.id.t66) == this.f540087e) {
            linearLayout.setTag(com.p314xaae8f345.mm.R.id.t66, null);
        }
    }
}
