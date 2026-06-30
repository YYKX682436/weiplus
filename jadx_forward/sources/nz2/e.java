package nz2;

/* loaded from: classes9.dex */
public class e {

    /* renamed from: c, reason: collision with root package name */
    public nz2.c f423084c;

    /* renamed from: a, reason: collision with root package name */
    public int f423082a = -1;

    /* renamed from: b, reason: collision with root package name */
    public int f423083b = 0;

    /* renamed from: d, reason: collision with root package name */
    public boolean f423085d = false;

    public static nz2.e a(nz2.c cVar) {
        nz2.e eVar = new nz2.e();
        eVar.f423084c = cVar;
        int i17 = cVar.f423076a;
        if (i17 == 0) {
            eVar.f423082a = 0;
        } else if (i17 == 2002) {
            eVar.f423082a = 1;
        } else if (i17 == 2007 || i17 == 10308 || i17 == 2004 || i17 == 2005 || i17 == 2009 || i17 == 2010) {
            eVar.f423082a = 2;
            com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.jiv);
            int i18 = cVar.f423076a;
            if (i18 == 10308) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.jiw);
            } else if (i18 == 2007) {
                mz2.d2.IML.f414646f = true;
                eVar.f423085d = true;
            } else if (i18 == 2005) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.jiz);
            }
        }
        return eVar;
    }
}
