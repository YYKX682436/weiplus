package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes10.dex */
public final class r4 implements ep0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.u4 f104439a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.imageview.WeImageView f104440b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f104441c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f104442d;

    public r4(com.tencent.mm.plugin.finder.convert.u4 u4Var, com.tencent.mm.ui.widget.imageview.WeImageView weImageView, int i17, int i18) {
        this.f104439a = u4Var;
        this.f104440b = weImageView;
        this.f104441c = i17;
        this.f104442d = i18;
    }

    @Override // ep0.a
    public final void a(boolean z17, java.lang.Object[] objArr) {
        if (z17) {
            return;
        }
        this.f104439a.getClass();
        d75.b.g(new com.tencent.mm.plugin.finder.convert.o4(this.f104440b, this.f104441c, this.f104442d));
    }
}
