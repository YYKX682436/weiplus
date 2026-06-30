package vc5;

/* loaded from: classes10.dex */
public final class g extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2660x373fe494.p2661x2cfb7d39.C21816x74d192a3 f516851d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f516852e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2660x373fe494.p2661x2cfb7d39.C21816x74d192a3 c21816x74d192a3, android.content.Context context) {
        super(1);
        this.f516851d = c21816x74d192a3;
        this.f516852e = context;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        ed5.w m79659xb01a7eb0;
        java.lang.Object obj2;
        java.lang.Object obj3;
        java.lang.String string;
        java.util.List optionList = (java.util.List) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(optionList, "optionList");
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2660x373fe494.p2661x2cfb7d39.C21816x74d192a3 c21816x74d192a3 = this.f516851d;
        m79659xb01a7eb0 = c21816x74d192a3.m79659xb01a7eb0();
        m79659xb01a7eb0.dismiss();
        java.util.Iterator it = optionList.iterator();
        while (true) {
            obj2 = null;
            if (!it.hasNext()) {
                obj3 = null;
                break;
            }
            obj3 = it.next();
            if (((yg5.e) obj3).f543885h) {
                break;
            }
        }
        yg5.e eVar = (yg5.e) obj3;
        if (eVar != null) {
            em.u1 u1Var = c21816x74d192a3.f283244f;
            if (u1Var == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("binding");
                throw null;
            }
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2660x373fe494.p2666x4fe3eeaf.C21833xd4015cd6 a17 = u1Var.a();
            java.lang.CharSequence charSequence = eVar.f543884g;
            a17.m79752x1272205(charSequence);
            java.util.Iterator it6 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2660x373fe494.p2663xb63dd9d4.g.f283284e.a().iterator();
            while (true) {
                if (!it6.hasNext()) {
                    break;
                }
                java.lang.Object next = it6.next();
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2660x373fe494.p2663xb63dd9d4.g) next).getClass().getName(), eVar.f543881d)) {
                    obj2 = next;
                    break;
                }
            }
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2660x373fe494.p2663xb63dd9d4.g gVar = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2660x373fe494.p2663xb63dd9d4.g) obj2;
            if (gVar != null) {
                yz5.l lVar = c21816x74d192a3.f283246h;
                if (lVar != null) {
                    lVar.mo146xb9724478(gVar);
                }
                boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(gVar, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2660x373fe494.p2663xb63dd9d4.q.f283315f);
                android.content.Context context = this.f516852e;
                if (b17) {
                    string = context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f575388pd3);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
                } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(gVar, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2660x373fe494.p2663xb63dd9d4.j.f283295f)) {
                    string = context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f575387pd2);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
                } else {
                    string = context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f575385pd0);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
                }
                c21816x74d192a3.m79660x837de2ba(string);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgHistoryGalleryActionBarView", "TypeFilterDialog selected, option: " + ((java.lang.Object) charSequence));
        }
        return jz5.f0.f384359a;
    }
}
