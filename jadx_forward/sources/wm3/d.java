package wm3;

/* loaded from: classes3.dex */
public final class d extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wm3.j f528796d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 f528797e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(wm3.j jVar, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112) {
        super(0);
        this.f528796d = jVar;
        this.f528797e = activityC0065xcd7aa112;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        wm3.j jVar = this.f528796d;
        java.util.Iterator it = ((java.util.List) ((jz5.n) jVar.f528810m).mo141623x754a37bb()).iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb c21560x1fce98fb = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb) ((java.lang.ref.WeakReference) it.next()).get();
            if (c21560x1fce98fb != null) {
                android.view.View p17 = c21560x1fce98fb.p(null, null);
                p17.setTag(c21560x1fce98fb.f279313q);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(p17, arrayList.toArray(), "com/tencent/mm/plugin/mvvmbase/uic/FloatPreferenceUIC$makeSureFloatViewExist$2", "invoke", "()Ljava/lang/Void;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                p17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(p17, "com/tencent/mm/plugin/mvvmbase/uic/FloatPreferenceUIC$makeSureFloatViewExist$2", "invoke", "()Ljava/lang/Void;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                p17.setOnClickListener(new wm3.c(this.f528797e, c21560x1fce98fb));
                jVar.T6().addView(p17);
            }
        }
        return null;
    }
}
