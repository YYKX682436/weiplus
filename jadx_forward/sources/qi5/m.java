package qi5;

/* loaded from: classes.dex */
public final class m extends ym3.a {

    /* renamed from: d, reason: collision with root package name */
    public final p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 f445361d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f445362e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.ArrayList f445363f;

    public m(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f445361d = activity;
        this.f445362e = jz5.h.b(qi5.j.f445356d);
        this.f445363f = new java.util.ArrayList();
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
        throw new UnsupportedOperationException("Method not decompiled: qi5.m.a(v65.i, ym3.c):kotlinx.coroutines.flow.j");
    }

    @Override // ym3.f
    /* renamed from: onCreate */
    public void mo10202x3e5a77bb() {
        java.util.ArrayList arrayList = this.f445363f;
        arrayList.clear();
        p75.n0 n0Var = dm.i2.K;
        p75.d dVar = dm.i2.L;
        p75.i0 g17 = n0Var.g(kz5.b0.c(dVar));
        g17.f434190d = dVar.p("'%@kefu.openim'");
        g17.f434192f = kz5.b0.c(new g95.v());
        java.util.Iterator it = g17.a().l(((jm0.l) ((jz5.n) this.f445362e).mo141623x754a37bb()).Q4()).iterator();
        while (it.hasNext()) {
            arrayList.add((java.lang.String) it.next());
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenImKeFuDataSource", "onCreate  contactListSize=" + arrayList.size());
    }
}
