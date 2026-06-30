package qs1;

/* loaded from: classes8.dex */
public final class h extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qs1.m f447756d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(qs1.m mVar) {
        super(0);
        this.f447756d = mVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.Object systemService = this.f447756d.f447761a.getSystemService("window");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        android.util.DisplayMetrics displayMetrics = new android.util.DisplayMetrics();
        ((android.view.WindowManager) systemService).getDefaultDisplay().getRealMetrics(displayMetrics);
        return java.lang.Integer.valueOf(java.lang.Math.min(displayMetrics.widthPixels, displayMetrics.heightPixels));
    }
}
