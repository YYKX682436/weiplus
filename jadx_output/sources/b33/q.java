package b33;

/* loaded from: classes2.dex */
public final class q extends androidx.fragment.app.e2 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f17684d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(androidx.fragment.app.FragmentManager fm6, java.util.List fragments) {
        super(fm6, 1);
        kotlin.jvm.internal.o.g(fm6, "fm");
        kotlin.jvm.internal.o.g(fragments, "fragments");
        this.f17684d = fragments;
    }

    @Override // androidx.viewpager.widget.a
    public int getCount() {
        return this.f17684d.size();
    }

    @Override // androidx.fragment.app.e2
    public androidx.fragment.app.Fragment getItem(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MediaTabPickerAdapter", "FragmentPagerAdapter getItem position:" + i17);
        return (androidx.fragment.app.Fragment) this.f17684d.get(i17);
    }
}
