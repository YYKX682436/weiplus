package androidx.preference;

/* loaded from: classes13.dex */
public abstract class DialogPreference extends androidx.preference.Preference {
    public final java.lang.CharSequence R;
    public final java.lang.CharSequence S;
    public final android.graphics.drawable.Drawable T;
    public final java.lang.CharSequence U;
    public final java.lang.CharSequence V;
    public final int W;

    public DialogPreference(android.content.Context context, android.util.AttributeSet attributeSet, int i17, int i18) {
        super(context, attributeSet, i17, i18);
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, androidx.preference.g0.f11817c, i17, i18);
        java.lang.String h17 = d3.r.h(obtainStyledAttributes, 9, 0);
        this.R = h17;
        if (h17 == null) {
            this.R = this.f11754n;
        }
        this.S = d3.r.h(obtainStyledAttributes, 8, 1);
        android.graphics.drawable.Drawable drawable = obtainStyledAttributes.getDrawable(6);
        this.T = drawable == null ? obtainStyledAttributes.getDrawable(2) : drawable;
        this.U = d3.r.h(obtainStyledAttributes, 11, 3);
        this.V = d3.r.h(obtainStyledAttributes, 10, 4);
        this.W = obtainStyledAttributes.getResourceId(7, obtainStyledAttributes.getResourceId(5, 0));
        obtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    public void t() {
        androidx.fragment.app.DialogFragment multiSelectListPreferenceDialogFragmentCompat;
        androidx.preference.z zVar = this.f11748e.f11802i;
        if (zVar != null) {
            androidx.preference.PreferenceFragmentCompat preferenceFragmentCompat = (androidx.preference.PreferenceFragmentCompat) zVar;
            preferenceFragmentCompat.getActivity();
            if (preferenceFragmentCompat.getFragmentManager().findFragmentByTag("androidx.preference.PreferenceFragment.DIALOG") != null) {
                return;
            }
            boolean z17 = this instanceof androidx.preference.EditTextPreference;
            java.lang.String str = this.f11758r;
            if (z17) {
                multiSelectListPreferenceDialogFragmentCompat = new androidx.preference.EditTextPreferenceDialogFragmentCompat();
                android.os.Bundle bundle = new android.os.Bundle(1);
                bundle.putString("key", str);
                multiSelectListPreferenceDialogFragmentCompat.setArguments(bundle);
            } else if (this instanceof androidx.preference.ListPreference) {
                multiSelectListPreferenceDialogFragmentCompat = new androidx.preference.ListPreferenceDialogFragmentCompat();
                android.os.Bundle bundle2 = new android.os.Bundle(1);
                bundle2.putString("key", str);
                multiSelectListPreferenceDialogFragmentCompat.setArguments(bundle2);
            } else {
                if (!(this instanceof androidx.preference.internal.AbstractMultiSelectListPreference)) {
                    throw new java.lang.IllegalArgumentException("Tried to display dialog for unknown preference type. Did you forget to override onDisplayPreferenceDialog()?");
                }
                multiSelectListPreferenceDialogFragmentCompat = new androidx.preference.MultiSelectListPreferenceDialogFragmentCompat();
                android.os.Bundle bundle3 = new android.os.Bundle(1);
                bundle3.putString("key", str);
                multiSelectListPreferenceDialogFragmentCompat.setArguments(bundle3);
            }
            multiSelectListPreferenceDialogFragmentCompat.setTargetFragment(preferenceFragmentCompat, 0);
            multiSelectListPreferenceDialogFragmentCompat.show(preferenceFragmentCompat.getFragmentManager(), "androidx.preference.PreferenceFragment.DIALOG");
        }
    }

    public DialogPreference(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        this(context, attributeSet, i17, 0);
    }

    public DialogPreference(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, d3.r.a(context, com.tencent.mm.R.attr.f478220dy, android.R.attr.dialogPreferenceStyle));
    }
}
