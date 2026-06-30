package com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc;

/* loaded from: classes.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    public final jz5.g f263004a = jz5.h.b(com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.b0.f262991d);

    public final float a() {
        float q17 = i65.a.q(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        if (q17 >= 1.4f) {
            return 1.15f;
        }
        if (q17 >= 1.125f || q17 >= 1.12f || q17 >= 1.1f) {
            return 1.1f;
        }
        float f17 = 1.0f;
        if (q17 < 1.0f) {
            f17 = 0.8f;
            if (q17 >= 0.8f) {
                return 0.9f;
            }
        }
        return f17;
    }
}
