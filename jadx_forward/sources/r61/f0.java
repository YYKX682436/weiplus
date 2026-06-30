package r61;

/* loaded from: classes11.dex */
public class f0 extends l75.s0 {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String[] f474401e = {"CREATE TABLE IF NOT EXISTS facebookfriend ( fbid long  PRIMARY KEY , fbname text  , fbimgkey int  , status int  , username text  , nickname text  , nicknamepyinitial text  , nicknamequanpin text  , sex int  , personalcard int  , province text  , city text  , signature text  , alias text  , type int  , email text  ) "};

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f474402d;

    public f0(l75.k0 k0Var) {
        this.f474402d = k0Var;
    }

    public boolean m0(r61.e0 e0Var) {
        iz5.a.g("Func Set always conv_flag == flag_all", e0Var.f474391q == -1);
        long j17 = e0Var.f474375a;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("select facebookfriend.fbid,facebookfriend.fbname,facebookfriend.fbimgkey,facebookfriend.status,facebookfriend.username,facebookfriend.nickname,facebookfriend.nicknamepyinitial,facebookfriend.nicknamequanpin,facebookfriend.sex,facebookfriend.personalcard,facebookfriend.province,facebookfriend.city,facebookfriend.signature,facebookfriend.alias,facebookfriend.type,facebookfriend.email from facebookfriend   where facebookfriend.fbid = \"");
        java.lang.String str = "" + j17;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.n(str);
        sb6.append(str);
        sb6.append("\"");
        java.lang.String sb7 = sb6.toString();
        l75.k0 k0Var = this.f474402d;
        android.database.Cursor f17 = k0Var.f(sb7, null, 2);
        boolean moveToFirst = f17.moveToFirst();
        f17.close();
        if (!moveToFirst) {
            e0Var.f474391q = -1;
            return ((int) k0Var.l("facebookfriend", "fbid", e0Var.b())) != -1;
        }
        int p17 = k0Var.p("facebookfriend", e0Var.b(), "fbid=?", new java.lang.String[]{"" + e0Var.f474375a});
        if (p17 > 0) {
            m145262xf35bbb4();
        }
        return p17 > 0;
    }
}
