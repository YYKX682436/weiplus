package qy0;

/* loaded from: classes5.dex */
public final class l implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qy0.d0 f449142d;

    public l(qy0.d0 d0Var) {
        this.f449142d = d0Var;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        az0.o7 o7Var = (az0.o7) obj;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MaasMultiTemplate.MaasAlbumMultiTemplateOverlayUIC", "initView: recommend " + o7Var);
        if (o7Var.f97310b) {
            int Ri = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ri(e42.d0.clicfg_finder_maas_recomend_fallback_type, bm5.h0.RepairerConfig_Maas_FinderFallBack_Int, 0);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderMaasXConfigImpl", "finder fallback " + Ri);
            if (Ri == 1) {
                qy0.d0 d0Var = this.f449142d;
                p3325xe03a0797.p3326xc267989b.l.d(d0Var.mo144225x95f74600(), null, null, new qy0.q(d0Var, null), 3, null);
            }
        }
    }
}
