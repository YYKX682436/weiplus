package nd5;

/* loaded from: classes8.dex */
public final class b extends pk3.h {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
    }

    @Override // pk3.b
    public boolean M9(int i17) {
        return i17 == 4;
    }

    @Override // pk3.h
    public void O6(java.lang.Object obj) {
    }

    @Override // pk3.h
    public void P6(android.view.View view, com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c info, r45.fr4 animateData, java.lang.Object obj) {
        zk3.c Ai;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animateData, "animateData");
        if (info.f66790x225a93cf != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FileMultiTaskUIC", "handleBallInfoClicked, openFile t:%s", info);
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = m158354x19263085();
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
                long j17 = md5.b.B + 30000;
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                md5.b.B = currentTimeMillis;
                if (j17 < currentTimeMillis) {
                    gm0.j1.i();
                    md5.b.A = gm0.j1.u().l();
                }
                if (!md5.b.A) {
                    db5.t7.k(m158354x19263085, null);
                    return;
                }
            }
            r45.qs0 qs0Var = new r45.qs0();
            try {
                qs0Var.mo11468x92b714fd(info.f66790x225a93cf);
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FileMultiTaskUIC", "handleMultiTaskInfoClicked", th6);
            }
            java.lang.String m75945x2fec8307 = qs0Var.m75945x2fec8307(1);
            if (!com.p314xaae8f345.mm.vfs.w6.j(m75945x2fec8307)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FileMultiTaskUIC", "handleBallInfoClicked() %s not exist", m75945x2fec8307);
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(m158354x19263085);
                u1Var.u("");
                u1Var.g(m158354x19263085.getString(com.p314xaae8f345.mm.R.C30867xcad56011.cfe));
                u1Var.a(true);
                u1Var.l(new nd5.a());
                u1Var.q(false);
                i95.m c17 = i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.j0.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.j0.We((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.j0) c17, info.f66791xc8a07680, info.f66793x2262335f, false, 4, null);
                return;
            }
            r45.w60 w60Var = new r45.w60();
            w60Var.set(0, animateData);
            if (view != null) {
                nd0.e eVar = (nd0.e) i95.n0.c(nd0.e.class);
                android.content.Context context = view.getContext();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
                r45.kr4 kr4Var = (r45.kr4) ((md0.e) eVar).wi(context, 5);
                w60Var.set(1, kr4Var != null ? kr4Var.m75945x2fec8307(0) : null);
            }
            w60Var.set(3, bm5.f1.a());
            if (qs0Var.m75933x41a8a7f2(0)) {
                android.content.Intent intent = new android.content.Intent();
                intent.setClassName(m158354x19263085, "com.tencent.mm.ui.chatting.AppAttachNewDownloadUI");
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1) ((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.l0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.l0.class))).getClass();
                al3.d.a(intent, qs0Var);
                intent.putExtra("key_multi_task_common_info", w60Var.mo14344x5f01b1f6());
                android.os.Bundle extras = intent.getExtras();
                if (extras != null) {
                    extras.putInt(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, 9);
                }
                intent.addFlags(268435456);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(intent);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(m158354x19263085, arrayList.toArray(), "com/tencent/mm/ui/chatting/multitask/uic/FileMultiTaskUIC", "onMultiTaskItemClick", "(Landroid/view/View;Lcom/tencent/mm/plugin/multitask/model/MultiTaskInfo;Lcom/tencent/mm/protocal/protobuf/MultiTaskAnimData;Ljava/lang/Object;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                m158354x19263085.startActivity((android.content.Intent) arrayList.get(0));
                yj0.a.f(m158354x19263085, "com/tencent/mm/ui/chatting/multitask/uic/FileMultiTaskUIC", "onMultiTaskItemClick", "(Landroid/view/View;Lcom/tencent/mm/plugin/multitask/model/MultiTaskInfo;Lcom/tencent/mm/protocal/protobuf/MultiTaskAnimData;Ljava/lang/Object;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            } else {
                java.lang.String m75945x2fec83072 = qs0Var.m75945x2fec8307(2);
                java.lang.String m75945x2fec83073 = qs0Var.m75945x2fec8307(3);
                java.lang.String m75945x2fec83074 = qs0Var.m75945x2fec8307(4);
                boolean m75933x41a8a7f2 = qs0Var.m75933x41a8a7f2(6);
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(m75945x2fec83074)) {
                    jt.v vVar = (jt.v) i95.n0.c(jt.v.class);
                    java.lang.String m75945x2fec83075 = info.v0().m75945x2fec8307(1);
                    ((ht.a) vVar).getClass();
                    com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f.j(0L, "", m75945x2fec8307, m75945x2fec83072, m75945x2fec83075, 9, w60Var);
                } else {
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.f5) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.f5.class)).v7(m158354x19263085, m75945x2fec8307, m75945x2fec83072, m75945x2fec83073, m75933x41a8a7f2, m75945x2fec83074);
                }
            }
            if (!(m158354x19263085 instanceof com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.ActivityC19732x78a3bb7f) || (Ai = ((ia0.o) ((ia0.n) i95.n0.c(ia0.n.class))).Ai(m158354x19263085)) == null) {
                return;
            }
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.ui.uic.C16620x3de5dd31) Ai).h7(false);
        }
    }

    @Override // pk3.h
    public void S6() {
    }

    @Override // pk3.h
    public void T6() {
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: getLayoutId */
    public int mo569x2ee31f5b() {
        return super.mo569x2ee31f5b();
    }

    @Override // pk3.b
    public pk3.a i0() {
        return pk3.a.f437968e;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onActivityResult */
    public void mo2273x9d4787cb(int i17, int i18, android.content.Intent intent) {
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onBackPressed */
    public boolean mo2274xbdc3c5dc() {
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onBeforeFinish */
    public void mo2275x62f76871(android.content.Intent intent) {
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onConfigurationChanged */
    public void mo2276x50e1c15d(android.content.res.Configuration newConfig) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(newConfig, "newConfig");
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        m80380x71e92c1d().findViewById(super.mo569x2ee31f5b());
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onCreateAfter */
    public void mo739xfd763ae1(android.os.Bundle bundle) {
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onCreateBefore */
    public void mo2277xb2f1ab1a(android.os.Bundle bundle) {
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onKeyDown */
    public boolean mo2278x1f03f0c2(int i17, android.view.KeyEvent event) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onKeyUp */
    public boolean mo2279xafd962bb(int i17, android.view.KeyEvent event) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onPause */
    public void mo2281xb01dfb57() {
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onRequestPermissionsResult */
    public void mo2282x953457f1(int i17, java.lang.String[] permissions, int[] grantResults) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(permissions, "permissions");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(grantResults, "grantResults");
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onRestoreInstanceState */
    public void mo2283xb949e58d(android.os.Bundle bundle) {
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onResume */
    public void mo2284x57429eec() {
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onSaveInstanceState */
    public void mo2285xa71a2260(android.os.Bundle bundle) {
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onStart */
    public void mo2286xb05099c3() {
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onStartActivityForResult */
    public void mo14640xb30cf874(android.content.Intent intent, int i17, android.os.Bundle bundle) {
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onStop */
    public void mo2287xc39f8281() {
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onUserVisibleFocused */
    public void mo58275xd317978f() {
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onUserVisibleUnFocused */
    public void mo58437xaa858cb6() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 fragment) {
        super(fragment);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fragment, "fragment");
    }
}
