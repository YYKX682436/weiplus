package p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220;

/* renamed from: androidx.camera.core.impl.Quirks */
/* loaded from: classes13.dex */
public class C0744x90dabc95 {

    /* renamed from: mQuirks */
    private final java.util.List<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0740x4ac379e> f1728x16e1f742;

    public C0744x90dabc95(java.util.List<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0740x4ac379e> list) {
        this.f1728x16e1f742 = new java.util.ArrayList(list);
    }

    /* renamed from: toString */
    public static java.lang.String m5566x9616526c(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0744x90dabc95 c0744x90dabc95) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0740x4ac379e> it = c0744x90dabc95.f1728x16e1f742.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getClass().getSimpleName());
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.util.Iterator it6 = arrayList.iterator();
        if (it6.hasNext()) {
            while (true) {
                sb6.append((java.lang.CharSequence) it6.next());
                if (!it6.hasNext()) {
                    break;
                }
                sb6.append((java.lang.CharSequence) com.p314xaae8f345.p592x631407a.p595x2eaf0c.log.p598x36f002.C4772x9611bb53.f20377xba9c5eaa);
            }
        }
        return sb6.toString();
    }

    /* renamed from: addQuirkForTesting */
    public void m5567xa64cb084(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0740x4ac379e interfaceC0740x4ac379e) {
        this.f1728x16e1f742.add(interfaceC0740x4ac379e);
    }

    /* renamed from: contains */
    public boolean m5568xde2d761f(java.lang.Class<? extends p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0740x4ac379e> cls) {
        java.util.Iterator<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0740x4ac379e> it = this.f1728x16e1f742.iterator();
        while (it.hasNext()) {
            if (cls.isAssignableFrom(it.next().getClass())) {
                return true;
            }
        }
        return false;
    }

    public <T extends p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0740x4ac379e> T get(java.lang.Class<T> cls) {
        java.util.Iterator<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0740x4ac379e> it = this.f1728x16e1f742.iterator();
        while (it.hasNext()) {
            T t17 = (T) it.next();
            if (t17.getClass() == cls) {
                return t17;
            }
        }
        return null;
    }

    /* renamed from: getAll */
    public <T extends p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0740x4ac379e> java.util.List<T> m5569xb5882a6b(java.lang.Class<T> cls) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0740x4ac379e interfaceC0740x4ac379e : this.f1728x16e1f742) {
            if (cls.isAssignableFrom(interfaceC0740x4ac379e.getClass())) {
                arrayList.add(interfaceC0740x4ac379e);
            }
        }
        return arrayList;
    }
}
