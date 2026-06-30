package lp;

/* loaded from: classes12.dex */
public class i implements q25.a {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f401763a = 0;

    static {
        q25.b.b(new lp.i(), "//fav");
    }

    @Override // q25.a
    public boolean a(android.content.Context context, java.lang.String[] strArr, java.lang.String str) {
        if (com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40535xf2ceb016() > 1) {
            return false;
        }
        if (strArr.length < 2) {
            return true;
        }
        java.lang.String str2 = strArr[1];
        str2.getClass();
        if (str2.equals("resendfavitem")) {
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5432x35bb364f c5432x35bb364f = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5432x35bb364f();
            am.z9 z9Var = c5432x35bb364f.f135776g;
            z9Var.f90061a = 39;
            z9Var.f90077q = strArr[2];
            z9Var.f90078r = strArr[3];
            c5432x35bb364f.b(android.os.Looper.getMainLooper());
        } else if (str2.equals("uploadfavitem")) {
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5432x35bb364f c5432x35bb364f2 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5432x35bb364f();
            am.z9 z9Var2 = c5432x35bb364f2.f135776g;
            z9Var2.f90061a = 38;
            z9Var2.f90077q = strArr[2];
            c5432x35bb364f2.b(android.os.Looper.getMainLooper());
        }
        return true;
    }
}
