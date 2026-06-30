package androidx.preference;

/* loaded from: classes13.dex */
public class MultiSelectListPreferenceDialogFragmentCompat extends androidx.preference.PreferenceDialogFragmentCompat {

    /* renamed from: o, reason: collision with root package name */
    public final java.util.Set f11742o = new java.util.HashSet();

    /* renamed from: p, reason: collision with root package name */
    public boolean f11743p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.CharSequence[] f11744q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.CharSequence[] f11745r;

    @Override // androidx.preference.PreferenceDialogFragmentCompat
    public void n0(boolean z17) {
        androidx.preference.internal.AbstractMultiSelectListPreference abstractMultiSelectListPreference = (androidx.preference.internal.AbstractMultiSelectListPreference) l0();
        if (z17 && this.f11743p) {
            java.util.Set set = this.f11742o;
            if (abstractMultiSelectListPreference.d(set)) {
                abstractMultiSelectListPreference.Q(set);
            }
        }
        this.f11743p = false;
    }

    @Override // androidx.preference.PreferenceDialogFragmentCompat
    public void o0(androidx.appcompat.app.l lVar) {
        int length = this.f11745r.length;
        boolean[] zArr = new boolean[length];
        for (int i17 = 0; i17 < length; i17++) {
            zArr[i17] = ((java.util.HashSet) this.f11742o).contains(this.f11745r[i17].toString());
        }
        java.lang.CharSequence[] charSequenceArr = this.f11744q;
        androidx.preference.k kVar = new androidx.preference.k(this);
        androidx.appcompat.app.h hVar = lVar.f9193a;
        hVar.f9141m = charSequenceArr;
        hVar.f9149u = kVar;
        hVar.f9145q = zArr;
        hVar.f9146r = true;
    }

    @Override // androidx.preference.PreferenceDialogFragmentCompat, androidx.fragment.app.DialogFragment, com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        java.util.Set set = this.f11742o;
        if (bundle != null) {
            ((java.util.HashSet) set).clear();
            set.addAll(bundle.getStringArrayList("MultiSelectListPreferenceDialogFragmentCompat.values"));
            this.f11743p = bundle.getBoolean("MultiSelectListPreferenceDialogFragmentCompat.changed", false);
            this.f11744q = bundle.getCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entries");
            this.f11745r = bundle.getCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entryValues");
            return;
        }
        androidx.preference.internal.AbstractMultiSelectListPreference abstractMultiSelectListPreference = (androidx.preference.internal.AbstractMultiSelectListPreference) l0();
        if (abstractMultiSelectListPreference.M() == null || abstractMultiSelectListPreference.N() == null) {
            throw new java.lang.IllegalStateException("MultiSelectListPreference requires an entries array and an entryValues array.");
        }
        ((java.util.HashSet) set).clear();
        set.addAll(abstractMultiSelectListPreference.O());
        this.f11743p = false;
        this.f11744q = abstractMultiSelectListPreference.M();
        this.f11745r = abstractMultiSelectListPreference.N();
    }

    @Override // androidx.preference.PreferenceDialogFragmentCompat, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onSaveInstanceState(android.os.Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putStringArrayList("MultiSelectListPreferenceDialogFragmentCompat.values", new java.util.ArrayList<>(this.f11742o));
        bundle.putBoolean("MultiSelectListPreferenceDialogFragmentCompat.changed", this.f11743p);
        bundle.putCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entries", this.f11744q);
        bundle.putCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entryValues", this.f11745r);
    }
}
