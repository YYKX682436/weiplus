package v92;

/* loaded from: classes15.dex */
public final class b implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ v92.g f515686d;

    public b(v92.g gVar) {
        this.f515686d = gVar;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        v92.g gVar = this.f515686d;
        if (itemId == 20002) {
            if (gVar.p()) {
                db5.t7.m123882x26a183b(gVar.f515691a, com.p314xaae8f345.mm.R.C30867xcad56011.f3u, 0).show();
                return;
            } else {
                gVar.r();
                return;
            }
        }
        if (itemId == 20003) {
            if (gVar.p()) {
                db5.t7.m123882x26a183b(gVar.f515691a, com.p314xaae8f345.mm.R.C30867xcad56011.f3v, 0).show();
                return;
            } else {
                gVar.t();
                return;
            }
        }
        if (itemId != 20010) {
            return;
        }
        if (gVar.p()) {
            db5.t7.m123882x26a183b(gVar.f515691a, com.p314xaae8f345.mm.R.C30867xcad56011.o1g, 0).show();
        } else {
            gVar.s();
        }
    }
}
