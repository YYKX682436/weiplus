package nm;

/* loaded from: classes11.dex */
public class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p638x597af5c.C7182xc7dc863b f419983d;

    public k(com.p314xaae8f345.mm.p638x597af5c.C7182xc7dc863b c7182xc7dc863b) {
        this.f419983d = c7182xc7dc863b;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p638x597af5c.C7182xc7dc863b c7182xc7dc863b = this.f419983d;
        nm.l lVar = c7182xc7dc863b.f144765d;
        if (lVar != null) {
            lVar.a();
            c7182xc7dc863b.f144765d = null;
        }
    }
}
