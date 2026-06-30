package k14;

/* loaded from: classes7.dex */
public final class c extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f384840d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f384841e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 f384842f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f384843g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ wd0.b f384844h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112, java.lang.String str, wd0.b bVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f384841e = u3Var;
        this.f384842f = activityC0065xcd7aa112;
        this.f384843g = str;
        this.f384844h = bVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new k14.c(this.f384841e, this.f384842f, this.f384843g, this.f384844h, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((k14.c) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.lang.Object obj2;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f384840d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            this.f384841e.dismiss();
            this.f384840d = 1;
            p3325xe03a0797.p3326xc267989b.r rVar = new p3325xe03a0797.p3326xc267989b.r(pz5.f.b(this), 1);
            rVar.k();
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112 = this.f384842f;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.o3 o3Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.o3(activityC0065xcd7aa112);
            android.view.View inflate = android.view.LayoutInflater.from(activityC0065xcd7aa112).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f569685dz5, (android.view.ViewGroup) null);
            wd0.b bVar = this.f384844h;
            yz5.l lVar = bVar.f526226e;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) inflate.findViewById(com.p314xaae8f345.mm.R.id.a9m);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c22699x3dcdb352, "getAvatar(...)");
            lVar.mo146xb9724478(c22699x3dcdb352);
            android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.k3f);
            textView.setText(bVar.f526223b);
            if (textView == null) {
                textView = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.k3f);
            }
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(textView, "getName(...)");
            com.p314xaae8f345.mm.ui.fk.b(textView);
            ((android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.f565583cu2)).setText(bVar.f526225d);
            android.widget.TextView textView2 = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.obc);
            textView2.setText(bVar.f526224c);
            if (textView2 == null) {
                textView2 = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.obc);
            }
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(textView2, "getTitle(...)");
            com.p314xaae8f345.mm.ui.fk.b(textView2);
            android.widget.TextView textView3 = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.upx);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(textView3, "getPhoneNum(...)");
            com.p314xaae8f345.mm.ui.fk.b(textView3);
            if (textView3 == null) {
                textView3 = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.upx);
            }
            java.lang.String str = this.f384843g;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str, "<this>");
            try {
                p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                obj2 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(r26.n0.b0(str, 3, 7, "****").toString());
            } catch (java.lang.Throwable th6) {
                p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                obj2 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
            }
            java.lang.String str2 = (java.lang.String) (p3321xbce91901.C29043x91b2b43d.m143902xc481aacd(obj2) ? null : obj2);
            if (str2 != null) {
                str = str2;
            }
            textView3.setText(str);
            android.widget.TextView textView4 = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.ume);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(textView4, "getNotAllowedTips(...)");
            com.p314xaae8f345.mm.ui.fk.b(textView4);
            android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) inflate.findViewById(com.p314xaae8f345.mm.R.id.upy);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(linearLayout, "getPhoneNumLayout(...)");
            if (textView4 == null) {
                textView4 = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.ume);
            }
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(textView4, "getNotAllowedTips(...)");
            o3Var.f293472b.f293340d = inflate;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 a17 = o3Var.a();
            a17.f293591g.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.b8m);
            linearLayout.setOnClickListener(new k14.e(rVar, a17));
            textView4.setOnClickListener(new k14.f(rVar, a17));
            a17.C();
            obj = rVar.j();
            pz5.a aVar2 = pz5.a.f440719d;
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        return obj;
    }
}
