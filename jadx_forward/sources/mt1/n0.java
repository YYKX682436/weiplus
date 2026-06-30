package mt1;

/* loaded from: classes12.dex */
public abstract class n0 {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.List f412775a;

    /* renamed from: b, reason: collision with root package name */
    public static final int f412776b;

    static {
        int i17;
        mt1.f0 f0Var = mt1.f0.f412750d;
        java.util.List i18 = kz5.c0.i(new jz5.l(f0Var, mt1.h0.f412754d), new jz5.l(f0Var, mt1.i0.f412762d), new jz5.l(f0Var, mt1.j0.f412764d), new jz5.l(new mt1.g0("1", "clicfg_clean_new_filters", "0"), mt1.m0.f412773d));
        f412775a = i18;
        java.util.ListIterator listIterator = i18.listIterator(i18.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                i17 = -1;
                break;
            } else if (((java.lang.Boolean) ((yz5.a) ((jz5.l) listIterator.previous()).f384366d).mo152xb9724478()).booleanValue()) {
                i17 = listIterator.nextIndex();
                break;
            }
        }
        f412776b = i17 + 1;
    }
}
