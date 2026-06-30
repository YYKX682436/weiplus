package com.p314xaae8f345.mm.ui;

/* loaded from: classes11.dex */
public class ef implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.C21424xdbf688d7 f289932d;

    public ef(com.p314xaae8f345.mm.ui.C21424xdbf688d7 c21424xdbf688d7) {
        this.f289932d = c21424xdbf688d7;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/MultiTalkRoomPopupNav$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        q21.a a17 = q21.d.a();
        com.p314xaae8f345.mm.ui.C21424xdbf688d7 c21424xdbf688d7 = this.f289932d;
        if (a17 != null && ((com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.y) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.y.class)).s4(c21424xdbf688d7.getContext())) {
            yj0.a.h(this, "com/tencent/mm/ui/MultiTalkRoomPopupNav$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        if (q21.d.a() == null || !((va3.z0) q21.d.a()).e()) {
            c21424xdbf688d7.a();
            yj0.a.h(this, "com/tencent/mm/ui/MultiTalkRoomPopupNav$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        } else {
            android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            dp.a.m125854x26a183b(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573851g13), 0).show();
            yj0.a.h(this, "com/tencent/mm/ui/MultiTalkRoomPopupNav$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }
}
