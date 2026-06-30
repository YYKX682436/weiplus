package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2060xf8bc3f31.p2062x5582bc23.p2071xc2079749.p2073xdca81dbe;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/setting/ui/setting_new/settings/notify/scene_notification/SettingSceneTips;", "Ls24/b;", "Landroidx/appcompat/app/AppCompatActivity;", com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.C26617x73f7249d.f55566xbe5e9100, "<init>", "(Landroidx/appcompat/app/AppCompatActivity;)V", "plugin-setting_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.setting.ui.setting_new.settings.notify.scene_notification.SettingSceneTips */
/* loaded from: classes.dex */
public final class C17595x4bee2994 extends s24.b {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17595x4bee2994(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
    }

    @Override // a24.i
    public java.lang.String a7() {
        return "SettingGroup_Main_Notify_Scene_Notification_SceneTips";
    }

    @Override // a24.i
    public a24.u b7() {
        return new a24.u(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2060xf8bc3f31.p2062x5582bc23.p2071xc2079749.C17588x7870645b.class, com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2060xf8bc3f31.p2062x5582bc23.p2071xc2079749.p2073xdca81dbe.C17596x18c76a7e.class);
    }

    @Override // s24.b, a24.i
    /* renamed from: clone */
    public java.lang.Object mo446x5a5dd5d() {
        return super.mo446x5a5dd5d();
    }

    @Override // a24.i
    public java.lang.Class e7() {
        return com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2060xf8bc3f31.p2062x5582bc23.p2071xc2079749.C17588x7870645b.class;
    }

    @Override // a24.i
    public int m7() {
        return 3;
    }

    @Override // s24.b
    public void x7(in5.s0 holder, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) holder.p(i17);
        android.widget.TextView textView = viewGroup != null ? (android.widget.TextView) viewGroup.findViewById(android.R.id.title) : null;
        if (viewGroup == null || textView != null) {
            return;
        }
        android.content.Context context = holder.f374654e;
        android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.c0d, viewGroup, true);
        android.widget.TextView textView2 = (android.widget.TextView) viewGroup.findViewById(android.R.id.title);
        if (textView2 != null) {
            textView2.setText(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.iyr));
        }
    }
}
