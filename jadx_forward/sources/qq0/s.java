package qq0;

/* loaded from: classes7.dex */
public final class s implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qq0.u f447443d;

    public s(qq0.u uVar) {
        this.f447443d = uVar;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        hq0.e0 e0Var;
        java.lang.String str;
        java.lang.String str2;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/magicbrush/plugin/scl/startup/cover/MagicSclViewCoverLogic$setStartupCoverVisible$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        qq0.u uVar = this.f447443d;
        if (!uVar.f447454j) {
            uVar.f447454j = true;
            mq0.e0 e0Var2 = (mq0.e0) i95.n0.c(mq0.e0.class);
            fq0.x frameSet = uVar.f447446b.getFrameSet();
            java.lang.String str3 = (frameSet == null || (str2 = frameSet.f347011b) == null) ? "" : str2;
            java.lang.String str4 = uVar.f447445a;
            fq0.x frameSet2 = uVar.f447446b.getFrameSet();
            ((mq0.v0) e0Var2).wi("clickCover", "", str3, str4, (frameSet2 == null || (e0Var = frameSet2.f347012c) == null || (str = e0Var.f364515c) == null) ? "" : str, uVar.f447447c, new java.lang.String[0]);
        }
        java.util.List list = uVar.f447457m;
        android.view.MotionEvent obtain = android.view.MotionEvent.obtain(motionEvent);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obtain, "obtain(...)");
        boolean add = ((java.util.ArrayList) list).add(obtain);
        yj0.a.i(add, this, "com/tencent/mm/magicbrush/plugin/scl/startup/cover/MagicSclViewCoverLogic$setStartupCoverVisible$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return add;
    }
}
