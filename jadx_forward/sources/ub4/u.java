package ub4;

/* loaded from: classes4.dex */
public class u implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2182x5897e6f.C18155xbfbac8cb f507732d;

    public u(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2182x5897e6f.C18155xbfbac8cb c18155xbfbac8cb) {
        this.f507732d = c18155xbfbac8cb;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onClick", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumUI$4");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/album/SnsAlbumUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2182x5897e6f.C18155xbfbac8cb c18155xbfbac8cb = this.f507732d;
        android.content.Intent intent = new android.content.Intent(c18155xbfbac8cb.mo7430x19263085(), (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18141xfedff17.class);
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2182x5897e6f.C18155xbfbac8cb.f249293t;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$200", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumUI");
        java.lang.String str = c18155xbfbac8cb.f249298h;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$200", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumUI");
        intent.putExtra("INTENT_ALBUM_COMMENT_SESSION_ID", str);
        intent.putExtra("sns_rpt_scene", 21);
        intent.putExtra("sns_userName", com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2182x5897e6f.C18155xbfbac8cb.l0(c18155xbfbac8cb));
        p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f mo7430x19263085 = c18155xbfbac8cb.mo7430x19263085();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(intent);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(mo7430x19263085, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ui/album/SnsAlbumUI$4", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        mo7430x19263085.startActivity((android.content.Intent) arrayList2.get(0));
        yj0.a.f(mo7430x19263085, "com/tencent/mm/plugin/sns/ui/album/SnsAlbumUI$4", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/album/SnsAlbumUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumUI$4");
    }
}
