package com.tencent.mm.modelbase;

/* loaded from: classes.dex */
public class d3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f70608d;

    public d3(java.lang.Runnable runnable) {
        this.f70608d = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f70608d.run();
    }

    public java.lang.String toString() {
        return super.toString() + "|tryCallback";
    }
}
