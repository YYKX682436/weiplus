package bm5;

/* loaded from: classes11.dex */
public abstract class e {
    public static final void a(android.content.Context context, android.content.Intent intent, java.lang.String description, java.lang.String str, boolean z17, java.lang.String channelId, boolean z18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(intent, "intent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(description, "description");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(channelId, "channelId");
        long j17 = z17 ? 0L : 800L;
        final bm5.c cVar = new bm5.c(fp.h.b(28) || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(android.os.Build.VERSION.CODENAME, "Q"), context, intent, description, str, channelId, z18);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(new java.lang.Runnable(cVar) { // from class: bm5.d

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ yz5.a f104090d;

            {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cVar, "function");
                this.f104090d = cVar;
            }

            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.f104090d.mo152xb9724478();
            }
        }, j17);
    }
}
