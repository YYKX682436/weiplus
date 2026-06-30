package df2;

/* loaded from: classes.dex */
public final class in extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f311947d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ df2.ln f311948e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f311949f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public in(android.graphics.Bitmap bitmap, df2.ln lnVar, android.widget.ImageView imageView) {
        super(0);
        this.f311947d = bitmap;
        this.f311948e = lnVar;
        this.f311949f = imageView;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.view.View findViewById;
        df2.ln lnVar = this.f311948e;
        android.graphics.Bitmap bitmap = this.f311947d;
        if (bitmap != null) {
            android.view.View view = lnVar.f312210n;
            findViewById = view != null ? view.findViewById(com.p314xaae8f345.mm.R.id.r29) : null;
            if (findViewById != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(java.lang.Float.valueOf(0.0f));
                java.util.Collections.reverse(arrayList);
                android.view.View view2 = findViewById;
                yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/controller/LiveMileStoneLotteryResultController$showLotteryResult$3$1$1", "invoke", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                findViewById.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/controller/LiveMileStoneLotteryResultController$showLotteryResult$3$1$1", "invoke", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            }
            this.f311949f.setImageBitmap(bitmap);
        } else {
            android.view.View view3 = lnVar.f312210n;
            findViewById = view3 != null ? view3.findViewById(com.p314xaae8f345.mm.R.id.r29) : null;
            if (findViewById != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                arrayList2.add(java.lang.Float.valueOf(1.0f));
                java.util.Collections.reverse(arrayList2);
                android.view.View view4 = findViewById;
                yj0.a.d(view4, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/controller/LiveMileStoneLotteryResultController$showLotteryResult$3$1$1", "invoke", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                findViewById.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
                yj0.a.f(view4, "com/tencent/mm/plugin/finder/live/controller/LiveMileStoneLotteryResultController$showLotteryResult$3$1$1", "invoke", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(lnVar.f312209m, "load foreground failed");
        }
        return jz5.f0.f384359a;
    }
}
