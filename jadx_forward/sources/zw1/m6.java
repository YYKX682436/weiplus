package zw1;

/* loaded from: classes8.dex */
public final class m6 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.ui.ActivityC13149x63b02cb3 f558262d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ww1.a3 f558263e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f558264f;

    public m6(com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.ui.ActivityC13149x63b02cb3 activityC13149x63b02cb3, ww1.a3 a3Var, int i17) {
        this.f558262d = activityC13149x63b02cb3;
        this.f558263e = a3Var;
        this.f558264f = i17;
    }

    @Override // db5.o4
    /* renamed from: onCreateMMMenu */
    public final void mo887xc459429a(db5.g4 g4Var) {
        r45.hk5 hk5Var;
        java.util.LinkedList linkedList;
        int i17 = this.f558264f;
        ww1.a3 a3Var = this.f558263e;
        int i18 = 0;
        com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.ui.ActivityC13149x63b02cb3 activityC13149x63b02cb3 = this.f558262d;
        if (g4Var != null) {
            ((db5.h4) g4Var.f(0, activityC13149x63b02cb3.getString(com.p314xaae8f345.mm.R.C30867xcad56011.b_7))).f309915z = new zw1.k6(activityC13149x63b02cb3, a3Var, i17);
        }
        if (a3Var == null || (hk5Var = a3Var.f531626c0) == null || (linkedList = hk5Var.f457781e) == null) {
            return;
        }
        for (java.lang.Object obj : linkedList) {
            int i19 = i18 + 1;
            if (i18 < 0) {
                kz5.c0.p();
                throw null;
            }
            r45.vk4 vk4Var = (r45.vk4) obj;
            if (g4Var != null) {
                ((db5.h4) g4Var.f(i19, vk4Var != null ? vk4Var.f469851e : null)).f309915z = new zw1.l6(vk4Var, activityC13149x63b02cb3, i17);
            }
            i18 = i19;
        }
    }
}
