package androidx.preference;

/* loaded from: classes13.dex */
public final class PreferenceScreen extends androidx.preference.PreferenceGroup {
    public final boolean X;

    public PreferenceScreen(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet, d3.r.a(context, com.tencent.mm.R.attr.f478366hx, android.R.attr.preferenceScreenStyle));
        this.X = true;
    }

    @Override // androidx.preference.Preference
    public void t() {
        androidx.preference.a0 a0Var;
        if (this.f11759s != null || this.f11760t != null || O() == 0 || (a0Var = this.f11748e.f11803j) == null) {
            return;
        }
        ((androidx.preference.PreferenceFragmentCompat) a0Var).getActivity();
    }
}
