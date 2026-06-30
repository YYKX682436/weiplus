package s01;

/* loaded from: classes11.dex */
public class w implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.j53 f483465d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f483466e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f483467f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ s01.y f483468g;

    public w(s01.y yVar, r45.j53 j53Var, java.lang.String str, boolean z17) {
        this.f483468g = yVar;
        this.f483465d = j53Var;
        this.f483466e = str;
        this.f483467f = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f483468g.l(this.f483465d, this.f483466e, this.f483467f);
    }
}
