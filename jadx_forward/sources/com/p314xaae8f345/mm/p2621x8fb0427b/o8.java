package com.p314xaae8f345.mm.p2621x8fb0427b;

/* loaded from: classes4.dex */
public final class o8 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f276738d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f276739e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o8(long j17, java.lang.String str, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f276738d = j17;
        this.f276739e = str;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p2621x8fb0427b.o8(this.f276738d, this.f276739e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        com.p314xaae8f345.mm.p2621x8fb0427b.o8 o8Var = (com.p314xaae8f345.mm.p2621x8fb0427b.o8) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        o8Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.lang.String str;
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        jm0.i iVar = jm0.k.f381802h;
        com.p314xaae8f345.mm.p2621x8fb0427b.h3 h3Var = (com.p314xaae8f345.mm.p2621x8fb0427b.h3) ((com.p314xaae8f345.mm.p2621x8fb0427b.n8) iVar.a(com.p314xaae8f345.mm.p2621x8fb0427b.n8.class)).P6(com.p314xaae8f345.mm.p2621x8fb0427b.h3.class);
        java.lang.String roomId = this.f276739e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(roomId, "roomId");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("deleteImageByMsgIdAndRoomId >> msgId: ");
        long j17 = this.f276738d;
        sb6.append(j17);
        sb6.append(", roomId: ");
        sb6.append(roomId);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ClsLabelInfoStorage", sb6.toString());
        android.content.ContentValues contentValues = new android.content.ContentValues();
        contentValues.put("chat_room_id", roomId);
        contentValues.put("msg_id", java.lang.Long.valueOf(j17));
        com.p314xaae8f345.mm.p2621x8fb0427b.g3 g3Var = (com.p314xaae8f345.mm.p2621x8fb0427b.g3) h3Var.T6(contentValues, p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(com.p314xaae8f345.mm.p2621x8fb0427b.g3.class));
        if (g3Var != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ClsLabelInfoStorage", "deleteImageByMsgIdAndRoomId, find to delete >> msgId: " + j17 + ", scanImage path: " + g3Var.f66227xeab3e73d);
            com.p314xaae8f345.mm.sdk.p2605x8fb0427b.p2606x335620.AbstractC21005xe7f8081b.S6(h3Var, g3Var, false, false, 4, null);
            str = g3Var.f66227xeab3e73d;
        } else {
            str = null;
        }
        if (str != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageQueryStorage", "deleteImage find it>> msgId: " + j17 + ", scanImagePath: " + str);
            com.p314xaae8f345.mm.p2621x8fb0427b.k9 k9Var = (com.p314xaae8f345.mm.p2621x8fb0427b.k9) ((com.p314xaae8f345.mm.p2621x8fb0427b.n8) iVar.a(com.p314xaae8f345.mm.p2621x8fb0427b.n8.class)).P6(com.p314xaae8f345.mm.p2621x8fb0427b.k9.class);
            android.content.ContentValues contentValues2 = new android.content.ContentValues();
            contentValues2.put("chat_room_id", roomId);
            com.p314xaae8f345.mm.p2621x8fb0427b.j9 j9Var = (com.p314xaae8f345.mm.p2621x8fb0427b.j9) k9Var.T6(contentValues2, p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(com.p314xaae8f345.mm.p2621x8fb0427b.j9.class));
            if (j9Var != null && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(j9Var.f66269x5965408d, str)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageQueryStorage", "delete image is the last image");
                java.util.ArrayList arrayList = (java.util.ArrayList) ((com.p314xaae8f345.mm.p2621x8fb0427b.h3) ((com.p314xaae8f345.mm.p2621x8fb0427b.n8) iVar.a(com.p314xaae8f345.mm.p2621x8fb0427b.n8.class)).P6(com.p314xaae8f345.mm.p2621x8fb0427b.h3.class)).Y6(roomId, "1", 0, 1);
                if (!arrayList.isEmpty()) {
                    com.p314xaae8f345.mm.p2621x8fb0427b.k9 k9Var2 = (com.p314xaae8f345.mm.p2621x8fb0427b.k9) ((com.p314xaae8f345.mm.p2621x8fb0427b.n8) iVar.a(com.p314xaae8f345.mm.p2621x8fb0427b.n8.class)).P6(com.p314xaae8f345.mm.p2621x8fb0427b.k9.class);
                    java.lang.String field_origin_image_path = ((com.p314xaae8f345.mm.p2621x8fb0427b.g3) arrayList.get(0)).f66227xeab3e73d;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_origin_image_path, "field_origin_image_path");
                    android.content.ContentValues contentValues3 = new android.content.ContentValues();
                    contentValues3.put("chat_room_id", roomId);
                    com.p314xaae8f345.mm.p2621x8fb0427b.j9 j9Var2 = (com.p314xaae8f345.mm.p2621x8fb0427b.j9) k9Var2.T6(contentValues3, p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(com.p314xaae8f345.mm.p2621x8fb0427b.j9.class));
                    if (j9Var2 != null) {
                        j9Var2.f66269x5965408d = field_origin_image_path;
                        com.p314xaae8f345.mm.sdk.p2605x8fb0427b.p2606x335620.AbstractC21005xe7f8081b.W6(k9Var2, j9Var2, false, false, 6, null);
                    }
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
