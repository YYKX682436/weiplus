package androidx.preference;

/* loaded from: classes13.dex */
public class k implements android.content.DialogInterface.OnMultiChoiceClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ androidx.preference.MultiSelectListPreferenceDialogFragmentCompat f11832a;

    public k(androidx.preference.MultiSelectListPreferenceDialogFragmentCompat multiSelectListPreferenceDialogFragmentCompat) {
        this.f11832a = multiSelectListPreferenceDialogFragmentCompat;
    }

    @Override // android.content.DialogInterface.OnMultiChoiceClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17, boolean z17) {
        androidx.preference.MultiSelectListPreferenceDialogFragmentCompat multiSelectListPreferenceDialogFragmentCompat = this.f11832a;
        if (z17) {
            multiSelectListPreferenceDialogFragmentCompat.f11743p = ((java.util.HashSet) multiSelectListPreferenceDialogFragmentCompat.f11742o).add(multiSelectListPreferenceDialogFragmentCompat.f11745r[i17].toString()) | multiSelectListPreferenceDialogFragmentCompat.f11743p;
            return;
        }
        multiSelectListPreferenceDialogFragmentCompat.f11743p = ((java.util.HashSet) multiSelectListPreferenceDialogFragmentCompat.f11742o).remove(multiSelectListPreferenceDialogFragmentCompat.f11745r[i17].toString()) | multiSelectListPreferenceDialogFragmentCompat.f11743p;
    }
}
