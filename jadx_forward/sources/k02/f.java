package k02;

/* loaded from: classes8.dex */
public class f implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f384606d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ h02.a f384607e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ k02.k f384608f;

    public f(android.content.Context context, h02.a aVar, k02.k kVar) {
        this.f384606d = context;
        this.f384607e = aVar;
        this.f384608f = kVar;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        k02.k kVar = this.f384608f;
        h02.a aVar = this.f384607e;
        android.content.Context context = this.f384606d;
        if (itemId == 1) {
            k02.l.e(context, 5, aVar);
            k02.s.b(context, aVar.f68404x28d45f97, 0);
            if (kVar != null) {
                kVar.d();
                return;
            }
            return;
        }
        k02.l.e(context, 4, aVar);
        k02.s.b(context, aVar.f68404x28d45f97, 1);
        if (kVar != null) {
            kVar.c();
        }
    }
}
