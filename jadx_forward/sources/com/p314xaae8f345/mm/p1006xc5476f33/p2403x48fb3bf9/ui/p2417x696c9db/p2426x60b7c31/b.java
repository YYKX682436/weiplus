package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31;

/* loaded from: classes.dex */
public final class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1 f266468d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f266469e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f266470f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f266471g;

    public b(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1 c1Var, int i17, boolean z17, java.util.ArrayList arrayList) {
        this.f266468d = c1Var;
        this.f266469e = i17;
        this.f266470f = z17;
        this.f266471g = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_pick_local_pic_source_type", com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37635xb5a3973f);
        boolean z17 = this.f266470f;
        java.util.ArrayList arrayList = this.f266471g;
        intent.putExtra("key_pick_local_media_local_ids", z17 ? com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.o5.g(arrayList) : com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.o5.h(arrayList));
        this.f266468d.mo9729x757c998b(this.f266469e, -1, intent);
    }
}
