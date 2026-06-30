package p6;

/* loaded from: classes16.dex */
public class g extends android.os.Handler {

    /* renamed from: a, reason: collision with root package name */
    public int f433666a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f433667b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f433668c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p6.h f433669d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(p6.h hVar, android.os.Looper looper, int i17, int i18) {
        super(looper);
        this.f433669d = hVar;
        this.f433667b = i17;
        this.f433668c = i18;
        this.f433666a = 0;
    }

    @Override // android.os.Handler
    public void handleMessage(android.os.Message message) {
        p6.h hVar = this.f433669d;
        try {
            if (hVar.f433672c != null && hVar.f433673d != null && hVar.f433674e != null) {
                switch (message.what) {
                    case 100:
                        long longValue = ((java.lang.Long) message.obj).longValue();
                        q6.a aVar = hVar.f433675f;
                        if (aVar == null) {
                            q6.d dVar = hVar.f433674e;
                            dVar.f441753a = longValue;
                            dVar.a(longValue, longValue);
                            return;
                        }
                        int mo8697x9746038c = aVar.mo8697x9746038c();
                        if (mo8697x9746038c > 0 && mo8697x9746038c >= this.f433666a) {
                            q6.d dVar2 = hVar.f433674e;
                            long j17 = mo8697x9746038c;
                            dVar2.f441753a = j17;
                            dVar2.a(j17, longValue);
                        } else if (mo8697x9746038c < 0 || mo8697x9746038c >= this.f433666a || hVar.f433676g.f433642c <= 0) {
                            hVar.f433672c.sendMessage(android.os.Message.obtain(message));
                        } else {
                            hVar.mo157878xc9fc1b13(mo8697x9746038c);
                        }
                        this.f433666a = mo8697x9746038c;
                        return;
                    case 101:
                        java.lang.Object obj = message.obj;
                        if (obj instanceof android.os.Parcel) {
                            android.os.Parcel parcel = (android.os.Parcel) obj;
                            q6.a aVar2 = hVar.f433675f;
                            if (aVar2 != null) {
                                aVar2.mo8697x9746038c();
                            }
                            java.lang.String str = new com.p144xabe4be82.p145xb7039297.p146x361a9b.C1425x3ce2cbe(parcel).f125450d;
                            if (l6.m.f398272a >= 24) {
                                java.lang.String replace = "{\n    \"Metadata\": {\n        \"Created\": \"2020-08-10\",\n        \"Description\": \"Haptic editor design\",\n        \"Version\": 2\n    },\n    \"PatternList\": [\n       {\n        \"AbsoluteTime\": 0,\n          ReplaceMe\n       }\n    ]\n}".replace("ReplaceMe", str);
                                l6.c c17 = l6.c.c(hVar.f433670a);
                                hVar.getClass();
                                c17.a(replace, 1, 0, this.f433667b, this.f433668c);
                            } else {
                                l6.c c18 = l6.c.c(hVar.f433670a);
                                hVar.getClass();
                                c18.b("{\"Metadata\": {\"Version\": 1}," + str + "}", 1, 0, this.f433667b, this.f433668c);
                            }
                            parcel.recycle();
                            return;
                        }
                        return;
                    case 102:
                        p6.a aVar3 = hVar.f433676g;
                        if (aVar3.f433642c <= 0) {
                            aVar3.f433648i = 9;
                            hVar.getClass();
                            return;
                        }
                        q6.a aVar4 = hVar.f433675f;
                        if (aVar4 == null || aVar4.mo8697x9746038c() <= l6.m.d(hVar.f433676g.f433640a)) {
                            hVar.mo157878xc9fc1b13(0);
                            return;
                        } else {
                            hVar.f433672c.sendEmptyMessageDelayed(102, 10L);
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
