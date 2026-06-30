package op4;

/* loaded from: classes10.dex */
public final class j extends op4.k {

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1996xc4ab08aa.AbstractC17010x26b2d1ce f428822e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f428823f;

    public j(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1996xc4ab08aa.AbstractC17010x26b2d1ce pluginLayout) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pluginLayout, "pluginLayout");
        this.f428822e = pluginLayout;
        this.f428823f = "";
    }

    @Override // op4.k
    public void a(android.content.Intent intent) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(intent, "intent");
    }

    @Override // op4.k
    public java.lang.String g() {
        return "25496";
    }

    public final void j(java.lang.String editId, com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 c16993xacc19624) {
        rm5.v vVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(editId, "editId");
        if (((c61.p7) ((m40.k0) i95.n0.c(m40.k0.class))).wi() == 0) {
            return;
        }
        this.f428823f = editId;
        java.util.Map k17 = kz5.c1.k(new jz5.l(java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.id.d7_), "edit_page_bgm"), new jz5.l(java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.id.d7f), "edit_page_emoji"), new jz5.l(java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.id.d7p), "edit_page_word"), new jz5.l(java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.id.f565702d81), "edit_page_clip"), new jz5.l(java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.id.d7c), "identify_subtitle"), new jz5.l(java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.id.o89), "edit_page_finish"));
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1996xc4ab08aa.AbstractC17010x26b2d1ce abstractC17010x26b2d1ce = this.f428822e;
        lp4.u uVar = (lp4.u) abstractC17010x26b2d1ce.j(lp4.u.class);
        long j17 = 0;
        if (uVar != null && (vVar = uVar.f401962h) != null) {
            java.util.Iterator it = np4.a.a(vVar).f257130c.iterator();
            while (it.hasNext()) {
                rm5.j jVar = ((com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.i1) it.next()).f257160l;
                j17 += jVar.f479038g - jVar.f479037f;
            }
        }
        java.lang.String b17 = np4.b.b(c16993xacc19624);
        java.lang.String a17 = np4.b.a(c16993xacc19624);
        java.lang.String c17 = np4.b.c(c16993xacc19624);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("TimelineEditorReport25496", "initReport, editId:" + editId + " finderContextId:" + b17 + " tabContextId:" + a17 + " sessionId:" + c17 + " commentScene:101 duration:" + j17);
        for (java.util.Map.Entry entry : k17.entrySet()) {
            android.view.View findViewById = abstractC17010x26b2d1ce.findViewById(((java.lang.Number) entry.getKey()).intValue());
            if (findViewById != null) {
                ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).pk(findViewById, (java.lang.String) entry.getValue());
                ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ik(findViewById, 8, 25496);
                ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).gk(findViewById, kz5.c1.k(new jz5.l("video_duration_time", java.lang.Long.valueOf(j17)), new jz5.l("editid", this.f428823f)));
                ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ai(findViewById, new op4.i(c17, b17, a17, "101"));
            }
        }
    }

    @Override // ju3.d0
    public void w(ju3.c0 status, android.os.Bundle bundle) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
    }
}
