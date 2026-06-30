package gv0;

/* loaded from: classes5.dex */
public final class a implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gv0.c f357501d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gv0.b f357502e;

    public a(gv0.c cVar, gv0.b bVar) {
        this.f357501d = cVar;
        this.f357502e = bVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/mj_publisher/finder/movie_composing/panel/base/adapter/BaseDataCallbackAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int m8183xf806b362 = this.f357501d.m8183xf806b362();
        if (m8183xf806b362 != -1) {
            gv0.b bVar = this.f357502e;
            java.lang.Object obj = bVar.f357503d.get(m8183xf806b362);
            bVar.getClass();
            long uptimeMillis = android.os.SystemClock.uptimeMillis();
            long j17 = bVar.f357505f;
            if (j17 <= 0 || uptimeMillis - bVar.f357506g >= j17) {
                bVar.f357506g = uptimeMillis;
                bVar.f357504e.mo149xb9724478(java.lang.Integer.valueOf(m8183xf806b362), obj);
            }
        }
        yj0.a.h(this, "com/tencent/mm/mj_publisher/finder/movie_composing/panel/base/adapter/BaseDataCallbackAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
