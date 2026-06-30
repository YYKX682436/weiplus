package com.p314xaae8f345.mm.sdk.p2600x5c6729a.p2601xd7508997;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B-\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0012\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\t0\b¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/tencent/mm/sdk/event/pending/StoragePendingEventNotifier;", "Ll75/f0;", p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f2960xe17f46c3, "Landroidx/lifecycle/x;", "", "delay", "", "handleThreadTag", "La75/b;", "Lo75/c;", "handler", "<init>", "(JLjava/lang/String;La75/b;)V", "wechat-sdk_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.sdk.event.pending.StoragePendingEventNotifier */
/* loaded from: classes11.dex */
public final class C20986xc7dbdd04<T extends l75.f0> implements p012xc85e97e9.p093xedfae76a.x {

    /* renamed from: d, reason: collision with root package name */
    public final long f273923d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f273924e;

    /* renamed from: f, reason: collision with root package name */
    public final a75.b f273925f;

    /* renamed from: g, reason: collision with root package name */
    public final o75.c f273926g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f273927h;

    public C20986xc7dbdd04(long j17, java.lang.String handleThreadTag, a75.b handler) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(handleThreadTag, "handleThreadTag");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(handler, "handler");
        this.f273923d = j17;
        this.f273924e = handleThreadTag;
        this.f273925f = handler;
        if (j17 > 0) {
            o75.b bVar = o75.b.f425114b;
            o75.c cVar = new o75.c(o75.b.f425118f, "BATCH_PENDING_KEY", "MicroMsg.Mvvm.StoragePendingEventNotifier");
            cVar.f425124e = new java.util.HashMap();
            this.f273926g = cVar;
            this.f273927h = jz5.h.b(new a75.g(this));
            return;
        }
        throw new java.lang.IllegalArgumentException("not allow use zero or smaller delay");
    }

    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 a() {
        return (com.p314xaae8f345.mm.sdk.p2603x2137b148.n3) ((jz5.n) this.f273927h).mo141623x754a37bb();
    }

    public /* synthetic */ C20986xc7dbdd04(long j17, java.lang.String str, a75.b bVar, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(j17, (i17 & 2) != 0 ? "StoragePendingEventNotifierTag" : str, bVar);
    }
}
