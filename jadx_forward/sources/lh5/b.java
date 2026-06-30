package lh5;

/* loaded from: classes7.dex */
public final class b extends lc3.b0 {

    /* renamed from: f, reason: collision with root package name */
    public static final android.graphics.RectF f400258f = new android.graphics.RectF(0.0f, 0.0f, 0.0f, 0.0f);

    @Override // lc3.c0
    public java.lang.String f() {
        return "setEasterEggBoundingBox";
    }

    @Override // lc3.c0
    public boolean n() {
        return true;
    }

    @Override // lc3.b0
    public void t(lc3.a0 data) {
        android.graphics.RectF rectF;
        lc3.a0 h17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        yz5.l s17 = s();
        lc3.e eVar = this.f399423a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(eVar);
        kh5.h hVar = (kh5.h) eVar;
        org.json.JSONObject optJSONObject = data.optJSONObject("frame");
        android.graphics.RectF rectF2 = f400258f;
        if (optJSONObject == null) {
            rectF = rectF2;
        } else {
            float f17 = ik1.w.f() * ((float) optJSONObject.optDouble("x"));
            float f18 = ik1.w.f() * ((float) optJSONObject.optDouble("y"));
            rectF = new android.graphics.RectF(f17, f18, (ik1.w.f() * ((float) optJSONObject.optDouble("w"))) + f17, (ik1.w.f() * ((float) optJSONObject.optDouble("h"))) + f18);
        }
        java.lang.String optString = data.optString("eggKey");
        java.lang.String optString2 = data.optString("eggId");
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(rectF, rectF2)) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString);
            if (!(optString.length() == 0)) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString2);
                if (!(optString2.length() == 0)) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rectF, "rectF");
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(optString2, hVar.f389610q.f381401b)) {
                        hVar.f389605i.m46574x250227c5(rectF);
                        android.os.Handler handler = hVar.f389608o;
                        java.lang.Runnable runnable = hVar.f389613t;
                        handler.removeCallbacks(runnable);
                        handler.postDelayed(runnable, 300L);
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MEChattingMgr", "[ME]: can't set bbox because " + optString2 + " is not " + hVar.f389610q);
                    }
                    h17 = k();
                    s17.mo146xb9724478(h17);
                }
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MESetEasterEggBoundingB", "stevecai: set bounding box error: " + rectF + ' ' + optString + ' ' + optString2);
        h17 = h(2, "");
        s17.mo146xb9724478(h17);
    }
}
