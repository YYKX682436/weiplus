package fk1;

/* loaded from: classes8.dex */
public final class a implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1210xc8466c51.ActivityC12732x6baffca6 f344797d;

    public a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1210xc8466c51.ActivityC12732x6baffca6 activityC12732x6baffca6) {
        this.f344797d = activityC12732x6baffca6;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/ui/record/WAGameRecordShareUI$layoutButton$1$1$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1210xc8466c51.ActivityC12732x6baffca6 activityC12732x6baffca6 = this.f344797d;
        java.lang.String str = activityC12732x6baffca6.f171716f.f404836a;
        java.lang.String format = java.lang.String.format("https://game.weixin.qq.com/cgi-bin/h5/static/gamelife/localvideo.html?wechat_pkgid=gamelife_localvideo&wechat_immersive=1&immersivePageBgIsDark=1&tab_type=1&sub_tab_type=1&ssid=30&s_uia=1004&s_pid=2&s_cid=%s&game_tab_key=%s", java.util.Arrays.copyOf(new java.lang.Object[]{str, str}, 2));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1210xc8466c51.ActivityC12732x6baffca6.T6(activityC12732x6baffca6, format);
        yj0.a.h(this, "com/tencent/mm/plugin/appbrand/ui/record/WAGameRecordShareUI$layoutButton$1$1$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
