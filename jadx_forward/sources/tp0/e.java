package tp0;

/* loaded from: classes7.dex */
public abstract class e extends lc3.b0 {
    @Override // lc3.b0
    public void t(lc3.a0 data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseCoverViewOperator", "invoke, name: " + f() + ", data:" + data + ", biz:" + e().f425864a);
        int v17 = v(data);
        if (v17 != 0) {
            ym5.a1.f(new tp0.d(this, data, v17));
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BaseCoverViewOperator", "hy: operating cover view without viewId is illegal");
            u(lc3.x.f399470d);
        }
    }

    public final void u(lc3.z errOrSuc) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(errOrSuc, "errOrSuc");
        if (errOrSuc.f399477a == 0) {
            s().mo146xb9724478(k());
        } else {
            s().mo146xb9724478(i(errOrSuc));
        }
    }

    public final int v(org.json.JSONObject data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        return data.optInt("viewId", 0);
    }

    public void w(org.json.JSONObject data, jc3.m coverViewDelegate) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(coverViewDelegate, "coverViewDelegate");
    }

    public void x(org.json.JSONObject data, java.lang.Object view, jc3.m parent) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
    }

    public final void y(java.lang.Object view, org.json.JSONObject data, jc3.m coverViewDelegate) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(coverViewDelegate, "coverViewDelegate");
        jc3.l d17 = coverViewDelegate.d(view);
        if (data.has("hide")) {
            if (data.optInt("hide", -1) > 0 || data.optBoolean("hide", false)) {
                d17.b(view);
            }
            if (data.optInt("hide", 1) <= 0 || !data.optBoolean("hide", true)) {
                d17.a(view);
            }
        }
    }
}
