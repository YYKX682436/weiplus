package qn2;

/* loaded from: classes3.dex */
public final class e1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f446590d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qn2.l1 f446591e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.gz1 f446592f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(android.graphics.Bitmap bitmap, qn2.l1 l1Var, r45.gz1 gz1Var) {
        super(0);
        this.f446590d = bitmap;
        this.f446591e = l1Var;
        this.f446592f = gz1Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        qn2.l1 l1Var = this.f446591e;
        android.graphics.Bitmap bitmap = this.f446590d;
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
                yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/lottery/card/VisitorLotteryCardRunningWidget$setGameInfoIfNeeded$1$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/lottery/card/VisitorLotteryCardRunningWidget$setGameInfoIfNeeded$1$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        } else {
            java.lang.String str = l1Var.f446628e;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            r45.c53 c53Var = (r45.c53) this.f446592f.m75936x14adae67(3);
            sb6.append(c53Var != null ? c53Var.m75945x2fec8307(0) : null);
            sb6.append(" resource is null");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
        }
        return jz5.f0.f384359a;
    }
}
