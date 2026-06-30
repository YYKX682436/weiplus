package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes2.dex */
public final class pd extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f185787d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f185788e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f185789f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f185790g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pd(boolean z17, boolean z18, boolean z19, java.util.LinkedList linkedList) {
        super(0);
        this.f185787d = z17;
        this.f185788e = z18;
        this.f185789f = z19;
        this.f185790g = linkedList;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        return java.lang.Boolean.valueOf(this.f185787d && this.f185788e && !this.f185789f && this.f185790g.size() > 0);
    }
}
