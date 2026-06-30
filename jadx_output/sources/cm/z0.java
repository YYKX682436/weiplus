package cm;

/* loaded from: classes7.dex */
public enum z0 {
    undefined(0),
    normal(1000),
    plugin(1001),
    wxstore(1002),
    merchant(1003),
    wagame(1004),
    gift(1005);


    /* renamed from: d, reason: collision with root package name */
    public final int f43278d;

    z0(int i17) {
        this.f43278d = i17;
    }

    public static cm.z0 a(int i17) {
        if (i17 == 0) {
            return undefined;
        }
        switch (i17) {
            case 1000:
                return normal;
            case 1001:
                return plugin;
            case 1002:
                return wxstore;
            case 1003:
                return merchant;
            case 1004:
                return wagame;
            case 1005:
                return gift;
            default:
                return null;
        }
    }
}
