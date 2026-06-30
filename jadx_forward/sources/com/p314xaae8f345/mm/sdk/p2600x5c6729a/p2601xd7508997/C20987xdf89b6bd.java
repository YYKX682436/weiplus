package com.p314xaae8f345.mm.sdk.p2600x5c6729a.p2601xd7508997;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B%\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0005\u001a\u00020\u0004H\u0007¨\u0006\u000e"}, d2 = {"Lcom/tencent/mm/sdk/event/pending/UIPendingEventNotifier;", "La75/a;", p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f2960xe17f46c3, "Landroidx/lifecycle/x;", "Ljz5/f0;", "onDestroy", "", "delay", "La75/b;", "handler", "Landroidx/lifecycle/y;", "lifecycleOwner", "<init>", "(JLa75/b;Landroidx/lifecycle/y;)V", "wechat-sdk_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.sdk.event.pending.UIPendingEventNotifier */
/* loaded from: classes11.dex */
public class C20987xdf89b6bd<T extends a75.a> implements p012xc85e97e9.p093xedfae76a.x {

    /* renamed from: d, reason: collision with root package name */
    public final long f273928d;

    /* renamed from: e, reason: collision with root package name */
    public final a75.b f273929e;

    /* renamed from: f, reason: collision with root package name */
    public final p012xc85e97e9.p093xedfae76a.y f273930f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.Object f273931g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.HashMap f273932h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f273933i;

    /* renamed from: m, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.k3 f273934m;

    /* renamed from: n, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f273935n;

    public C20987xdf89b6bd(long j17, a75.b handler, p012xc85e97e9.p093xedfae76a.y lifecycleOwner) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(handler, "handler");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(lifecycleOwner, "lifecycleOwner");
        this.f273928d = j17;
        this.f273929e = handler;
        this.f273930f = lifecycleOwner;
        if (j17 <= 0) {
            throw new java.lang.IllegalArgumentException("not allow use zero or smaller delay");
        }
        d75.b.g(new a75.h(this));
        this.f273931g = new java.lang.Object();
        this.f273932h = new java.util.HashMap();
        this.f273933i = new java.util.concurrent.atomic.AtomicBoolean(false);
        a75.i iVar = new a75.i(this);
        this.f273934m = iVar;
        this.f273935n = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(xu5.b.b(), iVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0039, code lost:
    
        if (((a75.a) r2.put(r3, r1)) == null) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(a75.a r6, boolean r7) {
        /*
            r5 = this;
            java.lang.String r0 = "event"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r6, r0)
            androidx.lifecycle.y r0 = r5.f273930f
            androidx.lifecycle.o r0 = r0.mo273xed6858b4()
            androidx.lifecycle.n r0 = r0.b()
            androidx.lifecycle.n r1 = p012xc85e97e9.p093xedfae76a.n.DESTROYED
            if (r0 == r1) goto L76
            java.lang.Object r0 = r5.f273931g
            monitor-enter(r0)
            java.util.HashMap r1 = r5.f273932h     // Catch: java.lang.Throwable -> L73
            java.lang.String r2 = r6.get_key()     // Catch: java.lang.Throwable -> L73
            java.lang.Object r1 = r1.get(r2)     // Catch: java.lang.Throwable -> L73
            a75.a r1 = (a75.a) r1     // Catch: java.lang.Throwable -> L73
            if (r1 == 0) goto L3b
            java.util.HashMap r2 = r5.f273932h     // Catch: java.lang.Throwable -> L73
            java.lang.String r3 = r1.get_key()     // Catch: java.lang.Throwable -> L73
            a75.a r1 = r1.mo787xbd89c142(r6)     // Catch: java.lang.Throwable -> L73
            java.lang.String r4 = "null cannot be cast to non-null type T of com.tencent.mm.sdk.event.pending.UIPendingEventNotifier.doNotify$lambda$6$lambda$4"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(r1, r4)     // Catch: java.lang.Throwable -> L73
            java.lang.Object r1 = r2.put(r3, r1)     // Catch: java.lang.Throwable -> L73
            a75.a r1 = (a75.a) r1     // Catch: java.lang.Throwable -> L73
            if (r1 != 0) goto L47
        L3b:
            java.util.HashMap r1 = r5.f273932h     // Catch: java.lang.Throwable -> L73
            java.lang.String r2 = r6.get_key()     // Catch: java.lang.Throwable -> L73
            java.lang.Object r6 = r1.put(r2, r6)     // Catch: java.lang.Throwable -> L73
            a75.a r6 = (a75.a) r6     // Catch: java.lang.Throwable -> L73
        L47:
            monitor-exit(r0)
            r6 = 0
            if (r7 == 0) goto L66
            java.util.concurrent.atomic.AtomicBoolean r7 = r5.f273933i
            boolean r0 = r7.get()
            if (r0 != 0) goto L76
            java.lang.String r0 = "send pending message 0"
            java.lang.String r1 = "MicroMsg.Mvvm.UIPendingEventNotifier"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r0)
            r0 = 1
            r7.set(r0)
            com.tencent.mm.sdk.platformtools.n3 r7 = r5.f273935n
            long r0 = r5.f273928d
            r7.mo50307xb9e94560(r6, r0)
            goto L76
        L66:
            java.lang.String r7 = "send message 0"
            java.lang.String r0 = "MicroMsg.Mvvm.UIPendingEventNotifier"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r0, r7)
            com.tencent.mm.sdk.platformtools.n3 r7 = r5.f273935n
            r7.mo50305x3d8a09a2(r6)
            goto L76
        L73:
            r6 = move-exception
            monitor-exit(r0)
            throw r6
        L76:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.sdk.p2600x5c6729a.p2601xd7508997.C20987xdf89b6bd.a(a75.a, boolean):void");
    }

    @p012xc85e97e9.p093xedfae76a.l0(m7813x6ac9171 = p012xc85e97e9.p093xedfae76a.m.ON_DESTROY)
    /* renamed from: onDestroy */
    public final void m77678xac79a11b() {
        this.f273935n.mo50302x6b17ad39(null);
        this.f273933i.set(false);
        synchronized (this.f273931g) {
            this.f273932h.clear();
        }
    }
}
