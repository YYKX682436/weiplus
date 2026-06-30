package com.p314xaae8f345.mm.p689xc5a27af6.p717xcbcc29c9;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B%\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/tencent/mm/feature/chatrecordstts/SupervisedLifecycleScope;", "Lkotlinx/coroutines/y0;", "Landroidx/lifecycle/v;", "Lv65/i;", "", com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d, "Landroidx/lifecycle/y;", "owner", "", "threadCount", "<init>", "(Ljava/lang/String;Landroidx/lifecycle/y;I)V", "feature-chatrecordstts_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.feature.chatrecordstts.SupervisedLifecycleScope */
/* loaded from: classes8.dex */
public final class C10511xc2ae2c6e implements p3325xe03a0797.p3326xc267989b.y0, p012xc85e97e9.p093xedfae76a.v, v65.i {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f146862d;

    /* renamed from: e, reason: collision with root package name */
    public final p012xc85e97e9.p093xedfae76a.y f146863e;

    /* renamed from: f, reason: collision with root package name */
    public final int f146864f;

    /* renamed from: g, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.c0 f146865g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f146866h;

    public C10511xc2ae2c6e(java.lang.String name, p012xc85e97e9.p093xedfae76a.y yVar, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        this.f146862d = name;
        this.f146863e = yVar;
        this.f146864f = i17;
        if (yVar != null) {
            d75.b.g(new com.p314xaae8f345.mm.p689xc5a27af6.p717xcbcc29c9.l2(this));
        }
        this.f146865g = p3325xe03a0797.p3326xc267989b.t3.a(null, 1, null);
        this.f146866h = jz5.h.b(new com.p314xaae8f345.mm.p689xc5a27af6.p717xcbcc29c9.m2(this));
    }

    @Override // v65.i
    public p3325xe03a0797.p3326xc267989b.r2 a(p3325xe03a0797.p3326xc267989b.a1 start, yz5.p block) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(start, "start");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(block, "block");
        p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
        return p3325xe03a0797.p3326xc267989b.l.c(this, ((t26.a) p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a).f496880h, start, block);
    }

    @Override // v65.i
    public p3325xe03a0797.p3326xc267989b.r2 d(p3325xe03a0797.p3326xc267989b.a1 start, yz5.p block) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(start, "start");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(block, "block");
        return p3325xe03a0797.p3326xc267989b.l.c(this, (p3325xe03a0797.p3326xc267989b.f2) ((jz5.n) this.f146866h).mo141623x754a37bb(), start, block);
    }

    @Override // p3325xe03a0797.p3326xc267989b.y0
    /* renamed from: getCoroutineContext */
    public oz5.l getF93115e() {
        return ((p3325xe03a0797.p3326xc267989b.f2) ((jz5.n) this.f146866h).mo141623x754a37bb()).mo7096x348d9a(this.f146865g);
    }

    @Override // p012xc85e97e9.p093xedfae76a.v
    /* renamed from: onStateChanged */
    public void mo2520xaba1ac62(p012xc85e97e9.p093xedfae76a.y source, p012xc85e97e9.p093xedfae76a.m event) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        if (event == p012xc85e97e9.p093xedfae76a.m.ON_DESTROY) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChatRecordsTts.LifecycleScope", "onDestroy");
            p3325xe03a0797.p3326xc267989b.p2.a(this.f146865g, null, 1, null);
            jz5.g gVar = this.f146866h;
            p3325xe03a0797.p3326xc267989b.v2.c((p3325xe03a0797.p3326xc267989b.f2) ((jz5.n) gVar).mo141623x754a37bb(), null, 1, null);
            ((p3325xe03a0797.p3326xc267989b.f2) ((jz5.n) gVar).mo141623x754a37bb()).close();
        }
    }

    public /* synthetic */ C10511xc2ae2c6e(java.lang.String str, p012xc85e97e9.p093xedfae76a.y yVar, int i17, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(str, (i18 & 2) != 0 ? null : yVar, (i18 & 4) != 0 ? 1 : i17);
    }
}
