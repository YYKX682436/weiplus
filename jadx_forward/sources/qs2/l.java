package qs2;

/* loaded from: classes4.dex */
public final class l implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f447840d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f447841e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f447842f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f447843g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f447844h;

    public l(android.content.Intent intent, int i17, java.lang.String str, java.lang.String str2, android.content.Context context) {
        this.f447840d = intent;
        this.f447841e = i17;
        this.f447842f = str;
        this.f447843g = str2;
        this.f447844h = context;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        android.content.Intent intent = this.f447840d;
        if (intent == null) {
            intent = new android.content.Intent();
        }
        int itemId = menuItem.getItemId();
        if (itemId == 1) {
            intent.putExtra("key_finder_post_router", 2);
        } else if (itemId == 2) {
            intent.putExtra("key_finder_post_router", 3);
        }
        intent.putExtra("key_finder_post_from", this.f447841e);
        intent.putExtra("key_finder_post_id", this.f447842f);
        intent.putExtra("KEY_FINDER_USERNAME_SELF", this.f447843g);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.class)).gk(this.f447844h, intent);
    }
}
