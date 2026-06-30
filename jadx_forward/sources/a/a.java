package a;

/* loaded from: classes13.dex */
public final class a extends q5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f81574a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a.b f81575b;

    public a(a.b bVar, boolean z17) {
        this.f81575b = bVar;
        this.f81574a = z17;
    }

    @Override // q5.a
    public final void a(android.app.Activity activity) {
        a.b bVar = this.f81575b;
        bVar.f81578b.e(activity);
        zy5.a aVar = bVar.f81578b;
        if (activity != null) {
            aVar.d();
            aVar.d();
            java.util.ArrayList arrayList = aVar.f559220d;
            java.util.Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    arrayList.add(new java.lang.ref.WeakReference(activity));
                    break;
                }
                java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) it.next();
                if (weakReference != null && weakReference.get() == activity) {
                    break;
                }
            }
        } else {
            aVar.getClass();
        }
        bVar.f81579c.put(java.lang.Integer.valueOf(activity.hashCode()), java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        if (bVar.f81581e == null || this.f81574a) {
            return;
        }
        java.lang.String string = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("mmkv_id_amoeba_default").getString("sentinel_main_start", "");
        if (android.text.TextUtils.isEmpty(string)) {
            return;
        }
        ry5.c f17 = ry5.c.f();
        f17.getClass();
        if (android.text.TextUtils.isEmpty(string)) {
            return;
        }
        f17.f483236a = string;
        f17.f483237b.f483230c = string;
        f17.a(2);
    }
}
