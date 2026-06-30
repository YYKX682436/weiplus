package lc3;

/* loaded from: classes7.dex */
public abstract class s extends lc3.e {

    /* renamed from: e, reason: collision with root package name */
    public static int f399451e;

    /* renamed from: d, reason: collision with root package name */
    public final lc3.r f399452d = new lc3.r();

    public final int C0(java.lang.Object view) {
        int i17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        synchronized (this) {
            i17 = f399451e - 1;
            f399451e = i17;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MBDynamicBizContext", "addCustomView,viewId:" + i17);
        this.f399452d.a(i17, view);
        return i17;
    }

    public void E0(org.json.JSONObject data, yz5.l callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        callback.mo146xb9724478(null);
    }

    public abstract jc3.m F0(java.lang.String str);
}
