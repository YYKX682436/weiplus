package vv4;

/* loaded from: classes11.dex */
public final class o extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.ui.ActivityC19216xc2476b75 f522014d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.ui.ActivityC19216xc2476b75 activityC19216xc2476b75) {
        super(2);
        this.f522014d = activityC19216xc2476b75;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        dv4.n nVar;
        java.lang.String status = (java.lang.String) obj;
        java.lang.String str = (java.lang.String) obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMFTSImageRecognitionUI", "yptest statusListener " + status + ' ' + str);
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(status, "STATE_WILL_CHANGE_HEIGHT") ? true : p3321xbce91901.jvm.p3324x21ffc6bd.o.b(status, "STATE_DID_CHANGE_HEIGHT")) {
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5264x9748f8fa c5264x9748f8fa = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5264x9748f8fa();
            float parseFloat = str != null ? java.lang.Float.parseFloat(str) : 0.0f;
            dv4.n.f325550e.getClass();
            if (parseFloat == 0.2f) {
                nVar = dv4.n.f325552g;
            } else {
                if (parseFloat == 0.65f) {
                    nVar = dv4.n.f325553h;
                } else {
                    nVar = parseFloat == 1.0f ? dv4.n.f325554i : dv4.n.f325551f;
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.ui.ActivityC19216xc2476b75 activityC19216xc2476b75 = this.f522014d;
            int i17 = activityC19216xc2476b75.f263165d;
            am.w2 w2Var = c5264x9748f8fa.f135591g;
            w2Var.f89787a = i17;
            w2Var.f89788b = (java.lang.String) kz5.c1.k(new jz5.l("STATE_WILL_CHANGE_HEIGHT", "heightWillChange"), new jz5.l("STATE_DID_CHANGE_HEIGHT", "heightDidChange")).get(status);
            w2Var.f89789c = java.lang.String.valueOf(ri.l0.a(kz5.c1.k(new jz5.l("screenType", nVar.f325556d), new jz5.l("visibleHeight", java.lang.Float.valueOf(parseFloat * ((java.lang.Number) ((jz5.n) activityC19216xc2476b75.f263167f).mo141623x754a37bb()).intValue())))));
            c5264x9748f8fa.e();
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(status, "STATE_DID_CHANGE_HEIGHT")) {
                dv4.n nVar2 = dv4.n.f325554i;
                if (nVar == nVar2) {
                    ((sg0.e) ((tg0.f1) i95.n0.c(tg0.f1.class))).Ui(activityC19216xc2476b75.Y6(), activityC19216xc2476b75.X6(), tg0.e1.f500600m, activityC19216xc2476b75.a7());
                }
                android.view.View view = (android.view.View) ((jz5.n) activityC19216xc2476b75.f263170i).mo141623x754a37bb();
                int i18 = nVar == nVar2 ? 8 : 0;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(java.lang.Integer.valueOf(i18));
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/websearch/ui/MMFTSImageRecognitionUI$initSearchHalfScreen$statusListener$1", "invoke", "(Ljava/lang/String;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/websearch/ui/MMFTSImageRecognitionUI$initSearchHalfScreen$statusListener$1", "invoke", "(Ljava/lang/String;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        return jz5.f0.f384359a;
    }
}
