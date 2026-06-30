package va1;

/* loaded from: classes7.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f515764a;

    public static void a(android.content.Context context) {
        java.lang.String str = wo.v1.f529364k.f529120b;
        if (f515764a) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WAGameShowFailDialogUtil", "hy: already shown");
            return;
        }
        java.lang.String string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e.getString(com.p314xaae8f345.mm.R.C30867xcad56011.a0v);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.d.a(context, !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) ? str : string, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572040x1), "", new va1.c(), new va1.d(), new va1.e());
        f515764a = true;
    }
}
