package com.tencent.mm.console;

/* loaded from: classes7.dex */
public class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f64796d;

    public c(com.tencent.mm.console.d dVar, java.lang.String str) {
        this.f64796d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        db5.t7.makeText(com.tencent.mm.sdk.platformtools.x2.f193071a, this.f64796d, 1).show();
    }
}
