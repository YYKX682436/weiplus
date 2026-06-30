package ma5;

/* loaded from: classes15.dex */
public class a implements n.a {

    /* renamed from: a, reason: collision with root package name */
    public final n.a f406762a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ma5.b f406763b;

    public a(ma5.b bVar, n.a aVar) {
        this.f406763b = bVar;
        this.f406762a = aVar;
    }

    @Override // n.a
    public boolean a(n.b bVar, android.view.Menu menu) {
        return this.f406762a.a(bVar, menu);
    }

    @Override // n.a
    public boolean b(n.b bVar, android.view.MenuItem menuItem) {
        return this.f406762a.b(bVar, menuItem);
    }

    @Override // n.a
    public boolean c(n.b bVar, android.view.Menu menu) {
        return this.f406762a.c(bVar, menu);
    }

    @Override // n.a
    public void d(n.b bVar) {
        this.f406762a.d(bVar);
        this.f406763b.f406767g = null;
    }
}
