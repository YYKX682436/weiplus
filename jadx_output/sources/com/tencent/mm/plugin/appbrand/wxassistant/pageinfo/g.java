package com.tencent.mm.plugin.appbrand.wxassistant.pageinfo;

/* loaded from: classes7.dex */
public class g extends android.content.ContextWrapper {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.wxassistant.pageinfo.l f92286a;

    /* renamed from: b, reason: collision with root package name */
    public android.view.WindowManager f92287b;

    /* renamed from: c, reason: collision with root package name */
    public final android.content.Context f92288c;

    public g(android.content.Context context, com.tencent.mm.plugin.appbrand.wxassistant.pageinfo.l lVar, android.content.Context context2) {
        super(context);
        this.f92286a = lVar;
        this.f92288c = context2;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public java.lang.Object getSystemService(java.lang.String str) {
        if (!"window".equals(str)) {
            return super.getSystemService(str);
        }
        java.lang.StackTraceElement[] stackTrace = java.lang.Thread.currentThread().getStackTrace();
        boolean z17 = false;
        int i17 = 0;
        while (true) {
            if (i17 >= stackTrace.length || i17 >= 11) {
                break;
            }
            if (stackTrace[i17].getClassName().equals(android.app.AlertDialog.class.getCanonicalName()) && stackTrace[i17].getMethodName().equals("<init>")) {
                z17 = true;
                break;
            }
            i17++;
        }
        if (z17) {
            return this.f92288c.getSystemService(str);
        }
        if (this.f92287b == null) {
            this.f92287b = this.f92286a;
        }
        return this.f92287b;
    }
}
