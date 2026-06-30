package bx0;

/* loaded from: classes5.dex */
public final class f implements tg.a {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.p457x3304c6.p479x4179489f.C4167x88133861 f117782a;

    /* renamed from: b, reason: collision with root package name */
    public final bx0.d f117783b;

    /* renamed from: c, reason: collision with root package name */
    public final bx0.i f117784c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f117785d;

    /* renamed from: e, reason: collision with root package name */
    public final float f117786e;

    /* renamed from: f, reason: collision with root package name */
    public final double f117787f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.p457x3304c6.p479x4179489f.p480xbddafb2a.C4176xaeba704a f117788g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.p457x3304c6.p479x4179489f.p480xbddafb2a.C4176xaeba704a f117789h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.p457x3304c6.p479x4179489f.p480xbddafb2a.C4176xaeba704a f117790i;

    /* renamed from: j, reason: collision with root package name */
    public com.p314xaae8f345.p457x3304c6.p479x4179489f.p480xbddafb2a.C4176xaeba704a f117791j;

    /* renamed from: k, reason: collision with root package name */
    public com.p314xaae8f345.p457x3304c6.p479x4179489f.p480xbddafb2a.C4176xaeba704a f117792k;

    /* renamed from: l, reason: collision with root package name */
    public final java.util.Map f117793l;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.Map f117794m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.Map f117795n;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.Map f117796o;

    /* renamed from: p, reason: collision with root package name */
    public final java.util.Map f117797p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f117798q;

    /* renamed from: r, reason: collision with root package name */
    public e3.d f117799r;

    /* renamed from: s, reason: collision with root package name */
    public final com.p314xaae8f345.p457x3304c6.p479x4179489f.p480xbddafb2a.C4177x7c871c35 f117800s;

    /* renamed from: t, reason: collision with root package name */
    public final int f117801t;

    /* renamed from: u, reason: collision with root package name */
    public final float f117802u;

    /* renamed from: v, reason: collision with root package name */
    public final float f117803v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f117804w;

    /* renamed from: x, reason: collision with root package name */
    public final bx0.e f117805x;

