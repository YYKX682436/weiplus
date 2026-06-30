package fx2;

/* loaded from: classes8.dex */
public final class e implements ep0.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ fx2.f f348657a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ fx2.f f348658b;

    public e(fx2.f fVar, fx2.f fVar2) {
        this.f348657a = fVar;
        this.f348658b = fVar2;
    }

    @Override // ep0.e
    public void a(ip0.a aVar, cp0.n nVar, java.lang.Object obj) {
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj;
        if (bitmap != null) {
            if (!(!bitmap.isRecycled())) {
                bitmap = null;
            }
            if (bitmap != null) {
                fx2.f fVar = this.f348657a;
                java.lang.String str = fVar.f348661c;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("loaded, view:");
                java.lang.ref.WeakReference weakReference = fVar.f348662d;
                android.view.View view = (android.view.View) weakReference.get();
                sb6.append(view != null ? java.lang.Integer.valueOf(view.hashCode()) : null);
                sb6.append(", ");
                fx2.f fVar2 = this.f348658b;
                sb6.append(fVar2.f348659a);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
                android.view.View view2 = (android.view.View) weakReference.get();
                java.lang.Object tag = view2 != null ? view2.getTag(fVar.f348660b) : null;
                java.lang.String str2 = tag instanceof java.lang.String ? (java.lang.String) tag : null;
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(fVar2.f348659a, str2)) {
                    pm0.v.X(new fx2.d(fVar, bitmap));
                    return;
                }
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder("loaded not match, view:");
                android.view.View view3 = (android.view.View) weakReference.get();
                sb7.append(view3 != null ? java.lang.Integer.valueOf(view3.hashCode()) : null);
                sb7.append(", lastUrl:");
                sb7.append(str2);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(fVar.f348661c, sb7.toString());
            }
        }
    }
}
