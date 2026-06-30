package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes.dex */
public final class vc implements ep0.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.imageview.WeImageView f104777a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f104778b;

    public vc(com.tencent.mm.ui.widget.imageview.WeImageView weImageView, in5.s0 s0Var) {
        this.f104777a = weImageView;
        this.f104778b = s0Var;
    }

    @Override // ep0.e
    public void a(ip0.a aVar, cp0.n nVar, java.lang.Object obj) {
        pm0.v.X(new com.tencent.mm.plugin.finder.convert.uc((android.graphics.Bitmap) obj, this.f104777a, this.f104778b));
    }
}
