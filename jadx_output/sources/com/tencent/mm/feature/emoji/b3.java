package com.tencent.mm.feature.emoji;

/* loaded from: classes13.dex */
public final class b3 implements androidx.activity.result.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.emoji.c4 f66182a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f66183b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f66184c;

    public b3(com.tencent.mm.feature.emoji.c4 c4Var, java.lang.String str, java.lang.String str2) {
        this.f66182a = c4Var;
        this.f66183b = str;
        this.f66184c = str2;
    }

    @Override // androidx.activity.result.b
    public void a(java.lang.Object obj) {
        androidx.activity.result.ActivityResult activityResult = (androidx.activity.result.ActivityResult) obj;
        android.content.Intent intent = activityResult.f9043e;
        com.tencent.mm.feature.emoji.c4 c4Var = this.f66182a;
        java.lang.String str = c4Var.f66207d;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("downloadEmoticon: purchase ");
        int i17 = activityResult.f9042d;
        sb6.append(i17);
        sb6.append(", data:");
        sb6.append(activityResult.f9043e);
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
        if (i17 != -1 || intent == null) {
            return;
        }
        int intExtra = intent.getIntExtra("key_err_code", 0);
        com.tencent.mars.xlog.Log.i(c4Var.f66207d, "downloadEmoticon: purchase " + intExtra + "; " + intent.getStringExtra("key_err_msg"));
        java.util.ArrayList<java.lang.String> stringArrayListExtra = intent.getStringArrayListExtra("key_response_product_ids");
        intent.getStringArrayListExtra("key_response_series_ids");
        java.lang.String str2 = this.f66184c;
        java.lang.String str3 = this.f66183b;
        if (intExtra != 0) {
            if (intExtra != 100000002) {
                return;
            }
            gm0.j1.n().f273288b.g(new z12.l(str3, "", str2, null));
            return;
        }
        if (stringArrayListExtra == null || !stringArrayListExtra.contains(str3)) {
            return;
        }
        gm0.j1.n().f273288b.g(new z12.l(str3, "", str2, null));
    }
}
