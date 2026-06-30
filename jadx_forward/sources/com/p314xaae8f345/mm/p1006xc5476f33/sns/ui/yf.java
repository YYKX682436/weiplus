package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* loaded from: classes4.dex */
public class yf implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18037xf8026662 f253163d;

    public yf(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18037xf8026662 c18037xf8026662) {
        this.f253163d = c18037xf8026662;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onClick", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter$6");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/SnsCommentFooter$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("SnsAdAtFriendRedDot", 0) == 1) {
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.NEW_BANDAGE_SNS_AD_COMMENT_AT_RED_DOT_BOOLEAN_SYNC, java.lang.Boolean.FALSE);
        }
        java.lang.String str = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18037xf8026662.I1;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$1200", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18037xf8026662 c18037xf8026662 = this.f253163d;
        android.widget.ImageView imageView = c18037xf8026662.f248629o;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$1200", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        imageView.setVisibility(8);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("list_attr", 16391);
        intent.putExtra("block_contact", c01.z1.r());
        intent.putExtra("max_limit_num", 1);
        intent.putExtra("titile", com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18037xf8026662.i(c18037xf8026662).getString(com.p314xaae8f345.mm.R.C30867xcad56011.j6l));
        j45.l.v(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18037xf8026662.i(c18037xf8026662), ".ui.contact.SelectContactUI", intent, 2333);
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/SnsCommentFooter$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter$6");
    }
}
