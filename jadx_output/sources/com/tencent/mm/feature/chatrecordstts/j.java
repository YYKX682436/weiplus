package com.tencent.mm.feature.chatrecordstts;

/* loaded from: classes12.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.mm.storage.f9 f65467a;

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.mm.storage.f9 f65468b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.Boolean f65469c;

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.feature.chatrecordstts.k2 f65470d;

    public j(com.tencent.mm.storage.f9 currentMessage, com.tencent.mm.storage.f9 f9Var, java.lang.Boolean bool, com.tencent.mm.feature.chatrecordstts.k2 runner, int i17, kotlin.jvm.internal.i iVar) {
        f9Var = (i17 & 2) != 0 ? null : f9Var;
        bool = (i17 & 4) != 0 ? null : bool;
        kotlin.jvm.internal.o.g(currentMessage, "currentMessage");
        kotlin.jvm.internal.o.g(runner, "runner");
        this.f65467a = currentMessage;
        this.f65468b = f9Var;
        this.f65469c = bool;
        this.f65470d = runner;
    }
}
