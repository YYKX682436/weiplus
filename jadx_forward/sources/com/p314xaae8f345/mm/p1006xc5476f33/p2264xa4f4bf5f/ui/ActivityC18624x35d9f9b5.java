package com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui;

@db5.a(m123858x6ac9171 = 4131)
@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/textstatus/ui/TextStatusCardFeedsActivity;", "Lcom/tencent/mm/plugin/secdata/ui/MMSecDataActivity;", "<init>", "()V", "com/tencent/mm/plugin/textstatus/ui/h4", "plugin-textstatus_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusCardFeedsActivity */
/* loaded from: classes11.dex */
public class ActivityC18624x35d9f9b5 extends com.p314xaae8f345.mm.p1006xc5476f33.p2050x75681b7b.ui.AbstractActivityC17353x8d7a560a {

    /* renamed from: o, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.h4 f255011o = new com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.h4(null);

    /* renamed from: p, reason: collision with root package name */
    public static final java.util.LinkedList f255012p = new java.util.LinkedList();

    /* renamed from: q, reason: collision with root package name */
    public static boolean f255013q;

    /* renamed from: r, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.C18625x63e5bcf1 f255014r;

    /* renamed from: e, reason: collision with root package name */
    public boolean f255016e;

    /* renamed from: m, reason: collision with root package name */
    public ij4.i f255021m;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f255015d = "SCENE_DEFAULT";

