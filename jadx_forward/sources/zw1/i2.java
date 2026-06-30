package zw1;

/* loaded from: classes15.dex */
public class i2 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f558193a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.LinkedList f558194b = new java.util.LinkedList();

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.ui.ActivityC13144xce1cfbb7 f558195c;

    public i2(com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.ui.ActivityC13144xce1cfbb7 activityC13144xce1cfbb7, zw1.c1 c1Var) {
        this.f558195c = activityC13144xce1cfbb7;
    }

    public void a() {
        boolean z17 = this.f558193a;
        java.util.LinkedList linkedList = this.f558194b;
        if (z17) {
            linkedList.size();
            return;
        }
        if (linkedList.isEmpty()) {
            return;
        }
        zw1.f2 f2Var = (zw1.f2) linkedList.poll();
        this.f558193a = true;
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.ui.ActivityC13144xce1cfbb7.f177918e2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.ui.ActivityC13144xce1cfbb7 activityC13144xce1cfbb7 = this.f558195c;
        activityC13144xce1cfbb7.n7();
        activityC13144xce1cfbb7.C.setLayoutParams(new android.widget.LinearLayout.LayoutParams(activityC13144xce1cfbb7.f177946y.getWidth(), activityC13144xce1cfbb7.f177946y.getHeight() + i65.a.b(activityC13144xce1cfbb7.mo55332x76847179(), 8)));
        android.widget.TextView textView = activityC13144xce1cfbb7.E;
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = activityC13144xce1cfbb7.mo55332x76847179();
        java.lang.String str = f2Var.f531735n;
        float textSize = activityC13144xce1cfbb7.E.getTextSize();
        ((ke0.e) xVar).getClass();
        textView.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(mo55332x76847179, str, textSize));
        ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.z) i95.n0.c(kv.z.class))).Ai(activityC13144xce1cfbb7.D, f2Var.f531728d, null);
        activityC13144xce1cfbb7.F.setText(com.p314xaae8f345.mm.p2802xd031a825.ui.r1.n(f2Var.f531730f, f2Var.f531731g));
        android.view.View view = activityC13144xce1cfbb7.C;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        int i18 = 0;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/collect/ui/CollectMainUI$ToastAnimationHelper", "doAnimation", "(Lcom/tencent/mm/plugin/collect/ui/CollectMainUI$PayerMsgWrapper;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/collect/ui/CollectMainUI$ToastAnimationHelper", "doAnimation", "(Lcom/tencent/mm/plugin/collect/ui/CollectMainUI$PayerMsgWrapper;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.animation.AnimationSet animationSet = new android.view.animation.AnimationSet(false);
        animationSet.addAnimation(new android.view.animation.ScaleAnimation(1.0f, 0.0f, 1.0f, 0.0f, 1, 0.5f, 1, 0.5f));
        int i19 = 0;
        while (true) {
            java.util.List list = activityC13144xce1cfbb7.R;
            if (i18 >= ((java.util.LinkedList) list).size()) {
                break;
            }
            if (((zw1.f2) ((java.util.LinkedList) list).get(i18)).f531729e.equals(f2Var.f531729e)) {
                i19 = i18;
            }
            i18++;
        }
        float f17 = com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.ui.ActivityC13144xce1cfbb7.f177919f2;
        float height = (activityC13144xce1cfbb7.f177946y.getHeight() / 2) + 0.0f;
        if (activityC13144xce1cfbb7.f177941v.getVisibility() == 0) {
            height += activityC13144xce1cfbb7.f177941v.getHeight();
        }
        int i27 = com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.ui.ActivityC13144xce1cfbb7.f177920g2;
        float f18 = height + (i19 * i27) + (i27 / 2);
        activityC13144xce1cfbb7.f177946y.getLocationInWindow(new int[2]);
        animationSet.addAnimation(new android.view.animation.TranslateAnimation(0.0f, f17, 0.0f, (int) (f18 + (r4[1] - com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.ui.ActivityC13144xce1cfbb7.f177918e2))));
        animationSet.setDuration(300L);
        animationSet.setInterpolator(new android.view.animation.DecelerateInterpolator());
        animationSet.setAnimationListener(new zw1.g2(this, f2Var));
        android.view.animation.ScaleAnimation scaleAnimation = new android.view.animation.ScaleAnimation(0.0f, 1.0f, 0.0f, 1.0f, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setDuration(300L);
        scaleAnimation.setInterpolator(new android.view.animation.LinearInterpolator());
        scaleAnimation.setAnimationListener(new zw1.h2(this, animationSet));
        activityC13144xce1cfbb7.C.startAnimation(scaleAnimation);
    }
}
