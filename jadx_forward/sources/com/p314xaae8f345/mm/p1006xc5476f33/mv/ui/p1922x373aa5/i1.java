package com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5;

/* loaded from: classes5.dex */
public final class i1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.C16688x2f31b8ec f233403d;

    public i1(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.C16688x2f31b8ec c16688x2f31b8ec) {
        this.f233403d = c16688x2f31b8ec;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/mv/ui/view/MusicMvCommentFooter$initEmojiBtn$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("commentModeIv clicked, curEditMode:");
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.C16688x2f31b8ec c16688x2f31b8ec = this.f233403d;
        sb6.append(c16688x2f31b8ec.f233183g);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Music.MusicMvCommentFooter", sb6.toString());
        int i17 = 202;
        if (c16688x2f31b8ec.f233183g == 202) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Music.MusicMvCommentFooter", "onlyShowVKB");
            i17 = 201;
            c16688x2f31b8ec.f233184h = 201;
            android.content.Context context = c16688x2f31b8ec.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            ((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context).mo26063x7b383410();
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Music.MusicMvCommentFooter", "onlyShowSmilePanel");
            c16688x2f31b8ec.f233184h = 202;
            android.content.Context context2 = c16688x2f31b8ec.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context2, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            ((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context2).mo48674x36654fab();
        }
        c16688x2f31b8ec.f233183g = i17;
        yj0.a.h(this, "com/tencent/mm/plugin/mv/ui/view/MusicMvCommentFooter$initEmojiBtn$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
