package gq5;

/* loaded from: classes5.dex */
public final class o extends gq5.e {

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f356188m;

    /* renamed from: n, reason: collision with root package name */
    public long f356189n;

    /* renamed from: o, reason: collision with root package name */
    public long f356190o;

    /* renamed from: p, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f356191p;

    /* renamed from: q, reason: collision with root package name */
    public java.util.List f356192q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f356193r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f356188m = "MicroMsg.WeDrop.WeDropSendUIC";
        this.f356191p = new java.util.concurrent.ConcurrentHashMap();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x00d0 -> B:10:0x00d3). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b7(gq5.o r14, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r15) {
        /*
            Method dump skipped, instructions count: 267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: gq5.o.b7(gq5.o, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // gq5.e
    public java.lang.String T6() {
        return this.f356188m;
    }

    @Override // gq5.e
    public int U6() {
        if (jq5.b.f382788a.b().i("is_first_send", true)) {
            return 13;
        }
        jq5.l lVar = jq5.n.f382815a;
        if (!(lVar.c() && lVar.e())) {
            return 14;
        }
        byte[] byteArrayExtra = m158359x1e885992().getByteArrayExtra("decryptKeyResp");
        bw5.ud0 mo11468x92b714fd = new bw5.ud0().mo11468x92b714fd(byteArrayExtra);
        java.lang.String stringExtra = m158359x1e885992().getStringExtra("qrCode");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("init: decryptKeyResp size ");
        sb6.append(byteArrayExtra != null ? java.lang.Integer.valueOf(byteArrayExtra.length) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f356188m, sb6.toString());
        v65.i.b((com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a) ((jz5.n) this.f356155g).mo141623x754a37bb(), null, new gq5.j(mo11468x92b714fd, stringExtra, this, null), 1, null);
        return 1;
    }

    @Override // gq5.e
    public void V6() {
        j75.f Q6 = Q6();
        if (Q6 != null) {
            Q6.B3(new eq5.i(5));
        }
    }

    @Override // gq5.e
    public void W6(int i17) {
        if (this.f356193r) {
            j75.f Q6 = Q6();
            if (Q6 != null) {
                Q6.B3(new eq5.i(11));
                return;
            }
            return;
        }
        j75.f Q62 = Q6();
        if (Q62 != null) {
        }
        j75.f Q63 = Q6();
        if (Q63 != null) {
            Q63.B3(new eq5.i(3));
        }
    }

    @Override // gq5.e
    public void Y6() {
        j75.f Q6 = Q6();
        if (Q6 != null) {
            Q6.B3(new eq5.i(7));
        }
        v65.i.b((com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a) ((jz5.n) this.f356155g).mo141623x754a37bb(), null, new gq5.l(this, null), 1, null);
    }

    @Override // gq5.e
    public void a7(int i17, byte[] data, r45.y77 fileInfo) {
        android.view.Window window;
        android.view.View decorView;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fileInfo, "fileInfo");
        long length = this.f356190o + data.length;
        this.f356190o = length;
        long j17 = this.f356189n;
        java.lang.String str = this.f356188m;
        if (length == j17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "all file send success, totalOffset:" + this.f356190o);
            j75.f Q6 = Q6();
            if (Q6 != null) {
                Q6.B3(new eq5.i(9));
            }
            jq5.b.f382788a.b().B("last_select_time", c01.id.c());
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = m158354x19263085();
            if (android.os.Build.VERSION.SDK_INT >= 29) {
                android.os.VibrationEffect createPredefined = android.os.VibrationEffect.createPredefined(0);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(createPredefined, "createPredefined(...)");
                java.lang.Object systemService = m158354x19263085 != null ? m158354x19263085.getSystemService("vibrator") : null;
                android.os.Vibrator vibrator = systemService instanceof android.os.Vibrator ? (android.os.Vibrator) systemService : null;
                if (vibrator != null) {
                    vibrator.vibrate(createPredefined);
                }
            } else if (m158354x19263085 != null && (window = m158354x19263085.getWindow()) != null && (decorView = window.getDecorView()) != null) {
                decorView.performHapticFeedback(3);
            }
        } else if (j17 > 0) {
            int i18 = (int) ((length * 100) / j17);
            j75.f Q62 = Q6();
            if (Q62 != null) {
                Q62.B3(new eq5.e(i18));
            }
        }
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f356191p;
        java.lang.Long l17 = (java.lang.Long) concurrentHashMap.get(java.lang.Integer.valueOf(i17));
        if (l17 == null) {
            l17 = 0L;
        }
        long longValue = l17.longValue() + data.length;
        concurrentHashMap.put(java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(longValue));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "onSendFile index:" + i17 + " file offset:" + longValue + ", filelen " + fileInfo.f472377e + " ,total offset:" + this.f356190o + " totalLen:" + this.f356189n);
    }

    @Override // gq5.e, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        super.mo450x3e5a77bb(bundle);
        j75.f Q6 = Q6();
        if (Q6 != null) {
            Q6.L2(m158354x19263085(), new gq5.k(this));
        }
    }
}
