package ku3;

/* loaded from: classes3.dex */
public final class t1 implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ku3.z1 f393948d;

    public t1(ku3.z1 z1Var) {
        this.f393948d = z1Var;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        zt3.c cVar = (zt3.c) obj;
        ku3.z1 z1Var = this.f393948d;
        if (z1Var.f394032m == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RecordFrameShaderPlugin", "location type is null to return");
            return;
        }
        android.os.Bundle bundle = cVar.f557122c;
        if (bundle != null) {
            int i17 = bundle.getInt("PARAM_1_INT");
            android.os.Bundle bundle2 = cVar.f557122c;
            if (bundle2 != null) {
                bundle2.getInt("PARAM_2_INT");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecordFrameShaderPlugin", "MENU_RATIO >> " + i17);
                p3325xe03a0797.p3326xc267989b.y0 y0Var = z1Var.f394031i;
                if (i17 == 1) {
                    p3325xe03a0797.p3326xc267989b.l.d(y0Var, null, null, new ku3.y1(z1Var, bs0.f.f105318f, ku3.z1.b(z1Var, i17), null), 3, null);
                } else if (i17 == 2) {
                    p3325xe03a0797.p3326xc267989b.l.d(y0Var, null, null, new ku3.y1(z1Var, bs0.f.f105317e, ku3.z1.b(z1Var, i17), null), 3, null);
                } else {
                    if (i17 != 3) {
                        return;
                    }
                    p3325xe03a0797.p3326xc267989b.l.d(y0Var, null, null, new ku3.y1(z1Var, bs0.f.f105316d, ku3.z1.b(z1Var, i17), null), 3, null);
                }
            }
        }
    }
}
