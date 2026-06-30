package com.p314xaae8f345.mm.p648x55baa833.ui;

/* loaded from: classes11.dex */
public class e0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10332x8a1129f5.AnonymousClass3 f145655d;

    public e0(com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10332x8a1129f5.AnonymousClass3 anonymousClass3) {
        this.f145655d = anonymousClass3;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10332x8a1129f5.AnonymousClass3 anonymousClass3 = this.f145655d;
        com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10332x8a1129f5 activityC10332x8a1129f5 = com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10332x8a1129f5.this;
        activityC10332x8a1129f5.f145224f = true;
        activityC10332x8a1129f5.m7();
        com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10332x8a1129f5 activityC10332x8a1129f52 = com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10332x8a1129f5.this;
        if (activityC10332x8a1129f52.f145234s != null) {
            activityC10332x8a1129f52.f145226h = activityC10332x8a1129f52.m79336x8b97809d();
            com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10332x8a1129f5 activityC10332x8a1129f53 = com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10332x8a1129f5.this;
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) activityC10332x8a1129f53.f145226h).v(activityC10332x8a1129f53.f145234s);
            lz.f fVar = com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10332x8a1129f5.this.f145234s.M;
            if (fVar != null) {
                ((r35.u1) fVar).f450812k = true;
                java.util.Iterator it = ((r35.u1) fVar).f450805d.values().iterator();
                while (it.hasNext()) {
                    ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10332x8a1129f5.this.f145226h).v((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb) it.next());
                }
            }
        }
    }
}
