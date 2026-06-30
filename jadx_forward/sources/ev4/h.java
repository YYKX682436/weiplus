package ev4;

/* loaded from: classes8.dex */
public final class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ev4.j f338483d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f338484e;

    public h(ev4.j jVar, java.lang.String str) {
        this.f338483d = jVar;
        this.f338484e = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2 c28688xe8dbe4c2;
        ev4.d dVar = this.f338483d.f338486a.f348545f;
        if (dVar == null || (c28688xe8dbe4c2 = dVar.f338476a) == null) {
            return;
        }
        c28688xe8dbe4c2.m138438xd8c5c779("onMoreClick", this.f338484e);
    }
}
