package cy3;

/* loaded from: classes10.dex */
public final class c implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cy3.d f306290d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ vx3.i f306291e;

    public c(cy3.d dVar, vx3.i iVar) {
        this.f306290d = dVar;
        this.f306291e = iVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/ringtone/widget/CommonRingtoneLayout$refreshCommonRingBackInfo$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        cy3.d dVar = this.f306290d;
        vx3.i iVar = dVar.f306299h;
        boolean z17 = false;
        if (iVar != null && iVar.f522830n) {
            z17 = true;
        }
        if (!z17) {
            vx3.i iVar2 = this.f306291e;
            if (iVar2.j()) {
                android.content.Context context = dVar.f306298g;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
                pf5.z zVar = pf5.z.f435481a;
                if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                    throw new java.lang.IllegalStateException("Check failed.".toString());
                }
                p012xc85e97e9.p093xedfae76a.c1 a17 = zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.v.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
                ((com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.v) a17).R6(this.f306291e, 39, 22, (r18 & 8) != 0 ? 0L : 0L, (r18 & 16) != 0 ? "" : null, (r18 & 32) != 0 ? 0 : 0);
                android.content.Context context2 = dVar.f306298g;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context2, "context");
                pf5.z zVar2 = pf5.z.f435481a;
                if (!(context2 instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                    throw new java.lang.IllegalStateException("Check failed.".toString());
                }
                ((com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.d3) zVar2.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context2).a(com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.d3.class)).O6(iVar2, "");
            } else {
                cy3.g.a(dVar, cy3.e.f306303d, null, 2, null);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/ringtone/widget/CommonRingtoneLayout$refreshCommonRingBackInfo$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
