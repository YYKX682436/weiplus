package p21;

/* loaded from: classes9.dex */
public abstract class i {
    public static boolean a() {
        return q21.d.a() != null && ((va3.z0) q21.d.a()).e();
    }

    public static com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 b(android.content.Context context, int i17, java.lang.Runnable runnable) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.i0 i0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.i0(context);
        i0Var.g(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv);
        i0Var.d(i17);
        i0Var.f(com.p314xaae8f345.mm.R.C30867xcad56011.f571988vj);
        p21.g gVar = new p21.g(runnable);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a aVar = i0Var.f293354b;
        aVar.E = gVar;
        aVar.A = true;
        aVar.G = new p21.h(runnable);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 a17 = i0Var.a();
        a17.show();
        return a17;
    }
}
