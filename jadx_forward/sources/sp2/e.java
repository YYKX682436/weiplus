package sp2;

/* loaded from: classes2.dex */
public final class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f492550d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.ActivityC14524xdd91c7bb f492551e;

    public e(android.view.View view, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.ActivityC14524xdd91c7bb activityC14524xdd91c7bb) {
        this.f492550d = view;
        this.f492551e = activityC14524xdd91c7bb;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.ViewGroup.LayoutParams layoutParams = this.f492550d.getLayoutParams();
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            marginLayoutParams.topMargin = com.p314xaae8f345.mm.ui.bl.h(this.f492551e);
        }
    }
}
