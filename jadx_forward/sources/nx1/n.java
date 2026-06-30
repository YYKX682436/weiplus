package nx1;

/* loaded from: classes10.dex */
public class n extends java.lang.Thread implements java.lang.Runnable {

    /* renamed from: r, reason: collision with root package name */
    public static final java.util.HashMap f422834r = new java.util.HashMap();

    /* renamed from: s, reason: collision with root package name */
    public static final java.lang.Object f422835s = new byte[0];

    /* renamed from: t, reason: collision with root package name */
    public static com.p314xaae8f345.mm.sdk.p2603x2137b148.i6 f422836t;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f422837d;

    /* renamed from: i, reason: collision with root package name */
    public final nx1.o f422842i;

    /* renamed from: m, reason: collision with root package name */
    public final ix1.i f422843m;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f422844n;

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.String f422845o;

    /* renamed from: p, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.z2 f422846p = new com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.z2();

    /* renamed from: q, reason: collision with root package name */
    public boolean f422847q = false;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f422838e = new java.util.ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f422839f = new java.util.ArrayList();

    /* renamed from: h, reason: collision with root package name */
    public final java.util.List f422841h = new java.util.ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.List f422840g = new java.util.ArrayList();

    public n(java.util.List list, java.lang.String str, java.lang.String str2, ix1.i iVar, nx1.o oVar) {
        this.f422837d = list;
        this.f422842i = oVar;
        this.f422843m = iVar;
        this.f422845o = str2;
        this.f422844n = str;
    }

    public final void a(int i17, java.lang.String str, java.lang.String str2, int i18, com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d c11120x15dce88d, android.content.Context context, java.lang.String str3) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EditorVideoCompress", "finish to import %s to %s | ret %d | duration %d", str2, str, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        synchronized (this) {
            ((java.util.ArrayList) this.f422838e).add(java.lang.Integer.valueOf(i17));
            ((java.util.ArrayList) this.f422839f).add(str);
            ((java.util.ArrayList) this.f422840g).add(str2);
            ((java.util.ArrayList) this.f422841h).add(java.lang.Integer.valueOf(i18));
        }
        if (i17 != -50002 && i17 != -50008) {
            if (i17 == -50006) {
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.EditorVideoCompress", "do insertVideoStorage, but file name is null");
                } else {
                    t21.v2 v2Var = new t21.v2();
                    v2Var.f496533a = str;
                    v2Var.f496548m = 1;
                    v2Var.f496552q = null;
                    v2Var.f496554s = (java.lang.String) gm0.j1.u().c().l(2, "");
                    v2Var.f496545j = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1();
                    v2Var.f496546k = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1();
                    v2Var.f496558w = null;
                    v2Var.f496557v = str2;
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
                        v2Var.f496555t = 1;
                    }
                    v2Var.f496541f = 0;
                    t21.o2.Ui().x(v2Var, true);
                }
                if (f422836t == null) {
                    f422836t = new com.p314xaae8f345.mm.sdk.p2603x2137b148.i6(10, "remuxing-thread-" + java.lang.System.currentTimeMillis(), 1, android.os.Looper.getMainLooper());
                }
                nx1.m mVar = new nx1.m(null);
                synchronized (f422835s) {
                    f422834r.put(str, mVar);
                }
                mVar.f270757d = str;
                mVar.f270758e = str2;
                mVar.f270759f = this.f422845o;
                mVar.f270764n = c11120x15dce88d;
                mVar.f270762i = 1;
                mVar.f422833z = this.f422842i;
                mVar.f422832y = this.f422843m;
                mVar.f270772v = com.p314xaae8f345.mm.p962x4177e4be.j.h(str2);
                new java.util.ArrayList();
                new java.util.ArrayList();
                mVar.f270765o = this.f422846p.f271042a;
                f422836t.a(mVar);
            } else if (i17 >= 0) {
                this.f422847q = true;
            }
        }
        if (this.f422842i != null) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new nx1.l(this, i17, str3));
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:8|(2:10|(8:12|13|14|15|(1:17)(1:139)|18|(2:20|21)(4:23|(4:25|(1:27)(2:86|(1:88)(6:89|(1:91)(1:131)|92|(6:119|(1:121)|122|(1:124)|(1:130)(1:128)|129)(1:95)|96|(2:115|(2:117|29)(3:118|102|29))(2:99|(3:101|102|29)(4:103|(1:105)(4:107|(1:109)(1:114)|(1:111)(1:113)|112)|106|29))))|28|29)(5:132|(1:134)|135|(1:137)|138)|30|31)|22))|143|13|14|15|(0)(0)|18|(0)(0)|22|6) */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x00c1, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x00c2, code lost:
    
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.EditorVideoCompress", r0, "", new java.lang.Object[r11]);
        r0 = null;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:31:0x02bc. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:139:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x036e  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x038a  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0399  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x039e  */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void run() {
        /*
            Method dump skipped, instructions count: 1038
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: nx1.n.run():void");
    }
}
