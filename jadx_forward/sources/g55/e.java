package g55;

/* loaded from: classes8.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f350495a;

    /* renamed from: b, reason: collision with root package name */
    public final jz5.g f350496b;

    /* renamed from: c, reason: collision with root package name */
    public long f350497c;

    /* renamed from: d, reason: collision with root package name */
    public int f350498d;

    /* renamed from: e, reason: collision with root package name */
    public long f350499e;

    /* renamed from: f, reason: collision with root package name */
    public long f350500f;

    /* renamed from: g, reason: collision with root package name */
    public long f350501g;

    /* renamed from: h, reason: collision with root package name */
    public long f350502h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f350503i;

    /* renamed from: j, reason: collision with root package name */
    public final jz5.g f350504j;

    /* renamed from: k, reason: collision with root package name */
    public long f350505k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f350506l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f350507m;

    public e(java.lang.String redDotKey) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(redDotKey, "redDotKey");
        this.f350495a = redDotKey;
        this.f350496b = jz5.h.b(g55.b.f350492d);
        this.f350503i = jz5.h.b(g55.c.f350493d);
        this.f350504j = jz5.h.b(g55.a.f350491d);
    }

    public static java.util.Map c(g55.e eVar, java.lang.Long l17, long j17, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getRedDotInfoParams");
        }
        eVar.getClass();
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        linkedHashMap.putAll(eVar.d());
        long j18 = eVar.f350499e;
        long j19 = eVar.f350501g;
        if (l17 != null) {
            j18 += l17.longValue() - eVar.f350505k;
            if (j19 == 0) {
                j19 = l17.longValue() - eVar.f350505k;
            }
        }
        linkedHashMap.put("exposure_time", java.lang.Long.valueOf(j18));
        java.lang.String str = eVar.f350495a;
        linkedHashMap.put("red_dot_key", str);
        linkedHashMap.put("first_exposure_time", java.lang.Long.valueOf(eVar.f350500f));
        linkedHashMap.put("disappear_time", java.lang.Long.valueOf(eVar.f350502h));
        linkedHashMap.put("exposure_cnt", java.lang.Integer.valueOf(eVar.f350498d));
        linkedHashMap.put("cur_exposure_time", java.lang.Long.valueOf(j19));
        linkedHashMap.put("entry_key", e55.e.f331200a.a(str));
        return linkedHashMap;
    }

    public java.util.Map a() {
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        linkedHashMap.putAll(c(this, null, 0L, 2, null));
        if (!b().isEmpty()) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            i55.e eVar = (i55.e) ((g55.i) kz5.n0.i0(b()));
            eVar.getClass();
            java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap();
            java.util.LinkedHashMap linkedHashMap3 = new java.util.LinkedHashMap();
            linkedHashMap3.put("start_time", java.lang.Long.valueOf(eVar.f350531a));
            linkedHashMap3.put("end_time", java.lang.Long.valueOf(eVar.f350532b));
            linkedHashMap3.put("stay_time", java.lang.Long.valueOf(eVar.f350533c));
            linkedHashMap2.putAll(linkedHashMap3);
            linkedHashMap2.put("red_dot_text", eVar.f370377e);
            linkedHashMap2.put("red_dot_unread", java.lang.Integer.valueOf(eVar.f370378f));
            arrayList.add(linkedHashMap2);
            linkedHashMap.put("red_dot_change_list", arrayList);
        }
        return linkedHashMap;
    }

    public final java.util.ArrayList b() {
        return (java.util.ArrayList) ((jz5.n) this.f350496b).mo141623x754a37bb();
    }

    public final java.util.Map d() {
        return (java.util.Map) ((jz5.n) this.f350503i).mo141623x754a37bb();
    }

    public final void e(long j17, java.util.Map map) {
        this.f350506l = true;
        if (this.f350500f == 0) {
            this.f350500f = j17;
        }
        if (map != null) {
            d().putAll(map);
        }
        if (j17 > this.f350505k) {
            this.f350505k = j17;
        }
        this.f350498d++;
        g55.i iVar = (g55.i) kz5.n0.k0(b());
        if (iVar != null) {
            iVar.f350534d = j17;
        }
    }

    public final void f(long j17, java.util.Map map) {
        this.f350506l = false;
        if (map != null) {
            d().putAll(map);
        }
        long j18 = this.f350505k;
        if (j17 > j18) {
            long j19 = j17 - j18;
            this.f350501g = j19;
            this.f350499e += j19;
            this.f350505k = 0L;
        }
        g55.i iVar = (g55.i) kz5.n0.k0(b());
        if (iVar != null) {
            iVar.f350532b = j17;
            iVar.f350533c += j17 - iVar.f350534d;
            iVar.f350534d = 0L;
        }
    }

    public final void g(g55.g info) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        jz5.g gVar = this.f350504j;
        if (((java.util.ArrayList) ((jz5.n) gVar).mo141623x754a37bb()).size() > 5) {
            ((java.util.ArrayList) ((jz5.n) gVar).mo141623x754a37bb()).remove(0);
        }
        ((java.util.ArrayList) ((jz5.n) gVar).mo141623x754a37bb()).add(info);
    }

    /* renamed from: toString */
    public java.lang.String m130926x9616526c() {
        java.util.Iterator it = b().iterator();
        java.lang.String str = "";
        while (it.hasNext()) {
            str = str + '_' + ((g55.i) it.next());
        }
        return "curReportKey = " + this.f350495a + " \nexposureStayTime = " + this.f350499e + " \ncurExposureStayTime = " + this.f350501g + " \nfirstExposureTime = " + this.f350500f + " \ndisappearTime = " + this.f350502h + " \nexposureCnt = " + this.f350498d + " \ndisappearInfoList = " + ((java.util.ArrayList) ((jz5.n) this.f350504j).mo141623x754a37bb()) + " \nchangeList = " + str + " \nparamsInfo = " + kz5.n0.g0(d().entrySet(), ",", "{", "}", 0, null, g55.d.f350494d, 24, null) + " \n";
    }
}
