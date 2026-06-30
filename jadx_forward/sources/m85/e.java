package m85;

/* loaded from: classes10.dex */
public final class e implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2615x3a3fddcb.ActivityC21040xa43a551f f406364d;

    public e(com.p314xaae8f345.mm.p2615x3a3fddcb.ActivityC21040xa43a551f activityC21040xa43a551f) {
        this.f406364d = activityC21040xa43a551f;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        this.f406364d.onBackPressed();
        return true;
    }
}
