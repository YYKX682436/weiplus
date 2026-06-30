package ya2;

/* loaded from: classes.dex */
public final class x0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f542110d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(java.lang.ref.WeakReference weakReference) {
        super(0);
        this.f542110d = weakReference;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) this.f542110d.get();
        if (abstractActivityC21394xb3d2c0cf != null && !abstractActivityC21394xb3d2c0cf.isFinishing() && !abstractActivityC21394xb3d2c0cf.isDestroyed()) {
            abstractActivityC21394xb3d2c0cf.finish();
        }
        return jz5.f0.f384359a;
    }
}
