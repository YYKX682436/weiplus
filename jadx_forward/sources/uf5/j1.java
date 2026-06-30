package uf5;

/* loaded from: classes10.dex */
public class j1 {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f508785a;

    /* renamed from: b, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f508786b = null;

    public j1(android.content.Context context) {
        this.f508785a = context;
    }

    public void a(java.lang.Runnable runnable) {
        android.content.Context context = this.f508785a;
        this.f508786b = db5.e1.Q(context, context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), this.f508785a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.e_), true, false, new uf5.e1(this, runnable));
    }

    public void b(java.lang.Runnable runnable, java.lang.Runnable runnable2) {
        runnable.run();
        android.content.Context context = this.f508785a;
        this.f508786b = db5.e1.Q(context, context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), this.f508785a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571415ed), true, false, new uf5.f1(this, runnable2));
    }

    public void c() {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = this.f508786b;
        if (u3Var != null) {
            u3Var.dismiss();
            this.f508786b = null;
        }
    }
}
