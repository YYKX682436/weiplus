package or2;

/* loaded from: classes10.dex */
public final class p implements android.view.View.OnAttachStateChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f429199d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ or2.s f429200e;

    public p(android.view.View view, or2.s sVar) {
        this.f429199d = view;
        this.f429200e = sVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(android.view.View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(android.view.View view) {
        this.f429199d.removeOnAttachStateChangeListener(this);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        or2.s sVar = this.f429200e;
        if (sVar.f429211n > 0) {
            jSONObject.put("avgScrollCostMs", a06.d.c((((float) sVar.f429210m) * 1.0f) / r1));
            or2.o.f429197a.a(sVar.f429204d, jSONObject);
        }
        or2.o oVar = or2.o.f429197a;
        or2.j jVar = or2.j.f429189a;
        oVar.b(or2.j.f429190b);
    }
}
