package p012xc85e97e9.p100xa8fcbcdb;

/* renamed from: androidx.preference.MultiSelectListPreferenceDialogFragmentCompat */
/* loaded from: classes13.dex */
public class C1145xc0a22968 extends p012xc85e97e9.p100xa8fcbcdb.AbstractDialogInterfaceOnClickListenerC1148x143072f5 {

    /* renamed from: o, reason: collision with root package name */
    public final java.util.Set f93275o = new java.util.HashSet();

    /* renamed from: p, reason: collision with root package name */
    public boolean f93276p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.CharSequence[] f93277q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.CharSequence[] f93278r;

    @Override // p012xc85e97e9.p100xa8fcbcdb.AbstractDialogInterfaceOnClickListenerC1148x143072f5
    public void n0(boolean z17) {
        p012xc85e97e9.p100xa8fcbcdb.p101x21ffc6bd.AbstractC1157xa91160ec abstractC1157xa91160ec = (p012xc85e97e9.p100xa8fcbcdb.p101x21ffc6bd.AbstractC1157xa91160ec) l0();
        if (z17 && this.f93276p) {
            java.util.Set set = this.f93275o;
            if (abstractC1157xa91160ec.d(set)) {
                abstractC1157xa91160ec.Q(set);
            }
        }
        this.f93276p = false;
    }

    @Override // p012xc85e97e9.p100xa8fcbcdb.AbstractDialogInterfaceOnClickListenerC1148x143072f5
    public void o0(p012xc85e97e9.p016x746ad0e3.app.l lVar) {
        int length = this.f93278r.length;
        boolean[] zArr = new boolean[length];
        for (int i17 = 0; i17 < length; i17++) {
            zArr[i17] = ((java.util.HashSet) this.f93275o).contains(this.f93278r[i17].toString());
        }
        java.lang.CharSequence[] charSequenceArr = this.f93277q;
        p012xc85e97e9.p100xa8fcbcdb.k kVar = new p012xc85e97e9.p100xa8fcbcdb.k(this);
        p012xc85e97e9.p016x746ad0e3.app.h hVar = lVar.f90726a;
        hVar.f90674m = charSequenceArr;
        hVar.f90682u = kVar;
        hVar.f90678q = zArr;
        hVar.f90679r = true;
    }

    @Override // p012xc85e97e9.p100xa8fcbcdb.AbstractDialogInterfaceOnClickListenerC1148x143072f5, p012xc85e97e9.p087x9da2e250.app.DialogInterfaceOnCancelListenerC1100xc25047d8, com.p314xaae8f345.mm.p789x6b725fbe.p791x16b96823.C10737xffc632b6, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onCreate */
    public void mo7398x3e5a77bb(android.os.Bundle bundle) {
        super.mo7398x3e5a77bb(bundle);
        java.util.Set set = this.f93275o;
        if (bundle != null) {
            ((java.util.HashSet) set).clear();
            set.addAll(bundle.getStringArrayList("MultiSelectListPreferenceDialogFragmentCompat.values"));
            this.f93276p = bundle.getBoolean("MultiSelectListPreferenceDialogFragmentCompat.changed", false);
            this.f93277q = bundle.getCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entries");
            this.f93278r = bundle.getCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entryValues");
            return;
        }
        p012xc85e97e9.p100xa8fcbcdb.p101x21ffc6bd.AbstractC1157xa91160ec abstractC1157xa91160ec = (p012xc85e97e9.p100xa8fcbcdb.p101x21ffc6bd.AbstractC1157xa91160ec) l0();
        if (abstractC1157xa91160ec.M() == null || abstractC1157xa91160ec.N() == null) {
            throw new java.lang.IllegalStateException("MultiSelectListPreference requires an entries array and an entryValues array.");
        }
        ((java.util.HashSet) set).clear();
        set.addAll(abstractC1157xa91160ec.O());
        this.f93276p = false;
        this.f93277q = abstractC1157xa91160ec.M();
        this.f93278r = abstractC1157xa91160ec.N();
    }

    @Override // p012xc85e97e9.p100xa8fcbcdb.AbstractDialogInterfaceOnClickListenerC1148x143072f5, p012xc85e97e9.p087x9da2e250.app.DialogInterfaceOnCancelListenerC1100xc25047d8, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onSaveInstanceState */
    public void mo7404xa71a2260(android.os.Bundle bundle) {
        super.mo7404xa71a2260(bundle);
        bundle.putStringArrayList("MultiSelectListPreferenceDialogFragmentCompat.values", new java.util.ArrayList<>(this.f93275o));
        bundle.putBoolean("MultiSelectListPreferenceDialogFragmentCompat.changed", this.f93276p);
        bundle.putCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entries", this.f93277q);
        bundle.putCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entryValues", this.f93278r);
    }
}
