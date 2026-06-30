package t01;

/* loaded from: classes11.dex */
public final class j extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t01.m f495929d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(t01.m mVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f495929d = mVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new t01.j(this.f495929d, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        t01.j jVar = (t01.j) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        jVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        t01.i iVar = t01.m.f495932d;
        int o17 = t01.i.a(iVar).o("BizPhotoMeTabEduRedDotState", 0);
        boolean vj6 = ((ox.g) t01.i.b(iVar)).vj();
        t01.m mVar = this.f495929d;
        if (vj6 && o17 == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizPersonalFinderRedDot", "add edu red dot");
            if (mVar.Ni() || mVar.Di()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizPersonalFinderRedDot", "hasFinderAccount or hasBizAccount, addMeTabPhotoEduRed");
                mVar.wi();
            } else if (!mVar.Ri() && ((ox.g) t01.i.b(iVar)).Ni()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizPersonalFinderRedDot", "no photo account and can register, addMeTabPhotoEduRed");
                mVar.wi();
            }
        } else {
            boolean z17 = true;
            if (o17 == 1) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizPersonalFinderRedDot", "check edu red dot");
                mVar.getClass();
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb L0 = t01.i.c(iVar).L0("FinderMyTab");
                r45.vs2 vs2Var = L0 != null ? L0.f65874xb5f7102a : null;
                if (vs2Var == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizPersonalFinderRedDot", "ctrlInfo is null, set state to added and disposed");
                    t01.i.a(iVar).A("BizPhotoMeTabEduRedDotState", 2);
                } else {
                    java.lang.String str = vs2Var.f470036x;
                    if ((str == null || r26.i0.y(str, "BizPhotoLocal_", false)) ? false : true) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizPersonalFinderRedDot", "not edu red dot, set state to added and disposed");
                        t01.i.a(iVar).A("BizPhotoMeTabEduRedDotState", 2);
                    } else if (((ox.g) t01.i.b(iVar)).vj()) {
                        if (!mVar.Ni() && !mVar.Di()) {
                            z17 = false;
                        }
                        if (z17 || (!mVar.Ri() && ((ox.g) t01.i.b(iVar)).Ni())) {
                            java.lang.String string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(mVar.Ui());
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
                            java.util.LinkedList show_infos = vs2Var.f470022g;
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(show_infos, "show_infos");
                            r45.f03 f03Var = (r45.f03) kz5.n0.Z(show_infos);
                            if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(f03Var != null ? f03Var.f455422f : null, string)) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizPersonalFinderRedDot", "red dot title changed, re-add red dot");
                                t01.i.c(iVar).N("FinderMyTab");
                                mVar.wi();
                            }
                        } else {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizPersonalFinderRedDot", "no biz or finder account, and has photo account or cannot register, dispose red dot");
                            t01.i.c(iVar).N("FinderMyTab");
                            if (mVar.Ri()) {
                                t01.i.a(iVar).A("BizPhotoMeTabEduRedDotState", 2);
                            } else {
                                t01.i.a(iVar).A("BizPhotoMeTabEduRedDotState", 0);
                            }
                        }
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizPersonalFinderRedDot", "shouldShowPhotoWorks is false, dispose red dot and set state to none");
                        t01.i.c(iVar).N("FinderMyTab");
                        t01.i.a(iVar).A("BizPhotoMeTabEduRedDotState", 0);
                    }
                }
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizPersonalFinderRedDot", "no need to check edu red dot, redDotState: " + o17);
            }
        }
        return jz5.f0.f384359a;
    }
}
