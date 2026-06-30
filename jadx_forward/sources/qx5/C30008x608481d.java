package qx5;

/* renamed from: qx5.l0$$a */
/* loaded from: classes13.dex */
public final /* synthetic */ class C30008x608481d implements android.webkit.ValueCallback {
    @Override // android.webkit.ValueCallback
    public final void onReceiveValue(java.lang.Object obj) {
        java.lang.String str = (java.lang.String) obj;
        if (android.text.TextUtils.isEmpty(str)) {
            yu5.c.b(new qx5.RunnableC30012x6084821("Trace 录制失败"));
        } else if (!com.p314xaae8f345.p3210x3857dc.t0.f302127a.a()) {
            by5.c4.c("XWebTraceFileListPreference", "[XWEB_RECORD_TRACE] Need local debug permission");
        } else {
            yu5.b.f547447a.a(new qx5.RunnableC30009x608481e(str));
        }
    }
}
