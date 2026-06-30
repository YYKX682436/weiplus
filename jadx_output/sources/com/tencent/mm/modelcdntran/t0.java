package com.tencent.mm.modelcdntran;

/* loaded from: classes5.dex */
public final class t0 implements java.util.function.BiConsumer {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.modelcdntran.t0 f71137a = new com.tencent.mm.modelcdntran.t0();

    @Override // java.util.function.BiConsumer
    public void accept(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.String mediaId = (java.lang.String) obj;
        com.tencent.mm.modelcdntran.r0 task = (com.tencent.mm.modelcdntran.r0) obj2;
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        kotlin.jvm.internal.o.g(task, "task");
        ((rx.f) ((sx.b0) i95.n0.c(sx.b0.class))).Ai(mediaId);
    }
}
