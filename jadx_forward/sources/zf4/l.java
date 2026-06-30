package zf4;

@j95.b
/* loaded from: classes13.dex */
public class l extends i95.w implements c01.t8, ct.i3 {

    /* renamed from: i, reason: collision with root package name */
    public static final java.util.HashMap f554204i;

    /* renamed from: d, reason: collision with root package name */
    public zf4.b0 f554205d;

    /* renamed from: e, reason: collision with root package name */
    public x51.k0 f554206e;

    /* renamed from: f, reason: collision with root package name */
    public zf4.a0 f554207f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.List f554208g = new java.util.ArrayList();

    /* renamed from: h, reason: collision with root package name */
    public final java.util.Set f554209h = new java.util.HashSet();

    static {
        java.util.HashMap hashMap = new java.util.HashMap();
        f554204i = hashMap;
        hashMap.put(1875231238, new zf4.k());
    }

    public static zf4.a0 Ai() {
        gm0.j1.b().c();
        if (wi().f554207f == null) {
            wi().f554207f = new zf4.a0();
        }
        return wi().f554207f;
    }

    public static zf4.b0 Bi() {
        gm0.j1.b().c();
        if (wi().f554205d == null) {
            zf4.l wi6 = wi();
            wi();
            if (wi().f554206e == null) {
                wi().f554206e = x51.l0.a(zf4.l.class.hashCode(), gm0.j1.u().h() + "CommonOneMicroMsg.db", f554204i, false, true);
            }
            wi6.f554205d = new zf4.b0(wi().f554206e);
        }
        return wi().f554205d;
    }

    public static zf4.l wi() {
        return (zf4.l) i95.n0.c(zf4.l.class);
    }

    public final void Di(android.content.Context context, java.lang.String str, boolean z17) {
        android.net.Uri defaultUri = str == null ? android.media.RingtoneManager.getDefaultUri(2) : z17 ? com.p314xaae8f345.mm.sdk.p2603x2137b148.i1.b(context, com.p314xaae8f345.mm.vfs.r6.j(new java.io.File(str))) : android.net.Uri.parse(str);
        to.g gVar = new to.g();
        try {
            gVar.setDataSource(context, defaultUri);
            gVar.setOnCompletionListener(new zf4.j(this));
            if (ym1.f.Di(5) != 0) {
                if (ym1.f.Ri()) {
                    int Di = ym1.f.Di(8);
                    ym1.e eVar = ym1.f.f544667h;
                    int g17 = eVar.b().g(8);
                    int Di2 = ym1.f.Di(5);
                    if (Di2 <= g17) {
                        g17 = Di2;
                    }
                    eVar.b().z(8, g17, 0);
                    gVar.setAudioStreamType(8);
                    gVar.setLooping(true);
                    gVar.prepare();
                    gVar.setLooping(false);
                    gVar.start();
                    eVar.b().z(8, Di, 0);
                } else {
                    gVar.setAudioStreamType(5);
                    gVar.setLooping(true);
                    gVar.prepare();
                    gVar.setLooping(false);
                    gVar.start();
                }
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SubCoreVoiceRemind", e17, "", new java.lang.Object[0]);
            try {
                gVar.release();
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SubCoreVoiceRemind", th6, "relese error", new java.lang.Object[0]);
            }
        }
    }

    public void Ni(java.lang.String str) {
        ((com.p314xaae8f345.mm.p2621x8fb0427b.m4) c01.d9.b().r()).b0(str);
        java.util.List list = this.f554208g;
        ((java.util.ArrayList) list).clear();
        android.database.Cursor b37 = ((com.p314xaae8f345.mm.p2621x8fb0427b.g9) c01.d9.b().u()).b3(str);
        b37.moveToFirst();
        while (!b37.isAfterLast()) {
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = new com.p314xaae8f345.mm.p2621x8fb0427b.f9();
            f9Var.mo9015xbf5d97fd(b37);
            long m124847x74d37ac6 = f9Var.m124847x74d37ac6();
            b37.moveToNext();
            ((java.util.ArrayList) list).add(java.lang.Long.valueOf(m124847x74d37ac6));
        }
        b37.close();
        ((com.p314xaae8f345.mm.p2621x8fb0427b.g9) c01.d9.b().u()).Mb(str);
    }

    @Override // i95.w
    /* renamed from: onAccountReleased */
    public void mo836xb8969aab(android.content.Context context) {
        super.mo836xb8969aab(context);
        zf4.a0 a0Var = this.f554207f;
        if (a0Var != null) {
            a0Var.f554175m = 0;
        }
    }
}
