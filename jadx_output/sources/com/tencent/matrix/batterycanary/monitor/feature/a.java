package com.tencent.matrix.batterycanary.monitor.feature;

/* loaded from: classes12.dex */
public class a implements wh.t0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ rh.c1 f52594a;

    public a(rh.c1 c1Var) {
        this.f52594a = c1Var;
    }

    @Override // wh.t0
    public void accept(java.lang.Object obj) {
        rh.o2 o2Var = (rh.o2) obj;
        long max = java.lang.Math.max(1L, o2Var.f395487d / 60000);
        if (max < 5) {
            return;
        }
        for (com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$JiffiesSnapshot.ThreadJiffiesEntry threadJiffiesEntry : ((com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$JiffiesSnapshot) o2Var.f395486c).f52562h.f395560a) {
            if (((java.lang.Long) threadJiffiesEntry.f395552a).longValue() / max < 3000) {
                return;
            }
            rh.c1 c1Var = this.f52594a;
            java.lang.String a17 = c1Var.f395329k.f363335d.A.a(threadJiffiesEntry.f52565b);
            if (!android.text.TextUtils.isEmpty(a17)) {
                ((java.util.HashMap) c1Var.f395328j).put(java.lang.String.valueOf(threadJiffiesEntry.f52565b), a17);
            }
        }
    }
}
