package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public final class tw implements com.tencent.mapsdk.internal.fm {

    /* renamed from: a, reason: collision with root package name */
    private final com.tencent.mapsdk.internal.tr f52257a;

    public tw(com.tencent.mapsdk.internal.tr trVar) {
        this.f52257a = trVar;
    }

    @Override // com.tencent.mapsdk.internal.fm
    public final void b(int i17) {
        com.tencent.mapsdk.internal.tr trVar = this.f52257a;
        if (trVar == null || i17 != com.tencent.mapsdk.internal.gf.f49577c) {
            return;
        }
        int s17 = ((com.tencent.mapsdk.vector.VectorMap) trVar.e_).s();
        trVar.X = true;
        trVar.Y = true;
        if (s17 <= trVar.W) {
            trVar.Y = false;
        } else if (s17 >= trVar.V) {
            trVar.X = false;
        }
        if (!trVar.f52201p.isEmpty()) {
            com.tencent.mapsdk.internal.ga gaVar = new com.tencent.mapsdk.internal.ga();
            gaVar.f49553f = 0;
            gaVar.f49554g = trVar.X;
            gaVar.f49555h = trVar.Y;
            java.util.Iterator<com.tencent.mapsdk.internal.fh> it = trVar.f52201p.iterator();
            while (it.hasNext()) {
                it.next().a(gaVar);
            }
        }
        com.tencent.mapsdk.internal.tr trVar2 = this.f52257a;
        if (trVar2.f52201p.isEmpty()) {
            return;
        }
        com.tencent.mapsdk.internal.ga gaVar2 = new com.tencent.mapsdk.internal.ga();
        gaVar2.f49553f = 0;
        gaVar2.f49554g = trVar2.X;
        gaVar2.f49555h = trVar2.Y;
        java.util.Iterator<com.tencent.mapsdk.internal.fh> it6 = trVar2.f52201p.iterator();
        while (it6.hasNext()) {
            it6.next().a(gaVar2);
        }
    }
}
