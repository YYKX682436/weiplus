package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

/* loaded from: classes10.dex */
public final class fm implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f213645d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.km f213646e;

    public fm(android.graphics.Bitmap bitmap, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.km kmVar) {
        this.f213645d = bitmap;
        this.f213646e = kmVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        um5.d dVar = new um5.d();
        android.graphics.Bitmap resource = this.f213645d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(resource, "$resource");
        dVar.b(resource);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.km kmVar = this.f213646e;
        int width = kmVar.f214044s.getWidth();
        int height = kmVar.f214044s.getHeight();
        dVar.f510674b = width;
        dVar.f510675c = height;
        dVar.f510677e.f510726b.d();
        dVar.a(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.em(kmVar));
    }
}
