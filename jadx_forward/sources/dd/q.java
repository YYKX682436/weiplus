package dd;

/* loaded from: classes9.dex */
public final class q {

    /* renamed from: c, reason: collision with root package name */
    public static final dd.p f310420c = new dd.p(null);

    /* renamed from: d, reason: collision with root package name */
    public static dd.q f310421d;

    /* renamed from: a, reason: collision with root package name */
    public final java.util.HashMap f310422a = new java.util.HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f310423b = "lite_app_module_shake_impl_session_id_";

    public final com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3142xff72e75a a(bd.e callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        java.lang.String str = this.f310423b + callback.f100730a;
        java.util.HashMap hashMap = this.f310422a;
        if (!hashMap.containsKey(str)) {
            hashMap.put(str, new com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3142xff72e75a());
        }
        java.lang.Object obj = hashMap.get(str);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(obj);
        return (com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3142xff72e75a) obj;
    }
}
