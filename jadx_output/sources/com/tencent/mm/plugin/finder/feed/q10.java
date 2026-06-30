package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class q10 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.a f108790d;

    public q10(yz5.a aVar) {
        this.f108790d = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        yz5.a aVar = this.f108790d;
        if (aVar != null) {
            aVar.invoke();
        }
    }
}
