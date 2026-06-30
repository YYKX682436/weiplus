package vh0;

/* loaded from: classes14.dex */
public final class v2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f518515d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f518516e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.List f518517f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f518518g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f518519h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f518520i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ vh0.f3 f518521m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ vh0.i1 f518522n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ vh0.d1 f518523o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v2(android.content.Context context, java.util.List list, java.lang.String str, int i17, java.lang.String str2, vh0.f3 f3Var, vh0.i1 i1Var, vh0.d1 d1Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f518516e = context;
        this.f518517f = list;
        this.f518518g = str;
        this.f518519h = i17;
        this.f518520i = str2;
        this.f518521m = f3Var;
        this.f518522n = i1Var;
        this.f518523o = d1Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new vh0.v2(this.f518516e, this.f518517f, this.f518518g, this.f518519h, this.f518520i, this.f518521m, this.f518522n, this.f518523o, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((vh0.v2) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar;
        ai0.i[] iVarArr;
        pz5.a aVar2;
        java.lang.String str;
        java.lang.Object j17;
        vh0.v2 v2Var;
        pz5.a aVar3 = pz5.a.f440719d;
        int i17 = this.f518515d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            ai0.g gVar = new ai0.g(this.f518516e, this.f518517f, this.f518518g, this.f518519h, this.f518520i);
            java.lang.Boolean bool = java.lang.Boolean.FALSE;
            this.f518515d = 1;
            p3325xe03a0797.p3326xc267989b.r rVar = new p3325xe03a0797.p3326xc267989b.r(pz5.f.b(this), 1);
            rVar.k();
            android.content.Context context = (android.content.Context) gVar.f86611a.get();
            if (context == null) {
                rVar.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(bool));
                aVar = aVar3;
            } else {
                gVar.f86612b = false;
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 z2Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2(context, 1, 0);
                android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.e0i, (android.view.ViewGroup) null, false);
                android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.oqh);
                android.widget.TextView textView2 = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.olw);
                boolean p17 = r26.i0.p("HK", c01.e2.s(), true);
                textView.setText(context.getString(p17 ? com.p314xaae8f345.mm.R.C30867xcad56011.n6t : com.p314xaae8f345.mm.R.C30867xcad56011.n6s));
                java.util.LinkedHashMap linkedHashMap = (java.util.LinkedHashMap) gVar.f86595f;
                com.p314xaae8f345.mm.p689xc5a27af6.p772xce036727.C10697x80773040 c10697x80773040 = (com.p314xaae8f345.mm.p689xc5a27af6.p772xce036727.C10697x80773040) linkedHashMap.get(2);
                java.lang.String string = context.getString(p17 ? com.p314xaae8f345.mm.R.C30867xcad56011.n6v : com.p314xaae8f345.mm.R.C30867xcad56011.n6u);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
                com.p314xaae8f345.mm.p689xc5a27af6.p772xce036727.C10697x80773040 c10697x807730402 = (com.p314xaae8f345.mm.p689xc5a27af6.p772xce036727.C10697x80773040) linkedHashMap.get(1);
                java.lang.String string2 = context.getString(p17 ? com.p314xaae8f345.mm.R.C30867xcad56011.n6q : com.p314xaae8f345.mm.R.C30867xcad56011.n6p);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
                java.lang.String string3 = context.getString(p17 ? com.p314xaae8f345.mm.R.C30867xcad56011.n6n : com.p314xaae8f345.mm.R.C30867xcad56011.n6m, string, string2);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string3, "getString(...)");
                vh0.n1 n1Var = (vh0.n1) i95.n0.c(vh0.n1.class);
                ai0.i[] iVarArr2 = {new ai0.i(string, new ai0.e(c10697x80773040, context, n1Var, gVar), com.p314xaae8f345.mm.R.C30859x5a72f63.f560844vr, 0, 8, null), new ai0.i(string2, new ai0.f(c10697x807730402, context, n1Var, gVar), com.p314xaae8f345.mm.R.C30859x5a72f63.f560844vr, 0, 8, null)};
                android.text.Spannable newSpannable = android.text.Spannable.Factory.getInstance().newSpannable(string3);
                int i18 = 0;
                while (i18 < 2) {
                    ai0.i iVar = iVarArr2[i18];
                    int L = r26.n0.L(string3, iVar.f86601a, 0, false, 6, null);
                    if (L >= 0) {
                        iVarArr = iVarArr2;
                        str = string3;
                        aVar2 = aVar3;
                        newSpannable.setSpan(new ai0.a(context.getColor(iVar.f86603c), context.getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77630xad7ef28), false, new ai0.j(iVar)), L, iVar.f86601a.length() + L, iVar.f86604d);
                    } else {
                        iVarArr = iVarArr2;
                        aVar2 = aVar3;
                        str = string3;
                    }
                    i18++;
                    iVarArr2 = iVarArr;
                    string3 = str;
                    aVar3 = aVar2;
                }
                aVar = aVar3;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(newSpannable);
                textView2.setText(newSpannable);
                textView2.setMovementMethod(new zh0.d());
                z2Var.m(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.n6o), context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.n6l));
                z2Var.n(1);
                z2Var.o(0);
                ai0.b bVar = new ai0.b(gVar, z2Var, rVar);
                ai0.c cVar = new ai0.c(gVar, z2Var, rVar);
                z2Var.D = bVar;
                z2Var.E = cVar;
                z2Var.j(inflate);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PrivacyAgreementDialog", "gonna show dialog for " + gVar.f86592c + ", " + gVar.f86593d + ", " + gVar.f86594e);
                z2Var.w(new ai0.d(gVar));
                z2Var.l(new ai0.k(gVar, z2Var.f293587J, rVar, bool));
                z2Var.C();
                rVar.m(new ai0.l(z2Var));
            }
            j17 = rVar.j();
            pz5.a aVar4 = pz5.a.f440719d;
            pz5.a aVar5 = aVar;
            if (j17 == aVar5) {
                return aVar5;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            j17 = obj;
        }
        java.lang.Boolean bool2 = (java.lang.Boolean) j17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChatBotRoutineService", "[+] privacy tos dialog was shown, ret:" + bool2);
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(bool2, java.lang.Boolean.TRUE)) {
            v2Var = this;
            p3325xe03a0797.p3326xc267989b.l.d(v2Var.f518521m.f518391e, null, null, new vh0.u2(v2Var.f518523o, v2Var.f518518g, v2Var.f518517f, null), 3, null);
        } else {
            v2Var = this;
        }
        vh0.i1 i1Var = v2Var.f518522n;
        if (i1Var != null) {
            i1Var.mo56534x57429edc(bool2);
        }
        return jz5.f0.f384359a;
    }
}
