package com.tencent.maas.camstudio.gesture;

/* loaded from: classes5.dex */
public abstract class MJGestureEvent {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.maas.camstudio.p f47942a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.maas.camstudio.gesture.MJGestureEvent.MJGesturePhase f47943b;

    /* loaded from: classes5.dex */
    public enum MJGesturePhase {
        Began(0),
        Changed(1),
        Ended(2);


        /* renamed from: d, reason: collision with root package name */
        public final int f47948d;

        MJGesturePhase(int i17) {
            this.f47948d = i17;
        }
    }

    public MJGestureEvent(com.tencent.maas.camstudio.p pVar, com.tencent.maas.camstudio.gesture.MJGestureEvent.MJGesturePhase mJGesturePhase) {
        this.f47942a = pVar;
        this.f47943b = mJGesturePhase;
    }
}
