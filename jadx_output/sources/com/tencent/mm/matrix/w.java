package com.tencent.mm.matrix;

/* loaded from: classes12.dex */
public class w implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.matrix.o f68849d;

    public w(com.tencent.mm.matrix.o oVar) {
        this.f68849d = oVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        li.d dVar = this.f68849d.f68839n;
        if (dVar != null) {
            dVar.getClass();
            oi.h hVar = oi.h.f345567e;
            synchronized (hVar.f345569b) {
                ((java.util.LinkedList) hVar.f345569b).clear();
            }
        }
    }
}
