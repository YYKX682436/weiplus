package qe5;

/* loaded from: classes12.dex */
public final class m2 extends wm3.a implements zs3.t {

    /* renamed from: d, reason: collision with root package name */
    public final i40.b f443683d;

    /* renamed from: e, reason: collision with root package name */
    public final qe5.l2 f443684e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m2(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f443683d = new qe5.j2(this);
        this.f443684e = new qe5.l2(this, activity);
    }

    public static final void T6(qe5.m2 m2Var) {
        jz5.f0 f0Var;
        kd5.e U6 = m2Var.U6();
        if (U6 != null) {
            U6.H = true;
            java.lang.String str = U6.f388413h;
            if (str == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.File.RecordFileDownloadUIC", "talker is null");
                return;
            }
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = U6.f388410e;
            if (f9Var == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.File.RecordFileDownloadUIC", "msgSvrId is null");
                return;
            }
            long I0 = f9Var.I0();
            java.lang.String str2 = U6.f388418p;
            if (str2 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.File.RecordFileDownloadUIC", "dataId is null");
                return;
            }
            h40.f fVar = new h40.f(str, I0);
            fVar.f360277e = new h40.a(str2);
            fVar.f360275c = m2Var.f443684e;
            fVar.f360278f = h40.b.f360255g;
            ((d40.q) ((e40.w) i95.n0.c(e40.w.class))).aj(fVar);
            f0Var = jz5.f0.f384359a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.File.RecordFileDownloadUIC", "startReceiveFile, getFileDownloadState is null");
        }
    }

    @Override // zs3.t
    public void B0(int i17, zs3.y yVar) {
        if (yVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.File.RecordFileDownloadUIC", "on cdn info changed, but cdn info is null");
            return;
        }
        kd5.e U6 = U6();
        java.lang.String str = U6 != null ? U6.f388424v : null;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.File.RecordFileDownloadUIC", "cur mediaid[%s], notify mediaid[%s]", str, yVar.f68324xaca5bdda);
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, yVar.f68324xaca5bdda)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.File.RecordFileDownloadUIC", "on cdn info changed, but media id not match");
            return;
        }
        int i18 = yVar.f68328x10a0fed7;
        if (i18 == 2 || i18 == 3 || i18 == 4) {
            return;
        }
        int max = (int) ((((float) yVar.f68325x90a9378) / java.lang.Math.max(1.0d, yVar.f68330xeb1a61d6)) * 100);
        kd5.e U62 = U6();
        if (U62 != null) {
            U62.f388421s = max;
        }
        j75.f Q6 = Q6();
        if (Q6 != null) {
            Q6.B3(new kd5.u(2, 0));
        }
    }

    public final kd5.e U6() {
        j75.f Q6 = Q6();
        if (Q6 != null) {
            return (kd5.e) Q6.mo140437x75286adb();
        }
        return null;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        j75.f Q6 = Q6();
        if (Q6 != null) {
            Q6.L2(m158354x19263085(), new qe5.i2(this));
        }
        ((bt3.t1) ((ys3.i) ((zs3.q) i95.n0.c(zs3.q.class))).bj()).y0(this);
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
        ((bt3.t1) ((ys3.i) ((zs3.q) i95.n0.c(zs3.q.class))).bj()).P0(this);
        kd5.e U6 = U6();
        if (U6 != null) {
            java.lang.String str = U6.f388413h;
            if (str == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.File.RecordFileDownloadUIC", "talker is null");
                return;
            }
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = U6.f388410e;
            if (f9Var == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.File.RecordFileDownloadUIC", "msgSvrId is null");
                return;
            }
            long I0 = f9Var.I0();
            java.lang.String str2 = U6.f388418p;
            if (str2 == null) {
                str2 = "";
            }
            h40.f fVar = new h40.f(str, I0);
            fVar.f360277e = new h40.a(str2);
            fVar.f360275c = this.f443684e;
            fVar.f360278f = h40.b.f360255g;
            ((d40.q) ((e40.w) i95.n0.c(e40.w.class))).mj(fVar);
        }
    }
}
