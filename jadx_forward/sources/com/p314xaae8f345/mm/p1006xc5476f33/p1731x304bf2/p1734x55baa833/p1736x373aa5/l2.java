package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5;

/* loaded from: classes5.dex */
public class l2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.C15854x49003e70 f220750d;

    public l2(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.C15854x49003e70 c15854x49003e70) {
        this.f220750d = c15854x49003e70;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/game/chatroom/view/GameChatCommentFooter$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("state onClick:");
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.C15854x49003e70 c15854x49003e70 = this.f220750d;
        sb6.append(c15854x49003e70.f220484u);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("GameChatRoom.GameChatCommentFooter", sb6.toString());
        int i17 = c15854x49003e70.f220484u;
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = c15854x49003e70.f220473g;
        if (i17 == 0) {
            c15854x49003e70.f220477n.requestFocus();
            c15854x49003e70.f220489z = false;
            abstractActivityC21394xb3d2c0cf.mo48674x36654fab();
            c15854x49003e70.f220484u = 1;
            boolean z17 = c15854x49003e70.f220481r;
            c15854x49003e70.f220482s.i();
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.d2.j(c15854x49003e70.getContext())) {
                int j17 = com.p314xaae8f345.mm.ui.bk.j(c15854x49003e70.getContext());
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("GameChatRoom.GameChatCommentFooter", "is show key board %d, %d, %d", java.lang.Integer.valueOf(c15854x49003e70.f220486w), java.lang.Integer.valueOf(c15854x49003e70.f220485v), java.lang.Integer.valueOf(j17));
                int i18 = c15854x49003e70.f220486w;
                if (i18 > 0 && i18 < c15854x49003e70.f220485v - j17) {
                    c15854x49003e70.m81273xb2a7481e().e(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.h2(c15854x49003e70, z17));
                    android.widget.ImageView imageView = c15854x49003e70.f220479p;
                    android.graphics.drawable.Drawable drawable = c15854x49003e70.getResources().getDrawable(com.p314xaae8f345.mm.R.raw.f79772xf1451aff);
                    com.p314xaae8f345.mm.ui.uk.f(drawable, -1);
                    imageView.setImageDrawable(drawable);
                }
            }
            if (z17) {
                c15854x49003e70.o();
            } else {
                c15854x49003e70.f220482s.setVisibility(0);
            }
            android.widget.ImageView imageView2 = c15854x49003e70.f220479p;
            android.graphics.drawable.Drawable drawable2 = c15854x49003e70.getResources().getDrawable(com.p314xaae8f345.mm.R.raw.f79772xf1451aff);
            com.p314xaae8f345.mm.ui.uk.f(drawable2, -1);
            imageView2.setImageDrawable(drawable2);
        } else {
            c15854x49003e70.l(false);
            c15854x49003e70.f220477n.requestFocus();
            c15854x49003e70.f220489z = true;
            abstractActivityC21394xb3d2c0cf.mo26063x7b383410();
            c15854x49003e70.f220484u = 0;
            android.widget.ImageView imageView3 = c15854x49003e70.f220479p;
            android.graphics.drawable.Drawable drawable3 = c15854x49003e70.getResources().getDrawable(com.p314xaae8f345.mm.R.raw.f79915x64991f25);
            com.p314xaae8f345.mm.ui.uk.f(drawable3, -1);
            imageView3.setImageDrawable(drawable3);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/game/chatroom/view/GameChatCommentFooter$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
