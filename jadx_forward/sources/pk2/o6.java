package pk2;

/* loaded from: classes3.dex */
public final class o6 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f437596d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ pk2.o9 f437597e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ pk2.q6 f437598f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ v65.n f437599g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.view.View f437600h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o6(boolean z17, pk2.o9 o9Var, pk2.q6 q6Var, v65.n nVar, android.view.View view) {
        super(2);
        this.f437596d = z17;
        this.f437597e = o9Var;
        this.f437598f = q6Var;
        this.f437599g = nVar;
        this.f437600h = view;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.String m75945x2fec8307;
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        r45.cv2 cv2Var = (r45.cv2) obj2;
        pk2.o9 o9Var = this.f437597e;
        boolean z17 = this.f437596d;
        java.lang.String string = z17 ? o9Var.f437611d.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dht) : o9Var.f437611d.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dhp);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
        if (booleanValue) {
            pk2.q6 q6Var = this.f437598f;
            if (!z17) {
                q6Var.getClass();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(o9Var, "<this>");
                r45.i82 i82Var = (r45.i82) ((mm2.f7) o9Var.c(mm2.f7.class)).f410591f.mo3195x754a37bb();
                if (i82Var != null && i82Var.m75933x41a8a7f2(0)) {
                    ((mm2.f7) o9Var.c(mm2.f7.class)).f410594i.mo7808x76db6cb1(new mm2.z6());
                }
            }
            if (!z17) {
                db5.t7.h(o9Var.f437611d, string);
            }
            android.view.View view = this.f437600h;
            ym5.a1.f(new pk2.l6(q6Var, z17, view));
            ym5.a1.f(new pk2.m6(o9Var, view, z17));
            i95.m c17 = i95.n0.c(ml2.j0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            zy2.zb.T8((zy2.zb) c17, z17 ? ml2.t1.H : ml2.t1.I, ((ml2.j0) i95.n0.c(ml2.j0.class)).bj(ml2.s1.f409449f), null, null, null, null, false, 124, null);
            if (z17) {
                i95.m c18 = i95.n0.c(ml2.r0.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
                ml2.r0.rj((ml2.r0) c18, 8, null, 2, null);
            } else {
                i95.m c19 = i95.n0.c(ml2.r0.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c19, "getService(...)");
                ml2.r0.rj((ml2.r0) c19, 7, null, 2, null);
            }
        } else if (z17 && cv2Var != null && (m75945x2fec8307 = cv2Var.m75945x2fec8307(2)) != null) {
            java.lang.String str = m75945x2fec8307.length() > 0 ? m75945x2fec8307 : null;
            if (str != null) {
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 z2Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2(o9Var.f437611d, 2, 2, true, true);
                z2Var.y(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571987vi));
                z2Var.x(6);
                com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = o9Var.f437611d;
                android.widget.TextView textView = new android.widget.TextView(abstractActivityC21394xb3d2c0cf);
                textView.setPaddingRelative((int) textView.getContext().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561237cz), 0, 0, 0);
                textView.setText(com.p314xaae8f345.mm.R.C30867xcad56011.dxc);
                textView.setTextColor(textView.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560787u6));
                textView.setTextSize(17.0f);
                z2Var.s(textView);
                android.widget.TextView textView2 = new android.widget.TextView(abstractActivityC21394xb3d2c0cf);
                textView2.setText(str);
                textView2.setTextColor(textView2.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560787u6));
                textView2.setTextSize(15.0f);
                z2Var.j(textView2);
                z2Var.F = new pk2.n6(z2Var);
                z2Var.C();
            }
        }
        this.f437599g.a(java.lang.Boolean.valueOf(booleanValue));
        return jz5.f0.f384359a;
    }
}
