package ca5;

/* loaded from: classes14.dex */
public class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f121612d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f121613e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f121614f;

    public d(com.p314xaae8f345.mm.p2633x99f0578a.ui.C21330xc127fb4d c21330xc127fb4d, java.util.List list, int i17, float f17) {
        this.f121612d = list;
        this.f121613e = i17;
        this.f121614f = f17;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f121612d.set(this.f121613e, java.lang.Float.valueOf(this.f121614f));
    }
}
