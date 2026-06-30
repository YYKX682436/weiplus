package ex5;

/* loaded from: classes7.dex */
public class c implements android.preference.Preference.OnPreferenceChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p3191x37a1e2.p3192x2e06d1.p3193xa8fcbcdb.AbstractActivityC27751xff12907d f338780a;

    public c(com.p314xaae8f345.p3191x37a1e2.p3192x2e06d1.p3193xa8fcbcdb.AbstractActivityC27751xff12907d abstractActivityC27751xff12907d) {
        this.f338780a = abstractActivityC27751xff12907d;
    }

    @Override // android.preference.Preference.OnPreferenceChangeListener
    public boolean onPreferenceChange(android.preference.Preference preference, java.lang.Object obj) {
        boolean z17;
        com.p314xaae8f345.p3191x37a1e2.p3192x2e06d1.p3193xa8fcbcdb.AbstractActivityC27751xff12907d abstractActivityC27751xff12907d = this.f338780a;
        if (!abstractActivityC27751xff12907d.C && preference.isEnabled() && preference.isSelectable()) {
            abstractActivityC27751xff12907d.C = true;
            if (preference instanceof com.p314xaae8f345.p3191x37a1e2.p3192x2e06d1.p3193xa8fcbcdb.C27745x1c1b08fe) {
                com.p314xaae8f345.p3191x37a1e2.p3192x2e06d1.p3193xa8fcbcdb.C27745x1c1b08fe c27745x1c1b08fe = (com.p314xaae8f345.p3191x37a1e2.p3192x2e06d1.p3193xa8fcbcdb.C27745x1c1b08fe) preference;
                c27745x1c1b08fe.f301633d = c27745x1c1b08fe.h();
                if (c27745x1c1b08fe.isPersistent()) {
                    abstractActivityC27751xff12907d.B.edit().putBoolean(preference.getKey(), c27745x1c1b08fe.h()).commit();
                }
                abstractActivityC27751xff12907d.getClass();
                z17 = true;
            } else {
                z17 = false;
            }
            if (preference.getKey() != null) {
                abstractActivityC27751xff12907d.T6(abstractActivityC27751xff12907d.f301660z, preference);
            }
            if (z17) {
                abstractActivityC27751xff12907d.f301660z.notifyDataSetChanged();
            }
            abstractActivityC27751xff12907d.C = false;
            if (z17) {
                return true;
            }
        }
        return false;
    }
}
