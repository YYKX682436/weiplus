package o;

/* loaded from: classes15.dex */
public class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o.k f423250d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.MenuItem f423251e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ o.r f423252f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ o.j f423253g;

    public i(o.j jVar, o.k kVar, android.view.MenuItem menuItem, o.r rVar) {
        this.f423253g = jVar;
        this.f423250d = kVar;
        this.f423251e = menuItem;
        this.f423252f = rVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        o.k kVar = this.f423250d;
        if (kVar != null) {
            o.j jVar = this.f423253g;
            jVar.f423254d.G = true;
            kVar.f423256b.c(false);
            jVar.f423254d.G = false;
        }
        android.view.MenuItem menuItem = this.f423251e;
        if (menuItem.isEnabled() && menuItem.hasSubMenu()) {
            this.f423252f.q(menuItem, null, 4);
        }
    }
}
