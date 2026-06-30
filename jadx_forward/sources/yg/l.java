package yg;

/* loaded from: classes7.dex */
public class l implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ch.b f543632d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f543633e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f543634f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f543635g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p485x5dc4f1ad.AbstractC4208x204d5c83 f543636h;

    public l(com.p314xaae8f345.p485x5dc4f1ad.AbstractC4208x204d5c83 abstractC4208x204d5c83, ch.b bVar, long j17, int i17, int i18) {
        this.f543636h = abstractC4208x204d5c83;
        this.f543632d = bVar;
        this.f543633e = j17;
        this.f543634f = i17;
        this.f543635g = i18;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f543636h.f130110a != 0) {
            com.p314xaae8f345.p485x5dc4f1ad.AbstractC4208x204d5c83 abstractC4208x204d5c83 = this.f543636h;
            abstractC4208x204d5c83.m34778xb5ca84fb(abstractC4208x204d5c83.f130110a, this.f543634f, this.f543635g, this.f543633e);
            return;
        }
        ch.b bVar = this.f543632d;
        long j17 = this.f543633e;
        com.p314xaae8f345.p485x5dc4f1ad.p487x294b574a.C4212xbf459dc6 c4212xbf459dc6 = (com.p314xaae8f345.p485x5dc4f1ad.p487x294b574a.C4212xbf459dc6) ((ch.d) bVar).f122712a.get();
        if (c4212xbf459dc6 != null) {
            c4212xbf459dc6.m34825xe02ed61e(j17);
        }
    }
}
