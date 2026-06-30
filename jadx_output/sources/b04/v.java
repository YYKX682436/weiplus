package b04;

/* loaded from: classes3.dex */
public final class v implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.MMActivity f16937d;

    public v(com.tencent.mm.ui.MMActivity mMActivity) {
        this.f16937d = mMActivity;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        this.f16937d.onBackPressed();
        return false;
    }
}
