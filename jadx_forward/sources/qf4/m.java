package qf4;

/* loaded from: classes4.dex */
public final class m implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2239x5897e6f.C18469x2e558eae f444243d;

    public m(com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2239x5897e6f.C18469x2e558eae c18469x2e558eae) {
        this.f444243d = c18469x2e558eae;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f mo7430x19263085 = this.f444243d.mo7430x19263085();
        if (mo7430x19263085 == null) {
            return true;
        }
        mo7430x19263085.finish();
        return true;
    }
}
