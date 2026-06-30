package sp2;

/* loaded from: classes2.dex */
public final class e0 implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.ref.WeakReference f492552d;

    public e0(java.lang.ref.WeakReference weakReference) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(weakReference, "weakReference");
        this.f492552d = weakReference;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        sp2.o2 o2Var = (sp2.o2) this.f492552d.get();
        if (o2Var != null) {
            p3325xe03a0797.p3326xc267989b.l.d(o2Var.f492662e, null, null, new sp2.d0(booleanValue, o2Var, null), 3, null);
        }
        return jz5.f0.f384359a;
    }
}
