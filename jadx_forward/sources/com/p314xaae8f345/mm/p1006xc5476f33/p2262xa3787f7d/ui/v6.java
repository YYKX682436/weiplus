package com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui;

/* loaded from: classes.dex */
public final class v6 implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.ActivityC18590xc3d8bf2b f254699d;

    public v6(com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.ActivityC18590xc3d8bf2b activityC18590xc3d8bf2b) {
        this.f254699d = activityC18590xc3d8bf2b;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        if (!(editable != null && editable.length() == 4)) {
            if (editable != null && editable.length() == 0) {
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.ActivityC18590xc3d8bf2b activityC18590xc3d8bf2b = this.f254699d;
            int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.ActivityC18590xc3d8bf2b.f254433r;
            activityC18590xc3d8bf2b.j7();
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.ActivityC18590xc3d8bf2b activityC18590xc3d8bf2b2 = this.f254699d;
        int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.ActivityC18590xc3d8bf2b.f254433r;
        int e76 = activityC18590xc3d8bf2b2.e7();
        p3325xe03a0797.p3326xc267989b.a1 a1Var = p3325xe03a0797.p3326xc267989b.a1.DEFAULT;
        o01.c cVar = o01.d.f423424a;
        if (e76 == 1 || this.f254699d.e7() == 5) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.ActivityC18590xc3d8bf2b activityC18590xc3d8bf2b3 = this.f254699d;
            activityC18590xc3d8bf2b3.getClass();
            r45.ey6 ey6Var = new r45.ey6();
            ey6Var.f455364d = activityC18590xc3d8bf2b3.c7(activityC18590xc3d8bf2b3.k7());
            activityC18590xc3d8bf2b3.f254439m = db5.e1.Q(activityC18590xc3d8bf2b3, activityC18590xc3d8bf2b3.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), activityC18590xc3d8bf2b3.getString(com.p314xaae8f345.mm.R.C30867xcad56011.jtq), true, false, null);
            com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
            lVar.f152200d = 6895;
            lVar.f152199c = "/cgi-bin/micromsg-bin/verifyteenagermodepwd";
            lVar.f152197a = ey6Var;
            lVar.f152198b = new r45.fy6();
            p3325xe03a0797.p3326xc267989b.p3328x30012e.j a17 = cVar.a(lVar.a());
            p012xc85e97e9.p093xedfae76a.c1 a18 = pf5.z.f435481a.a(activityC18590xc3d8bf2b3).a(um3.b.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a18, "get(...)");
            com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a O6 = ((um3.b) a18).O6();
            p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
            p3325xe03a0797.p3326xc267989b.l.c(O6, p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a, a1Var, new com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.l6(a17, activityC18590xc3d8bf2b3, null));
            return;
        }
        if (this.f254699d.e7() == 2) {
            if (this.f254699d.h7()) {
                android.content.Intent intent = new android.content.Intent(this.f254699d.mo55332x76847179(), (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.ActivityC18590xc3d8bf2b.class);
                intent.putExtra(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.ActionValue.f61537x616964d2, this.f254699d.k7());
                intent.putExtra("intent_process", 2);
                intent.putExtra("intent_process_step_one", false);
                this.f254699d.startActivityForResult(intent, 100);
                return;
            }
            if (!this.f254699d.k7().equals(this.f254699d.getIntent().getStringExtra(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.ActionValue.f61537x616964d2))) {
                android.content.Intent intent2 = new android.content.Intent();
                intent2.putExtra("result_err", this.f254699d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.jto));
                this.f254699d.setResult(0, intent2);
                this.f254699d.finish();
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.ActivityC18590xc3d8bf2b activityC18590xc3d8bf2b4 = this.f254699d;
            activityC18590xc3d8bf2b4.f254439m = db5.e1.Q(activityC18590xc3d8bf2b4, activityC18590xc3d8bf2b4.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), activityC18590xc3d8bf2b4.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572085yb), true, false, null);
            r45.v26 v26Var = new r45.v26();
            v26Var.f469360d = activityC18590xc3d8bf2b4.c7(activityC18590xc3d8bf2b4.k7());
            v26Var.f469363g = 2;
            v26Var.f469364h = ((vh4.t1) i95.n0.c(vh4.t1.class)).f518671h;
            v26Var.f469365i = 2;
            com.p314xaae8f345.mm.p944x882e457a.l lVar2 = new com.p314xaae8f345.mm.p944x882e457a.l();
            lVar2.f152200d = 4277;
            lVar2.f152199c = "/cgi-bin/micromsg-bin/setteenagermodepwd";
            lVar2.f152197a = v26Var;
            lVar2.f152198b = new r45.w26();
            p3325xe03a0797.p3326xc267989b.p3328x30012e.j a19 = cVar.a(lVar2.a());
            p012xc85e97e9.p093xedfae76a.c1 a27 = pf5.z.f435481a.a(activityC18590xc3d8bf2b4).a(um3.b.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a27, "get(...)");
            com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a O62 = ((um3.b) a27).O6();
            p3325xe03a0797.p3326xc267989b.p0 p0Var2 = p3325xe03a0797.p3326xc267989b.q1.f392101a;
            p3325xe03a0797.p3326xc267989b.l.c(O62, p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a, a1Var, new com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.g6(a19, activityC18590xc3d8bf2b4, null));
            return;
        }
        if (this.f254699d.e7() == 3) {
            if (this.f254699d.h7()) {
                android.content.Intent intent3 = new android.content.Intent(this.f254699d.mo55332x76847179(), (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.ActivityC18590xc3d8bf2b.class);
                intent3.putExtra(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.ActionValue.f61537x616964d2, this.f254699d.k7());
                intent3.putExtra("intent_process", 3);
                intent3.putExtra("intent_process_step_one", false);
                this.f254699d.startActivityForResult(intent3, 100);
                return;
            }
            if (!this.f254699d.k7().equals(this.f254699d.getIntent().getStringExtra(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.ActionValue.f61537x616964d2))) {
                android.content.Intent intent4 = new android.content.Intent();
                intent4.putExtra("result_err", this.f254699d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.jto));
                this.f254699d.setResult(0, intent4);
                this.f254699d.finish();
                return;
            }
            if (c01.e2.a0()) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.ActivityC18590xc3d8bf2b activityC18590xc3d8bf2b5 = this.f254699d;
                activityC18590xc3d8bf2b5.f254439m = db5.e1.Q(activityC18590xc3d8bf2b5, activityC18590xc3d8bf2b5.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), activityC18590xc3d8bf2b5.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572085yb), true, false, null);
                r45.v26 v26Var2 = new r45.v26();
                v26Var2.f469360d = activityC18590xc3d8bf2b5.c7(activityC18590xc3d8bf2b5.k7());
                v26Var2.f469363g = 1;
                com.p314xaae8f345.mm.p944x882e457a.l lVar3 = new com.p314xaae8f345.mm.p944x882e457a.l();
                lVar3.f152200d = 4277;
                lVar3.f152199c = "/cgi-bin/micromsg-bin/setteenagermodepwd";
                lVar3.f152197a = v26Var2;
                lVar3.f152198b = new r45.w26();
                p3325xe03a0797.p3326xc267989b.p3328x30012e.j a28 = cVar.a(lVar3.a());
                p012xc85e97e9.p093xedfae76a.c1 a29 = pf5.z.f435481a.a(activityC18590xc3d8bf2b5).a(um3.b.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a29, "get(...)");
                com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a O63 = ((um3.b) a29).O6();
                p3325xe03a0797.p3326xc267989b.p0 p0Var3 = p3325xe03a0797.p3326xc267989b.q1.f392101a;
                p3325xe03a0797.p3326xc267989b.l.c(O63, p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a, a1Var, new com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.e6(a28, activityC18590xc3d8bf2b5, null));
                return;
            }
            if (this.f254699d.i7()) {
                android.content.Intent intent5 = new android.content.Intent();
                intent5.putExtra(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.ActionValue.f61537x616964d2, this.f254699d.k7());
                intent5.putExtra("IntentResult_GoTeenModeGuardianInfoUI", true);
                this.f254699d.setResult(0);
            } else {
                android.content.Intent intent6 = new android.content.Intent(this.f254699d.mo55332x76847179(), (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.ActivityC18589x3dbac5d0.class);
                intent6.putExtra(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.ActionValue.f61537x616964d2, this.f254699d.k7());
                com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.ActivityC18590xc3d8bf2b activityC18590xc3d8bf2b6 = this.f254699d;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(intent6);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(activityC18590xc3d8bf2b6, arrayList.toArray(), "com/tencent/mm/plugin/teenmode/ui/TeenModePrivatePwdUI$onCreate$6", "afterTextChanged", "(Landroid/text/Editable;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                activityC18590xc3d8bf2b6.startActivity((android.content.Intent) arrayList.get(0));
                yj0.a.f(activityC18590xc3d8bf2b6, "com/tencent/mm/plugin/teenmode/ui/TeenModePrivatePwdUI$onCreate$6", "afterTextChanged", "(Landroid/text/Editable;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            }
            ku5.u0 u0Var = ku5.t0.f394148d;
            com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.u6 u6Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.u6(this.f254699d);
            ku5.t0 t0Var = (ku5.t0) u0Var;
            t0Var.getClass();
            t0Var.z(u6Var, 200L, false);
        }
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }
}
