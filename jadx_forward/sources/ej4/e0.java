package ej4;

/* loaded from: classes11.dex */
public final class e0 {

    /* renamed from: d, reason: collision with root package name */
    public static int f334878d;

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f334882a;

    /* renamed from: b, reason: collision with root package name */
    public int f334883b;

    /* renamed from: c, reason: collision with root package name */
    public static final ej4.d0 f334877c = new ej4.d0(null);

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.LinkedList f334879e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.LinkedList f334880f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public static java.lang.String f334881g = "";

    public e0(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f334882a = context;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00c6, code lost:
    
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopicSelfItemHelper", "match Size " + r1 + ", " + r6.size() + ", " + r14);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.ArrayList a(java.util.LinkedList r22) {
        /*
            Method dump skipped, instructions count: 550
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ej4.e0.a(java.util.LinkedList):java.util.ArrayList");
    }

    public final void b(mj4.h hVar, java.util.ArrayList arrayList) {
        int c17 = c();
        int size = arrayList.size() - 1;
        android.content.Context context = this.f334882a;
        if (size >= c17 && size != 1) {
            fp.l.b(arrayList);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
            pf5.z zVar = pf5.z.f435481a;
            if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            tj4.e eVar = ((com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ac) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ac.class)).f255264i;
            if (eVar != null) {
                eVar.f501362f = true;
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        mj4.k kVar = (mj4.k) hVar;
        arrayList3.add(kVar.h());
        if (kVar.p().length() == 0) {
            arrayList2.add(bk4.e1.f102993a.d());
        } else {
            arrayList2.add(kVar.p());
        }
        java.lang.String r17 = i65.a.r(context, com.p314xaae8f345.mm.R.C30867xcad56011.lpf);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r17, "getString(...)");
        arrayList.add(1, new tj4.a(r17, 0, arrayList3, arrayList2, xe0.j0.a(kVar, false, 1, null).f436758s, "0", kVar.f408600b.f76512x81959a6e));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        pf5.z zVar2 = pf5.z.f435481a;
        if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        tj4.e eVar2 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ac) zVar2.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ac.class)).f255264i;
        if (eVar2 == null) {
            return;
        }
        eVar2.f501361e = true;
    }

    public final int c() {
        if (this.f334883b == 0) {
            android.content.Context context = this.f334882a;
            int b17 = i65.a.b(context, 68);
            int b18 = i65.a.b(context, 64);
            int b19 = com.p314xaae8f345.mm.ui.bh.a(context).f278668a - i65.a.b(context, 72);
            int i17 = b19 / b17;
            int i18 = b19 / b18;
            if (i17 == i18) {
                this.f334883b = i17;
                f334878d = i65.a.b(context, 20);
            } else {
                int b27 = i65.a.b(context, 48);
                this.f334883b = i18;
                f334878d = (int) ((b19 / (i18 * 1.0f)) - b27);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopicSelfItemHelper", "getScreenSize >> " + this.f334883b + ' ' + f334878d);
        }
        int i19 = this.f334883b;
        if (i19 > 7) {
            return 7;
        }
        return i19;
    }
}
