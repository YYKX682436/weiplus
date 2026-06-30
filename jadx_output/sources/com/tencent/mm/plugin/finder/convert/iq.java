package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes.dex */
public final class iq implements ep0.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.imageview.WeImageView f103685a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f103686b;

    public iq(com.tencent.mm.ui.widget.imageview.WeImageView weImageView, in5.s0 s0Var) {
        this.f103685a = weImageView;
        this.f103686b = s0Var;
    }

    @Override // ep0.e
    public void a(ip0.a aVar, cp0.n nVar, java.lang.Object obj) {
        pm0.v.X(new com.tencent.mm.plugin.finder.convert.hq((android.graphics.Bitmap) obj, this.f103685a, this.f103686b));
    }
}
