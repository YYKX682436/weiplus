package com.tencent.mm.plugin.fav.ui;

/* loaded from: classes12.dex */
public class r0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.FavChatVoiceView f101364d;

    public r0(com.tencent.mm.plugin.fav.ui.FavChatVoiceView favChatVoiceView) {
        this.f101364d = favChatVoiceView;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/fav/ui/FavChatVoiceView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.Object[] objArr = new java.lang.Object[3];
        com.tencent.mm.plugin.fav.ui.FavChatVoiceView favChatVoiceView = this.f101364d;
        objArr[0] = favChatVoiceView.f100303h;
        objArr[1] = favChatVoiceView.f100305m.b() ? "true" : "false";
        objArr[2] = favChatVoiceView.f100305m.f343448e;
        com.tencent.mars.xlog.Log.i("MicroMsg.FavChatVoiceView", "clicked path:%s, player isPlay:%s, path:%s", objArr);
        if (iq.b.C(favChatVoiceView.f100302g) || iq.b.v(favChatVoiceView.f100302g) || iq.b.e(favChatVoiceView.f100302g)) {
            yj0.a.h(this, "com/tencent/mm/plugin/fav/ui/FavChatVoiceView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        if (!fp.i.b() && !com.tencent.mm.sdk.platformtools.t8.K0(favChatVoiceView.f100303h)) {
            db5.t7.k(view.getContext(), null);
            yj0.a.h(this, "com/tencent/mm/plugin/fav/ui/FavChatVoiceView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        java.lang.String str = favChatVoiceView.f100303h;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str == null) {
            str = "";
        }
        if (!str.equals(favChatVoiceView.f100305m.f343448e)) {
            com.tencent.mm.plugin.fav.ui.FavChatVoiceView.b(favChatVoiceView);
        } else if (favChatVoiceView.f100305m.b()) {
            favChatVoiceView.d();
        } else {
            com.tencent.mm.plugin.fav.ui.FavChatVoiceView.b(favChatVoiceView);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/fav/ui/FavChatVoiceView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
