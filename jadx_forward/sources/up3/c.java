package up3;

/* loaded from: classes12.dex */
public class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f511352d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f511353e;

    public c(up3.o oVar, java.lang.String str, java.util.Map map) {
        this.f511352d = str;
        this.f511353e = map;
    }

    @Override // java.lang.Runnable
    public void run() {
        ((up3.p) ((java.util.TreeMap) up3.o.f511381q).get(this.f511352d)).a(this.f511353e);
    }
}
