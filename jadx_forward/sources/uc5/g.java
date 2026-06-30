package uc5;

/* loaded from: classes10.dex */
public final class g implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uc5.d f508017d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ uc5.n f508018e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f508019f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f508020g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.widget.CheckBox f508021h;

    public g(uc5.d dVar, uc5.n nVar, android.content.Context context, java.lang.Object obj, android.widget.CheckBox checkBox) {
        this.f508017d = dVar;
        this.f508018e = nVar;
        this.f508019f = context;
        this.f508020g = obj;
        this.f508021h = checkBox;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/history/base/MsgHistoryGalleryBaseItemConvert$buildItemBodyClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        uc5.d dVar = this.f508017d;
        uc5.c cVar = dVar.f508009d;
        boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(cVar, uc5.a.f508002a);
        uc5.n nVar = this.f508018e;
        if (b17) {
            nVar.u(this.f508019f, this.f508020g, dVar.f508010e);
        } else if (cVar instanceof uc5.b) {
            uc5.r rVar = nVar.f508064g;
            if (rVar == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MsgHistoryGalleryBaseItemConvert", "buildItemBodyClickListener, controller is null, skip");
                yj0.a.h(this, "com/tencent/mm/ui/chatting/history/base/MsgHistoryGalleryBaseItemConvert$buildItemBodyClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            boolean z17 = !((uc5.b) cVar).f508004a;
            uc5.b bVar = new uc5.b(z17);
            this.f508021h.setChecked(z17);
            java.lang.String uniqueId = dVar.v();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(uniqueId, "uniqueId");
            ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2660x373fe494.ActivityC21814x1938a8b3) rVar).o7().W6(uniqueId, bVar);
            dVar.getClass();
            dVar.f508009d = bVar;
        }
        yj0.a.h(this, "com/tencent/mm/ui/chatting/history/base/MsgHistoryGalleryBaseItemConvert$buildItemBodyClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
