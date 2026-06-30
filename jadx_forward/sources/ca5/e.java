package ca5;

/* loaded from: classes14.dex */
public class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f121615d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f121616e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f121617f;

    public e(com.p314xaae8f345.mm.p2633x99f0578a.ui.C21330xc127fb4d c21330xc127fb4d, java.util.List list, int i17, float f17) {
        this.f121615d = list;
        this.f121616e = i17;
        this.f121617f = f17;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f121615d.set(this.f121616e, java.lang.Float.valueOf(this.f121617f));
    }
}
