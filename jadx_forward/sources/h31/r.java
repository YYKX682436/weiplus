package h31;

/* loaded from: classes9.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.ref.WeakReference f359960a;

    /* renamed from: b, reason: collision with root package name */
    public int f359961b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f359962c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f359963d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f359964e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f359965f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f359966g;

    /* renamed from: h, reason: collision with root package name */
    public h31.a f359967h;

    /* renamed from: i, reason: collision with root package name */
    public java.util.ArrayList f359968i;

    /* renamed from: j, reason: collision with root package name */
    public final java.util.ArrayList f359969j;

    /* renamed from: k, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 f359970k;

    /* renamed from: l, reason: collision with root package name */
    public m31.p1 f359971l;

    /* renamed from: m, reason: collision with root package name */
    public fl1.c0 f359972m;

    /* renamed from: n, reason: collision with root package name */
    public final e31.k f359973n;

    /* renamed from: o, reason: collision with root package name */
    public long f359974o;

    /* renamed from: p, reason: collision with root package name */
    public byte[] f359975p;

    /* renamed from: q, reason: collision with root package name */
    public com.p314xaae8f345.mm.p965xc41bc71e.C11157x9b46987e f359976q;

    /* renamed from: r, reason: collision with root package name */
    public int f359977r;

    /* renamed from: s, reason: collision with root package name */
    public final j31.b f359978s;

    public r(java.lang.ref.WeakReference weakReference, int i17, java.lang.String bizUsername, java.lang.String bizAppId, java.lang.String subscribeUrl, java.lang.String content, java.lang.String extInfo, h31.a aVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bizUsername, "bizUsername");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bizAppId, "bizAppId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(subscribeUrl, "subscribeUrl");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(content, "content");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(extInfo, "extInfo");
        this.f359960a = weakReference;
        this.f359961b = i17;
        this.f359962c = bizUsername;
        this.f359963d = bizAppId;
        this.f359964e = subscribeUrl;
        this.f359965f = content;
        this.f359966g = extInfo;
        this.f359967h = aVar;
        this.f359969j = new java.util.ArrayList();
        this.f359973n = e31.n.f328620a.a("name_biz");
        this.f359974o = -1L;
        this.f359975p = new byte[]{0};
        this.f359978s = new j31.b();
    }

    public final void a(android.content.Context context, int i17, com.p314xaae8f345.mm.p965xc41bc71e.C11158xe7d16ed5 c11158xe7d16ed5) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.ref.WeakReference weakReference;
        android.content.Context context2;
        java.lang.String str5;
        java.lang.String str6;
        java.lang.String str7;
        java.lang.String str8;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var;
        com.p314xaae8f345.mm.p965xc41bc71e.C11156xefa3516b c11156xefa3516b = c11158xe7d16ed5.f153327t;
        int i18 = c11156xefa3516b != null ? c11156xefa3516b.f153303d : -1;
        h31.a aVar = this.f359967h;
        if (aVar != null && (u3Var = ((m31.y1) aVar).f404773a.f153409e) != null) {
            u3Var.dismiss();
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis() / 1000;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i18);
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(i17);
        int i19 = c11158xe7d16ed5.f153330w;
        java.lang.Integer valueOf3 = java.lang.Integer.valueOf(i19);
        java.lang.String str9 = c11158xe7d16ed5.f153331x;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BrandSubscribeMsgRequestController", "dispatchSuccessResult showType: %s, action: %d, errCode: %d, errMsg: %s", valueOf, valueOf2, valueOf3, str9);
        h31.s sVar = h31.s.f359979a;
        boolean z17 = i17 == 3 || i17 == 1;
        com.p314xaae8f345.mm.p965xc41bc71e.C11156xefa3516b c11156xefa3516b2 = c11158xe7d16ed5.f153327t;
        if (!z17) {
            if (i17 == 2) {
                if (i18 == 1) {
                    b(2, currentTimeMillis);
                    if (c11156xefa3516b2 == null || (str = c11156xefa3516b2.f153304e) == null) {
                        str = "";
                    }
                    if (c11156xefa3516b2 == null || (str2 = c11156xefa3516b2.f153305f) == null) {
                        str2 = "";
                    }
                    d(context, str, str2, new h31.h(c11158xe7d16ed5, this, i17));
                    return;
                }
                if (i18 == 2) {
                    b(3, currentTimeMillis);
                    if (c11156xefa3516b2 == null || (str3 = c11156xefa3516b2.f153305f) == null) {
                        str3 = "";
                    }
                    e(str3, new h31.i(c11158xe7d16ed5, this, i17));
                    return;
                }
                if (i18 == 4) {
                    b(5, currentTimeMillis);
                    if (c11156xefa3516b2 == null || (str4 = c11156xefa3516b2.f153305f) == null) {
                        str4 = "";
                    }
                    h31.g gVar = new h31.g(c11158xe7d16ed5, this, i17);
                    if ((str4.length() > 0) && (weakReference = this.f359960a) != null && (context2 = (android.content.Context) weakReference.get()) != null) {
                        db5.t7.h(context2, str4);
                    }
                    gVar.mo152xb9724478();
                    return;
                }
                b(i18 != 0 ? i18 != 3 ? -1 : 4 : 1, currentTimeMillis);
                if (i19 == 0) {
                    h31.a aVar2 = this.f359967h;
                    if (aVar2 != null) {
                        ((m31.y1) aVar2).c(c11158xe7d16ed5);
                        return;
                    }
                    return;
                }
                h31.a aVar3 = this.f359967h;
                if (aVar3 != null) {
                    ((m31.y1) aVar3).a(i17, i19, str9);
                    return;
                }
                return;
            }
            return;
        }
        if (i18 != 0) {
            if (i18 == 1) {
                b(2, currentTimeMillis);
                if (c11156xefa3516b2 == null || (str5 = c11156xefa3516b2.f153304e) == null) {
                    str5 = "";
                }
                if (c11156xefa3516b2 == null || (str6 = c11156xefa3516b2.f153305f) == null) {
                    str6 = "";
                }
                d(context, str5, str6, new h31.b(c11158xe7d16ed5, this, i17));
                return;
            }
            if (i18 == 2) {
                b(3, currentTimeMillis);
                if (c11156xefa3516b2 == null || (str7 = c11156xefa3516b2.f153305f) == null) {
                    str7 = "";
                }
                e(str7, new h31.c(c11158xe7d16ed5, this, i17));
                return;
            }
            if (i18 == 3) {
                b(4, currentTimeMillis);
                h31.e eVar = new h31.e(c11158xe7d16ed5, this, i17);
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 C = db5.e1.C(context, c11156xefa3516b2 != null ? c11156xefa3516b2.f153305f : null, c11156xefa3516b2 != null ? c11156xefa3516b2.f153304e : null, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.jnd), context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg), false, new h31.l(this, eVar, context, c11158xe7d16ed5), new h31.m(eVar));
                this.f359970k = C;
                if (C != null) {
                    C.setCanceledOnTouchOutside(false);
                    return;
                }
                return;
            }
            if (i18 != 4) {
                b(-1, currentTimeMillis);
                java.lang.String string = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.jnf);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
                e(string, new h31.f(c11158xe7d16ed5, this, i17));
                return;
            }
            b(5, currentTimeMillis);
            if (c11156xefa3516b2 == null || (str8 = c11156xefa3516b2.f153305f) == null) {
                str8 = "";
            }
            e(str8, new h31.d(c11158xe7d16ed5, this, i17));
            return;
        }
        if (i19 != 0) {
            h31.a aVar4 = this.f359967h;
            if (aVar4 != null) {
                ((m31.y1) aVar4).a(i17, i19, str9);
                return;
            }
            return;
        }
        b(1, currentTimeMillis);
        java.util.ArrayList<com.p314xaae8f345.mm.p965xc41bc71e.C11159x8f55e6d3> arrayList = c11158xe7d16ed5.f153318h;
        if (arrayList.isEmpty()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.BrandSubscribeMsgRequestController", "showSubscribeRequestDialog list is empty and not show dialog");
            h31.a aVar5 = this.f359967h;
            if (aVar5 != null) {
                ((m31.y1) aVar5).a(this.f359961b, 10002, "template list empty");
            }
            r9 = false;
        } else {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (com.p314xaae8f345.mm.p965xc41bc71e.C11159x8f55e6d3 c11159x8f55e6d3 : arrayList) {
                arrayList2.add(new m31.q0(c11159x8f55e6d3.f153338h == 1, c11159x8f55e6d3.f153335e, c11159x8f55e6d3.f153339i, c11159x8f55e6d3.f153336f, c11159x8f55e6d3.f153337g));
                j31.b bVar = this.f359978s;
                bVar.f378899d.add(c11159x8f55e6d3.f153336f);
                bVar.f378900e.add(java.lang.Integer.valueOf(c11159x8f55e6d3.f153338h == 0 ? 0 : 1));
            }
            com.p314xaae8f345.mm.p965xc41bc71e.C11159x8f55e6d3 c11159x8f55e6d32 = (com.p314xaae8f345.mm.p965xc41bc71e.C11159x8f55e6d3) kz5.n0.Z(arrayList);
            int i27 = c11159x8f55e6d32 != null ? c11159x8f55e6d32.f153337g : 2;
            int size = arrayList2.size();
            int i28 = c11158xe7d16ed5.f153326s;
            boolean z18 = size == 1 && i28 == 1;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BrandSubscribeMsgRequestController", "showSubscribeRequestDialog size: %d, showStyle: %d, singleMode: %b, templateType: %d", java.lang.Integer.valueOf(arrayList2.size()), java.lang.Integer.valueOf(i28), java.lang.Boolean.valueOf(z18), java.lang.Integer.valueOf(i27));
            h31.n nVar = new h31.n(context, arrayList2, z18, new h31.o(this, c11158xe7d16ed5));
            this.f359971l = nVar;
            nVar.W = new h31.p(this);
            java.lang.String str10 = c11158xe7d16ed5.f153328u;
            if (str10 == null) {
                str10 = "";
            }
            nVar.T = str10;
            android.widget.TextView textView = nVar.f404722p;
            textView.setText(str10);
            textView.setContentDescription(nVar.T);
            m31.p1 p1Var = this.f359971l;
            if (p1Var != null) {
                java.lang.String str11 = c11158xe7d16ed5.f153329v;
                if (str11 == null) {
                    str11 = "";
                }
                p1Var.k(str11);
            }
            if (z18) {
                ((m31.q0) kz5.n0.X(arrayList2)).f404733a = true;
            }
            m31.p1 p1Var2 = this.f359971l;
            if (p1Var2 != null) {
                java.lang.String value = c11158xe7d16ed5.f153316f;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(value, "value");
                android.widget.TextView textView2 = p1Var2.f404721o;
                textView2.setText(value);
                textView2.getPaint().setStyle(android.graphics.Paint.Style.FILL_AND_STROKE);
                textView2.getPaint().setStrokeWidth(0.8f);
            }
            m31.p1 p1Var3 = this.f359971l;
            if (p1Var3 != null) {
                java.lang.String value2 = c11158xe7d16ed5.f153315e;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(value2, "value");
                p1Var3.M = value2;
            }
            m31.p1 p1Var4 = this.f359971l;
            com.p314xaae8f345.mm.p965xc41bc71e.C11160x93f17146 c11160x93f17146 = c11158xe7d16ed5.f153321n;
            if (p1Var4 != null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c11160x93f17146);
                java.lang.String value3 = c11160x93f17146.f153354d;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(value3, "value");
                android.widget.TextView textView3 = p1Var4.f404720n;
                textView3.setText(value3);
                textView3.getPaint().setStyle(android.graphics.Paint.Style.FILL_AND_STROKE);
                textView3.getPaint().setStrokeWidth(0.8f);
            }
            m31.p1 p1Var5 = this.f359971l;
            if (p1Var5 != null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c11160x93f17146);
                java.lang.String value4 = c11160x93f17146.f153355e;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(value4, "value");
                p1Var5.f404725s.setText(value4);
            }
            m31.p1 p1Var6 = this.f359971l;
            if (p1Var6 != null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c11160x93f17146);
                java.lang.String value5 = c11160x93f17146.f153356f;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(value5, "value");
                p1Var6.f404724r.setText(value5);
            }
            m31.p1 p1Var7 = this.f359971l;
            if (p1Var7 != null) {
                p1Var7.V = com.p314xaae8f345.mm.R.C30861xcebc809e.bhm;
            }
            if (p1Var7 != null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c11160x93f17146);
                java.lang.String str12 = c11160x93f17146.f153358h;
                if (str12 == null) {
                    str12 = "";
                }
                p1Var7.N = str12;
            }
            m31.p1 p1Var8 = this.f359971l;
            if (p1Var8 != null) {
                boolean z19 = !c11158xe7d16ed5.f153319i;
                p1Var8.Q = z19;
                android.view.View view = p1Var8.f404732z;
                int i29 = z19 ? 0 : 8;
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList3.add(java.lang.Integer.valueOf(i29));
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(view, arrayList3.toArray(), "com/tencent/mm/msgsubscription/ui/SubscribeMsgRequestDialog", "setShowAlwaysKeepView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/msgsubscription/ui/SubscribeMsgRequestDialog", "setShowAlwaysKeepView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            m31.p1 p1Var9 = this.f359971l;
            if (p1Var9 != null) {
                boolean z27 = !c11158xe7d16ed5.f153320m;
                p1Var9.S = z27;
                p1Var9.f404731y.setVisibility(z27 ? 0 : 8);
            }
            m31.p1 p1Var10 = this.f359971l;
            if ((p1Var10 != null && p1Var10.Q) && p1Var10 != null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c11160x93f17146);
                p1Var10.h(c11160x93f17146.f153357g);
            }
            m31.p1 p1Var11 = this.f359971l;
            if ((p1Var11 != null && p1Var11.S) && p1Var11 != null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c11160x93f17146);
                java.lang.String value6 = c11160x93f17146.f153359i;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(value6, "value");
                p1Var11.R = value6;
                android.widget.TextView textView4 = p1Var11.f404731y;
                textView4.setVisibility(0);
                textView4.setText(p1Var11.R);
            }
            java.lang.Object[] objArr = new java.lang.Object[2];
            m31.p1 p1Var12 = this.f359971l;
            objArr[0] = p1Var12 != null ? java.lang.Boolean.valueOf(p1Var12.Q) : null;
            m31.p1 p1Var13 = this.f359971l;
            objArr[1] = p1Var13 != null ? java.lang.Boolean.valueOf(p1Var13.S) : null;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BrandSubscribeMsgRequestController", "showSubscribeMsgRequestDialog showAlways: %s, showReject: %s", objArr);
            m31.p1 p1Var14 = this.f359971l;
            if (p1Var14 != null) {
                p1Var14.L = new h31.q(this);
            }
            if (this.f359972m == null) {
                this.f359972m = new fl1.c0(context, null);
                if (context instanceof android.app.Activity) {
                    ((android.app.Activity) context).addContentView(this.f359972m, new android.view.ViewGroup.LayoutParams(-1, -2));
                }
            }
            m31.p1 p1Var15 = this.f359971l;
            if (p1Var15 != null) {
                p1Var15.i(2);
            }
            fl1.c0 c0Var = this.f359972m;
            if (c0Var != null) {
                c0Var.c(this.f359971l);
            }
            j31.e eVar2 = j31.e.f378925a;
            int size2 = arrayList2.size();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SubscribeMsgReporter", "createSession templateCount: %d", java.lang.Integer.valueOf(size2));
            java.lang.System.currentTimeMillis();
            j31.e.f378928d = size2;
            ((java.util.ArrayList) j31.e.f378926b).clear();
            ((java.util.ArrayList) j31.e.f378927c).clear();
            if (size2 > 0) {
                java.util.ArrayList arrayList4 = new java.util.ArrayList(size2);
                for (int i37 = 0; i37 < size2; i37++) {
                    arrayList4.add(0);
                }
                j31.e.f378927c = arrayList4;
            }
        }
        h31.a aVar6 = this.f359967h;
        if (aVar6 != null) {
            ((m31.y1) aVar6).b(r9, c11158xe7d16ed5);
        }
    }

    public final void b(int i17, long j17) {
        if (this.f359977r == 1) {
            j31.e eVar = j31.e.f378925a;
            java.lang.String bizUsername = this.f359962c;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bizUsername, "bizUsername");
            java.lang.String content = this.f359965f;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(content, "content");
            jx3.f.INSTANCE.d(17639, c01.z1.r() + '#' + bizUsername + '#' + j17, java.lang.Integer.valueOf(i17), content);
        }
    }

    public final void c() {
        int i17 = this.f359961b;
        e31.k kVar = this.f359973n;
        java.lang.String str = this.f359966g;
        java.lang.String str2 = this.f359963d;
        if (i17 != 1) {
            if (i17 == 2) {
                java.lang.String str3 = this.f359962c;
                java.util.ArrayList arrayList = this.f359968i;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(arrayList);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BrandSubscribeMsgRequestController", "doSubscribeMsg bizUsername: %s, appId: %s, template size: %s", str3, str2, java.lang.Integer.valueOf(arrayList.size()));
                e31.o oVar = new e31.o();
                oVar.f328629h = true;
                java.lang.String str4 = this.f359962c;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str4, "<set-?>");
                oVar.f328622a = str4;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str2, "<set-?>");
                oVar.f328623b = str2;
                java.util.List list = oVar.f328624c;
                java.util.ArrayList arrayList2 = this.f359968i;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(arrayList2);
                ((java.util.ArrayList) list).addAll(arrayList2);
                oVar.f328625d = true;
                byte[] bArr = this.f359975p;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bArr, "<set-?>");
                oVar.f328626e = bArr;
                oVar.f328627f = this.f359976q;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str, "<set-?>");
                oVar.f328628g = str;
                oVar.f328630i = new h31.j(this);
                this.f359974o = kVar != null ? ((g31.l) kVar).x(oVar) : -1L;
                return;
            }
            if (i17 != 3) {
                return;
            }
        }
        java.lang.String str5 = this.f359964e;
        boolean z17 = str5.length() == 0;
        java.util.ArrayList arrayList3 = this.f359969j;
        if (z17 && arrayList3.isEmpty()) {
            h31.a aVar = this.f359967h;
            if (aVar != null) {
                ((m31.y1) aVar).a(this.f359961b, 10001, "templateIdList empty");
                return;
            }
            return;
        }
        if (str.length() > 0) {
            java.lang.String optString = new org.json.JSONObject(str).optString(dm.i4.f66875xa013b0d5);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString);
            if (optString.length() > 0) {
                this.f359962c = optString;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BrandSubscribeMsgRequestController", "getSubscribeMsgTemplateList bizUsername: %s, bizAppId: %s, url: %s, templateIdList size: %s", this.f359962c, str2, str5, java.lang.Integer.valueOf(arrayList3.size()));
        java.lang.String str6 = this.f359962c;
        j31.b bVar = this.f359978s;
        bVar.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str6, "<set-?>");
        bVar.f378896a = str6;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str2, "<set-?>");
        bVar.f378897b = str2;
        try {
            if (str.length() > 0) {
                java.lang.String optString2 = new org.json.JSONObject(str).optString("sessionid");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(optString2, "optString(...)");
                bVar.f378898c = optString2;
            }
        } catch (java.lang.Exception unused) {
        }
        h31.k kVar2 = new h31.k(this);
        if (this.f359962c.length() > 0) {
            if (kVar != null) {
                java.lang.String username = this.f359962c;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
                k31.b bVar2 = ((g31.l) kVar).f349622b;
                bVar2.getClass();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SubscribeMsgDataLoader", "getSubscribeListByUsername username: %s, url: %s, templateIdList size: %s", username, str5, java.lang.Integer.valueOf(arrayList3.size()));
                k31.a aVar2 = bVar2.f385355a;
                if (aVar2 != null) {
                    l31.q qVar = new l31.q(username, "", str5, arrayList3, str, aVar2, kVar2);
                    k31.o.f385383a.b(aVar2, qVar);
                    r1 = qVar.hashCode();
                }
            }
            this.f359974o = r1;
            return;
        }
        if (!(str2.length() > 0)) {
            h31.a aVar3 = this.f359967h;
            if (aVar3 != null) {
                ((m31.y1) aVar3).a(this.f359961b, -1, "username or appId invalid");
                return;
            }
            return;
        }
        if (kVar != null) {
            k31.b bVar3 = ((g31.l) kVar).f349622b;
            bVar3.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SubscribeMsgDataLoader", "getSubscribeListByAppId appId: %s, url: %s, templateIdList size: %s", str2, str5, java.lang.Integer.valueOf(arrayList3.size()));
            k31.a aVar4 = bVar3.f385355a;
            if (aVar4 != null) {
                l31.q qVar2 = new l31.q("", str2, str5, arrayList3, str, aVar4, kVar2);
                k31.o.f385383a.b(aVar4, qVar2);
                r1 = qVar2.hashCode();
            }
        }
        this.f359974o = r1;
    }

    public final void d(android.content.Context context, java.lang.String str, java.lang.String str2, android.content.DialogInterface.OnClickListener onClickListener) {
        if (!(str2.length() > 0)) {
            str2 = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.jne);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str2);
        }
        db5.e1.E(context, str2, str, context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571988vj), false, onClickListener);
    }

    public final void e(java.lang.String str, yz5.a aVar) {
        java.lang.ref.WeakReference weakReference;
        android.content.Context context;
        if ((str.length() > 0) && (weakReference = this.f359960a) != null && (context = (android.content.Context) weakReference.get()) != null) {
            dp.a.m125854x26a183b(context, str, 0).show();
        }
        aVar.mo152xb9724478();
    }
}
