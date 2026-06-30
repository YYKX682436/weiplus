package vc1;

/* loaded from: classes13.dex */
public class b1 implements com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25945x718093f7.OnMapLoadedListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ vc1.p1 f516447a;

    public b1(vc1.p1 p1Var) {
        this.f516447a = p1Var;
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25945x718093f7.OnMapLoadedListener
    /* renamed from: onMapLoaded */
    public void mo14563x28538962() {
        vc1.p1 p1Var = this.f516447a;
        p1Var.getClass();
        vc1.p1.f(p1Var);
        p1Var.f516635v = true;
        if (p1Var.P.size() > 0) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.addAll(p1Var.P);
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                p1Var.m((java.lang.String) it.next());
            }
            p1Var.P.clear();
        }
    }
}
