package md5;

/* loaded from: classes8.dex */
public class b extends jk3.v implements md5.c {
    public static boolean A;
    public static long B;

    /* renamed from: x, reason: collision with root package name */
    public final r45.qs0 f407415x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f407416y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f407417z;

    static {
        java.util.HashSet hashSet = new java.util.HashSet();
        hashSet.add("app_type");
        hashSet.add("app_media_id");
        hashSet.add("app_msg_id");
        hashSet.add("app_show_share");
        hashSet.add(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811);
        hashSet.add("msg_talker");
        A = false;
        B = 0L;
    }

    public b(ak3.c cVar) {
        super(cVar);
        this.f407415x = new r45.qs0();
        this.f407416y = false;
        this.f407417z = false;
    }

    @Override // jk3.v
    public boolean U(int i17, boolean z17) {
        return super.U(i17, this.f407416y);
    }

    @Override // jk3.b, jk3.e
    public boolean c(int i17) {
        r45.qs0 qs0Var = this.f407415x;
        if ((com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(qs0Var.m75945x2fec8307(1)) || com.p314xaae8f345.mm.vfs.w6.j(qs0Var.m75945x2fec8307(1))) && !this.f407417z) {
            return !(this instanceof com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.p3);
        }
        return false;
    }

    public void c0(java.lang.String str, java.lang.String str2, int i17, boolean z17) {
        android.os.Bundle extras;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FilesFloatBall.FilesPageMultiTaskHelper", "onCreate, filePath:%s fileExt:%s sence:%s", str, str2, java.lang.Integer.valueOf(i17));
        y(4, com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.s0.c(str));
        this.f407416y = false;
        r45.qs0 qs0Var = this.f407415x;
        qs0Var.set(1, str);
        qs0Var.set(7, java.lang.Long.valueOf(com.p314xaae8f345.mm.vfs.w6.k(str)));
        if (!z17) {
            qs0Var.set(2, str2);
            qs0Var.set(5, java.lang.Integer.valueOf(i17));
            qs0Var.set(0, java.lang.Boolean.FALSE);
            try {
                this.f381610a.f66790x225a93cf = qs0Var.mo14344x5f01b1f6();
            } catch (java.io.IOException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FilesFloatBall.FilesPageMultiTaskHelper", "handleMultiTaskInfoClicked", e17);
            }
            J();
            return;
        }
        ak3.c cVar = this.f381644d;
        if (cVar.mo2160x1e885992() != null) {
            android.content.Intent mo2160x1e885992 = cVar.mo2160x1e885992();
            if (qs0Var != null && (extras = mo2160x1e885992.getExtras()) != null) {
                qs0Var.set(8, extras.getString("app_type"));
                qs0Var.set(9, extras.getString("app_media_id"));
                qs0Var.set(10, java.lang.Long.valueOf(extras.getLong("app_msg_id")));
                qs0Var.set(11, java.lang.Boolean.valueOf(extras.getBoolean("app_show_share")));
                qs0Var.set(12, java.lang.Integer.valueOf(extras.getInt(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811)));
                qs0Var.set(30, extras.getString("msg_talker"));
            }
            qs0Var.set(0, java.lang.Boolean.TRUE);
            try {
                this.f381610a.f66790x225a93cf = qs0Var.mo14344x5f01b1f6();
            } catch (java.io.IOException e18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FilesFloatBall.FilesPageMultiTaskHelper", "handleMultiTaskInfoClicked", e18);
            }
            J();
        }
    }

    public void d0(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c c16601x7ed0e40c = this.f381610a;
        c16601x7ed0e40c.v0().set(1, str2);
        c16601x7ed0e40c.v0().set(4, str);
        J();
    }

    public void e0(long j17) {
        r45.qs0 qs0Var = this.f407415x;
        if (qs0Var != null) {
            qs0Var.set(7, java.lang.Long.valueOf(j17));
            try {
                this.f381610a.f66790x225a93cf = qs0Var.mo14344x5f01b1f6();
            } catch (java.io.IOException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FilesFloatBall.FilesPageMultiTaskHelper", "updateFileLen", e17);
            }
        }
    }

    @Override // jk3.b
    public long n() {
        return 1000L;
    }

    @Override // jk3.b
    public boolean u() {
        return !this.f407417z;
    }

    @Override // jk3.b
    public boolean x() {
        r45.qs0 qs0Var = this.f407415x;
        return (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(qs0Var.m75945x2fec8307(1)) || com.p314xaae8f345.mm.vfs.w6.j(qs0Var.m75945x2fec8307(1))) && !this.f407417z;
    }
}
