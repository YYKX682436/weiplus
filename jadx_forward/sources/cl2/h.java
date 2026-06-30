package cl2;

/* loaded from: classes.dex */
public final class h extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f124461d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 f124462e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(android.graphics.Bitmap bitmap, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352) {
        super(0);
        this.f124461d = bitmap;
        this.f124462e = c22699x3dcdb352;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.graphics.Bitmap bitmap = this.f124461d;
        if (bitmap != null) {
            android.graphics.Bitmap s07 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.s0(bitmap, false, 8.0f);
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = this.f124462e;
            c22699x3dcdb352.setImageBitmap(s07);
            c22699x3dcdb352.setVisibility(0);
        }
        return jz5.f0.f384359a;
    }
}
