package ty2;

/* loaded from: classes9.dex */
public final class w implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ty2.y f504652d;

    public w(ty2.y yVar) {
        this.f504652d = yVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ty2.y yVar = this.f504652d;
        ty2.v vVar = yVar.f504658i;
        int measuredWidth = yVar.getMeasuredWidth();
        bw5.q5 q5Var = vVar.f504651b;
        vVar.getClass();
        yVar.m167242xad5facf9(new ty2.v(measuredWidth, q5Var));
    }
}
