package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class pd extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f104254d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f104255e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f104256f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f104257g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pd(boolean z17, boolean z18, boolean z19, java.util.LinkedList linkedList) {
        super(0);
        this.f104254d = z17;
        this.f104255e = z18;
        this.f104256f = z19;
        this.f104257g = linkedList;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return java.lang.Boolean.valueOf(this.f104254d && this.f104255e && !this.f104256f && this.f104257g.size() > 0);
    }
}
