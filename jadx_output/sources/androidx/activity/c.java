package androidx.activity;

/* loaded from: classes13.dex */
public class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f9028d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ h.a f9029e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ androidx.activity.e f9030f;

    public c(androidx.activity.e eVar, int i17, h.a aVar) {
        this.f9030f = eVar;
        this.f9028d = i17;
        this.f9029e = aVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        androidx.activity.result.b bVar;
        java.lang.Object obj = this.f9029e.f277765a;
        androidx.activity.e eVar = this.f9030f;
        java.lang.String str = (java.lang.String) ((java.util.HashMap) eVar.f9063b).get(java.lang.Integer.valueOf(this.f9028d));
        if (str == null) {
            return;
        }
        androidx.activity.result.f fVar = (androidx.activity.result.f) ((java.util.HashMap) eVar.f9067f).get(str);
        if (fVar == null || (bVar = fVar.f9058a) == null) {
            eVar.f9069h.remove(str);
            ((java.util.HashMap) eVar.f9068g).put(str, obj);
        } else if (eVar.f9066e.remove(str)) {
            bVar.a(obj);
        }
    }
}
