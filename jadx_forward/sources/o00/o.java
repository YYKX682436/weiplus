package o00;

/* loaded from: classes8.dex */
public final class o extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f423405d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f423406e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p689xc5a27af6.ecs.p724x306930.ui.ActivityC10526x6bc25cfc f423407f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f423408g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(boolean z17, java.lang.String str, com.p314xaae8f345.mm.p689xc5a27af6.ecs.p724x306930.ui.ActivityC10526x6bc25cfc activityC10526x6bc25cfc, java.lang.String str2, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f423405d = z17;
        this.f423406e = str;
        this.f423407f = activityC10526x6bc25cfc;
        this.f423408g = str2;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new o00.o(this.f423405d, this.f423406e, this.f423407f, this.f423408g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((o00.o) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        boolean z17 = this.f423405d;
        jz5.f0 f0Var = jz5.f0.f384359a;
        java.lang.String str = this.f423406e;
        com.p314xaae8f345.mm.p689xc5a27af6.ecs.p724x306930.ui.ActivityC10526x6bc25cfc activityC10526x6bc25cfc = this.f423407f;
        if (!z17) {
            db5.e1.y(activityC10526x6bc25cfc, activityC10526x6bc25cfc.getString(com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(str) ? com.p314xaae8f345.mm.R.C30867xcad56011.nes : com.p314xaae8f345.mm.R.C30867xcad56011.neu), "", activityC10526x6bc25cfc.getString(com.p314xaae8f345.mm.R.C30867xcad56011.l_e), new o00.k(activityC10526x6bc25cfc));
            return f0Var;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 y1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1(activityC10526x6bc25cfc);
        y1Var.j(com.p314xaae8f345.mm.R.C30864xbddafb2a.e39);
        android.widget.TextView textView = (android.widget.TextView) y1Var.f293560f.findViewById(com.p314xaae8f345.mm.R.id.c_w);
        if (textView != null) {
            com.p314xaae8f345.mm.ui.bk.r0(textView.getPaint(), 0.8f);
            ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).getClass();
            java.lang.String e17 = c01.a2.e(str);
            boolean R4 = com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(str);
            java.lang.String str2 = this.f423408g;
            textView.setText(R4 ? activityC10526x6bc25cfc.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.nem, str2, e17) : activityC10526x6bc25cfc.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.nen, str2));
        }
        android.widget.ImageView imageView = (android.widget.ImageView) y1Var.f293560f.findViewById(com.p314xaae8f345.mm.R.id.sxr);
        if (imageView != null) {
            imageView.setImageResource(com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(str) ? com.p314xaae8f345.mm.R.C30861xcebc809e.da9 : com.p314xaae8f345.mm.R.C30861xcebc809e.da_);
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.c0();
        android.view.View findViewById = y1Var.f293560f.findViewById(com.p314xaae8f345.mm.R.id.sxo);
        if (findViewById != null) {
            findViewById.setOnClickListener(new o00.l(y1Var));
        }
        android.view.View findViewById2 = y1Var.f293560f.findViewById(com.p314xaae8f345.mm.R.id.sxp);
        if (findViewById2 != null) {
            findViewById2.setOnClickListener(new o00.m(c0Var, y1Var));
        }
        y1Var.f293570s = new o00.n(activityC10526x6bc25cfc, c0Var);
        y1Var.s();
        return f0Var;
    }
}
