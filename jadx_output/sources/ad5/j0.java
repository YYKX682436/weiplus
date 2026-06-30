package ad5;

/* loaded from: classes10.dex */
public final class j0 extends ad5.l0 {

    /* renamed from: a, reason: collision with root package name */
    public static final ad5.j0 f3273a = new ad5.j0();

    public j0() {
        super(null);
    }

    public static final void e(ad5.j0 j0Var, android.content.Context context, java.util.List msgInfoList, boolean z17, boolean z18) {
        j0Var.getClass();
        android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
        kotlin.jvm.internal.c0 c0Var = new kotlin.jvm.internal.c0();
        kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
        int i17 = z17 ? com.tencent.mm.R.string.pbp : com.tencent.mm.R.string.pbo;
        int i18 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
        com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(context);
        e4Var.f211776c = context.getString(i17);
        e4Var.f211782i = new ad5.z(c0Var, h0Var);
        e4Var.c();
        ad5.c0 c0Var2 = new ad5.c0(activity, c0Var, h0Var, z17, context);
        kotlin.jvm.internal.o.g(msgInfoList, "msgInfoList");
        com.tencent.mm.sdk.coroutines.LifecycleScope lifecycleScope = gm0.j1.b().f273245h.f273145e;
        if (lifecycleScope == null || v65.i.b(lifecycleScope, null, new zc5.l(msgInfoList, z18, z17, context, c0Var2, null), 1, null) == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MsgHistoryGalleryMediaHelper", "executeDownloadAndSave: accountScope is null, skip");
            c0Var2.invoke(java.lang.Boolean.FALSE);
        }
    }

    @Override // ad5.l0
    public int a() {
        return com.tencent.mm.R.string.pcj;
    }

    @Override // ad5.l0
    public int b() {
        return com.tencent.mm.R.raw.download_filled;
    }

    @Override // ad5.l0
    public int c() {
        return com.tencent.mm.R.raw.download_regular;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0127  */
    @Override // ad5.l0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void d(android.content.Context r23, ad5.t0 r24) {
        /*
            Method dump skipped, instructions count: 462
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ad5.j0.d(android.content.Context, ad5.t0):void");
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ad5.j0)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return -498024536;
    }

    public java.lang.String toString() {
        return "SaveMedia";
    }
}
