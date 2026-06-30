package p6;

/* loaded from: classes16.dex */
public class i extends android.os.Handler {

    /* renamed from: a, reason: collision with root package name */
    public int f433677a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f433678b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f433679c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p6.j f433680d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(p6.j jVar, android.os.Looper looper, int i17, int i18) {
        super(looper);
        this.f433680d = jVar;
        this.f433678b = i17;
        this.f433679c = i18;
        this.f433677a = 0;
    }

    @Override // android.os.Handler
    public void handleMessage(android.os.Message message) {
        p6.j jVar = this.f433680d;
        try {
            if (jVar.f433682b != null && jVar.f433683c != null && jVar.f433684d != null) {
                switch (message.what) {
                    case 100:
                        long longValue = ((java.lang.Long) message.obj).longValue();
                        q6.a aVar = jVar.f433685e;
                        if (aVar == null) {
                            q6.d dVar = jVar.f433684d;
                            dVar.f441753a = longValue;
                            dVar.a(longValue, longValue);
                            return;
                        }
                        int mo8697x9746038c = aVar.mo8697x9746038c();
                        if (mo8697x9746038c > 0 && mo8697x9746038c >= this.f433677a) {
                            q6.d dVar2 = jVar.f433684d;
                            long j17 = mo8697x9746038c;
                            dVar2.f441753a = j17;
                            dVar2.a(j17, longValue);
                        } else if (mo8697x9746038c < 0 || mo8697x9746038c >= this.f433677a || jVar.f433686f.f433642c <= 0) {
                            jVar.f433682b.sendMessage(android.os.Message.obtain(message));
                        } else {
                            jVar.mo157878xc9fc1b13(mo8697x9746038c);
                        }
                        this.f433677a = mo8697x9746038c;
                        return;
                    case 101:
                        java.lang.Object obj = message.obj;
                        if (obj instanceof android.os.Parcel) {
                            android.os.Parcel parcel = (android.os.Parcel) obj;
                            q6.a aVar2 = jVar.f433685e;
                            if (aVar2 != null) {
                                aVar2.mo8697x9746038c();
                            }
                            java.lang.String str = "{\"Metadata\": {\"Version\": 1}," + new com.p144xabe4be82.p145xb7039297.p146x361a9b.C1425x3ce2cbe(parcel).f125450d + "}";
                            try {
                                if (p001xcca8366f.os.C0028x42c9e078.m2434x1a7eccbf()) {
                                    jVar.f433681a = new p001xcca8366f.os.C0028x42c9e078(p001xcca8366f.os.C0027x34f0ca90.m2432xaf65a0fc(str));
                                    try {
                                        p001xcca8366f.os.C0028x42c9e078 c0028x42c9e078 = jVar.f433681a;
                                        jVar.getClass();
                                        c0028x42c9e078.m2437x68ac462(1, 0, this.f433678b, this.f433679c);
                                    } catch (java.lang.NoSuchMethodError unused) {
                                        jVar.f433681a.m2435x68ac462(1);
                                    }
                                }
                            } catch (java.lang.Throwable unused2) {
                            }
                            parcel.recycle();
                            return;
                        }
                        return;
                    case 102:
                        p6.a aVar3 = jVar.f433686f;
                        if (aVar3.f433642c <= 0) {
                            aVar3.f433648i = 9;
                            jVar.getClass();
                            return;
                        }
                        q6.a aVar4 = jVar.f433685e;
                        if (aVar4 == null || aVar4.mo8697x9746038c() <= l6.m.d(jVar.f433686f.f433640a)) {
                            jVar.mo157878xc9fc1b13(0);
                            return;
                        } else {
                            jVar.f433682b.sendEmptyMessageDelayed(102, 10L);
                            return;
                        }
                    default:
                        return;
                }
            }
        } catch (java.lang.Exception e17) {
            e17.toString();
        }
    }
}
