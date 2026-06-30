package wd;

/* loaded from: classes7.dex */
public class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f526204d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e8.a f526205e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ wd.c f526206f;

    public b(wd.c cVar, java.lang.String str, e8.a aVar) {
        this.f526206f = cVar;
        this.f526204d = str;
        this.f526205e = aVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        synchronized (this.f526206f.f526211e) {
            wd.c cVar = this.f526206f;
            if (cVar.f526212f && !cVar.f526211e.contains(this.f526204d) && this.f526205e != null) {
                wd.c cVar2 = this.f526206f;
                if (cVar2.f526213g != 0) {
                    int size = cVar2.f526211e.size();
                    wd.c cVar3 = this.f526206f;
                    if (size < cVar3.f526213g) {
                        cVar3.f526211e.size();
                        java.lang.String str = this.f526205e.f331520g;
                        wd.c cVar4 = this.f526206f;
                        java.lang.String str2 = cVar4.f526210d;
                        int i17 = cVar4.f526215i;
                        long j17 = this.f526205e.f331514a;
                        long j18 = this.f526205e.f331518e;
                        long j19 = this.f526205e.f331519f;
                        wd.c.c(this.f526206f, this.f526204d, this.f526205e);
                    }
                } else {
                    double random = java.lang.Math.random();
                    wd.c cVar5 = this.f526206f;
                    if (random < cVar5.f526214h) {
                        cVar5.f526211e.size();
                        java.lang.String str3 = this.f526205e.f331520g;
                        wd.c cVar6 = this.f526206f;
                        java.lang.String str4 = cVar6.f526210d;
                        int i18 = cVar6.f526215i;
                        long j27 = this.f526205e.f331514a;
                        long j28 = this.f526205e.f331518e;
                        long j29 = this.f526205e.f331519f;
                        wd.c.c(this.f526206f, this.f526204d, this.f526205e);
                    }
                }
            }
        }
    }
}
