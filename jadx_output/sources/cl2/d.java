package cl2;

/* loaded from: classes.dex */
public final class d extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.MMRoundCornerImageView f42920d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f42921e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(com.tencent.mm.ui.widget.MMRoundCornerImageView mMRoundCornerImageView, android.graphics.Bitmap bitmap) {
        super(0);
        this.f42920d = mMRoundCornerImageView;
        this.f42921e = bitmap;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        this.f42920d.setImageBitmap(this.f42921e);
        return jz5.f0.f302826a;
    }
}
