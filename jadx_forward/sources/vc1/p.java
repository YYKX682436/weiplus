package vc1;

/* loaded from: classes13.dex */
public class p implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f516586d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ vc1.q2 f516587e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ o91.d f516588f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ vc1.p1 f516589g;

    public p(vc1.p1 p1Var, java.lang.String str, vc1.q2 q2Var, o91.d dVar) {
        this.f516589g = p1Var;
        this.f516586d = str;
        this.f516587e = q2Var;
        this.f516588f = dVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f516589g.c(this.f516586d, this.f516587e, this.f516588f);
    }
}
