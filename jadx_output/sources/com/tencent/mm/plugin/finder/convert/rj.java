package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class rj extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f104478d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rj(android.view.ViewGroup viewGroup) {
        super(0);
        this.f104478d = viewGroup;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.view.KeyEvent.Callback childAt = this.f104478d.getChildAt(0);
        k20.h hVar = childAt instanceof k20.h ? (k20.h) childAt : null;
        if (hVar != null) {
            hVar.a(true);
        }
        return jz5.f0.f302826a;
    }
}
