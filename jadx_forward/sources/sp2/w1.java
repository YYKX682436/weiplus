package sp2;

/* loaded from: classes2.dex */
public final class w1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f492787d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sp2.o2 f492788e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w1(sp2.o2 o2Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f492788e = o2Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        sp2.w1 w1Var = new sp2.w1(this.f492788e, interfaceC29045xdcb5ca57);
        w1Var.f492787d = obj;
        return w1Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        sp2.w1 w1Var = (sp2.w1) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        w1Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        if (p3325xe03a0797.p3326xc267989b.z0.h((p3325xe03a0797.p3326xc267989b.y0) this.f492787d)) {
            sp2.o2 o2Var = this.f492788e;
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf activity = o2Var.f492654a;
            r45.lp1 extInfo = o2Var.U;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(extInfo, "extInfo");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiveEntranceEducationDialogHelper", "checkShowEducationDialog");
            android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(activity).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.eit, (android.view.ViewGroup) null);
            float f17 = activity.getResources().getDisplayMetrics().density * 495.0f;
            android.view.Window window = activity.getWindow();
            android.view.View decorView = window != null ? window.getDecorView() : null;
            android.view.ViewGroup viewGroup = decorView instanceof android.view.ViewGroup ? (android.view.ViewGroup) decorView : null;
            if (viewGroup != null) {
                gx2.a aVar2 = new gx2.a();
                aVar2.f358870c = f17;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(inflate);
                aVar2.f358872e = new hx2.c(inflate);
                aVar2.f358871d = new hx2.g(activity, 0, 0, 0, false, false, 62, null);
                aVar2.f358873f = new hx2.b(activity, true);
                gx2.q b17 = aVar2.b(viewGroup);
                com.p314xaae8f345.mm.ui.p2747xd1075a44.C22628xfde5d61d c22628xfde5d61d = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22628xfde5d61d) inflate.findViewById(com.p314xaae8f345.mm.R.id.q4q);
                java.lang.String m75945x2fec8307 = com.p314xaae8f345.mm.ui.bk.C() ? extInfo.m75945x2fec8307(1) : extInfo.m75945x2fec8307(0);
                if (m75945x2fec8307 == null || m75945x2fec8307.length() == 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.LiveEntranceEducationDialogHelper", "Education dialog image url is null or empty, loading failed");
                } else {
                    wo0.c a17 = new mn2.d1((yo0.e) ((jz5.n) ((mn2.g3) ((mn2.i4) pf5.u.f435469a.e(zy2.b6.class).c(mn2.i4.class))).H).mo141623x754a37bb()).a(new mn2.q3(m75945x2fec8307, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209888e));
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c22628xfde5d61d);
                    ((wo0.b) a17).c(c22628xfde5d61d);
                }
                android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.c_x);
                if (textView != null) {
                    textView.setText(activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571987vi));
                    textView.setOnClickListener(new jk2.b(b17));
                }
                android.widget.TextView textView2 = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.b5w);
                if (textView2 != null) {
                    textView2.setText(activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.od6));
                    textView2.setOnClickListener(new jk2.c(activity, b17));
                }
                b17.m132480x7ba98ee6(new jk2.d(null));
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1664xb118f8f1.AbstractGestureDetectorOnGestureListenerC15396x3fa945f1.m(b17, false, 1, null);
                i95.m c17 = i95.n0.c(ml2.j0.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                zy2.zb.I8((zy2.zb) c17, ml2.u1.f409623u3, new java.util.HashMap(), null, "135", null, null, false, 116, null);
            }
        }
        return jz5.f0.f384359a;
    }
}
