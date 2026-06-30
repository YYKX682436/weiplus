package fz4;

/* loaded from: classes12.dex */
public final class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fz4.g f348831d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f348832e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f348833f;

    public c(fz4.g gVar, java.lang.String str, yz5.l lVar) {
        this.f348831d = gVar;
        this.f348832e = str;
        this.f348833f = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.app.Activity activity;
        gp.a aVar;
        long j17;
        try {
            java.lang.ref.WeakReference weakReference = ((ez4.u) this.f348831d.f348841a).f339477c;
            android.app.Activity activity2 = weakReference != null ? (android.app.Activity) weakReference.get() : null;
            com.p314xaae8f345.mm.p689xc5a27af6.p764x685d99d.api.o oVar = (com.p314xaae8f345.mm.p689xc5a27af6.p764x685d99d.api.o) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p764x685d99d.api.o.class);
            java.lang.String str = this.f348832e;
            ((be0.e) oVar).getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.b d17 = com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.e.d(str, true);
            if (d17 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WeNoteAsyncMediaProcessor", "addVideoAsync mediaInfo is null, videoPath: " + this.f348832e);
                this.f348833f.mo146xb9724478(null);
                return;
            }
            android.content.Intent intent = new android.content.Intent();
            intent.setData(android.net.Uri.parse("file://" + this.f348832e));
            try {
                aVar = gp.b.b(activity2, intent, -1);
                activity = activity2;
            } catch (java.lang.Exception e17) {
                activity = activity2;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WeNoteAsyncMediaProcessor", e17, "addVideoAsync GetVideoMetadata failed", new java.lang.Object[0]);
                aVar = null;
            }
            if (aVar == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WeNoteAsyncMediaProcessor", "addVideoAsync GetVideoMetadata failed, videoPath: " + this.f348832e);
                this.f348833f.mo146xb9724478(null);
                return;
            }
            int a17 = d17.a();
            if (a17 < 0) {
                a17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.V1(aVar.f355694c);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeNoteAsyncMediaProcessor", "addVideoAsync duration: " + a17);
            iz4.k kVar = new iz4.k();
            java.lang.String str2 = this.f348832e;
            kVar.f377667r = true;
            kVar.f377651u = a17;
            kVar.f377666q = 6;
            kVar.f377652v = com.p314xaae8f345.mm.vfs.w6.n(str2);
            kVar.f377665p = (int) com.p314xaae8f345.mm.vfs.w6.k(str2);
            kVar.f377636a = hz4.l.b(kVar.toString(), 18);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeNoteAsyncMediaProcessor", "addVideoAsync: generated initial dataId=" + kVar.f377636a + " for video: " + this.f348832e + ", fmt: " + kVar.f377652v + ", dataSize: " + kVar.f377665p);
            r45.gp0 gp0Var = new r45.gp0();
            gp0Var.e0(kVar.f377636a);
            gp0Var.i0(kVar.f377652v);
            java.lang.String e18 = hz4.l.e(gp0Var);
            java.lang.String c17 = hz4.l.c(gp0Var);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeNoteAsyncMediaProcessor", "addVideoAsync generated paths, dataId: " + kVar.f377636a + ", thumbPath: " + e18 + ", dataPath: " + c17);
            fz4.g gVar = this.f348831d;
            android.graphics.Bitmap bitmap = aVar.f355693b;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(e18);
            fz4.g.b(gVar, bitmap, e18);
            kVar.f377650t = e18;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeNoteAsyncMediaProcessor", "addVideoAsync created thumbnail, thumbPath: " + e18 + ", exists: " + com.p314xaae8f345.mm.vfs.w6.j(e18));
            ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).getClass();
            long g17 = ip.c.g();
            int vj6 = ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).vj();
            long k17 = com.p314xaae8f345.mm.vfs.w6.k(this.f348832e);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeNoteAsyncMediaProcessor", "addVideoAsync check file size, originalFileSize: " + k17 + ", maxFavFileSize: " + g17);
            if (k17 >= g17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WeNoteAsyncMediaProcessor", "addVideoAsync file too large, originalFileSize: " + k17 + ", maxFavFileSize: " + g17);
                ((ku5.t0) ku5.t0.f394148d).B(new fz4.b(activity, vj6));
                this.f348833f.mo146xb9724478(null);
                return;
            }
            try {
                j17 = com.p314xaae8f345.mm.vfs.w6.d(this.f348832e, c17, false);
            } catch (java.lang.Exception e19) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WeNoteAsyncMediaProcessor", e19, "addVideoAsync copy file error", new java.lang.Object[0]);
                j17 = -1;
            }
            if (j17 < 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WeNoteAsyncMediaProcessor", "addVideoAsync copy file failed");
                this.f348833f.mo146xb9724478(null);
                return;
            }
            kVar.f377668s = c17;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeNoteAsyncMediaProcessor", "addVideoAsync copied file, from: " + this.f348832e + ", to: " + c17 + ", targetExists: " + com.p314xaae8f345.mm.vfs.w6.j(c17));
            java.lang.String dataId = kVar.f377636a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(dataId, "dataId");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c17);
            d82.j.b(dataId, c17);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeNoteAsyncMediaProcessor", "addVideoAsync started compress task, dataId: " + kVar.f377636a);
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3143x95976a57.j c18 = fz4.g.c(this.f348831d, kVar);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeNoteAsyncMediaProcessor", "addVideoAsync success, dataId: " + kVar.f377636a + ", localPath: " + kVar.f377668s + ", thumbPath: " + kVar.f377650t);
            this.f348833f.mo146xb9724478(c18);
        } catch (java.lang.Exception e27) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WeNoteAsyncMediaProcessor", e27, "addVideoAsync error", new java.lang.Object[0]);
            this.f348833f.mo146xb9724478(null);
        }
    }
}
