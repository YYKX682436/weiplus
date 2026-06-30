package dz4;

/* loaded from: classes12.dex */
public final class i3 {

    /* renamed from: a, reason: collision with root package name */
    public final ih0.p f326838a;

    /* renamed from: b, reason: collision with root package name */
    public dz4.n0 f326839b;

    /* renamed from: c, reason: collision with root package name */
    public final jz5.g f326840c;

    public i3(ih0.p holder) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        this.f326838a = holder;
        this.f326840c = jz5.h.b(new dz4.e3(this));
    }

    public final com.p314xaae8f345.p3133xd0ce8b26.aff.p3143x95976a57.j a(java.lang.String imgPath) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(imgPath, "imgPath");
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3143x95976a57.j jVar = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3143x95976a57.j();
        java.lang.String b17 = hz4.l.b("ImageDataItem-".concat(imgPath), 18);
        r45.gp0 gp0Var = new r45.gp0();
        gp0Var.e0(b17);
        java.lang.String i17 = com.p314xaae8f345.mm.vfs.w6.i(hz4.l.c(gp0Var), true);
        java.lang.String i18 = com.p314xaae8f345.mm.vfs.w6.i(hz4.l.e(gp0Var), true);
        java.lang.String c17 = qz4.c.c(imgPath, i17);
        java.lang.String d17 = qz4.c.d(c17, i18);
        jVar.k(d17);
        jVar.l((int) com.p314xaae8f345.mm.vfs.w6.k(d17));
        jz5.l c18 = c(d17);
        int intValue = ((java.lang.Number) c18.f384366d).intValue();
        int intValue2 = ((java.lang.Number) c18.f384367e).intValue();
        jVar.n(intValue);
        jVar.j(intValue2);
        jVar.g(c17);
        jVar.d(0);
        jVar.i((int) com.p314xaae8f345.mm.vfs.w6.k(c17));
        jVar.e(true);
        jVar.c(com.p314xaae8f345.mm.vfs.w6.n(imgPath));
        jVar.f(false);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("createImageMediaInfoRespSync: thumbPath=");
        sb6.append(jVar.m112716x4eae2065());
        sb6.append(", thumb_size=");
        sb6.append(jVar.f298340o);
        sb6.append(", thumbWidth=");
        sb6.append(jVar.f298338m);
        sb6.append(", thumbHeight=");
        sb6.append(jVar.f298339n);
        sb6.append(", media_path=");
        sb6.append(jVar.m112715x7f002773());
        sb6.append(", duration=");
        sb6.append(jVar.f298341p);
        sb6.append(", size=");
        sb6.append(jVar.f298334f);
        sb6.append(", is_image=");
        sb6.append(jVar.f298336h);
        sb6.append(", dataFmt=");
        sb6.append(jVar.f298344s[4] ? jVar.f298335g : "");
        sb6.append(", isRaw=");
        sb6.append(jVar.f298333e);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeNoteFlutterMediaPickHelper", sb6.toString());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeNoteFlutterMediaPickHelper", "createImageMediaInfoRespSync: thumbExist=" + com.p314xaae8f345.mm.vfs.w6.j(d17) + ", mediaExist=" + com.p314xaae8f345.mm.vfs.w6.j(c17));
        return jVar;
    }

    public final boolean b() {
        return ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_fav_note_android_video_async_compress, false);
    }

    public final jz5.l c(java.lang.String str) {
        if ((str == null || str.length() == 0) || !com.p314xaae8f345.mm.vfs.w6.j(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeNoteFlutterMediaPickHelper", "getImageDimensions but imagePath err");
            return new jz5.l(0, 0);
        }
        try {
            android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            android.graphics.Bitmap d17 = com.p314xaae8f345.mm.p786x600aa8b.e.d(str, options);
            if (d17 != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeNoteFlutterMediaPickHelper", "recycle bitmap:%s", d17.toString());
                d17.recycle();
            }
            int i17 = options.outWidth;
            if (i17 <= 0) {
                i17 = 0;
            }
            int i18 = options.outHeight;
            return new jz5.l(java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18 > 0 ? i18 : 0));
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WeNoteFlutterMediaPickHelper", "Failed to get image dimensions for path: " + str + ", error: " + e17.getMessage());
            return new jz5.l(0, 0);
        }
    }

    public final void d(java.util.ArrayList arrayList, java.util.ArrayList arrayList2) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("handleMediaAsync start, photoCount: ");
        sb6.append(arrayList != null ? arrayList.size() : 0);
        sb6.append(", videoCount: ");
        sb6.append(arrayList2 != null ? arrayList2.size() : 0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeNoteFlutterMediaPickHelper", sb6.toString());
        fz4.g gVar = (fz4.g) ((jz5.n) this.f326840c).mo141623x754a37bb();
        dz4.h3 h3Var = new dz4.h3(this);
        gVar.getClass();
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("processMediaAsync start, photoCount: ");
        sb7.append(arrayList != null ? arrayList.size() : 0);
        sb7.append(", videoCount: ");
        sb7.append(arrayList2 != null ? arrayList2.size() : 0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeNoteAsyncMediaProcessor", sb7.toString());
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.f0();
        java.lang.Object obj = new java.lang.Object();
        int i17 = ((arrayList == null || arrayList.isEmpty()) ? 1 : 0) ^ 1;
        int size = i17 + (arrayList2 != null ? arrayList2.size() : 0);
        if (size == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeNoteAsyncMediaProcessor", "processMediaAsync no media to process");
            h3Var.mo146xb9724478(null);
            return;
        }
        fz4.f fVar = new fz4.f(obj, f0Var, arrayList3, size, h3Var);
        if (i17 != 0) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(arrayList);
            fz4.d dVar = new fz4.d(fVar);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeNoteAsyncMediaProcessor", "addImagesAsync start, imageCount: " + arrayList.size());
            if (arrayList.isEmpty()) {
                dVar.mo146xb9724478(null);
            } else {
                ((ku5.t0) ku5.t0.f394148d).g(new fz4.a(arrayList, gVar, dVar));
            }
        }
        if (arrayList2 == null || arrayList2.isEmpty()) {
            return;
        }
        java.util.Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
            fz4.e eVar = new fz4.e(fVar);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeNoteAsyncMediaProcessor", "addVideoAsync start, videoPath: ".concat(str));
            ((ku5.t0) ku5.t0.f394148d).g(new fz4.c(gVar, str, eVar));
        }
    }

    public final void e(java.util.ArrayList arrayList, java.util.ArrayList arrayList2) {
        android.app.Activity activity;
        android.app.Activity activity2;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("handleMediaSync start, photoCount: ");
        sb6.append(arrayList != null ? arrayList.size() : 0);
        sb6.append(", videoCount: ");
        sb6.append(arrayList2 != null ? arrayList2.size() : 0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeNoteFlutterMediaPickHelper", sb6.toString());
        if (arrayList2 == null || arrayList2.isEmpty()) {
            if (arrayList == null || arrayList.isEmpty()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeNoteFlutterMediaPickHelper", "handleMediaSync no media selected");
                dz4.n0 n0Var = this.f326839b;
                if (n0Var != null) {
                    n0Var.a(null);
                    return;
                }
                return;
            }
            java.lang.ref.WeakReference weakReference = ((ez4.u) this.f326838a).f339477c;
            if (weakReference == null || (activity = (android.app.Activity) weakReference.get()) == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WeNoteFlutterMediaPickHelper", "addImageSync failed, Activity is null");
                return;
            }
            if (!arrayList.isEmpty()) {
                p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
                h0Var.f391656d = db5.e1.Q(activity, activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572137zq), true, true, new dz4.c3(h0Var));
                ((ku5.t0) ku5.t0.f394148d).g(new dz4.d3(arrayList, this, h0Var));
                return;
            } else {
                dz4.n0 n0Var2 = this.f326839b;
                if (n0Var2 != null) {
                    n0Var2.a(null);
                    return;
                }
                return;
            }
        }
        java.lang.Object obj = arrayList2.get(0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
        java.lang.String str = (java.lang.String) obj;
        ((be0.e) ((com.p314xaae8f345.mm.p689xc5a27af6.p764x685d99d.api.o) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p764x685d99d.api.o.class))).getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.b d17 = com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.e.d(str, true);
        if (d17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WeNoteFlutterMediaPickHelper", "addVideoSync mediaInfo is null, videoPath is %s", str);
            dz4.n0 n0Var3 = this.f326839b;
            if (n0Var3 != null) {
                n0Var3.a(null);
                return;
            }
            return;
        }
        int a17 = d17.a();
        iz4.k kVar = new iz4.k();
        kVar.f377667r = true;
        kVar.f377650t = "";
        kVar.f377668s = "";
        kVar.f377651u = a17;
        kVar.f377666q = 6;
        kVar.f377652v = com.p314xaae8f345.mm.vfs.w6.n(str);
        kVar.f377636a = hz4.l.b(kVar.toString(), 18);
        r45.gp0 gp0Var = new r45.gp0();
        gp0Var.e0(kVar.f377636a);
        gp0Var.i0(kVar.f377652v);
        java.lang.String e17 = hz4.l.e(gp0Var);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(e17, "getThumbPath(...)");
        java.lang.String c17 = hz4.l.c(gp0Var);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getDataPathName(...)");
        java.lang.ref.WeakReference weakReference2 = ((ez4.u) this.f326838a).f339477c;
        if (weakReference2 == null || (activity2 = (android.app.Activity) weakReference2.get()) == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WeNoteFlutterMediaPickHelper", "compressNoteVideoSync failed, Activity is null");
            dz4.n0 n0Var4 = this.f326839b;
            if (n0Var4 != null) {
                n0Var4.a(null);
                return;
            }
            return;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WeNoteFlutterMediaPickHelper", "compressNoteVideoSync video is null");
            dz4.n0 n0Var5 = this.f326839b;
            if (n0Var5 != null) {
                n0Var5.a(null);
                return;
            }
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeNoteFlutterMediaPickHelper", "compressNoteVideoSync from path: %s", str);
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(str);
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var2 = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
        mz4.s sVar = new mz4.s(arrayList3, e17, c17, kVar, new dz4.g3(h0Var2, this, activity2));
        h0Var2.f391656d = db5.e1.Q(activity2, activity2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), activity2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572137zq), true, true, new dz4.f3(sVar, kVar));
        ((ku5.t0) ku5.t0.f394148d).h(sVar, "NoteEditor_importVideo");
    }
}
