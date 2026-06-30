package kr5;

/* loaded from: classes13.dex */
public class m implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f393101d;

    public m(java.lang.String str) {
        this.f393101d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        or5.b.a("async look up send", new java.lang.Object[0]);
        kr5.p.b(this.f393101d, kr5.p.f393104b.f393087i, false, true);
    }
}
