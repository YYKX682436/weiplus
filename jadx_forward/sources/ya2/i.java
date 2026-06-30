package ya2;

/* loaded from: classes4.dex */
public final class i extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f542021d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f542022e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(android.view.View view, android.graphics.Bitmap bitmap) {
        super(0);
        this.f542021d = view;
        this.f542022e = bitmap;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.view.View view = this.f542021d;
        boolean z17 = view instanceof com.p314xaae8f345.mm.ui.p2747xd1075a44.C22638x8e581d4f;
        android.graphics.Bitmap bitmap = this.f542022e;
        if (z17) {
            ((com.p314xaae8f345.mm.ui.p2747xd1075a44.C22638x8e581d4f) view).mo69290xd44890a8(bitmap);
        } else if (view instanceof com.p314xaae8f345.mm.ui.C21405x85fc1ce0) {
            ((com.p314xaae8f345.mm.ui.C21405x85fc1ce0) view).setImageBitmap(bitmap);
        }
        return jz5.f0.f384359a;
    }
}
