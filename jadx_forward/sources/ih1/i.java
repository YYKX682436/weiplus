package ih1;

/* loaded from: classes7.dex */
public final class i extends jc3.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ih1.m f373030a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ih1.u f373031b;

    public i(ih1.m mVar, ih1.u uVar) {
        this.f373030a = mVar;
        this.f373031b = uVar;
    }

    @Override // jc3.a, jc3.l
    /* renamed from: c */
    public void b(android.view.View view) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        super.b(view);
        int hashCode = view.hashCode();
        java.lang.Runnable runnable = (java.lang.Runnable) this.f373030a.f373045f.remove(java.lang.Integer.valueOf(hashCode));
        if (runnable != null) {
            this.f373030a.f373044e.removeCallbacks(runnable);
        }
        ih1.v vVar = (ih1.v) this.f373030a.f373043d.get(java.lang.Integer.valueOf(hashCode));
        if (vVar != null) {
            ih1.u uVar = this.f373031b;
            mq0.d0 d0Var = (mq0.d0) i95.n0.c(mq0.d0.class);
            java.lang.String str = vVar.f373075a;
            java.lang.String a17 = vVar.f373076b.a();
            java.lang.String str2 = vVar.f373077c;
            ((mq0.s0) d0Var).Ai(str, a17, str2, mq0.a.f412048g, true, str2, kz5.b1.e(new jz5.l("appId", uVar.f373063a)));
            vVar.f373078d = false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MagicAdMiniProgramInstaller", "maliCrash onRequestHide");
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.i0) this.f373031b.f373064b).a();
    }

    @Override // jc3.a, jc3.l
    /* renamed from: d */
    public void a(android.view.View view) {
        java.lang.String str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        super.a(view);
        ih1.v vVar = (ih1.v) this.f373030a.f373043d.get(java.lang.Integer.valueOf(view.hashCode()));
        if (vVar != null) {
            ih1.u uVar = this.f373031b;
            ih1.m mVar = this.f373030a;
            mq0.d0 d0Var = (mq0.d0) i95.n0.c(mq0.d0.class);
            java.lang.String str2 = vVar.f373075a;
            java.lang.String a17 = vVar.f373076b.a();
            java.lang.String str3 = vVar.f373077c;
            ((mq0.s0) d0Var).Ai(str2, a17, str3, mq0.a.f412047f, true, str3, kz5.b1.e(new jz5.l("appId", uVar.f373063a)));
            vVar.f373078d = true;
            try {
                java.lang.String frameSetName = vVar.f373077c;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(frameSetName, "frameSetName");
                if (frameSetName.length() == 0) {
                    str = "";
                } else {
                    java.util.List f07 = r26.n0.f0(frameSetName, new java.lang.String[]{"_"}, false, 0, 6, null);
                    if (f07.size() >= 3) {
                        frameSetName = (java.lang.String) f07.get(1);
                    }
                    str = frameSetName;
                }
                mq0.c0 c0Var = (mq0.c0) i95.n0.c(mq0.c0.class);
                if (c0Var != null) {
                    mq0.c0.Xa(c0Var, mq0.z.f412167e, "MagicAdMiniProgram", "RewardAd", str, vVar.f373077c, mq0.a0.f412065e, null, kz5.b1.e(new jz5.l("appId", uVar.f373063a)), 64, null);
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MBADFullLinkReporter", "[MBAd] report Expose failed", e17);
            }
            int hashCode = view.hashCode();
            ih1.h hVar = new ih1.h(vVar.f373077c, uVar, mVar, hashCode);
            java.lang.Runnable runnable = (java.lang.Runnable) mVar.f373045f.get(java.lang.Integer.valueOf(hashCode));
            if (runnable != null) {
                mVar.f373044e.removeCallbacks(runnable);
            }
            mVar.f373045f.put(java.lang.Integer.valueOf(hashCode), hVar);
            mVar.f373044e.postDelayed(hVar, 1000L);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MagicAdMiniProgramInstaller", "maliCrash onRequestShow");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.i0 i0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.i0) this.f373031b.f373064b;
        ae.q qVar = (ae.q) i0Var.f170218a.z1(ae.q.class);
        com.p314xaae8f345.p485x5dc4f1ad.C4209xd2d3ddad c4209xd2d3ddad = qVar == null ? null : ((ae.a) qVar).f84868y.f508102c;
        if (c4209xd2d3ddad != null) {
            c4209xd2d3ddad.e();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandServiceWC", "[MBAd] MagicAdMiniProgramInstaller[%s], onShowMBAd, mb: %s", i0Var.f170218a.mo48798x74292566(), c4209xd2d3ddad);
    }
}
