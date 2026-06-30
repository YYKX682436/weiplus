package com.p314xaae8f345.mm.p947xba6de98f;

/* loaded from: classes12.dex */
public class i3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p947xba6de98f.j3 f152541d;

    public i3(com.p314xaae8f345.mm.p947xba6de98f.j3 j3Var) {
        this.f152541d = j3Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p947xba6de98f.j3 j3Var = this.f152541d;
        dn.o oVar = (dn.o) ((java.util.HashMap) j3Var.f152557h.f152596f).get(j3Var.f152553d);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("info=");
        sb6.append(oVar);
        sb6.append(" mediaId=");
        sb6.append(j3Var.f152553d);
        sb6.append(" info.videoCallback=");
        sb6.append(oVar != null && oVar.f323348c2 == null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.OnlineVideoService", sb6.toString());
        if (oVar == null) {
            if (j3Var.f152553d.contains("AdLandingGeneralVideo_")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(fe1.t.f69748x366c91de, 12);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.OnlineVideoService", "download adLandingGeneralVideo task onMoovReady but task is null, %s, %s", j3Var.f152553d, java.lang.Integer.valueOf(j3Var.f152557h.hashCode()));
                return;
            }
            return;
        }
        int i17 = j3Var.f152555f;
        oVar.W1 = i17;
        dn.n nVar = oVar.f323348c2;
        if (nVar != null) {
            nVar.mo65708xe7d268fb(j3Var.f152553d, i17, j3Var.f152556g, j3Var.f152554e);
            return;
        }
        if (t21.u2.c(oVar.f69595x6d25b0d9)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.OnlineVideoService", "it is qt video, need finish all file. isPlayMode" + oVar.H1);
            if (oVar.H1 == 1) {
                j3Var.f152557h.p(oVar.f69601xaca5bdda, 0, (int) oVar.f69620xeb1a61d6, 0);
                j3Var.f152557h.getClass();
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(354L, 19L, 1L, false);
                return;
            }
            return;
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5814x771f4db2 c5814x771f4db2 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5814x771f4db2();
        am.hn hnVar = c5814x771f4db2.f136121g;
        hnVar.f88377a = 1;
        hnVar.f88378b = 0;
        hnVar.f88379c = j3Var.f152553d;
        hnVar.f88380d = j3Var.f152555f;
        hnVar.f88381e = j3Var.f152556g;
        hnVar.f88382f = oVar.D1;
        hnVar.f88383g = oVar.f323336v > 0;
        com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.VideoInfo videoInfo = j3Var.f152554e;
        hnVar.f88384h = videoInfo.f18114x9330627b;
        hnVar.f88386j = videoInfo.f18112xd87e3d8c;
        hnVar.f88385i = videoInfo.f18115x27b47052;
        hnVar.f88387k = videoInfo.f18113x4486869b;
        hnVar.f88388l = videoInfo.f18116x4f713740;
        c5814x771f4db2.e();
        t21.v2 i18 = t21.d3.i(oVar.E1, oVar.f323347b2, oVar.X1);
        if (i18 != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OnlineVideoService", "on moov ready info: " + i18.d() + " status : " + i18.f496544i + " reqFlag:" + j3Var.f152554e.f18113x4486869b + " svrFlag:" + j3Var.f152554e.f18114x9330627b + " path:" + j3Var.f152554e.f18116x4f713740 + ", mediaId=" + i18.O);
            com.p314xaae8f345.mm.p947xba6de98f.l3 l3Var = j3Var.f152557h;
            java.lang.String str = j3Var.f152554e.f18114x9330627b;
            byte[] bArr = oVar.P;
            l3Var.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OnlineVideoService", "getSvrFlagMappingMultiSpec >> svrFlag: %s", str);
            if (!android.text.TextUtils.isEmpty(str)) {
                if (bArr == null || bArr.length == 0) {
                    str = l3Var.n(str);
                } else {
                    try {
                        r45.t76 t76Var = (r45.t76) new r45.t76().mo11468x92b714fd(bArr);
                        if (!android.text.TextUtils.isEmpty(t76Var.f467735d)) {
                            java.util.LinkedList linkedList = ((r45.gb6) new r45.gb6().mo11468x92b714fd(n51.d.a(t76Var.f467735d, 2))).f456608e;
                            if (linkedList != null) {
                                java.util.Iterator it = linkedList.iterator();
                                while (it.hasNext()) {
                                    r45.rc6 rc6Var = (r45.rc6) it.next();
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OnlineVideoService", "getSvrFlagMappingMultiSpec >> spec origin: %s target: %s", rc6Var.f466264d, rc6Var.f466265e);
                                    if (("x" + rc6Var.f466265e).equals(str)) {
                                        java.lang.String str2 = "x" + rc6Var.f466264d;
                                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OnlineVideoService", "getSvrFlagMappingMultiSpec to mapping >> svrFlag: %s result: %s", str, str2);
                                        str = str2;
                                        break;
                                    }
                                }
                            }
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OnlineVideoService", "getSvrFlagMappingMultiSpec >> svrFlag: %s no had mapping", str);
                        }
                    } catch (java.lang.Exception e17) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.OnlineVideoService", "getSvrFlagMappingMultiSpec >> error %s", e17.getMessage());
                        str = l3Var.n(str);
                    }
                }
            }
            i18.B = str;
            i18.C = j3Var.f152554e.f18116x4f713740;
            i18.D = oVar.f69601xaca5bdda;
            t21.d3.Q(i18);
            int i19 = i18.f496544i;
            if (i19 == 130 || i19 == 122) {
                return;
            }
            t21.v2 h17 = t21.d3.h(oVar.E1);
            if (h17 != null) {
                h17.f496544i = 121;
                h17.U = 256;
                t21.o2.Ui().C(h17);
            }
            if (oVar.H1 == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OnlineVideoService", "stop download video");
                t21.o2.Zi().i();
                t21.o2.Zi().k();
            }
        }
    }
}
