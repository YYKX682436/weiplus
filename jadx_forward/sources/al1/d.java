package al1;

/* loaded from: classes7.dex */
public class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f87295d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View.OnClickListener f87296e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ al1.b f87297f;

    public d(al1.b bVar, android.graphics.Bitmap bitmap, android.view.View.OnClickListener onClickListener) {
        this.f87297f = bVar;
        this.f87295d = bitmap;
        this.f87296e = onClickListener;
    }

    @Override // java.lang.Runnable
    public void run() {
        al1.b bVar = this.f87297f;
        if (bVar.getParent() == null) {
            return;
        }
        if (bVar.G == null) {
            android.view.ViewStub viewStub = (android.view.ViewStub) bVar.findViewById(com.p314xaae8f345.mm.R.id.f565541cp1);
            if (viewStub == null) {
                return;
            } else {
                bVar.G = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.C12750x91300698) viewStub.inflate();
            }
        }
        bVar.G.setVisibility(0);
        bVar.G.setImageBitmap(this.f87295d);
        bVar.G.setClickable(true);
        bVar.G.setOnClickListener(this.f87296e);
    }
}
