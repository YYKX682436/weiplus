package o00;

/* loaded from: classes9.dex */
public final class i implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p689xc5a27af6.ecs.p724x306930.ui.ActivityC10526x6bc25cfc f423397d;

    public i(com.p314xaae8f345.mm.p689xc5a27af6.ecs.p724x306930.ui.ActivityC10526x6bc25cfc activityC10526x6bc25cfc) {
        this.f423397d = activityC10526x6bc25cfc;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        java.lang.String str;
        java.lang.String str2;
        com.p314xaae8f345.mm.p2621x8fb0427b.k4 Bi;
        bw5.df0 df0Var = (bw5.df0) obj;
        if (df0Var == null) {
            com.p314xaae8f345.mm.p689xc5a27af6.ecs.p724x306930.ui.ActivityC10526x6bc25cfc activityC10526x6bc25cfc = this.f423397d;
            int i17 = com.p314xaae8f345.mm.p689xc5a27af6.ecs.p724x306930.ui.ActivityC10526x6bc25cfc.f147150h;
            java.lang.String string = activityC10526x6bc25cfc.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572137zq);
            o00.w wVar = new o00.w();
            wVar.f423421c = 500L;
            new java.lang.ref.WeakReference(activityC10526x6bc25cfc);
            o00.s sVar = new o00.s();
            if (string != null) {
                sVar.f423415c = string;
            }
            sVar.f423416a = new java.lang.ref.WeakReference(activityC10526x6bc25cfc);
            wVar.f423420b = sVar;
            activityC10526x6bc25cfc.f147153g = wVar;
            synchronized (wVar) {
                wu5.c cVar = wVar.f423419a;
                if (cVar != null) {
                    cVar.cancel(false);
                }
                ku5.u0 u0Var = ku5.t0.f394148d;
                o00.u uVar = new o00.u(wVar);
                long j17 = wVar.f423421c;
                ku5.t0 t0Var = (ku5.t0) u0Var;
                t0Var.getClass();
                wVar.f423419a = t0Var.z(uVar, j17, false);
            }
            return;
        }
        com.p314xaae8f345.mm.p689xc5a27af6.ecs.p724x306930.ui.ActivityC10526x6bc25cfc activityC10526x6bc25cfc2 = this.f423397d;
        o00.w wVar2 = activityC10526x6bc25cfc2.f147153g;
        if (wVar2 != null) {
            synchronized (wVar2) {
                wu5.c cVar2 = wVar2.f423419a;
                if (cVar2 != null) {
                    cVar2.cancel(false);
                }
                pm0.v.X(new o00.v(wVar2));
            }
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = null;
        activityC10526x6bc25cfc2.f147153g = null;
        com.p314xaae8f345.mm.p689xc5a27af6.ecs.p724x306930.ui.ActivityC10526x6bc25cfc activityC10526x6bc25cfc3 = this.f423397d;
        activityC10526x6bc25cfc3.getClass();
        int i18 = df0Var.f108011g;
        boolean[] zArr = df0Var.f108014m;
        if (i18 != 0) {
            str2 = zArr[6] ? df0Var.f108012h : "";
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str2, "getReplyWording(...)");
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 y1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1(activityC10526x6bc25cfc3);
            y1Var.j(com.p314xaae8f345.mm.R.C30864xbddafb2a.dyp);
            android.widget.TextView textView = (android.widget.TextView) y1Var.f293560f.findViewById(com.p314xaae8f345.mm.R.id.vfi);
            if (textView != null) {
                textView.setText(str2);
                com.p314xaae8f345.mm.ui.bk.r0(textView.getPaint(), 0.8f);
            }
            android.view.View findViewById = y1Var.f293560f.findViewById(com.p314xaae8f345.mm.R.id.vff);
            if (findViewById != null) {
                findViewById.setOnClickListener(new o00.q(y1Var));
            }
            y1Var.f293570s = new o00.r(activityC10526x6bc25cfc3);
            y1Var.s();
            return;
        }
        if (df0Var.f108010f == 0) {
            if (zArr[2]) {
                str = df0Var.f108008d;
            }
            str = "";
        } else {
            if (zArr[3]) {
                str = df0Var.f108009e;
            }
            str = "";
        }
        str2 = zArr[7] ? df0Var.f108013i : "";
        if (str2 == null || str2.length() == 0) {
            activityC10526x6bc25cfc3.P6();
            return;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str2);
        o00.p pVar = new o00.p(activityC10526x6bc25cfc3, str, str2);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.l.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a, new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d(str), com.p314xaae8f345.mm.p689xc5a27af6.ecs.p724x306930.ui.ActivityC10526x6bc25cfc.a.class, new o00.e(pVar));
            return;
        }
        vg3.x3 x3Var = (vg3.x3) gm0.j1.s(vg3.x3.class);
        if (x3Var != null && (Bi = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) x3Var).Bi()) != null) {
            z3Var = Bi.n(str, true);
        }
        pVar.mo146xb9724478(java.lang.Boolean.valueOf(z3Var != null ? com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(z3Var.d1()) ? true : z3Var.r2() : false));
    }
}
