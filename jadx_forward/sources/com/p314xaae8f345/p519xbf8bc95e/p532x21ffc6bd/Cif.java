package com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd;

/* renamed from: com.tencent.mapsdk.internal.if, reason: invalid class name */
/* loaded from: classes16.dex */
public final class Cif extends com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.id {

    /* renamed from: g, reason: collision with root package name */
    private java.util.ArrayList<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.id> f131422g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private Cif(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.id... idVarArr) {
        super(0L);
        long j17 = 0;
        this.f131422g = new java.util.ArrayList<>();
        for (int i17 = 0; i17 < idVarArr.length; i17++) {
            this.f131422g.add(idVarArr[i17]);
            j17 = java.lang.Math.max(j17, idVarArr[i17].a());
        }
        this.f131415e = j17;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.id
    public final void a(javax.microedition.khronos.opengles.GL10 gl10, long j17) {
        java.util.ArrayList<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.id> arrayList = this.f131422g;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        java.util.Iterator<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.id> it = this.f131422g.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.id next = it.next();
            if (!next.c()) {
                next.a(gl10);
            }
        }
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.id
    public final void b() {
        super.b();
        java.util.Iterator<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.id> it = this.f131422g.iterator();
        while (it.hasNext()) {
            it.next().b();
        }
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.id
    public final void d() {
        super.d();
        java.util.Iterator<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.id> it = this.f131422g.iterator();
        while (it.hasNext()) {
            it.next().b();
        }
    }
}
