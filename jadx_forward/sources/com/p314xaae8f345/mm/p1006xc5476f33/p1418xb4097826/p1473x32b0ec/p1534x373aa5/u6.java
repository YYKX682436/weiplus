package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5;

/* loaded from: classes3.dex */
public final class u6 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f198243d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14335x54feb80e f198244e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f198245f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u6(android.widget.ImageView imageView, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14335x54feb80e c14335x54feb80e, android.graphics.Bitmap bitmap) {
        super(0);
        this.f198243d = imageView;
        this.f198244e = c14335x54feb80e;
        this.f198245f = bitmap;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14335x54feb80e c14335x54feb80e = this.f198244e;
        this.f198243d.setImageDrawable(new android.graphics.drawable.BitmapDrawable(c14335x54feb80e.getContext().getResources(), this.f198245f));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c14335x54feb80e.getTAG(), "loadBackgroundImage success!");
        return jz5.f0.f384359a;
    }
}
