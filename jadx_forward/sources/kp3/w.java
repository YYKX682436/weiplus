package kp3;

/* loaded from: classes14.dex */
public final class w implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kp3.x f392580d;

    public w(kp3.x xVar) {
        this.f392580d = xVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        kp3.f fVar;
        kp3.x xVar = this.f392580d;
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = xVar.m158354x19263085();
        com.p314xaae8f345.mm.p1006xc5476f33.p1942x346332.ui.ActivityC16781xd3c41868 activityC16781xd3c41868 = m158354x19263085 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1942x346332.ui.ActivityC16781xd3c41868 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1942x346332.ui.ActivityC16781xd3c41868) m158354x19263085 : null;
        if (activityC16781xd3c41868 != null && (fVar = activityC16781xd3c41868.f234414q) != null) {
            fVar.E("pageExit");
        }
        xVar.mo2281xb01dfb57();
    }
}
