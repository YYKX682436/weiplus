package hd2;

/* loaded from: classes10.dex */
public final class b implements ep0.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.p1465x9da2e250.C14133xabc4217e f361981a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f361982b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.widget.ProgressBar f361983c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f361984d;

    public b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.p1465x9da2e250.C14133xabc4217e c14133xabc4217e, android.view.ViewGroup viewGroup, android.widget.ProgressBar progressBar, android.widget.ImageView imageView) {
        this.f361981a = c14133xabc4217e;
        this.f361982b = viewGroup;
        this.f361983c = progressBar;
        this.f361984d = imageView;
    }

    @Override // ep0.e
    public void a(ip0.a aVar, cp0.n nVar, java.lang.Object obj) {
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("imageLoader: result:");
        sb6.append(bitmap != null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderCommentShareDialogFragment", sb6.toString());
        boolean z17 = bitmap != null;
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.p1465x9da2e250.C14133xabc4217e.f191567n;
        this.f361981a.getClass();
        pm0.v.X(new hd2.a(z17, this.f361982b, this.f361984d, this.f361983c));
    }
}
