package com.tencent.mm.feature.chatrecordstts;

/* loaded from: classes7.dex */
public final class f1 {

    /* renamed from: a, reason: collision with root package name */
    public final long f65417a;

    /* renamed from: b, reason: collision with root package name */
    public final yz5.a f65418b;

    /* renamed from: c, reason: collision with root package name */
    public final yz5.l f65419c;

    /* renamed from: d, reason: collision with root package name */
    public kotlinx.coroutines.r2 f65420d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f65421e;

    public f1(long j17, yz5.a conditionCheck, yz5.l onConditionFailed, int i17, kotlin.jvm.internal.i iVar) {
        j17 = (i17 & 1) != 0 ? 15000L : j17;
        kotlin.jvm.internal.o.g(conditionCheck, "conditionCheck");
        kotlin.jvm.internal.o.g(onConditionFailed, "onConditionFailed");
        this.f65417a = j17;
        this.f65418b = conditionCheck;
        this.f65419c = onConditionFailed;
    }
}
