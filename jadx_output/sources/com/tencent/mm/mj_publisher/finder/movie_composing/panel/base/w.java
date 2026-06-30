package com.tencent.mm.mj_publisher.finder.movie_composing.panel.base;

/* loaded from: classes5.dex */
public final class w implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.a f69258d;

    public w(yz5.a aVar) {
        this.f69258d = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        yz5.a aVar = this.f69258d;
        if (aVar != null) {
            aVar.invoke();
        }
    }
}
