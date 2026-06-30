package com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui;

/* loaded from: classes10.dex */
public final class d1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ActivityC13304x9b00dd62 f179457d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f179458e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.List f179459f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ActivityC13304x9b00dd62 activityC13304x9b00dd62, java.lang.String str, java.util.List list, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f179457d = activityC13304x9b00dd62;
        this.f179458e = str;
        this.f179459f = list;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.d1(this.f179457d, this.f179458e, this.f179459f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.d1 d1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.d1) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        d1Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ActivityC13304x9b00dd62 activityC13304x9b00dd62 = this.f179457d;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = activityC13304x9b00dd62.C;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiEditorActivity", "start EmojiAddCustomDialogUI");
        android.content.Intent intent = new android.content.Intent(activityC13304x9b00dd62, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ActivityC13272x96cd1be8.class);
        java.lang.String str = this.f179458e;
        intent.putExtra("extra_id", str);
        java.util.List list = this.f179459f;
        intent.putStringArrayListExtra("extra_wordings", new java.util.ArrayList<>(list));
        intent.putExtra("extra_upload_scene", !list.isEmpty() ? 1 : 0);
        intent.putExtra("extra_scence", activityC13304x9b00dd62.k7());
        intent.putExtra("extra_move_to_top", true);
        intent.putExtra("EXTRA_SESSION_ID", activityC13304x9b00dd62.f179306x);
        intent.putExtra("extra_username", c01.z1.r());
        intent.putExtra("query_source_type", activityC13304x9b00dd62.f179308z);
        intent.putExtra("key_from_scene", activityC13304x9b00dd62.A);
        intent.putExtra("key_is_selfie", false);
        intent.addFlags(65536);
        intent.putExtra("extra_id", str);
        if (activityC13304x9b00dd62.getIntent().hasExtra("finder_object_bytes")) {
            intent.putExtra("finder_object_bytes", activityC13304x9b00dd62.getIntent().getByteArrayExtra("finder_object_bytes"));
        }
        intent.putExtra("is_upload_wxam", activityC13304x9b00dd62.f179289d);
        activityC13304x9b00dd62.T6(intent);
        activityC13304x9b00dd62.startActivityForResult(intent, 1);
        activityC13304x9b00dd62.f179307y = 4L;
        return jz5.f0.f384359a;
    }
}
