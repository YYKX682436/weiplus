package bd4;

/* loaded from: classes4.dex */
public final class n0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2197x373aa5.C18270xf7becf64 f100902d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ xc4.p f100903e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f100904f;

    public n0(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2197x373aa5.C18270xf7becf64 c18270xf7becf64, xc4.p pVar, int i17) {
        this.f100902d = c18270xf7becf64;
        this.f100903e = pVar;
        this.f100904f = i17;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onClick", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveInteractionLayout$setupSingleCommentLayout$1");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/improve/view/ImproveInteractionLayout$setupSingleCommentLayout$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        yz5.p m71012xee2876b3 = this.f100902d.m71012xee2876b3();
        if (m71012xee2876b3 != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view);
            java.lang.Object obj = this.f100903e.m175342x57341267().get(this.f100904f);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
            m71012xee2876b3.mo149xb9724478(view, obj);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/improve/view/ImproveInteractionLayout$setupSingleCommentLayout$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveInteractionLayout$setupSingleCommentLayout$1");
    }
}
