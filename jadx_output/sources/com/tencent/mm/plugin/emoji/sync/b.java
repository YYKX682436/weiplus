package com.tencent.mm.plugin.emoji.sync;

/* loaded from: classes12.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.mm.plugin.emoji.sync.k f97616a;

    public b() {
        com.tencent.mm.plugin.emoji.sync.c cVar = new com.tencent.mm.plugin.emoji.sync.c();
        cVar.f97617a = 1;
        r11.a aVar = new r11.a();
        int i17 = cVar.f97617a;
        cVar.f97618b = new com.tencent.mm.plugin.emoji.sync.d(i17, i17, aVar);
        com.tencent.mm.plugin.emoji.sync.e eVar = new com.tencent.mm.plugin.emoji.sync.e(cVar);
        synchronized (this) {
            if (this.f97616a == null) {
                this.f97616a = new com.tencent.mm.plugin.emoji.sync.k(eVar);
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.BKGLoader.BKGLoader", "[cpan] BKGLoader had init.");
            }
        }
    }

    public void a(pr.a aVar) {
        com.tencent.mm.plugin.emoji.sync.k kVar = this.f97616a;
        if (kVar.f97638i == null) {
            kVar.f97638i = new java.util.HashSet();
        }
        if (((java.util.HashSet) kVar.f97638i).contains(aVar)) {
            return;
        }
        ((java.util.HashSet) kVar.f97638i).add(aVar);
    }

    public void b() {
        ((ku5.t0) ku5.t0.f312615d).g(new com.tencent.mm.plugin.emoji.sync.a(this));
    }

    public void c(pr.a aVar) {
        com.tencent.mm.plugin.emoji.sync.k kVar = this.f97616a;
        if (kVar.f97638i == null) {
            kVar.f97638i = new java.util.HashSet();
        }
        if (((java.util.HashSet) kVar.f97638i).contains(aVar)) {
            ((java.util.HashSet) kVar.f97638i).remove(aVar);
        }
    }
}
