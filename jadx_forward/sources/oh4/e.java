package oh4;

/* loaded from: classes3.dex */
public final class e extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ oh4.j f426999d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(oh4.j jVar) {
        super(0);
        this.f426999d = jVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.view.View m151404x74bcf229;
        m151404x74bcf229 = this.f426999d.m151404x74bcf229();
        if (m151404x74bcf229 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(m151404x74bcf229, arrayList.toArray(), "com/tencent/mm/plugin/taskbar/ui/section/music/TaskBarSectionAudioPanelView$hideRedDotArea$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            m151404x74bcf229.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(m151404x74bcf229, "com/tencent/mm/plugin/taskbar/ui/section/music/TaskBarSectionAudioPanelView$hideRedDotArea$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        return jz5.f0.f384359a;
    }
}
