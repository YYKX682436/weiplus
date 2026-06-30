package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class vo extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ap f196340d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vo(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ap apVar) {
        super(0);
        this.f196340d = apVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ap apVar = this.f196340d;
        java.util.Iterator it = ((java.util.concurrent.ConcurrentHashMap) apVar.B).entrySet().iterator();
        while (it.hasNext()) {
            ((android.animation.ValueAnimator) ((java.util.Map.Entry) it.next()).getValue()).cancel();
        }
        java.util.Iterator it6 = ((java.util.concurrent.ConcurrentHashMap) apVar.C).entrySet().iterator();
        while (it6.hasNext()) {
            ((android.animation.ValueAnimator) ((java.util.Map.Entry) it6.next()).getValue()).cancel();
        }
        return jz5.f0.f384359a;
    }
}
