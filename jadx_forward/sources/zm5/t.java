package zm5;

/* loaded from: classes3.dex */
public final class t extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f555800d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f555801e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f555802f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f555803g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f555804h;

    /* renamed from: i, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.r2 f555805i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f555800d = jz5.h.b(new zm5.o(activity));
        this.f555801e = jz5.h.b(new zm5.m(activity));
        this.f555802f = jz5.h.b(new zm5.s(activity));
        this.f555803g = jz5.h.b(new zm5.r(activity));
        this.f555804h = jz5.h.b(new zm5.n(activity));
    }

    public final android.view.View O6() {
        java.lang.Object mo141623x754a37bb = ((jz5.n) this.f555800d).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        return (android.view.View) mo141623x754a37bb;
    }

    public final void P6() {
        p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f555805i;
        if (r2Var != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
        }
        android.view.View O6 = O6();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(O6, arrayList.toArray(), "com/tencent/mm/view/activity/ImageQueryGalleryBottomFunUIC", "resetVisible", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        O6.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(O6, "com/tencent/mm/view/activity/ImageQueryGalleryBottomFunUIC", "resetVisible", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f555805i = p3325xe03a0797.p3326xc267989b.l.d(m158345xefc66565(), p3325xe03a0797.p3326xc267989b.q1.f392103c, null, new zm5.q(this, null), 2, null);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View v17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(v17);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/view/activity/ImageQueryGalleryBottomFunUIC", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(v17, "v");
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        pf5.z zVar = pf5.z.f435481a;
        long j17 = ((zm5.l) zVar.a(activity).a(zm5.l.class)).f555771i;
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity2 = m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity2, "activity");
        java.lang.String str = ((zm5.l) zVar.a(activity2).a(zm5.l.class)).f555772m;
        int id6 = v17.getId();
        if (id6 == com.p314xaae8f345.mm.R.id.h__) {
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity3 = m158354x19263085();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity3, "activity");
            if (aq.p.f94463b != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageQueryComposeOp", "dealImageDownload: " + j17 + ' ' + str);
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.k1.k(activity3, pt0.f0.f439742b1.n(str, j17), true, null);
            }
        } else if (id6 == com.p314xaae8f345.mm.R.id.h_j) {
            aq.p.f94462a.a(j17, str, m158354x19263085(), 0);
        } else if (id6 == com.p314xaae8f345.mm.R.id.h_n) {
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity4 = m158354x19263085();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity4, "activity");
            zm5.f0 f0Var = (zm5.f0) zVar.a(activity4).a(zm5.f0.class);
            zm5.x0 x0Var = f0Var.f555749r;
            zm5.x0 x0Var2 = zm5.x0.f555820e;
            if ((x0Var == x0Var2 || f0Var.f555746o == x0Var2) ? false : true) {
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity5 = m158354x19263085();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity5, "activity");
                if (((zm5.l) zVar.a(activity5).a(zm5.l.class)).O6() != null) {
                    p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity6 = m158354x19263085();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity6, "activity");
                    ((zm5.f0) zVar.a(activity6).a(zm5.f0.class)).S6(j17, str);
                }
            }
        } else if (id6 == com.p314xaae8f345.mm.R.id.h9g) {
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity7 = m158354x19263085();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity7, "activity");
            if (aq.p.f94463b != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageQueryComposeOp", "dealImageToJumpGalley >> " + j17);
                com.p314xaae8f345.mm.p2621x8fb0427b.f9 n17 = pt0.f0.f439742b1.n(str, j17);
                android.content.Intent intent = new android.content.Intent();
                intent.setClass(activity7, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewOnClickListenerC21789x2eb4d316.class);
                intent.addFlags(67108864);
                intent.putExtra("key_media_type", 1);
                intent.putExtra("kintent_talker", n17.Q0());
                intent.putExtra("key_gallery_enter_scene", 3);
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(intent);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(activity7, arrayList2.toArray(), "com/tencent/mm/ui/chatting/gallery/query/ImageQueryComposeOp", "dealImageToJumpGalley", "(Landroid/app/Activity;JLjava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                activity7.startActivity((android.content.Intent) arrayList2.get(0));
                yj0.a.f(activity7, "com/tencent/mm/ui/chatting/gallery/query/ImageQueryComposeOp", "dealImageToJumpGalley", "(Landroid/app/Activity;JLjava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            }
        }
        yj0.a.h(this, "com/tencent/mm/view/activity/ImageQueryGalleryBottomFunUIC", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        boolean z17;
        if (aq.p.f94463b != null) {
            ((su4.x0) i95.n0.c(su4.x0.class)).getClass();
            ((sg0.y3) ((tg0.o1) i95.n0.c(tg0.o1.class))).getClass();
            z17 = !su4.r2.l();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageQueryComposeOp", "getWebSearchIsToShow: " + z17);
        } else {
            z17 = false;
        }
        jz5.g gVar = this.f555802f;
        if (z17) {
            java.lang.Object mo141623x754a37bb = ((jz5.n) gVar).mo141623x754a37bb();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
            android.view.View view = (android.view.View) mo141623x754a37bb;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/view/activity/ImageQueryGalleryBottomFunUIC", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/view/activity/ImageQueryGalleryBottomFunUIC", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        boolean z18 = aq.o.f94453a;
        jz5.g gVar2 = this.f555804h;
        if (!z18) {
            java.lang.Object mo141623x754a37bb2 = ((jz5.n) gVar2).mo141623x754a37bb();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb2, "getValue(...)");
            android.view.View view2 = (android.view.View) mo141623x754a37bb2;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/view/activity/ImageQueryGalleryBottomFunUIC", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/view/activity/ImageQueryGalleryBottomFunUIC", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.ViewGroup.LayoutParams layoutParams = O6().getLayoutParams();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        android.widget.RelativeLayout.LayoutParams layoutParams2 = (android.widget.RelativeLayout.LayoutParams) layoutParams;
        layoutParams2.bottomMargin += i65.a.b(m158354x19263085(), aq.p.f94463b != null ? nc5.b.f417725d : 0);
        O6().setLayoutParams(layoutParams2);
        java.lang.Object mo141623x754a37bb3 = ((jz5.n) this.f555801e).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb3, "getValue(...)");
        ((android.view.View) mo141623x754a37bb3).setOnClickListener(this);
        java.lang.Object mo141623x754a37bb4 = ((jz5.n) this.f555803g).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb4, "getValue(...)");
        ((android.view.View) mo141623x754a37bb4).setOnClickListener(this);
        java.lang.Object mo141623x754a37bb5 = ((jz5.n) gVar2).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb5, "getValue(...)");
        ((android.view.View) mo141623x754a37bb5).setOnClickListener(this);
        java.lang.Object mo141623x754a37bb6 = ((jz5.n) gVar).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb6, "getValue(...)");
        ((android.view.View) mo141623x754a37bb6).setOnClickListener(this);
        P6();
    }
}
