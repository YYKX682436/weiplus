package yd;

/* loaded from: classes7.dex */
public class b extends yd.y {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yd.e f542450a;

    public b(yd.e eVar) {
        this.f542450a = eVar;
    }

    @Override // yd.y
    public void a() {
        yd.e eVar = this.f542450a;
        eVar.f542480i = true;
        eVar.f542472a.m176828x40fe4367().jf("window.__wxjs_environment = \"miniprogram\";");
        java.lang.String e17 = ik1.f.e("wxa_library/vconsole-wxjs.js");
        if (e17 != null) {
            eVar.f542472a.m176828x40fe4367().jf(e17);
        }
        eVar.f542472a.m158334x8e6896da().L();
        java.util.LinkedList linkedList = eVar.f542479h;
        if (linkedList == null || linkedList.isEmpty()) {
            return;
        }
        java.util.Iterator it = eVar.f542479h.iterator();
        while (it.hasNext()) {
            eVar.b((java.lang.String) it.next());
        }
        eVar.f542479h.clear();
    }
}
