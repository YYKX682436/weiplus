package com.p314xaae8f345.mm.p2802xd031a825.ui;

/* loaded from: classes.dex */
public class e1 implements db5.d1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f295664a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f295665b;

    public e1(android.content.Context context, java.lang.String str) {
        this.f295664a = context;
        this.f295665b = str;
    }

    @Override // db5.d1
    public void a(int i17, int i18) {
        android.content.Intent intent = new android.content.Intent();
        android.content.Context context = this.f295664a;
        if (i17 != 0) {
            java.lang.String str = this.f295665b;
            if (i17 != 1) {
                if (i17 != 2) {
                    if (i17 == 3 && str != null) {
                        intent.putExtra("rawUrl", context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f575016ke4, com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.d(), str));
                    }
                } else if (str != null) {
                    intent.putExtra("rawUrl", context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f575015ke3, com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.d(), str));
                }
            } else if (str != null) {
                intent.putExtra("rawUrl", context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f575013ke1, com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.d(), str));
            }
        } else {
            intent.putExtra("rawUrl", context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f575014ke2, com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.d()));
        }
        intent.putExtra("showShare", false);
        intent.putExtra("allow_mix_content_mode", false);
        j45.l.j(context, "webview", ".ui.tools.WebViewUI", intent, null);
    }
}
