package c.t.m.p134x35c0ce.c;

/* loaded from: classes13.dex */
public class c implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    public static int f118398a;

    /* renamed from: d, reason: collision with root package name */
    public android.content.Context f118401d;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f118403f;

    /* renamed from: b, reason: collision with root package name */
    public final int f118399b = 30000;

    /* renamed from: c, reason: collision with root package name */
    public final int f118400c = com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54075xb707b059;

    /* renamed from: e, reason: collision with root package name */
    public java.util.List<c.t.m.p134x35c0ce.c.a> f118402e = null;

    /* renamed from: g, reason: collision with root package name */
    public boolean f118404g = false;

    public c(android.content.Context context) {
        this.f118403f = null;
        this.f118401d = context;
        this.f118403f = this.f118401d.getFilesDir().getAbsolutePath() + java.io.File.separator + "TencentLocation_sapp/UpCp";
        java.io.File file = new java.io.File(this.f118401d.getFilesDir().getAbsolutePath(), "TencentLocation_sapp/UpCp");
        if (file.exists()) {
            return;
        }
        file.mkdirs();
    }

    public final synchronized void a() {
        boolean z17;
        java.util.List<c.t.m.p134x35c0ce.c.a> list = this.f118402e;
        if (list != null && list.size() > 0) {
            f118398a = 1;
            c.t.m.p134x35c0ce.c.q.i(this.f118401d);
            if (c.t.m.p134x35c0ce.c.q.d() < 10485760) {
                f118398a = 2;
                return;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator<c.t.m.p134x35c0ce.c.a> it = this.f118402e.iterator();
            boolean z18 = true;
            while (true) {
                z17 = false;
                if (!it.hasNext()) {
                    break;
                }
                c.t.m.p134x35c0ce.c.a next = it.next();
                if (a(next)) {
                    arrayList.add(next);
                } else {
                    z18 = false;
                }
            }
            if (!z18) {
                f118398a = 2;
                a(arrayList);
                return;
            }
            if (arrayList.size() == this.f118402e.size()) {
                c.t.m.p134x35c0ce.c.q.c(this.f118401d, "__SP_UPDATE_TencentLoc_COMP_INFO__sapp_", "");
                if (c.t.m.p134x35c0ce.c.q.a(this.f118401d, this.f118402e)) {
                    c.t.m.p134x35c0ce.c.q.d(this.f118401d, "__SP_UPDATE_TencentLoc_COMP_SDK_VER__sapp_", c.t.m.p134x35c0ce.c.g.f118423a);
                    java.util.Iterator it6 = arrayList.iterator();
                    while (it6.hasNext()) {
                        c.t.m.p134x35c0ce.c.a aVar = (c.t.m.p134x35c0ce.c.a) it6.next();
                        if (!aVar.f118390c.contains(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26631x178a9850.f55637xc33c4c99)) {
                            aVar.f118390c += com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26631x178a9850.f55637xc33c4c99;
                        }
                        java.io.File file = new java.io.File(this.f118403f, aVar.f118390c);
                        boolean delete = file.exists() ? file.delete() : true;
                        java.io.File file2 = new java.io.File(this.f118403f, aVar.f118390c);
                        boolean renameTo = new java.io.File(this.f118403f, "tmp__sapp" + aVar.f118390c).renameTo(file2);
                        boolean a17 = a(aVar, file2);
                        if (delete && renameTo && a17) {
                            z17 = true;
                        }
                    }
                    if (!z17) {
                        c.t.m.p134x35c0ce.c.q.d(this.f118401d, "__SP_UPDATE_TencentLoc_COMP_INFO__sapp_", "");
                        c.t.m.p134x35c0ce.c.q.a(this.f118403f);
                        f118398a = 2;
                        return;
                    }
                    f118398a = 1;
                    c.t.m.p134x35c0ce.c.e.a(this.f118401d).a("CPU", "down suc");
                } else {
                    a(arrayList);
                    f118398a = 2;
                }
            } else {
                c.t.m.p134x35c0ce.c.i.a("down load failed");
                c.t.m.p134x35c0ce.c.e.a(this.f118401d).a("CPU", "down failed");
                a(arrayList);
                f118398a = 2;
            }
        }
    }

    public void b(java.util.List<c.t.m.p134x35c0ce.c.a> list) {
        this.f118402e = list;
        if (f118398a != 1) {
            new java.lang.Thread(this).start();
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        c.t.m.p134x35c0ce.c.d.a(this.f118401d).b("updatelock_sapp");
        a();
        c.t.m.p134x35c0ce.c.e.a(this.f118401d).d();
        c.t.m.p134x35c0ce.c.d.a(this.f118401d).c("updatelock_sapp");
    }

    public final void a(java.util.List<c.t.m.p134x35c0ce.c.a> list) {
        for (c.t.m.p134x35c0ce.c.a aVar : list) {
            java.io.File file = new java.io.File(this.f118403f, "tmp__sapp" + aVar.f118390c);
            if (file.exists() && file.isFile()) {
                file.delete();
            }
        }
    }

    public final boolean a(c.t.m.p134x35c0ce.c.a aVar) {
        byte[] b17;
        java.io.BufferedOutputStream bufferedOutputStream;
        java.lang.Exception e17;
        try {
            java.lang.String str = "https://maplbs-40171.sh.gfp.tencent-cloud.com/Index/" + aVar.f118392e;
            c.t.m.p134x35c0ce.c.i.a("start down load:" + aVar.f118392e);
            java.io.BufferedOutputStream bufferedOutputStream2 = null;
            int i17 = 0;
            while (true) {
                int i18 = i17 + 1;
                if (i17 >= 3) {
                    break;
                }
                byte[] a17 = c.t.m.p134x35c0ce.c.o.a(str);
                if (a17 != null && (b17 = c.t.m.p134x35c0ce.c.q.b(c.t.m.p134x35c0ce.c.l.a(a17, "sE0zy%DVqLnXA$hmNZ8NBwcg7FDrvi!q"))) != null) {
                    java.io.File file = new java.io.File(this.f118403f, "tmp__sapp" + aVar.f118390c);
                    try {
                        bufferedOutputStream = new java.io.BufferedOutputStream(new java.io.FileOutputStream(file, false), 1024);
                        try {
                            try {
                                bufferedOutputStream.write(b17);
                                if (a(aVar, file)) {
                                    c.t.m.p134x35c0ce.c.i.a("down load available:" + aVar.f118392e);
                                    c.t.m.p134x35c0ce.c.e.a(this.f118401d).a("CPU", "sud:" + aVar.f118392e);
                                    try {
                                        bufferedOutputStream.close();
                                        return true;
                                    } catch (java.lang.Exception unused) {
                                        return true;
                                    }
                                }
                                c.t.m.p134x35c0ce.c.i.a("down load unavailable:" + aVar.f118392e);
                                c.t.m.p134x35c0ce.c.e.a(this.f118401d).a("CPU", "failed:" + aVar.f118392e);
                                if (file.exists() && file.isFile()) {
                                    file.delete();
                                }
                                bufferedOutputStream.close();
                            } catch (java.lang.Throwable th6) {
                                th = th6;
                                bufferedOutputStream2 = bufferedOutputStream;
                                try {
                                    bufferedOutputStream2.close();
                                } catch (java.lang.Exception unused2) {
                                }
                                throw th;
                            }
                        } catch (java.lang.Exception e18) {
                            e17 = e18;
                            if (file.exists() && file.isFile()) {
                                file.delete();
                            }
                            c.t.m.p134x35c0ce.c.e.a(this.f118401d).a("CPU", "failed:" + e17.toString());
                            try {
                                bufferedOutputStream.close();
                            } catch (java.lang.Exception unused3) {
                            }
                            bufferedOutputStream2 = bufferedOutputStream;
                            c.t.m.p134x35c0ce.c.q.a(5000L);
                            i17 = i18;
                        }
                    } catch (java.lang.Exception e19) {
                        bufferedOutputStream = bufferedOutputStream2;
                        e17 = e19;
                    } catch (java.lang.Throwable th7) {
                        th = th7;
                    }
                }
                c.t.m.p134x35c0ce.c.q.a(5000L);
                i17 = i18;
            }
        } catch (java.lang.Throwable unused4) {
        }
        return false;
    }

    public final boolean a(c.t.m.p134x35c0ce.c.a aVar, java.io.File file) {
        if (file != null && file.exists()) {
            int length = (int) file.length();
            java.lang.String a17 = c.t.m.p134x35c0ce.c.q.a(file);
            if (aVar.f118391d == length && aVar.f118392e.equals(a17)) {
                return true;
            }
        }
        return false;
    }
}
