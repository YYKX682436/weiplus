package ax1;

/* loaded from: classes2.dex */
public final class v extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f96553d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f96554e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f96555f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(android.content.Context context, android.graphics.Bitmap bitmap, android.view.View view) {
        super(0);
        this.f96553d = context;
        this.f96554e = bitmap;
        this.f96555f = view;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        this.f96555f.setBackground(new android.graphics.drawable.BitmapDrawable(this.f96553d.getResources(), this.f96554e));
        return jz5.f0.f384359a;
    }
}
