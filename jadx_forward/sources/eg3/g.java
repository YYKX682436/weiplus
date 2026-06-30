package eg3;

/* loaded from: classes3.dex */
public class g extends mf3.e implements eg3.b {

    /* renamed from: o, reason: collision with root package name */
    public final mf3.p f334193o;

    /* renamed from: p, reason: collision with root package name */
    public em.q1 f334194p;

    /* renamed from: q, reason: collision with root package name */
    public android.animation.ValueAnimator f334195q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(mf3.p apiCenter) {
        super(apiCenter, null, 2, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(apiCenter, "apiCenter");
        this.f334193o = apiCenter;
    }

    @Override // mf3.e, mf3.n
    public mf3.p G() {
        return this.f334193o;
    }

    @Override // mf3.e
    public android.view.View J(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.ejo, (android.view.ViewGroup) null);
        this.f334194p = new em.q1(inflate);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
        return (android.view.ViewGroup) inflate;
    }

    public final void S() {
        android.animation.ValueAnimator valueAnimator = this.f334195q;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        android.view.View M = M();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(M, arrayList.toArray(), "com/tencent/mm/plugin/media/menu/translate/LangTranslateLayer", "stopAndHide", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        M.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(M, "com/tencent/mm/plugin/media/menu/translate/LangTranslateLayer", "stopAndHide", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public void T() {
        mf3.k kVar;
        mf3.s sVar = this.f407643m;
        if (sVar == null || (kVar = sVar.f407650a) == null) {
            return;
        }
        eg3.i c17 = kVar.c();
        if (c17 == null) {
            P("no valid translate param", new java.lang.Object[0]);
            return;
        }
        eg3.a aVar = (eg3.a) H(eg3.a.class);
        if (aVar != null) {
            eg3.f fVar = new eg3.f(this);
            com.p314xaae8f345.mm.ui.p2717x62f6fe4.p2718x2e06d1.p2719x5faa95b.C22448xb8f34d53 c22448xb8f34d53 = (com.p314xaae8f345.mm.ui.p2717x62f6fe4.p2718x2e06d1.p2719x5faa95b.C22448xb8f34d53) aVar;
            c22448xb8f34d53.f290667e = (int) (c01.z1.r().hashCode() + java.lang.System.currentTimeMillis());
            java.lang.String str = c17.f334196a;
            c22448xb8f34d53.f290668f = str;
            c22448xb8f34d53.f290666d = fVar;
            if ((gm0.j1.d().n() == 6 || gm0.j1.d().n() == 4) ? false : true) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MediaGallery.DefaultTranslateDataComponent", "network is not active");
                eg3.h hVar = c22448xb8f34d53.f290666d;
                if (hVar != null) {
                    eg3.g gVar = ((eg3.f) hVar).f334192a;
                    gVar.S();
                    db5.e1.s(gVar.K(), gVar.K().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572033wu), "");
                    return;
                }
                return;
            }
            eg3.h hVar2 = c22448xb8f34d53.f290666d;
            if (hVar2 != null) {
                eg3.g gVar2 = ((eg3.f) hVar2).f334192a;
                android.view.View M = gVar2.M();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(M, arrayList.toArray(), "com/tencent/mm/plugin/media/menu/translate/LangTranslateLayer", "onTranslationStartInternal", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                M.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(M, "com/tencent/mm/plugin/media/menu/translate/LangTranslateLayer", "onTranslationStartInternal", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                em.q1 q1Var = gVar2.f334194p;
                if (q1Var == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootVB");
                    throw null;
                }
                if (q1Var.f336252c == null) {
                    q1Var.f336252c = (android.widget.ImageView) q1Var.f336250a.findViewById(com.p314xaae8f345.mm.R.id.ma_);
                }
                android.widget.ImageView imageView = q1Var.f336252c;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(imageView, "getScanTranslateLine(...)");
                int k17 = i65.a.k(gVar2.K());
                android.animation.ValueAnimator valueAnimator = gVar2.f334195q;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.setDuration(5000L);
                ofFloat.addListener(new eg3.d(imageView));
                ofFloat.addUpdateListener(new eg3.e(imageView, k17));
                ofFloat.setRepeatMode(1);
                ofFloat.setRepeatCount(-1);
                ofFloat.start();
                gVar2.f334195q = ofFloat;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MediaGallery.DefaultTranslateDataComponent", "start scan impl");
            dm.aa bj6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.q0) ((com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.z) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.z.class))).bj(str);
            java.lang.String c18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.c(c22448xb8f34d53.m158354x19263085());
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getActualTranslateLanguageIso(...)");
            if (bj6 == null || !android.text.TextUtils.equals(bj6.f65919x12058dee, c18) || !com.p314xaae8f345.mm.vfs.w6.j(bj6.f65916x970b0f9e)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MediaGallery.DefaultTranslateDataComponent", "try to translate img %s, sessionId %d", str, java.lang.Integer.valueOf(c22448xb8f34d53.f290667e));
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5973x2e8f3b26 c5973x2e8f3b26 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5973x2e8f3b26();
                am.bt btVar = c5973x2e8f3b26.f136271g;
                btVar.f87815a = 2;
                btVar.f87817c = str;
                btVar.f87816b = c22448xb8f34d53.f290667e;
                c22448xb8f34d53.f290668f = str;
                c5973x2e8f3b26.e();
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MediaGallery.DefaultTranslateDataComponent", "result already exist: raw: " + str + " translated: " + bj6.f65916x970b0f9e + ", sessionId " + c22448xb8f34d53.f290667e);
            java.util.Map map = c22448xb8f34d53.f290669g;
            java.lang.String field_resultFile = bj6.f65916x970b0f9e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_resultFile, "field_resultFile");
            ((java.util.HashMap) map).put(str, field_resultFile);
            eg3.h hVar3 = c22448xb8f34d53.f290666d;
            if (hVar3 != null) {
                java.lang.String field_resultFile2 = bj6.f65916x970b0f9e;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_resultFile2, "field_resultFile");
                ((eg3.f) hVar3).a(field_resultFile2);
            }
        }
    }

