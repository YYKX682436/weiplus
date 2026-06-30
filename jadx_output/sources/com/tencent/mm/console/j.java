package com.tencent.mm.console;

/* loaded from: classes12.dex */
public class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.console.k f64812d;

    public j(com.tencent.mm.console.k kVar) {
        this.f64812d = kVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.content.Context context = this.f64812d.f64817d.f64821f;
        db5.e1.U(context, context.getString(com.tencent.mm.R.string.blf), 1);
    }
}
