package dr4;

/* loaded from: classes14.dex */
public final class y0 implements xq4.d {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dr4.p1 f324300d;

    public y0(dr4.p1 p1Var) {
        this.f324300d = p1Var;
    }

    @Override // xq4.d
    public void Y(int i17, int i18) {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("MicroMsg.VoIPRenderMgr", "camera preview size apply is " + i18 + " and " + i17, new java.lang.Object[0]);
        dr4.x1 x1Var = this.f324300d.f324241g;
        if (x1Var != null) {
            dr4.c0 c0Var = x1Var.f324295b;
            if (c0Var != null) {
                c0Var.d(new android.util.Size(i18, i17));
            }
            dr4.c0 c0Var2 = x1Var.f324295b;
            if (c0Var2 != null) {
                c0Var2.f324131a = i18;
            }
            if (c0Var2 != null) {
                c0Var2.f324132b = i17;
            }
            dr4.h hVar = x1Var.f324298e;
            if (hVar != null) {
                hVar.l(new android.util.Size(i18, i17));
            }
            dr4.d2 d2Var = x1Var.f324296c;
            if (d2Var != null) {
                d2Var.l(new android.util.Size(i18, i17));
            }
        }
        gq4.v.wi().f447514o = new android.util.Size(i18, i17);
        this.f324300d.getClass();
        rq4.c cVar = qq4.c.f447520a;
        if (cVar != null) {
            java.util.HashMap hashMap = cVar.f480473b;
            sq4.b bVar = (sq4.b) hashMap.get(cVar.f480476e);
            java.lang.String str = bVar != null ? bVar.f492912g == null ? bVar.f492906a : bVar.f492915j : null;
            if (str != null) {
                int hashCode = str.hashCode();
                if (hashCode != -2057948716) {
                    if (hashCode != 931431321) {
                        if (hashCode == 1776673909 && str.equals("InitCamera")) {
                            cVar.a();
                            cVar.f480476e = null;
                        }
                    } else if (str.equals("SwitchCamera")) {
                        sq4.b bVar2 = (sq4.b) hashMap.get(cVar.f480479h);
                        if (bVar2 != null) {
                            bVar2.b();
                        }
                        rq4.a aVar = cVar.f480472a;
                        if (aVar != null) {
                            if (aVar.f480467a == 1) {
                                sq4.b bVar3 = (sq4.b) hashMap.get("SwitchCamera_1");
                                if (bVar3 != null) {
                                    long j17 = bVar3.f492913h;
                                    long j18 = cVar.f480481j;
                                    boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                                    long currentTimeMillis = j18 + (java.lang.System.currentTimeMillis() - j17);
                                    cVar.f480481j = currentTimeMillis;
                                    cVar.f480481j = currentTimeMillis / 2;
                                }
                            } else {
                                sq4.b bVar4 = (sq4.b) hashMap.get("CameraIDChanged_0");
                                if (bVar4 != null) {
                                    long j19 = bVar4.f492913h;
                                    long j27 = cVar.f480481j;
                                    boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                                    long currentTimeMillis2 = j27 + (java.lang.System.currentTimeMillis() - j19);
                                    cVar.f480481j = currentTimeMillis2;
                                    cVar.f480481j = currentTimeMillis2 / 2;
                                }
                            }
                        }
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoIPCameraParamsReport", "switchCamera end cost " + cVar.f480481j);
                        cVar.f480476e = null;
                    }
                } else if (str.equals("SwitchPreview")) {
                    sq4.b bVar5 = (sq4.b) hashMap.get("SwitchPreview");
                    if (bVar5 != null) {
                        bVar5.b();
                    }
                    cVar.f480476e = null;
                }
            }
            cVar.a();
            cVar.f480476e = null;
        }
        xq4.a aVar2 = this.f324300d.f324237c;
        if (aVar2 != null) {
            zq4.b bVar6 = (zq4.b) aVar2;
            try {
                android.hardware.Camera.Parameters c17 = bVar6.f556577d.c();
                boolean z19 = bVar6.f556574a;
                rq4.b bVar7 = rq4.c.f480471m;
                if (z19) {
                    bVar7.a(c17, 1);
                } else {
                    bVar7.a(c17, 0);
                }
            } catch (java.lang.Exception unused) {
            }
        }
    }

    @Override // xq4.d
    public void e(int i17) {
    }

    @Override // xq4.d
    public void o() {
        ((ku5.t0) ku5.t0.f394148d).B(new dr4.x0(this.f324300d));
        rq4.q qVar = rq4.q.f480600a;
        rq4.q.f480604e = 1;
    }

    @Override // xq4.d
    public void q(int i17) {
        java.util.ArrayList arrayList = qq4.a.f447499a;
        java.util.Iterator it = qq4.a.f447499a.iterator();
        while (it.hasNext()) {
            ((rq4.k) ((oq4.a) it.next())).a(i17);
        }
    }

    @Override // xq4.d
    public void v(byte[] bArr, long j17, int i17, int i18, int i19, int i27, double d17) {
    }
}
