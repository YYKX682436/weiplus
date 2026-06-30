package dg2;

/* loaded from: classes2.dex */
public final class d implements android.widget.CompoundButton.OnCheckedChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ dg2.e f313819a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f313820b;

    public d(dg2.e eVar, java.lang.Object obj) {
        this.f313819a = eVar;
        this.f313820b = obj;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(android.widget.CompoundButton buttonView, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(buttonView, "buttonView");
        java.lang.Object obj = this.f313820b;
        dg2.e eVar = this.f313819a;
        if (z17) {
            if (!eVar.f313822e.contains(obj)) {
                eVar.f313822e.add(obj);
            }
        } else if (eVar.f313822e.contains(obj)) {
            eVar.f313822e.remove(obj);
        }
        yz5.l lVar = eVar.f313825h;
        if (lVar != null) {
            lVar.mo146xb9724478(java.lang.Boolean.valueOf(!eVar.f313822e.isEmpty()));
        }
    }
}
