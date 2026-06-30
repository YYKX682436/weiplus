package com.tencent.matrix.lifecycle.owners;

/* loaded from: classes12.dex */
public final class p extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.matrix.lifecycle.owners.p f52765d = new com.tencent.matrix.lifecycle.owners.p();

    public p() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return java.lang.Boolean.valueOf(com.tencent.matrix.lifecycle.owners.ForegroundServiceLifecycleOwner.INSTANCE.hasForegroundService());
    }
}
