package ys2;

/* loaded from: classes3.dex */
public final class q extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ys2.s f546716d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f546717e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(ys2.s sVar, android.graphics.Bitmap bitmap) {
        super(0);
        this.f546716d = sVar;
        this.f546717e = bitmap;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        ys2.s sVar = this.f546716d;
        sVar.f546722g.setImageBitmap(this.f546717e);
        float width = r2.getWidth() / r2.getHeight();
        android.view.View view = sVar.f546720e;
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        android.view.View view2 = sVar.f546719d;
        if (width > 1.0f) {
            layoutParams.width = (int) view2.getContext().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561203c7);
            layoutParams.height = (int) view2.getContext().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.by);
        } else {
            layoutParams.width = (int) view2.getContext().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.by);
            layoutParams.height = (int) view2.getContext().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561203c7);
        }
        view.setLayoutParams(layoutParams);
        return jz5.f0.f384359a;
    }
}
