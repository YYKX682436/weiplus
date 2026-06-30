package l75;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u00032\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00060\u0004B\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Ll75/c1;", "Ll75/f0;", p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f2960xe17f46c3, "Landroidx/lifecycle/c1;", "", "Lo75/a;", "Lo75/c;", "<init>", "()V", "wechat-sdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes12.dex */
public class c1<T extends l75.f0> extends p012xc85e97e9.p093xedfae76a.c1 {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f398474d = jz5.h.b(new l75.b1(this));

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Class f398475e;

    /* renamed from: f, reason: collision with root package name */
    public l75.f0 f398476f;

    public o75.e N6() {
        java.lang.reflect.Constructor declaredConstructor;
        if (this.f398476f == null) {
            if (this.f398475e == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(getF449889h(), "getAttachClazz start: java");
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                f06.d clazz = p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(getClass());
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(clazz, "clazz");
                java.lang.Class b17 = d75.b.b(xz5.a.b(clazz), 0);
                if (!(b17 instanceof java.lang.Class)) {
                    b17 = null;
                }
                this.f398475e = b17;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(getF449889h(), "getAttachClazz cost: " + (java.lang.System.currentTimeMillis() - currentTimeMillis));
            }
            java.lang.Class cls = this.f398475e;
            this.f398476f = (cls == null || (declaredConstructor = cls.getDeclaredConstructor(new java.lang.Class[0])) == null) ? null : (l75.f0) declaredConstructor.newInstance(new java.lang.Object[0]);
        }
        l75.f0 f0Var = this.f398476f;
        o75.e mo9765xec19c1c7 = f0Var != null ? f0Var.mo9765xec19c1c7() : null;
        o75.e eVar = mo9765xec19c1c7 instanceof o75.e ? mo9765xec19c1c7 : null;
        if (eVar != null) {
            return eVar;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(getF449889h(), "create new storage observer owner");
        return new o75.e();
    }

    /* renamed from: O6 */
    public java.lang.String getF449889h() {
        return "MicroMsg.Mvvm.ObservableStorage";
    }

    public final o75.e P6() {
        return (o75.e) ((jz5.n) this.f398474d).mo141623x754a37bb();
    }

    public void Q6(p012xc85e97e9.p093xedfae76a.y lifecycleOwner, o75.a observer) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(lifecycleOwner, "lifecycleOwner");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(observer, "observer");
        P6().m127126x9d92d11c(lifecycleOwner, observer);
    }
}
