package com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui;

/* loaded from: classes10.dex */
public final class c5 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ActivityC13326xc73ec7a9 f179451d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f179452e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.List f179453f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c5(com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ActivityC13326xc73ec7a9 activityC13326xc73ec7a9, java.util.List list, java.util.List list2, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f179451d = activityC13326xc73ec7a9;
        this.f179452e = list;
        this.f179453f = list2;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.c5(this.f179451d, this.f179452e, this.f179453f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.c5) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ActivityC13326xc73ec7a9 activityC13326xc73ec7a9 = this.f179451d;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = activityC13326xc73ec7a9.C;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        java.util.List list = this.f179452e;
        boolean isEmpty = list.isEmpty();
        jz5.f0 f0Var = jz5.f0.f384359a;
        java.util.List list2 = this.f179453f;
        if (isEmpty) {
            db5.e1.s(activityC13326xc73ec7a9, "", activityC13326xc73ec7a9.getString(com.p314xaae8f345.mm.R.C30867xcad56011.obw, new java.lang.Integer(list2.size())));
            return f0Var;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiEmojiEditorActivity", "generated " + list.size() + " emojis, start batch upload");
        android.content.Intent intent = new android.content.Intent(activityC13326xc73ec7a9, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ActivityC13272x96cd1be8.class);
        intent.putExtra("enable_multi_upload", true);
        intent.putExtra("multi_upload_fail_count", java.lang.Math.max(list2.size() - list.size(), 0));
        intent.putStringArrayListExtra("extra_id_list", new java.util.ArrayList<>(list));
        intent.putStringArrayListExtra("extra_wordings", new java.util.ArrayList<>());
        intent.putExtra("extra_upload_scene", 0);
        intent.putExtra("extra_scence", activityC13326xc73ec7a9.k7());
        intent.putExtra("extra_move_to_top", true);
        intent.putExtra("EXTRA_SESSION_ID", activityC13326xc73ec7a9.f179306x);
        intent.putExtra("extra_username", c01.z1.r());
        intent.putExtra("query_source_type", activityC13326xc73ec7a9.f179308z);
        intent.putExtra("key_is_selfie", false);
        java.lang.String str = activityC13326xc73ec7a9.Q;
        intent.putExtra("addstickers_sessionid", str != null ? str : "");
        intent.putExtra("key_from_scene", activityC13326xc73ec7a9.A);
        intent.putExtra("extra_edit_sticker_source", activityC13326xc73ec7a9.s7());
        java.util.List<com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.g2> list3 = activityC13326xc73ec7a9.f179416J;
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list3, 10));
        for (com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.g2 g2Var : list3) {
            arrayList.add(new java.lang.Integer(g2Var.b() ? 3 : g2Var.a() ? 4 : 1));
        }
        intent.putExtra("extra_edit_sticker_types", kz5.n0.R0(arrayList));
        intent.addFlags(65536);
        activityC13326xc73ec7a9.getClass();
        activityC13326xc73ec7a9.startActivityForResult(intent, 1);
        activityC13326xc73ec7a9.f179307y = 4L;
        return f0Var;
    }
}
