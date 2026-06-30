package com.p314xaae8f345.mm.p849xbf8d97c1;

/* loaded from: classes12.dex */
public class w implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p849xbf8d97c1.o f150382d;

    public w(com.p314xaae8f345.mm.p849xbf8d97c1.o oVar) {
        this.f150382d = oVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        li.d dVar = this.f150382d.f150372n;
        if (dVar != null) {
            dVar.getClass();
            oi.h hVar = oi.h.f427100e;
            synchronized (hVar.f427102b) {
                ((java.util.LinkedList) hVar.f427102b).clear();
            }
        }
    }
}
