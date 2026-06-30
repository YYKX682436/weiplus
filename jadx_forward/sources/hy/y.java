package hy;

/* loaded from: classes11.dex */
public final class y extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wx.g1 f367300d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(wx.g1 g1Var) {
        super(1);
        this.f367300d = g1Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) obj;
        return java.lang.Boolean.valueOf(weakReference.get() == this.f367300d || weakReference.get() == null);
    }
}
