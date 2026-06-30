package com.tencent.mm.plugin.finder.feed.model.internal;

/* loaded from: classes2.dex */
public final class e0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.internal.j0 f107979d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f107980e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f107981f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f107982g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(com.tencent.mm.plugin.finder.feed.model.internal.j0 j0Var, int i17, int i18, java.lang.Object obj) {
        super(0);
        this.f107979d = j0Var;
        this.f107980e = i17;
        this.f107981f = i18;
        this.f107982g = obj;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.util.LinkedList linkedList = this.f107979d.f108008a;
        int i17 = this.f107980e;
        int i18 = this.f107981f;
        java.lang.Object obj = this.f107982g;
        synchronized (linkedList) {
            java.util.Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                ((ym5.q1) it.next()).onItemRangeChanged(i17, i18, obj);
            }
        }
        return jz5.f0.f302826a;
    }
}
