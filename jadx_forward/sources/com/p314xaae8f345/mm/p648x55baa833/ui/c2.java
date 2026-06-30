package com.p314xaae8f345.mm.p648x55baa833.ui;

/* loaded from: classes4.dex */
public final class c2 implements vg3.j3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10339x9e5e23ee f145598a;

    public c2(com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10339x9e5e23ee activityC10339x9e5e23ee) {
        this.f145598a = activityC10339x9e5e23ee;
    }

    @Override // vg3.j3
    public final void a(boolean z17, java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10339x9e5e23ee activityC10339x9e5e23ee;
        r45.kt5 kt5Var;
        if (z17 && (kt5Var = (activityC10339x9e5e23ee = this.f145598a).f145266i) != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(kt5Var);
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(kt5Var.f460475e)) {
                return;
            }
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(activityC10339x9e5e23ee.f145266i);
            r2.f460474d--;
            try {
                r45.kt5 kt5Var2 = activityC10339x9e5e23ee.f145266i;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(kt5Var2);
                kt5Var2.f460475e.removeFirst();
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChatroomManagerUI", e17.getMessage());
            }
            com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10339x9e5e23ee.V6(activityC10339x9e5e23ee);
        }
    }
}
