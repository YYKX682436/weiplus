package hf2;

/* loaded from: classes10.dex */
public final class n1 implements p3325xe03a0797.p3326xc267989b.p3328x30012e.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hf2.p1 f362656d;

    public n1(hf2.p1 p1Var) {
        this.f362656d = p1Var;
    }

    @Override // p3325xe03a0797.p3326xc267989b.p3328x30012e.k
    /* renamed from: emit */
    public java.lang.Object mo771x2f8fd3(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        java.util.LinkedList linkedList = (java.util.LinkedList) obj;
        hf2.p1 p1Var = this.f362656d;
        java.lang.String str = p1Var.f362670b;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("observe dropStickerInfo dropInfo:$");
        sb6.append(linkedList);
        sb6.append(",editing:");
        hf2.x xVar = p1Var.f362669a;
        sb6.append(xVar.F);
        sb6.append('!');
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
        if (!(linkedList == null || linkedList.isEmpty())) {
            hf2.h1 h1Var = new hf2.h1(p1Var, linkedList);
            if (xVar.F) {
                p1Var.a().add(h1Var);
            } else {
                h1Var.run();
            }
        }
        return jz5.f0.f384359a;
    }
}
