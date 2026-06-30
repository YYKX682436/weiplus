package f93;

/* loaded from: classes11.dex */
public class y3 implements db5.t6 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.ActivityC16172xa598f868 f342055d;

    public y3(com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.ActivityC16172xa598f868 activityC16172xa598f868) {
        this.f342055d = activityC16172xa598f868;
    }

    @Override // db5.t6
    public void a(java.lang.String str) {
    }

    @Override // db5.t6
    public void c() {
    }

    @Override // db5.t6
    public void d(java.lang.String str) {
    }

    @Override // db5.t6
    public void f(java.lang.String str) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(str);
        sb6.append("");
        com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.ActivityC16172xa598f868 activityC16172xa598f868 = this.f342055d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.p1793xd1075a44.C16180x2cdd3130 c16180x2cdd3130 = activityC16172xa598f868.f224835m;
        if (c16180x2cdd3130 != null) {
            c16180x2cdd3130.p(str);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.ActivityC16172xa598f868.V6(activityC16172xa598f868, str);
        if (activityC16172xa598f868.Z6()) {
            activityC16172xa598f868.m78501x43e00957(true);
        }
        if (activityC16172xa598f868.H.contains(str)) {
            activityC16172xa598f868.H.remove(str);
        }
    }

    @Override // db5.t6
    public void g(java.lang.String str) {
    }

    @Override // db5.t6
    public void h(java.lang.String str) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(str);
        sb6.append("");
        com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.ActivityC16172xa598f868 activityC16172xa598f868 = this.f342055d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.p1793xd1075a44.C16180x2cdd3130 c16180x2cdd3130 = activityC16172xa598f868.f224835m;
        if (c16180x2cdd3130 != null) {
            c16180x2cdd3130.d(str, true);
        }
        activityC16172xa598f868.Y6(str, activityC16172xa598f868.E);
        if (activityC16172xa598f868.Z6()) {
            activityC16172xa598f868.m78501x43e00957(true);
        }
        if (activityC16172xa598f868.H.contains(str)) {
            return;
        }
        activityC16172xa598f868.H.add(str);
    }

    @Override // db5.t6
    public void j(boolean z17, int i17) {
    }
}
