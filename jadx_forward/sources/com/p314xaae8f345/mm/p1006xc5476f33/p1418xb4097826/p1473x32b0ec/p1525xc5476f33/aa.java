package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class aa extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f193372d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.fa f193373e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aa(android.graphics.Bitmap bitmap, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.fa faVar) {
        super(0);
        this.f193372d = bitmap;
        this.f193373e = faVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.fa faVar = this.f193373e;
        android.graphics.Bitmap bitmap = this.f193372d;
        if (bitmap != null) {
            faVar.f194059q.setImageDrawable(new android.graphics.drawable.BitmapDrawable(faVar.f446856d.getContext().getResources(), bitmap));
            ((mm2.c1) faVar.P0(mm2.c1.class)).I4 = bitmap;
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(faVar.f194058p, "showLiveRoomImg resource is null!");
        }
        return jz5.f0.f384359a;
    }
}
