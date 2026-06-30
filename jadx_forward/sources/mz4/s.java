package mz4;

/* loaded from: classes10.dex */
public class s extends java.lang.Thread {

    /* renamed from: r, reason: collision with root package name */
    public static final java.util.HashMap f414869r = new java.util.HashMap();

    /* renamed from: s, reason: collision with root package name */
    public static final java.lang.Object f414870s = new byte[0];

    /* renamed from: t, reason: collision with root package name */
    public static com.p314xaae8f345.mm.sdk.p2603x2137b148.i6 f414871t;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f414872d;

    /* renamed from: i, reason: collision with root package name */
    public final mz4.q f414877i;

    /* renamed from: m, reason: collision with root package name */
    public final iz4.k f414878m;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f414879n;

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.String f414880o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f414881p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f414882q = false;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f414873e = new java.util.ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f414874f = new java.util.ArrayList();

    /* renamed from: h, reason: collision with root package name */
    public final java.util.List f414876h = new java.util.ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.List f414875g = new java.util.ArrayList();

    public s(java.util.List list, java.lang.String str, java.lang.String str2, iz4.k kVar, mz4.q qVar) {
        this.f414872d = list;
        this.f414877i = qVar;
        this.f414878m = kVar;
        this.f414880o = str2;
        this.f414879n = str;
    }

    public final void a(int i17, java.lang.String str, java.lang.String str2, int i18, com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d c11120x15dce88d, android.content.Context context, java.lang.String str3) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NoteVideoCompress", "finish to import %s to %s | ret %d | duration %d", str2, str, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        synchronized (this) {
            ((java.util.ArrayList) this.f414873e).add(java.lang.Integer.valueOf(i17));
            ((java.util.ArrayList) this.f414874f).add(str);
            ((java.util.ArrayList) this.f414875g).add(str2);
            ((java.util.ArrayList) this.f414876h).add(java.lang.Integer.valueOf(i18));
        }
        if (i17 == -50002) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new mz4.p(this, context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.k76)));
        } else if (i17 == -50008) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new mz4.p(this, context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574977k74)));
        } else if (i17 == -50006) {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.NoteVideoCompress", "do insertVideoStorage, but file name is null");
            } else {
                t21.v2 v2Var = new t21.v2();
                v2Var.f496533a = str;
                v2Var.f496548m = 1;
                v2Var.f496552q = null;
                v2Var.f496554s = (java.lang.String) c01.d9.b().p().l(2, "");
                v2Var.f496545j = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1();
                v2Var.f496546k = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1();
                v2Var.f496558w = null;
                v2Var.f496557v = str2;
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
                    v2Var.f496555t = 1;
                }
                v2Var.f496541f = 0;
                ((vf0.w1) ((wf0.q1) i95.n0.c(wf0.q1.class))).getClass();
                t21.o2.Ui().x(v2Var, true);
            }
            if (f414871t == null) {
                f414871t = new com.p314xaae8f345.mm.sdk.p2603x2137b148.i6(5, "remuxing-thread-" + java.lang.System.currentTimeMillis(), 1, android.os.Looper.getMainLooper());
            }
            mz4.r rVar = new mz4.r(null);
            synchronized (f414870s) {
                f414869r.put(str, rVar);
            }
            rVar.f414859d = str;
            rVar.f414860e = str2;
            rVar.f414861f = this.f414880o;
            rVar.f414863h = c11120x15dce88d;
            rVar.f414868p = this.f414877i;
            rVar.f414864i = this.f414878m;
            f414871t.a(rVar);
        } else if (i17 < 0) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new mz4.p(this, context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574978k75)));
        } else {
            this.f414882q = true;
        }
        if (this.f414877i == null || this.f414881p) {
            return;
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new mz4.o(this, str3, i17));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:10|(2:12|(8:14|15|16|17|(1:19)(1:118)|20|(2:22|23)(4:25|(3:27|(1:29)(4:87|(1:89)(2:92|(2:109|91)(2:96|(4:101|(1:103)(1:108)|(1:105)(1:107)|106)(1:100)))|90|91)|30)(4:110|(1:112)(1:117)|113|(1:115)(1:116))|31|32)|24))|122|15|16|17|(0)(0)|20|(0)(0)|24|6) */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x00c4, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x00c5, code lost:
    
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.NoteVideoCompress", r0, "", new java.lang.Object[r11]);
        r0 = null;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:32:0x0224. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:118:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0302  */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void run() {
        /*
            Method dump skipped, instructions count: 870
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mz4.s.run():void");
    }
}
