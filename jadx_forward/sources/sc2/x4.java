package sc2;

/* loaded from: classes2.dex */
public final class x4 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sc2.b5 f487895d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 f487896e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f487897f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View f487898g;

    public x4(sc2.b5 b5Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5, java.lang.String str, android.view.View view) {
        this.f487895d = b5Var;
        this.f487896e = abstractC14490x69736cb5;
        this.f487897f = str;
        this.f487898g = view;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        if (menuItem.getItemId() == 1) {
            sc2.a5.a(this.f487895d, this.f487896e, this.f487897f, this.f487898g);
        }
    }
}
