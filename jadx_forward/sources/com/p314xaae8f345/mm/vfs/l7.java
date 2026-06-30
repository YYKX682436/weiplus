package com.p314xaae8f345.mm.vfs;

/* loaded from: classes8.dex */
public class l7 implements mm.b0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.atomic.AtomicBoolean f294602a;

    public l7(java.util.concurrent.atomic.AtomicBoolean atomicBoolean) {
        this.f294602a = atomicBoolean;
    }

    @Override // mm.b0
    public java.lang.String a() {
        return "VFS";
    }

    @Override // mm.b0
    public boolean b() {
        return this.f294602a.get();
    }
}
