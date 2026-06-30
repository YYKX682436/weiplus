package com.tencent.mm.legacy.app;

/* loaded from: classes11.dex */
public class m0 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f68507d;

    public m0(com.tencent.mm.legacy.app.n0 n0Var, java.lang.Runnable runnable) {
        this.f68507d = runnable;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        this.f68507d.run();
    }
}
