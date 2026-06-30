package com.tencent.maas.camstudio.gesture;

/* loaded from: classes5.dex */
public class MJTapGestureEvent extends com.tencent.maas.camstudio.gesture.MJGestureEvent {

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.maas.base.Vec2 f47950c;

    public MJTapGestureEvent(com.tencent.maas.camstudio.gesture.MJGestureEvent.MJGesturePhase mJGesturePhase, com.tencent.maas.base.Vec2 vec2) {
        super(com.tencent.maas.camstudio.p.Tap, mJGesturePhase);
        this.f47950c = vec2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public MJTapGestureEvent(int r7, com.tencent.maas.base.Vec2 r8) {
        /*
            r6 = this;
            com.tencent.maas.camstudio.p r0 = com.tencent.maas.camstudio.p.Tap
            com.tencent.maas.camstudio.gesture.MJGestureEvent$MJGesturePhase[] r1 = com.tencent.maas.camstudio.gesture.MJGestureEvent.MJGesturePhase.values()
            int r2 = r1.length
            r3 = 0
        L8:
            if (r3 >= r2) goto L14
            r4 = r1[r3]
            int r5 = r4.f47948d
            if (r5 != r7) goto L11
            goto L16
        L11:
            int r3 = r3 + 1
            goto L8
        L14:
            com.tencent.maas.camstudio.gesture.MJGestureEvent$MJGesturePhase r4 = com.tencent.maas.camstudio.gesture.MJGestureEvent.MJGesturePhase.Ended
        L16:
            r6.<init>(r0, r4)
            r6.f47950c = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.maas.camstudio.gesture.MJTapGestureEvent.<init>(int, com.tencent.maas.base.Vec2):void");
    }
}
