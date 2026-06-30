package ku3;

/* loaded from: classes10.dex */
public final class l5 implements yt3.r2, p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final zt3.a f393840d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f393841e;

    /* renamed from: f, reason: collision with root package name */
    public int f393842f;

    public l5(zt3.a kitContext, ju3.d0 status) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(kitContext, "kitContext");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
        this.f393840d = kitContext;
        this.f393842f = 2;
    }

    public final java.lang.Object a(boolean z17, boolean z18, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
        java.lang.Object g17 = p3325xe03a0797.p3326xc267989b.l.g(p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a, new ku3.j5(z17, this, z18, null), interfaceC29045xdcb5ca57);
        return g17 == pz5.a.f440719d ? g17 : jz5.f0.f384359a;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        zt3.c cVar = (zt3.c) obj;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onChanged >> ");
        sb6.append(cVar);
        sb6.append(", ");
        sb6.append(cVar != null ? java.lang.Boolean.valueOf(cVar.f557121b) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecordMenuSwitchFlashPlugin", sb6.toString());
        if (cVar == null) {
            return;
        }
        boolean z17 = this.f393841e;
        boolean z18 = cVar.f557121b;
        if (z17 != z18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecordMenuSwitchFlashPlugin", "switchFlash >> " + z18 + ' ' + this.f393842f);
            int i17 = this.f393842f;
            zt3.a aVar = this.f393840d;
            if (i17 == 2) {
                aVar.f557110e.e(z18);
            } else {
                aVar.f557110e.mo9386xf597288(z18);
            }
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("setClickFlashLightCount >> ");
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6355x3a30521 c6355x3a30521 = nu3.f.f421744b;
            sb7.append(c6355x3a30521 != null ? c6355x3a30521.f137052o : null);
            sb7.append(", ");
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6355x3a30521 c6355x3a305212 = nu3.f.f421744b;
            sb7.append(c6355x3a305212 != null ? java.lang.Long.valueOf(c6355x3a305212.f137050m) : null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImproveRecordReporter", sb7.toString());
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6355x3a30521 c6355x3a305213 = nu3.f.f421744b;
            if (c6355x3a305213 != null) {
                c6355x3a305213.f137050m++;
            }
            this.f393841e = z18;
        }
    }

    @Override // yt3.r2
    /* renamed from: onDetach */
    public void mo10989x3f5eee52() {
        if (this.f393841e && this.f393842f == 1) {
            this.f393840d.f557110e.mo9386xf597288(false);
        }
    }

    @Override // yt3.r2
    public void t(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 configProvider) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(configProvider, "configProvider");
        this.f393842f = configProvider.M.getInt("key_camera_light_type", 2);
        this.f393840d.R6(new ku3.k5(this));
    }
}
