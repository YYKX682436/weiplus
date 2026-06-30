package com.p314xaae8f345.mm.p2621x8fb0427b;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tencent/mm/storage/u4;", "Lcom/tencent/mm/sdk/storage/mvvm/MvvmStorage;", "Lcom/tencent/mm/storage/t4;", "Ln75/b;", "dbProvider", "<init>", "(Ln75/b;)V", "compose-image-query_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class u4 extends com.p314xaae8f345.mm.sdk.p2605x8fb0427b.p2606x335620.AbstractC21005xe7f8081b<com.p314xaae8f345.mm.p2621x8fb0427b.t4> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u4(n75.b dbProvider) {
        super(dbProvider);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dbProvider, "dbProvider");
    }

    @Override // com.p314xaae8f345.mm.sdk.p2605x8fb0427b.p2606x335620.AbstractC21005xe7f8081b, l75.c1
    /* renamed from: O6 */
    public java.lang.String getF449889h() {
        return "MicroMsg.CropCenterStorage";
    }

    public final void X6(java.lang.String roomId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(roomId, "roomId");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CropCenterStorage", "deleteImageByRoomId >> roomId: ".concat(roomId));
        android.content.ContentValues contentValues = new android.content.ContentValues();
        contentValues.put("chat_room_id", roomId);
        com.p314xaae8f345.mm.p2621x8fb0427b.t4 t4Var = (com.p314xaae8f345.mm.p2621x8fb0427b.t4) T6(contentValues, p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(com.p314xaae8f345.mm.p2621x8fb0427b.t4.class));
        if (t4Var != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CropCenterStorage", "deleteImageByRoomId >> roomId: " + roomId + ", cropImage: " + t4Var.f67079x57963853);
            com.p314xaae8f345.mm.sdk.p2605x8fb0427b.p2606x335620.AbstractC21005xe7f8081b.S6(this, t4Var, false, false, 6, null);
        }
    }
}
