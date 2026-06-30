package c61;

/* loaded from: classes.dex */
public final class a9 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f120413d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 f120414e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a9(android.graphics.Bitmap bitmap, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352) {
        super(0);
        this.f120413d = bitmap;
        this.f120414e = c22699x3dcdb352;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.graphics.Bitmap bitmap = this.f120413d;
        if (bitmap != null) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = this.f120414e;
            c22699x3dcdb352.setImageBitmap(bitmap);
            c22699x3dcdb352.m82040x7541828(i65.a.d(c22699x3dcdb352.getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.f77759x7b87af68));
        }
        return jz5.f0.f384359a;
    }
}
