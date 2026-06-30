package com.tencent.mm.console;

/* loaded from: classes11.dex */
public class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.console.w f64793d;

    public a(com.tencent.mm.console.w wVar) {
        this.f64793d = wVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        dp.a.makeText(this.f64793d.f64849d, "clear xlog success", 0).show();
    }
}
