package wd;

/* loaded from: classes7.dex */
public class c implements e8.d {

    /* renamed from: a, reason: collision with root package name */
    public boolean f526207a;

    /* renamed from: e, reason: collision with root package name */
    public java.util.ArrayList f526211e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f526212f;

    /* renamed from: g, reason: collision with root package name */
    public int f526213g;

    /* renamed from: h, reason: collision with root package name */
    public double f526214h;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.ref.WeakReference f526208b = null;

    /* renamed from: c, reason: collision with root package name */
    public com.p171xb5c11be3.p172x30254a24.p173x79eeb384.C1591x6c90f41d f526209c = null;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f526210d = "";

    /* renamed from: i, reason: collision with root package name */
    public int f526215i = 1004;

    public static void c(wd.c cVar, java.lang.String str, e8.a aVar) {
        cVar.getClass();
        if (!aVar.f331520g.equalsIgnoreCase("base64")) {
            cVar.f526211e.add(str);
            ((ch1.d) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1182xed8e89a9.c) nd.f.d(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1182xed8e89a9.c.class, true))).c(18076, str, aVar.f331520g, cVar.f526210d, java.lang.Integer.valueOf(cVar.f526215i), java.lang.Long.valueOf(aVar.f331514a), java.lang.Long.valueOf(aVar.f331518e), java.lang.Long.valueOf(aVar.f331519f));
            return;
        }
        char[] cArr = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.f274579a;
        cVar.f526211e.add(com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.b(str.getBytes()));
        ((ch1.d) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1182xed8e89a9.c) nd.f.d(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1182xed8e89a9.c.class, true))).c(18076, "", aVar.f331520g, cVar.f526210d, java.lang.Integer.valueOf(cVar.f526215i), java.lang.Long.valueOf(aVar.f331514a), java.lang.Long.valueOf(aVar.f331518e), java.lang.Long.valueOf(aVar.f331519f));
    }

    @Override // e8.d
    public void a(java.lang.String str, e8.c cVar, e8.a aVar) {
        int ordinal = cVar.ordinal();
        yd.q qVar = yd.q.ERROR;
        switch (ordinal) {
            case 0:
                fe.g a17 = fe.g.a(this.f526210d);
                long j17 = aVar.f331514a;
                long j18 = aVar.f331515b;
                a17.getClass();
                ((ku5.t0) ku5.t0.f394148d).g(new fe.d(a17, j17));
                a17.f342894i.add(java.lang.Long.valueOf(j18));
                ((ku5.t0) ku5.t0.f394148d).g(new wd.b(this, str, aVar));
                if (aVar.f331515b >= 1000) {
                    e(11);
                    return;
                }
                return;
            case 1:
                if (android.text.TextUtils.isEmpty(aVar.f331521h)) {
                    d(str, qVar, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572159a13));
                } else {
                    d(str, qVar, java.lang.String.format("%s: %s", com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572159a13), aVar.f331521h));
                }
                e(7);
                return;
            case 2:
                d(str, qVar, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572160a14));
                e(5);
                return;
            case 3:
            case 9:
            default:
                return;
            case 4:
                d(str, qVar, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.a0z));
                e(0);
                return;
            case 5:
                d(str, qVar, java.lang.String.format(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572161a15), java.lang.Integer.valueOf(aVar.f331516c), java.lang.Integer.valueOf(aVar.f331517d), java.lang.Long.valueOf(aVar.f331519f), java.lang.Long.valueOf(aVar.f331518e)));
                e(3);
                return;
            case 6:
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MBImageDecodeRegistry", "IOEXCEPTION path:%s", str);
                d(str, qVar, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572156a10));
                e(4);
                return;
            case 7:
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MBImageDecodeRegistry", "OUT_OF_MEMORY path:%s", str);
                d(str, qVar, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572157a11));
                e(1);
                return;
            case 8:
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MBImageDecodeRegistry", "USE_LEGACY path:%s", str);
                e(8);
                return;
            case 10:
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MBImageDecodeRegistry", "NATIVE_DECODE_ERROR path:%s", str);
                d(str, qVar, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.a0y));
                e(5);
                return;
            case 11:
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MBImageDecodeRegistry", "THROW_EXCEPTION path:%s", str);
                d(str, qVar, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572158a12));
                e(16);
                return;
        }
    }

    @Override // e8.d
    public void b(java.lang.String str, java.lang.Object obj, e8.e eVar, com.p171xb5c11be3.p172x30254a24.p173x79eeb384.C1592x888963ab c1592x888963ab) {
    }

    public final void d(java.lang.String str, yd.q qVar, java.lang.String str2) {
        if (this.f526208b.get() != null) {
            ((ae.a) ((ae.q) this.f526208b.get())).F0().a(qVar, str + ": " + str2);
        }
    }

    public final void e(int i17) {
        ((ch1.c) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1182xed8e89a9.a) nd.f.d(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1182xed8e89a9.a.class, true))).c(807L, i17, 1L, false);
    }
}
