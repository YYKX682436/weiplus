package s31;

/* loaded from: classes12.dex */
public final class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.Button f483966d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ s31.f f483967e;

    public d(android.widget.Button button, s31.f fVar) {
        this.f483966d = button;
        this.f483967e = fVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        an5.d dVar;
        an5.c cVar;
        an5.d dVar2;
        an5.c cVar2;
        an5.d dVar3;
        an5.c cVar3;
        an5.d dVar4;
        an5.c cVar4;
        android.widget.Button button = this.f483966d;
        android.view.ViewGroup.LayoutParams layoutParams = button.getLayoutParams();
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            android.content.Context context = button.getContext();
            float f17 = 0.0f;
            s31.f fVar = this.f483967e;
            int a17 = ym5.x.a(context, (fVar == null || (dVar4 = fVar.f483981o) == null || (cVar4 = dVar4.f90412a) == null) ? 0.0f : cVar4.f90411a);
            int a18 = ym5.x.a(button.getContext(), (fVar == null || (dVar3 = fVar.f483981o) == null || (cVar3 = dVar3.f90413b) == null) ? 0.0f : cVar3.f90411a);
            int a19 = ym5.x.a(button.getContext(), (fVar == null || (dVar2 = fVar.f483981o) == null || (cVar2 = dVar2.f90414c) == null) ? 0.0f : cVar2.f90411a);
            android.content.Context context2 = button.getContext();
            if (fVar != null && (dVar = fVar.f483981o) != null && (cVar = dVar.f90415d) != null) {
                f17 = cVar.f90411a;
            }
            marginLayoutParams.setMargins(a17, a18, a19, ym5.x.a(context2, f17));
            button.setLayoutParams(marginLayoutParams);
        }
    }
}
