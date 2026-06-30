package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2060xf8bc3f31.p2062x5582bc23.p2063x2cefd8ff.p2064x6c160a37;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/setting/ui/setting_new/settings/acount_info/more_safe/SettingGroupEmail;", "Ls24/f;", "Landroidx/appcompat/app/AppCompatActivity;", com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.C26617x73f7249d.f55566xbe5e9100, "<init>", "(Landroidx/appcompat/app/AppCompatActivity;)V", "plugin-setting_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.setting.ui.setting_new.settings.acount_info.more_safe.SettingGroupEmail */
/* loaded from: classes11.dex */
public final class C17540x17322ad extends s24.f {

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.String f243430p;

    /* renamed from: q, reason: collision with root package name */
    public android.view.View f243431q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.Integer f243432r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.Integer f243433s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.Integer f243434t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17540x17322ad(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f243430p = "sec_bind_email";
        rn3.i.Di().k(this);
    }

    @Override // s24.f
    /* renamed from: A7, reason: from getter */
    public java.lang.String getF243430p() {
        return this.f243430p;
    }

    @Override // s24.f
    /* renamed from: B7, reason: from getter */
    public android.view.View getF243431q() {
        return this.f243431q;
    }

    @Override // s24.f
    /* renamed from: D7, reason: from getter */
    public java.lang.Integer getF243434t() {
        return this.f243434t;
    }

    @Override // s24.f
    /* renamed from: E7, reason: from getter */
    public java.lang.Integer getF243432r() {
        return this.f243432r;
    }

    @Override // s24.f
    /* renamed from: F7, reason: from getter */
    public java.lang.Integer getF243433s() {
        return this.f243433s;
    }

    @Override // s24.f
    public void H7(android.view.View view) {
        this.f243431q = view;
    }

    @Override // s24.f
    public void I7(java.lang.Integer num) {
        this.f243434t = num;
    }

    @Override // s24.f
    public void J7(java.lang.Integer num) {
        this.f243432r = num;
    }

    @Override // s24.f
    public void K7(java.lang.Integer num) {
        this.f243433s = num;
    }

    @Override // a24.i
    public java.lang.String a7() {
        return "SettingGroup_Main_AccountInfo_MoreSafe_Email";
    }

    @Override // a24.i
    public a24.u b7() {
        return new a24.u(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2060xf8bc3f31.p2062x5582bc23.p2063x2cefd8ff.C17535x7b063fd1.class, com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2060xf8bc3f31.p2062x5582bc23.p2063x2cefd8ff.p2064x6c160a37.C17541xe7dd3a9e.class);
    }

    @Override // s24.f, a24.i
    /* renamed from: clone */
    public java.lang.Object mo446x5a5dd5d() {
        return super.mo446x5a5dd5d();
    }

    @Override // a24.i
    public int d7() {
        return com.p314xaae8f345.mm.R.C30867xcad56011.f575360p85;
    }

    @Override // a24.i
    public java.lang.Class e7() {
        return com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2060xf8bc3f31.p2062x5582bc23.p2063x2cefd8ff.C17535x7b063fd1.class;
    }

    @Override // a24.i
    /* renamed from: m7 */
    public int getF243505p() {
        return 3;
    }

    @Override // a24.i
    /* renamed from: n7 */
    public java.lang.String getF243498p() {
        java.lang.String str = (java.lang.String) gm0.j1.u().c().l(5, null);
        java.lang.Integer num = (java.lang.Integer) gm0.j1.u().c().l(7, null);
        if (num == null || (num.intValue() & 2) == 0 || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) ? m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.inp) : m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.iqj);
        }
        w14.a aVar = w14.a.f523758a;
        if (str == null) {
            str = "";
        }
        return aVar.a(str);
    }

    @Override // a24.i
    public void r7(android.content.Context context, android.view.View itemView, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemView, "itemView");
        t7(m158354x19263085().getIntent());
        this.f243434t = null;
        this.f243433s = null;
        this.f243432r = null;
        ((vd0.o3) ((wd0.z1) i95.n0.c(wd0.z1.class))).cj(context);
        com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.p Di = rn3.i.Di();
        if (Di != null) {
            Di.a(53);
        }
    }

    @Override // s24.f, com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.a
    public boolean y(boolean z17) {
        super.y(z17);
        w7();
        return true;
    }
}
