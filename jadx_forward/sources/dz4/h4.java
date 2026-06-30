package dz4;

/* loaded from: classes12.dex */
public final class h4 {

    /* renamed from: a, reason: collision with root package name */
    public final ih0.p f326816a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f326817b;

    /* renamed from: c, reason: collision with root package name */
    public final int f326818c;

    /* renamed from: d, reason: collision with root package name */
    public final long f326819d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f326820e;

    /* renamed from: f, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.y0 f326821f;

    /* renamed from: g, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.r2 f326822g;

    public h4(ih0.p holder) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        this.f326816a = holder;
        this.f326817b = "MicroMsg.WeNoteFlutterShareSnsHelper";
        this.f326818c = 20;
        this.f326819d = 1000L;
        this.f326821f = p3325xe03a0797.p3326xc267989b.z0.b();
    }

    public static final void a(dz4.h4 h4Var) {
        android.app.Activity activity;
        java.lang.ref.WeakReference weakReference = ((ez4.u) h4Var.f326816a).f339477c;
        if (weakReference == null || (activity = (android.app.Activity) weakReference.get()) == null) {
            return;
        }
        int i17 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(activity);
        e4Var.f293309c = activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.j3u);
        e4Var.c();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x00de -> B:11:0x00e1). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x0093 -> B:26:0x0096). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(dz4.h4 r8, long r9, boolean r11, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r12) {
        /*
            Method dump skipped, instructions count: 257
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dz4.h4.b(dz4.h4, long, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void c(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        if (context == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.f326817b, "jumpSnsPostUI context null");
            return;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            ((ku5.t0) ku5.t0.f394148d).B(new dz4.e4(this));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.f326817b, "jumpSnsPostUI: failed xml empty");
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Ksnsupload_type", 15);
        intent.putExtra("need_result", true);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3)) {
            str3 = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.l_l);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str3);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str3);
        }
        intent.putExtra("fav_note_xml", str);
        intent.putExtra("Ksnsupload_title", str3);
        intent.putExtra("Ksnsupload_link", com.p314xaae8f345.mm.ui.v2.f292634a);
        intent.putExtra("fav_note_link_description", "note description");
        intent.putExtra("Ksnsupload_imgbuf", com.p314xaae8f345.mm.vfs.w6.N(str2, 0, -1));
        j45.l.n(context, "sns", ".ui.SnsUploadUI", intent, 4359);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f326817b, "jumpSnsPostUI called");
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00c5, code lost:
    
        if (r10 == null) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(dz4.g r10, com.p314xaae8f345.p3133xd0ce8b26.aff.p3164x6bba817.h r11) {
        /*
            Method dump skipped, instructions count: 241
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dz4.h4.d(dz4.g, com.tencent.wechat.aff.wcrte.h):void");
    }
}
