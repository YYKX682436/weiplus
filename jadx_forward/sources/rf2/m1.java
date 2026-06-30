package rf2;

/* loaded from: classes.dex */
public final class m1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f476352d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rf2.o1 f476353e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f476354f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(android.graphics.Bitmap bitmap, rf2.o1 o1Var, android.widget.ImageView imageView) {
        super(0);
        this.f476352d = bitmap;
        this.f476353e = o1Var;
        this.f476354f = imageView;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        rf2.o1 o1Var = this.f476353e;
        android.graphics.Bitmap bitmap = this.f476352d;
        if (bitmap != null) {
            android.view.View findViewById = o1Var.f476369a.findViewById(com.p314xaae8f345.mm.R.id.df6);
            if (findViewById != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(java.lang.Float.valueOf(0.0f));
                java.util.Collections.reverse(arrayList);
                yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneMainWidget$updateMetaInfo$1$1$1", "invoke", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                findViewById.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
                yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneMainWidget$updateMetaInfo$1$1$1", "invoke", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            }
            this.f476354f.setImageBitmap(bitmap);
        } else {
            android.view.View findViewById2 = o1Var.f476369a.findViewById(com.p314xaae8f345.mm.R.id.df6);
            if (findViewById2 != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                arrayList2.add(java.lang.Float.valueOf(1.0f));
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneMainWidget$updateMetaInfo$1$1$1", "invoke", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                findViewById2.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
                yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneMainWidget$updateMetaInfo$1$1$1", "invoke", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(o1Var.f476371c, "load foreground failed");
        }
        return jz5.f0.f384359a;
    }
}
