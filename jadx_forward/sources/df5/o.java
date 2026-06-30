package df5;

/* loaded from: classes11.dex */
public final class o extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df5.t f313715d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(df5.t tVar) {
        super(1);
        this.f313715d = tVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.util.List<android.view.View> views = (java.util.List) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(views, "views");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MarkdownStreamAnimController", "[STREAM_ANIM] onShowViews: count=%d", java.lang.Integer.valueOf(views.size()));
        df5.t tVar = this.f313715d;
        tVar.getClass();
        int size = views.size();
        ua5.f fVar = tVar.f313741a;
        if (size == 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MarkdownStreamAnimController", "[STREAM_ANIM] fadeInView: type=%s", p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(views.get(0).getClass()).g());
            fVar.a((android.view.View) views.get(0));
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MarkdownStreamAnimController", "[STREAM_ANIM] scheduleFadeInSequence: count=%d", java.lang.Integer.valueOf(views.size()));
            fVar.getClass();
            if (!views.isEmpty()) {
                long j17 = 0;
                for (android.view.View view : views) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                    arrayList.add(java.lang.Float.valueOf(0.0f));
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/anim/stream/StreamFadeAnimator", "scheduleFadeInSequence", "(Ljava/util/List;J)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
                    yj0.a.f(view, "com/tencent/mm/ui/anim/stream/StreamFadeAnimator", "scheduleFadeInSequence", "(Ljava/util/List;J)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    ua5.e eVar = new ua5.e(fVar, view);
                    fVar.f507519a.postDelayed(eVar, j17);
                    ((java.util.ArrayList) fVar.f507520b).add(eVar);
                    j17 += 500;
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
