package com.tencent.mm.plugin.fav.ui;

/* loaded from: classes12.dex */
public final class a9 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.da f100467d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a9(com.tencent.mm.plugin.fav.ui.da daVar) {
        super(0);
        this.f100467d = daVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.fav.ui.adapter.c cVar = this.f100467d.f100583n;
        if (cVar != null) {
            cVar.notifyDataSetChanged();
            return jz5.f0.f302826a;
        }
        kotlin.jvm.internal.o.o("mResultAdapter");
        throw null;
    }
}
