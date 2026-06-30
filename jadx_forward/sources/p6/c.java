package p6;

/* loaded from: classes16.dex */
public class c extends android.os.Handler {

    /* renamed from: a, reason: collision with root package name */
    public int f433654a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f433655b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f433656c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p6.d f433657d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(p6.d dVar, android.os.Looper looper, int i17, int i18) {
        super(looper);
        this.f433657d = dVar;
        this.f433655b = i17;
        this.f433656c = i18;
        this.f433654a = 0;
    }

    @Override // android.os.Handler
    public void handleMessage(android.os.Message message) {
        int i17;
        int i18;
        p6.d dVar = this.f433657d;
        try {
        } catch (java.lang.Exception e17) {
            e17.toString();
        }
        if (dVar.f433660c != null && dVar.f433661d != null && dVar.f433662e != null) {
            switch (message.what) {
                case 100:
                    long longValue = ((java.lang.Long) message.obj).longValue();
                    q6.a aVar = dVar.f433663f;
                    if (aVar == null) {
                        q6.d dVar2 = dVar.f433662e;
                        dVar2.f441753a = longValue;
                        dVar2.a(longValue, longValue);
                        return;
                    }
                    int mo8697x9746038c = aVar.mo8697x9746038c();
                    if (mo8697x9746038c > 0 && mo8697x9746038c >= this.f433654a) {
                        q6.d dVar3 = dVar.f433662e;
                        long j17 = mo8697x9746038c;
                        dVar3.f441753a = j17;
                        dVar3.a(j17, longValue);
                    } else if (mo8697x9746038c < 0 || mo8697x9746038c >= this.f433654a || dVar.f433664g.f433642c <= 0) {
                        dVar.f433660c.sendMessage(android.os.Message.obtain(message));
                    } else {
                        dVar.mo157878xc9fc1b13(mo8697x9746038c);
                    }
                    this.f433654a = mo8697x9746038c;
                    return;
                case 101:
                    java.lang.Object obj = message.obj;
                    if (obj instanceof android.os.Parcel) {
                        android.os.Parcel parcel = (android.os.Parcel) obj;
                        q6.a aVar2 = dVar.f433663f;
                        if (aVar2 != null) {
                            aVar2.mo8697x9746038c();
                        }
                        java.lang.String str = "{\"Metadata\": {\"Version\": 1}," + new com.p144xabe4be82.p145xb7039297.p146x361a9b.C1425x3ce2cbe(parcel).f125450d + "}";
                        p6.d dVar4 = this.f433657d;
                        l6.l lVar = dVar4.f433665h;
                        if (lVar != null) {
                            synchronized (lVar) {
                                i18 = lVar.f398267c;
                            }
                            i17 = i18;
                        } else {
                            i17 = this.f433655b;
                        }
                        dVar4.a(str, 1, 0, i17, this.f433656c);
                        parcel.recycle();
                        return;
                    }
                    return;
                case 102:
                    p6.a aVar3 = dVar.f433664g;
                    if (aVar3.f433642c <= 0) {
                        aVar3.f433648i = 9;
                        return;
                    }
                    q6.a aVar4 = dVar.f433663f;
                    if (aVar4 == null || aVar4.mo8697x9746038c() <= l6.m.d(dVar.f433664g.f433640a)) {
                        dVar.mo157878xc9fc1b13(0);
                        return;
                    } else {
                        dVar.f433660c.sendEmptyMessageDelayed(102, 10L);
                        return;
                    }
                default:
                    return;
            }
            e17.toString();
        }
    }
}
