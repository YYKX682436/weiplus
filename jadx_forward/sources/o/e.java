package o;

/* loaded from: classes15.dex */
public abstract class e extends o.f {

    /* renamed from: e, reason: collision with root package name */
    public final android.content.Context f423233e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.Map f423234f;

    public e(android.content.Context context, java.lang.Object obj) {
        super(obj);
        this.f423233e = context;
    }

    public final android.view.MenuItem c(android.view.MenuItem menuItem) {
        if (!(menuItem instanceof g3.b)) {
            return menuItem;
        }
        g3.b bVar = (g3.b) menuItem;
        if (this.f423234f == null) {
            this.f423234f = new x.b();
        }
        android.view.MenuItem menuItem2 = (android.view.MenuItem) this.f423234f.get(menuItem);
        if (menuItem2 != null) {
            return menuItem2;
        }
        o.b0 b0Var = new o.b0(this.f423233e, bVar);
        this.f423234f.put(bVar, b0Var);
        return b0Var;
    }
}
