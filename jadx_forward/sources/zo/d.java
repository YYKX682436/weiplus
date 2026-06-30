package zo;

/* loaded from: classes14.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static java.lang.Boolean f556062a;

    public static boolean a(java.lang.String str, java.lang.String str2, com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f c19767x257d7f, com.p314xaae8f345.mm.p2493x1bc889d6.C19762x487075a c19762x487075a) {
        if (str == null) {
            c19762x487075a.f38859x6ac9171 = false;
            return false;
        }
        if (str2 == null) {
            c19762x487075a.f38859x6ac9171 = true;
            return false;
        }
        if (!str.equals(str2)) {
            c19762x487075a.f38859x6ac9171 = false;
            return false;
        }
        c19767x257d7f.f38864x6ac9171++;
        c19762x487075a.f38859x6ac9171 = true;
        return true;
    }
}
