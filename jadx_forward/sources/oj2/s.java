package oj2;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final lj2.v0 f427320a;

    /* renamed from: b, reason: collision with root package name */
    public final int f427321b;

    /* renamed from: c, reason: collision with root package name */
    public final android.widget.TextView f427322c;

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f427323d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 f427324e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.TextView f427325f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f427326g;

    /* renamed from: h, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.r2 f427327h;

    /* renamed from: i, reason: collision with root package name */
    public xh2.a f427328i;

    public s(android.view.View micTagLayout, lj2.v0 pluginAbility) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(micTagLayout, "micTagLayout");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pluginAbility, "pluginAbility");
        this.f427320a = pluginAbility;
        this.f427321b = 60;
        android.widget.TextView textView = (android.widget.TextView) micTagLayout.findViewById(com.p314xaae8f345.mm.R.id.qx9);
        this.f427322c = textView;
        this.f427323d = micTagLayout.findViewById(com.p314xaae8f345.mm.R.id.rvx);
        this.f427324e = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) micTagLayout.findViewById(com.p314xaae8f345.mm.R.id.in7);
        android.widget.TextView textView2 = (android.widget.TextView) micTagLayout.findViewById(com.p314xaae8f345.mm.R.id.rvy);
        this.f427325f = textView2;
        this.f427326g = jz5.h.b(oj2.r.f427319d);
        if (textView != null) {
            com.p314xaae8f345.mm.ui.fk.a(textView);
        }
        if (textView2 != null) {
            com.p314xaae8f345.mm.ui.fk.a(textView2);
        }
    }

    public final java.lang.String a() {
        km2.q qVar;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("MicTagLocationWidget_");
        xh2.a aVar = this.f427328i;
        sb6.append((aVar == null || (qVar = aVar.f536053a) == null) ? null : qVar.f390706d);
        return sb6.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0099, code lost:
    
        if ((r5 != null && ((p3325xe03a0797.p3326xc267989b.a) r5).a()) == false) goto L63;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(int r19, xh2.a r20) {
        /*
            Method dump skipped, instructions count: 438
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: oj2.s.b(int, xh2.a):void");
    }

    public final void c() {
        java.lang.String a17 = a();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onDetach isActive: ");
        p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f427327h;
        sb6.append(r2Var != null ? java.lang.Boolean.valueOf(((p3325xe03a0797.p3326xc267989b.a) r2Var).a()) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(a17, sb6.toString());
        p3325xe03a0797.p3326xc267989b.r2 r2Var2 = this.f427327h;
        if (r2Var2 != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var2, null, 1, null);
        }
    }
}
