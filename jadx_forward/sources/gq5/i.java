package gq5;

/* loaded from: classes5.dex */
public final class i extends gq5.e {

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f356161m;

    /* renamed from: n, reason: collision with root package name */
    public long f356162n;

    /* renamed from: o, reason: collision with root package name */
    public long f356163o;

    /* renamed from: p, reason: collision with root package name */
    public int f356164p;

    /* renamed from: q, reason: collision with root package name */
    public r45.y77 f356165q;

    /* renamed from: r, reason: collision with root package name */
    public com.p314xaae8f345.mm.vfs.r6 f356166r;

    /* renamed from: s, reason: collision with root package name */
    public java.io.OutputStream f356167s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f356168t;

    /* renamed from: u, reason: collision with root package name */
    public final jz5.g f356169u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f356161m = "MicroMsg.WeDrop.WeDropReceiveUIC";
        this.f356164p = -1;
        this.f356169u = jz5.h.b(gq5.h.f356160d);
    }

    @Override // gq5.e
    public java.lang.String T6() {
        return this.f356161m;
    }

    @Override // gq5.e
    public int U6() {
        aq5.a aVar;
        aq5.p0 p0Var = aq5.p0.f94806a;
        aq5.q0 callback = (aq5.q0) ((jz5.n) this.f356157i).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        aq5.f fVar = aq5.p0.f94807b;
        if (fVar != null) {
            fVar.f94767d = callback;
        }
        if (fVar == null || (aVar = fVar.f94766c) == null) {
            aVar = aq5.a.f94750f;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f356161m, "init() called f2fStatus:" + aVar);
        return aVar.ordinal() != 0 ? 2 : 6;
    }

    @Override // gq5.e
    public void V6() {
        android.view.Window window;
        android.view.View decorView;
        j75.f Q6 = Q6();
        if (Q6 != null) {
            Q6.B3(new eq5.i(6));
        }
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = m158354x19263085();
        if (android.os.Build.VERSION.SDK_INT < 29) {
            if (m158354x19263085 == null || (window = m158354x19263085.getWindow()) == null || (decorView = window.getDecorView()) == null) {
                return;
            }
            decorView.performHapticFeedback(3);
            return;
        }
        android.os.VibrationEffect createPredefined = android.os.VibrationEffect.createPredefined(5);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(createPredefined, "createPredefined(...)");
        java.lang.Object systemService = m158354x19263085 != null ? m158354x19263085.getSystemService("vibrator") : null;
        android.os.Vibrator vibrator = systemService instanceof android.os.Vibrator ? (android.os.Vibrator) systemService : null;
        if (vibrator != null) {
            vibrator.vibrate(createPredefined);
        }
    }

    @Override // gq5.e
    public void W6(int i17) {
        j75.f Q6 = Q6();
        if (Q6 != null) {
            Q6.B3(new eq5.i(this.f356168t ? 12 : 4));
        }
    }

    @Override // gq5.e
    public void X6(r45.b87 prepareSendRequest, int i17) {
        android.view.Window window;
        android.view.View decorView;
        eq5.h hVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(prepareSendRequest, "prepareSendRequest");
        if (i17 == 1) {
            j75.f Q6 = Q6();
            eq5.h hVar2 = Q6 != null ? (eq5.h) Q6.mo140437x75286adb() : null;
            if (hVar2 != null) {
                hVar2.f337454o = true;
            }
            this.f356168t = true;
            j75.f Q62 = Q6();
            if (Q62 != null) {
                Q62.B3(new eq5.i(12));
                return;
            }
            return;
        }
        this.f356162n = prepareSendRequest.f452169f;
        j75.f Q63 = Q6();
        java.util.LinkedList content_infos = prepareSendRequest.f452168e;
        if (Q63 != null && (hVar = (eq5.h) Q63.mo140437x75286adb()) != null) {
            hVar.f337453n = this.f356162n;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(content_infos, "content_infos");
            java.util.Iterator it = content_infos.iterator();
            while (it.hasNext()) {
                int i18 = ((r45.y77) it.next()).f472376d;
                if (i18 == 0) {
                    hVar.f337450h++;
                } else if (i18 == 1) {
                    hVar.f337451i++;
                } else if (i18 == 2) {
                    hVar.f337452m++;
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f356161m, "imgCount:" + hVar.f337450h + ", videoCount:" + hVar.f337451i + ", fileCount:" + hVar.f337452m);
        }
        j75.f Q64 = Q6();
        if (Q64 != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(content_infos, "content_infos");
            java.util.LinkedList thumbnails = prepareSendRequest.f452170g;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(thumbnails, "thumbnails");
            Q64.B3(new eq5.j(new aq5.x0(content_infos, thumbnails)));
        }
        j75.f Q65 = Q6();
        if (Q65 != null) {
            Q65.B3(new eq5.i(8));
        }
        this.f356168t = true;
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = m158354x19263085();
        if (m158354x19263085 == null || (window = m158354x19263085.getWindow()) == null || (decorView = window.getDecorView()) == null) {
            return;
        }
        decorView.performHapticFeedback(3);
    }

    @Override // gq5.e
    public void Z6(int i17, byte[] data, r45.y77 fileInfo) {
        android.view.Window window;
        android.view.View decorView;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fileInfo, "fileInfo");
        if (this.f356164p != i17) {
            b7();
            this.f356164p = i17;
            com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6((com.p314xaae8f345.mm.vfs.r6) ((jz5.n) this.f356169u).mo141623x754a37bb(), "file_" + i17);
            this.f356166r = r6Var;
            r6Var.k();
            this.f356167s = com.p314xaae8f345.mm.vfs.w6.H(r6Var);
            this.f356165q = fileInfo;
        }
        java.io.OutputStream outputStream = this.f356167s;
        if (outputStream != null) {
            outputStream.write(data);
        }
        this.f356163o += data.length;
        java.lang.String str = "onReceive index:" + this.f356164p + " offset:" + this.f356163o + " totalLen:" + this.f356162n;
        java.lang.String str2 = this.f356161m;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, str);
        long j17 = this.f356163o;
        long j18 = this.f356162n;
        if (j17 != j18) {
            int i18 = (int) ((j17 * 100) / j18);
            j75.f Q6 = Q6();
            if (Q6 != null) {
                Q6.B3(new eq5.e(i18));
                return;
            }
            return;
        }
        b7();
        j75.f Q62 = Q6();
        if (Q62 != null) {
            Q62.B3(new eq5.i(10));
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "all file receive success, totalLen:" + this.f356162n);
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = m158354x19263085();
        if (android.os.Build.VERSION.SDK_INT < 29) {
            if (m158354x19263085 == null || (window = m158354x19263085.getWindow()) == null || (decorView = window.getDecorView()) == null) {
                return;
            }
            decorView.performHapticFeedback(3);
            return;
        }
        android.os.VibrationEffect createPredefined = android.os.VibrationEffect.createPredefined(0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(createPredefined, "createPredefined(...)");
        java.lang.Object systemService = m158354x19263085 != null ? m158354x19263085.getSystemService("vibrator") : null;
        android.os.Vibrator vibrator = systemService instanceof android.os.Vibrator ? (android.os.Vibrator) systemService : null;
        if (vibrator != null) {
            vibrator.vibrate(createPredefined);
        }
    }

    public final void b7() {
        java.lang.String o17;
        java.lang.String o18;
        java.lang.String o19;
        r45.y77 y77Var = this.f356165q;
        if (y77Var != null) {
            java.lang.String str = "exportFile index:" + this.f356164p + " type:" + y77Var.f472376d + ", name:" + y77Var.f472378f.f451365d;
            java.lang.String str2 = this.f356161m;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, str);
            int i17 = y77Var.f472376d;
            java.lang.String str3 = "";
            if (i17 == 0) {
                zb0.b0 b0Var = (zb0.b0) i95.n0.c(zb0.b0.class);
                android.app.Activity m80379x76847179 = m80379x76847179();
                com.p314xaae8f345.mm.vfs.r6 r6Var = this.f356166r;
                if (r6Var != null && (o17 = r6Var.o()) != null) {
                    str3 = o17;
                }
                com.p314xaae8f345.mm.vfs.r6 r6Var2 = this.f356166r;
                gq5.f fVar = new gq5.f(r6Var2 != null ? r6Var2.o() : null);
                ((yb0.g) b0Var).getClass();
                java.util.concurrent.Executor executor = com.p314xaae8f345.mm.p1004x2137b148.C11325x6ace8b92.f153934a;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ExportFileUtil", "[+] Called exportImage, src: %s", str3);
                com.p314xaae8f345.mm.p1004x2137b148.C11325x6ace8b92.c(m80379x76847179, str3, null, true, fVar);
            } else if (i17 == 1) {
                zb0.b0 b0Var2 = (zb0.b0) i95.n0.c(zb0.b0.class);
                android.app.Activity m80379x768471792 = m80379x76847179();
                com.p314xaae8f345.mm.vfs.r6 r6Var3 = this.f356166r;
                if (r6Var3 != null && (o18 = r6Var3.o()) != null) {
                    str3 = o18;
                }
                com.p314xaae8f345.mm.vfs.r6 r6Var4 = this.f356166r;
                gq5.f fVar2 = new gq5.f(r6Var4 != null ? r6Var4.o() : null);
                ((yb0.g) b0Var2).getClass();
                com.p314xaae8f345.mm.p1004x2137b148.C11325x6ace8b92.g(m80379x768471792, str3, null, fVar2);
            } else if (i17 != 2) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str2, "exportFile: unknown type " + y77Var.f472376d);
            } else {
                zb0.b0 b0Var3 = (zb0.b0) i95.n0.c(zb0.b0.class);
                android.app.Activity m80379x768471793 = m80379x76847179();
                com.p314xaae8f345.mm.vfs.r6 r6Var5 = this.f356166r;
                if (r6Var5 != null && (o19 = r6Var5.o()) != null) {
                    str3 = o19;
                }
                java.lang.String str4 = y77Var.f472378f.f451365d;
                gq5.g gVar = new gq5.g(this);
                ((yb0.g) b0Var3).getClass();
                com.p314xaae8f345.mm.p1004x2137b148.C11325x6ace8b92.e(m80379x768471793, str3, str4, gVar);
            }
        }
        try {
            java.io.OutputStream outputStream = this.f356167s;
            if (outputStream != null) {
                outputStream.close();
            }
        } catch (java.lang.Exception unused) {
        }
    }

    @Override // gq5.e, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        super.mo450x3e5a77bb(bundle);
        jz5.g gVar = this.f356169u;
        if (((com.p314xaae8f345.mm.vfs.r6) ((jz5.n) gVar).mo141623x754a37bb()).m()) {
            ((com.p314xaae8f345.mm.vfs.r6) ((jz5.n) gVar).mo141623x754a37bb()).l();
        }
        ((com.p314xaae8f345.mm.vfs.r6) ((jz5.n) gVar).mo141623x754a37bb()).J();
    }

    @Override // gq5.e, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
        super.mo451xac79a11b();
        try {
            java.io.OutputStream outputStream = this.f356167s;
            if (outputStream != null) {
                outputStream.close();
            }
        } catch (java.lang.Exception unused) {
        }
    }
}
