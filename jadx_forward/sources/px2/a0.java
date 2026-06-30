package px2;

/* loaded from: classes2.dex */
public final class a0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1670x5545f2bb.AbstractGestureDetectorOnGestureListenerC15410x706991fd f440400d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1670x5545f2bb.AbstractGestureDetectorOnGestureListenerC15410x706991fd abstractGestureDetectorOnGestureListenerC15410x706991fd) {
        super(0);
        this.f440400d = abstractGestureDetectorOnGestureListenerC15410x706991fd;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        return java.lang.Integer.valueOf(android.view.ViewConfiguration.get(this.f440400d.getContext()).getScaledTouchSlop());
    }
}
