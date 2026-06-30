package al1;

/* loaded from: classes7.dex */
public class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f5762d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View.OnClickListener f5763e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ al1.b f5764f;

    public d(al1.b bVar, android.graphics.Bitmap bitmap, android.view.View.OnClickListener onClickListener) {
        this.f5764f = bVar;
        this.f5762d = bitmap;
        this.f5763e = onClickListener;
    }

    @Override // java.lang.Runnable
    public void run() {
        al1.b bVar = this.f5764f;
        if (bVar.getParent() == null) {
            return;
        }
        if (bVar.G == null) {
            android.view.ViewStub viewStub = (android.view.ViewStub) bVar.findViewById(com.tencent.mm.R.id.f484008cp1);
            if (viewStub == null) {
                return;
            } else {
                bVar.G = (com.tencent.mm.plugin.appbrand.widget.AppBrandActionBarCustomImageView) viewStub.inflate();
            }
        }
        bVar.G.setVisibility(0);
        bVar.G.setImageBitmap(this.f5762d);
        bVar.G.setClickable(true);
        bVar.G.setOnClickListener(this.f5763e);
    }
}
