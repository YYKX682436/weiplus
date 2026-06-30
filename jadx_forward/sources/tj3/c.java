package tj3;

/* loaded from: classes14.dex */
public final class c implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tj3.h f501261d;

    public c(tj3.h hVar) {
        this.f501261d = hVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.b0 m166665xa0ab20ce;
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.p1889xd1075a44.p1891xcaa9f6bc.C16591xa5634bbe m166664xa147c61c;
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.p1889xd1075a44.p1891xcaa9f6bc.C16591xa5634bbe m166664xa147c61c2;
        boolean booleanValue;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/multitalk/ui/widget/avatar_view/MultiTalkAvatarControlLayout$initView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        tj3.h hVar = this.f501261d;
        m166665xa0ab20ce = hVar.m166665xa0ab20ce();
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(m166665xa0ab20ce.f231796n.mo3195x754a37bb(), java.lang.Boolean.TRUE)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MT.MultiTalkUIViewModel", "onSwitchCameraClick: switchCam");
            com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.wi().a();
            boolean d17 = com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.wi().d();
            p012xc85e97e9.p093xedfae76a.j0 j0Var = m166665xa0ab20ce.f231803u;
            p012xc85e97e9.p093xedfae76a.g0 g0Var = m166665xa0ab20ce.f231804v;
            if (d17) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onSwitchCameraClick: backCamVBState ");
                sb6.append(m166665xa0ab20ce.f231802t);
                sb6.append(", ");
                java.lang.Boolean bool = (java.lang.Boolean) g0Var.mo3195x754a37bb();
                if (bool == null) {
                    bool = java.lang.Boolean.FALSE;
                }
                sb6.append(bool.booleanValue());
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MT.MultiTalkUIViewModel", sb6.toString());
                java.lang.Boolean bool2 = (java.lang.Boolean) g0Var.mo3195x754a37bb();
                booleanValue = bool2 != null ? bool2.booleanValue() : false;
                m166665xa0ab20ce.f231802t = booleanValue;
                java.util.Map miniInfoHolder = com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().V;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(miniInfoHolder, "miniInfoHolder");
                ((java.util.HashMap) miniInfoHolder).put("back_cam_vb", java.lang.Boolean.valueOf(booleanValue));
                j0Var.mo7808x76db6cb1(java.lang.Boolean.valueOf(m166665xa0ab20ce.f231801s));
                com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.a2 n17 = com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().n();
                if (n17 != null) {
                    n17.i(m166665xa0ab20ce.f231801s);
                }
            } else {
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder("onSwitchCameraClick: frontCamVBState ");
                sb7.append(m166665xa0ab20ce.f231801s);
                sb7.append(", ");
                java.lang.Boolean bool3 = (java.lang.Boolean) g0Var.mo3195x754a37bb();
                if (bool3 == null) {
                    bool3 = java.lang.Boolean.FALSE;
                }
                sb7.append(bool3.booleanValue());
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MT.MultiTalkUIViewModel", sb7.toString());
                java.lang.Boolean bool4 = (java.lang.Boolean) g0Var.mo3195x754a37bb();
                booleanValue = bool4 != null ? bool4.booleanValue() : false;
                m166665xa0ab20ce.f231801s = booleanValue;
                java.util.Map miniInfoHolder2 = com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().V;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(miniInfoHolder2, "miniInfoHolder");
                ((java.util.HashMap) miniInfoHolder2).put("front_cam_vb", java.lang.Boolean.valueOf(booleanValue));
                j0Var.mo7808x76db6cb1(java.lang.Boolean.valueOf(m166665xa0ab20ce.f231802t));
                com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.a2 n18 = com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().n();
                if (n18 != null) {
                    n18.i(m166665xa0ab20ce.f231802t);
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.u0.a(7);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MT.MultiTalkUIViewModel", "onSwitchCameraClick: cam not open");
        }
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.wi().d()) {
            m166664xa147c61c2 = hVar.m166664xa147c61c();
            android.content.Context context = hVar.getContext();
            m166664xa147c61c2.setContentDescription(context != null ? context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.h1s) : null);
        } else {
            m166664xa147c61c = hVar.m166664xa147c61c();
            android.content.Context context2 = hVar.getContext();
            m166664xa147c61c.setContentDescription(context2 != null ? context2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574113h11) : null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/multitalk/ui/widget/avatar_view/MultiTalkAvatarControlLayout$initView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
