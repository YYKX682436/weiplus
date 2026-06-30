package y12;

/* loaded from: classes12.dex */
public class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f540387d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ y12.e f540388e;

    public d(y12.e eVar, java.lang.String str) {
        this.f540388e = eVar;
        this.f540387d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str = this.f540387d;
        y12.e eVar = this.f540388e;
        eVar.c(str);
        if (eVar.f540390a) {
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_EMOJI_CLEAN_TEMP_FILE_TASK_LONG, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        }
    }
}
