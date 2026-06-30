package bh5;

/* loaded from: classes14.dex */
public final class u extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2710x1c644e5f.C22415x6ef905d7 f102496d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(com.p314xaae8f345.mm.ui.p2710x1c644e5f.C22415x6ef905d7 c22415x6ef905d7) {
        super(0);
        this.f102496d = c22415x6ef905d7;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.ui.p2710x1c644e5f.C22415x6ef905d7 c22415x6ef905d7 = this.f102496d;
        java.lang.Integer num = c22415x6ef905d7.D;
        float intValue = num != null ? num.intValue() : c22415x6ef905d7.f290351v;
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(intValue, intValue - c22415x6ef905d7.f290351v);
        ofFloat.setDuration(300L);
        ofFloat.addUpdateListener(new bh5.s(c22415x6ef905d7));
        ofFloat.addListener(new bh5.t(c22415x6ef905d7));
        return ofFloat;
    }
}
