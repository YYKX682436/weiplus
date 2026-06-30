package hr3;

/* loaded from: classes11.dex */
public class i1 implements ly1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16840x4302a3e2 f365177a;

    public i1(com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16840x4302a3e2 activityC16840x4302a3e2) {
        this.f365177a = activityC16840x4302a3e2;
    }

    @Override // ly1.a
    public java.util.Map b(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16840x4302a3e2 activityC16840x4302a3e2 = this.f365177a;
        if (activityC16840x4302a3e2.f235194n == null) {
            return null;
        }
        android.util.ArrayMap arrayMap = new android.util.ArrayMap();
        arrayMap.put("page_type", java.lang.Integer.valueOf((activityC16840x4302a3e2.f235194n.k2() || activityC16840x4302a3e2.f235194n.l2()) ? 0 : !activityC16840x4302a3e2.f235194n.r2() ? com.p314xaae8f345.mm.p2621x8fb0427b.z3.m4(activityC16840x4302a3e2.f235194n.d1()) ? 1 : 2 : activityC16840x4302a3e2.f235194n.r2() ? com.p314xaae8f345.mm.p2621x8fb0427b.z3.m4(activityC16840x4302a3e2.f235194n.d1()) ? 3 : 4 : -1));
        return arrayMap;
    }
}
