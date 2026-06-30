package q50;

/* loaded from: classes.dex */
public final class f implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.a f441675d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f441676e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c f441677f;

    public f(yz5.a aVar, java.lang.String str, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c activityC0053x3d3f670c) {
        this.f441675d = aVar;
        this.f441676e = str;
        this.f441677f = activityC0053x3d3f670c;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        j75.f m67437x4bd5310;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/feature/forward/ui/ForwardPreviewConversationConvert$onBindViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f441675d.mo152xb9724478();
        com.p314xaae8f345.mm.ui.p2724x335620.uic.p2727x2c1ddc83.p2728xc846465b.e.f290827a.o(this.f441676e, 1);
        p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c activityC0053x3d3f670c = this.f441677f;
        com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0 abstractActivityC16711x120e7ae0 = activityC0053x3d3f670c instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0) activityC0053x3d3f670c : null;
        if (abstractActivityC16711x120e7ae0 != null && (m67437x4bd5310 = abstractActivityC16711x120e7ae0.m67437x4bd5310()) != null) {
            m67437x4bd5310.B3(new wg5.c(true));
        }
        yj0.a.h(this, "com/tencent/mm/feature/forward/ui/ForwardPreviewConversationConvert$onBindViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
