package vg2;

/* loaded from: classes3.dex */
public final class z0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f518167d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ vg2.y0 f518168e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ vg2.r1 f518169f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r45.yi6 f518170g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ vg2.b1 f518171h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(vg2.y0 y0Var, vg2.r1 r1Var, r45.yi6 yi6Var, vg2.b1 b1Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f518168e = y0Var;
        this.f518169f = r1Var;
        this.f518170g = yi6Var;
        this.f518171h = b1Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new vg2.z0(this.f518168e, this.f518169f, this.f518170g, this.f518171h, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((vg2.z0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        android.widget.ImageView imageView;
        android.widget.TextView textView;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14321x140d228b c14321x140d228b;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f518167d;
        r45.yi6 yi6Var = this.f518170g;
        vg2.r1 r1Var = this.f518169f;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            dk2.q4 q4Var = dk2.q4.f315471a;
            android.content.Context context = this.f518168e.f3639x46306858.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            ce2.i iVar = r1Var.f518100h;
            this.f518167d = 1;
            obj = q4Var.q(context, iVar, yi6Var, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        if (((r45.hb2) obj) != null) {
            r1Var.f518100h.f67816xdcd1d904.set(2, yi6Var.m75945x2fec8307(0));
            java.util.Map map = dk2.u7.f315718e;
            if (map.containsKey(r1Var.f518100h.f67814x2c488eb6)) {
                ce2.i iVar2 = r1Var.f518100h;
                map.put(iVar2.f67814x2c488eb6, iVar2);
            }
            java.util.Map map2 = dk2.u7.f315722i;
            if (map2.containsKey(r1Var.f518100h.f67814x2c488eb6)) {
                ce2.i iVar3 = r1Var.f518100h;
                map2.put(iVar3.f67814x2c488eb6, iVar3);
            }
            ((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4.class)).Oj().J0(r1Var.f518100h);
            android.view.ViewGroup viewGroup = r1Var.f518102j;
            if (viewGroup != null && (c14321x140d228b = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14321x140d228b) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.f2v)) != null) {
                c14321x140d228b.c(c14321x140d228b.f197480p, c14321x140d228b.f197479o);
            }
            android.view.ViewGroup viewGroup2 = r1Var.f518102j;
            if (viewGroup2 != null && (textView = (android.widget.TextView) viewGroup2.findViewById(com.p314xaae8f345.mm.R.id.f566194f30)) != null) {
                textView.setText(java.lang.String.valueOf(r1Var.f518100h.P0()));
            }
            android.view.ViewGroup viewGroup3 = r1Var.f518102j;
            if (viewGroup3 != null && (imageView = (android.widget.ImageView) viewGroup3.findViewById(com.p314xaae8f345.mm.R.id.f3o)) != null) {
                ((wo0.b) new mn2.d1((yo0.e) ((jz5.n) ((mn2.g3) ((mn2.i4) pf5.u.f435469a.e(zy2.b6.class).c(mn2.i4.class))).H).mo141623x754a37bb()).a(new mn2.q3(r1Var.f518100h.R0(), com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209889f))).c(imageView);
            }
            vg2.b1 b1Var = this.f518171h;
            java.lang.Object obj2 = b1Var.f518013d.get(b1Var.f518014e);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj2, "get(...)");
            vg2.r1.c(r1Var, (r45.yi6) obj2);
        }
        return jz5.f0.f384359a;
    }
}
