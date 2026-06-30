package j11;

/* loaded from: classes11.dex */
public class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f378656d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ j11.h f378657e;

    public i(j11.h hVar, java.lang.String str) {
        this.f378657e = hVar;
        this.f378656d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        j11.h hVar = this.f378657e;
        for (java.lang.Object obj : ((lt0.f) hVar.f378646b).mo143585xbc5e1583().toArray()) {
            java.lang.String str = (java.lang.String) obj;
            if (str.startsWith(this.f378656d)) {
                ((lt0.f) hVar.f378646b).mo141381xc84af884(str);
            }
        }
    }
}
