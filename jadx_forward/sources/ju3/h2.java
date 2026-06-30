package ju3;

/* loaded from: classes10.dex */
public final class h2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1996xc4ab08aa.C17026x3754ba3c f383482d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h2(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1996xc4ab08aa.C17026x3754ba3c c17026x3754ba3c) {
        super(1);
        this.f383482d = c17026x3754ba3c;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        int intValue = ((java.lang.Number) obj).intValue();
        et0.q cameraView = this.f383482d.getCameraView();
        if (cameraView != null) {
            cameraView.l(new ju3.g2(intValue));
        }
        return jz5.f0.f384359a;
    }
}
