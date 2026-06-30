package dk2;

/* loaded from: classes3.dex */
public final class x4 {
    public static final dk2.w4 C = new dk2.w4(null);
    public static final java.util.concurrent.ConcurrentHashMap D = new java.util.concurrent.ConcurrentHashMap();
    public long A;
    public r45.ta4 B;

    /* renamed from: a, reason: collision with root package name */
    public r45.h32 f315840a;

    /* renamed from: b, reason: collision with root package name */
    public r45.uy1 f315841b;

    /* renamed from: c, reason: collision with root package name */
    public java.util.LinkedList f315842c;

    /* renamed from: d, reason: collision with root package name */
    public r45.fd2 f315843d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.LinkedList f315844e;

    /* renamed from: f, reason: collision with root package name */
    public int f315845f;

    /* renamed from: g, reason: collision with root package name */
    public int f315846g;

    /* renamed from: h, reason: collision with root package name */
    public byte[] f315847h;

    /* renamed from: i, reason: collision with root package name */
    public int f315848i;

    /* renamed from: k, reason: collision with root package name */
    public int f315850k;

    /* renamed from: o, reason: collision with root package name */
    public int f315854o;

    /* renamed from: p, reason: collision with root package name */
    public r45.kd1 f315855p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f315856q;

    /* renamed from: r, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 f315857r;

    /* renamed from: s, reason: collision with root package name */
    public r45.gy0 f315858s;

    /* renamed from: t, reason: collision with root package name */
    public int f315859t;

    /* renamed from: w, reason: collision with root package name */
    public r45.q92 f315862w;

    /* renamed from: x, reason: collision with root package name */
    public android.os.Bundle f315863x;

    /* renamed from: j, reason: collision with root package name */
    public int f315849j = -1;

    /* renamed from: l, reason: collision with root package name */
    public java.util.ArrayList f315851l = new java.util.ArrayList();

    /* renamed from: m, reason: collision with root package name */
    public int f315852m = -1;

    /* renamed from: n, reason: collision with root package name */
    public int f315853n = -1;

    /* renamed from: u, reason: collision with root package name */
    public final java.util.ArrayList f315860u = new java.util.ArrayList();

    /* renamed from: v, reason: collision with root package name */
    public final java.util.HashMap f315861v = new java.util.HashMap();

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f315864y = "";

    /* renamed from: z, reason: collision with root package name */
    public java.lang.String f315865z = "";

    public final void a(android.content.Intent intent, long j17) {
        java.lang.String stringExtra = intent != null ? intent.getStringExtra("key_enter_live_export_id") : null;
        if (!(stringExtra == null || stringExtra.length() == 0)) {
            this.f315861v.put(java.lang.Long.valueOf(j17), stringExtra);
        }
        java.util.ArrayList arrayList = this.f315860u;
        arrayList.clear();
        java.util.ArrayList<java.lang.String> stringArrayListExtra = intent != null ? intent.getStringArrayListExtra("key_enter_live_export_id_list") : null;
        if (stringArrayListExtra == null || stringArrayListExtra.isEmpty()) {
            return;
        }
        arrayList.addAll(stringArrayListExtra);
    }

    public final void b(android.content.Intent intent) {
        java.lang.String str;
        int intExtra = intent != null ? intent.getIntExtra("key_enter_live_param_by_pass_type", 0) : 0;
        if (intent == null || (str = intent.getStringExtra("key_enter_live_param_by_pass_info")) == null) {
            str = "";
        }
        r45.gy0 gy0Var = new r45.gy0();
        gy0Var.set(0, java.lang.Integer.valueOf(intExtra));
        gy0Var.set(1, com.p314xaae8f345.mm.p2495xc50a8b8b.g.c(str));
        this.f315858s = gy0Var;
    }

    public final void c(android.content.Intent intent) {
        int i17 = 1;
        if (intent != null && intent.hasExtra("key_enter_live_param_pull_more_type")) {
            this.f315853n = intent.getIntExtra("key_enter_live_param_pull_more_type", -1);
            return;
        }
        int intExtra = intent != null ? intent.getIntExtra("key_enter_live_param_visitor_enter_scene", 0) : 0;
        this.f315859t = intExtra;
        if (intExtra != 3 && intExtra != 4) {
            i17 = this.f315853n;
        }
        this.f315853n = i17;
    }

    public final com.p314xaae8f345.mm.p820x32b0ec.api.C10828x8f239b6e d() {
        return (com.p314xaae8f345.mm.p820x32b0ec.api.C10828x8f239b6e) kz5.n0.a0(this.f315851l, this.f315848i);
    }

    /* renamed from: toString */
    public java.lang.String m124684x9616526c() {
        java.lang.String stringBuffer;
        java.lang.String str;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("FinderLiveConfig:");
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("[tabType:");
        sb7.append(this.f315849j);
        sb7.append(",commentScene:");
        sb7.append(this.f315850k);
        sb7.append(",curPos:");
        sb7.append(this.f315848i);
        sb7.append(",bindShop:false,nicknameOption:");
        sb7.append(this.f315864y);
        sb7.append(", dataList:");
        int size = this.f315851l.size();
        if (size <= 0) {
            stringBuffer = "empty";
        } else {
            java.lang.StringBuffer stringBuffer2 = new java.lang.StringBuffer();
            stringBuffer2.append("count:" + size + ' ');
            int i17 = 0;
            for (java.lang.Object obj : this.f315851l) {
                int i18 = i17 + 1;
                java.lang.String str2 = null;
                if (i17 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                com.p314xaae8f345.mm.p820x32b0ec.api.C10828x8f239b6e c10828x8f239b6e = (com.p314xaae8f345.mm.p820x32b0ec.api.C10828x8f239b6e) obj;
                java.lang.StringBuilder sb8 = new java.lang.StringBuilder("##live_");
                sb8.append(i17);
                sb8.append(":username:");
                sb8.append(c10828x8f239b6e != null ? c10828x8f239b6e.f150075m : null);
                sb8.append(",liveId:");
                sb8.append(c10828x8f239b6e != null ? java.lang.Long.valueOf(c10828x8f239b6e.f150070e) : null);
                sb8.append(", nick:");
                sb8.append(c10828x8f239b6e != null ? c10828x8f239b6e.M : null);
                sb8.append(" desc:");
                sb8.append(c10828x8f239b6e != null ? c10828x8f239b6e.f150084u : null);
                sb8.append(" sessionBuffer:");
                sb8.append((c10828x8f239b6e == null || (str = c10828x8f239b6e.F) == null) ? null : pm0.v.e0(str, 0, 10));
                sb8.append("...,streamUrl:");
                if (c10828x8f239b6e != null) {
                    str2 = c10828x8f239b6e.f150078p;
                }
                sb8.append(str2);
                sb8.append(';');
                stringBuffer2.append(sb8.toString());
                i17 = i18;
            }
            stringBuffer = stringBuffer2.toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(stringBuffer, "toString(...)");
        }
        sb7.append(stringBuffer);
        sb7.append(",pullMoreType:");
        sb7.append(this.f315853n);
        sb6.append(sb7.toString());
        java.lang.String sb9 = sb6.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(sb9, "toString(...)");
        return sb9;
    }
}
