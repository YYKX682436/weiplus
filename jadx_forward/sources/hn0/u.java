package hn0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class u {

    /* renamed from: e, reason: collision with root package name */
    public static final hn0.u f363970e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ hn0.u[] f363971f;

    /* renamed from: d, reason: collision with root package name */
    public final int f363972d;

    static {
        hn0.u uVar = new hn0.u("SEIMode_OFF", 0, 0);
        hn0.u uVar2 = new hn0.u("SEIMode_GAMEREPORT", 1, 1);
        hn0.u uVar3 = new hn0.u("SEIMode_SUBTITLE", 2, 2);
        hn0.u uVar4 = new hn0.u("SEIMode_LINKMIC", 3, 4);
        hn0.u uVar5 = new hn0.u("SEIMode_OWD", 4, 8);
        hn0.u uVar6 = new hn0.u("SEIMode_ANCHOR_INFO", 5, 16);
        f363970e = uVar6;
        hn0.u[] uVarArr = {uVar, uVar2, uVar3, uVar4, uVar5, uVar6, new hn0.u("SEIMODE_GESTUREINFO", 6, 32), new hn0.u("SEIMODE_ANCHOR_MASK", 7, 128), new hn0.u("SEIMODE_KTV_SINGER", 8, 256), new hn0.u("SEIMODE_CDN_INFO", 9, 512), new hn0.u("SEIMODE_NEW_MUSIC", 10, 1024)};
        f363971f = uVarArr;
        rz5.b.a(uVarArr);
    }

    public u(java.lang.String str, int i17, int i18) {
        this.f363972d = i18;
    }

    /* renamed from: valueOf */
    public static hn0.u m133791xdce0328(java.lang.String str) {
        return (hn0.u) java.lang.Enum.valueOf(hn0.u.class, str);
    }

    /* renamed from: values */
    public static hn0.u[] m133792xcee59d22() {
        return (hn0.u[]) f363971f.clone();
    }

    public final int h() {
        return this.f363972d;
    }
}
