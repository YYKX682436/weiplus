package dq0;

/* loaded from: classes.dex */
public final class b0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f323833d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(java.lang.ref.WeakReference weakReference) {
        super(1);
        this.f323833d = weakReference;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.Double d17 = (java.lang.Double) obj;
        java.lang.ref.WeakReference weakReference = this.f323833d;
        if (d17 != null) {
            yz5.l lVar = (yz5.l) weakReference.get();
            if (lVar != null) {
                lVar.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(d17)));
            }
        } else {
            yz5.l lVar2 = (yz5.l) weakReference.get();
            if (lVar2 != null) {
                p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                lVar2.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(java.lang.Double.valueOf(0.0d))));
            }
        }
        return jz5.f0.f384359a;
    }
}
