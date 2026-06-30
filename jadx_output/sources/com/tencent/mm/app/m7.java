package com.tencent.mm.app;

/* loaded from: classes7.dex */
public abstract class m7 {

    /* renamed from: a, reason: collision with root package name */
    public static volatile boolean f53523a;

    public static void a(android.content.Context context) {
        com.tencent.mm.app.i7 i7Var = new com.tencent.mm.app.i7();
        java.lang.String r17 = c01.je.r("funcs_title");
        if (r17.equals("funcs_title")) {
            r17 = null;
        }
        java.lang.String r18 = c01.je.r("funcs_content");
        if (r18.equals("funcs_content")) {
            r18 = null;
        }
        java.lang.String r19 = c01.je.r("funcs_url");
        java.lang.String str = r19.equals("funcs_url") ? null : r19;
        if (r17 == null) {
            r17 = context.getString(com.tencent.mm.R.string.f490767ap1);
        }
        i7Var.f192537a = r17;
        if (r18 == null) {
            r18 = context.getString(com.tencent.mm.R.string.aoy);
        }
        i7Var.f192538b = r18;
        i7Var.f192539c = context.getString(com.tencent.mm.R.string.f490766ap0);
        i7Var.f192541e = new com.tencent.mm.app.k7(i7Var);
        i7Var.f192543g = new com.tencent.mm.app.j7(i7Var);
        if (!android.text.TextUtils.isEmpty(str)) {
            i7Var.f192540d = context.getString(com.tencent.mm.R.string.aoz);
            i7Var.f192542f = new com.tencent.mm.app.l7(str, context, i7Var);
        }
        com.tencent.mm.sdk.platformtools.g9.f192720c = i7Var;
    }
}
