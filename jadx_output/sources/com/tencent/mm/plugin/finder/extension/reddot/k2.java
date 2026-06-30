package com.tencent.mm.plugin.finder.extension.reddot;

/* loaded from: classes8.dex */
public final class k2 {

    /* renamed from: a, reason: collision with root package name */
    public static final int f105623a = (int) com.tencent.mm.plugin.finder.assist.v1.f102611a.b().getResources().getDimension(com.tencent.mm.R.dimen.f479646bl);

    public k2() {
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.HomeUITabChangeEvent>(a0Var) { // from class: com.tencent.mm.plugin.finder.extension.reddot.FinderRedDotAvatarManager$homeUiTabChangeListener$1
            {
                this.__eventId = -1095690568;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.HomeUITabChangeEvent homeUITabChangeEvent) {
                com.tencent.mm.autogen.events.HomeUITabChangeEvent event = homeUITabChangeEvent;
                kotlin.jvm.internal.o.g(event, "event");
                zy2.z9[] z9VarArr = zy2.z9.f477641d;
                int i17 = com.tencent.mm.plugin.finder.extension.reddot.k2.f105623a;
                com.tencent.mm.plugin.finder.extension.reddot.k2.this.d(2, null);
                return false;
            }
        }.alive();
        pm0.v.X(new com.tencent.mm.plugin.finder.extension.reddot.g2(this));
    }

    public final void a(r45.qy3 qy3Var, java.util.Set set, com.tencent.mm.plugin.finder.extension.reddot.i2 i2Var) {
        if (qy3Var == null) {
            return;
        }
        oc2.v vVar = oc2.v.f344282a;
        java.lang.String k17 = vVar.k(qy3Var);
        if (!(k17.length() > 0)) {
            k17 = null;
        }
        if (k17 != null) {
            set.add(new com.tencent.mm.plugin.finder.extension.reddot.h2(k17, i2Var));
        }
        java.lang.String h17 = vVar.h(qy3Var);
        java.lang.String str = h17.length() > 0 ? h17 : null;
        if (str != null) {
            set.add(new com.tencent.mm.plugin.finder.extension.reddot.h2(str, i2Var));
        }
    }

    public final void b(r45.cp5 cp5Var, java.util.Set set) {
        r45.lp lpVar;
        r45.lp lpVar2;
        if (cp5Var.f371768d != 3) {
            return;
        }
        r45.yo5 yo5Var = cp5Var.f371770f;
        float floatValue = ((yo5Var == null || (lpVar2 = yo5Var.f391262e) == null) ? java.lang.Integer.valueOf(f105623a) : java.lang.Float.valueOf(lpVar2.f379687f)).floatValue();
        r45.yo5 yo5Var2 = cp5Var.f371770f;
        boolean a17 = kotlin.jvm.internal.o.a((yo5Var2 == null || (lpVar = yo5Var2.f391262e) == null) ? null : java.lang.Float.valueOf(lpVar.f379687f), 0.5f);
        com.tencent.mm.plugin.finder.extension.reddot.i2 i2Var = (floatValue > 0.0f ? 1 : (floatValue == 0.0f ? 0 : -1)) == 0 ? com.tencent.mm.plugin.finder.extension.reddot.i2.f105583e : !a17 ? com.tencent.mm.plugin.finder.extension.reddot.i2.f105584f : com.tencent.mm.plugin.finder.extension.reddot.i2.f105582d;
        oc2.v vVar = oc2.v.f344282a;
        oc2.w wVar = oc2.w.f344289d;
        vVar.q(vVar.g(cp5Var, wVar), a17, floatValue);
        oc2.w wVar2 = oc2.w.f344290e;
        vVar.q(vVar.g(cp5Var, wVar2), a17, floatValue);
        oc2.w wVar3 = oc2.w.f344291f;
        vVar.q(vVar.g(cp5Var, wVar3), a17, floatValue);
        a(vVar.i(cp5Var, wVar), set, i2Var);
        a(vVar.i(cp5Var, wVar2), set, i2Var);
        a(vVar.i(cp5Var, wVar3), set, i2Var);
    }

    public final void c(r45.fz2 fz2Var, java.util.Set set) {
        java.util.LinkedList<r45.cp5> linkedList;
        r45.cr4 cr4Var;
        java.util.LinkedList linkedList2;
        if (fz2Var != null && (cr4Var = fz2Var.f374744g) != null && (linkedList2 = cr4Var.f371800d) != null) {
            java.util.Iterator it = linkedList2.iterator();
            while (it.hasNext()) {
                java.util.LinkedList<r45.cp5> linkedList3 = ((r45.bp5) it.next()).f370949e;
                if (linkedList3 != null) {
                    for (r45.cp5 cp5Var : linkedList3) {
                        kotlin.jvm.internal.o.d(cp5Var);
                        b(cp5Var, set);
                    }
                }
            }
        }
        if (fz2Var == null || (linkedList = fz2Var.f374741d) == null) {
            return;
        }
        for (r45.cp5 cp5Var2 : linkedList) {
            kotlin.jvm.internal.o.d(cp5Var2);
            b(cp5Var2, set);
        }
    }

    public final void d(int i17, r45.f03 f03Var) {
        com.tencent.mm.plugin.finder.storage.aj0 aj0Var = com.tencent.mm.plugin.finder.storage.aj0.f126440a;
        if (((java.lang.Boolean) com.tencent.mm.plugin.finder.storage.z70.f(com.tencent.mm.plugin.finder.storage.z70.f128432a, com.tencent.mm.plugin.finder.storage.t70.f127590a, "视频号发现页红点头像预加载开关", e42.c0.clicfg_finder_red_dot_avatar_pre_load, java.lang.Boolean.FALSE, false, com.tencent.mm.plugin.finder.storage.xf0.f128308d, 8, null)).booleanValue()) {
            zy2.z9[] z9VarArr = zy2.z9.f477641d;
            if (i17 == 1) {
                com.tencent.mars.xlog.Log.i("FinderRedDotAvatarManager", "notify preload successfully when restarting!");
            } else if (i17 == 2) {
                com.tencent.mars.xlog.Log.i("FinderRedDotAvatarManager", "notify preload successfully when changing tab!");
            } else if (i17 == 3) {
                com.tencent.mars.xlog.Log.i("FinderRedDotAvatarManager", "notify preload successfully when receiving red dot!");
            }
            com.tencent.mm.plugin.finder.extension.reddot.j2 j2Var = new com.tencent.mm.plugin.finder.extension.reddot.j2(f03Var, this);
            if (i17 == 1) {
                pm0.v.Q("FinderRedDotAvatarManager", false, j2Var, java.util.concurrent.TimeUnit.SECONDS.toMillis(30L), 2, null);
            } else {
                pm0.v.O("FinderRedDotAvatarManager", j2Var);
            }
        }
    }
}
