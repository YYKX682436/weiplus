package uc5;

/* loaded from: classes10.dex */
public final class h implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uc5.d f508022d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ uc5.n f508023e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f508024f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View f508025g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f508026h;

    public h(uc5.d dVar, uc5.n nVar, android.content.Context context, android.view.View view, in5.s0 s0Var) {
        this.f508022d = dVar;
        this.f508023e = nVar;
        this.f508024f = context;
        this.f508025g = view;
        this.f508026h = s0Var;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(android.view.View view) {
        xm3.t0 b17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/history/base/MsgHistoryGalleryBaseItemConvert$buildItemBodyLongClickListener$1", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        uc5.d dVar = this.f508022d;
        uc5.c cVar = dVar.f508009d;
        boolean b18 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(cVar, uc5.a.f508002a);
        uc5.n nVar = this.f508023e;
        boolean z17 = false;
        if (b18) {
            nVar.getClass();
            android.content.Context context = this.f508024f;
            android.view.View view2 = this.f508025g;
            rl5.r rVar = new rl5.r(context, view2);
            rVar.C = true;
            rVar.f478888y = new uc5.k(nVar, context);
            rVar.f478887x = new uc5.m(dVar, nVar, context, rVar);
            int[] iArr = new int[2];
            view2.getLocationOnScreen(iArr);
            rVar.n(iArr[0] + (view2.getWidth() / 2), iArr[1]);
        } else {
            if (!(cVar instanceof uc5.b)) {
                throw new jz5.j();
            }
            int m8183xf806b362 = this.f508026h.m8183xf806b362();
            if (m8183xf806b362 == -1) {
                yj0.a.i(false, this, "com/tencent/mm/ui/chatting/history/base/MsgHistoryGalleryBaseItemConvert$buildItemBodyLongClickListener$1", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
                return false;
            }
            uc5.r rVar2 = nVar.f508064g;
            if (rVar2 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MsgHistoryGalleryBaseItemConvert", "buildItemBodyLongClickListener, controller is null, skip drag select");
                yj0.a.i(false, this, "com/tencent/mm/ui/chatting/history/base/MsgHistoryGalleryBaseItemConvert$buildItemBodyLongClickListener$1", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
                return false;
            }
            wc5.k1 o76 = ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2660x373fe494.ActivityC21814x1938a8b3) rVar2).o7();
            if (((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2660x373fe494.ActivityC21814x1938a8b3) o76.V6()).r7() && (b17 = xm3.u0.b(((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2660x373fe494.ActivityC21814x1938a8b3) o76.V6()).m7())) != null) {
                java.lang.Object a07 = kz5.n0.a0(b17.m82898xfb7e5820(), m8183xf806b362);
                uc5.h0 h0Var = a07 instanceof uc5.h0 ? (uc5.h0) a07 : null;
                if (h0Var != null) {
                    uc5.c cVar2 = h0Var.f508027d.f508009d;
                    if ((cVar2 instanceof uc5.b) && ((uc5.b) cVar2).f508004a) {
                        z17 = true;
                    }
                    o76.f526127g = z17;
                    kn5.e eVar = o76.f526126f;
                    if (eVar != null) {
                        eVar.f(true, m8183xf806b362);
                    }
                }
            }
        }
        yj0.a.i(true, this, "com/tencent/mm/ui/chatting/history/base/MsgHistoryGalleryBaseItemConvert$buildItemBodyLongClickListener$1", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return true;
    }
}
