package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2659x30c033;

/* renamed from: com.tencent.mm.ui.chatting.half.NotificationHalfScreenChattingUIC */
/* loaded from: classes11.dex */
public final class C21808xf12b2fdf extends rc5.x {

    /* renamed from: J, reason: collision with root package name */
    public static final /* synthetic */ int f283199J = 0;
    public java.lang.String E;
    public java.lang.String F;
    public long G;
    public boolean H;
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21808xf12b2fdf(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.E = "";
        this.F = "";
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        this.I = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5993x579c3db0>(a0Var) { // from class: com.tencent.mm.ui.chatting.half.NotificationHalfScreenChattingUIC$msgSuccessListener$1
            {
                this.f39173x3fe91575 = -1168836192;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5993x579c3db0 c5993x579c3db0) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5993x579c3db0 event = c5993x579c3db0;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = event.f136288g.f89192a;
                if (f9Var.A0() == 1) {
                    java.lang.String Q0 = f9Var.Q0();
                    com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2659x30c033.C21808xf12b2fdf c21808xf12b2fdf = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2659x30c033.C21808xf12b2fdf.this;
                    if (Q0.equals(c21808xf12b2fdf.E)) {
                        c21808xf12b2fdf.B7(yd5.m.f542651e);
                    }
                }
                return true;
            }
        };
    }

    public final void B7(yd5.m actionType) {
        if (y7() || this.H) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NotificationHalfScreenChattingUIC", "reportHalfScreenAction expanded or marked as unread, ignore");
            return;
        }
        yd5.n nVar = yd5.n.f542657a;
        java.lang.String talker = this.E;
        long j17 = this.G;
        java.lang.String baseActivityClassName = this.F;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(actionType, "actionType");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(talker, "talker");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(baseActivityClassName, "baseActivityClassName");
        java.util.Map map = yd5.n.f542658b;
        ((java.util.LinkedHashMap) map).clear();
        map.put("chat_name", talker);
        map.put("select_the_click", java.lang.Integer.valueOf(actionType.f542656d));
        map.put("push_reception_time", java.lang.Long.valueOf(j17));
        map.put("push_pop_up_scene", java.lang.Integer.valueOf(nVar.a(baseActivityClassName)));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NotificationHalfScreenReporter", "reportHalfScreenAction: " + map);
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        if (rVar != null) {
            ((cy1.a) rVar).Ej("msg_half_screen_act_event", map, 35045);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.db
    public void a7() {
    }

    @Override // rc5.x, com.p314xaae8f345.mm.ui.p2650x55bb7a46.db
    public boolean g7(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.pe headerComponent, yb5.d chattingContext) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(headerComponent, "headerComponent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(chattingContext, "chattingContext");
        if (y7()) {
            return false;
        }
        z7(headerComponent, chattingContext);
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.db
    public void m7() {
        if (m158354x19263085().isFinishing() || m158354x19263085().isDestroyed()) {
            return;
        }
        m158354x19263085().finish();
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.db
    public void o7() {
        B7(yd5.m.f542653g);
        this.H = true;
    }

    @Override // rc5.x, com.p314xaae8f345.mm.ui.p2650x55bb7a46.db, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onCreateAfter */
    public void mo739xfd763ae1(android.os.Bundle bundle) {
        super.mo739xfd763ae1(bundle);
        java.lang.String stringExtra = m158359x1e885992().getStringExtra("Main_User");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.E = stringExtra;
        this.G = m158359x1e885992().getLongExtra("notification_create_time", 0L);
        java.lang.String stringExtra2 = m158359x1e885992().getStringExtra("notification_task_base_activity_name");
        this.F = stringExtra2 != null ? stringExtra2 : "";
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NotificationHalfScreenChattingUIC", "initReportData talker: " + this.E + ", baseActivityClassName: " + this.F + ", notificationCreateTime: " + this.G);
        this.I.mo48813x58998cd();
    }

    @Override // rc5.x, com.p314xaae8f345.mm.ui.p2650x55bb7a46.db, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onCreateBefore */
    public void mo2277xb2f1ab1a(android.os.Bundle bundle) {
        android.app.Activity activity;
        super.mo2277xb2f1ab1a(bundle);
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 newActivity = m158354x19263085();
        java.lang.String stringExtra = m158359x1e885992().getStringExtra("key_current_task_affinity");
        if (stringExtra == null) {
            stringExtra = "";
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(newActivity, "newActivity");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("updateHalfScreenActivity: newActivity = ");
        sb6.append(newActivity);
        sb6.append(" oldActivity = ");
        java.lang.ref.WeakReference weakReference = te5.o1.f500253a;
        sb6.append(weakReference != null ? (android.app.Activity) weakReference.get() : null);
        sb6.append(" taskAffinity = ");
        sb6.append(stringExtra);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NotificationHalfScreenHelper", sb6.toString());
        java.lang.ref.WeakReference weakReference2 = te5.o1.f500253a;
        if (weakReference2 != null && (activity = (android.app.Activity) weakReference2.get()) != null && !activity.isFinishing() && !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(te5.o1.f500254b, stringExtra)) {
            activity.finish();
        }
        te5.o1.f500254b = stringExtra;
        te5.o1.f500253a = new java.lang.ref.WeakReference(newActivity);
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onPreDestroyed */
    public void mo47482x6fa9d635() {
        super.mo47482x6fa9d635();
        B7(yd5.m.f542652f);
        this.I.mo48814x2efc64();
    }

    @Override // rc5.x
    public void r7() {
        m158359x1e885992().putExtra("finish_direct", false);
        android.app.Activity m80379x76847179 = m80379x76847179();
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2677xb585008e.ActivityC21879x59e06c13 activityC21879x59e06c13 = m80379x76847179 instanceof com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2677xb585008e.ActivityC21879x59e06c13 ? (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2677xb585008e.ActivityC21879x59e06c13) m80379x76847179 : null;
        if (activityC21879x59e06c13 != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingMainUI", "onExpandClicked topInset=0");
            if (activityC21879x59e06c13.f279789m != null && com.p314xaae8f345.mm.ui.b4.c(activityC21879x59e06c13)) {
                activityC21879x59e06c13.f279789m.m81262xe4312112(al5.r.f87538e);
                activityC21879x59e06c13.f279789m.M();
                vj5.n.b(activityC21879x59e06c13).f(activityC21879x59e06c13.f279794r);
            }
        }
        super.r7();
    }

    @Override // rc5.x
    public float s7() {
        return 0.75f;
    }

    @Override // rc5.x
    public int t7() {
        return 1;
    }

    @Override // rc5.x
    public com.p314xaae8f345.mm.ui.bc v7() {
        return new rc5.b0(this);
    }

    @Override // rc5.x
    public void w7(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.pe headerComponent, com.p314xaae8f345.mm.ui.bc optionListener, yb5.d chattingContext) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(headerComponent, "headerComponent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(optionListener, "optionListener");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(chattingContext, "chattingContext");
        headerComponent.K0(0, 0, com.p314xaae8f345.mm.R.raw.f81060xe6b2d9ce, optionListener);
        chattingContext.f542250l.m78709xb0dfae51(0, true);
    }

    @Override // rc5.x
    public boolean x7() {
        return !m158359x1e885992().getBooleanExtra("KIsEnterFromHalfScreen", false);
    }
}
