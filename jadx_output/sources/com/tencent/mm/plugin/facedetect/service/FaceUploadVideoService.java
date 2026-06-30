package com.tencent.mm.plugin.facedetect.service;

/* loaded from: classes12.dex */
public class FaceUploadVideoService extends com.tencent.mm.service.MMService implements com.tencent.mm.modelbase.u0 {

    /* renamed from: i, reason: collision with root package name */
    public int f100047i = -1;

    @Override // com.tencent.mm.service.MMService
    public java.lang.String b() {
        return "MicroMsg.FaceUploadVideoService";
    }

    @Override // com.tencent.mm.service.MMService
    public android.os.IBinder c(android.content.Intent intent) {
        return null;
    }

    @Override // com.tencent.mm.service.MMService
    public int g(android.content.Intent intent, int i17, int i18) {
        if (intent == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FaceUploadVideoService", "hy: null intent called to FaceUploadVideoService! Stub");
            super.g(null, i17, i18);
            return 0;
        }
        java.lang.String stringExtra = intent.getStringExtra("key_video_file_name");
        long longExtra = intent.getLongExtra("k_bio_id", -1L);
        java.lang.String stringExtra2 = intent.getStringExtra("key_app_id");
        this.f100047i = intent.getIntExtra("key_face_type", -1);
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceUploadVideoService", "hy: start uploading %s", stringExtra);
        if (com.tencent.mm.sdk.platformtools.t8.K0(stringExtra)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.FaceUploadVideoService", "hy: null file name");
            vz2.c.i(this.f100047i, -2, "null file name");
            super.g(intent, i17, i18);
            return 0;
        }
        com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(stringExtra);
        java.lang.String str = a17.f213279f;
        if (str != null) {
            java.lang.String l17 = com.tencent.mm.vfs.e8.l(str, false, false);
            if (!str.equals(l17)) {
                a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
            }
        }
        com.tencent.mm.vfs.z2 m17 = com.tencent.mm.vfs.a3.f212781a.m(a17, null);
        if (!(!m17.a() ? false : m17.f213266a.F(m17.f213267b))) {
            com.tencent.mars.xlog.Log.w("MicroMsg.FaceUploadVideoService", "hy: file not exist");
            vz2.c.i(this.f100047i, -3, "file not exist");
            super.g(intent, i17, i18);
            return 0;
        }
        if (longExtra == -1 && com.tencent.mm.sdk.platformtools.t8.K0(stringExtra2)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.FaceUploadVideoService", "hy: bioId or app id null");
            vz2.c.i(this.f100047i, -4, "bioId or app id null");
            com.tencent.mm.vfs.w6.h(stringExtra);
            super.g(intent, i17, i18);
            return 0;
        }
        dn.m mVar = new dn.m();
        mVar.f241785d = "task_FaceUploadVideoService";
        mVar.field_mediaId = com.tencent.mm.plugin.facedetect.model.s0.f(stringExtra);
        mVar.field_fullpath = stringExtra;
        mVar.field_thumbpath = "";
        mVar.field_fileType = 5;
        mVar.field_talker = "";
        mVar.field_priority = 2;
        mVar.field_needStorage = false;
        mVar.field_isStreamMedia = false;
        mVar.field_appType = 0;
        mVar.field_bzScene = 0;
        mVar.field_largesvideo = 0;
        int intExtra = intent.getIntExtra("key_video_upload_type", 0);
        mVar.f241787f = new f72.k(this, intent);
        if (intExtra == 1) {
            mVar.f241787f = new f72.l(this, intent);
        }
        if (!((rx.l) ((sx.e0) i95.n0.c(sx.e0.class))).Bi(mVar)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FaceUploadVideoService", "hy: video task info failed. clientid:%s", mVar.field_mediaId);
            vz2.c.i(this.f100047i, -5, "add task fail");
            com.tencent.mm.vfs.w6.h(stringExtra);
            com.tencent.mm.plugin.facedetect.model.FaceDetectReporter.d(longExtra, 1, 10086);
        }
        super.g(intent, i17, i18);
        return 0;
    }

    public final void i(java.lang.String str, boolean z17) {
        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(917L, z17 ? 25L : 26L, 1L, false);
        com.tencent.mm.vfs.w6.h(str);
        stopSelf();
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        if (m1Var == null) {
            return;
        }
        boolean z17 = i18 == 0;
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceUploadVideoService", "bind video errType: %d, errCode: %d, errMsg: %s, requestType: %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str, java.lang.Integer.valueOf(m1Var.getType()));
        if (m1Var instanceof c72.x) {
            gm0.j1.d().q(1197, this);
            i(((c72.x) m1Var).f39601f, z17);
        }
        if (m1Var instanceof c72.c0) {
            gm0.j1.d().q(21081, this);
            i(((c72.c0) m1Var).f39543f, z17);
        }
        if (m1Var instanceof c72.d0) {
            gm0.j1.d().q(12106, this);
            i(((c72.d0) m1Var).f39547h, z17);
        }
    }
}
