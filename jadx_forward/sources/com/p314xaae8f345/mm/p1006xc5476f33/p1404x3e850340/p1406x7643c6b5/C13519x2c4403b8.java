package com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1406x7643c6b5;

/* renamed from: com.tencent.mm.plugin.facedetect.service.FaceUploadVideoService */
/* loaded from: classes12.dex */
public class C13519x2c4403b8 extends com.p314xaae8f345.mm.p2613x7643c6b5.AbstractC21025xb0cc40f5 implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: i, reason: collision with root package name */
    public int f181580i = -1;

    @Override // com.p314xaae8f345.mm.p2613x7643c6b5.AbstractC21025xb0cc40f5
    public java.lang.String b() {
        return "MicroMsg.FaceUploadVideoService";
    }

    @Override // com.p314xaae8f345.mm.p2613x7643c6b5.AbstractC21025xb0cc40f5
    public android.os.IBinder c(android.content.Intent intent) {
        return null;
    }

    @Override // com.p314xaae8f345.mm.p2613x7643c6b5.AbstractC21025xb0cc40f5
    public int g(android.content.Intent intent, int i17, int i18) {
        if (intent == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FaceUploadVideoService", "hy: null intent called to FaceUploadVideoService! Stub");
            super.g(null, i17, i18);
            return 0;
        }
        java.lang.String stringExtra = intent.getStringExtra("key_video_file_name");
        long longExtra = intent.getLongExtra("k_bio_id", -1L);
        java.lang.String stringExtra2 = intent.getStringExtra("key_app_id");
        this.f181580i = intent.getIntExtra("key_face_type", -1);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceUploadVideoService", "hy: start uploading %s", stringExtra);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FaceUploadVideoService", "hy: null file name");
            vz2.c.i(this.f181580i, -2, "null file name");
            super.g(intent, i17, i18);
            return 0;
        }
        com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(stringExtra);
        java.lang.String str = a17.f294812f;
        if (str != null) {
            java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str, false, false);
            if (!str.equals(l17)) {
                a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
            }
        }
        com.p314xaae8f345.mm.vfs.z2 m17 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a17, null);
        if (!(!m17.a() ? false : m17.f294799a.F(m17.f294800b))) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FaceUploadVideoService", "hy: file not exist");
            vz2.c.i(this.f181580i, -3, "file not exist");
            super.g(intent, i17, i18);
            return 0;
        }
        if (longExtra == -1 && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra2)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FaceUploadVideoService", "hy: bioId or app id null");
            vz2.c.i(this.f181580i, -4, "bioId or app id null");
            com.p314xaae8f345.mm.vfs.w6.h(stringExtra);
            super.g(intent, i17, i18);
            return 0;
        }
        dn.m mVar = new dn.m();
        mVar.f323318d = "task_FaceUploadVideoService";
        mVar.f69601xaca5bdda = com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1405x633fb29.s0.f(stringExtra);
        mVar.f69595x6d25b0d9 = stringExtra;
        mVar.f69619xe9ed65f6 = "";
        mVar.f69592xf1ebe47b = 5;
        mVar.f69618x114ef53e = "";
        mVar.f69609xd84b8349 = 2;
        mVar.f69606xccdbf540 = false;
        mVar.f69597x853bb235 = false;
        mVar.f69580x454032b6 = 0;
        mVar.f69584x89a4c0cf = 0;
        mVar.f69598x47e3df1e = 0;
        int intExtra = intent.getIntExtra("key_video_upload_type", 0);
        mVar.f323320f = new f72.k(this, intent);
        if (intExtra == 1) {
            mVar.f323320f = new f72.l(this, intent);
        }
        if (!((rx.l) ((sx.e0) i95.n0.c(sx.e0.class))).Bi(mVar)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FaceUploadVideoService", "hy: video task info failed. clientid:%s", mVar.f69601xaca5bdda);
            vz2.c.i(this.f181580i, -5, "add task fail");
            com.p314xaae8f345.mm.vfs.w6.h(stringExtra);
            com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1405x633fb29.C13516xe45e9481.d(longExtra, 1, 10086);
        }
        super.g(intent, i17, i18);
        return 0;
    }

    public final void i(java.lang.String str, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(917L, z17 ? 25L : 26L, 1L, false);
        com.p314xaae8f345.mm.vfs.w6.h(str);
        m77854x66357a6e();
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        if (m1Var == null) {
            return;
        }
        boolean z17 = i18 == 0;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceUploadVideoService", "bind video errType: %d, errCode: %d, errMsg: %s, requestType: %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str, java.lang.Integer.valueOf(m1Var.mo808xfb85f7b0()));
        if (m1Var instanceof c72.x) {
            gm0.j1.d().q(1197, this);
            i(((c72.x) m1Var).f121134f, z17);
        }
        if (m1Var instanceof c72.c0) {
            gm0.j1.d().q(21081, this);
            i(((c72.c0) m1Var).f121076f, z17);
        }
        if (m1Var instanceof c72.d0) {
            gm0.j1.d().q(12106, this);
            i(((c72.d0) m1Var).f121080h, z17);
        }
    }
}
