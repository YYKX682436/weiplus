package bh5;

/* loaded from: classes14.dex */
public final class p0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2710x1c644e5f.C22415x6ef905d7 f102487d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(com.p314xaae8f345.mm.ui.p2710x1c644e5f.C22415x6ef905d7 c22415x6ef905d7) {
        super(0);
        this.f102487d = c22415x6ef905d7;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
        int i17 = com.p314xaae8f345.mm.ui.p2710x1c644e5f.C22415x6ef905d7.F;
        com.p314xaae8f345.mm.ui.p2710x1c644e5f.C22415x6ef905d7 c22415x6ef905d7 = this.f102487d;
        c22415x6ef905d7.getClass();
        ofFloat.setDuration(300L);
        ofFloat.addUpdateListener(new bh5.n0(c22415x6ef905d7));
        ofFloat.addListener(new bh5.o0(c22415x6ef905d7, ofFloat));
        return ofFloat;
    }
}
