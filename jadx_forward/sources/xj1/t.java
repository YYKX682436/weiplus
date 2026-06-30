package xj1;

/* loaded from: classes7.dex */
public final class t implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1202x9835ae9e.C12711x1197fa56 f536349d;

    public t(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1202x9835ae9e.C12711x1197fa56 c12711x1197fa56) {
        this.f536349d = c12711x1197fa56;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f mo7430x19263085 = this.f536349d.mo7430x19263085();
        if (mo7430x19263085 == null) {
            return true;
        }
        mo7430x19263085.finish();
        return true;
    }
}
