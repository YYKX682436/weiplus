package l02;

/* loaded from: classes.dex */
public class p implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f396365d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f396366e;

    public p(l02.q qVar, android.content.Context context, java.lang.String str) {
        this.f396365d = context;
        this.f396366e = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        k02.l.d(this.f396365d, this.f396366e, null);
    }
}
