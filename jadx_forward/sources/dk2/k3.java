package dk2;

/* loaded from: classes.dex */
public final class k3 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dk2.r4 f315212d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k3(dk2.r4 r4Var) {
        super(0);
        this.f315212d = r4Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        dk2.r4 r4Var = this.f315212d;
        java.util.Iterator it = r4Var.f315544f.iterator();
        while (it.hasNext()) {
            jz5.l lVar = (jz5.l) it.next();
            android.view.View view = (android.view.View) lVar.f384366d;
            int intValue = ((java.lang.Number) lVar.f384367e).intValue();
            if (view != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(java.lang.Integer.valueOf(intValue));
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/model/FinderLiveAssistant$resumeViewVisibility$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/finder/live/model/FinderLiveAssistant$resumeViewVisibility$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r4Var.f315542d, "resume view:" + view.getClass().getSimpleName() + " visibility:" + intValue);
        }
        r4Var.f315544f.clear();
        return jz5.f0.f384359a;
    }
}
