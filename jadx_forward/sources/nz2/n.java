package nz2;

/* loaded from: classes9.dex */
public class n extends nz2.a {

    /* renamed from: d, reason: collision with root package name */
    public mb.e f423100d;

    /* JADX WARN: Not initialized variable reg: 15, insn: 0x0234: MOVE (r7 I:??[OBJECT, ARRAY]) = (r15 I:??[OBJECT, ARRAY]), block:B:131:0x0234 */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0238 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:140:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01b7 A[Catch: Exception -> 0x01c3, TryCatch #16 {Exception -> 0x01c3, blocks: (B:36:0x0198, B:38:0x01b7, B:46:0x01bd), top: B:35:0x0198 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01bd A[Catch: Exception -> 0x01c3, TRY_LEAVE, TryCatch #16 {Exception -> 0x01c3, blocks: (B:36:0x0198, B:38:0x01b7, B:46:0x01bd), top: B:35:0x0198 }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01ff A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01df A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0067  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x01c4 -> B:38:0x021f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void b(nz2.n r17, android.content.Context r18) {
        /*
            Method dump skipped, instructions count: 580
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: nz2.n.b(nz2.n, android.content.Context):void");
    }

    @Override // nz2.o
    public java.util.Map C() {
        return null;
    }

    @Override // nz2.o
    public void C3(android.content.Context context, nz2.f fVar, nz2.b bVar) {
    }

    @Override // nz2.o
    public boolean D() {
        return false;
    }

    @Override // nz2.o
    public void D1(java.lang.Object... objArr) {
        if (objArr == null || objArr.length < 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.HuaweiBiometricPayManagerImpl", "hy: param incorrect");
            return;
        }
        java.lang.String b17 = mz2.n0.b();
        if (mz2.n0.c()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1693xadfce8e4.C15518x5dfa006c.m63452xb4382b97(mz2.n0.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a), b17, ((java.lang.Integer) objArr[0]).intValue());
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.HuaweiBiometricPayManagerImpl", "device is not support FingerPrintAuth");
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.HuaweiBiometricPayManagerImpl", "clear fingerprint data id:" + b17 + " clear_rsa_key_level:" + objArr[0]);
    }

    @Override // nz2.o
    public boolean E2() {
        return false;
    }

    @Override // nz2.a, nz2.o
    public boolean Je() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.HuaweiBiometricPayManagerImpl", "canUse: %s, %s", java.lang.Boolean.valueOf(mz2.n0.d()), java.lang.Boolean.valueOf(mz2.n0.f414693a));
        return wh() && mz2.n0.d() && mz2.n0.f414693a;
    }

    @Override // nz2.o
    public boolean Lf(android.content.Context context) {
        boolean Je = Je();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.HuaweiBiometricPayManagerImpl", "isSupportFingerprint:%s", java.lang.Boolean.valueOf(Je));
        return Je;
    }

    @Override // nz2.o
    public void Mf(boolean z17, boolean z18, boolean z19, android.os.Bundle bundle) {
    }

    public final mb.e c() {
        mb.j a17 = mb.e.a();
        mb.e eVar = null;
        if (a17 != null) {
            try {
                eVar = new mb.e(a17, android.os.Looper.getMainLooper(), 1);
            } catch (java.lang.Exception unused) {
            }
        }
        this.f423100d = eVar;
        return eVar;
    }

    @Override // nz2.o
    /* renamed from: cancel */
    public void mo150320xae7a2e7a() {
        mb.e eVar = this.f423100d;
        if (eVar != null) {
            try {
                mb.c cVar = eVar.f406815c;
                if (cVar != null) {
                    cVar.removeMessages(8);
                }
                try {
                    ((mb.h) eVar.f406813a).d(eVar.f406814b);
                } catch (android.os.RemoteException unused) {
                }
                this.f423100d.b();
            } catch (java.lang.Exception unused2) {
            }
        }
    }

    @Override // nz2.o
    public void g9(android.content.Context context, nz2.f fVar, nz2.b bVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.HuaweiBiometricPayManagerImpl", "request fingerprint authorize: %s", fVar.f423088c);
        if (this.f423100d == null) {
            c();
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(new nz2.m(this, bVar, fVar), 300L);
    }

    @Override // nz2.o
    public boolean h1() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.HuaweiBiometricPayManagerImpl", "isSupportFaceId");
        return false;
    }

    @Override // nz2.o
    public boolean ja() {
        int[] iArr;
        c();
        mb.e eVar = this.f423100d;
        boolean z17 = false;
        if (eVar == null) {
            return false;
        }
        try {
            iArr = ((mb.h) eVar.f406813a).e(eVar.f406814b);
        } catch (android.os.RemoteException unused) {
            iArr = new int[0];
        }
        if (iArr == null || iArr.length <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.HuaweiBiometricPayManagerImpl", "ids is null");
        }
        try {
            this.f423100d.b();
        } catch (java.lang.Exception unused2) {
        }
        this.f423100d = null;
        if (iArr != null && iArr.length > 0) {
            z17 = true;
        }
        ((ku5.t0) ku5.t0.f394148d).g(new nz2.j(this, z17));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.HuaweiBiometricPayManagerImpl", "isDeviceHasFingerPrint:%s", java.lang.Boolean.valueOf(z17));
        return z17;
    }

    @Override // nz2.o
    public boolean mf() {
        return true;
    }

    @Override // nz2.o
    public int of() {
        return 1;
    }

    @Override // nz2.o
    /* renamed from: prepare */
    public void mo150321xed060d07() {
        if (((pz2.a) gm0.j1.s(pz2.a.class)).mo148658x368f3a() != 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.HuaweiBiometricPayManagerImpl", "set soter manager");
            mz2.l0 l0Var = new mz2.l0();
            l0Var.c(this);
            gm0.j1.q(pz2.a.class, l0Var);
        }
        if (wo.w0.q()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.HuaweiBiometricPayManagerImpl", "not support 64bit");
        } else {
            s75.d.b(new nz2.i(this), nz2.n.class.getName());
        }
    }

    @Override // nz2.o
    public pz2.d r1() {
        return new mz2.d1();
    }

    @Override // nz2.o
    public boolean uf(android.content.Context context) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.HuaweiBiometricPayManagerImpl", "isSupportFaceId");
        return false;
    }

