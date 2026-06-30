package com.tencent.mm.matrix;

/* loaded from: classes12.dex */
public class t implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.matrix.o f68845d;

    public t(com.tencent.mm.matrix.o oVar) {
        this.f68845d = oVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.matrix.o oVar = this.f68845d;
        com.tencent.mm.matrix.o.i(oVar, "ENABLE_FPS", true);
        com.tencent.mm.matrix.o.i(oVar, "ENABLE_FPS_FLOAT", true);
    }
}
