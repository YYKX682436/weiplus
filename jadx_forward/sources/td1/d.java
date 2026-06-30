package td1;

/* loaded from: classes4.dex */
public final class d implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.b1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.l f499130a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f499131b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p794xb0fa9b5e.r f499132c;

    public d(yz5.l lVar, long j17, com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar) {
        this.f499130a = lVar;
        this.f499131b = j17;
        this.f499132c = rVar;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.b1
    public final void a(boolean z17, java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiGetRecentUsageList", "fetchNextPageFromServer  success=" + z17 + " errorMsg=" + str);
        if (z17) {
            this.f499130a.mo146xb9724478(java.lang.Long.valueOf(this.f499131b));
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
            this.f499132c.a(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1107xfcb882be.C12223x7fb6c59a("", -1000, str));
        }
    }
}
