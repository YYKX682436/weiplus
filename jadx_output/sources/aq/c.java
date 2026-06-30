package aq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes9.dex */
public final class c {

    /* renamed from: d, reason: collision with root package name */
    public static final aq.c f12842d;

    /* renamed from: e, reason: collision with root package name */
    public static final aq.c f12843e;

    /* renamed from: f, reason: collision with root package name */
    public static final aq.c f12844f;

    /* renamed from: g, reason: collision with root package name */
    public static final aq.c f12845g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ aq.c[] f12846h;

    static {
        aq.c cVar = new aq.c(com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadSDKClientBase.CONNTECTSTATE_INIT, 0);
        f12842d = cVar;
        aq.c cVar2 = new aq.c("RUNNING", 1);
        f12843e = cVar2;
        aq.c cVar3 = new aq.c("LAST_CLUSTER", 2);
        f12844f = cVar3;
        aq.c cVar4 = new aq.c("STOP", 3);
        f12845g = cVar4;
        aq.c[] cVarArr = {cVar, cVar2, cVar3, cVar4};
        f12846h = cVarArr;
        rz5.b.a(cVarArr);
    }

    public c(java.lang.String str, int i17) {
    }

    public static aq.c valueOf(java.lang.String str) {
        return (aq.c) java.lang.Enum.valueOf(aq.c.class, str);
    }

    public static aq.c[] values() {
        return (aq.c[]) f12846h.clone();
    }
}
