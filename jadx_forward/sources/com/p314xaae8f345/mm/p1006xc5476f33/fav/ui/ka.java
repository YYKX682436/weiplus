package com.p314xaae8f345.mm.p1006xc5476f33.fav.ui;

/* loaded from: classes8.dex */
public final class ka implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2767x103fe905.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f182763a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f182764b;

    public ka(long j17, android.content.Context context) {
        this.f182763a = j17;
        this.f182764b = context;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2767x103fe905.g
    public final void a() {
        long j17 = this.f182763a;
        if (j17 != -1) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("key_fav_scene", 5);
            intent.putExtra("key_fav_item_id", j17);
            o72.x1.L0(this.f182764b, ".ui.FavTagEditUI", intent, null);
        }
    }
}
