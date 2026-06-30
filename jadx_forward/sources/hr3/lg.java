package hr3;

/* loaded from: classes11.dex */
public class lg implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f365313d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16871x34c232c9 f365314e;

    public lg(com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16871x34c232c9 activityC16871x34c232c9, int i17) {
        this.f365314e = activityC16871x34c232c9;
        this.f365313d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16871x34c232c9 activityC16871x34c232c9 = this.f365314e;
        java.util.ArrayList arrayList = activityC16871x34c232c9.K;
        int size = arrayList.size();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        int size2 = activityC16871x34c232c9.N.size();
        if (size2 > 0) {
            for (int i17 = 0; i17 < size2; i17++) {
                sb6.append((java.lang.String) activityC16871x34c232c9.N.get(i17));
                if (i17 < size2 - 1) {
                    sb6.append("#");
                }
            }
        }
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
        int size3 = arrayList.size();
        if (size3 > 0) {
            for (int i18 = 0; i18 < size3; i18++) {
                sb7.append((java.lang.String) arrayList.get(i18));
                if (i18 < size3 - 1) {
                    sb7.append("#");
                }
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(18713, activityC16871x34c232c9.f235359q, java.lang.Integer.valueOf(this.f365313d), java.lang.Integer.valueOf(activityC16871x34c232c9.F1), java.lang.Integer.valueOf(activityC16871x34c232c9.G1), java.lang.Integer.valueOf(activityC16871x34c232c9.H1), 2, java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - activityC16871x34c232c9.D1), java.lang.Integer.valueOf(((com.p314xaae8f345.mm.p2621x8fb0427b.k4) c01.d9.b().q()).O(false, c01.e2.f118665p, c01.z1.r(), "weixin", "helper_entry", "filehelper")), "", sb7.toString(), sb6, java.lang.Integer.valueOf(size), java.lang.Integer.valueOf(activityC16871x34c232c9.I1), 0, java.lang.Integer.valueOf(activityC16871x34c232c9.f235372z[0]), java.lang.Integer.valueOf(activityC16871x34c232c9.f235372z[1]), java.lang.Integer.valueOf(activityC16871x34c232c9.f235372z[2]), java.lang.Integer.valueOf(activityC16871x34c232c9.f235372z[3]), java.lang.Integer.valueOf(activityC16871x34c232c9.f235372z[4]), java.lang.Integer.valueOf(activityC16871x34c232c9.f235372z[5]), java.lang.Integer.valueOf(activityC16871x34c232c9.A[0]), java.lang.Integer.valueOf(activityC16871x34c232c9.A[1]), java.lang.Integer.valueOf(activityC16871x34c232c9.A[2]));
    }
}
