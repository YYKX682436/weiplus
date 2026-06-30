package hr3;

/* loaded from: classes5.dex */
public final class le extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f365302d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f365303e;

    /* renamed from: f, reason: collision with root package name */
    public int f365304f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f365305g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ hr3.pf f365306h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f365307i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f365308m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ yz5.a f365309n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ r45.dz3 f365310o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public le(boolean z17, hr3.pf pfVar, android.widget.TextView textView, java.lang.String str, yz5.a aVar, r45.dz3 dz3Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f365305g = z17;
        this.f365306h = pfVar;
        this.f365307i = textView;
        this.f365308m = str;
        this.f365309n = aVar;
        this.f365310o = dz3Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new hr3.le(this.f365305g, this.f365306h, this.f365307i, this.f365308m, this.f365309n, this.f365310o, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((hr3.le) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var;
        java.lang.String str;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f365304f;
        android.graphics.drawable.BitmapDrawable bitmapDrawable = null;
        hr3.pf pfVar = this.f365306h;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var2 = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
            p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
            hr3.ge geVar = new hr3.ge(h0Var2, pfVar, this.f365310o, null);
            this.f365302d = "";
            this.f365303e = h0Var2;
            this.f365304f = 1;
            if (p3325xe03a0797.p3326xc267989b.l.g(p0Var, geVar, this) == aVar) {
                return aVar;
            }
            h0Var = h0Var2;
            str = "";
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            h0Var = (p3321xbce91901.jvm.p3324x21ffc6bd.h0) this.f365303e;
            str = (java.lang.String) this.f365302d;
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        boolean z17 = this.f365305g;
        android.widget.TextView textView = this.f365307i;
        if (z17) {
            java.lang.CharSequence charSequence = (java.lang.CharSequence) h0Var.f391656d;
            if (!(charSequence == null || r26.n0.N(charSequence))) {
                java.lang.String str2 = (java.lang.String) h0Var.f391656d;
                if (pfVar.W6()) {
                    if (!(str2 == null || r26.n0.N(str2)) && com.p314xaae8f345.mm.vfs.w6.j(str2)) {
                        bitmapDrawable = new android.graphics.drawable.BitmapDrawable(pfVar.m158361x893a2f6f(), com.p314xaae8f345.mm.sdk.p2603x2137b148.j.a(str2, i65.a.g(pfVar.m158354x19263085())));
                    }
                }
                if (bitmapDrawable != null) {
                    int textSize = (int) textView.getTextSize();
                    bitmapDrawable.setBounds(0, 0, textSize, textSize);
                    textView.append("  ");
                    android.text.SpannableString spannableString = new android.text.SpannableString(" ");
                    spannableString.setSpan(new al5.w(bitmapDrawable, 1), 0, spannableString.length(), 33);
                    spannableString.setSpan(new hr3.he(pfVar, h0Var), 0, spannableString.length(), 33);
                    textView.append(spannableString);
                    str = (java.lang.String) h0Var.f391656d;
                }
            }
        }
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.f0 f0Var = new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.f0(pfVar.m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.la6));
        f0Var.c(new hr3.ae(pfVar, this.f365308m, str != null ? str : "", this.f365309n), 0, f0Var.length(), 17);
        textView.append(" ");
        textView.append(f0Var);
        textView.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
        textView.setOnLongClickListener(new hr3.ke(pfVar, textView));
        return jz5.f0.f384359a;
    }
}
