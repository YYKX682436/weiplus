package com.p3263xee53b379;

/* loaded from: classes13.dex */
public final class z implements com.p3263xee53b379.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p3263xee53b379.ActivityC28074x3a8f05c8 f302267a;

    public z(com.p3263xee53b379.ActivityC28074x3a8f05c8 activityC28074x3a8f05c8) {
        this.f302267a = activityC28074x3a8f05c8;
    }

    @Override // com.p3263xee53b379.f
    public final void a(java.lang.String str, com.p3263xee53b379.g gVar) {
        com.p3263xee53b379.ActivityC28074x3a8f05c8 activityC28074x3a8f05c8 = this.f302267a;
        if (activityC28074x3a8f05c8 != null) {
            android.content.SharedPreferences.Editor edit = activityC28074x3a8f05c8.getSharedPreferences("UnionPayPluginEx.pref", 0).edit();
            edit.remove(str);
            edit.commit();
        }
        if (gVar != null) {
            ((com.p3263xee53b379.d) gVar).a(com.p3263xee53b379.ActivityC28074x3a8f05c8.L6("0", ya.b.f77504xbb80cbe3, null));
        }
    }
}
