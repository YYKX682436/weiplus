package ti2;

/* loaded from: classes8.dex */
public final class a implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ti2.b f501073d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ vi2.e f501074e;

    public a(ti2.b bVar, int i17, vi2.e eVar) {
        this.f501073d = bVar;
        this.f501074e = eVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/mic/pk/convert/AnchorMicAcceptConvert$onBindViewHolder$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (this.f501073d.f501076f == null) {
            yj0.a.h(this, "com/tencent/mm/plugin/finder/live/mic/pk/convert/AnchorMicAcceptConvert$onBindViewHolder$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        vi2.e eVar = this.f501074e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(eVar, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.live.mic.pk.data.MicAnchorUserAcceptConvertData");
        p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.f.a(eVar);
        throw null;
    }
}
