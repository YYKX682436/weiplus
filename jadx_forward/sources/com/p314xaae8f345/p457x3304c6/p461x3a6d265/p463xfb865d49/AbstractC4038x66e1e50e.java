package com.p314xaae8f345.p457x3304c6.p461x3a6d265.p463xfb865d49;

/* renamed from: com.tencent.maas.camstudio.gesture.MJGestureEvent */
/* loaded from: classes5.dex */
public abstract class AbstractC4038x66e1e50e {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.p457x3304c6.p461x3a6d265.p f129475a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.p457x3304c6.p461x3a6d265.p463xfb865d49.AbstractC4038x66e1e50e.MJGesturePhase f129476b;

    /* renamed from: com.tencent.maas.camstudio.gesture.MJGestureEvent$MJGesturePhase */
    /* loaded from: classes5.dex */
    public enum MJGesturePhase {
        Began(0),
        Changed(1),
        Ended(2);


        /* renamed from: d, reason: collision with root package name */
        public final int f129481d;

        MJGesturePhase(int i17) {
            this.f129481d = i17;
        }
    }

    public AbstractC4038x66e1e50e(com.p314xaae8f345.p457x3304c6.p461x3a6d265.p pVar, com.p314xaae8f345.p457x3304c6.p461x3a6d265.p463xfb865d49.AbstractC4038x66e1e50e.MJGesturePhase mJGesturePhase) {
        this.f129475a = pVar;
        this.f129476b = mJGesturePhase;
    }
}
