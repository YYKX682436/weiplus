package com.p314xaae8f345.mm.p1006xc5476f33.fav.ui;

/* loaded from: classes12.dex */
public final class a9 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.da f182000d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a9(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.da daVar) {
        super(0);
        this.f182000d = daVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1413xbb6ca34f.c cVar = this.f182000d.f182116n;
        if (cVar != null) {
            cVar.notifyDataSetChanged();
            return jz5.f0.f384359a;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mResultAdapter");
        throw null;
    }
}
