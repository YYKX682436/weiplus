package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4;

/* loaded from: classes4.dex */
public class f0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.i f251311d;

    public f0(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.i iVar) {
        this.f251311d = iVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.lang.String str;
        java.lang.String str2;
        int width;
        int height;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onClick", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$29");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/listener/TimelineClickListener$29", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (view.getTag() instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.i2) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.i2 i2Var = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.i2) view.getTag();
            r45.jj4 jj4Var = (r45.jj4) i2Var.f250082a.f39014x86965dde.f451373h.get(0);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.f2 Fj = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Fj();
            java.lang.String str3 = i2Var.f250083b;
            Fj.b1(str3);
            java.lang.String d17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.f6.d(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Di(), jj4Var.f459388d);
            java.lang.String R = ca4.z0.R(jj4Var);
            if (com.p314xaae8f345.mm.vfs.w6.j(d17 + R)) {
                str = d17 + R;
                str2 = d17 + ca4.z0.U(jj4Var);
            } else {
                str = "";
                str2 = "";
            }
            if (com.p314xaae8f345.mm.vfs.w6.j(d17 + ca4.z0.Y(jj4Var))) {
                str = d17 + ca4.z0.Y(jj4Var);
                str2 = d17 + ca4.z0.a0(jj4Var);
            }
            int[] iArr = new int[2];
            android.view.View findViewById = view.findViewById(com.p314xaae8f345.mm.R.id.chp);
            if (findViewById != null) {
                findViewById.getLocationInWindow(iArr);
                width = findViewById.getWidth();
                height = findViewById.getHeight();
            } else {
                view.getLocationInWindow(iArr);
                width = view.getWidth();
                height = view.getHeight();
            }
            android.content.Intent intent = new android.content.Intent();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.i iVar = this.f251311d;
            intent.setClass(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.i.e(iVar), com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.AccessibilityManagerTouchExplorationStateChangeListenerC18083x5546c9f.class);
            intent.putExtra("intent_videopath", str);
            intent.putExtra("intent_thumbpath", str2);
            intent.putExtra("intent_localid", str3);
            intent.putExtra("intent_isad", false);
            intent.putExtra("intent_from_scene", com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.i.n(iVar));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$2200", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
            int i17 = iVar.f251340j;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$2200", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
            intent.putExtra("intent_sns_scene", i17);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$2300", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
            java.lang.String str4 = iVar.f251341k;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$2300", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
            intent.putExtra("intent_session_id_sns", str4);
            intent.putExtra("img_gallery_left", iArr[0]);
            intent.putExtra("img_gallery_top", iArr[1]);
            intent.putExtra("img_gallery_width", width);
            intent.putExtra("img_gallery_height", height);
            android.app.Activity e17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.i.e(iVar);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(intent);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(e17, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ui/listener/TimelineClickListener$29", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            e17.startActivity((android.content.Intent) arrayList2.get(0));
            yj0.a.f(e17, "com/tencent/mm/plugin/sns/ui/listener/TimelineClickListener$29", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.i.e(iVar).overridePendingTransition(0, 0);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.i.Q(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.i.e(iVar), i2Var.f250082a);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/listener/TimelineClickListener$29", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$29");
    }
}
