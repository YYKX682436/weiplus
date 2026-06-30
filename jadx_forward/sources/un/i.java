package un;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class i {

    /* renamed from: e, reason: collision with root package name */
    public static final un.i f510816e;

    /* renamed from: f, reason: collision with root package name */
    public static final un.i f510817f;

    /* renamed from: g, reason: collision with root package name */
    public static final un.i f510818g;

    /* renamed from: h, reason: collision with root package name */
    public static final un.i f510819h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ un.i[] f510820i;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f510821d;

    static {
        un.i iVar = new un.i("MUTE", 0, "1");
        f510816e = iVar;
        un.i iVar2 = new un.i("MUTE_CONV_BOX", 1, "2");
        un.i iVar3 = new un.i("MUTE_AT_ME", 2, "3");
        f510817f = iVar3;
        un.i iVar4 = new un.i("MUTE_AT_ALL", 3, "4");
        f510818g = iVar4;
        un.i iVar5 = new un.i("MUTE_ANNOUNCEMENT", 4, "5");
        f510819h = iVar5;
        un.i[] iVarArr = {iVar, iVar2, iVar3, iVar4, iVar5, new un.i("SET_TOP", 5, "6"), new un.i("SAVE_TO_CONTACT", 6, "7"), new un.i("SHOW_MEMBER_NICKNAME", 7, "8")};
        f510820i = iVarArr;
        rz5.b.a(iVarArr);
    }

    public i(java.lang.String str, int i17, java.lang.String str2) {
        this.f510821d = str2;
    }

    /* renamed from: valueOf */
    public static un.i m168271xdce0328(java.lang.String str) {
        return (un.i) java.lang.Enum.valueOf(un.i.class, str);
    }

    /* renamed from: values */
    public static un.i[] m168272xcee59d22() {
        return (un.i[]) f510820i.clone();
    }
}
