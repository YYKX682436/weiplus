package androidx.preference;

/* loaded from: classes13.dex */
public class ListPreferenceDialogFragmentCompat extends androidx.preference.PreferenceDialogFragmentCompat {

    /* renamed from: o, reason: collision with root package name */
    public int f11738o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.CharSequence[] f11739p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.CharSequence[] f11740q;

    @Override // androidx.preference.PreferenceDialogFragmentCompat
    public void n0(boolean z17) {
        int i17;
        androidx.preference.ListPreference listPreference = (androidx.preference.ListPreference) l0();
        if (!z17 || (i17 = this.f11738o) < 0) {
            return;
        }
        java.lang.String charSequence = this.f11740q[i17].toString();
        if (listPreference.d(charSequence)) {
            listPreference.N(charSequence);
        }
    }

    @Override // androidx.preference.PreferenceDialogFragmentCompat
    public void o0(androidx.appcompat.app.l lVar) {
        java.lang.CharSequence[] charSequenceArr = this.f11739p;
        int i17 = this.f11738o;
        androidx.preference.i iVar = new androidx.preference.i(this);
        androidx.appcompat.app.h hVar = lVar.f9193a;
        hVar.f9141m = charSequenceArr;
        hVar.f9143o = iVar;
        hVar.f9148t = i17;
        hVar.f9147s = true;
        hVar.f9135g = null;
        hVar.f9136h = null;
    }

    @Override // androidx.preference.PreferenceDialogFragmentCompat, androidx.fragment.app.DialogFragment, com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        java.lang.CharSequence[] charSequenceArr;
        super.onCreate(bundle);
        if (bundle != null) {
            this.f11738o = bundle.getInt("ListPreferenceDialogFragment.index", 0);
            this.f11739p = bundle.getCharSequenceArray("ListPreferenceDialogFragment.entries");
            this.f11740q = bundle.getCharSequenceArray("ListPreferenceDialogFragment.entryValues");
            return;
        }
        androidx.preference.ListPreference listPreference = (androidx.preference.ListPreference) l0();
        if (listPreference.X == null || (charSequenceArr = listPreference.Y) == null) {
            throw new java.lang.IllegalStateException("ListPreference requires an entries array and an entryValues array.");
        }
        java.lang.String str = listPreference.Z;
        int i17 = -1;
        if (str != null && charSequenceArr != null) {
            int length = charSequenceArr.length - 1;
            while (true) {
                if (length < 0) {
                    break;
                }
                if (listPreference.Y[length].equals(str)) {
                    i17 = length;
                    break;
                }
                length--;
            }
        }
        this.f11738o = i17;
        this.f11739p = listPreference.X;
        this.f11740q = listPreference.Y;
    }

    @Override // androidx.preference.PreferenceDialogFragmentCompat, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onSaveInstanceState(android.os.Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("ListPreferenceDialogFragment.index", this.f11738o);
        bundle.putCharSequenceArray("ListPreferenceDialogFragment.entries", this.f11739p);
        bundle.putCharSequenceArray("ListPreferenceDialogFragment.entryValues", this.f11740q);
    }
}
