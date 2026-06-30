package com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p760xf66bc0bb;

/* loaded from: classes9.dex */
public final class e0 {
    public e0(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final boolean a(java.lang.Class task, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(task, "task");
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putBoolean("key_is_cancel", z17);
        bundle.putString("key_task_name", task.getName());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BgScheduler", "isCancel " + z17 + " task " + task.getName());
        com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10750x9556b48c c10750x9556b48c = (com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10750x9556b48c) com.p314xaae8f345.mm.p794xb0fa9b5e.d0.f(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a, bundle, com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p760xf66bc0bb.f0.class);
        if (c10750x9556b48c != null) {
            return c10750x9556b48c.f149933d;
        }
        return false;
    }
}
