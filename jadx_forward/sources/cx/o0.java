package cx;

/* loaded from: classes16.dex */
public final class o0 implements jc3.m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ cx.w0 f305982a;

    public o0(cx.w0 w0Var) {
        this.f305982a = w0Var;
    }

    @Override // jc3.m
    public java.lang.Object a(org.json.JSONObject data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        org.json.JSONObject optJSONObject = data.optJSONObject("position");
        return new cx.i0(optJSONObject != null ? optJSONObject.optInt("left", -1) : -1, optJSONObject != null ? optJSONObject.optInt("top", -1) : -1, optJSONObject != null ? optJSONObject.optInt("width", -1) : -1, optJSONObject != null ? optJSONObject.optInt("height", -1) : -1, data.optInt("hide"));
    }

    @Override // jc3.m
    public void b(java.lang.Object obj, jc3.k callback) {
        sp0.d view = (sp0.d) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        if (f(view)) {
            p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
            h0Var.f391656d = "";
            com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.o mo20599xaaa148a0 = com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.p.f149584g.mo20599xaaa148a0();
            java.lang.Object obj2 = view.f492477a;
            if (obj2 instanceof com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.l) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj2, "null cannot be cast to non-null type com.tencent.mm.flutter.plugin.proto.MagicSclBizApi.MBApiInsertFrameSet.Builder");
                int i17 = ((com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.l) obj2).f149530e;
                mo20599xaaa148a0.f149560d |= 1;
                mo20599xaaa148a0.f149561e = i17;
                mo20599xaaa148a0.m20881x7bb163d5();
                h0Var.f391656d = "removeFrameSet";
            }
            this.f305982a.f306012x.n((java.lang.String) h0Var.f391656d, mo20599xaaa148a0.mo20556x59bc66e().mo20648x5f01b1f6(), new cx.l0(callback, this, h0Var));
        }
    }

    @Override // jc3.m
    public void c(java.lang.Object obj, java.lang.Object obj2, jc3.k callback) {
        sp0.d view = (sp0.d) obj;
        cx.i0 viewAttribute = (cx.i0) obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewAttribute, "viewAttribute");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        if (f(view)) {
            p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
            h0Var.f391656d = "";
            com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.j0 mo20599xaaa148a0 = com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.k0.f149522i.mo20599xaaa148a0();
            java.lang.Object obj3 = view.f492477a;
            if (obj3 instanceof com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.l) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj3, "null cannot be cast to non-null type com.tencent.mm.flutter.plugin.proto.MagicSclBizApi.MBApiInsertFrameSet.Builder");
                int i17 = ((com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.l) obj3).f149530e;
                mo20599xaaa148a0.f149517d |= 1;
                mo20599xaaa148a0.f149518e = i17;
                mo20599xaaa148a0.m20881x7bb163d5();
                com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.m0 i18 = com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.n0.i();
                i18.h(mz5.b.c(viewAttribute.f305944a, new int[0]));
                i18.i(mz5.b.c(viewAttribute.f305945b, new int[0]));
                i18.j(mz5.b.c(viewAttribute.f305946c, new int[0]));
                i18.g(mz5.b.c(viewAttribute.f305947d, new int[0]));
                com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.n0 mo20556x59bc66e = i18.mo20556x59bc66e();
                com.p176xb6135e39.p283xc50a8b8b.t9 t9Var = mo20599xaaa148a0.f149521h;
                if (t9Var == null) {
                    mo20599xaaa148a0.f149520g = mo20556x59bc66e;
                    mo20599xaaa148a0.m20881x7bb163d5();
                } else {
                    t9Var.i(mo20556x59bc66e);
                }
                int i19 = mo20599xaaa148a0.f149517d | 4;
                mo20599xaaa148a0.f149517d = i19;
                boolean z17 = viewAttribute.f305948e > 0;
                mo20599xaaa148a0.f149517d = i19 | 2;
                mo20599xaaa148a0.f149519f = z17;
                mo20599xaaa148a0.m20881x7bb163d5();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicBrandBaseBiz", ((java.lang.String) h0Var.f391656d) + " viewId:" + mo20599xaaa148a0.f149518e + ",left:" + i18.f149548e + "top:" + i18.f149549f + "height:" + i18.f149551h + "width:" + i18.f149550g);
                h0Var.f391656d = "updateFrameSet";
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MagicBrandBaseBiz", "view.message is not a MagicSclBizApi.MBApiInsertFrameSet.Builder");
            }
            this.f305982a.f306012x.n((java.lang.String) h0Var.f391656d, mo20599xaaa148a0.mo20556x59bc66e().mo20648x5f01b1f6(), new cx.m0(callback, this, h0Var));
        }
    }

    @Override // jc3.m
    public jc3.l d(java.lang.Object obj) {
        sp0.d view = (sp0.d) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        return new cx.n0();
    }

    @Override // jc3.m
    public void e(java.lang.Object obj, java.lang.Object obj2, jc3.k callback) {
        sp0.d view = (sp0.d) obj;
        cx.i0 viewAttribute = (cx.i0) obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewAttribute, "viewAttribute");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        if (f(view)) {
            cx.w0 w0Var = this.f305982a;
            view.f492478b = new java.lang.ref.WeakReference(w0Var.f306012x);
            p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
            h0Var.f391656d = "";
            java.lang.Object obj3 = view.f492477a;
            if (!(obj3 instanceof com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.l)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MagicBrandBaseBiz", "apiName invalid");
                return;
            }
            com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.m0 i17 = com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.n0.i();
            i17.h(viewAttribute.f305944a);
            i17.i(viewAttribute.f305945b);
            i17.j(viewAttribute.f305946c);
            i17.g(viewAttribute.f305947d);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj3, "null cannot be cast to non-null type com.tencent.mm.flutter.plugin.proto.MagicSclBizApi.MBApiInsertFrameSet.Builder");
            com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.l lVar = (com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.l) obj3;
            com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.n0 mo20556x59bc66e = i17.mo20556x59bc66e();
            com.p176xb6135e39.p283xc50a8b8b.t9 t9Var = lVar.f149534i;
            if (t9Var == null) {
                lVar.f149533h = mo20556x59bc66e;
                lVar.m20881x7bb163d5();
            } else {
                t9Var.i(mo20556x59bc66e);
            }
            int i18 = lVar.f149529d | 8;
            lVar.f149529d = i18;
            boolean z17 = viewAttribute.f305948e > 0;
            lVar.f149529d = i18 | 16;
            lVar.f149535m = z17;
            lVar.m20881x7bb163d5();
            com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.m mo20556x59bc66e2 = lVar.mo20556x59bc66e();
            h0Var.f391656d = "insertFrameSet";
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicBrandBaseBiz", ((java.lang.String) h0Var.f391656d) + " viewId:" + lVar.f149530e + ",left:" + lVar.e().f149555e + "top:" + lVar.e().f149556f + "height:" + lVar.e().f149558h + "width:" + lVar.e().f149557g);
            w0Var.f306012x.n((java.lang.String) h0Var.f391656d, mo20556x59bc66e2.mo20648x5f01b1f6(), new cx.k0(callback, this, h0Var));
        }
    }

    public final boolean f(sp0.d view) {
        java.lang.String str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        java.lang.Object obj = view.f492477a;
        if (!(obj instanceof com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.l)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicBrandBaseBiz", "is not MBApiInsertFrameSet,no need to transfer flutter");
            return false;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type com.tencent.mm.flutter.plugin.proto.MagicSclBizApi.MBApiInsertFrameSet.Builder");
        com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.l lVar = (com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.l) obj;
        java.lang.Object obj2 = lVar.f149532g;
        if (obj2 instanceof java.lang.String) {
            str = (java.lang.String) obj2;
        } else {
            com.p176xb6135e39.p283xc50a8b8b.y yVar = (com.p176xb6135e39.p283xc50a8b8b.y) obj2;
            str = yVar.r();
            if (yVar.l()) {
                lVar.f149532g = str;
            }
        }
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "popup");
    }

    public final lc3.z g(int i17, java.lang.String errMsg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(errMsg, "errMsg");
        if (i17 == 0) {
            return lc3.x.f399467a;
        }
        return new lc3.z(4, "fail:internal errorflutterErrCode: " + i17 + ", flutterErrCode:" + errMsg);
    }
}
