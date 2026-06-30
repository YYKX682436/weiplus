package dg3;

/* loaded from: classes3.dex */
public final class e implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o25.y1 f313855d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ dg3.k f313856e;

    public e(o25.y1 y1Var, dg3.k kVar) {
        this.f313855d = y1Var;
        this.f313856e = kVar;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        db5.h4 h4Var = menuItem instanceof db5.h4 ? (db5.h4) menuItem : null;
        if (h4Var != null) {
            ((com.p314xaae8f345.mm.p2470x93e71c27.p2472xd7a392c5.m) this.f313855d).aj(h4Var, new dg3.d(this.f313856e));
        }
    }
}
