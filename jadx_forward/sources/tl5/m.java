package tl5;

/* loaded from: classes10.dex */
public final class m implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tl5.d f501907d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f501908e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ tl5.s f501909f;

    public m(tl5.d dVar, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, tl5.s sVar) {
        this.f501907d = dVar;
        this.f501908e = c1163xf1deaba4;
        this.f501909f = sVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        tl5.d dVar = this.f501907d;
        java.util.Iterator it = dVar.f501872d.iterator();
        while (it.hasNext()) {
            android.graphics.drawable.Drawable drawable = ((tl5.i) it.next()).f501889f;
            if (drawable != null && drawable.getAlpha() != 255) {
                drawable.setAlpha(255);
            }
        }
        dVar.f501872d = kz5.p0.f395529d;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView = this.f501908e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        dVar.f501875g = 0;
        dVar.f501874f = false;
        recyclerView.getOverlay().remove(dVar);
        tl5.s sVar = this.f501909f;
        sVar.f501921d = null;
        sVar.f501920c = tl5.l.f501902d;
        sVar.f501925h = 0;
        sVar.f501926i = 0;
        sVar.f501924g = null;
        sVar.f501927j = null;
        sVar.f501928k = false;
        sVar.f501929l = 0.0f;
        sVar.f501930m = null;
        java.lang.ref.WeakReference weakReference = sVar.f501923f;
        if (weakReference != null) {
            weakReference.clear();
        }
        sVar.f501923f = null;
    }
}
