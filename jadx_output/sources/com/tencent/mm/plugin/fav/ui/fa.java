package com.tencent.mm.plugin.fav.ui;

/* loaded from: classes11.dex */
public final class fa extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f100855d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f100856e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fa(yz5.l lVar, java.util.ArrayList arrayList) {
        super(0);
        this.f100855d = lVar;
        this.f100856e = arrayList;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        yz5.l lVar = this.f100855d;
        java.util.ArrayList arrayList = this.f100856e;
        lVar.invoke(arrayList);
        com.tencent.mm.plugin.fav.ui.ia.f101182c.addAll(arrayList);
        com.tencent.mm.plugin.fav.ui.ia.f101183d = true;
        return jz5.f0.f302826a;
    }
}
