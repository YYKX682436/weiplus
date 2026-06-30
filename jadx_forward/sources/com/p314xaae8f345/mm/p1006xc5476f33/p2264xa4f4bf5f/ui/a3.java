package com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui;

/* loaded from: classes11.dex */
public final class a3 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.C18619x86b32cd1 f255245d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f255246e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f255247f;

    public a3(com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.C18619x86b32cd1 c18619x86b32cd1, android.app.Activity activity, java.lang.String str) {
        this.f255245d = c18619x86b32cd1;
        this.f255246e = activity;
        this.f255247f = str;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        android.content.res.Resources resources;
        android.content.res.Resources resources2;
        if (menuItem.getItemId() == com.p314xaae8f345.mm.R.id.jgi) {
            android.app.Activity activity = this.f255246e;
            java.lang.String string = (activity == null || (resources2 = activity.getResources()) == null) ? null : resources2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574895jv5);
            android.app.Activity activity2 = this.f255246e;
            this.f255245d.f255002m = db5.e1.Q(activity, string, (activity2 == null || (resources = activity2.getResources()) == null) ? null : resources.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574895jv5), false, false, null);
            gm0.j1.d().g(new ej4.a(this.f255247f, 2));
            qj4.s.m(qj4.s.f445491a, this.f255246e, 43L, null, null, 0L, 0L, 0L, 0L, null, null, 0L, 2044, null);
        }
    }
}
