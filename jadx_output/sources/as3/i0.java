package as3;

/* loaded from: classes10.dex */
public final class i0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.tab.view.ProfileLiveNotifyTextLayout f13516d;

    public i0(com.tencent.mm.plugin.profile.ui.tab.view.ProfileLiveNotifyTextLayout profileLiveNotifyTextLayout) {
        this.f13516d = profileLiveNotifyTextLayout;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/profile/ui/tab/view/ProfileLiveNotifyTextLayout$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.profile.ui.tab.view.ProfileLiveNotifyTextLayout profileLiveNotifyTextLayout = this.f13516d;
        yz5.l onClickExpandBtn = profileLiveNotifyTextLayout.getOnClickExpandBtn();
        if (onClickExpandBtn != null) {
            kotlin.jvm.internal.o.e(view, "null cannot be cast to non-null type android.widget.TextView");
            onClickExpandBtn.invoke((android.widget.TextView) view);
        }
        profileLiveNotifyTextLayout.b(profileLiveNotifyTextLayout.f154668e, profileLiveNotifyTextLayout.f154670g, profileLiveNotifyTextLayout.f154672i);
        com.tencent.mm.plugin.profile.ui.tab.view.ProfileLiveNotifyTextLayout.a(profileLiveNotifyTextLayout, profileLiveNotifyTextLayout.f154671h);
        com.tencent.mm.plugin.profile.ui.tab.view.ProfileLiveNotifyTextLayout.a(profileLiveNotifyTextLayout, profileLiveNotifyTextLayout.f154672i);
        yj0.a.h(this, "com/tencent/mm/plugin/profile/ui/tab/view/ProfileLiveNotifyTextLayout$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
