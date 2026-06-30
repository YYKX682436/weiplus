package com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59;

/* loaded from: classes12.dex */
public abstract class c {
    public static final java.lang.String a(int i17) {
        if (i17 == 0) {
            return com.p314xaae8f345.p3085x8ea91595.p3089x41473653.AbstractServiceConnectionC26658x1e46da09.f56035xc79cea6c;
        }
        if (i17 == 1) {
            return "RED";
        }
        if (i17 == 2) {
            return "GREEN";
        }
        if (i17 == 3) {
            return "YELLOW";
        }
        throw new java.lang.IllegalStateException(("Unknown signal: " + i17).toString());
    }

    public static final java.lang.String b(int i17) {
        if (i17 == 0) {
            return com.p314xaae8f345.p3085x8ea91595.p3089x41473653.AbstractServiceConnectionC26658x1e46da09.f56035xc79cea6c;
        }
        if (i17 == 1) {
            return "SUSPEND";
        }
        if (i17 == 2) {
            return "RESUME";
        }
        if (i17 == 3) {
            return "LOW_ENERGY";
        }
        throw new java.lang.IllegalStateException(("Unknown status: " + i17).toString());
    }
}
