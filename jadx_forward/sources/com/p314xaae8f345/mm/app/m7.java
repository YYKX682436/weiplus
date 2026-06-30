package com.p314xaae8f345.mm.app;

/* loaded from: classes7.dex */
public abstract class m7 {

    /* renamed from: a, reason: collision with root package name */
    public static volatile boolean f135056a;

    public static void a(android.content.Context context) {
        com.p314xaae8f345.mm.app.i7 i7Var = new com.p314xaae8f345.mm.app.i7();
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
            r17 = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572300ap1);
        }
        i7Var.f274070a = r17;
        if (r18 == null) {
            r18 = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.aoy);
        }
        i7Var.f274071b = r18;
        i7Var.f274072c = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572299ap0);
        i7Var.f274074e = new com.p314xaae8f345.mm.app.k7(i7Var);
        i7Var.f274076g = new com.p314xaae8f345.mm.app.j7(i7Var);
        if (!android.text.TextUtils.isEmpty(str)) {
            i7Var.f274073d = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.aoz);
            i7Var.f274075f = new com.p314xaae8f345.mm.app.l7(str, context, i7Var);
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.g9.f274253c = i7Var;
    }
}
