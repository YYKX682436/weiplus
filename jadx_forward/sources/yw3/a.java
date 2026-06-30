package yw3;

/* loaded from: classes4.dex */
public final class a implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yw3.j f548215d;

    public a(yw3.j jVar) {
        this.f548215d = jVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/repairer/ui/demo/DemoConvert$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        jm0.i iVar = jm0.k.f381802h;
        yw3.k kVar = (yw3.k) ((yw3.d) iVar.a(yw3.d.class)).P6(yw3.k.class);
        android.content.ContentValues contentValues = new android.content.ContentValues();
        contentValues.put(dm.i4.f66865x76d1ec5a, this.f548215d.f548306d.t0());
        yw3.p pVar = (yw3.p) kVar.T6(contentValues, p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(yw3.p.class));
        if (pVar != null) {
            pVar.I0(c01.id.c());
            com.p314xaae8f345.mm.sdk.p2605x8fb0427b.p2606x335620.AbstractC21005xe7f8081b.W6(((yw3.d) iVar.a(yw3.d.class)).P6(yw3.k.class), pVar, false, false, 6, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/repairer/ui/demo/DemoConvert$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
