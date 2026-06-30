package hr3;

/* loaded from: classes11.dex */
public class v0 implements o13.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hr3.w0 f365627d;

    public v0(hr3.w0 w0Var) {
        this.f365627d = w0Var;
    }

    @Override // o13.x
    public void X2(p13.v vVar) {
        int i17 = vVar.f432691c;
        hr3.w0 w0Var = this.f365627d;
        if (i17 == 0) {
            java.util.List list = vVar.f432693e;
            w0Var.f365660p = list;
            com.p314xaae8f345.mm.ui.p2690x38b72420.n4 n4Var = w0Var.f288584i;
            if (n4Var != null) {
                n4Var.d4(vVar.f432689a.f432674c, list.size(), true);
            }
        }
        w0Var.h();
        w0Var.notifyDataSetChanged();
    }
}
