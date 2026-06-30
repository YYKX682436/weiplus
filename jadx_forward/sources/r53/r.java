package r53;

/* loaded from: classes8.dex */
public class r implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f474220d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r53.s f474221e;

    public r(r53.s sVar, android.graphics.Bitmap bitmap) {
        this.f474221e = sVar;
        this.f474220d = bitmap;
    }

    @Override // java.lang.Runnable
    public void run() {
        r53.s sVar = this.f474221e;
        sVar.f474222a.setImageBitmap(this.f474220d);
        android.view.ViewGroup.LayoutParams layoutParams = sVar.f474222a.getLayoutParams();
        int i17 = sVar.f474225d;
        layoutParams.width = i17;
        layoutParams.height = (int) ((sVar.f474223b / sVar.f474224c) * i17);
        sVar.f474222a.setLayoutParams(layoutParams);
        sVar.f474222a.setScaleType(android.widget.ImageView.ScaleType.FIT_XY);
    }
}
