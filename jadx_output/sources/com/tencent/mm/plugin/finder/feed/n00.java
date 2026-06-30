package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class n00 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.v00 f108537d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n00(com.tencent.mm.plugin.finder.feed.v00 v00Var) {
        super(1);
        this.f108537d = v00Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.view.ViewGroup viewGroup;
        float floatValue = ((java.lang.Number) obj).floatValue();
        com.tencent.mm.plugin.finder.viewmodel.component.d1 d1Var = (com.tencent.mm.plugin.finder.viewmodel.component.d1) ((jz5.n) this.f108537d.f110853n).getValue();
        if (d1Var != null && d1Var.f134061h != null && (viewGroup = (android.view.ViewGroup) ((jz5.n) d1Var.f134058e).getValue()) != null) {
            viewGroup.setTranslationY(floatValue);
        }
        return jz5.f0.f302826a;
    }
}
