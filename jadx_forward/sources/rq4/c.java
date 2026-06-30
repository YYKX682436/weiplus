package rq4;

/* loaded from: classes14.dex */
public final class c {

    /* renamed from: m, reason: collision with root package name */
    public static final rq4.b f480471m = new rq4.b(null);

    /* renamed from: a, reason: collision with root package name */
    public rq4.a f480472a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.HashMap f480473b = new java.util.HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final java.util.HashMap f480474c = new java.util.HashMap();

    /* renamed from: d, reason: collision with root package name */
    public boolean f480475d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f480476e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f480477f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f480478g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f480479h;

    /* renamed from: i, reason: collision with root package name */
    public long f480480i;

    /* renamed from: j, reason: collision with root package name */
    public long f480481j;

    /* renamed from: k, reason: collision with root package name */
    public long f480482k;

    /* renamed from: l, reason: collision with root package name */
    public long f480483l;

    public final void a() {
        sq4.b bVar;
        java.util.HashMap hashMap = this.f480473b;
        sq4.b bVar2 = (sq4.b) hashMap.get("InitCamera");
        if (bVar2 != null) {
            bVar2.a();
        }
        if (this.f480480i != 0 || (bVar = (sq4.b) hashMap.get("InitCamera")) == null) {
            return;
        }
        this.f480480i = bVar.f492914i;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoIPCameraParamsReport", "onCameraInitFinish cost " + this.f480480i);
    }
}
