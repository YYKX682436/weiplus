package so2;

/* loaded from: classes2.dex */
public final class i6 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ so2.m6 f491958d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f491959e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f491960f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f491961g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f491962h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f491963i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f491964m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f491965n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ r45.bm2 f491966o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f491967p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ boolean f491968q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f491969r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i6(so2.m6 m6Var, android.widget.TextView textView, android.content.Context context, java.lang.String str, boolean z17, int i17, int i18, boolean z18, r45.bm2 bm2Var, int i19, boolean z19, int i27, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f491958d = m6Var;
        this.f491959e = textView;
        this.f491960f = context;
        this.f491961g = str;
        this.f491962h = z17;
        this.f491963i = i17;
        this.f491964m = i18;
        this.f491965n = z18;
        this.f491966o = bm2Var;
        this.f491967p = i19;
        this.f491968q = z19;
        this.f491969r = i27;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new so2.i6(this.f491958d, this.f491959e, this.f491960f, this.f491961g, this.f491962h, this.f491963i, this.f491964m, this.f491965n, this.f491966o, this.f491967p, this.f491968q, this.f491969r, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        so2.i6 i6Var = (so2.i6) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        i6Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        android.text.SpannableStringBuilder spannableStringBuilder;
        java.lang.String str4;
        java.lang.String str5;
        java.lang.String str6;
        java.lang.CharSequence charSequence;
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        so2.m6 m6Var = this.f491958d;
        android.widget.TextView textView = this.f491959e;
        android.content.Context context = this.f491960f;
        java.lang.String str7 = this.f491961g;
        boolean z17 = this.f491962h;
        int i17 = this.f491963i;
        boolean z18 = this.f491965n;
        int i18 = this.f491964m;
        int i19 = (i18 <= 0 || !z18) ? 0 : i18;
        r45.bm2 bm2Var = this.f491966o;
        java.lang.Object T6 = m6Var.T6(textView, context, str7, z17, i17, i19, so2.m6.N6(m6Var, bm2Var), this.f491965n, this.f491967p, this.f491968q, this.f491969r);
        android.content.Context context2 = this.f491960f;
        boolean z19 = this.f491962h;
        so2.m6 m6Var2 = this.f491958d;
        m6Var2.getClass();
        boolean z27 = T6 instanceof java.lang.String;
        android.widget.TextView textView2 = this.f491959e;
        java.lang.String str8 = this.f491961g;
        if (z27) {
            i95.m c17 = i95.n0.c(zy2.s6.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            android.text.SpannableStringBuilder Ne = zy2.s6.Ne((zy2.s6) c17, (i18 <= 0 || !z18) ? 0 : i18, str8 + ' ' + T6, context2, z19, 0, 0, false, 112, null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.SyncGetImageModel", "String type match prefixText:" + str8 + ' ' + T6 + " recommendDesc:" + ((java.lang.Object) Ne) + " pos:" + m6Var2.f492020g + " hashCode:" + m6Var2.hashCode());
            textView2.setText(Ne);
        } else if (T6 instanceof android.text.SpannableString) {
            if (bm2Var == null) {
                i95.m c18 = i95.n0.c(zy2.s6.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
                zy2.s6 s6Var = (zy2.s6) c18;
                int i27 = (i18 <= 0 || !z18) ? 0 : i18;
                android.text.SpannableStringBuilder append = new android.text.SpannableStringBuilder(str8).append(' ').append((java.lang.CharSequence) T6);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(append, "append(...)");
                str4 = " pos:";
                str5 = " hashCode:";
                str6 = "Finder.SyncGetImageModel";
                charSequence = zy2.s6.J7(s6Var, i27, append, context2, z19, 0, 0, false, 112, null);
            } else {
                str4 = " pos:";
                str5 = " hashCode:";
                str6 = "Finder.SyncGetImageModel";
                charSequence = (java.lang.CharSequence) T6;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str6, "SpannableString type match " + ((java.lang.Object) charSequence) + str4 + m6Var2.f492020g + str5 + m6Var2.hashCode());
            textView2.setText(charSequence);
        } else if (T6 instanceof android.text.SpannableStringBuilder) {
            if (bm2Var == null) {
                i95.m c19 = i95.n0.c(zy2.s6.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c19, "getService(...)");
                zy2.s6 s6Var2 = (zy2.s6) c19;
                int i28 = (i18 <= 0 || !z18) ? 0 : i18;
                android.text.SpannableStringBuilder append2 = new android.text.SpannableStringBuilder(str8).append(' ').append((java.lang.CharSequence) T6);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(append2, "append(...)");
                str = "Finder.SyncGetImageModel";
                str2 = " pos:";
                str3 = " hashCode:";
                spannableStringBuilder = zy2.s6.J7(s6Var2, i28, append2, context2, z19, 0, 0, false, 112, null);
            } else {
                str = "Finder.SyncGetImageModel";
                str2 = " pos:";
                str3 = " hashCode:";
                spannableStringBuilder = (android.text.SpannableStringBuilder) T6;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "SpannableStringBuilder type match " + ((java.lang.Object) spannableStringBuilder) + str2 + m6Var2.f492020g + str3 + m6Var2.hashCode());
            textView2.setText(spannableStringBuilder);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Finder.SyncGetImageModel", "desc type match nothing !" + T6 + " pos:" + m6Var2.f492020g + " hashCode:" + m6Var2.hashCode());
        }
        return jz5.f0.f384359a;
    }
}
