package com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/record/ui/FavSubRecordDetailUI;", "Lcom/tencent/mm/plugin/record/ui/RecordMsgBaseUI;", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.record.ui.FavSubRecordDetailUI */
/* loaded from: classes12.dex */
public class ActivityC16964x74f1febb extends com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.AbstractActivityC16965x338d8695 {

    /* renamed from: v, reason: collision with root package name */
    public r45.ul5 f236796v;

    /* renamed from: w, reason: collision with root package name */
    public o72.r2 f236797w;

    /* renamed from: x, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.l2 f236798x;

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.AbstractActivityC16965x338d8695
    public com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.h0 a7() {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.f(this, new com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.c(this));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.AbstractActivityC16965x338d8695
    public java.lang.String b7() {
        java.util.LinkedList linkedList;
        r45.gp0 gp0Var;
        r45.ul5 ul5Var = this.f236796v;
        java.lang.String str = (ul5Var == null || (linkedList = ul5Var.f468998f) == null || (gp0Var = (r45.gp0) kz5.n0.k0(linkedList)) == null) ? null : gp0Var.M1;
        return str == null ? "" : str;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.AbstractActivityC16965x338d8695
    public java.lang.String c7() {
        java.util.LinkedList linkedList;
        r45.gp0 gp0Var;
        r45.ul5 ul5Var = this.f236796v;
        java.lang.String str = (ul5Var == null || (linkedList = ul5Var.f468998f) == null || (gp0Var = (r45.gp0) kz5.n0.Z(linkedList)) == null) ? null : gp0Var.M1;
        return str == null ? "" : str;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.AbstractActivityC16965x338d8695
    public java.lang.String d7() {
        r45.ul5 ul5Var = this.f236796v;
        java.lang.String str = ul5Var != null ? ul5Var.f468996d : null;
        return str == null ? "" : str;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.AbstractActivityC16965x338d8695
    public void e7() {
        o72.r2 a17 = bt3.z0.a(getIntent().getLongExtra("key_detail_info_id", -1L));
        this.f236797w = a17;
        if (a17 == null) {
            finish();
            return;
        }
        java.lang.String stringExtra = getIntent().getStringExtra("record_xml");
        if (stringExtra == null) {
            stringExtra = "";
        }
        r45.ul5 c17 = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.x1.c(stringExtra);
        this.f236796v = c17;
        if (c17 == null) {
            finish();
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.b bVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.b();
        bVar.f236883c = this.f236797w;
        bVar.f236875a = c17 != null ? c17.f468998f : null;
        bVar.f236876b = new bt3.g3();
        java.util.List list = bVar.f236875a;
        if (list != null && !list.isEmpty()) {
            java.util.Iterator it = list.iterator();
            while (it.hasNext() && ((r45.gp0) it.next()).X1 == 0) {
            }
        }
        super.e7();
        this.f236800n.h(bVar);
        com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.l2 l2Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.l2(this, this.f236800n, bVar);
        this.f236798x = l2Var;
        this.f236800n.f236943s = l2Var;
        o72.y3 fj6 = ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).fj();
        com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.h0 h0Var = this.f236800n;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(h0Var, "null cannot be cast to non-null type com.tencent.mm.plugin.record.ui.FavRecordAdapter");
        fj6.Ia(((com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.f) h0Var).f236919x);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.AbstractActivityC16965x338d8695
    public void f7(int i17, int i18, android.content.Intent intent) {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.AbstractActivityC16965x338d8695
    public void h7() {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.AbstractActivityC16965x338d8695, com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.AbstractActivityC13588x8fdaaf43, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.l2 l2Var = this.f236798x;
        if (l2Var != null) {
            l2Var.e();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.h0 h0Var = this.f236800n;
        if (h0Var != null) {
            h0Var.a();
        }
        super.onDestroy();
    }
}
