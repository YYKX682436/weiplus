package ut2;

/* loaded from: classes3.dex */
public final class h5 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f512442d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 f512443e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f512444f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f512445g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ut2.j5 f512446h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ r45.wv2 f512447i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h5(com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var, java.lang.String str, long j17, ut2.j5 j5Var, r45.wv2 wv2Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f512443e = o4Var;
        this.f512444f = str;
        this.f512445g = j17;
        this.f512446h = j5Var;
        this.f512447i = wv2Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new ut2.h5(this.f512443e, this.f512444f, this.f512445g, this.f512446h, this.f512447i, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((ut2.h5) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f512442d;
        ut2.j5 j5Var = this.f512446h;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            this.f512443e.putLong(this.f512444f, this.f512445g);
            android.content.Context context = j5Var.f512470e.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            xt2.n nVar = new xt2.n(context);
            android.view.View inflate = android.view.LayoutInflater.from(j5Var.f512470e.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.azh, (android.view.ViewGroup) null);
            android.widget.ImageView imageView = (android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.kl7);
            android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.kln);
            mn2.d1 d1Var = new mn2.d1((yo0.e) ((jz5.n) ((mn2.g3) ((mn2.i4) pf5.u.f435469a.e(zy2.b6.class).c(mn2.i4.class))).H).mo141623x754a37bb());
            vd2.i5 i5Var = (vd2.i5) i95.n0.c(vd2.i5.class);
            r45.wv2 wv2Var = this.f512447i;
            java.lang.String m75945x2fec8307 = wv2Var.m75945x2fec8307(0);
            if (m75945x2fec8307 == null) {
                m75945x2fec8307 = "";
            }
            wo0.c a17 = d1Var.a(((c61.i8) i5Var).Ai(m75945x2fec8307, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209889f));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(imageView);
            ((wo0.b) a17).c(imageView);
            textView.setText(wv2Var.m75945x2fec8307(1));
            android.view.ViewGroup viewGroup = nVar.f538430e;
            viewGroup.removeAllViews();
            viewGroup.addView(inflate);
            nVar.a(j5Var.j());
            j5Var.C = nVar;
            j5Var.f512469d.Y = true;
            i95.m c17 = i95.n0.c(ml2.r0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            ml2.r0.Dj((ml2.r0) c17, ml2.f4.G, null, null, null, null, null, 0, 0L, null, null, null, null, false, null, 16376, null);
            long m75939xb282bd08 = wv2Var.m75939xb282bd08(2) * 1000;
            this.f512442d = 1;
            if (p3325xe03a0797.p3326xc267989b.k1.b(m75939xb282bd08, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        xt2.n nVar2 = j5Var.C;
        if (nVar2 != null) {
            nVar2.dismiss();
        }
        return jz5.f0.f384359a;
    }
}
