package com.tencent.mapsdk.internal;

/* loaded from: classes16.dex */
public final class ii extends com.tencent.mapsdk.internal.id {

    /* renamed from: g, reason: collision with root package name */
    private java.util.ArrayList<com.tencent.mapsdk.internal.id> f49896g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private ii(com.tencent.mapsdk.internal.id... idVarArr) {
        super(0L);
        long j17 = 0;
        this.f49896g = new java.util.ArrayList<>();
        for (int i17 = 0; i17 < idVarArr.length; i17++) {
            this.f49896g.add(idVarArr[i17]);
            j17 += idVarArr[i17].a();
        }
        this.f49882e = j17;
    }

    @Override // com.tencent.mapsdk.internal.id
    public final void a(javax.microedition.khronos.opengles.GL10 gl10) {
        a(gl10, 0L);
    }

    @Override // com.tencent.mapsdk.internal.id
    public final void b() {
        super.b();
        java.util.Iterator<com.tencent.mapsdk.internal.id> it = this.f49896g.iterator();
        while (it.hasNext()) {
            it.next().b();
        }
    }

    @Override // com.tencent.mapsdk.internal.id
    public final boolean c() {
        java.util.Iterator<com.tencent.mapsdk.internal.id> it = this.f49896g.iterator();
        while (it.hasNext()) {
            if (!it.next().c()) {
                return false;
            }
        }
        return true;
    }

    @Override // com.tencent.mapsdk.internal.id
    public final void d() {
        super.d();
        java.util.Iterator<com.tencent.mapsdk.internal.id> it = this.f49896g.iterator();
        while (it.hasNext()) {
            it.next().b();
        }
    }

    @Override // com.tencent.mapsdk.internal.id
    public final void a(javax.microedition.khronos.opengles.GL10 gl10, long j17) {
        java.util.ArrayList<com.tencent.mapsdk.internal.id> arrayList = this.f49896g;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        java.util.Iterator<com.tencent.mapsdk.internal.id> it = this.f49896g.iterator();
        while (it.hasNext()) {
            com.tencent.mapsdk.internal.id next = it.next();
            if (!next.c()) {
                next.a(gl10);
                return;
            }
        }
    }
}
