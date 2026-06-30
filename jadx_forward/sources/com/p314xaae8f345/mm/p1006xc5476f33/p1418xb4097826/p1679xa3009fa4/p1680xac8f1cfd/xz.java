package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes2.dex */
public final class xz extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f218037d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.lz f218038e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f218039f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.h00 f218040g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xz(android.content.Intent intent, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.lz lzVar, java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.h00 h00Var) {
        super(0);
        this.f218037d = intent;
        this.f218038e = lzVar;
        this.f218039f = str;
        this.f218040g = h00Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.lz lzVar = this.f218038e;
        java.lang.Long l17 = lzVar.f216634e;
        android.content.Intent intent = this.f218037d;
        intent.putExtra("feed_object_id", l17);
        intent.putExtra("key_comment_scene", 385);
        intent.putExtra("key_reuqest_scene", 61);
        intent.putExtra("TARGET_FINDER_USERNAME_INTENT_KEY", lzVar.f216633d);
        intent.putExtra("key_from_session_id", this.f218039f);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.h00 h00Var = this.f218040g;
        intent.setClass(h00Var.m80379x76847179(), com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15076x7a6c76b6.class);
        android.app.Activity m80379x76847179 = h00Var.m80379x76847179();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(m80379x76847179, arrayList.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfOftenReadAuthorUIC$onItemClicked$jumpRelUI$1", "invoke", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        m80379x76847179.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(m80379x76847179, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfOftenReadAuthorUIC$onItemClicked$jumpRelUI$1", "invoke", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        return jz5.f0.f384359a;
    }
}
