package mo3;

/* loaded from: classes9.dex */
public class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c01.v8 f411946d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f411947e;

    public j(mo3.l lVar, c01.v8 v8Var, java.util.List list) {
        this.f411946d = v8Var;
        this.f411947e = list;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f411946d.c(this.f411947e);
    }
}
