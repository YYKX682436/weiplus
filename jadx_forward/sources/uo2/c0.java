package uo2;

/* loaded from: classes2.dex */
public final class c0 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1571x636ee25.C14494xb6fdc062 f511138d;

    public c0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1571x636ee25.C14494xb6fdc062 c14494xb6fdc062) {
        this.f511138d = c14494xb6fdc062;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        android.content.Intent intent = new android.content.Intent();
        int itemId = menuItem.getItemId();
        if (itemId == 1001) {
            intent.putExtra("key_finder_post_router", 2);
        } else if (itemId == 1002) {
            intent.putExtra("key_finder_post_router", 3);
        }
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = this.f511138d.f202979h;
        if (c19792x256d2725 != null) {
            c19792x256d2725.m76824xa52af937();
        }
    }
}
