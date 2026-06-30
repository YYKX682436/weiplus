package com.tencent.mm.console;

/* loaded from: classes12.dex */
public class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.console.k f64809d;

    public i(com.tencent.mm.console.k kVar) {
        this.f64809d = kVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.content.Context context = this.f64809d.f64817d.f64821f;
        db5.e1.U(context, context.getString(com.tencent.mm.R.string.blg), 1);
    }
}
