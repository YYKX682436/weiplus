package com.tencent.mm.accessibility.core;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/accessibility/core/AccFrequencyControlReporter;", "Lx51/i0;", "Ljz5/f0;", "realReport", "<init>", "()V", "feature-autoaccessibility_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes8.dex */
public abstract class AccFrequencyControlReporter extends x51.i0 {
    @Override // x51.i0
    public void realReport() {
        com.tencent.mars.xlog.Log.i(getTAG(), "realReport");
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej(getEventId(), onReportParams(), getRouteRule());
    }
}
