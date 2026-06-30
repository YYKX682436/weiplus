package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2060xf8bc3f31.p2062x5582bc23.p2076x229fdf4d;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/setting/ui/setting_new/settings/personal_info/SettingActivityItemAvatar;", "Ls24/a;", "Landroidx/appcompat/app/AppCompatActivity;", com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.C26617x73f7249d.f55566xbe5e9100, "<init>", "(Landroidx/appcompat/app/AppCompatActivity;)V", "plugin-setting_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.setting.ui.setting_new.settings.personal_info.SettingActivityItemAvatar */
/* loaded from: classes5.dex */
public final class C17635x14f80d0b extends s24.a {

    /* renamed from: p, reason: collision with root package name */
    public final boolean f243510p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17635x14f80d0b(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        boolean z17 = false;
        if (m158359x1e885992().getBooleanExtra("intent_set_avatar", false)) {
            ((com.p314xaae8f345.mm.app.o7) ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).wi()).Ui(activity);
            z17 = m158359x1e885992().getBooleanExtra("KEnterFromBanner", false);
        }
        this.f243510p = z17;
    }

    @Override // s24.a
    public java.lang.String L7() {
        return ".ui.setting.SettingMessageRingtoneUI";
    }

    @Override // s24.a
    public java.lang.String M7() {
        return "setting";
    }

    public final void N7() {
        vh0.e1 e1Var = (vh0.e1) i95.n0.c(vh0.e1.class);
        iy1.c cVar = iy1.c.MainUI;
        ((y14.j) e1Var).getClass();
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Gj(50402, "page_in", new java.util.HashMap(), 35480);
        android.content.Intent intent = new android.content.Intent(m80379x76847179(), (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17379xdc3f7e5f.class);
        android.app.Activity m80379x76847179 = m80379x76847179();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(m80379x76847179, arrayList.toArray(), "com/tencent/mm/plugin/setting/ui/setting_new/settings/personal_info/SettingActivityItemAvatar", "jumpToPreviewHdHeadImg", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        m80379x76847179.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(m80379x76847179, "com/tencent/mm/plugin/setting/ui/setting_new/settings/personal_info/SettingActivityItemAvatar", "jumpToPreviewHdHeadImg", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    @Override // a24.i
    public yz5.l T6() {
        return new o24.a(this);
    }

    @Override // a24.i
    public android.view.View.OnClickListener U6() {
        return new o24.b(this);
    }

    @Override // a24.i
    public java.lang.String a7() {
        return "SettingGroup_Main_PersonalInfo_Avatar";
    }

    @Override // a24.i
    public a24.u b7() {
        return new a24.u(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2060xf8bc3f31.p2062x5582bc23.C17527x718322dd.class, null);
    }

    @Override // s24.a, s24.f, a24.i
    /* renamed from: clone */
    public java.lang.Object mo446x5a5dd5d() {
        return super.mo446x5a5dd5d();
    }

    @Override // a24.i
    public int d7() {
        return com.p314xaae8f345.mm.R.C30867xcad56011.ipu;
    }

    @Override // a24.i
    public java.lang.Class e7() {
        return com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2060xf8bc3f31.p2062x5582bc23.C17527x718322dd.class;
    }

    @Override // a24.i
    public int m7() {
        return 2;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onActivityResult */
    public void mo2273x9d4787cb(int i17, int i18, android.content.Intent intent) {
        com.p314xaae8f345.mm.vfs.x1 m17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MircoMsg.SettingActivityAvatar", "onAcvityResult requestCode:%d, resultCode:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        if (i18 != -1) {
            if (i17 == 2 || i17 == 3 || i17 == 4) {
                new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper()).mo50293x3498a0(new o24.c());
                return;
            }
            return;
        }
        if (i17 == 2) {
            if (intent == null) {
                return;
            }
            android.content.Intent intent2 = new android.content.Intent();
            intent2.putExtra("CropImageMode", 1);
            intent2.putExtra("CropImage_Filter", true);
            ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
            intent2.putExtra("CropImage_OutputPath", com.p314xaae8f345.mm.p943x351df9c2.d1.Ai().i(c01.z1.r() + ".crop", true, false));
            intent2.putExtra("CropImage_ImgPath", (java.lang.String) null);
            intent2.putExtra("CropImage_from_scene", 3);
            ((com.p314xaae8f345.mm.app.y7) f14.g.b()).q(m158354x19263085(), intent, intent2, g83.a.a(), 4, null);
            return;
        }
        if (i17 == 3) {
            vb0.o oVar = (vb0.o) i95.n0.c(vb0.o.class);
            android.app.Activity m80379x76847179 = m80379x76847179();
            java.lang.String a17 = g83.a.a();
            ((ub0.r) oVar).getClass();
            java.lang.String b17 = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.l7.b(m80379x76847179, intent, a17);
            if (b17 == null) {
                return;
            }
            android.content.Intent intent3 = new android.content.Intent();
            intent3.putExtra("CropImageMode", 1);
            intent3.putExtra("CropImage_OutputPath", b17);
            intent3.putExtra("CropImage_ImgPath", b17);
            intent3.putExtra("CropImage_from_scene", 3);
            ((com.p314xaae8f345.mm.app.y7) f14.g.b()).p(m158354x19263085(), intent3, 4);
            return;
        }
        if (i17 != 4) {
            return;
        }
        new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper()).mo50293x3498a0(new o24.d());
        if (intent == null) {
            return;
        }
        java.lang.String stringExtra = intent.getStringExtra("CropImage_OutputPath");
        java.lang.String r17 = c01.z1.r();
        ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
        android.graphics.Bitmap m18 = com.p314xaae8f345.mm.p943x351df9c2.d1.Ai().m(r17);
        if (stringExtra == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MircoMsg.SettingActivityAvatar", "crop picture failed");
            return;
        }
        com.p314xaae8f345.mm.vfs.z7 a18 = com.p314xaae8f345.mm.vfs.z7.a(stringExtra);
        java.lang.String str = a18.f294812f;
        if (str != null) {
            java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str, false, false);
            if (!str.equals(l17)) {
                a18 = new com.p314xaae8f345.mm.vfs.z7(a18.f294810d, a18.f294811e, l17, a18.f294813g, a18.f294814h);
            }
        }
        com.p314xaae8f345.mm.vfs.z2 m19 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a18, null);
        long j17 = 0;
        if (m19.a() && (m17 = m19.f294799a.m(m19.f294800b)) != null) {
            j17 = m17.f294766c;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MircoMsg.SettingActivityAvatar", "onActivityResult(CONTEXT_MENU_CROP_PICTURE)  file:%s, size:%d", stringExtra, java.lang.Long.valueOf(j17));
        kv.l0 l0Var = (kv.l0) i95.n0.c(kv.l0.class);
        android.app.Activity m80379x768471792 = m80379x76847179();
        ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.k0) l0Var).getClass();
        new com.p314xaae8f345.mm.p943x351df9c2.y0(m80379x768471792, stringExtra, false).b(1, new o24.e(m18, this), true);
    }

    @Override // s24.a, a24.i
    public void r7(android.content.Context context, android.view.View itemView, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemView, "itemView");
        t7(m158354x19263085().getIntent());
        if (j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2585xce036727.C20836xa6d0acd2()) == 1) {
            N7();
            return;
        }
        ((com.p314xaae8f345.mm.app.o7) ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).wi()).Ui(m158354x19263085());
    }
}