    @Override // mf3.e, mf3.l
    public void i() {
        this.f407644n = false;
    }

    @Override // mf3.e, mf3.l
    public void u(android.view.View parentView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parentView, "parentView");
        super.u(parentView);
        em.q1 q1Var = this.f334194p;
        if (q1Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootVB");
            throw null;
        }
        if (q1Var.f336253d == null) {
            q1Var.f336253d = (android.widget.ImageView) q1Var.f336250a.findViewById(com.p314xaae8f345.mm.R.id.ma7);
        }
        q1Var.f336253d.setOnClickListener(new eg3.c(this));
        em.q1 q1Var2 = this.f334194p;
        if (q1Var2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootVB");
            throw null;
        }
        if (q1Var2.f336251b == null) {
            q1Var2.f336251b = (android.widget.FrameLayout) q1Var2.f336250a.findViewById(com.p314xaae8f345.mm.R.id.m_d);
        }
        android.widget.FrameLayout frameLayout = q1Var2.f336251b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(frameLayout, "getScanContainer(...)");
        android.content.Context context = frameLayout.getContext();
        int e17 = com.p314xaae8f345.mm.ui.bl.e(context);
        int f17 = i65.a.f(context, com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv);
        i65.a.f(context, com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn);
        i65.a.f(context, com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn);
        i65.a.f(context, com.p314xaae8f345.mm.R.C30860x5b28f31.f561205c9);
        i65.a.f(context, com.p314xaae8f345.mm.R.C30860x5b28f31.f561226cs);
        int i17 = (f17 * 2) + e17;
        int i18 = com.p314xaae8f345.mm.ui.bl.i(context, 0);
        android.view.ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams == null) {
            marginLayoutParams = new android.view.ViewGroup.MarginLayoutParams(-1, -1);
        }
        marginLayoutParams.leftMargin = 0;
        marginLayoutParams.rightMargin = 0;
        marginLayoutParams.topMargin = i18;
        marginLayoutParams.bottomMargin = i17;
        frameLayout.setLayoutParams(marginLayoutParams);
    }
}
