package com.tencent.mm.plugin.emoji.sync;

/* loaded from: classes12.dex */
public class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f97625d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.emoji.sync.k f97626e;

    public h(com.tencent.mm.plugin.emoji.sync.k kVar, int i17) {
        this.f97626e = kVar;
        this.f97625d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.emoji.sync.k kVar = this.f97626e;
        java.util.Set set = kVar.f97638i;
        if (set == null || set.size() <= 0) {
            return;
        }
        java.util.Iterator it = kVar.f97638i.iterator();
        while (it.hasNext()) {
            ((pr.a) it.next()).b(this.f97625d);
        }
    }
}
