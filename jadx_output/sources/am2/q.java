package am2;

/* loaded from: classes3.dex */
public final class q implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ am2.v f8731d;

    public q(am2.v vVar) {
        this.f8731d = vVar;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        am2.v vVar = this.f8731d;
        new com.tencent.mm.plugin.finder.live.viewmodel.k4(vVar.f8758a, am2.v.b(vVar), null, 4, null).w();
        return true;
    }
}
