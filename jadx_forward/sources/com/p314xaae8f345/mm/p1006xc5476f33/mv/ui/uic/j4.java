package com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic;

/* loaded from: classes10.dex */
public final class j4 implements p3325xe03a0797.p3326xc267989b.p3328x30012e.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.v4 f232751d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.c3 f232752e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.HashMap f232753f;

    public j4(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.v4 v4Var, com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.c3 c3Var, java.util.HashMap hashMap) {
        this.f232751d = v4Var;
        this.f232752e = c3Var;
        this.f232753f = hashMap;
    }

    @Override // p3325xe03a0797.p3326xc267989b.p3328x30012e.k
    /* renamed from: emit */
    public java.lang.Object mo771x2f8fd3(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        r45.ny3 ny3Var;
        o01.a aVar = (o01.a) obj;
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.i4.f232735a[aVar.f440817a.ordinal()];
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (i17 == 1) {
            com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.v4 v4Var = this.f232751d;
            android.app.ProgressDialog progressDialog = v4Var.f233030q;
            if (progressDialog != null) {
                progressDialog.dismiss();
            }
            int i18 = aVar.f440819c;
            if (i18 != 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mv.MusicMvMakerFlexEditUIC", "errType:" + aVar.f440818b + ", errCode:" + i18);
            } else {
                java.lang.Object mo3195x754a37bb = this.f232752e.f232610g.mo3195x754a37bb();
                if (mo3195x754a37bb != null && (ny3Var = aVar.f440822f) != null) {
                    java.util.LinkedList m75941xfb821914 = ((r45.rr4) ny3Var).m75941xfb821914(1);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getRes_list(...)");
                    r45.ss4 O6 = com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.v4.O6(v4Var, (r45.ss4) mo3195x754a37bb, m75941xfb821914, this.f232753f);
                    O6.set(2, "");
                    android.content.Intent intent = new android.content.Intent(v4Var.m158354x19263085(), (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1918x30166c.ActivityC16658x38bdd532.class);
                    intent.putExtra("key_track_data", O6.mo14344x5f01b1f6());
                    intent.putExtra("key_seek_to_start", true);
                    pm0.v.g(intent, v4Var.m158354x19263085().getIntent(), "key_mv_from_scene", 0);
                    p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = v4Var.m158354x19263085();
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    arrayList.add(intent);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(m158354x19263085, arrayList.toArray(), "com/tencent/mm/plugin/mv/ui/uic/MusicMvMakerFlexEditUIC", "handleArrangementResp", "(Lcom/tencent/mm/protocal/protobuf/MusicMvData;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    m158354x19263085.startActivity((android.content.Intent) arrayList.get(0));
                    yj0.a.f(m158354x19263085, "com/tencent/mm/plugin/mv/ui/uic/MusicMvMakerFlexEditUIC", "handleArrangementResp", "(Lcom/tencent/mm/protocal/protobuf/MusicMvData;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    com.p314xaae8f345.mm.p1006xc5476f33.mv.p1915x633fb29.p1916x2ffff9.C16646x38766471 c16646x38766471 = v4Var.f233024h;
                    java.util.ArrayList arrayList2 = c16646x38766471.f233598o;
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    java.util.Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        java.lang.Object next = it.next();
                        if (((gm3.c) next).f355082m > 0) {
                            arrayList3.add(next);
                        }
                    }
                    int size = arrayList3.size();
                    fm3.g0.f345603a.a((c16646x38766471.f233598o.size() - size) - 1, size);
                }
            }
        }
        return f0Var;
    }
}
