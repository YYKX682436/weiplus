package fp;

/* loaded from: classes14.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public fp.d f346709a;

    public e(android.content.Context context) {
        this.f346709a = null;
        context = context instanceof android.app.Activity ? com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a : context;
        if (fp.h.c(8)) {
            this.f346709a = new fp.g(context);
        }
    }

    public boolean a() {
        synchronized ("audio_lock") {
            fp.d dVar = this.f346709a;
            if (dVar == null) {
                return false;
            }
            return ((fp.g) dVar).a();
        }
    }

    public boolean b() {
        synchronized ("audio_lock") {
            fp.d dVar = this.f346709a;
            if (dVar == null) {
                return false;
            }
            return ((fp.g) dVar).c();
        }
    }
}
