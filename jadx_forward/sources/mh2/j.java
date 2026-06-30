package mh2;

/* loaded from: classes3.dex */
public final class j extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mh2.k f407906d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(mh2.k kVar) {
        super(1);
        this.f407906d = kVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        android.graphics.Bitmap originBitmap = (android.graphics.Bitmap) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(originBitmap, "originBitmap");
        mh2.k kVar = this.f407906d;
        kVar.f407912h = originBitmap;
        kVar.d(originBitmap);
        return jz5.f0.f384359a;
    }
}
