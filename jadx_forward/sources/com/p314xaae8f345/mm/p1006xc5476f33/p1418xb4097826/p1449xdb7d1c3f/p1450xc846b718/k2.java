package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718;

/* loaded from: classes8.dex */
public final class k2 {

    /* renamed from: a, reason: collision with root package name */
    public static final int f187156a = (int) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.v1.f184144a.b().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561179bl);

    public k2() {
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5643xca5254a8>(a0Var) { // from class: com.tencent.mm.plugin.finder.extension.reddot.FinderRedDotAvatarManager$homeUiTabChangeListener$1
            {
                this.f39173x3fe91575 = -1095690568;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5643xca5254a8 c5643xca5254a8) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5643xca5254a8 event = c5643xca5254a8;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                zy2.z9[] z9VarArr = zy2.z9.f559174d;
                int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.k2.f187156a;
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.k2.this.d(2, null);
                return false;
            }
        }.mo48813x58998cd();
        pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.g2(this));
    }

    public final void a(r45.qy3 qy3Var, java.util.Set set, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.i2 i2Var) {
        if (qy3Var == null) {
            return;
        }
        oc2.v vVar = oc2.v.f425815a;
        java.lang.String k17 = vVar.k(qy3Var);
        if (!(k17.length() > 0)) {
            k17 = null;
        }
        if (k17 != null) {
            set.add(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.h2(k17, i2Var));
        }
        java.lang.String h17 = vVar.h(qy3Var);
        java.lang.String str = h17.length() > 0 ? h17 : null;
        if (str != null) {
            set.add(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.h2(str, i2Var));
        }
    }

    public final void b(r45.cp5 cp5Var, java.util.Set set) {
        r45.lp lpVar;
        r45.lp lpVar2;
        if (cp5Var.f453301d != 3) {
            return;
        }
        r45.yo5 yo5Var = cp5Var.f453303f;
        float floatValue = ((yo5Var == null || (lpVar2 = yo5Var.f472795e) == null) ? java.lang.Integer.valueOf(f187156a) : java.lang.Float.valueOf(lpVar2.f461220f)).floatValue();
        r45.yo5 yo5Var2 = cp5Var.f453303f;
        boolean a17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.a((yo5Var2 == null || (lpVar = yo5Var2.f472795e) == null) ? null : java.lang.Float.valueOf(lpVar.f461220f), 0.5f);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.i2 i2Var = (floatValue > 0.0f ? 1 : (floatValue == 0.0f ? 0 : -1)) == 0 ? com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.i2.f187116e : !a17 ? com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.i2.f187117f : com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.i2.f187115d;
        oc2.v vVar = oc2.v.f425815a;
        oc2.w wVar = oc2.w.f425822d;
        vVar.q(vVar.g(cp5Var, wVar), a17, floatValue);
        oc2.w wVar2 = oc2.w.f425823e;
        vVar.q(vVar.g(cp5Var, wVar2), a17, floatValue);
        oc2.w wVar3 = oc2.w.f425824f;
        vVar.q(vVar.g(cp5Var, wVar3), a17, floatValue);
        a(vVar.i(cp5Var, wVar), set, i2Var);
        a(vVar.i(cp5Var, wVar2), set, i2Var);
        a(vVar.i(cp5Var, wVar3), set, i2Var);
    }

    public final void c(r45.fz2 fz2Var, java.util.Set set) {
        java.util.LinkedList<r45.cp5> linkedList;
        r45.cr4 cr4Var;
        java.util.LinkedList linkedList2;
        if (fz2Var != null && (cr4Var = fz2Var.f456277g) != null && (linkedList2 = cr4Var.f453333d) != null) {
            java.util.Iterator it = linkedList2.iterator();
            while (it.hasNext()) {
                java.util.LinkedList<r45.cp5> linkedList3 = ((r45.bp5) it.next()).f452482e;
                if (linkedList3 != null) {
                    for (r45.cp5 cp5Var : linkedList3) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(cp5Var);
                        b(cp5Var, set);
                    }
                }
            }
        }
        if (fz2Var == null || (linkedList = fz2Var.f456274d) == null) {
            return;
        }
        for (r45.cp5 cp5Var2 : linkedList) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(cp5Var2);
            b(cp5Var2, set);
        }
    }

    public final void d(int i17, r45.f03 f03Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.aj0 aj0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.aj0.f207973a;
        if (((java.lang.Boolean) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.z70.f(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.z70.f209965a, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a, "视频号发现页红点头像预加载开关", e42.c0.clicfg_finder_red_dot_avatar_pre_load, java.lang.Boolean.FALSE, false, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.xf0.f209841d, 8, null)).booleanValue()) {
            zy2.z9[] z9VarArr = zy2.z9.f559174d;
            if (i17 == 1) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderRedDotAvatarManager", "notify preload successfully when restarting!");
            } else if (i17 == 2) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderRedDotAvatarManager", "notify preload successfully when changing tab!");
            } else if (i17 == 3) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderRedDotAvatarManager", "notify preload successfully when receiving red dot!");
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.j2 j2Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.j2(f03Var, this);
            if (i17 == 1) {
                pm0.v.Q("FinderRedDotAvatarManager", false, j2Var, java.util.concurrent.TimeUnit.SECONDS.toMillis(30L), 2, null);
            } else {
                pm0.v.O("FinderRedDotAvatarManager", j2Var);
            }
        }
    }
}
