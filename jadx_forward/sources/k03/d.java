package k03;

/* loaded from: classes10.dex */
public final class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k03.e f384647d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2 f384648e;

    public d(k03.e eVar, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2 c28688xe8dbe4c2) {
        this.f384647d = eVar;
        this.f384648e = c28688xe8dbe4c2;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b = this.f384647d.f384650d;
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2 c28688xe8dbe4c2 = this.f384648e;
        if (c22789xd23e9a9b != null) {
            if (c28688xe8dbe4c2 != null) {
                c28688xe8dbe4c2.m138438xd8c5c779("platformViewEvent", kz5.b1.e(new jz5.l("event", "pagResourceLoadSuccess")));
            }
        } else if (c28688xe8dbe4c2 != null) {
            c28688xe8dbe4c2.m138438xd8c5c779("platformViewEvent", kz5.b1.e(new jz5.l("event", "pagResourceLoadFail")));
        }
    }
}
