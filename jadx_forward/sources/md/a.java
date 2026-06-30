package md;

/* loaded from: classes14.dex */
public class a implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f407207d;

    public a(md.f fVar, java.lang.ref.WeakReference weakReference) {
        this.f407207d = weakReference;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        md.e eVar;
        md.f fVar = (md.f) this.f407207d.get();
        if (fVar != null) {
            fVar.f407215g = true;
            java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
            if (n3.x0.c(fVar)) {
                boolean z17 = true;
                boolean z18 = false;
                boolean z19 = false;
                for (int i17 = 0; i17 < fVar.getChildCount(); i17++) {
                    android.view.View childAt = fVar.getChildAt(i17);
                    if (childAt != null && childAt != fVar.f407213e && (eVar = (md.e) fVar.f407218m.get(childAt)) != null) {
                        if (!z18 && eVar.f407211b != 0 && childAt.getVisibility() == 0) {
                            fVar.f407212d = childAt;
                            fVar.post(fVar.f407219n);
                            z18 = true;
                        }
                        z19 |= eVar.f407211b == 0;
                        z17 &= childAt.getVisibility() != 0;
                        eVar.f407211b = childAt.getVisibility();
                    }
                }
                if (z18 || (z19 && z17)) {
                    fVar.post(fVar.f407220o);
                }
            }
            if (fVar.f407217i != null) {
                android.view.View view = fVar.f407212d;
                ((md.h) fVar.f407217i).d(fVar, true, 0, 0, 0, (view == null || !view.isShown()) ? 0 : fVar.f407212d.getMeasuredHeight());
            }
            fVar.f407215g = false;
        }
    }
}
