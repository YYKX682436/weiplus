package vz4;

/* loaded from: classes8.dex */
public class w implements com.p314xaae8f345.mm.sdk.p2603x2137b148.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vz4.x f523284d;

    public w(vz4.x xVar) {
        this.f523284d = xVar;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.a4
    /* renamed from: onTimerExpired */
    public boolean mo322xdd48fb9f() {
        vz4.x xVar = this.f523284d;
        if (!xVar.f523296k || xVar.f523295j) {
            android.content.SharedPreferences sharedPreferences = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSharedPreferences("we_pkg_sp", 4);
            if (sharedPreferences != null) {
                sharedPreferences.edit().putInt("white_screen_times", 0).commit();
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Wepkg.WePkgPlugin", "white screen");
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new vz4.v(this));
        }
        return false;
    }
}
