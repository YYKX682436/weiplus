package com.p314xaae8f345.mm.sdk.p2597xc267989b;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B%\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0005\u001a\u00020\u0004H\u0007¨\u0006\u000e"}, d2 = {"Lcom/tencent/mm/sdk/coroutines/LifecycleScope;", "Lkotlinx/coroutines/y0;", "Landroidx/lifecycle/x;", "Lv65/i;", "Ljz5/f0;", "onDestroy", "", com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d, "Landroidx/lifecycle/y;", "owner", "", "threadCount", "<init>", "(Ljava/lang/String;Landroidx/lifecycle/y;I)V", "wechat-sdk_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.sdk.coroutines.LifecycleScope */
/* loaded from: classes8.dex */
public final class C20976x6ba6452a implements p3325xe03a0797.p3326xc267989b.y0, p012xc85e97e9.p093xedfae76a.x, v65.i {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f273883d;

    /* renamed from: e, reason: collision with root package name */
    public final p012xc85e97e9.p093xedfae76a.y f273884e;

    /* renamed from: f, reason: collision with root package name */
    public final int f273885f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f273886g;

    public C20976x6ba6452a(java.lang.String name, p012xc85e97e9.p093xedfae76a.y yVar, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        this.f273883d = name;
        this.f273884e = yVar;
        this.f273885f = i17;
        if (yVar != null) {
            d75.b.g(new v65.j(this));
        }
        this.f273886g = jz5.h.b(new v65.k(this));
    }

    public static p3325xe03a0797.p3326xc267989b.f1 e(com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a c20976x6ba6452a, p3325xe03a0797.p3326xc267989b.a1 start, yz5.p block, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            start = p3325xe03a0797.p3326xc267989b.a1.DEFAULT;
        }
        c20976x6ba6452a.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(start, "start");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(block, "block");
        return p3325xe03a0797.p3326xc267989b.l.a(c20976x6ba6452a, c20976x6ba6452a.f(), start, block);
    }

    @Override // v65.i
    public p3325xe03a0797.p3326xc267989b.r2 a(p3325xe03a0797.p3326xc267989b.a1 start, yz5.p block) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(start, "start");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(block, "block");
        p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
        return p3325xe03a0797.p3326xc267989b.l.c(this, p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a, start, block);
    }

    @Override // v65.i
    public p3325xe03a0797.p3326xc267989b.r2 d(p3325xe03a0797.p3326xc267989b.a1 start, yz5.p block) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(start, "start");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(block, "block");
        return p3325xe03a0797.p3326xc267989b.l.c(this, f(), start, block);
    }

    public final p3325xe03a0797.p3326xc267989b.f2 f() {
        return (p3325xe03a0797.p3326xc267989b.f2) ((jz5.n) this.f273886g).mo141623x754a37bb();
    }

    @Override // p3325xe03a0797.p3326xc267989b.y0
    /* renamed from: getCoroutineContext */
    public oz5.l mo7786x54170f2d() {
        return f();
    }

    @p012xc85e97e9.p093xedfae76a.l0(m7813x6ac9171 = p012xc85e97e9.p093xedfae76a.m.ON_DESTROY)
    /* renamed from: onDestroy */
    public final void m77667xac79a11b() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mvvm.LifecycleScope", "onDestroy");
        p3325xe03a0797.p3326xc267989b.v2.c(f(), null, 1, null);
        f().close();
    }

    public /* synthetic */ C20976x6ba6452a(java.lang.String str, p012xc85e97e9.p093xedfae76a.y yVar, int i17, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(str, (i18 & 2) != 0 ? null : yVar, (i18 & 4) != 0 ? 1 : i17);
    }
}
