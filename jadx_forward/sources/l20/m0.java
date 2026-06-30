package l20;

/* loaded from: classes14.dex */
public final class m0 implements q20.k {

    /* renamed from: a, reason: collision with root package name */
    public final yz5.a f396707a;

    /* renamed from: b, reason: collision with root package name */
    public l20.k0 f396708b;

    public m0(yz5.a baseParamsGetter) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(baseParamsGetter, "baseParamsGetter");
        this.f396707a = baseParamsGetter;
    }

    @Override // q20.k
    public void c() {
        l20.l0 l0Var;
        l20.k0 k0Var = this.f396708b;
        if (k0Var == null || (l0Var = k0Var.f396698e) == null) {
            return;
        }
        this.f396708b = l20.k0.a(k0Var, 0L, null, kz5.n0.u0(k0Var.f396696c, new l20.l0(l0Var.f396702a, android.os.SystemClock.uptimeMillis())), null, null, null, 43, null);
    }

    @Override // q20.k
    public void d() {
        l20.k0 k0Var = this.f396708b;
        if (k0Var == null) {
            return;
        }
        java.util.Map t17 = kz5.c1.t((java.util.Map) this.f396707a.mo152xb9724478());
        jz5.l[] lVarArr = new jz5.l[7];
        lVarArr[0] = new jz5.l("element_id", "feeds_spu_card");
        lVarArr[1] = new jz5.l("action_type", "video_play_end");
        lVarArr[2] = new jz5.l("play_waitting_count", java.lang.String.valueOf(k0Var.f396696c.size() + (k0Var.f396698e != null ? 1 : 0)));
        long j17 = k0Var.f396694a;
        java.lang.Long l17 = k0Var.f396695b;
        lVarArr[3] = new jz5.l("first_loadtime", java.lang.String.valueOf(l17 != null ? l17.longValue() : android.os.SystemClock.uptimeMillis() - j17));
        lVarArr[4] = new jz5.l("total_waitting_time", java.lang.String.valueOf(k0Var.c()));
        lVarArr[5] = new jz5.l("real_play_time", java.lang.String.valueOf(k0Var.b()));
        lVarArr[6] = new jz5.l("play_time", java.lang.String.valueOf(android.os.SystemClock.uptimeMillis() - j17));
        java.util.Map l18 = kz5.c1.l(lVarArr);
        java.lang.String g07 = l18.isEmpty() ? null : kz5.n0.g0(((java.util.LinkedHashMap) l18).entrySet(), ";", "{", "}", 0, null, b30.d.f99093d, 24, null);
        if (g07 == null) {
            g07 = "";
        }
        t17.put("element_info", g07);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Bj("feeds_spu_card", "video_play_end", kz5.c1.s(t17), 12, false);
    }

    @Override // q20.k
    public void e() {
        l20.k0 k0Var = this.f396708b;
        if (k0Var != null) {
            this.f396708b = l20.k0.a(k0Var, 0L, null, null, null, new l20.l0(android.os.SystemClock.uptimeMillis(), 0L, 2, null), null, 47, null);
        }
    }

    @Override // q20.k
    /* renamed from: onPause */
    public void mo144929xb01dfb57() {
        l20.k0 k0Var = this.f396708b;
        if (k0Var != null) {
            this.f396708b = l20.k0.a(k0Var, 0L, null, null, null, null, new l20.l0(android.os.SystemClock.uptimeMillis(), 0L, 2, null), 31, null);
        }
        l20.k0 k0Var2 = this.f396708b;
        if (k0Var2 == null) {
            return;
        }
        java.util.Map t17 = kz5.c1.t((java.util.Map) this.f396707a.mo152xb9724478());
        java.util.Map l17 = kz5.c1.l(new jz5.l("element_id", "feeds_spu_card"), new jz5.l("action_type", "video_play_stop"), new jz5.l("real_play_time", java.lang.String.valueOf(k0Var2.b())), new jz5.l("play_time", java.lang.String.valueOf(android.os.SystemClock.uptimeMillis() - k0Var2.f396694a)));
        java.lang.String g07 = l17.isEmpty() ? null : kz5.n0.g0(((java.util.LinkedHashMap) l17).entrySet(), ";", "{", "}", 0, null, b30.d.f99093d, 24, null);
        if (g07 == null) {
            g07 = "";
        }
        t17.put("element_info", g07);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Bj("feeds_spu_card", "video_play_stop", kz5.c1.s(t17), 12, false);
    }

    @Override // q20.k
    /* renamed from: onResume */
    public void mo144930x57429eec() {
        l20.k0 k0Var = this.f396708b;
        if (k0Var != null) {
            if (k0Var.f396695b != null) {
                l20.l0 l0Var = k0Var.f396699f;
                if (l0Var != null) {
                    this.f396708b = l20.k0.a(k0Var, 0L, null, null, kz5.n0.u0(k0Var.f396697d, new l20.l0(l0Var.f396702a, android.os.SystemClock.uptimeMillis())), null, null, 23, null);
                    return;
                }
                return;
            }
            long uptimeMillis = android.os.SystemClock.uptimeMillis() - k0Var.f396694a;
            this.f396708b = l20.k0.a(k0Var, 0L, java.lang.Long.valueOf(uptimeMillis), null, null, null, null, 61, null);
            l20.l0 l0Var2 = k0Var.f396698e;
            if (l0Var2 != null) {
                l20.l0 l0Var3 = new l20.l0(l0Var2.f396702a, android.os.SystemClock.uptimeMillis());
                this.f396708b = l20.k0.a(k0Var, 0L, java.lang.Long.valueOf(uptimeMillis), kz5.n0.u0(k0Var.f396696c, l0Var3), null, new l20.l0(android.os.SystemClock.uptimeMillis(), 0L, 2, null), null, 41, null);
            }
        }
    }

    @Override // q20.k
    /* renamed from: onStart */
    public void mo144931xb05099c3() {
        if (this.f396708b == null) {
            long uptimeMillis = android.os.SystemClock.uptimeMillis();
            kz5.p0 p0Var = kz5.p0.f395529d;
            this.f396708b = new l20.k0(uptimeMillis, null, p0Var, p0Var, null, null);
        }
    }
}
