package op;

/* loaded from: classes11.dex */
public class c extends op.a {

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.m1 f428755f;

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.u0 f428756g = new op.b(this);

    public c(boolean z17) {
        this.f428752d = z17;
    }

    public void a(xg3.q0 q0Var) {
        if (this.f428752d) {
            this.f428755f = new l41.c0(q0Var);
            return;
        }
        java.util.LinkedList linkedList = new java.util.LinkedList();
        linkedList.add(q0Var);
        this.f428755f = new e21.k(linkedList);
    }

    public void b(android.content.Context context, java.lang.String str, java.lang.String str2, boolean z17, boolean z18, android.content.DialogInterface.OnCancelListener onCancelListener) {
        if (this.f428755f == null) {
            return;
        }
        this.f428753e = db5.e1.Q(context, str, str2, z17, z18, onCancelListener);
        com.p314xaae8f345.mm.p944x882e457a.m1 m1Var = this.f428755f;
        if (m1Var == null) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ContactSyncOpLogCallbackFactory", "request scene %s", m1Var);
        if (this.f428753e != null || !((java.util.ArrayList) this.f428749a).isEmpty() || !((java.util.ArrayList) this.f428750b).isEmpty() || !((java.util.ArrayList) this.f428751c).isEmpty()) {
            gm0.j1.i();
            gm0.j1.n().f354821b.a(this.f428755f.mo808xfb85f7b0(), this.f428756g);
        }
        gm0.j1.i();
        gm0.j1.n().f354821b.g(this.f428755f);
    }
}
