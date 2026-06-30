package com.tencent.mm.plugin.fav.ui;

/* loaded from: classes8.dex */
public final class ka implements com.tencent.mm.ui.widget.snackbar.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f101230a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f101231b;

    public ka(long j17, android.content.Context context) {
        this.f101230a = j17;
        this.f101231b = context;
    }

    @Override // com.tencent.mm.ui.widget.snackbar.g
    public final void a() {
        long j17 = this.f101230a;
        if (j17 != -1) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("key_fav_scene", 5);
            intent.putExtra("key_fav_item_id", j17);
            o72.x1.L0(this.f101231b, ".ui.FavTagEditUI", intent, null);
        }
    }
}
