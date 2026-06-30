package so2;

/* loaded from: classes2.dex */
public final class j6 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ so2.m6 f491977d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f491978e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f491979f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f491980g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f491981h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f491982i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ r45.bm2 f491983m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j6(so2.m6 m6Var, android.widget.TextView textView, android.content.Context context, java.lang.String str, boolean z17, int i17, r45.bm2 bm2Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f491977d = m6Var;
        this.f491978e = textView;
        this.f491979f = context;
        this.f491980g = str;
        this.f491981h = z17;
        this.f491982i = i17;
        this.f491983m = bm2Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new so2.j6(this.f491977d, this.f491978e, this.f491979f, this.f491980g, this.f491981h, this.f491982i, this.f491983m, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        so2.j6 j6Var = (so2.j6) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        j6Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.lang.String str;
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        so2.m6 m6Var = this.f491977d;
        android.widget.TextView textView = this.f491978e;
        android.content.Context context = this.f491979f;
        java.lang.String str2 = this.f491980g;
        boolean z17 = this.f491981h;
        int i17 = this.f491982i;
        r45.bm2 bm2Var = this.f491983m;
        java.lang.Object T6 = m6Var.T6(textView, context, str2, z17, i17, 0, so2.m6.N6(m6Var, bm2Var), false, 3, false, 0);
        android.content.Context context2 = this.f491979f;
        boolean z18 = this.f491981h;
        so2.m6 m6Var2 = this.f491977d;
        m6Var2.getClass();
        boolean z19 = T6 instanceof java.lang.String;
        android.widget.TextView textView2 = this.f491978e;
        if (z19) {
            i95.m c17 = i95.n0.c(zy2.s6.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            java.lang.String str3 = this.f491980g;
            sb6.append(str3);
            sb6.append(T6);
            java.lang.CharSequence Ne = zy2.s6.Ne((zy2.s6) c17, 0, sb6.toString(), context2, z18, m6Var2.f492018e, 0, false, 96, null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.SyncGetImageModel", "setDefaultDrawerText String type match prefixText:" + str3 + ' ' + T6 + " recommendDesc:" + ((java.lang.Object) Ne) + " hashCode:" + m6Var2.hashCode());
            if (!z18) {
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                sb7.append(str3);
                if (bm2Var == null || (str = bm2Var.m75945x2fec8307(3)) == null) {
                    str = "";
                }
                sb7.append(str);
                Ne = sb7.toString();
            }
            textView2.setText(Ne);
        } else if (T6 instanceof android.text.SpannableStringBuilder) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.SyncGetImageModel", "setDefaultDrawerText SpannableStringBuilder type match " + T6 + " hashCode:" + m6Var2.hashCode());
            textView2.setText((java.lang.CharSequence) T6);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Finder.SyncGetImageModel", "setDefaultDrawerText desc type match nothing !" + T6 + " hashCode:" + m6Var2.hashCode());
        }
        return jz5.f0.f384359a;
    }
}
