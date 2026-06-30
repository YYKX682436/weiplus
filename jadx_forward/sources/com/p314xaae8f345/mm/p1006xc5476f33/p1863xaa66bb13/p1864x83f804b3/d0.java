package com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3;

@j95.b
/* loaded from: classes11.dex */
public class d0 extends i95.w implements vg3.r3 {
    public void wi(android.content.Context context, yz5.l callback) {
        ah3.m mVar = ah3.m.f86438a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112 = context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 ? (p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context : null;
        if (activityC0065xcd7aa112 != null) {
            p3325xe03a0797.p3326xc267989b.l.d(v65.m.b(activityC0065xcd7aa112), p3325xe03a0797.p3326xc267989b.q1.f392101a, null, new ah3.l(callback, null), 2, null);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BatchGetContactHelper", "tryRequest not lifeCycleOwner");
            callback.mo146xb9724478(java.lang.Boolean.FALSE);
        }
    }
}
