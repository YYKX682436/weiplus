package f93;

/* loaded from: classes11.dex */
public class m4 implements db5.t6 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.ActivityC16172xa598f868 f341923d;

    public m4(com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.ActivityC16172xa598f868 activityC16172xa598f868) {
        this.f341923d = activityC16172xa598f868;
    }

    @Override // db5.t6
    public void a(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.ActivityC16172xa598f868 activityC16172xa598f868 = this.f341923d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.p1793xd1075a44.C16180x2cdd3130 c16180x2cdd3130 = activityC16172xa598f868.f224840r;
        if (c16180x2cdd3130 != null) {
            c16180x2cdd3130.s(str, false);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.ActivityC16172xa598f868.V6(activityC16172xa598f868, str);
    }

    @Override // db5.t6
    public void c() {
    }

    @Override // db5.t6
    public void d(java.lang.String str) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(str);
        sb6.append("");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.ActivityC16172xa598f868 activityC16172xa598f868 = this.f341923d;
        activityC16172xa598f868.f224835m.d(str, true);
        com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.p1793xd1075a44.C16180x2cdd3130 c16180x2cdd3130 = activityC16172xa598f868.f224840r;
        if (c16180x2cdd3130 != null) {
            c16180x2cdd3130.s(str, true);
        }
        activityC16172xa598f868.Y6(str, activityC16172xa598f868.E);
    }

    @Override // db5.t6
    public void f(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.ActivityC16172xa598f868 activityC16172xa598f868 = this.f341923d;
        activityC16172xa598f868.f224835m.p(str);
        com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.p1793xd1075a44.C16180x2cdd3130 c16180x2cdd3130 = activityC16172xa598f868.f224840r;
        if (c16180x2cdd3130 != null) {
            c16180x2cdd3130.s(str, false);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.ActivityC16172xa598f868.V6(activityC16172xa598f868, str);
        if (activityC16172xa598f868.F.contains(str)) {
            activityC16172xa598f868.F.remove(str);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00e0, code lost:
    
        if (r10 == null) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ee  */
    @Override // db5.t6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void g(java.lang.String r10) {
        /*
            Method dump skipped, instructions count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f93.m4.g(java.lang.String):void");
    }

    @Override // db5.t6
    public void h(java.lang.String str) {
    }

    @Override // db5.t6
    public void j(boolean z17, int i17) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(z17);
        sb6.append("");
        com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.ActivityC16172xa598f868 activityC16172xa598f868 = this.f341923d;
        if (z17) {
            activityC16172xa598f868.m78501x43e00957(false);
            activityC16172xa598f868.f224836n.setVisibility(8);
        } else {
            activityC16172xa598f868.m78501x43e00957(true);
            activityC16172xa598f868.f224836n.setVisibility(8);
        }
    }
}
