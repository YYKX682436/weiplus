package com.p314xaae8f345.mm.ui.p2650x55bb7a46;

/* loaded from: classes11.dex */
public final class sa extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.db f284202d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sa(com.p314xaae8f345.mm.ui.p2650x55bb7a46.db dbVar) {
        super(0);
        this.f284202d = dbVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        float[] fArr = new float[2];
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.db dbVar = this.f284202d;
        fArr[0] = dbVar.f281970t != null ? r2.intValue() : dbVar.f281959f;
        fArr[1] = 0.0f;
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(fArr);
        ofFloat.setDuration(300L);
        ofFloat.addUpdateListener(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.ra(dbVar));
        return ofFloat;
    }
}
