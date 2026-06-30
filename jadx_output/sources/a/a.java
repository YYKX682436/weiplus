package a;

/* loaded from: classes13.dex */
public final class a extends q5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f41a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a.b f42b;

    public a(a.b bVar, boolean z17) {
        this.f42b = bVar;
        this.f41a = z17;
    }

    @Override // q5.a
    public final void a(android.app.Activity activity) {
        a.b bVar = this.f42b;
        bVar.f45b.e(activity);
        zy5.a aVar = bVar.f45b;
        if (activity != null) {
            aVar.d();
            aVar.d();
            java.util.ArrayList arrayList = aVar.f477687d;
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
        bVar.f46c.put(java.lang.Integer.valueOf(activity.hashCode()), java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        if (bVar.f48e == null || this.f41a) {
            return;
        }
        java.lang.String string = com.tencent.mm.sdk.platformtools.o4.M("mmkv_id_amoeba_default").getString("sentinel_main_start", "");
        if (android.text.TextUtils.isEmpty(string)) {
            return;
        }
        ry5.c f17 = ry5.c.f();
        f17.getClass();
        if (android.text.TextUtils.isEmpty(string)) {
            return;
        }
        f17.f401703a = string;
        f17.f401704b.f401697c = string;
        f17.a(2);
    }
}
