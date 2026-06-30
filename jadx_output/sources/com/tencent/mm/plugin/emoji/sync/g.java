package com.tencent.mm.plugin.emoji.sync;

/* loaded from: classes12.dex */
public class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.emoji.sync.k f97624d;

    public g(com.tencent.mm.plugin.emoji.sync.k kVar) {
        this.f97624d = kVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.emoji.sync.k kVar = this.f97624d;
        java.util.Set set = kVar.f97638i;
        if (set == null || ((java.util.HashSet) set).size() <= 0) {
            return;
        }
        java.util.Iterator it = ((java.util.HashSet) kVar.f97638i).iterator();
        while (it.hasNext()) {
            ((pr.a) it.next()).a();
        }
    }
}
