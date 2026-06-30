package sg0;

/* loaded from: classes.dex */
public final class p1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f489308d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p1(java.lang.ref.WeakReference weakReference) {
        super(1);
        this.f489308d = weakReference;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        org.json.JSONObject result = (org.json.JSONObject) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(result, "result");
        com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.p2401x48fb3bf9.AbstractC19224x1fe3df6e abstractC19224x1fe3df6e = (com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.p2401x48fb3bf9.AbstractC19224x1fe3df6e) this.f489308d.get();
        if (abstractC19224x1fe3df6e != null) {
            pm0.v.X(new sg0.o1(result, abstractC19224x1fe3df6e));
        }
        return jz5.f0.f384359a;
    }
}
