package hz4;

/* loaded from: classes12.dex */
public abstract class h {

    /* renamed from: s, reason: collision with root package name */
    public static final java.util.HashMap f367944s = new java.util.HashMap();

    /* renamed from: t, reason: collision with root package name */
    public static boolean f367945t = false;

    /* renamed from: e, reason: collision with root package name */
    public o72.r2 f367947e;

    /* renamed from: d, reason: collision with root package name */
    public iz4.m f367946d = null;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.HashMap f367948f = new java.util.HashMap();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.HashMap f367949g = new java.util.HashMap();

    /* renamed from: h, reason: collision with root package name */
    public final java.util.Map f367950h = new java.util.LinkedHashMap();

    /* renamed from: i, reason: collision with root package name */
    public final hz4.i f367951i = new hz4.i();

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f367952m = "WeNote_0";

    /* renamed from: n, reason: collision with root package name */
    public boolean f367953n = false;

    /* renamed from: o, reason: collision with root package name */
    public r45.bq0 f367954o = new r45.bq0();

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f367955p = "";

    /* renamed from: q, reason: collision with root package name */
    public int f367956q = 0;

    /* renamed from: r, reason: collision with root package name */
    public final java.util.ArrayList f367957r = new java.util.ArrayList();

    public abstract boolean a(android.content.Context context, java.lang.String str);

    /* JADX WARN: Removed duplicated region for block: B:36:0x02fb  */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b(java.util.List r26, boolean r27, int r28) {
        /*
            Method dump skipped, instructions count: 1367
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: hz4.h.b(java.util.List, boolean, int):void");
    }

    public abstract void c(r45.gp0 gp0Var);

    public abstract void d(r45.gp0 gp0Var, java.lang.String str);

    public abstract java.lang.String e(r45.gp0 gp0Var);

    public r45.gp0 f(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WNNoteBase", "getFavDataItemByDataId, dataId is null");
            return null;
        }
        java.lang.String str2 = (java.lang.String) this.f367949g.get(str);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WNNoteBase", "getFavDataItemByDataId, can not find editorId by dataId: %s", str);
            return null;
        }
        iz4.o oVar = (iz4.o) ((java.util.LinkedHashMap) this.f367950h).get(str2);
        if (oVar != null) {
            return oVar.f377663n;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WNNoteBase", "getFavDataItemByDataId, can not find item by editorId: %s", str2);
        return null;
    }

    public boolean g() {
        mz4.d dVar = bz4.n0.f118367d;
        return dVar != null && dVar.f414771j;
    }

    public abstract java.lang.String h();

    public abstract java.lang.String i();

    public abstract java.lang.String j(r45.gp0 gp0Var);

    public abstract void k(android.content.Context context, java.lang.String str);

    public abstract void l(android.content.Context context, java.lang.String str);

    public abstract void m(android.content.Context context, java.lang.String str);

    public abstract boolean n(android.content.Context context, java.lang.String str);

    public void o() {
        java.util.Iterator it = this.f367948f.entrySet().iterator();
        while (it.hasNext()) {
            java.util.Iterator it6 = ((iz4.w) ((java.util.Map.Entry) it.next()).getValue()).f377698b.f367985a.iterator();
            while (it6.hasNext()) {
                ((iz4.o) it6.next()).e();
            }
        }
        java.util.Iterator it7 = ((java.util.LinkedHashMap) this.f367950h).entrySet().iterator();
        while (it7.hasNext()) {
            ((iz4.o) ((java.util.Map.Entry) it7.next()).getValue()).e();
        }
    }

    public void p(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5773x64e6b625 c5773x64e6b625) {
        am.zl zlVar = c5773x64e6b625.f136087g;
        if (zlVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WNNoteBase", "setWNNativeCallbackOnClick, opertionevent.data is null, retutn");
            return;
        }
        java.lang.String str = zlVar.f90112b;
        int i17 = zlVar.f90111a;
        java.util.Map map = this.f367950h;
        iz4.o oVar = (iz4.o) ((java.util.LinkedHashMap) map).get(str);
        if (oVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WNNoteBase", "setWNNativeCallbackOnClick, mEditorIdToDataItem.get(localEditorId) is null, retutn");
            return;
        }
        if (a(c5773x64e6b625.f136087g.f90114d, str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WNNoteBase", "force return due to server hit");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WNNoteBase", "setWNNativeCallbackOnClick, mEditorIdToDataItem.get(localEditorId) is %d", java.lang.Integer.valueOf(oVar.f377666q));
        int i18 = oVar.f377666q;
        if (i18 == 2) {
            l(c5773x64e6b625.f136087g.f90114d, str);
            return;
        }
        if (i18 == 3) {
            m(c5773x64e6b625.f136087g.f90114d, str);
            return;
        }
        if (i18 == 5) {
            k(c5773x64e6b625.f136087g.f90114d, str);
            return;
        }
        if (i18 != 6) {
            return;
        }
        android.content.Context context = c5773x64e6b625.f136087g.f90114d;
        iz4.k kVar = (iz4.k) ((java.util.LinkedHashMap) map).get(str);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(kVar.f377668s)) {
            return;
        }
        if (!com.p314xaae8f345.mm.vfs.w6.j(kVar.f377668s)) {
            r45.gp0 f17 = f(kVar.f377636a);
            if (f17 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WNNoteBase", "goToVideoPlay, favData is null");
                return;
            }
            c(f17);
        }
        if (n(context, str)) {
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        o72.r2 r2Var = this.f367947e;
        if (r2Var == null) {
            intent.putExtra("key_detail_info_id", 0);
        } else {
            intent.putExtra("key_detail_info_id", r2Var.f67645x88be67a1);
        }
        intent.putExtra("key_detail_fav_path", kVar.f377668s);
        intent.putExtra("key_detail_fav_thumb_path", kVar.f377650t);
        intent.putExtra("key_detail_fav_video_duration", kVar.f377651u);
        intent.putExtra("key_detail_data_id", kVar.f377636a);
        intent.putExtra("key_detail_statExtStr", "");
        intent.putExtra("key_detail_fav_video_show_download_status", true);
        r45.gp0 gp0Var = kVar.f377663n;
        if (gp0Var != null) {
            intent.putExtra("key_detail_msg_uuid", gp0Var.f456964q2);
        }
        o72.x1.M0(context, ".ui.detail.FavoriteVideoPlayUI", intent, 1, null);
    }

    public boolean q() {
        return ((y30.q) ((z30.u) i95.n0.c(z30.u.class))).wi();
    }
}
