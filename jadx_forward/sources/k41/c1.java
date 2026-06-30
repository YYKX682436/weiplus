package k41;

/* loaded from: classes11.dex */
public final class c1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f385509d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f385510e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ j41.w f385511f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.a f385512g;

    public c1(java.lang.String str, boolean z17, j41.w wVar, yz5.a aVar) {
        this.f385509d = str;
        this.f385510e = z17;
        this.f385511f = wVar;
        this.f385512g = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.ArrayList arrayList;
        kk.j jVar = k41.h1.f385541e;
        java.lang.Integer num = (java.lang.Integer) ((lt0.f) jVar).i(this.f385509d);
        int intValue = num == null ? 0 : num.intValue();
        if (this.f385510e && intValue >= 3) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.OpenIMKefuGetContactService", "checkAddTask getContact exceed limit: %s", this.f385509d);
            j41.w wVar = this.f385511f;
            if (wVar != null) {
                wVar.a(null);
                return;
            }
            return;
        }
        ((ku5.t0) ku5.t0.f394148d).B(new k41.b1(this.f385511f, this.f385509d));
        k41.h1 h1Var = k41.h1.f385540d;
        java.lang.String str = this.f385509d;
        j41.w wVar2 = this.f385511f;
        java.util.HashMap hashMap = k41.h1.f385543g;
        if (((java.util.ArrayList) hashMap.get(str)) == null) {
            hashMap.put(str, new java.util.ArrayList());
        }
        if (wVar2 != null && (arrayList = (java.util.ArrayList) hashMap.get(str)) != null) {
            arrayList.add(wVar2);
        }
        if (k41.h1.f385542f.contains(this.f385509d)) {
            return;
        }
        ((lt0.f) jVar).j(this.f385509d, java.lang.Integer.valueOf(intValue + 1));
        this.f385512g.mo152xb9724478();
    }
}
