package com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui;

/* loaded from: classes11.dex */
public final class zc extends com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.uc {

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 f256016b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.ArrayList f256017c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f256018d;

    /* renamed from: e, reason: collision with root package name */
    public int f256019e;

    /* renamed from: f, reason: collision with root package name */
    public int f256020f;

    /* renamed from: g, reason: collision with root package name */
    public mj4.l f256021g;

    /* renamed from: h, reason: collision with root package name */
    public mj4.e f256022h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zc(com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf adapter, com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 refreahLayout) {
        super(adapter);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(adapter, "adapter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(refreahLayout, "refreahLayout");
        this.f256016b = refreahLayout;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.f256017c = arrayList;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        this.f256018d = arrayList2;
        arrayList.clear();
        arrayList2.clear();
        ai4.m0 m0Var = ai4.m0.f86706a;
        arrayList.addAll(m0Var.D());
        arrayList2.addAll(m0Var.d());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.TextStatusLikeListActivity", "NotificationMsgLoader init: unReadLikeSize=" + arrayList.size() + ", unReadCommentSize=" + arrayList2.size());
        this.f256019e = 0;
        this.f256020f = 0;
        android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(adapter.b0().getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.czq, (android.view.ViewGroup) adapter.b0(), false);
        ((android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.gbq)).setText(com.p314xaae8f345.mm.R.C30867xcad56011.frz);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).pk(inflate, "textstatus_notif_more_button");
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ik(inflate, 8, 28809);
        int c17 = m0Var.O().c();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.TextStatusLikeListActivity", "readCount:" + c17 + ' ');
        if (c17 > 0) {
            inflate.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.yc(this, adapter, in5.n0.P(adapter, inflate, Integer.MAX_VALUE, false, 4, null)));
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.uc
    public boolean a() {
        return this.f256019e < this.f256017c.size() || this.f256020f < this.f256018d.size();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00f4 A[EDGE_INSN: B:56:0x00f4->B:53:0x00f4 BREAK  A[LOOP:0: B:2:0x0002->B:31:0x00f0], SYNTHETIC] */
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.uc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b() {
        /*
            Method dump skipped, instructions count: 253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.zc.b():void");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.uc
    public void c() {
    }
}
