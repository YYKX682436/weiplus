package com.tencent.luggage.sdk.launching;

/* loaded from: classes7.dex */
public abstract class k {
    public static final com.tencent.luggage.sdk.launching.h a(android.os.Parcel parcel) {
        com.tencent.luggage.sdk.launching.OnWXAppResultEventBinder onWXAppResultEventBinder;
        kotlin.jvm.internal.o.g(parcel, "parcel");
        if (parcel.dataAvail() > 0 && (onWXAppResultEventBinder = (com.tencent.luggage.sdk.launching.OnWXAppResultEventBinder) parcel.readParcelable(com.tencent.luggage.sdk.launching.OnWXAppResultEventBinder.class.getClassLoader())) != null) {
            return new com.tencent.luggage.sdk.launching.f(onWXAppResultEventBinder.f47593d, onWXAppResultEventBinder.f47594e);
        }
        return null;
    }

    public static final void b(com.tencent.luggage.sdk.launching.h hVar) {
        com.tencent.luggage.sdk.launching.f fVar = hVar instanceof com.tencent.luggage.sdk.launching.f ? (com.tencent.luggage.sdk.launching.f) hVar : null;
        if (fVar == null || fVar.f47614g.getAndSet(true)) {
            return;
        }
        fVar.b(new com.tencent.luggage.sdk.launching.OnWXAppResultXPCMessage(fVar.f47612e, 2, null, null, null, 24, null));
    }

    public static final void c(com.tencent.luggage.sdk.launching.h hVar, android.os.Parcel parcel) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        d(hVar, parcel, 0, 4, null);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.tencent.mm.sdk.event.IListener, com.tencent.luggage.sdk.launching.OnWXAppResultXPCLeakFreeWrapper$writeToParcel$eventListener$1] */
    public static void d(final com.tencent.luggage.sdk.launching.h hVar, android.os.Parcel parcel, int i17, int i18, java.lang.Object obj) {
        com.tencent.luggage.sdk.launching.OnWXAppResultEventBinder onWXAppResultEventBinder;
        if ((i18 & 4) != 0) {
            i17 = 0;
        }
        kotlin.jvm.internal.o.g(parcel, "parcel");
        if (hVar == null) {
            onWXAppResultEventBinder = null;
        } else if (hVar instanceof com.tencent.luggage.sdk.launching.f) {
            com.tencent.luggage.sdk.launching.f fVar = (com.tencent.luggage.sdk.launching.f) hVar;
            onWXAppResultEventBinder = new com.tencent.luggage.sdk.launching.OnWXAppResultEventBinder(fVar.f47612e, fVar.f47613f);
        } else {
            final int hash = java.util.Objects.hash(java.lang.Integer.valueOf(hVar.hashCode()), java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
            final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
            ?? r07 = new com.tencent.mm.sdk.event.IListener<com.tencent.luggage.sdk.launching.OnWXAppResultLocalEvent>(a0Var) { // from class: com.tencent.luggage.sdk.launching.OnWXAppResultXPCLeakFreeWrapper$writeToParcel$eventListener$1
                {
                    this.__eventId = -590022836;
                }

                @Override // com.tencent.mm.sdk.event.IListener
                public boolean callback(com.tencent.luggage.sdk.launching.OnWXAppResultLocalEvent onWXAppResultLocalEvent) {
                    com.tencent.luggage.sdk.launching.OnWXAppResultLocalEvent event = onWXAppResultLocalEvent;
                    kotlin.jvm.internal.o.g(event, "event");
                    com.tencent.mars.xlog.Log.i("MicroMsg.OnWXAppResultEventSender", "OnWXAppResultLocalEvent instance:" + event.f47595g + ", action:" + event.f47596h + ", data:" + event.f47597i);
                    int i19 = event.f47595g;
                    int i27 = hash;
                    if (i27 != i19) {
                        return false;
                    }
                    int i28 = event.f47596h;
                    if (i28 == 1) {
                        android.os.Parcelable parcelable = event.f47597i;
                        if (!(parcelable instanceof android.os.Parcelable)) {
                            parcelable = null;
                        }
                        hVar.a(parcelable);
                    } else {
                        if (i28 != 2) {
                            return false;
                        }
                        com.tencent.mars.xlog.Log.i("MicroMsg.OnWXAppResultXPCLeakFreeWrapper.Helper", "EventBinder released, instance:" + i27 + ", processName:" + bm5.f1.a());
                        dead();
                    }
                    return true;
                }
            };
            r07.alive();
            java.lang.String a17 = bm5.f1.a();
            com.tencent.luggage.sdk.launching.OnWXAppResultEventBinder onWXAppResultEventBinder2 = new com.tencent.luggage.sdk.launching.OnWXAppResultEventBinder(hash, a17);
            com.tencent.mars.xlog.Log.i("MicroMsg.OnWXAppResultXPCLeakFreeWrapper.Helper", "construct source EventBinder, instance:" + hash + ", processName:" + a17);
            ((java.util.concurrent.ConcurrentLinkedQueue) hVar.f47616d).offer(new com.tencent.luggage.sdk.launching.j(onWXAppResultEventBinder2, r07));
            onWXAppResultEventBinder = onWXAppResultEventBinder2;
        }
        parcel.writeParcelable(onWXAppResultEventBinder, i17);
    }
}
