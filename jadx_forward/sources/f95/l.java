package f95;

/* loaded from: classes12.dex */
public final class l implements com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.PerformanceTracer {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b f342100a;

    /* renamed from: b, reason: collision with root package name */
    public final jz5.g f342101b;

    /* renamed from: c, reason: collision with root package name */
    public final int f342102c;

    /* renamed from: d, reason: collision with root package name */
    public final int f342103d;

    /* renamed from: e, reason: collision with root package name */
    public final int f342104e;

    /* renamed from: f, reason: collision with root package name */
    public final jx3.b f342105f;

    /* renamed from: g, reason: collision with root package name */
    public final int[] f342106g;

    public l(com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b db6) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(db6, "db");
        this.f342100a = db6;
        new java.util.concurrent.ConcurrentHashMap();
        this.f342101b = jz5.h.b(f95.k.f342099d);
        this.f342102c = 10000;
        this.f342103d = 2000;
        this.f342104e = 22631;
        this.f342105f = new jx3.b(463);
        this.f342106g = new int[]{27, 39, 24, 36, 27, 39, 48, 54, 33, 45, 30, 42, 33, 45, 51, 57};
    }

    public final java.lang.String a(java.lang.String str, java.lang.String str2) {
        java.util.Collection collection;
        java.util.List g17 = new r26.t(" ").g(str, 0);
        if (!g17.isEmpty()) {
            java.util.ListIterator listIterator = g17.listIterator(g17.size());
            while (listIterator.hasPrevious()) {
                if (!(((java.lang.String) listIterator.previous()).length() == 0)) {
                    collection = kz5.n0.K0(g17, listIterator.nextIndex() + 1);
                    break;
                }
            }
        }
        collection = kz5.p0.f395529d;
        boolean z17 = false;
        for (java.lang.String str3 : (java.lang.String[]) collection.toArray(new java.lang.String[0])) {
            int length = str3.length() - 1;
            int i17 = 0;
            boolean z18 = false;
            while (i17 <= length) {
                boolean z19 = p3321xbce91901.jvm.p3324x21ffc6bd.o.i(str3.charAt(!z18 ? i17 : length), 32) <= 0;
                if (z18) {
                    if (!z19) {
                        break;
                    }
                    length--;
                } else if (z19) {
                    i17++;
                } else {
                    z18 = true;
                }
            }
            java.lang.String obj = str3.subSequence(i17, length + 1).toString();
            if (z17) {
                if (obj.length() > 0) {
                    return str3;
                }
            }
            if (r26.i0.p(obj, str2, true)) {
                z17 = true;
            }
        }
        return "";
    }

    public final void b(java.lang.String str, java.lang.String str2, long j17, int i17, long j18, int i18) {
        java.lang.String a17;
        java.lang.String str3;
        if (r26.i0.y(str, "select", false) || r26.i0.y(str, "SELECT", false) || r26.i0.y(str, "delete", false) || r26.i0.y(str, "DELETE", false)) {
            a17 = a(str, "from");
        } else if (r26.i0.y(str, "update", false) || r26.i0.y(str, "UPDATE", false)) {
            a17 = a(str, "update");
        } else {
            if (!r26.i0.y(str, "insert", false) && !r26.i0.y(str, "INSERT", false)) {
                str3 = "";
                java.lang.String substring = str2.substring(r26.n0.P(str2, "/", 0, false, 6, null) + 1);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring, "substring(...)");
                jx3.f.INSTANCE.d(this.f342104e, str2, str, "", "", java.lang.Long.valueOf(j17), bm5.f1.a(), java.lang.Integer.valueOf(i17), substring, str3, com.p314xaae8f345.mm.app.w.l(), java.lang.Long.valueOf(j18), java.lang.Integer.valueOf(com.p314xaae8f345.mm.app.w.INSTANCE.f135422n ? 1 : 0), java.lang.Integer.valueOf(i18), java.lang.Thread.currentThread().getName());
            }
            a17 = a(str, "into");
            if (r26.n0.D(a17, "(", false, 2, null)) {
                a17 = a17.substring(r26.n0.L(a17, "(", 0, false, 6, null) + 1);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "substring(...)");
            }
        }
        str3 = a17;
        java.lang.String substring2 = str2.substring(r26.n0.P(str2, "/", 0, false, 6, null) + 1);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring2, "substring(...)");
        jx3.f.INSTANCE.d(this.f342104e, str2, str, "", "", java.lang.Long.valueOf(j17), bm5.f1.a(), java.lang.Integer.valueOf(i17), substring2, str3, com.p314xaae8f345.mm.app.w.l(), java.lang.Long.valueOf(j18), java.lang.Integer.valueOf(com.p314xaae8f345.mm.app.w.INSTANCE.f135422n ? 1 : 0), java.lang.Integer.valueOf(i18), java.lang.Thread.currentThread().getName());
    }

    @Override // com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.PerformanceTracer
    /* renamed from: onTrace */
    public void mo106735xb05dc6a6(long j17, java.lang.String path, long j18, java.lang.String sql, com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.PerformanceInfo info) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sql, "sql");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        long millis = java.util.concurrent.TimeUnit.NANOSECONDS.toMillis(info.f58029x2aabd419);
        com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(path);
        java.lang.String str = a17.f294812f;
        if (str != null) {
            java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str, false, false);
            if (!str.equals(l17)) {
                a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
            }
        }
        java.lang.String str2 = a17.f294812f;
        int lastIndexOf = str2.lastIndexOf("/");
        if (lastIndexOf >= 0) {
            str2 = str2.substring(lastIndexOf + 1);
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str2, "getName(...)");
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(android.os.Looper.myLooper(), android.os.Looper.getMainLooper())) {
            l75.e1 e1Var = d95.z.f309248f;
            synchronized (e1Var) {
                e1Var.f398491b = 0;
                e1Var.f398493d = 0L;
            }
        }
        if (r26.i0.y(str2, "EnMicroMsg.db", false)) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.b(android.os.Looper.myLooper(), android.os.Looper.getMainLooper());
            java.lang.Thread.currentThread().getId();
            int m106264x37a81591 = com.p314xaae8f345.p3121x37984a.C26880xdfc0f3d6.m106264x37a81591(sql);
            int i17 = this.f342106g[(m106264x37a81591 != 1 ? 8 : 0) + 2];
            this.f342105f.b(i17 + 1, i17 + 2, (int) millis);
            boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(android.os.Looper.myLooper(), android.os.Looper.getMainLooper());
            f95.e eVar = (f95.e) ((jz5.n) this.f342101b).mo141623x754a37bb();
            java.lang.String m106673xfb83cc9b = this.f342100a.m106673xfb83cc9b();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m106673xfb83cc9b, "getPath(...)");
            eVar.c(m106673xfb83cc9b, sql, m106264x37a81591, millis, b17);
        }
        if (millis >= this.f342103d) {
            boolean b18 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(android.os.Looper.getMainLooper(), android.os.Looper.myLooper());
            if (b18) {
                b(sql, str2, millis, b18 ? 1 : 0, j18, 1);
            } else if (millis >= this.f342102c) {
                b(sql, str2, millis, b18 ? 1 : 0, j18, 0);
            }
        }
    }
}
