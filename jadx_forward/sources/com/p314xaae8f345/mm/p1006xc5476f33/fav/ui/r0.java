package com.p314xaae8f345.mm.p1006xc5476f33.fav.ui;

/* loaded from: classes12.dex */
public class r0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.C13562xb95b8344 f182897d;

    public r0(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.C13562xb95b8344 c13562xb95b8344) {
        this.f182897d = c13562xb95b8344;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/fav/ui/FavChatVoiceView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.Object[] objArr = new java.lang.Object[3];
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.C13562xb95b8344 c13562xb95b8344 = this.f182897d;
        objArr[0] = c13562xb95b8344.f181836h;
        objArr[1] = c13562xb95b8344.f181838m.b() ? "true" : "false";
        objArr[2] = c13562xb95b8344.f181838m.f424981e;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavChatVoiceView", "clicked path:%s, player isPlay:%s, path:%s", objArr);
        if (iq.b.C(c13562xb95b8344.f181835g) || iq.b.v(c13562xb95b8344.f181835g) || iq.b.e(c13562xb95b8344.f181835g)) {
            yj0.a.h(this, "com/tencent/mm/plugin/fav/ui/FavChatVoiceView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        if (!fp.i.b() && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c13562xb95b8344.f181836h)) {
            db5.t7.k(view.getContext(), null);
            yj0.a.h(this, "com/tencent/mm/plugin/fav/ui/FavChatVoiceView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        java.lang.String str = c13562xb95b8344.f181836h;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (str == null) {
            str = "";
        }
        if (!str.equals(c13562xb95b8344.f181838m.f424981e)) {
            com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.C13562xb95b8344.b(c13562xb95b8344);
        } else if (c13562xb95b8344.f181838m.b()) {
            c13562xb95b8344.d();
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.C13562xb95b8344.b(c13562xb95b8344);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/fav/ui/FavChatVoiceView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
