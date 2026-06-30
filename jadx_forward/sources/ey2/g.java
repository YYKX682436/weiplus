package ey2;

/* loaded from: classes2.dex */
public final class g implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public static final ey2.g f338907d = new ey2.g();

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.z9 z9Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.z9) obj;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb jbVar = z9Var.f186862c;
        if (jbVar != null && z9Var.f186860a) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[observeForever] tipsId=");
            sb6.append(jbVar.f65880x11c19d58);
            sb6.append(", ignore_freq_limit=");
            r45.f03 f03Var = z9Var.f186861b;
            sb6.append(f03Var != null ? java.lang.Integer.valueOf(f03Var.f455432s) : null);
            sb6.append(", cacheChangeTabOption=");
            sb6.append(f03Var != null ? java.lang.Integer.valueOf(f03Var.f455438y) : null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.AlternateRedDotVM", sb6.toString());
        }
    }
}
