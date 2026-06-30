package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2060xf8bc3f31.p2062x5582bc23;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/setting/ui/setting_new/settings/SettingGroupChatRecordManageItem;", "Ls24/a;", "Landroidx/appcompat/app/AppCompatActivity;", com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.C26617x73f7249d.f55566xbe5e9100, "<init>", "(Landroidx/appcompat/app/AppCompatActivity;)V", "plugin-setting_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.setting.ui.setting_new.settings.SettingGroupChatRecordManageItem */
/* loaded from: classes11.dex */
public final class C17517xed2b5590 extends s24.a {

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f243411p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.Integer f243412q;

    /* renamed from: r, reason: collision with root package name */
    public android.graphics.drawable.Drawable f243413r;

    /* renamed from: s, reason: collision with root package name */
    public int f243414s;

    /* renamed from: t, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.b f243415t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17517xed2b5590(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f243414s = 8;
    }

    @Override // s24.a
    public java.lang.String L7() {
        return ".backupui.BackupChooseBackupModeUI";
    }

    @Override // s24.a
    public java.lang.String M7() {
        return "backup";
    }

    @Override // a24.i
    public java.lang.String a7() {
        return "SettingGroup_Main_ChatRecordManage";
    }

    @Override // a24.i
    public a24.u b7() {
        return new a24.u(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2060xf8bc3f31.p2062x5582bc23.C17523x8c728888.class, com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2060xf8bc3f31.p2062x5582bc23.C17529x260eb8c.class);
    }

    @Override // s24.a, s24.f, a24.i
    /* renamed from: clone */
    public java.lang.Object mo446x5a5dd5d() {
        return super.mo446x5a5dd5d();
    }

    @Override // a24.i
    public int d7() {
        return com.p314xaae8f345.mm.R.C30867xcad56011.p7v;
    }

    @Override // a24.i
    public java.lang.Class e7() {
        return com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2060xf8bc3f31.p2062x5582bc23.C17523x8c728888.class;
    }

    @Override // a24.i
    /* renamed from: i7, reason: from getter */
    public android.graphics.drawable.Drawable getF243413r() {
        return this.f243413r;
    }

    @Override // a24.i
    /* renamed from: k7, reason: from getter */
    public int getF243414s() {
        return this.f243414s;
    }

    @Override // a24.i
    public int m7() {
        return 1;
    }

    @Override // a24.i
    /* renamed from: n7, reason: from getter */
    public java.lang.String getF243411p() {
        return this.f243411p;
    }

    @Override // a24.i
    /* renamed from: o7, reason: from getter */
    public java.lang.Integer getF243412q() {
        return this.f243412q;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onResume */
    public void mo2284x57429eec() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.g gVar = com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.g.f242585a;
        if (this.f243415t == null) {
            this.f243415t = new d24.t0(this);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.b bVar = this.f243415t;
        if (bVar != null) {
            gVar.c(bVar);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("backupStatusProvider");
            throw null;
        }
    }
}
