package com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui;

/* loaded from: classes11.dex */
public final class z1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean[] f256000d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.j2 f256001e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f256002f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.a f256003g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z1(boolean[] zArr, com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.j2 j2Var, java.lang.Runnable runnable, yz5.a aVar) {
        super(0);
        this.f256000d = zArr;
        this.f256001e = j2Var;
        this.f256002f = runnable;
        this.f256003g = aVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        boolean[] zArr = this.f256000d;
        if (!zArr[0]) {
            zArr[0] = true;
            com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.j2 j2Var = this.f256001e;
            j2Var.f255532i.removeCallbacks(this.f256002f);
            com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.j2.b(j2Var, this.f256003g);
        }
        return jz5.f0.f384359a;
    }
}
