package en4;

/* loaded from: classes8.dex */
public final class b extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ en4.f f336869d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(en4.f fVar) {
        super(1);
        this.f336869d = fVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        pm4.z state = (pm4.z) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        j75.d dVar = state.f379599d;
        if (dVar != null && (dVar instanceof vm4.a)) {
            en4.f fVar = this.f336869d;
            android.os.Bundle bundleExtra = fVar.m158354x19263085().getIntent().getBundleExtra("key_extra_data");
            if (bundleExtra != null) {
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = fVar.m158354x19263085();
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a aVar = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a();
                aVar.f293260q = bp.b.m10969xb866ec1c(fVar.m158354x19263085().getResources(), com.p314xaae8f345.mm.R.raw.f78968xd6d29e07, null);
                aVar.D = false;
                aVar.T = 3;
                aVar.A = false;
                aVar.B = false;
                aVar.f293246c = fVar.m158354x19263085().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572473bb2);
                aVar.R = 17;
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 j0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0(m158354x19263085, com.p314xaae8f345.mm.R.C30868x68b1db1.f576324wd);
                j0Var.e(aVar);
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.d0 d0Var = aVar.f293256m;
                if (d0Var != null) {
                    d0Var.a(j0Var.f293370r);
                }
                j0Var.w(fVar.m158354x19263085().getString(com.p314xaae8f345.mm.R.C30867xcad56011.bay, bundleExtra.getString("_openbusinessview_app_name", "")), true, new en4.d(bundleExtra, bundleExtra.getString("_openbusinessview_package_name", "")));
                j0Var.A(fVar.m158354x19263085().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572476bb5), true, en4.e.f336873d);
                j0Var.x(fVar.m158354x19263085().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560267fp));
                j0Var.show();
                jx3.f.INSTANCE.d(17080, 42, 1);
            }
        }
        return jz5.f0.f384359a;
    }
}
