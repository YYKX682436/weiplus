package n;

/* loaded from: classes15.dex */
public class f implements n.a {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.ActionMode.Callback f414906a;

    /* renamed from: b, reason: collision with root package name */
    public final android.content.Context f414907b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.ArrayList f414908c = new java.util.ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final x.n f414909d = new x.n();

    public f(android.content.Context context, android.view.ActionMode.Callback callback) {
        this.f414907b = context;
        this.f414906a = callback;
    }

    @Override // n.a
    public boolean a(n.b bVar, android.view.Menu menu) {
        android.view.ActionMode e17 = e(bVar);
        x.n nVar = this.f414909d;
        android.view.Menu menu2 = (android.view.Menu) nVar.m174751x4aabfc28(menu, null);
        if (menu2 == null) {
            o.j0 j0Var = new o.j0(this.f414907b, (g3.a) menu);
            nVar.put(menu, j0Var);
            menu2 = j0Var;
        }
        return this.f414906a.onCreateActionMode(e17, menu2);
    }

    @Override // n.a
    public boolean b(n.b bVar, android.view.MenuItem menuItem) {
        return this.f414906a.onActionItemClicked(e(bVar), new o.b0(this.f414907b, (g3.b) menuItem));
    }

    @Override // n.a
    public boolean c(n.b bVar, android.view.Menu menu) {
        android.view.ActionMode e17 = e(bVar);
        x.n nVar = this.f414909d;
        android.view.Menu menu2 = (android.view.Menu) nVar.m174751x4aabfc28(menu, null);
        if (menu2 == null) {
            o.j0 j0Var = new o.j0(this.f414907b, (g3.a) menu);
            nVar.put(menu, j0Var);
            menu2 = j0Var;
        }
        return this.f414906a.onPrepareActionMode(e17, menu2);
    }

    @Override // n.a
    public void d(n.b bVar) {
        this.f414906a.onDestroyActionMode(e(bVar));
    }

    public android.view.ActionMode e(n.b bVar) {
        java.util.ArrayList arrayList = this.f414908c;
        int size = arrayList.size();
        for (int i17 = 0; i17 < size; i17++) {
            n.g gVar = (n.g) arrayList.get(i17);
            if (gVar != null && gVar.f414911b == bVar) {
                return gVar;
            }
        }
        n.g gVar2 = new n.g(this.f414907b, bVar);
        arrayList.add(gVar2);
        return gVar2;
    }
}
