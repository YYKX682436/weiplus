package tn4;

/* loaded from: classes11.dex */
public class m implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.mm6 f502368d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f502369e;

    public m(tn4.o oVar, r45.mm6 mm6Var, android.content.Context context) {
        this.f502368d = mm6Var;
        this.f502369e = context;
    }

    @Override // java.lang.Runnable
    public void run() {
        r45.mm6 mm6Var = this.f502368d;
        if (mm6Var != null) {
            int i17 = mm6Var.f462214t;
            if ((i17 == 4 || i17 == 3) && com.p314xaae8f345.mm.vfs.w6.j(mm6Var.f462202e) && uk.b.a(this.f502368d.f462202e) && c83.e.n(this.f502368d.f462202e)) {
                ((ku5.t0) ku5.t0.f394148d).B(new tn4.l(this));
            }
        }
    }
}
