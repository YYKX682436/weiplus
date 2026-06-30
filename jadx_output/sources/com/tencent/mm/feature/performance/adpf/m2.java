package com.tencent.mm.feature.performance.adpf;

/* loaded from: classes.dex */
public final class m2 implements java.util.Comparator {
    @Override // java.util.Comparator
    public final int compare(java.lang.Object obj, java.lang.Object obj2) {
        return mz5.a.b(java.lang.Integer.valueOf(((java.util.concurrent.atomic.AtomicInteger) ((java.util.Map.Entry) obj2).getValue()).get()), java.lang.Integer.valueOf(((java.util.concurrent.atomic.AtomicInteger) ((java.util.Map.Entry) obj).getValue()).get()));
    }
}
