package com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5;

/* loaded from: classes.dex */
public final class c3 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f233325d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.C22628xfde5d61d f233326e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c3(java.lang.String str, com.p314xaae8f345.mm.ui.p2747xd1075a44.C22628xfde5d61d c22628xfde5d61d) {
        super(2);
        this.f233325d = str;
        this.f233326e = c22628xfde5d61d;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        cp0.n vieweWakHolder = (cp0.n) obj;
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(vieweWakHolder, "vieweWakHolder");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("loadBitmap finished:");
        sb6.append(bitmap);
        sb6.append(", size:[");
        sb6.append(bitmap != null ? java.lang.Integer.valueOf(bitmap.getWidth()) : null);
        sb6.append(',');
        sb6.append(bitmap != null ? java.lang.Integer.valueOf(bitmap.getHeight()) : null);
        sb6.append("], url:");
        sb6.append(this.f233325d);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MusicMvCommentView", sb6.toString());
        if (bitmap != null) {
            this.f233326e.setImageBitmap(bitmap);
        }
        return jz5.f0.f384359a;
    }
}
