package com.p314xaae8f345.mm.p648x55baa833.ui;

/* loaded from: classes14.dex */
public class kc implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p648x55baa833.ui.lc f145816d;

    public kc(com.p314xaae8f345.mm.p648x55baa833.ui.lc lcVar) {
        this.f145816d = lcVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p648x55baa833.ui.lc lcVar = this.f145816d;
        lcVar.f145845d.f145498m.setVisibility(8);
        com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10368x68cc8efe activityC10368x68cc8efe = lcVar.f145845d;
        com.p314xaae8f345.mm.p648x55baa833.ui.C10341xc7527cef c10341xc7527cef = activityC10368x68cc8efe.f145492d;
        long j17 = activityC10368x68cc8efe.f145495g;
        if (j17 == -1) {
            j17 = java.lang.System.currentTimeMillis() * 1000;
        }
        c10341xc7527cef.m43526x1bc791b5(j17);
        com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10368x68cc8efe activityC10368x68cc8efe2 = lcVar.f145845d;
        com.p314xaae8f345.mm.p648x55baa833.ui.C10341xc7527cef c10341xc7527cef2 = activityC10368x68cc8efe2.f145492d;
        java.util.Collection<kn.a> values = activityC10368x68cc8efe2.f145494f.values();
        c10341xc7527cef2.f145274c2 = activityC10368x68cc8efe2;
        c10341xc7527cef2.m43528xb030c9f2(values);
        c10341xc7527cef2.mo7960x6cab2c8d(c10341xc7527cef2.f145273b2);
        int mo1894x7e414b06 = c10341xc7527cef2.f145273b2.mo1894x7e414b06() - 1;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(mo1894x7e414b06));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(c10341xc7527cef2, arrayList.toArray(), "com/tencent/mm/chatroom/ui/DayPickerView", "setController", "(Lcom/tencent/mm/chatroom/adapter/DatePickerController;Ljava/util/Collection;)V", "Undefined", "scrollToPosition", "(I)V");
        c10341xc7527cef2.a1(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(c10341xc7527cef2, "com/tencent/mm/chatroom/ui/DayPickerView", "setController", "(Lcom/tencent/mm/chatroom/adapter/DatePickerController;Ljava/util/Collection;)V", "Undefined", "scrollToPosition", "(I)V");
        c10341xc7527cef2.f145273b2.m8146xced61ae5();
        if (lcVar.f145845d.f145494f.size() == 0) {
            lcVar.f145845d.f145497i.setVisibility(0);
            lcVar.f145845d.f145492d.setVisibility(8);
            lcVar.f145845d.f145498m.setVisibility(8);
            com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10368x68cc8efe activityC10368x68cc8efe3 = lcVar.f145845d;
            activityC10368x68cc8efe3.f145497i.setText(activityC10368x68cc8efe3.getString(com.p314xaae8f345.mm.R.C30867xcad56011.b5e));
            return;
        }
        lcVar.f145845d.f145497i.setVisibility(8);
        lcVar.f145845d.f145492d.setVisibility(0);
        int[] T6 = lcVar.f145845d.T6();
        if (T6 == null) {
            int[] m43523xbcd1ef6e = lcVar.f145845d.f145492d.m43523xbcd1ef6e();
            lcVar.f145845d.V6(m43523xbcd1ef6e[0], m43523xbcd1ef6e[1] + 1);
            lcVar.f145845d.f145498m.setVisibility(0);
        } else if (T6.length == 2) {
            lcVar.f145845d.V6(T6[0], T6[1]);
            lcVar.f145845d.f145498m.setVisibility(0);
        }
    }
}
