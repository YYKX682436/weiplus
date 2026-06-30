package com.tencent.mm.console;

/* loaded from: classes12.dex */
public class m implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.console.o f64822d;

    public m(com.tencent.mm.console.o oVar) {
        this.f64822d = oVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.content.Context context = this.f64822d.f64825d.f64831g;
        db5.e1.U(context, context.getString(com.tencent.mm.R.string.blg), 1);
    }
}
