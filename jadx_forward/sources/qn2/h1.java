package qn2;

/* loaded from: classes3.dex */
public final class h1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f446606d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qn2.l1 f446607e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.yd4 f446608f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(android.graphics.Bitmap bitmap, qn2.l1 l1Var, r45.yd4 yd4Var) {
        super(0);
        this.f446606d = bitmap;
        this.f446607e = l1Var;
        this.f446608f = yd4Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        qn2.l1 l1Var = this.f446607e;
        android.graphics.Bitmap bitmap = this.f446606d;
        if (bitmap != null) {
            android.widget.ImageView imageView = l1Var.f446643t;
            if (imageView != null) {
                imageView.setImageBitmap(bitmap);
            }
            android.view.View findViewById = l1Var.f446625b.findViewById(com.p314xaae8f345.mm.R.id.l76);
            if (findViewById != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/lottery/card/VisitorLotteryCardRunningWidget$setProductInfoIfNeeded$1$2$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/lottery/card/VisitorLotteryCardRunningWidget$setProductInfoIfNeeded$1$2$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(l1Var.f446628e, this.f446608f.m75945x2fec8307(1) + " resource is null");
        }
        return jz5.f0.f384359a;
    }
}
