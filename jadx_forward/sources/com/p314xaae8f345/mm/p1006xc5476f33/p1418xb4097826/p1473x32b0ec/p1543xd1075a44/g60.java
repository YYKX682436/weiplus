package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class g60 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.z60 f199942d;

    public g60(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.z60 z60Var) {
        this.f199942d = z60Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa;
        p3325xe03a0797.p3326xc267989b.p3328x30012e.f3 f3Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/FinderStartLiveModeTabWidget$createCoLiveOptionsContainer$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.z60 z60Var = this.f199942d;
        z60Var.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderStartLiveModeTabWidget", "Show co live setting panel");
        gk2.e eVar = dk2.ef.I;
        mm2.n0 n0Var = eVar != null ? (mm2.n0) eVar.a(mm2.n0.class) : null;
        android.content.Context context = z60Var.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        java.lang.String e17 = xy2.c.e(context);
        boolean z17 = n0Var != null && n0Var.O6();
        boolean z18 = n0Var != null && n0Var.P6(e17);
        r45.f50 f50Var = (n0Var == null || (f3Var = n0Var.f410798g) == null) ? null : (r45.f50) ((p3325xe03a0797.p3326xc267989b.p3328x30012e.l2) f3Var).mo144003x754a37bb();
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        re2.e0 e0Var = re2.j1.f475971b;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[showCoLiveSettingDialog] hasActiveInvitation=");
        sb6.append(z17);
        sb6.append(", isInitiator=");
        sb6.append(z18);
        sb6.append(", invitationId=");
        sb6.append(f50Var != null ? java.lang.Long.valueOf(f50Var.f455546d) : null);
        sb6.append(", status=");
        sb6.append(f50Var != null ? java.lang.Integer.valueOf(f50Var.f455547e) : null);
        sb6.append(", role=");
        sb6.append(f50Var != null ? java.lang.Integer.valueOf(f50Var.f455552m) : null);
        sb6.append(", initiatorUsername=");
        sb6.append((f50Var == null || (c19782x23db1cfa = f50Var.f455550h) == null) ? null : c19782x23db1cfa.m76197x6c03c64c());
        sb6.append(", myFinderUsername=");
        sb6.append(e17);
        sb6.append(", expireTime=");
        sb6.append(f50Var != null ? java.lang.Long.valueOf(f50Var.f455551i) : null);
        sb6.append(", now=");
        sb6.append(currentTimeMillis);
        sb6.append(", existingTaskPhase=");
        sb6.append(e0Var != null ? e0Var.f475922b : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderStartLiveModeTabWidget", sb6.toString());
        if ((e0Var == null || !e0Var.d()) && !(z17 && z18)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderStartLiveModeTabWidget", "[showCoLiveSettingDialog] 无有效邀请 → 打开 SettingPanel");
            android.content.Context context2 = z60Var.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.yb ybVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.yb(context2);
            ybVar.I = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.y60(ybVar, e17, z60Var);
            ybVar.V(null, true, 0);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderStartLiveModeTabWidget", "[showCoLiveSettingDialog] 复用/恢复 Task → 打开 PreparePanel");
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(android.os.Looper.myLooper(), android.os.Looper.getMainLooper())) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.ta taVar = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.nb.W;
                android.content.Context context3 = z60Var.getContext();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context3, "getContext(...)");
                taVar.a(context3);
            } else {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.t60(z60Var));
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/FinderStartLiveModeTabWidget$createCoLiveOptionsContainer$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
