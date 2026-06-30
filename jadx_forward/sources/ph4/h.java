package ph4;

/* loaded from: classes8.dex */
public final class h implements p11.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f436013a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c f436014b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ph4.b f436015c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ph4.j f436016d;

    public h(int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c c16601x7ed0e40c, ph4.b bVar, ph4.j jVar) {
        this.f436013a = i17;
        this.f436014b = c16601x7ed0e40c;
        this.f436015c = bVar;
        this.f436016d = jVar;
    }

    @Override // p11.k
    public final void a(java.lang.String str, android.view.View view, android.graphics.Bitmap bitmap, java.lang.Object[] objArr) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("load snapshots done ");
        sb6.append(this.f436013a);
        sb6.append(' ');
        com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c c16601x7ed0e40c = this.f436014b;
        sb6.append(c16601x7ed0e40c.f66791xc8a07680);
        sb6.append(' ');
        sb6.append(bitmap);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TaskBarSectionOtherViewBaseHelper", sb6.toString());
        ph4.b bVar = this.f436015c;
        bVar.f435995e.post(new ph4.g(bitmap, bVar, c16601x7ed0e40c, this.f436016d));
    }
}
