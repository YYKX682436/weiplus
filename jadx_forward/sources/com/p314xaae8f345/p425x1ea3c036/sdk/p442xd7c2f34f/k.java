package com.p314xaae8f345.p425x1ea3c036.sdk.p442xd7c2f34f;

/* loaded from: classes7.dex */
public abstract class k {
    public static final com.p314xaae8f345.p425x1ea3c036.sdk.p442xd7c2f34f.h a(android.os.Parcel parcel) {
        com.p314xaae8f345.p425x1ea3c036.sdk.p442xd7c2f34f.C3934x511d55a6 c3934x511d55a6;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parcel, "parcel");
        if (parcel.dataAvail() > 0 && (c3934x511d55a6 = (com.p314xaae8f345.p425x1ea3c036.sdk.p442xd7c2f34f.C3934x511d55a6) parcel.readParcelable(com.p314xaae8f345.p425x1ea3c036.sdk.p442xd7c2f34f.C3934x511d55a6.class.getClassLoader())) != null) {
            return new com.p314xaae8f345.p425x1ea3c036.sdk.p442xd7c2f34f.f(c3934x511d55a6.f129126d, c3934x511d55a6.f129127e);
        }
        return null;
    }

    public static final void b(com.p314xaae8f345.p425x1ea3c036.sdk.p442xd7c2f34f.h hVar) {
        com.p314xaae8f345.p425x1ea3c036.sdk.p442xd7c2f34f.f fVar = hVar instanceof com.p314xaae8f345.p425x1ea3c036.sdk.p442xd7c2f34f.f ? (com.p314xaae8f345.p425x1ea3c036.sdk.p442xd7c2f34f.f) hVar : null;
        if (fVar == null || fVar.f129147g.getAndSet(true)) {
            return;
        }
        fVar.b(new com.p314xaae8f345.p425x1ea3c036.sdk.p442xd7c2f34f.C3937x1adcb01a(fVar.f129145e, 2, null, null, null, 24, null));
    }

    public static final void c(com.p314xaae8f345.p425x1ea3c036.sdk.p442xd7c2f34f.h hVar, android.os.Parcel parcel) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parcel, "parcel");
        d(hVar, parcel, 0, 4, null);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.tencent.mm.sdk.event.IListener, com.tencent.luggage.sdk.launching.OnWXAppResultXPCLeakFreeWrapper$writeToParcel$eventListener$1] */
    public static void d(final com.p314xaae8f345.p425x1ea3c036.sdk.p442xd7c2f34f.h hVar, android.os.Parcel parcel, int i17, int i18, java.lang.Object obj) {
        com.p314xaae8f345.p425x1ea3c036.sdk.p442xd7c2f34f.C3934x511d55a6 c3934x511d55a6;
        if ((i18 & 4) != 0) {
            i17 = 0;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parcel, "parcel");
        if (hVar == null) {
            c3934x511d55a6 = null;
        } else if (hVar instanceof com.p314xaae8f345.p425x1ea3c036.sdk.p442xd7c2f34f.f) {
            com.p314xaae8f345.p425x1ea3c036.sdk.p442xd7c2f34f.f fVar = (com.p314xaae8f345.p425x1ea3c036.sdk.p442xd7c2f34f.f) hVar;
            c3934x511d55a6 = new com.p314xaae8f345.p425x1ea3c036.sdk.p442xd7c2f34f.C3934x511d55a6(fVar.f129145e, fVar.f129146f);
        } else {
            final int hash = java.util.Objects.hash(java.lang.Integer.valueOf(hVar.hashCode()), java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
            final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
            ?? r07 = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.p425x1ea3c036.sdk.p442xd7c2f34f.C3935xc34230ed>(a0Var) { // from class: com.tencent.luggage.sdk.launching.OnWXAppResultXPCLeakFreeWrapper$writeToParcel$eventListener$1
                {
                    this.f39173x3fe91575 = -590022836;
                }

                @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
                /* renamed from: callback */
                public boolean mo1xf5bc2045(com.p314xaae8f345.p425x1ea3c036.sdk.p442xd7c2f34f.C3935xc34230ed c3935xc34230ed) {
                    com.p314xaae8f345.p425x1ea3c036.sdk.p442xd7c2f34f.C3935xc34230ed event = c3935xc34230ed;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OnWXAppResultEventSender", "OnWXAppResultLocalEvent instance:" + event.f129128g + ", action:" + event.f129129h + ", data:" + event.f129130i);
                    int i19 = event.f129128g;
                    int i27 = hash;
                    if (i27 != i19) {
                        return false;
                    }
                    int i28 = event.f129129h;
                    if (i28 == 1) {
                        android.os.Parcelable parcelable = event.f129130i;
                        if (!(parcelable instanceof android.os.Parcelable)) {
                            parcelable = null;
                        }
                        hVar.a(parcelable);
                    } else {
                        if (i28 != 2) {
                            return false;
                        }
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OnWXAppResultXPCLeakFreeWrapper.Helper", "EventBinder released, instance:" + i27 + ", processName:" + bm5.f1.a());
                        mo48814x2efc64();
                    }
                    return true;
                }
            };
            r07.mo48813x58998cd();
            java.lang.String a17 = bm5.f1.a();
            com.p314xaae8f345.p425x1ea3c036.sdk.p442xd7c2f34f.C3934x511d55a6 c3934x511d55a62 = new com.p314xaae8f345.p425x1ea3c036.sdk.p442xd7c2f34f.C3934x511d55a6(hash, a17);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OnWXAppResultXPCLeakFreeWrapper.Helper", "construct source EventBinder, instance:" + hash + ", processName:" + a17);
            ((java.util.concurrent.ConcurrentLinkedQueue) hVar.f129149d).offer(new com.p314xaae8f345.p425x1ea3c036.sdk.p442xd7c2f34f.j(c3934x511d55a62, r07));
            c3934x511d55a6 = c3934x511d55a62;
        }
        parcel.writeParcelable(c3934x511d55a6, i17);
    }
}
