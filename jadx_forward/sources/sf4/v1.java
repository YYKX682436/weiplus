package sf4;

/* loaded from: classes4.dex */
public final class v1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.p2242xf44c7752.C18499x2fc2446b f489135d;

    public v1(com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.p2242xf44c7752.C18499x2fc2446b c18499x2fc2446b) {
        this.f489135d = c18499x2fc2446b;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.p2242xf44c7752.C18499x2fc2446b.f253643a2;
        com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.p2242xf44c7752.C18499x2fc2446b c18499x2fc2446b = this.f489135d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c18499x2fc2446b.f271272e, "onTextureUpdate");
        if (c18499x2fc2446b.f271281q == null) {
            return;
        }
        c18499x2fc2446b.D();
        java.lang.Object obj = c18499x2fc2446b.f271281q;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type android.view.View");
        android.view.View view = (android.view.View) obj;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Float.valueOf(1.0f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/story/ui/view/gallery/StoryVideoView$playLocalVideo$1$onPrepared$1$1", "run", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/plugin/story/ui/view/gallery/StoryVideoView$playLocalVideo$1$onPrepared$1$1", "run", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
    }
}
