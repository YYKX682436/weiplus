package eg2;

/* loaded from: classes3.dex */
public final class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ eg2.n f334091d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f334092e;

    public f(eg2.n nVar, int i17) {
        this.f334091d = nVar;
        this.f334092e = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1497x5a753b7.C14215x6ef072f6 c14215x6ef072f6 = this.f334091d.f334123h;
        if (c14215x6ef072f6 == null) {
            return;
        }
        android.view.ViewParent parent = c14215x6ef072f6.getParent();
        android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
        if (viewGroup == null) {
            return;
        }
        int height = viewGroup.getHeight();
        if (height == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FinderCoverHDCheckboxPlugin", "container height is 0, skip position update");
            return;
        }
        int a17 = ym5.x.a(viewGroup.getContext(), 200.0f);
        int i17 = this.f334092e;
        int measuredHeight = (height - (a17 + i17)) - c14215x6ef072f6.getMeasuredHeight();
        if (measuredHeight < 0) {
            measuredHeight = 0;
        }
        android.view.ViewGroup.LayoutParams layoutParams = c14215x6ef072f6.getLayoutParams();
        android.widget.RelativeLayout.LayoutParams layoutParams2 = layoutParams instanceof android.widget.RelativeLayout.LayoutParams ? (android.widget.RelativeLayout.LayoutParams) layoutParams : null;
        if (layoutParams2 != null) {
            layoutParams2.leftMargin = i17;
            layoutParams2.topMargin = measuredHeight;
        }
        c14215x6ef072f6.setLayoutParams(layoutParams2);
    }
}
