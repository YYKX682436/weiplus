package com.tencent.mm.feature.emoji;

/* loaded from: classes12.dex */
public class e0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f66233d;

    public e0(com.tencent.mm.feature.emoji.b0 b0Var, com.tencent.mm.storage.f9 f9Var) {
        this.f66233d = f9Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        c01.v8 v8Var = ((mo3.g) ((oo3.j) i95.n0.c(oo3.j.class))).f330408e;
        if (v8Var != null) {
            v8Var.a(this.f66233d);
        }
    }
}
