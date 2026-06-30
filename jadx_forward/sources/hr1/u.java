package hr1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class u {

    /* renamed from: d, reason: collision with root package name */
    public static final hr1.u f364898d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ hr1.u[] f364899e;

    static {
        hr1.u uVar = new hr1.u("RECEIVE", 0);
        f364898d = uVar;
        hr1.u[] uVarArr = {uVar, new hr1.u("GET_SESSION_ID", 1), new hr1.u("SELF_REPLY", 2), new hr1.u("FOR_TEST", 3)};
        f364899e = uVarArr;
        rz5.b.a(uVarArr);
    }

    public u(java.lang.String str, int i17) {
    }

    /* renamed from: valueOf */
    public static hr1.u m133938xdce0328(java.lang.String str) {
        return (hr1.u) java.lang.Enum.valueOf(hr1.u.class, str);
    }

    /* renamed from: values */
    public static hr1.u[] m133939xcee59d22() {
        return (hr1.u[]) f364899e.clone();
    }
}
