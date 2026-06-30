package zs5;

/* loaded from: classes15.dex */
public class u0 {

    /* renamed from: h, reason: collision with root package name */
    public static final zs5.u0 f557018h = new zs5.u0();

    /* renamed from: i, reason: collision with root package name */
    public static f04.j f557019i = null;

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Map f557020a = new java.util.HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final java.util.Map f557021b = new java.util.HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final java.util.Map f557022c = new java.util.HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Object f557023d = new java.lang.Object();

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.Object f557024e = new java.lang.Object();

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f557025f = "";

    /* renamed from: g, reason: collision with root package name */
    public final java.util.concurrent.Executor f557026g = qo.q.f446854a.a("MicroMsg.WxFileDecodeQueue", null);

    public u0() {
        com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.C4679x33de8120.f19966x4fbc8495.mo40973x40b15f2e(new zs5.r0(this));
    }

    public static android.graphics.Bitmap c(java.lang.String str, kd0.b3 b3Var) {
        int i17;
        try {
            if (f557019i == null) {
                f557019i = new f04.e();
            }
            f04.c cVar = new f04.c(str);
            cVar.f339953c = b3Var != null && b3Var.f388141e;
            f04.i a17 = f04.f.a(cVar, f557019i);
            android.graphics.Point point = a17.f339959b;
            if (point != null && b3Var != null && ((i17 = b3Var.f388142f) == 2 || i17 == 4)) {
                zs5.j0 j0Var = zs5.j0.Q;
                int i18 = point.x;
                int i19 = point.y;
                j0Var.getClass();
                j0Var.f556957h = new android.graphics.Point(i18, i19);
            }
            return a17.f339958a;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WxFileDecodeQueue", e17, "[scanDecode-file] decode file to bitmap error!", new java.lang.Object[0]);
            return null;
        }
    }

    public void a(android.content.Context context, long j17, java.lang.String str, kd0.a3 a3Var) {
        kd0.b3 b3Var = new kd0.b3();
        b3Var.f388137a = j17;
        b3Var.f388138b = str;
        b3Var.f388140d = new int[]{0};
        b(b3Var, a3Var);
    }

    public void b(kd0.b3 b3Var, kd0.a3 a3Var) {
        synchronized (this.f557023d) {
            long j17 = b3Var.f388137a;
            int size = ((java.util.HashMap) this.f557020a).size();
            if (size < 9) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxFileDecodeQueue", "[scanDecode-file] addDecodeTask submit decode task %d, fileMap: %d", java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(size));
                java.lang.String str = b3Var.f388138b;
                ((java.util.HashMap) this.f557020a).put(java.lang.Long.valueOf(j17), str);
                if (a3Var != null) {
                    ((java.util.HashMap) this.f557021b).put(java.lang.Long.valueOf(j17), a3Var);
                }
                if (!((java.util.HashMap) this.f557022c).containsKey(str)) {
                    ((java.util.HashMap) this.f557022c).put(str, new java.util.ArrayList());
                    com.p314xaae8f345.p2891x34da02.C25307xad2910d9 Ai = ((jd0.l2) ((kd0.w2) i95.n0.c(kd0.w2.class))).Ai(1, false);
                    this.f557025f = Ai != null ? Ai.f45395xc84327b2 : "";
                    this.f557026g.execute(new zs5.t0(this, Ai, b3Var));
                }
                ((java.util.List) ((java.util.HashMap) this.f557022c).get(str)).add(java.lang.Long.valueOf(j17));
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WxFileDecodeQueue", "[scanDecode-file] too many files are waiting and ignore: %d", java.lang.Long.valueOf(j17));
                a3Var.a(j17, null);
            }
        }
    }

    public java.util.List d(android.content.Context context, java.util.List list) {
        java.util.ArrayList arrayList;
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        if (list == null || list.isEmpty()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WxFileDecodeQueue", "[scanDecode-file] directScanCodeForFile imagePathList is empty");
            return null;
        }
        synchronized (this.f557024e) {
            e04.f2.a(null);
            zs5.q0 q0Var = zs5.q0.f556994a;
            ((yz3.w) ((ry3.j) i95.n0.c(ry3.j.class))).getClass();
            if (e04.v3.f327671a == null) {
                e04.v3.h();
            }
            q0Var.b(e04.v3.f327671a.booleanValue());
            arrayList = new java.util.ArrayList();
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                java.lang.String str2 = (java.lang.String) it.next();
                kd0.c3 c3Var = new kd0.c3();
                kd0.b3 b3Var = new kd0.b3();
                android.graphics.Bitmap c17 = c(str2, b3Var);
                if (c17 != null) {
                    int[] iArr = {0};
                    ry3.s sVar = new ry3.s(1);
                    com.p314xaae8f345.p2891x34da02.C25307xad2910d9 Ai = ((jd0.l2) ((kd0.w2) i95.n0.c(kd0.w2.class))).Ai(1, false);
                    sVar.f483089b = Ai;
                    sVar.f483092e = iArr;
                    this.f557025f = Ai != null ? Ai.f45395xc84327b2 : "";
                    zs5.q0 q0Var2 = zs5.q0.f556994a;
                    if (!q0Var2.d()) {
                        q0Var2.c(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 1, sVar);
                    }
                    if (q0Var2.d()) {
                        q0Var2.a(iArr);
                    }
                    int[] iArr2 = new int[c17.getWidth() * c17.getHeight()];
                    c17.getPixels(iArr2, 0, c17.getWidth(), 0, 0, c17.getWidth(), c17.getHeight());
                    c3Var.f388155b = new java.util.ArrayList();
                    c3Var.f388156c = new java.util.ArrayList();
                    android.graphics.Point point = new android.graphics.Point(c17.getWidth(), c17.getHeight());
                    c3Var.f388157d = point;
                    zs5.b0 e17 = q0Var2.e(iArr2, point, null, c3Var.f388155b, c3Var.f388156c);
                    java.util.List list2 = e17 != null ? e17.f556857a : null;
                    c3Var.f388154a = list2;
                    c3Var.f388158e = b3Var.f388142f;
                    java.lang.Object[] objArr = new java.lang.Object[1];
                    objArr[0] = java.lang.Integer.valueOf(list2 == null ? 0 : list2.size());
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxFileDecodeQueue", "[scanDecode-file] directScanCodeForFile get %d decode results", objArr);
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WxFileDecodeQueue", "[scanDecode-file] directScanCodeForFile bitmap == null, imagePath:%s", str2);
                }
                arrayList.add(c3Var);
            }
            zs5.q0 q0Var3 = zs5.q0.f556994a;
            if (q0Var3.d()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxFileDecodeQueue", "[scanDecode-file] directScanCodeForFile release QBar");
                q0Var3.mo142436x41012807();
            }
        }
        return arrayList;
    }

    public void e() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxFileDecodeQueue", "releaseWxFileQRCodeDecoder");
        this.f557026g.execute(new zs5.s0(this));
    }
}
