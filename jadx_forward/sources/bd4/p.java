package bd4;

/* loaded from: classes4.dex */
public final class p implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2197x373aa5.C18267x4e51b446 f100911d;

    public p(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2197x373aa5.C18267x4e51b446 c18267x4e51b446) {
        this.f100911d = c18267x4e51b446;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onLongClick", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView$inflateXml$1");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/improve/view/ImproveContentView$inflateXml$1", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        this.f100911d.m71001xe7297625().performLongClick();
        yj0.a.i(false, this, "com/tencent/mm/plugin/sns/ui/improve/view/ImproveContentView$inflateXml$1", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onLongClick", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView$inflateXml$1");
        return false;
    }
}
