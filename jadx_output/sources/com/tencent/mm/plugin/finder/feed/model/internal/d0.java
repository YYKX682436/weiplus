package com.tencent.mm.plugin.finder.feed.model.internal;

/* loaded from: classes2.dex */
public final class d0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.internal.j0 f107969d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f107970e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f107971f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(com.tencent.mm.plugin.finder.feed.model.internal.j0 j0Var, int i17, int i18) {
        super(0);
        this.f107969d = j0Var;
        this.f107970e = i17;
        this.f107971f = i18;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.util.LinkedList linkedList = this.f107969d.f108008a;
        int i17 = this.f107970e;
        int i18 = this.f107971f;
        synchronized (linkedList) {
            java.util.Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                ((ym5.q1) it.next()).onItemRangeChanged(i17, i18);
            }
        }
        return jz5.f0.f302826a;
    }
}
