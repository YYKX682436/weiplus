package db5;

/* loaded from: classes11.dex */
public class w6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f310095d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ db5.x6 f310096e;

    public w6(db5.x6 x6Var, java.lang.String str) {
        this.f310096e = x6Var;
        this.f310095d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        db5.x6 x6Var = this.f310096e;
        x6Var.f310106f.F.setText("");
        x6Var.f310106f.F.append(this.f310095d);
    }
}
