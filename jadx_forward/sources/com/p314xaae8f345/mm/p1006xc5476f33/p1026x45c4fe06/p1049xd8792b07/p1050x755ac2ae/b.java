package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1049xd8792b07.p1050x755ac2ae;

/* loaded from: classes7.dex */
public class b implements com.p314xaae8f345.mm.p794xb0fa9b5e.s0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f159405a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1049xd8792b07.p1050x755ac2ae.C11858x835ced59 f159406b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1049xd8792b07.p1050x755ac2ae.a f159407c;

    public b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1049xd8792b07.p1050x755ac2ae.a aVar, java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1049xd8792b07.p1050x755ac2ae.C11858x835ced59 c11858x835ced59) {
        this.f159407c = aVar;
        this.f159405a = str;
        this.f159406b = c11858x835ced59;
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.s0
    public void a() {
        boolean z17;
        com.p314xaae8f345.mm.p794xb0fa9b5e.d0.i(this.f159405a, this);
        synchronized (this.f159407c) {
            android.util.Pair pair = new android.util.Pair(this.f159406b, this.f159405a);
            if (((android.util.ArraySet) this.f159407c.f159397b).contains(pair)) {
                ((android.util.ArraySet) this.f159407c.f159397b).remove(pair);
                z17 = true;
            } else {
                z17 = false;
            }
            ((android.util.ArraySet) this.f159407c.f159398c).remove(this.f159406b);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrandBleKeepAlive", "onDied: " + this.f159406b + " processName: " + this.f159405a + " shouldStart: " + z17);
        if (z17 && this.f159407c.b()) {
            this.f159407c.f159396a.j(this.f159406b, true);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1049xd8792b07.p1050x755ac2ae.a aVar = this.f159407c;
            synchronized (aVar) {
                ((java.util.ArrayList) aVar.f159399d).add(java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime()));
            }
        }
    }
}
