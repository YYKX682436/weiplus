package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44;

/* loaded from: classes8.dex */
public class q3 {

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.regex.Pattern f269043b = java.util.regex.Pattern.compile(".*#.*wechat_redirect");

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f269044a;

    public q3(java.lang.String str) {
        this.f269044a = null;
        this.f269044a = str;
    }

    public int a(java.lang.String str, boolean z17) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMWebViewClient", "getReason fail, url is null");
            return 0;
        }
        if (str.equals(this.f269044a) && z17) {
            return 0;
        }
        return f269043b.matcher(str).find() ? 2 : 1;
    }
}
