package com.tencent.mm.plugin.finder.extension.reddot;

/* loaded from: classes3.dex */
public final class i7 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.Map.Entry f105595d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i7(java.util.Map.Entry entry) {
        super(1);
        this.f105595d = entry;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.finder.extension.reddot.jb it = (com.tencent.mm.plugin.finder.extension.reddot.jb) obj;
        kotlin.jvm.internal.o.g(it, "it");
        return java.lang.Boolean.valueOf(((java.util.LinkedList) this.f105595d.getValue()).indexOf(it) >= 0);
    }
}
