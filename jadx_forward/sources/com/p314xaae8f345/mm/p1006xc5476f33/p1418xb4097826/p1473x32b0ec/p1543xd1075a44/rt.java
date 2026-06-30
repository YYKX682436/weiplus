package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class rt extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f201220d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.ut f201221e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rt(android.graphics.Bitmap bitmap, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.ut utVar) {
        super(0);
        this.f201220d = bitmap;
        this.f201221e = utVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        if (this.f201220d == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.ut utVar = this.f201221e;
            utVar.c(8);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(utVar.f201534c, "videos hidden since load image failed");
        }
        return jz5.f0.f384359a;
    }
}
