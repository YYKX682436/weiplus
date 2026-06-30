package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* renamed from: com.tencent.mm.plugin.finder.live.plugin.do, reason: invalid class name */
/* loaded from: classes3.dex */
public final class Cdo extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f193844d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ap f193845e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.l1 f193846f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Cdo(android.view.ViewGroup viewGroup, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ap apVar, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.l1 l1Var) {
        super(0);
        this.f193844d = viewGroup;
        this.f193845e = apVar;
        this.f193846f = l1Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.view.ViewGroup viewGroup;
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ap.V && (viewGroup = this.f193844d) != null) {
            viewGroup.setVisibility(0);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveGiftQueuePlugin", "launchBulletInAnimation, BulletShowingInfo=" + this.f193845e.A.get(this.f193844d) + ", giftShowInfo=" + this.f193846f);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ap apVar = this.f193845e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ap.V1(apVar, (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.tn) apVar.A.get(this.f193844d), this.f193846f, false, 4, null);
        android.animation.ValueAnimator valueAnimator = (android.animation.ValueAnimator) ((java.util.concurrent.ConcurrentHashMap) this.f193845e.B).get(this.f193844d);
        if (valueAnimator != null) {
            valueAnimator.start();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.tn tnVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.tn) this.f193845e.A.get(this.f193844d);
        if (tnVar != null) {
            tnVar.f195984r = c01.id.c();
        }
        this.f193845e.w1(null);
        return jz5.f0.f384359a;
    }
}
