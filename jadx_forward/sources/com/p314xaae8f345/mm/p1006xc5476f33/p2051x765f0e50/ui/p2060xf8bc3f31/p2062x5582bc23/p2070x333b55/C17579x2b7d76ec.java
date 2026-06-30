package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2060xf8bc3f31.p2062x5582bc23.p2070x333b55;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/setting/ui/setting_new/settings/more/SettingGroupTeenMode;", "Ls24/f;", "Landroidx/appcompat/app/AppCompatActivity;", com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.C26617x73f7249d.f55566xbe5e9100, "<init>", "(Landroidx/appcompat/app/AppCompatActivity;)V", "plugin-setting_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.setting.ui.setting_new.settings.more.SettingGroupTeenMode */
/* loaded from: classes.dex */
public final class C17579x2b7d76ec extends s24.f {

    /* renamed from: p, reason: collision with root package name */
    public boolean f243481p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.Integer f243482q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17579x2b7d76ec(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f243481p = true;
        boolean mo168058x74219ae7 = ((uh4.c0) i95.n0.c(uh4.c0.class)).mo168058x74219ae7();
        if (((uh4.c0) i95.n0.c(uh4.c0.class)).Xd()) {
            this.f243481p = false;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseSettingItem", "need hide teen-mode entrance");
            if (mo168058x74219ae7) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BaseSettingItem", "already enable TeenMode, need to close it manually");
                ((uh4.c0) i95.n0.c(uh4.c0.class)).C5();
            }
        } else {
            this.f243481p = true;
        }
        if (mo168058x74219ae7) {
            this.f243482q = java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.C30867xcad56011.ikb);
        } else {
            this.f243482q = null;
        }
    }

    @Override // a24.i
    public java.lang.String a7() {
        return "SettingGroup_Main_More_MinorMode";
    }

    @Override // a24.i
    public a24.u b7() {
        return new a24.u(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2060xf8bc3f31.p2062x5582bc23.C17524x8c72be24.class, null);
    }

    @Override // s24.f, a24.i
    /* renamed from: clone */
    public java.lang.Object mo446x5a5dd5d() {
        return super.mo446x5a5dd5d();
    }

    @Override // a24.i
    public int d7() {
        return com.p314xaae8f345.mm.R.C30867xcad56011.pb6;
    }

    @Override // a24.i
    public java.lang.Class e7() {
        return com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2060xf8bc3f31.p2062x5582bc23.C17524x8c72be24.class;
    }

    @Override // a24.i
    /* renamed from: m7 */
    public int getF243505p() {
        return 2;
    }

    @Override // a24.i
    /* renamed from: p7, reason: from getter */
    public java.lang.Integer getF243482q() {
        return this.f243482q;
    }

    @Override // a24.i
    /* renamed from: q7, reason: from getter */
    public boolean getF243481p() {
        return this.f243481p;
    }

    @Override // a24.i
    public void r7(android.content.Context context, android.view.View itemView, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemView, "itemView");
        uh4.c0 c0Var = (uh4.c0) i95.n0.c(uh4.c0.class);
        if (c0Var != null) {
            c0Var.i3(context);
        }
    }
}
