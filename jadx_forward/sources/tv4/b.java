package tv4;

/* loaded from: classes12.dex */
public final class b extends jv4.q {

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.ref.WeakReference f503893b;

    /* renamed from: c, reason: collision with root package name */
    public final sv4.j f503894c;

    /* renamed from: d, reason: collision with root package name */
    public final rv4.a0 f503895d;

    /* renamed from: e, reason: collision with root package name */
    public final jv4.m f503896e;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public b(java.lang.ref.WeakReference r2, sv4.j r3, rv4.a0 r4) {
        /*
            r1 = this;
            java.lang.String r0 = "settingDelete"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r2, r0)
            java.lang.String r0 = "delegate"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r3, r0)
            java.lang.String r0 = "data"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r4, r0)
            jv4.m r0 = jv4.m.f383783p
            r1.<init>(r0)
            r1.f503893b = r2
            r1.f503894c = r3
            r1.f503895d = r4
            r1.f503896e = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tv4.b.<init>(java.lang.ref.WeakReference, sv4.j, rv4.a0):void");
    }

    @Override // jv4.j
    public int a() {
        return this.f503895d.f481963d ? 1 : 0;
    }

    public final void b(com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8 viewOnClickListenerC22631x1cc07cc8, java.lang.String str) {
        if (viewOnClickListenerC22631x1cc07cc8 == null) {
            return;
        }
        java.lang.String string = viewOnClickListenerC22631x1cc07cc8.f292896x ? viewOnClickListenerC22631x1cc07cc8.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.jnq) : viewOnClickListenerC22631x1cc07cc8.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574834jo0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
        viewOnClickListenerC22631x1cc07cc8.setContentDescription(str + ' ' + string);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    @Override // jv4.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 r18) {
        /*
            Method dump skipped, instructions count: 341
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: tv4.b.c(androidx.recyclerview.widget.k3):void");
    }

    @Override // jv4.q, jv4.n
    /* renamed from: getType */
    public jv4.m mo141457xfb85f7b0() {
        return this.f503896e;
    }

    @Override // nv4.g
    public java.lang.String v() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[setting-item]-");
        rv4.a0 a0Var = this.f503895d;
        sb6.append(a0Var.f481962c);
        sb6.append('-');
        sb6.append(a0Var.d());
        return sb6.toString();
    }

    @Override // nv4.g
    public void w() {
        this.f503895d.w();
    }
}
