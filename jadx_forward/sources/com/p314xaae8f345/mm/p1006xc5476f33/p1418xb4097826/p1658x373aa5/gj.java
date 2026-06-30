package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

/* loaded from: classes10.dex */
public final class gj extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f213698d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15342x9031fe70 f213699e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f213700f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f213701g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gj(android.graphics.Bitmap bitmap, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15342x9031fe70 c15342x9031fe70, java.lang.String str, int i17) {
        super(0);
        this.f213698d = bitmap;
        this.f213699e = c15342x9031fe70;
        this.f213700f = str;
        this.f213701g = i17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.String str = this.f213700f;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15342x9031fe70 c15342x9031fe70 = this.f213699e;
        android.graphics.Bitmap bitmap = this.f213698d;
        if (bitmap == null) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = c15342x9031fe70.f212983m;
            if (c22699x3dcdb352 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("highLightIcon");
                throw null;
            }
            c22699x3dcdb352.setVisibility(4);
        } else {
            int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15342x9031fe70.f212976w;
            boolean j17 = c15342x9031fe70.j(str);
            int i18 = this.f213701g;
            if (j17) {
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3522 = c15342x9031fe70.f212983m;
                if (c22699x3dcdb3522 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("highLightIcon");
                    throw null;
                }
                c22699x3dcdb3522.m82040x7541828(i18);
            } else {
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3523 = c15342x9031fe70.f212983m;
                if (c22699x3dcdb3523 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("highLightIcon");
                    throw null;
                }
                c22699x3dcdb3523.setImageBitmap(bitmap);
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3524 = c15342x9031fe70.f212983m;
                if (c22699x3dcdb3524 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("highLightIcon");
                    throw null;
                }
                c22699x3dcdb3524.m82040x7541828(i18);
            }
            c15342x9031fe70.f212989s = str == null ? "" : str;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.RedDotTextView", "getImage resource :" + bitmap + " iconUrl:" + str);
        return jz5.f0.f384359a;
    }
}
