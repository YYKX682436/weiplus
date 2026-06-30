package ax1;

/* loaded from: classes2.dex */
public final class v extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f15020d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f15021e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f15022f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(android.content.Context context, android.graphics.Bitmap bitmap, android.view.View view) {
        super(0);
        this.f15020d = context;
        this.f15021e = bitmap;
        this.f15022f = view;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        this.f15022f.setBackground(new android.graphics.drawable.BitmapDrawable(this.f15020d.getResources(), this.f15021e));
        return jz5.f0.f302826a;
    }
}
