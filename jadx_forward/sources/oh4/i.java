package oh4;

/* loaded from: classes3.dex */
public final class i extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f427003d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ oh4.j f427004e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f427005f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(java.lang.String str, oh4.j jVar, java.lang.String str2) {
        super(0);
        this.f427003d = str;
        this.f427004e = jVar;
        this.f427005f = str2;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.view.View m151404x74bcf229;
        android.widget.TextView m151403x194e98bc;
        android.view.View m151404x74bcf2292;
        android.view.View m151404x74bcf2293;
        android.view.View m151404x74bcf2294;
        android.view.View m151404x74bcf2295;
        java.lang.String str = this.f427003d;
        if (!(str == null || r26.n0.N(str))) {
            oh4.j jVar = this.f427004e;
            m151404x74bcf229 = jVar.m151404x74bcf229();
            if (m151404x74bcf229 != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(m151404x74bcf229, arrayList.toArray(), "com/tencent/mm/plugin/taskbar/ui/section/music/TaskBarSectionAudioPanelView$updateRedDotArea$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                m151404x74bcf229.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(m151404x74bcf229, "com/tencent/mm/plugin/taskbar/ui/section/music/TaskBarSectionAudioPanelView$updateRedDotArea$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            m151403x194e98bc = jVar.m151403x194e98bc();
            if (m151403x194e98bc != null) {
                m151403x194e98bc.setText(str);
            }
            m151404x74bcf2292 = jVar.m151404x74bcf229();
            m151404x74bcf2292.setOnClickListener(new oh4.h(jVar));
            dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
            m151404x74bcf2293 = jVar.m151404x74bcf229();
            cy1.a aVar = (cy1.a) rVar;
            aVar.pk(m151404x74bcf2293, "tyt_mid_cont_pul_rd");
            m151404x74bcf2294 = jVar.m151404x74bcf229();
            aVar.fk(m151404x74bcf2294, "sessionuffer", this.f427005f);
            m151404x74bcf2295 = jVar.m151404x74bcf229();
            aVar.Tj(m151404x74bcf2295, 40, 5, true);
        }
        return jz5.f0.f384359a;
    }
}
