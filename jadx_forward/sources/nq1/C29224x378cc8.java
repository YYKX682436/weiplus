package nq1;

/* renamed from: nq1.y$$a */
/* loaded from: classes13.dex */
public final /* synthetic */ class C29224x378cc8 implements b83.h {
    @Override // b83.h
    public final void a() {
        ak0.a aVar = ak0.o.f87075a;
        boolean z17 = ak0.x.f87081k;
        uv5.c b17 = uv5.c.b(ak0.o.a());
        android.content.Context context = b17.f513008c;
        boolean z18 = false;
        if (!tv5.b.b(context).f503908h) {
            com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.w("Tinker.UpgradePatchRetry", "onPatchRetryLoad retry is not main process, just return", new java.lang.Object[0]);
        } else if (b17.f513006a.exists()) {
            java.lang.String str = uv5.a.f513002a;
            if (com.p314xaae8f345.p3076xcbed6b1f.lib.p3079x7643c6b5.IntentServiceC26594x4aa6a22c.a(context)) {
                com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.w("Tinker.UpgradePatchRetry", "onPatchRetryLoad tinker service is running, just return", new java.lang.Object[0]);
            } else {
                java.lang.String absolutePath = b17.f513007b.getAbsolutePath();
                if (absolutePath == null || !new java.io.File(absolutePath).exists()) {
                    com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.w("Tinker.UpgradePatchRetry", "onPatchRetryLoad patch file: %s is not exist, just return", absolutePath);
                } else {
                    com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.w("Tinker.UpgradePatchRetry", "onPatchRetryLoad patch file: %s is exist, retry to patch", absolutePath);
                    tv5.b.b(context).f503903c.a(absolutePath);
                    z18 = true;
                }
            }
        } else {
            com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.w("Tinker.UpgradePatchRetry", "onPatchRetryLoad retry info not exist, just return", new java.lang.Object[0]);
        }
        if (z18) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(338L, 9L, 1L, false);
        }
    }
}
