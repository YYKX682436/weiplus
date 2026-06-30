package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db;

/* loaded from: classes8.dex */
public class y8 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f273546d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.z8 f273547e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f273548f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f273549g;

    public y8(boolean z17, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.z8 z8Var, java.lang.String str, java.lang.String str2) {
        this.f273546d = z17;
        this.f273547e = z8Var;
        this.f273548f = str;
        this.f273549g = str2;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z17 = this.f273546d;
        java.lang.String str = this.f273549g;
        java.lang.String str2 = this.f273548f;
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.z8 z8Var = this.f273547e;
        if (z17) {
            z8Var.mo75910x738236e6("javascript:document.getElementById('_edw_iframe_').src = '" + str2 + "' + " + str, null);
            return;
        }
        z8Var.mo75910x738236e6("javascript:console.log('" + str2 + "' + " + str + ")", null);
    }
}
