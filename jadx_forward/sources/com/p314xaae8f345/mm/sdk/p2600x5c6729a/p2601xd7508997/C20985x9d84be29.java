package com.p314xaae8f345.mm.sdk.p2600x5c6729a.p2601xd7508997;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B/\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0005\u001a\u00020\u0004H\u0007¨\u0006\u0010"}, d2 = {"Lcom/tencent/mm/sdk/event/pending/PendingEventNotifier;", "La75/a;", p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f2960xe17f46c3, "Landroidx/lifecycle/x;", "Ljz5/f0;", "onDestroy", "", "delay", "", "handleThreadTag", "La75/b;", "handler", "Landroidx/lifecycle/y;", "lifecycleOwner", "<init>", "(JLjava/lang/String;La75/b;Landroidx/lifecycle/y;)V", "wechat-sdk_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.sdk.event.pending.PendingEventNotifier */
/* loaded from: classes11.dex */
public class C20985x9d84be29<T extends a75.a> implements p012xc85e97e9.p093xedfae76a.x {

    /* renamed from: d, reason: collision with root package name */
    public final long f273916d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f273917e;

    /* renamed from: f, reason: collision with root package name */
    public final a75.b f273918f;

    /* renamed from: g, reason: collision with root package name */
    public final p012xc85e97e9.p093xedfae76a.y f273919g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.HashMap f273920h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f273921i;

    /* renamed from: m, reason: collision with root package name */
    public volatile boolean f273922m;

    public C20985x9d84be29(long j17, java.lang.String handleThreadTag, a75.b handler, p012xc85e97e9.p093xedfae76a.y lifecycleOwner) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(handleThreadTag, "handleThreadTag");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(handler, "handler");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(lifecycleOwner, "lifecycleOwner");
        this.f273916d = j17;
        this.f273917e = handleThreadTag;
        this.f273918f = handler;
        this.f273919g = lifecycleOwner;
        if (j17 > 0) {
            d75.b.g(new a75.c(this));
            this.f273920h = new java.util.HashMap();
            this.f273921i = jz5.h.b(new a75.e(this));
            this.f273922m = true;
            return;
        }
        throw new java.lang.IllegalArgumentException("not allow use zero or smaller delay");
    }

    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 a() {
        return (com.p314xaae8f345.mm.sdk.p2603x2137b148.n3) ((jz5.n) this.f273921i).mo141623x754a37bb();
    }

    @p012xc85e97e9.p093xedfae76a.l0(m7813x6ac9171 = p012xc85e97e9.p093xedfae76a.m.ON_DESTROY)
    /* renamed from: onDestroy */
    public final void m77677xac79a11b() {
        a().mo50302x6b17ad39(null);
        a().mo50305x3d8a09a2(2);
    }

    public /* synthetic */ C20985x9d84be29(long j17, java.lang.String str, a75.b bVar, p012xc85e97e9.p093xedfae76a.y yVar, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(j17, (i17 & 2) != 0 ? "PendingEventNotifierTag" : str, bVar, yVar);
    }
}
