package m51;

/* loaded from: classes12.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f405061a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f405062b;

    /* renamed from: c, reason: collision with root package name */
    public final long f405063c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f405064d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f405065e;

    /* renamed from: f, reason: collision with root package name */
    public final long f405066f;

    /* renamed from: g, reason: collision with root package name */
    public final long f405067g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.List f405068h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.List f405069i;

    public e(java.util.List list, java.util.List list2, long j17, java.util.List list3, java.lang.String str, long j18, long j19, long j27, java.util.List list4, java.util.List list5) {
        this.f405068h = new java.util.ArrayList();
        this.f405069i = new java.util.ArrayList();
        this.f405061a = list;
        this.f405063c = j17;
        this.f405062b = list2;
        this.f405064d = list3;
        this.f405065e = str;
        this.f405066f = j18;
        this.f405067g = j19;
        this.f405068h = list4;
        this.f405069i = list5;
    }

    public void a() {
        try {
            java.util.List list = this.f405061a;
            if (list != null) {
                list.clear();
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p2943x68b0d85.p2944xbe97f590.Log.i("PatchApplyPlan", "oldFileUncompressionPlan, e = " + e17);
        }
        try {
            java.util.List list2 = this.f405062b;
            if (list2 != null) {
                list2.clear();
            }
        } catch (java.lang.Exception e18) {
            com.p314xaae8f345.p2943x68b0d85.p2944xbe97f590.Log.i("PatchApplyPlan", "deltaFriendlyNewFileRecompressionPlan, e = " + e18);
        }
        try {
            java.util.List list3 = this.f405064d;
            if (list3 != null) {
                list3.clear();
            }
        } catch (java.lang.Exception e19) {
            com.p314xaae8f345.p2943x68b0d85.p2944xbe97f590.Log.i("PatchApplyPlan", "deltaDescriptors, e = " + e19);
        }
        try {
            java.util.List list4 = this.f405068h;
            if (list4 != null) {
                list4.clear();
            }
        } catch (java.lang.Exception e27) {
            com.p314xaae8f345.p2943x68b0d85.p2944xbe97f590.Log.i("PatchApplyPlan", "newSameToUnCompass, e = " + e27);
        }
    }
}
