package com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui;

/* loaded from: classes.dex */
public final class r5 implements p3325xe03a0797.p3326xc267989b.p3328x30012e.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f254658d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.ActivityC18589x3dbac5d0 f254659e;

    public r5(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var, com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.ActivityC18589x3dbac5d0 activityC18589x3dbac5d0) {
        this.f254658d = u3Var;
        this.f254659e = activityC18589x3dbac5d0;
    }

    @Override // p3325xe03a0797.p3326xc267989b.p3328x30012e.k
    /* renamed from: emit */
    public java.lang.Object mo771x2f8fd3(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        java.lang.String str;
        o01.a aVar = (o01.a) obj;
        if (aVar.f440817a == q01.f.f440809e) {
            this.f254658d.dismiss();
            int i17 = aVar.f440819c;
            com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.ActivityC18589x3dbac5d0 activityC18589x3dbac5d0 = this.f254659e;
            if (i17 == 0) {
                db5.t7.h(activityC18589x3dbac5d0.mo55332x76847179(), activityC18589x3dbac5d0.getString(com.p314xaae8f345.mm.R.C30867xcad56011.jtf));
                vh4.t1 t1Var = (vh4.t1) i95.n0.c(vh4.t1.class);
                r45.w26 w26Var = (r45.w26) aVar.f440822f;
                if (w26Var == null || (str = w26Var.f470340d) == null) {
                    str = null;
                }
                t1Var.f518671h = str;
                ((vh4.t1) i95.n0.c(vh4.t1.class)).f518672i = 2;
                if (activityC18589x3dbac5d0.getIntent().getBooleanExtra("IntentKey_DontGoPwdUI", false)) {
                    activityC18589x3dbac5d0.setResult(-1);
                    activityC18589x3dbac5d0.finish();
                } else {
                    android.content.Intent intent = new android.content.Intent(activityC18589x3dbac5d0.mo55332x76847179(), (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.ActivityC18590xc3d8bf2b.class);
                    intent.putExtra("intent_process", 4);
                    intent.addFlags(67108864);
                    com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.ActivityC18589x3dbac5d0 activityC18589x3dbac5d02 = this.f254659e;
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    arrayList.add(intent);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(activityC18589x3dbac5d02, arrayList.toArray(), "com/tencent/mm/plugin/teenmode/ui/TeenModeGuardianInfoUI$doScene$1$1", "emit", "(Lcom/tencent/mm/modelbase/flow/FlowEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    activityC18589x3dbac5d02.startActivity((android.content.Intent) arrayList.get(0));
                    yj0.a.f(activityC18589x3dbac5d02, "com/tencent/mm/plugin/teenmode/ui/TeenModeGuardianInfoUI$doScene$1$1", "emit", "(Lcom/tencent/mm/modelbase/flow/FlowEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                }
                ((vh4.t1) i95.n0.c(vh4.t1.class)).T(14);
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.ActivityC18589x3dbac5d0.Z6(activityC18589x3dbac5d0, aVar.f440820d);
                ((vh4.t1) i95.n0.c(vh4.t1.class)).T(13);
            }
        }
        return jz5.f0.f384359a;
    }
}
