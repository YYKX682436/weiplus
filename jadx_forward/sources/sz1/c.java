package sz1;

/* loaded from: classes5.dex */
public class c extends sz1.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f495472a;

    public c(java.lang.Object obj) {
        this.f495472a = obj;
    }

    @Override // sz1.d
    public boolean a(java.util.Map map) {
        java.lang.Object obj;
        if (map == null) {
            return false;
        }
        java.util.Iterator it = map.keySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (this.f495472a == map.get(obj)) {
                break;
            }
        }
        if (obj == null) {
            return false;
        }
        map.put(obj, "err_long");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Amoeba.ParamsUtils", "[replaceParams] removeKey : " + obj);
        return true;
    }
}
