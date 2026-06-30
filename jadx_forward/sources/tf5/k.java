package tf5;

/* loaded from: classes3.dex */
public final class k implements ly1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f500531a;

    public k(android.content.Context context) {
        this.f500531a = context;
    }

    @Override // ly1.a
    public final java.util.Map b(java.lang.String str) {
        tf5.m mVar;
        java.util.HashMap hashMap = new java.util.HashMap();
        android.content.Context context = this.f500531a;
        if (context == null) {
            mVar = null;
        } else {
            pf5.z zVar = pf5.z.f435481a;
            if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            mVar = (tf5.m) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).e(tf5.m.class);
        }
        if (mVar != null) {
            hashMap.put("page_sessionid", java.lang.Long.valueOf(mVar.f500536d));
        }
        return hashMap;
    }
}
