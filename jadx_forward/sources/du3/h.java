package du3;

/* loaded from: classes3.dex */
public final class h extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ du3.m f325137d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(du3.m mVar) {
        super(1);
        this.f325137d = mVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        int i17 = rl.b.f478676a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImproveEditPhotoAddTextPlugin", "setOnVisibleChangeCallback " + booleanValue, null);
        du3.m mVar = this.f325137d;
        if (booleanValue) {
            ((hk0.u0) ((jz5.n) mVar.f325190p).mo141623x754a37bb()).d7(3, java.lang.Boolean.TRUE);
        } else {
            ((hk0.u0) ((jz5.n) mVar.f325190p).mo141623x754a37bb()).d7(3, java.lang.Boolean.FALSE);
        }
        return jz5.f0.f384359a;
    }
}
