package p05;

/* loaded from: classes14.dex */
public final class u4 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2467x5de743e6.C19569xe327f12f f432233d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u4(com.p314xaae8f345.mm.p1006xc5476f33.p2467x5de743e6.C19569xe327f12f c19569xe327f12f) {
        super(1);
        this.f432233d = c19569xe327f12f;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        int intValue = ((java.lang.Number) obj).intValue();
        et0.q cameraView = this.f432233d.getCameraView();
        if (cameraView != null) {
            cameraView.l(new p05.t4(intValue));
        }
        return jz5.f0.f384359a;
    }
}
