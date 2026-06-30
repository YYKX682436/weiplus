package com.tencent.mm.plugin.finder.feed.model;

/* loaded from: classes3.dex */
public final class b4 extends com.tencent.mm.plugin.finder.feed.model.internal.IResponse {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.LinkedList f107723a;

    /* renamed from: b, reason: collision with root package name */
    public final long f107724b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b4(int i17, int i18, java.lang.String str, java.util.LinkedList wecoinHotList, long j17) {
        super(i17, i18, str);
        kotlin.jvm.internal.o.g(wecoinHotList, "wecoinHotList");
        this.f107723a = wecoinHotList;
        this.f107724b = j17;
    }
}
