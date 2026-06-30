package a45;

/* loaded from: classes3.dex */
public final class h implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a45.i f1351d;

    public h(a45.i iVar) {
        this.f1351d = iVar;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        this.f1351d.getActivity().finish();
        return true;
    }
}
