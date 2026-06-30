package jf;

/* loaded from: classes7.dex */
public final class i implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f380867d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f380868e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.b f380869f;

    public i(java.lang.String str, android.content.Context context, com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.b bVar) {
        this.f380867d = str;
        this.f380868e = context;
        this.f380869f = bVar;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        if (itemId == 0) {
            jf.q.f380875a.b(this.f380867d, 0);
            ((ku5.t0) ku5.t0.f394148d).B(new jf.g(this.f380868e, this.f380869f));
            return;
        }
        if (itemId == 1) {
            jf.q.f380875a.b(this.f380867d, 1);
            ((ku5.t0) ku5.t0.f394148d).B(new jf.e(this.f380868e, this.f380869f));
            return;
        }
        if (itemId != 2) {
            jf.q.f380875a.b(this.f380867d, 0);
            ((ku5.t0) ku5.t0.f394148d).B(new jf.h(this.f380868e, this.f380869f));
            return;
        }
        jf.q.f380875a.b(this.f380867d, 2);
        ((ku5.t0) ku5.t0.f394148d).B(new jf.f(this.f380868e, this.f380869f));
    }
}
