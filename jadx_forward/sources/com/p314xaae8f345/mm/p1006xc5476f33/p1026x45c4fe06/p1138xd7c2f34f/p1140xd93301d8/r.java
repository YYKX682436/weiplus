package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1140xd93301d8;

/* loaded from: classes7.dex */
public final class r extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1140xd93301d8.a implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1140xd93301d8.y {

    /* renamed from: i, reason: collision with root package name */
    public android.content.Intent f166551i;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1139xc4aaf986.C12362x460991bc f166552m;

    /* renamed from: n, reason: collision with root package name */
    public int f166553n = 0;

    public r(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.ActivityC12328x4aa1de9 activityC12328x4aa1de9, boolean z17) {
        setBaseContext(activityC12328x4aa1de9);
        this.f166469f = z17;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1140xd93301d8.y
    public void a(android.content.Intent intent, android.os.Bundle bundle) {
        if (getBaseContext() != null && (getBaseContext() instanceof android.app.Activity)) {
            android.app.Activity activity = (android.app.Activity) getBaseContext();
            com.p314xaae8f345.mm.ui.v9.e(activity.getWindow());
            com.p314xaae8f345.mm.ui.v9.c(activity.getWindow(), true);
        }
        this.f166551i = intent;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1139xc4aaf986.C12362x460991bc c12362x460991bc = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1139xc4aaf986.C12362x460991bc) intent.getParcelableExtra("extra_launch_parcel");
        if (c12362x460991bc == null) {
            e(null, null);
            return;
        }
        ((android.app.Activity) getBaseContext()).overridePendingTransition(0, 0);
        this.f166552m = c12362x460991bc;
        java.lang.String str = c12362x460991bc.f166435e;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            str = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1140xd93301d8.e0.f(c12362x460991bc);
        }
        java.lang.String f17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.u.f(c12362x460991bc, str, false);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.u.g(c12362x460991bc, f17, str);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.b3.f169345a.d(c12362x460991bc, f17);
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.w1.a()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.w1.f169906a.g(str, f17);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1132xb3db10af.w.j(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1193x3606cc.C12595xe6b43f9f.class, str);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1132xb3db10af.w.a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1193x3606cc.C12595xe6b43f9f.class, str, java.lang.String.format("Network:%s", com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40070xdc68a9b2(this)));
        }
        this.f166471h = c12362x460991bc;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.d5.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1140xd93301d8.e(this, c12362x460991bc, f17));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1140xd93301d8.y
    public boolean b() {
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1140xd93301d8.a
    public void e(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4 c11809xbc286be4, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.C12559xbdae8559 c12559xbdae8559) {
        try {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1139xc4aaf986.C12362x460991bc c12362x460991bc = this.f166552m;
            if (c12362x460991bc != null && c12362x460991bc.B != null) {
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putParcelable("KEY_PRECONDITION_RESULT", c11809xbc286be4);
                this.f166552m.B.a(bundle);
            }
            if (c11809xbc286be4 != null) {
                c11809xbc286be4.f158827g2 = this.f166551i.getStringExtra("extra_launch_source_process_name");
            }
            super.e(c11809xbc286be4, c12559xbdae8559);
        } finally {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1139xc4aaf986.C12362x460991bc c12362x460991bc2 = this.f166552m;
            if (c12362x460991bc2 != null) {
                com.p314xaae8f345.p425x1ea3c036.sdk.p442xd7c2f34f.k.b(c12362x460991bc2.B);
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1140xd93301d8.a
    public boolean k(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4 c11809xbc286be4, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.C12559xbdae8559 c12559xbdae8559) {
        java.lang.Class<?> cls;
        try {
            java.lang.String stringExtra = this.f166551i.getStringExtra("extra_launch_source_context");
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            if (stringExtra == null) {
                stringExtra = "";
            }
            cls = java.lang.Class.forName(stringExtra);
        } catch (java.lang.Exception unused) {
            cls = null;
        }
        if (cls == null || !com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12666xc288131a.class.isAssignableFrom(cls)) {
            return super.k(c11809xbc286be4, c12559xbdae8559);
        }
        return false;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1140xd93301d8.y
    /* renamed from: onPause */
    public void mo51788xb01dfb57() {
        if (g()) {
            return;
        }
        if (c() && ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.ActivityC12328x4aa1de9) getBaseContext()).isDestroyed()) {
            return;
        }
        j(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1140xd93301d8.b(this), false);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1140xd93301d8.y
    /* renamed from: onResume */
    public void mo51789x57429eec() {
        int i17 = this.f166553n + 1;
        this.f166553n = i17;
        if (i17 <= 1 || g()) {
            return;
        }
        if (c() && ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.ActivityC12328x4aa1de9) getBaseContext()).isDestroyed()) {
            return;
        }
        j(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1140xd93301d8.b(this), false);
    }
}
