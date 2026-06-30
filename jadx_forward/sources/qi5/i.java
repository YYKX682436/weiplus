package qi5;

/* loaded from: classes.dex */
public final class i extends ym3.a {

    /* renamed from: d, reason: collision with root package name */
    public final p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 f445352d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f445353e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.ArrayList f445354f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f445355g;

    public i(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f445352d = activity;
        this.f445353e = jz5.h.b(qi5.e.f445346d);
        this.f445354f = new java.util.ArrayList();
        this.f445355g = jz5.h.b(new qi5.h(this));
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x010f, code lost:
    
        if (r6 != null) goto L29;
     */
    /* JADX WARN: Type inference failed for: r2v1, types: [kotlin.coroutines.Continuation, java.lang.Object, kotlinx.coroutines.a1] */
    @Override // ym3.a, ym3.f
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public p3325xe03a0797.p3326xc267989b.p3328x30012e.j a(v65.i r23, ym3.c r24) {
        /*
            Method dump skipped, instructions count: 406
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: qi5.i.a(v65.i, ym3.c):kotlinx.coroutines.flow.j");
    }

    @Override // ym3.f
    /* renamed from: onCreate */
    public void mo10202x3e5a77bb() {
        java.util.ArrayList arrayList = this.f445354f;
        arrayList.clear();
        p75.i0 g17 = dm.i2.K.g(kz5.b0.c(dm.i2.L));
        g17.f434190d = dm.i2.W.j("conversationboxservice");
        g17.f434192f = kz5.b0.c(new g95.v());
        p75.l0 a17 = g17.a();
        jz5.g gVar = this.f445355g;
        boolean d17 = com.p314xaae8f345.mm.ui.p2690x38b72420.i5.d(((java.lang.Number) ((jz5.n) gVar).mo141623x754a37bb()).intValue(), 4);
        boolean d18 = com.p314xaae8f345.mm.ui.p2690x38b72420.i5.d(((java.lang.Number) ((jz5.n) gVar).mo141623x754a37bb()).intValue(), 16);
        java.util.Iterator it = ((java.util.ArrayList) a17.l(((jm0.l) ((jz5.n) this.f445353e).mo141623x754a37bb()).Q4())).iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            if (!d17 || !com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(str)) {
                if (!d18 || com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(str)) {
                    if (!r26.n0.D(str, ",", false, 2, null)) {
                        arrayList.add(str);
                    }
                }
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SelectContactDataSource", "onCreate  contactListSize=" + arrayList.size());
    }
}
