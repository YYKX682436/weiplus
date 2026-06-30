package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class g9 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f103464d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.LinearLayout f103465e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.qe f103466f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g9(in5.s0 s0Var, android.widget.LinearLayout linearLayout, com.tencent.mm.plugin.finder.convert.qe qeVar) {
        super(0);
        this.f103464d = s0Var;
        this.f103465e = linearLayout;
        this.f103466f = qeVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.view.View p17 = this.f103464d.p(com.tencent.mm.R.id.jdk);
        android.view.ViewGroup viewGroup = p17 instanceof android.view.ViewGroup ? (android.view.ViewGroup) p17 : null;
        if (viewGroup != null) {
            viewGroup.removeView(this.f103465e);
        }
        this.f103466f.f104367r = null;
        return jz5.f0.f302826a;
    }
}
