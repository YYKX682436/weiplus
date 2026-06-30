package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.p1236x3343e7bd;

/* loaded from: classes7.dex */
public class g extends android.content.ContextWrapper {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.p1236x3343e7bd.l f173819a;

    /* renamed from: b, reason: collision with root package name */
    public android.view.WindowManager f173820b;

    /* renamed from: c, reason: collision with root package name */
    public final android.content.Context f173821c;

    public g(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.p1236x3343e7bd.l lVar, android.content.Context context2) {
        super(context);
        this.f173819a = lVar;
        this.f173821c = context2;
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
            return this.f173821c.getSystemService(str);
        }
        if (this.f173820b == null) {
            this.f173820b = this.f173819a;
        }
        return this.f173820b;
    }
}
