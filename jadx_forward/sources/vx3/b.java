package vx3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes10.dex */
public final class b {

    /* renamed from: d, reason: collision with root package name */
    public static final vx3.b f522797d;

    /* renamed from: e, reason: collision with root package name */
    public static final vx3.b f522798e;

    /* renamed from: f, reason: collision with root package name */
    public static final vx3.b f522799f;

    /* renamed from: g, reason: collision with root package name */
    public static final vx3.b f522800g;

    /* renamed from: h, reason: collision with root package name */
    public static final vx3.b f522801h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ vx3.b[] f522802i;

    static {
        vx3.b bVar = new vx3.b("PAUSE_ACTION", 0);
        f522797d = bVar;
        vx3.b bVar2 = new vx3.b("PLAY_ACTION", 1);
        vx3.b bVar3 = new vx3.b("START_ACTION", 2);
        f522798e = bVar3;
        vx3.b bVar4 = new vx3.b("RESOURCE_LOAD_ACTION", 3);
        vx3.b bVar5 = new vx3.b("STOP_ACTION", 4);
        f522799f = bVar5;
        vx3.b bVar6 = new vx3.b("REPLACE_ACTION", 5);
        vx3.b bVar7 = new vx3.b("CONTINUE_ACTION", 6);
        f522800g = bVar7;
        vx3.b bVar8 = new vx3.b("SHAKE_ONLY", 7);
        f522801h = bVar8;
        vx3.b[] bVarArr = {bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8};
        f522802i = bVarArr;
        rz5.b.a(bVarArr);
    }

    public b(java.lang.String str, int i17) {
    }

    /* renamed from: valueOf */
    public static vx3.b m172884xdce0328(java.lang.String str) {
        return (vx3.b) java.lang.Enum.valueOf(vx3.b.class, str);
    }

    /* renamed from: values */
    public static vx3.b[] m172885xcee59d22() {
        return (vx3.b[]) f522802i.clone();
    }
}
