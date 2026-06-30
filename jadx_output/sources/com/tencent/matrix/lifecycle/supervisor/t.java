package com.tencent.matrix.lifecycle.supervisor;

/* loaded from: classes12.dex */
public final class t extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.matrix.lifecycle.supervisor.t f52873d = new com.tencent.matrix.lifecycle.supervisor.t();

    public t() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        if (com.tencent.matrix.lifecycle.supervisor.d0.f52834k.d()) {
            return new com.tencent.matrix.lifecycle.supervisor.p();
        }
        throw new java.lang.IllegalAccessException("NOT allow for subordinate processes");
    }
}
