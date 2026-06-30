package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class i00 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.v00 f106978d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i00(com.tencent.mm.plugin.finder.feed.v00 v00Var) {
        super(0);
        this.f106978d = v00Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        androidx.fragment.app.Fragment fragment = this.f106978d.f110849g;
        if (fragment == null) {
            return null;
        }
        return (com.tencent.mm.plugin.finder.viewmodel.component.d1) pf5.z.f353948a.b(fragment).a(com.tencent.mm.plugin.finder.viewmodel.component.d1.class);
    }
}
