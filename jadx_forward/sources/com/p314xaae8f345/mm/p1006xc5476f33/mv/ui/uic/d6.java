package com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic;

/* loaded from: classes10.dex */
public final class d6 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.h6 f232631d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d6(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.h6 h6Var) {
        super(2);
        this.f232631d = h6Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        long longValue = ((java.lang.Number) obj).longValue();
        dk4.a mediaInfo = (dk4.a) obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaInfo, "mediaInfo");
        long j17 = longValue - mediaInfo.f316010n;
        long j18 = mediaInfo.f316011o;
        if (j18 <= 0) {
            j18 = mediaInfo.f316003g;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.h6 h6Var = this.f232631d;
        yz5.p pVar = h6Var.f232716h;
        if (pVar != null) {
            pVar.mo149xb9724478(java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j18));
        }
        yz5.l lVar = h6Var.f232717i;
        if (lVar != null) {
            lVar.mo146xb9724478(java.lang.Long.valueOf(longValue));
        }
        return jz5.f0.f384359a;
    }
}