    @Override // nz2.o
    public boolean wh() {
        int[] iArr;
        boolean z17;
        boolean z18 = wo.v1.f529359f.f529400a == 1;
        boolean z19 = wo.v1.f529361h.f529343a;
        mb.j a17 = mb.e.a();
        if (a17 == null) {
            iArr = new int[0];
        } else {
            try {
                mb.h hVar = (mb.h) a17;
                android.os.Parcel obtain = android.os.Parcel.obtain();
                android.os.Parcel obtain2 = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.huawei.securitymgr.IAuthenticationService");
                    hVar.f406819d.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                    iArr = obtain2.createIntArray();
                    obtain2.recycle();
                    obtain.recycle();
                } catch (java.lang.Throwable th6) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th6;
                }
            } catch (android.os.RemoteException unused) {
                iArr = new int[0];
            }
        }
        if (iArr != null) {
            for (int i17 : iArr) {
                if (1 == i17) {
                    z17 = true;
                    break;
                }
            }
        }
        z17 = false;
        boolean a18 = is4.a.a("MMKV_KEY_SUPPORT_FINGER", z17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.HuaweiBiometricPayManagerImpl", "is support: %s, %s, %s", java.lang.Boolean.valueOf(z18), java.lang.Boolean.valueOf(a18), java.lang.Boolean.valueOf(z19));
        return z18 && a18 && !z19;
    }

    @Override // nz2.o
    public void z9(android.content.Context context, nz2.f fVar, nz2.d dVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.HuaweiBiometricPayManagerImpl", "request fingerprint authorize for pay");
        if (dVar == null) {
            return;
        }
        g9(context, fVar, new nz2.k(this, dVar));
    }
}