    public f(com.p314xaae8f345.p457x3304c6.p479x4179489f.C4167x88133861 timeline, bx0.d dataSource, boolean z17, bx0.j uiStyle, bx0.i layoutType, boolean z18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(timeline, "timeline");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dataSource, "dataSource");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(uiStyle, "uiStyle");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(layoutType, "layoutType");
        this.f117782a = timeline;
        this.f117783b = dataSource;
        this.f117784c = layoutType;
        this.f117785d = z18;
        this.f117786e = 1.0f;
        double d17 = android.content.res.Resources.getSystem().getDisplayMetrics().density;
        this.f117787f = d17;
        com.p314xaae8f345.p457x3304c6.p479x4179489f.p480xbddafb2a.C4176xaeba704a.c();
        this.f117788g = com.p314xaae8f345.p457x3304c6.p479x4179489f.p480xbddafb2a.C4176xaeba704a.c();
        this.f117789h = com.p314xaae8f345.p457x3304c6.p479x4179489f.p480xbddafb2a.C4176xaeba704a.c();
        com.p314xaae8f345.p457x3304c6.p479x4179489f.p480xbddafb2a.C4176xaeba704a.c();
        this.f117790i = com.p314xaae8f345.p457x3304c6.p479x4179489f.p480xbddafb2a.C4176xaeba704a.c();
        this.f117791j = com.p314xaae8f345.p457x3304c6.p479x4179489f.p480xbddafb2a.C4176xaeba704a.c();
        this.f117792k = com.p314xaae8f345.p457x3304c6.p479x4179489f.p480xbddafb2a.C4176xaeba704a.c();
        this.f117793l = new java.util.LinkedHashMap();
        this.f117794m = new java.util.LinkedHashMap();
        this.f117795n = new java.util.LinkedHashMap();
        this.f117796o = new java.util.LinkedHashMap();
        this.f117797p = new java.util.LinkedHashMap();
        this.f117798q = true;
        this.f117799r = e3.d.f328576e;
        com.p314xaae8f345.p457x3304c6.p479x4179489f.p480xbddafb2a.C4177x7c871c35 c4177x7c871c35 = new com.p314xaae8f345.p457x3304c6.p479x4179489f.p480xbddafb2a.C4177x7c871c35();
        c4177x7c871c35.m34348x683d6267(this);
        this.f117800s = c4177x7c871c35;
        this.f117801t = z17 ? (int) (50.0f * d17) : uiStyle.f117829b;
        float f17 = (int) d17;
        this.f117802u = 24.0f * f17;
        this.f117803v = f17 * 22.0f;
        ((yy0.m0) ((pp0.h0) i95.n0.c(pp0.h0.class))).getClass();
        this.f117804w = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).nj(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2545xe20e94ff.p2546x5be56f80.C20409x535179f3()) == 1;
        this.f117805x = bx0.e.f117780d;
    }

    public final void a(com.p314xaae8f345.p457x3304c6.p479x4179489f.C4160xdd704649 c4160xdd704649) {
        java.util.ArrayList arrayList;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(c4160xdd704649, "<this>");
        ug.l lVar = new ug.l();
        int p17 = c4160xdd704649.p();
        int i17 = 0;
        while (true) {
            arrayList = lVar.f508964a;
            if (i17 >= p17) {
                break;
            }
            com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4190xd8dd3713 o17 = c4160xdd704649.o(i17);
            if (o17 != null && o17.C() == ug.m.Caption) {
                arrayList.add(o17);
            }
            i17++;
        }
        if (!(!arrayList.isEmpty())) {
            lVar = null;
        }
        if (lVar == null || this.f117791j.a()) {
            return;
        }
        com.p314xaae8f345.p457x3304c6.p479x4179489f.p480xbddafb2a.C4176xaeba704a c4176xaeba704a = this.f117791j;
        double d17 = c4176xaeba704a.f130042a;
        double d18 = c4176xaeba704a.f130043b;
        java.util.Iterator it = lVar.f508964a.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4190xd8dd3713 c4190xd8dd3713 = (com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4190xd8dd3713) it.next();
            com.p314xaae8f345.p457x3304c6.p479x4179489f.p480xbddafb2a.C4176xaeba704a b17 = this.f117800s.m34346xcb0defcb(c4190xd8dd3713.B()).b();
            android.graphics.Rect a17 = bx0.b.a(b17.f130042a, d17, b17.f130043b, d18);
            java.util.Map map = this.f117795n;
            com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 c3971x241f78 = c4190xd8dd3713.f130065a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c3971x241f78, "getSegmentID(...)");
            map.put(c3971x241f78, a17);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x019b, code lost:
    
        if (r2 != null) goto L58;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b() {
        /*
            Method dump skipped, instructions count: 1248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bx0.f.b():void");
    }

    public final void c(com.p314xaae8f345.p457x3304c6.p479x4179489f.C4160xdd704649 c4160xdd704649) {
        java.util.ArrayList arrayList;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(c4160xdd704649, "<this>");
        ug.l lVar = new ug.l();
        int p17 = c4160xdd704649.p();
        int i17 = 0;
        while (true) {
            arrayList = lVar.f508964a;
            if (i17 >= p17) {
                break;
            }
            com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4190xd8dd3713 o17 = c4160xdd704649.o(i17);
            if (o17 != null && o17.C() == ug.m.Narration) {
                arrayList.add(o17);
            }
            i17++;
        }
        if (!(!arrayList.isEmpty())) {
            lVar = null;
        }
        if (lVar == null || this.f117790i.a()) {
            return;
        }
        com.p314xaae8f345.p457x3304c6.p479x4179489f.p480xbddafb2a.C4176xaeba704a c4176xaeba704a = this.f117790i;
        double d17 = c4176xaeba704a.f130042a;
        double d18 = c4176xaeba704a.f130043b;
        java.util.Iterator it = lVar.f508964a.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4190xd8dd3713 c4190xd8dd3713 = (com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4190xd8dd3713) it.next();
            com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a m34007xde00a612 = c4160xdd704649.n().m34007xde00a612();
            com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a A = c4190xd8dd3713.A();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(A, "getPresentationStartTime(...)");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m34007xde00a612);
            com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a b17 = ou0.f.b(A, m34007xde00a612);
            com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a m34007xde00a6122 = c4190xd8dd3713.B().m34007xde00a612();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m34007xde00a6122, "getEndTime(...)");
            com.p314xaae8f345.p457x3304c6.p479x4179489f.p480xbddafb2a.C4176xaeba704a b18 = this.f117800s.m34346xcb0defcb(new com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4129xdee64553(b17, ou0.f.b(m34007xde00a6122, m34007xde00a612).sub(b17))).b();
            android.graphics.Rect a17 = bx0.b.a(b18.f130042a, d17, b18.f130043b, d18);
            java.util.Map map = this.f117795n;
            com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 c3971x241f78 = c4190xd8dd3713.f130065a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c3971x241f78, "getSegmentID(...)");
            map.put(c3971x241f78, a17);
        }
    }

    public final android.graphics.Rect d(com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 segmentID) {
        android.graphics.Rect rect;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(segmentID, "segmentID");
        java.util.Map map = this.f117795n;
        return (map.containsKey(segmentID) && (rect = (android.graphics.Rect) ((java.util.LinkedHashMap) map).get(segmentID)) != null) ? rect : new android.graphics.Rect(0, 0, 0, 0);
    }

    public final boolean e() {
        return this.f117782a.f129947a.p() == 0;
    }
}
