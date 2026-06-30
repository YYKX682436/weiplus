package kf3;

/* loaded from: classes12.dex */
public class v0 implements db5.o5 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1854x10e43c7c.ui.ActivityC16486x3260b8cc f388986d;

    public v0(com.p314xaae8f345.mm.p1006xc5476f33.p1854x10e43c7c.ui.ActivityC16486x3260b8cc activityC16486x3260b8cc) {
        this.f388986d = activityC16486x3260b8cc;
    }

    @Override // db5.o5
    public boolean a() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1854x10e43c7c.ui.ActivityC16486x3260b8cc activityC16486x3260b8cc = this.f388986d;
        kf3.k0 k0Var = activityC16486x3260b8cc.f230061f;
        int i17 = k0Var.f388912r;
        int i18 = k0Var.f388913s;
        int i19 = 0;
        if (i17 >= i18) {
            activityC16486x3260b8cc.f230059d.setSelectionFromTop(0, activityC16486x3260b8cc.f230062g.m79077xde699c26());
            return true;
        }
        if (i17 >= i18) {
            k0Var.f388912r = i18;
        } else {
            i19 = 10;
            int i27 = i17 + 10;
            k0Var.f388912r = i27;
            if (i27 > i18) {
                k0Var.f388912r = i18;
                i19 = i18 % 10;
            }
        }
        k0Var.f();
        activityC16486x3260b8cc.f230059d.setSelectionFromTop(i19, activityC16486x3260b8cc.f230062g.m79077xde699c26());
        return true;
    }
}
