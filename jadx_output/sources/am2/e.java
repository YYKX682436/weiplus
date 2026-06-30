package am2;

/* loaded from: classes3.dex */
public final class e implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ am2.h f8655d;

    public e(am2.h hVar) {
        this.f8655d = hVar;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        am2.h hVar = this.f8655d;
        ((je2.t) hVar.f8677b.a(je2.t.class)).f299264g.postValue(am2.h.a(hVar));
        return true;
    }
}
