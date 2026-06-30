package com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic;

/* loaded from: classes10.dex */
public final class w5 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f233048d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.z5 f233049e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w5(int i17, com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.z5 z5Var) {
        super(1);
        this.f233048d = i17;
        this.f233049e = z5Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("tryCatchFirstFrame, timeInMv:");
        int i17 = this.f233048d;
        sb6.append(i17);
        sb6.append(", thumb:");
        sb6.append(bitmap);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mv.MusicMvMakerItemEditUIC", sb6.toString());
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.z5 z5Var = this.f233049e;
        z5Var.f233119y = bitmap;
        z5Var.f233118x = i17;
        return jz5.f0.f384359a;
    }
}
