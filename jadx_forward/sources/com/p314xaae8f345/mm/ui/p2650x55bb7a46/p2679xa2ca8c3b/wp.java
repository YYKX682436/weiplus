package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes9.dex */
public class wp implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f287487d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.q f287488e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.xp f287489f;

    public wp(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.xp xpVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.q qVar) {
        this.f287489f = xpVar;
        this.f287487d = f9Var;
        this.f287488e = qVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/viewitems/ChattingItemVoiceRemindRemind$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = this.f287487d;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(f9Var.z0())) {
            yj0.a.h(this, "com/tencent/mm/ui/chatting/viewitems/ChattingItemVoiceRemindRemind$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.v0 p07 = ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ro) ((sb5.q2) this.f287489f.f287537s.f542241c.a(sb5.q2.class))).p0();
        int mo79416xf806b362 = this.f287488e.mo79416xf806b362();
        if (f9Var == null) {
            p07.getClass();
        } else {
            p07.h();
            java.lang.Boolean bool = (java.lang.Boolean) c01.d9.b().p().l(4115, null);
            if (bool == null || !bool.booleanValue()) {
                c01.d9.b().p().w(4115, java.lang.Boolean.TRUE);
                p07.f284304q.Z(com.p314xaae8f345.mm.R.raw.f79714x614cd13e, com.p314xaae8f345.mm.R.C30859x5a72f63.f560029g, p07.f284305r.getString(com.p314xaae8f345.mm.R.C30867xcad56011.b4s), 4000L);
            }
            if (((sl.j) p07.f284298h).c() && f9Var.m124847x74d37ac6() == p07.f284299i) {
                p07.J(true);
            } else {
                p07.f(f9Var);
                if (f9Var.A0() == 0 && !w21.x0.n(f9Var)) {
                    p07.e(mo79416xf806b362 + 1);
                }
                p07.s();
            }
        }
        yj0.a.h(this, "com/tencent/mm/ui/chatting/viewitems/ChattingItemVoiceRemindRemind$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
