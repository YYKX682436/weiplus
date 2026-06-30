package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class nl extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.tl f108584d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nl(com.tencent.mm.plugin.finder.feed.tl tlVar) {
        super(0);
        this.f108584d = tlVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.feed.tl tlVar = this.f108584d;
        do2.k kVar = tlVar.B;
        if (kVar != null) {
            kVar.dismiss();
        }
        tlVar.B = null;
        return jz5.f0.f302826a;
    }
}
