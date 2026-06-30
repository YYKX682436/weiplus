package com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui;

/* loaded from: classes.dex */
public final class f6 implements p3325xe03a0797.p3326xc267989b.p3328x30012e.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.ActivityC18590xc3d8bf2b f254528d;

    public f6(com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.ActivityC18590xc3d8bf2b activityC18590xc3d8bf2b) {
        this.f254528d = activityC18590xc3d8bf2b;
    }

    @Override // p3325xe03a0797.p3326xc267989b.p3328x30012e.k
    /* renamed from: emit */
    public java.lang.Object mo771x2f8fd3(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        java.lang.String str;
        o01.a aVar = (o01.a) obj;
        if (aVar.f440817a == q01.f.f440809e) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.ActivityC18590xc3d8bf2b activityC18590xc3d8bf2b = this.f254528d;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = activityC18590xc3d8bf2b.f254439m;
            if (u3Var != null) {
                u3Var.dismiss();
            }
            if (aVar.f440819c == 0) {
                vh4.t1 t1Var = (vh4.t1) i95.n0.c(vh4.t1.class);
                r45.w26 w26Var = (r45.w26) aVar.f440822f;
                if (w26Var == null || (str = w26Var.f470340d) == null) {
                    str = ((vh4.t1) i95.n0.c(vh4.t1.class)).f518671h;
                }
                t1Var.f518671h = str;
                ((vh4.t1) i95.n0.c(vh4.t1.class)).f518672i = 2;
                android.content.Intent intent = new android.content.Intent(activityC18590xc3d8bf2b.mo55332x76847179(), (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.ActivityC18580x3cc47ed9.class);
                intent.addFlags(67108864);
                intent.putExtra("intent_from_sys_to_inner", activityC18590xc3d8bf2b.f254440n);
                com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.ActivityC18590xc3d8bf2b activityC18590xc3d8bf2b2 = this.f254528d;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(intent);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(activityC18590xc3d8bf2b2, arrayList.toArray(), "com/tencent/mm/plugin/teenmode/ui/TeenModePrivatePwdUI$doModify$1$1", "emit", "(Lcom/tencent/mm/modelbase/flow/FlowEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                activityC18590xc3d8bf2b2.startActivity((android.content.Intent) arrayList.get(0));
                yj0.a.f(activityC18590xc3d8bf2b2, "com/tencent/mm/plugin/teenmode/ui/TeenModePrivatePwdUI$doModify$1$1", "emit", "(Lcom/tencent/mm/modelbase/flow/FlowEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                db5.t7.h(activityC18590xc3d8bf2b.mo55332x76847179(), activityC18590xc3d8bf2b.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572013w9));
                ((vh4.t1) i95.n0.c(vh4.t1.class)).T(16);
            } else {
                android.content.Intent intent2 = new android.content.Intent();
                intent2.putExtra("result_err", aVar.f440820d);
                activityC18590xc3d8bf2b.setResult(0, intent2);
                activityC18590xc3d8bf2b.finish();
            }
        }
        return jz5.f0.f384359a;
    }
}