    /* renamed from: f, reason: collision with root package name */
    public final java.util.ArrayList f255017f = new java.util.ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f255018g = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.v4(this));

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f255019h = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.e5(this));

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f255020i = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.h5(this));

    /* renamed from: n, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.i4 f255022n = new com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.i4(this);

    /* JADX WARN: Type inference failed for: r1v1, types: [com.tencent.mm.plugin.textstatus.ui.TextStatusCardFeedsActivity$Companion$updateListener$1] */
    static {
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        f255014r = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6132xe862b402>(a0Var) { // from class: com.tencent.mm.plugin.textstatus.ui.TextStatusCardFeedsActivity$Companion$updateListener$1
            {
                this.f39173x3fe91575 = -2021918734;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6132xe862b402 c6132xe862b402) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6132xe862b402 event = c6132xe862b402;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18624x35d9f9b5.f255013q = true;
                return true;
            }
        };
    }

    public java.util.ArrayList V6(java.util.Collection preDataItemList, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(preDataItemList, "preDataItemList");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = preDataItemList.iterator();
        while (it.hasNext()) {
            arrayList.add(new jj4.b(kz5.n0.V0((java.util.Collection) it.next())));
        }
        arrayList.add(new ij4.a());
        return arrayList;
    }

    public final android.widget.ImageView W6() {
        java.lang.Object mo141623x754a37bb = ((jz5.n) this.f255018g).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        return (android.widget.ImageView) mo141623x754a37bb;
    }

    public android.graphics.drawable.Drawable X6() {
        android.graphics.drawable.Drawable i17 = i65.a.i(mo55332x76847179(), com.p314xaae8f345.mm.R.C30861xcebc809e.f562296c5);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(i17, "getDrawable(...)");
        return i17;
    }

    public final com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 Y6() {
        java.lang.Object mo141623x754a37bb = ((jz5.n) this.f255019h).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        return (com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25) mo141623x754a37bb;
    }

    public final void Z6() {
        ((com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.p2274x2e7b10.C18676x82a91782) m80391xac8f1cfd(com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.p2274x2e7b10.C18676x82a91782.class)).f255317r = false;
        com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.p2274x2e7b10.C18676x82a91782 c18676x82a91782 = (com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.p2274x2e7b10.C18676x82a91782) m80391xac8f1cfd(com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.p2274x2e7b10.C18676x82a91782.class);
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6124x1b34039a c6124x1b34039a = c18676x82a91782.B;
        if (c6124x1b34039a != null) {
            c6124x1b34039a.e();
        }
        c18676x82a91782.B = null;
        if (bi4.v1.i()) {
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6125x933f58e7 c6125x933f58e7 = c18676x82a91782.C;
            if (c6125x933f58e7 != null) {
                c6125x933f58e7.e();
            }
            c18676x82a91782.C = null;
        }
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.hxz);
        if (findViewById != null) {
            findViewById.setBackgroundColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560048x));
        }
    }

    public boolean a7() {
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f255015d, "SCENE_DEFAULT");
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void finish() {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("KEY_SCROLL_USER_NAME", ((com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.p2274x2e7b10.C18676x82a91782) m80391xac8f1cfd(com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.p2274x2e7b10.C18676x82a91782.class)).f255309g);
        intent.putExtra("VALUE_EXIT_HAS_GO_EDIT", f255013q);
        setResult(-1, intent);
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6125x933f58e7 c6125x933f58e7 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6125x933f58e7();
        c6125x933f58e7.f136398g.f89759a = ((com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.p2274x2e7b10.C18676x82a91782) pf5.z.f435481a.a(this).a(com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.p2274x2e7b10.C18676x82a91782.class)).f255310h;
        c6125x933f58e7.e();
        if (((com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.p2274x2e7b10.C18676x82a91782) m80391xac8f1cfd(com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.p2274x2e7b10.C18676x82a91782.class)).S6()) {
            if (!(bi4.v1.i() && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f255015d, "SCENE_HISTORY_FEED"))) {
                java.lang.Object mo141623x754a37bb = ((jz5.n) this.f255020i).mo141623x754a37bb();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
                android.view.View view = (android.view.View) mo141623x754a37bb;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/textstatus/ui/TextStatusCardFeedsActivity", "finish", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/textstatus/ui/TextStatusCardFeedsActivity", "finish", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                java.lang.String stringExtra = getIntent().getStringExtra("KEY_EXIT_CARD_ANIM_STYLE");
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(stringExtra, "VALUE_EXIT_CARD_ANIM_AVATAR_STYLE")) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.j4 j4Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.j4(this);
                    W6().setVisibility(0);
                    ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.z) i95.n0.c(kv.z.class))).Ri(W6(), getIntent().getStringExtra("KEY_USER_NAME"), 0.0f);
                    int intExtra = getIntent().getIntExtra("KEY_START_CARD_ANIM_X_OFFSET", -1);
                    int intExtra2 = getIntent().getIntExtra("KEY_START_CARD_ANIM_Y_OFFSET", -1);
                    if (intExtra == -1 || intExtra2 == -1) {
                        return;
                    }
                    android.view.View m78513xc2a54588 = m78513xc2a54588();
                    if (m78513xc2a54588 != null) {
                        m78513xc2a54588.setClipToOutline(true);
                    }
                    m78513xc2a54588.setTranslationX(0.0f);
                    m78513xc2a54588.setTranslationY(0.0f);
                    W6().setAlpha(0.0f);
                    int h17 = i65.a.h(this, com.p314xaae8f345.mm.R.C30860x5b28f31.f561251db);
                    int h18 = i65.a.h(this, com.p314xaae8f345.mm.R.C30860x5b28f31.f561251db);
                    m78513xc2a54588.setPivotX(0.0f);
                    m78513xc2a54588.setPivotY(0.0f);
                    android.view.ViewPropertyAnimator translationY = m78513xc2a54588.animate().translationX(intExtra).translationY(intExtra2);
                    translationY.setDuration(200L);
                    translationY.start();
                    translationY.setUpdateListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.q4(m78513xc2a54588, h18, h18, this, h17));
                    translationY.setListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.r4(j4Var));
                    return;
                }
                if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(stringExtra, "VALUE_EXIT_CARD_ANIM_CARD_STYLE")) {
                    super.finish();
                    overridePendingTransition(com.p314xaae8f345.mm.R.C30854x2dc211.f559261p, com.p314xaae8f345.mm.R.C30854x2dc211.f559388dd);
                    return;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.k4 k4Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.k4(this);
                int intExtra3 = getIntent().getIntExtra("KEY_START_CARD_ANIM_X_OFFSET", -1);
                int intExtra4 = getIntent().getIntExtra("KEY_START_CARD_ANIM_Y_OFFSET", -1);
                if (intExtra3 == -1 || intExtra4 == -1) {
                    return;
                }
                android.view.View m78513xc2a545882 = m78513xc2a54588();
                if (m78513xc2a545882 != null) {
                    m78513xc2a545882.setClipToOutline(true);
                }
                m78513xc2a545882.setTranslationX(0.0f);
                m78513xc2a545882.setTranslationY(0.0f);
                W6().setAlpha(0.0f);
                int h19 = i65.a.h(this, com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv);
                int h27 = i65.a.h(this, com.p314xaae8f345.mm.R.C30860x5b28f31.f561208cc);
                int h28 = i65.a.h(this, com.p314xaae8f345.mm.R.C30860x5b28f31.f561215ak4);
                m78513xc2a545882.setPivotX(0.0f);
                m78513xc2a545882.setPivotY(0.0f);
                android.view.ViewPropertyAnimator translationY2 = m78513xc2a545882.animate().translationX(intExtra3).translationY(intExtra4);
                translationY2.setDuration(200L);
                translationY2.start();
                translationY2.setUpdateListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.t4(m78513xc2a545882, h27, h28, h19));
                translationY2.setListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.u4(k4Var));
                return;
            }
        }
        super.finish();
        overridePendingTransition(com.p314xaae8f345.mm.R.C30854x2dc211.f559261p, com.p314xaae8f345.mm.R.C30854x2dc211.f559388dd);
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getCustomBounceId */
    public int mo56571xc86d394a() {
        return com.p314xaae8f345.mm.R.id.m8u;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.cym;
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(android.content.res.Configuration newConfig) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        try {
            int i17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.p2274x2e7b10.C18676x82a91782) m80391xac8f1cfd(com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.p2274x2e7b10.C18676x82a91782.class)).f255314o;
            com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ac acVar = (com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ac) m80391xac8f1cfd(com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ac.class);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.LinkedList linkedList = f255012p;
            synchronized (linkedList) {
                java.util.Iterator it = linkedList.iterator();
                while (it.hasNext()) {
                    arrayList.add(new jj4.b((java.util.LinkedList) it.next()));
                }
            }
            arrayList.add(new ij4.a());
            acVar.f255261f = new com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf(new com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.C18626xd68b9dbf(this, this.f255015d, a7()), arrayList, false);
            Y6().mo7960x6cab2c8d(acVar.f255261f);
            com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 Y6 = Y6();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList2.add(java.lang.Integer.valueOf(i17));
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(Y6, arrayList2.toArray(), "com/tencent/mm/plugin/textstatus/ui/TextStatusCardFeedsActivity", "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "Undefined", "scrollToPosition", "(I)V");
            Y6.a1(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(Y6, "com/tencent/mm/plugin/textstatus/ui/TextStatusCardFeedsActivity", "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "Undefined", "scrollToPosition", "(I)V");
            Y6().post(new com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.w4(this));
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.TextStatus.TextStatusCardFeedsActivity", th6, "onConfigurationChanged err", new java.lang.Object[0]);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        pj4.p0 p0Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.C18625x63e5bcf1 c18625x63e5bcf1;
        java.lang.Object obj;
        boolean z17 = !(this instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18665x5ffcff27);
        if (z17) {
            o25.n1.f(this);
        }
        super.onCreate(bundle);
        mo64405x4dab7448(0);
        java.lang.String stringExtra = getIntent().getStringExtra("KEY_FROM_SCENE");
        if (stringExtra == null) {
            stringExtra = "SCENE_DEFAULT";
        }
        this.f255015d = stringExtra;
        if (z17) {
            getWindow().getDecorView().setSystemUiVisibility(1792);
            vj5.o.e(getWindow());
            mo78578x8b18f126(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a9e));
        }
        mo54450xbf7c1df6("");
        mo78530x8b45058f();
        mo78529xe76c1b79();
        p012xc85e97e9.p016x746ad0e3.app.b mo2533x106ab264 = mo2533x106ab264();
        if (mo2533x106ab264 != null) {
            mo2533x106ab264.o();
        }
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.x4(this));
        java.lang.String stringExtra2 = getIntent().getStringExtra("KEY_USER_NAME");
        int intExtra = getIntent().getIntExtra("KEY_SCROLL_INDEX", -1);
        java.lang.String stringExtra3 = getIntent().getStringExtra("KEY_SCROLL_STATUS_ID");
        java.lang.String str = stringExtra3 != null ? stringExtra3 : "";
        java.lang.String stringExtra4 = getIntent().getStringExtra("KEY_FROM_SCENE");
        if (stringExtra4 == null) {
            stringExtra4 = "SCENE_DEFAULT";
        }
        this.f255015d = stringExtra4;
        pf5.z zVar = pf5.z.f435481a;
        p012xc85e97e9.p093xedfae76a.c1 a17 = zVar.a(this).a(com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ac.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ac acVar = (com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ac) a17;
        java.util.LinkedList linkedList = f255012p;
        java.util.ArrayList V6 = V6(linkedList, stringExtra2);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(V6, "<set-?>");
        acVar.f255263h = V6;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.TextStatusCardFeedsActivity", "onCreate scene=" + this.f255015d + ", scrollIndex=" + intExtra + " size:" + V6.size());
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f255015d, "SCENE_DEFAULT") || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f255015d, "SCENE_HISTORY_FEED")) {
            bk4.d1.f102986b = false;
            bk4.d1.f102987c = ((rk4.y4) ((qk.s8) i95.n0.c(qk.s8.class))).wi();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatusMusicFloatBallUtil", "initShowTingFloatBall show: " + bk4.d1.f102987c);
            gp1.v Bi = ((ov.i0) ((pv.d0) i95.n0.c(pv.d0.class))).Bi();
            if (Bi != null) {
                Bi.a0(64, bk4.d1.f102988d);
            }
        }
        Y6().setBackground(X6());
        Y6().mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(this, 1, false));
        java.lang.Object m78511x9f88d943 = m78511x9f88d943();
        if (m78511x9f88d943 != null) {
            ((com.p314xaae8f345.mm.ui.p2747xd1075a44.p2765x5e292867.C22717x128919c4) m78511x9f88d943).c(new com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.y4(this));
        }
        acVar.f255261f = new com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf(new com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.C18626xd68b9dbf(this, this.f255015d, a7()), V6, false);
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f255015d, "SCENE_HISTORY_FEED")) {
            Y6().i(new com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.z4(this));
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = mo55332x76847179();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo55332x76847179, "getContext(...)");
            ((com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ac) zVar.a(mo55332x76847179).a(com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ac.class)).O6(false);
        }
        if (str.length() > 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.TextStatusCardFeedsActivity", "onCreate: dataSize=" + acVar.f255263h.size() + ", scrollStatusId=" + str);
            java.util.Iterator it = acVar.f255263h.iterator();
            int i17 = 0;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                int i18 = i17 + 1;
                in5.c cVar = (in5.c) it.next();
                if (cVar instanceof jj4.b) {
                    java.util.Iterator it6 = ((jj4.b) cVar).f381562d.iterator();
                    while (true) {
                        if (it6.hasNext()) {
                            obj = it6.next();
                            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((mj4.k) ((mj4.h) obj)).l(), str)) {
                                break;
                            }
                        } else {
                            obj = null;
                            break;
                        }
                    }
                    if (obj != null) {
                        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 Y6 = Y6();
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                        arrayList.add(java.lang.Integer.valueOf(i17));
                        java.util.Collections.reverse(arrayList);
                        yj0.a.d(Y6, arrayList.toArray(), "com/tencent/mm/plugin/textstatus/ui/TextStatusCardFeedsActivity", "onCreate", "(Landroid/os/Bundle;)V", "Undefined", "scrollToPosition", "(I)V");
                        Y6.a1(((java.lang.Integer) arrayList.get(0)).intValue());
                        yj0.a.f(Y6, "com/tencent/mm/plugin/textstatus/ui/TextStatusCardFeedsActivity", "onCreate", "(Landroid/os/Bundle;)V", "Undefined", "scrollToPosition", "(I)V");
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.TextStatusCardFeedsActivity", "scrollToPosition: " + i17);
                        break;
                    }
                }
                i17 = i18;
            }
        } else if (intExtra != -1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.TextStatusCardFeedsActivity", "scrollToPosition: index=" + intExtra);
            com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 Y62 = Y6();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(java.lang.Integer.valueOf(intExtra));
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(Y62, arrayList2.toArray(), "com/tencent/mm/plugin/textstatus/ui/TextStatusCardFeedsActivity", "onCreate", "(Landroid/os/Bundle;)V", "Undefined", "scrollToPosition", "(I)V");
            Y62.a1(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(Y62, "com/tencent/mm/plugin/textstatus/ui/TextStatusCardFeedsActivity", "onCreate", "(Landroid/os/Bundle;)V", "Undefined", "scrollToPosition", "(I)V");
        } else {
            int i19 = 0;
            for (java.lang.Object obj2 : V6) {
                int i27 = i19 + 1;
                if (i19 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                in5.c cVar2 = (in5.c) obj2;
                if (cVar2 instanceof jj4.b) {
                    mj4.h hVar = (mj4.h) kz5.n0.a0(((jj4.b) cVar2).f381562d, 0);
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(hVar != null ? ((mj4.k) hVar).o() : null, stringExtra2)) {
                        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 Y63 = Y6();
                        java.util.ArrayList arrayList3 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
                        arrayList3.add(java.lang.Integer.valueOf(i19));
                        java.util.Collections.reverse(arrayList3);
                        yj0.a.d(Y63, arrayList3.toArray(), "com/tencent/mm/plugin/textstatus/ui/TextStatusCardFeedsActivity", "onCreate", "(Landroid/os/Bundle;)V", "Undefined", "scrollToPosition", "(I)V");
                        Y63.a1(((java.lang.Integer) arrayList3.get(0)).intValue());
                        yj0.a.f(Y63, "com/tencent/mm/plugin/textstatus/ui/TextStatusCardFeedsActivity", "onCreate", "(Landroid/os/Bundle;)V", "Undefined", "scrollToPosition", "(I)V");
                    }
                }
                i19 = i27;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.TextStatusCardFeedsActivity", "prepareStart: dataSize=" + acVar.f255260e.size() + " => itemsSnapShot size=" + linkedList.size());
        }
        ij4.i iVar = new ij4.i(false, 1, null);
        iVar.b(Y6());
        iVar.f412359n = new com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.a5(this);
        iVar.f412360o = new com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.b5();
        iVar.f412361p = new com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.c5();
        Y6().post(new com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.d5(iVar));
        iVar.f412354i = 20.0f;
        this.f255021m = iVar;
        Y6().mo7960x6cab2c8d(acVar.f255261f);
        ((md0.e) ((nd0.e) i95.n0.c(nd0.e.class))).Zi(this, new o04.e(pj4.p0.class, 9, true));
        pj4.p0 p0Var2 = (pj4.p0) ((md0.e) ((nd0.e) i95.n0.c(nd0.e.class))).Ui(this, 9, pj4.p0.class);
        if (p0Var2 != null) {
            try {
                p0Var = (pj4.p0) ((q04.r) ((xs.j1) i95.n0.c(xs.j1.class))).wi(9, "TextStatusCardExposed");
            } catch (java.lang.Throwable unused) {
                p0Var = null;
            }
            p0Var2.f436769d = p0Var != null ? p0Var.f436769d : null;
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f255015d, "SCENE_DEFAULT")) {
            ((uj4.m) m80391xac8f1cfd(uj4.m.class)).P6((android.view.ViewGroup) findViewById(com.p314xaae8f345.mm.R.id.hxz), stringExtra2);
        }
        if (((com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.p2274x2e7b10.C18676x82a91782) m80391xac8f1cfd(com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.p2274x2e7b10.C18676x82a91782.class)).S6()) {
            m78513xc2a54588().setScaleX(0.0f);
            m78513xc2a54588().setScaleY(0.0f);
        } else {
            m78513xc2a54588().postDelayed(new com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.l4(this), 300L);
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.p2274x2e7b10.C18676x82a91782) m80391xac8f1cfd(com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.p2274x2e7b10.C18676x82a91782.class)).f255317r = true;
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ak(this, iy1.c.TextStatusCardFeedsActivity);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).dk(this, getClass().getSimpleName());
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Rj(this, iy1.a.TextState);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ik(this, 4, 28809);
        java.util.ArrayList arrayList4 = this.f255017f;
        arrayList4.clear();
        java.util.ArrayList<java.lang.String> stringArrayListExtra = getIntent().getStringArrayListExtra("KEY_LIKE_LIST_STATUS_ID");
        if (stringArrayListExtra != null && stringArrayListExtra.size() != 0) {
            arrayList4.addAll(stringArrayListExtra);
        }
        if (!bi4.v1.i() || (c18625x63e5bcf1 = f255014r) == null) {
            return;
        }
        c18625x63e5bcf1.mo48813x58998cd();
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.C18625x63e5bcf1 c18625x63e5bcf1;
        super.onDestroy();
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f255015d, "SCENE_DEFAULT") || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f255015d, "SCENE_HISTORY_FEED")) {
            bk4.d1 d1Var = bk4.d1.f102985a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatusMusicFloatBallUtil", "markShouldShowTingFloatBall show: true");
            bk4.d1.f102986b = true;
            if (((rk4.z8) ((qk.g9) i95.n0.c(qk.g9.class))).fj()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.TextStatusCardFeedsActivity", "onDestroy current task is playing");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatusMusicFloatBallUtil", "setTingFloatBallState show: true");
                bk4.d1.f102987c = true;
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.TextStatusCardFeedsActivity", "onDestroy current task is not playing");
            }
            d1Var.a(true);
            gp1.v Bi = ((ov.i0) ((pv.d0) i95.n0.c(pv.d0.class))).Bi();
            if (Bi != null) {
                Bi.L(64, bk4.d1.f102988d);
            }
        }
        if (!bi4.v1.i() || (c18625x63e5bcf1 = f255014r) == null) {
            return;
        }
        c18625x63e5bcf1.mo48814x2efc64();
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        setRequestedOrientation(1);
        super.onResume();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2050x75681b7b.ui.AbstractActivityC17353x8d7a560a, com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8
    /* renamed from: superImportUIComponents */
    public void mo43518x5e67c7ca(java.util.HashSet set) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(set, "set");
        super.mo43518x5e67c7ca(set);
        set.add(com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ac.class);
        set.add(com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.p2274x2e7b10.C18676x82a91782.class);
        set.add(qj4.i.class);
        set.add(uj4.m.class);
    }
}
