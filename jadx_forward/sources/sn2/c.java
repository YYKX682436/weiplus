package sn2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes10.dex */
public final class c {

    /* renamed from: e, reason: collision with root package name */
    public static final sn2.c f491653e;

    /* renamed from: f, reason: collision with root package name */
    public static final sn2.c f491654f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ sn2.c[] f491655g;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f491656d;

    static {
        sn2.c cVar = new sn2.c("NOTIFY_PLAYING", 0, "NOTIFY_PLAYING");
        sn2.c cVar2 = new sn2.c("NOTIFY_PAUSED", 1, "NOTIFY_PAUSED");
        sn2.c cVar3 = new sn2.c("SHOW_CONTROLS", 2, "SHOW_CONTROLS");
        f491653e = cVar3;
        sn2.c cVar4 = new sn2.c("HIDE_CONTROLS", 3, "HIDE_CONTROLS");
        f491654f = cVar4;
        sn2.c[] cVarArr = {cVar, cVar2, cVar3, cVar4, new sn2.c("UPDATE_LIVE_INFO", 4, "UPDATE_LIVE_INFO")};
        f491655g = cVarArr;
        rz5.b.a(cVarArr);
    }

    public c(java.lang.String str, int i17, java.lang.String str2) {
        this.f491656d = str2;
    }

    /* renamed from: valueOf */
    public static sn2.c m164811xdce0328(java.lang.String str) {
        return (sn2.c) java.lang.Enum.valueOf(sn2.c.class, str);
    }

    /* renamed from: values */
    public static sn2.c[] m164812xcee59d22() {
        return (sn2.c[]) f491655g.clone();
    }
}
