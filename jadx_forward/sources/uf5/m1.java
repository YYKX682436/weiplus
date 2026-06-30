package uf5;

/* loaded from: classes10.dex */
public class m1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uf5.n1 f508806d;

    public m1(uf5.n1 n1Var) {
        this.f508806d = n1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        uf5.n1 n1Var = this.f508806d;
        com.p314xaae8f345.mm.ui.p2690x38b72420.p2693xed412388.ActivityC22349xe6f834c8.w7(n1Var.f508809d);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Select_Contact", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(n1Var.f508809d.C.f508822r, ","));
        n1Var.f508809d.setResult(-1, intent);
        n1Var.f508809d.finish();
    }
}
