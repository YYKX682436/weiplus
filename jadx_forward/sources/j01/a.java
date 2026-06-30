package j01;

/* loaded from: classes11.dex */
public class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j01.b f378504d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f378505e;

    public a(j01.c cVar, j01.b bVar, java.lang.Object obj) {
        this.f378504d = bVar;
        this.f378505e = obj;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f378504d.a(this.f378505e);
    }
}
