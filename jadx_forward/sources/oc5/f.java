package oc5;

/* loaded from: classes3.dex */
public abstract class f implements oc5.e {

    /* renamed from: a, reason: collision with root package name */
    public final oc5.m f425941a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f425942b;

    public f(oc5.m controller) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(controller, "controller");
        this.f425941a = controller;
        this.f425942b = true;
    }

    @Override // oc5.e
    public long a() {
        return 1000L;
    }

    public boolean b() {
        int mo151046xfb85f7b0 = mo151046xfb85f7b0();
        oc5.m mVar = this.f425941a;
        boolean z17 = mVar.e(mo151046xfb85f7b0) != null;
        java.util.Iterator it = mVar.f425998a.iterator();
        while (it.hasNext()) {
            int intValue = ((java.lang.Number) it.next()).intValue();
            oc5.e eVar = (oc5.e) mVar.f425999b.get(java.lang.Integer.valueOf(intValue));
            if (eVar != null && mo151047xba8879a4() < eVar.mo151047xba8879a4()) {
                z17 = z17 && mVar.e(intValue) != null;
            }
        }
        mo151046xfb85f7b0();
        return z17;
    }
}
