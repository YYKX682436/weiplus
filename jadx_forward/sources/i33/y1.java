package i33;

/* loaded from: classes.dex */
public final class y1 extends i33.d {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y1(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        android.view.View mo144222x4ff8c0f0 = mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.o17);
        if (mo144222x4ff8c0f0 != null) {
            android.view.ViewGroup.LayoutParams layoutParams = mo144222x4ff8c0f0.getLayoutParams();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
            android.widget.RelativeLayout.LayoutParams layoutParams2 = (android.widget.RelativeLayout.LayoutParams) layoutParams;
            layoutParams2.removeRule(11);
            mo144222x4ff8c0f0.setLayoutParams(layoutParams2);
        }
    }
}
