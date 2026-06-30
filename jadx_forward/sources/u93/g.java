package u93;

/* loaded from: classes.dex */
public class g implements m33.h1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ u93.h f507359a;

    public g(u93.h hVar) {
        this.f507359a = hVar;
    }

    @Override // m33.h1
    public void a(java.util.Map map) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiteAppJsApiOpenGameDetail", "JsApiOpenGameDetail success");
        map.put("err_msg", "openGameDetail:ok");
        this.f507359a.f224976f.b(map);
    }

    @Override // m33.h1
    public void b(java.util.Map map) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiteAppJsApiOpenGameDetail", "JsApiOpenGameDetail fail");
        this.f507359a.f224976f.a("openGameDetail:fail, " + map.get("error"));
    }
}
