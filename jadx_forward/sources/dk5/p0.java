package dk5;

/* loaded from: classes11.dex */
public class p0 implements o13.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dk5.s0 f316325d;

    public p0(dk5.s0 s0Var) {
        this.f316325d = s0Var;
    }

    @Override // o13.x
    public void X2(p13.v vVar) {
        dk5.s0 s0Var = this.f316325d;
        dk5.r0 r0Var = new dk5.r0(s0Var, null);
        r0Var.f316371a = vVar.f432689a.f432674c;
        r0Var.f316372b = vVar.f432692d;
        java.util.List list = vVar.f432693e;
        r0Var.f316376f = list;
        if (list == null || list.size() == 0) {
            p13.y yVar = new p13.y();
            yVar.f432720e = "no_result\u200b";
            java.util.ArrayList arrayList = new java.util.ArrayList();
            r0Var.f316376f = arrayList;
            arrayList.add(yVar);
        }
        ((java.util.ArrayList) s0Var.f316400p).add(r0Var);
        s0Var.v();
    }
}
