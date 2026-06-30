package p012xc85e97e9.p100xa8fcbcdb;

/* renamed from: androidx.preference.ListPreferenceDialogFragmentCompat */
/* loaded from: classes13.dex */
public class C1143x7e423733 extends p012xc85e97e9.p100xa8fcbcdb.AbstractDialogInterfaceOnClickListenerC1148x143072f5 {

    /* renamed from: o, reason: collision with root package name */
    public int f93271o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.CharSequence[] f93272p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.CharSequence[] f93273q;

    @Override // p012xc85e97e9.p100xa8fcbcdb.AbstractDialogInterfaceOnClickListenerC1148x143072f5
    public void n0(boolean z17) {
        int i17;
        p012xc85e97e9.p100xa8fcbcdb.C1142xedd26839 c1142xedd26839 = (p012xc85e97e9.p100xa8fcbcdb.C1142xedd26839) l0();
        if (!z17 || (i17 = this.f93271o) < 0) {
            return;
        }
        java.lang.String charSequence = this.f93273q[i17].toString();
        if (c1142xedd26839.d(charSequence)) {
            c1142xedd26839.N(charSequence);
        }
    }

    @Override // p012xc85e97e9.p100xa8fcbcdb.AbstractDialogInterfaceOnClickListenerC1148x143072f5
    public void o0(p012xc85e97e9.p016x746ad0e3.app.l lVar) {
        java.lang.CharSequence[] charSequenceArr = this.f93272p;
        int i17 = this.f93271o;
        p012xc85e97e9.p100xa8fcbcdb.i iVar = new p012xc85e97e9.p100xa8fcbcdb.i(this);
        p012xc85e97e9.p016x746ad0e3.app.h hVar = lVar.f90726a;
        hVar.f90674m = charSequenceArr;
        hVar.f90676o = iVar;
        hVar.f90681t = i17;
        hVar.f90680s = true;
        hVar.f90668g = null;
        hVar.f90669h = null;
    }

    @Override // p012xc85e97e9.p100xa8fcbcdb.AbstractDialogInterfaceOnClickListenerC1148x143072f5, p012xc85e97e9.p087x9da2e250.app.DialogInterfaceOnCancelListenerC1100xc25047d8, com.p314xaae8f345.mm.p789x6b725fbe.p791x16b96823.C10737xffc632b6, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onCreate */
    public void mo7398x3e5a77bb(android.os.Bundle bundle) {
        java.lang.CharSequence[] charSequenceArr;
        super.mo7398x3e5a77bb(bundle);
        if (bundle != null) {
            this.f93271o = bundle.getInt("ListPreferenceDialogFragment.index", 0);
            this.f93272p = bundle.getCharSequenceArray("ListPreferenceDialogFragment.entries");
            this.f93273q = bundle.getCharSequenceArray("ListPreferenceDialogFragment.entryValues");
            return;
        }
        p012xc85e97e9.p100xa8fcbcdb.C1142xedd26839 c1142xedd26839 = (p012xc85e97e9.p100xa8fcbcdb.C1142xedd26839) l0();
        if (c1142xedd26839.X == null || (charSequenceArr = c1142xedd26839.Y) == null) {
            throw new java.lang.IllegalStateException("ListPreference requires an entries array and an entryValues array.");
        }
        java.lang.String str = c1142xedd26839.Z;
        int i17 = -1;
        if (str != null && charSequenceArr != null) {
            int length = charSequenceArr.length - 1;
            while (true) {
                if (length < 0) {
                    break;
                }
                if (c1142xedd26839.Y[length].equals(str)) {
                    i17 = length;
                    break;
                }
                length--;
            }
        }
        this.f93271o = i17;
        this.f93272p = c1142xedd26839.X;
        this.f93273q = c1142xedd26839.Y;
    }

    @Override // p012xc85e97e9.p100xa8fcbcdb.AbstractDialogInterfaceOnClickListenerC1148x143072f5, p012xc85e97e9.p087x9da2e250.app.DialogInterfaceOnCancelListenerC1100xc25047d8, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onSaveInstanceState */
    public void mo7404xa71a2260(android.os.Bundle bundle) {
        super.mo7404xa71a2260(bundle);
        bundle.putInt("ListPreferenceDialogFragment.index", this.f93271o);
        bundle.putCharSequenceArray("ListPreferenceDialogFragment.entries", this.f93272p);
        bundle.putCharSequenceArray("ListPreferenceDialogFragment.entryValues", this.f93273q);
    }
}
