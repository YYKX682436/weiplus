package is1;

/* loaded from: classes7.dex */
public final class e implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f375944a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f375945b;

    public e(java.util.LinkedList linkedList, int i17) {
        this.f375944a = linkedList;
        this.f375945b = i17;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar;
        boolean z17;
        com.p314xaae8f345.mm.p944x882e457a.f fVar2 = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Preload.TmplInfoManager", "callback, errType = %d, errCode = %d, errMsg = %s", java.lang.Integer.valueOf(fVar2.f152148a), java.lang.Integer.valueOf(fVar2.f152149b), fVar2.f152150c);
        java.util.Iterator it = this.f375944a.iterator();
        while (it.hasNext()) {
            is1.l.f375962g.remove(java.lang.Integer.valueOf(((r45.p20) it.next()).f464209d));
        }
        if (fVar2.f152148a == 0 && fVar2.f152149b == 0 && (fVar = fVar2.f152151d) != null) {
            if (((r45.r20) fVar).f465997i > 0) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.z1.g().putLong("_check_time_colddown", r2 * 1000);
            }
            int i17 = ((r45.r20) fVar2.f152151d).f465998m;
            com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.z1.g().putBoolean("_android_fst_tmpl_fix", i17 == 1);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Preload.TmplInfoManager", "saveAndroidFastTmplFix value = " + i17);
            java.util.LinkedList linkedList = ((r45.r20) fVar2.f152151d).f465996h;
            if (linkedList == null || linkedList.isEmpty()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Preload.TmplInfoManager", "cgi back tmplInfoList is empty, return");
            } else {
                java.util.Iterator it6 = ((r45.r20) fVar2.f152151d).f465996h.iterator();
                while (it6.hasNext()) {
                    r45.vm6 vm6Var = (r45.vm6) it6.next();
                    if (vm6Var != null) {
                        int i18 = this.f375945b;
                        synchronized (is1.l.class) {
                            if (!com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.z1.j(vm6Var)) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Preload.TmplInfoManager", "isTmplInfoExist() tmplInfo is invalid, return false");
                            } else if (is1.l.f(vm6Var.f469905d).f469906e == vm6Var.f469906e) {
                                if (com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.z1.i(com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.z1.a(vm6Var))) {
                                    z17 = true;
                                } else {
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Preload.TmplInfoManager", "[isTmplInfoExist]file isn't exist, may be delete");
                                }
                            }
                            z17 = false;
                        }
                        if (z17) {
                            com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.w1.a("MicroMsg.Preload.TmplInfoManager", vm6Var.f469913o + " exist, only see for debug");
                        } else {
                            int i19 = vm6Var.f469905d;
                            is1.l lVar = is1.l.f375956a;
                            is1.j jVar = new is1.j(i19);
                            java.lang.String str = vm6Var.f469907f;
                            if (str == null || r26.n0.N(str)) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Preload.TmplInfoManager", "[addDownloadTask] TmplInfo is null, return");
                            } else {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Preload.TmplInfoManager", "start download:" + lVar.d(vm6Var));
                                p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.i2.f392010d, p3325xe03a0797.p3326xc267989b.q1.f392103c, null, new is1.h(vm6Var, i18, jVar, null), 2, null);
                            }
                        }
                        java.lang.String e17 = com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.z1.e(vm6Var);
                        java.lang.String str2 = vm6Var.f469913o;
                        com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.z1.g().putString("_tmpl_info_latest_responsed_-" + vm6Var.f469905d, str2);
                        com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.z1.g().W(com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.z1.c(vm6Var));
                        com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.z1.g().W(com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.z1.d(vm6Var));
                        com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.z1.g().H(e17, vm6Var.mo14344x5f01b1f6());
                        java.lang.String f17 = com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.z1.f(vm6Var);
                        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 g17 = com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.z1.g();
                        java.util.Set stringSet = com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.z1.g().getStringSet(f17, null);
                        if (stringSet == null) {
                            stringSet = new java.util.HashSet();
                        }
                        stringSet.add(vm6Var.f469913o);
                        g17.putStringSet(f17, stringSet);
                    }
                }
                ax4.a.a(1);
            }
        } else {
            ax4.a.a(2);
        }
        return null;
    }
}
