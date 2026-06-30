package dk5;

/* loaded from: classes11.dex */
public class t0 implements o13.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dk5.u0 f316426d;

    public t0(dk5.u0 u0Var) {
        this.f316426d = u0Var;
    }

    @Override // o13.x
    public void X2(p13.v vVar) {
        int i17 = vVar.f432691c;
        dk5.u0 u0Var = this.f316426d;
        if (i17 == 0) {
            u0Var.f316458q = vVar;
        } else {
            u0Var.f316458q = null;
        }
        if (vVar.f432693e.size() == 0) {
            p13.y yVar = new p13.y();
            yVar.f432720e = "no_result\u200b";
            java.util.ArrayList arrayList = new java.util.ArrayList();
            vVar.f432693e = arrayList;
            arrayList.add(yVar);
        }
        u0Var.h();
        u0Var.notifyDataSetChanged();
        u0Var.f288584i.d4(vVar.f432689a.f432674c, vVar.f432693e.size(), true);
    }
}
