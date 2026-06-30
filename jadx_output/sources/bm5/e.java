package bm5;

/* loaded from: classes11.dex */
public abstract class e {
    public static final void a(android.content.Context context, android.content.Intent intent, java.lang.String description, java.lang.String str, boolean z17, java.lang.String channelId, boolean z18) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(intent, "intent");
        kotlin.jvm.internal.o.g(description, "description");
        kotlin.jvm.internal.o.g(channelId, "channelId");
        long j17 = z17 ? 0L : 800L;
        final bm5.c cVar = new bm5.c(fp.h.b(28) || kotlin.jvm.internal.o.b(android.os.Build.VERSION.CODENAME, "Q"), context, intent, description, str, channelId, z18);
        com.tencent.mm.sdk.platformtools.u3.i(new java.lang.Runnable(cVar) { // from class: bm5.d

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ yz5.a f22557d;

            {
                kotlin.jvm.internal.o.g(cVar, "function");
                this.f22557d = cVar;
            }

            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.f22557d.invoke();
            }
        }, j17);
    }
}
