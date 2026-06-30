package androidx.preference;

/* loaded from: classes13.dex */
public class i implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.preference.ListPreferenceDialogFragmentCompat f11828d;

    public i(androidx.preference.ListPreferenceDialogFragmentCompat listPreferenceDialogFragmentCompat) {
        this.f11828d = listPreferenceDialogFragmentCompat;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        androidx.preference.ListPreferenceDialogFragmentCompat listPreferenceDialogFragmentCompat = this.f11828d;
        listPreferenceDialogFragmentCompat.f11738o = i17;
        listPreferenceDialogFragmentCompat.onClick(dialogInterface, -1);
        dialogInterface.dismiss();
    }
}
