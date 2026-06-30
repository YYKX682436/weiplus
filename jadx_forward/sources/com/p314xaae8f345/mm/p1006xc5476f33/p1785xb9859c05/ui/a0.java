package com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui;

/* loaded from: classes12.dex */
public class a0 implements com.p314xaae8f345.mm.sdk.p2603x2137b148.g6 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f224278d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f224279e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f224280f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.c0 f224281g;

    public a0(com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.c0 c0Var, java.lang.String str, android.widget.ImageView imageView, java.lang.String str2) {
        this.f224281g = c0Var;
        this.f224278d = str;
        this.f224279e = imageView;
        this.f224280f = str2;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.g6
    public boolean a() {
        ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.c0) i95.n0.c(kv.c0.class))).getClass();
        java.lang.String str = this.f224278d;
        android.graphics.Bitmap a17 = com.p314xaae8f345.mm.p943x351df9c2.g.a(str);
        if (a17 == null) {
            ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
            a17 = com.p314xaae8f345.mm.p943x351df9c2.z.h(com.p314xaae8f345.mm.p943x351df9c2.d1.Ai().j(str, false), str, false);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.c0.a(this.f224281g, this.f224279e, this.f224280f, a17);
        return true;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.g6
    public boolean b() {
        return false;
    }
}
