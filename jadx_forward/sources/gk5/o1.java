package gk5;

/* loaded from: classes.dex */
public final class o1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gk5.r1 f354224d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o1(gk5.r1 r1Var) {
        super(1);
        this.f354224d = r1Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        vg5.a state = (vg5.a) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        j75.d dVar = state.f379599d;
        java.util.List list = state.f518308f;
        gk5.r1 r1Var = this.f354224d;
        if (dVar != null && (dVar instanceof wg5.e)) {
            ((java.util.ArrayList) list).size();
            com.p314xaae8f345.mm.ui.bk.s0(r1Var.T6().l().getPaint());
            r1Var.T6().l().setText(r1Var.m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ond));
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(list, 10));
            java.util.ArrayList arrayList3 = (java.util.ArrayList) list;
            java.util.Iterator it = arrayList3.iterator();
            int i17 = 0;
            while (it.hasNext()) {
                java.lang.Object next = it.next();
                int i18 = i17 + 1;
                if (i17 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                arrayList2.add(new q50.a((java.lang.String) next, !(i17 == arrayList3.size() - 1)));
                i17 = i18;
            }
            arrayList.addAll(arrayList2);
            com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf = new com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf(new in5.s() { // from class: com.tencent.mm.ui.transmit.uic.VoIPMsgPreviewHeaderUIC$preViewPreViewDialogBuilderItemConverts$1
                @Override // in5.s
                /* renamed from: getItemConvert */
                public in5.r mo43555xf2bb75ea(int type) {
                    return new q50.i();
                }
            }, arrayList, false);
            r1Var.T6().b().mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(r1Var.m80379x76847179(), 1, false));
            r1Var.T6().b().mo7960x6cab2c8d(c22848x6ddd90cf);
            r1Var.T6().d().setVisibility(8);
            r1Var.T6().a().setText(r1Var.m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.nc_));
            r1Var.T6().a().m81544x764b6bfb(com.p314xaae8f345.mm.R.raw.f79543xa8cb7202);
            r1Var.T6().c().getViewTreeObserver().addOnGlobalLayoutListener(new gk5.n1(r1Var));
        }
        j75.d dVar2 = state.f379599d;
        if (dVar2 != null && (dVar2 instanceof wg5.d)) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("Select_Conv_User", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(list, ","));
            r1Var.m158354x19263085().setResult(-1, intent);
            r1Var.m158354x19263085().finish();
        }
        return jz5.f0.f384359a;
    }
}
