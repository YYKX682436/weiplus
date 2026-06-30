package dz4;

/* loaded from: classes12.dex */
public final class g3 implements mz4.q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f326792a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ dz4.i3 f326793b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f326794c;

    public g3(p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, dz4.i3 i3Var, android.app.Activity activity) {
        this.f326792a = h0Var;
        this.f326793b = i3Var;
        this.f326794c = activity;
    }

    @Override // mz4.q
    public void a(java.lang.String filePath, iz4.k kVar) {
        com.p314xaae8f345.mm.vfs.x1 m17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(filePath, "filePath");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("compressNoteVideoSync onExportFinish thumbPath ");
        sb6.append(kVar != null ? kVar.f377650t : null);
        sb6.append(", videoPath=");
        sb6.append(kVar != null ? kVar.f377668s : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeNoteFlutterMediaPickHelper", sb6.toString());
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = this.f326792a;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3) h0Var.f391656d;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        h0Var.f391656d = null;
        boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(filePath);
        dz4.i3 i3Var = this.f326793b;
        if (K0 || !com.p314xaae8f345.mm.vfs.w6.j(filePath) || kVar == null || kVar.f377653w) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeNoteFlutterMediaPickHelper", "compressNoteVideoSync file not exist or user canceled");
        } else {
            com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(filePath);
            java.lang.String str = a17.f294812f;
            if (str != null) {
                java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str, false, false);
                if (!str.equals(l17)) {
                    a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
                }
            }
            ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).getClass();
            long g17 = ip.c.g();
            int vj6 = ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).vj();
            com.p314xaae8f345.mm.vfs.z2 m18 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a17, null);
            if (((m18.a() && (m17 = m18.f294799a.m(m18.f294800b)) != null) ? m17.f294766c : 0L) < g17) {
                kVar.f377668s = com.p314xaae8f345.mm.vfs.w6.i(filePath, false);
                dz4.n0 n0Var = i3Var.f326839b;
                if (n0Var != null) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    com.p314xaae8f345.p3133xd0ce8b26.aff.p3143x95976a57.j jVar = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3143x95976a57.j();
                    jVar.k(kVar.f377650t);
                    jVar.l((int) com.p314xaae8f345.mm.vfs.w6.k(kVar.f377668s));
                    jz5.l c17 = i3Var.c(kVar.f377650t);
                    int intValue = ((java.lang.Number) c17.f384366d).intValue();
                    int intValue2 = ((java.lang.Number) c17.f384367e).intValue();
                    jVar.n(intValue);
                    jVar.j(intValue2);
                    jVar.g(kVar.f377668s);
                    jVar.d(kVar.f377651u);
                    jVar.i(kVar.f377665p);
                    jVar.e(false);
                    jVar.c(kVar.f377652v);
                    jVar.f(false);
                    java.lang.StringBuilder sb7 = new java.lang.StringBuilder("createMediaInfoByVideoDataItemSync: thumbPath=");
                    sb7.append(jVar.m112716x4eae2065());
                    sb7.append(", thumb_size=");
                    sb7.append(jVar.f298340o);
                    sb7.append(", thumbWidth=");
                    sb7.append(jVar.f298338m);
                    sb7.append(", thumbHeight=");
                    sb7.append(jVar.f298339n);
                    sb7.append(", media_path=");
                    sb7.append(jVar.m112715x7f002773());
                    sb7.append(", duration=");
                    sb7.append(jVar.f298341p);
                    sb7.append(", size=");
                    sb7.append(jVar.f298334f);
                    sb7.append(", is_image=");
                    sb7.append(jVar.f298336h);
                    sb7.append(", dataFmt=");
                    sb7.append(jVar.f298344s[4] ? jVar.f298335g : "");
                    sb7.append(", isRaw=");
                    sb7.append(jVar.f298333e);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeNoteFlutterMediaPickHelper", sb7.toString());
                    arrayList.add(jVar);
                    n0Var.a(arrayList);
                    return;
                }
                return;
            }
            java.lang.Object[] objArr = {java.lang.Integer.valueOf(vj6)};
            android.app.Activity activity = this.f326794c;
            dp.a.m125854x26a183b(activity, activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.cds, objArr), 1).show();
        }
        dz4.n0 n0Var2 = i3Var.f326839b;
        if (n0Var2 != null) {
            n0Var2.a(null);
        }
    }

    @Override // mz4.q
    public void b(java.lang.String thumbPath, iz4.k kVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(thumbPath, "thumbPath");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeNoteFlutterMediaPickHelper", "compressNoteVideoSync onImportFinish");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(thumbPath) || !com.p314xaae8f345.mm.vfs.w6.j(thumbPath) || kVar == null) {
            return;
        }
        kVar.f377650t = com.p314xaae8f345.mm.vfs.w6.i(thumbPath, false);
    }
}
