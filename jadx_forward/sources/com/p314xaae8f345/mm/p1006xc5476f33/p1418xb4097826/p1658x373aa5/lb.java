package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

/* loaded from: classes2.dex */
public final class lb extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f214122d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 f214123e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f214124f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f214125g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lb(android.graphics.Bitmap bitmap, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352, int i17, java.lang.String str) {
        super(0);
        this.f214122d = bitmap;
        this.f214123e = c22699x3dcdb352;
        this.f214124f = i17;
        this.f214125g = str;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = this.f214123e;
        android.graphics.Bitmap bitmap = this.f214122d;
        if (bitmap == null) {
            c22699x3dcdb352.setVisibility(8);
        } else {
            c22699x3dcdb352.setImageBitmap(bitmap);
            c22699x3dcdb352.m82040x7541828(this.f214124f);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.HomeTabRedDotTipsBubbleView", "getImage resource :" + bitmap + " iconUrl:" + this.f214125g);
        return jz5.f0.f384359a;
    }
}
