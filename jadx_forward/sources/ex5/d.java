package ex5;

/* loaded from: classes7.dex */
public class d implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p3191x37a1e2.p3192x2e06d1.p3193xa8fcbcdb.AbstractActivityC27751xff12907d f338781d;

    public d(com.p314xaae8f345.p3191x37a1e2.p3192x2e06d1.p3193xa8fcbcdb.AbstractActivityC27751xff12907d abstractActivityC27751xff12907d) {
        this.f338781d = abstractActivityC27751xff12907d;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        android.preference.Preference preference = (android.preference.Preference) adapterView.getAdapter().getItem(i17);
        if (preference == null || !preference.isEnabled() || !preference.isSelectable() || (preference instanceof com.p314xaae8f345.p3191x37a1e2.p3192x2e06d1.p3193xa8fcbcdb.C27745x1c1b08fe) || preference.getKey() == null) {
            return;
        }
        com.p314xaae8f345.p3191x37a1e2.p3192x2e06d1.p3193xa8fcbcdb.AbstractActivityC27751xff12907d abstractActivityC27751xff12907d = this.f338781d;
        abstractActivityC27751xff12907d.T6(abstractActivityC27751xff12907d.f301660z, preference);
    }
}
