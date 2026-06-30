package bd4;

/* loaded from: classes4.dex */
public final class o0 implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2197x373aa5.C18270xf7becf64 f100907d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ xc4.p f100908e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f100909f;

    public o0(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2197x373aa5.C18270xf7becf64 c18270xf7becf64, xc4.p pVar, int i17) {
        this.f100907d = c18270xf7becf64;
        this.f100908e = pVar;
        this.f100909f = i17;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onLongClick", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveInteractionLayout$setupSingleCommentLayout$2");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/improve/view/ImproveInteractionLayout$setupSingleCommentLayout$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        yz5.p m71013x7b64617 = this.f100907d.m71013x7b64617();
        if (m71013x7b64617 != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view);
            java.lang.Object obj = this.f100908e.m175342x57341267().get(this.f100909f);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
            m71013x7b64617.mo149xb9724478(view, obj);
        }
        yj0.a.i(true, this, "com/tencent/mm/plugin/sns/ui/improve/view/ImproveInteractionLayout$setupSingleCommentLayout$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onLongClick", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveInteractionLayout$setupSingleCommentLayout$2");
        return true;
    }
}
