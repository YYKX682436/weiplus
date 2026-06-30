package j62;

/* loaded from: classes15.dex */
public class e {

    /* renamed from: d, reason: collision with root package name */
    public static j62.e f379429d;

    /* renamed from: e, reason: collision with root package name */
    public static final kk.j f379430e = new kk.l(50);

    /* renamed from: a, reason: collision with root package name */
    public final kk.j f379431a = new kk.l(50);

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f379432b = null;

    /* renamed from: c, reason: collision with root package name */
    public int f379433c = -1;

    public static j62.e g() {
        if (f379429d == null) {
            f379429d = new j62.e();
        }
        return f379429d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x002a, code lost:
    
        if (r1.y0() == false) goto L13;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String a(java.lang.String r15, java.lang.String r16, boolean r17, boolean r18) {
        /*
            Method dump skipped, instructions count: 272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j62.e.a(java.lang.String, java.lang.String, boolean, boolean):java.lang.String");
    }

    public boolean b(java.lang.String str, com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f c19767x257d7f, com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f c19767x257d7f2) {
        j62.c e17;
        if (c19767x257d7f == null || c19767x257d7f2 == null) {
            return false;
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 h17 = h();
        int i17 = h17 != null ? h17.getInt(str, -1) : -1;
        if (i17 <= 0 || (e17 = e(i17)) == null) {
            return false;
        }
        c19767x257d7f.f38864x6ac9171 = e17.f66062xf8fc5057;
        c19767x257d7f2.f38864x6ac9171 = e17.f66065x861009b5;
        return true;
    }

    public int c(q55.e eVar) {
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        bm5.o1 o1Var = bm5.o1.f104252a;
        return o1Var.m(eVar) == 0 ? i(eVar.k(), o1Var.h(eVar), true, false) : o1Var.h(eVar);
    }

    public int d(q55.e eVar, boolean z17, boolean z18) {
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        bm5.o1 o1Var = bm5.o1.f104252a;
        return o1Var.m(eVar) == 0 ? i(eVar.k(), o1Var.h(eVar), z17, z18) : o1Var.h(eVar);
    }

    public final j62.c e(int i17) {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 h17;
        if (i17 <= 0 || (h17 = h()) == null) {
            return null;
        }
        java.lang.String string = h17.getString(i17 + "", "");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string)) {
            return null;
        }
        java.lang.Object obj = this.f379431a;
        j62.c cVar = (j62.c) ((com.p314xaae8f345.mm.sdk.p2603x2137b148.r2) obj).get(java.lang.Integer.valueOf(i17));
        if (cVar != null) {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(string, cVar.f66061x384f96bd)) {
                return cVar;
            }
            ((com.p314xaae8f345.mm.sdk.p2603x2137b148.r2) obj).m77803xc84af884(java.lang.Integer.valueOf(i17));
        }
        j62.c cVar2 = new j62.c();
        if (!cVar2.t0(string)) {
            return null;
        }
        ((com.p314xaae8f345.mm.sdk.p2603x2137b148.r2) obj).put(java.lang.Integer.valueOf(i17), cVar2);
        return cVar2;
    }

    public java.lang.String f(q55.e eVar) {
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        bm5.o1 o1Var = bm5.o1.f104252a;
        return o1Var.m(eVar) == 0 ? a(eVar.k(), o1Var.l(eVar), true, false) : o1Var.l(eVar);
    }

    public com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 h() {
        int n17 = n();
        if (n17 == 0) {
            return null;
        }
        java.lang.String str = n17 + "_WxExptmmkv";
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(this.f379432b, str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ExptManager", "%s get mmkv change uin old[%s] new[%s]", hashCode() + "", this.f379432b, str);
            this.f379432b = str;
        }
        return com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M(this.f379432b);
    }

    public int i(java.lang.String str, int i17, boolean z17, boolean z18) {
        java.lang.String a17 = a(str, "", z17, z18);
        return com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(a17) ? i17 : com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(a17, i17);
    }

    public java.lang.String j(java.lang.String str, java.lang.String str2, boolean z17, boolean z18) {
        return a(str, str2, z17, z18);
    }

    public boolean k(java.lang.String str, boolean z17) {
        return l(str, z17, true, true);
    }

    public boolean l(java.lang.String str, boolean z17, boolean z18, boolean z19) {
        java.lang.String a17 = a(str, "", z18, z19);
        return com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(a17) ? z17 : com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(a17, z17 ? 1 : 0) != 0;
    }

    public int m() {
        if (this.f379433c == -1) {
            this.f379433c = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().getInt("expt_debug_hit_exptid", 0);
        }
        return this.f379433c;
    }

    public int n() {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 M = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("WxExptConfig");
        int i17 = M != null ? M.getInt("expt_uin", 0) : 0;
        return i17 != 0 ? i17 : java.lang.Integer.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSharedPreferences("system_config_prefs", 4).getInt("default_uin", 0)).intValue();
    }

    public void o(long j17, long j18, java.lang.String str, java.lang.String str2) {
        java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        if (z65.c.a() && m() > 0 && j17 == m()) {
            ((ku5.t0) ku5.t0.f394148d).B(new j62.d(this, j18, str, str2));
        }
    }
}
