package com.p314xaae8f345.mm.ui.p2695x2c1ddc83;

/* loaded from: classes4.dex */
public class c1 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f289131d;

    public c1(java.lang.Runnable runnable) {
        this.f289131d = runnable;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        java.lang.Runnable runnable = this.f289131d;
        if (runnable != null) {
            runnable.run();
        }
    }
}
