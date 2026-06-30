package z85;

/* loaded from: classes11.dex */
public class k extends l75.n0 {

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String[] f552336f = {l75.n0.m145250x3fdc6f77(z85.j.f552335z, "EmojiInfoDesc")};

    /* renamed from: g, reason: collision with root package name */
    public static final java.lang.String[] f552337g = {"create index if not exists descGroupIdIndex on EmojiInfoDesc ( groupId )", "create index if not exists descMd5Index on EmojiInfoDesc ( md5 )"};

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f552338d;

    /* renamed from: e, reason: collision with root package name */
    public final android.content.SharedPreferences f552339e;

    public k(l75.k0 k0Var) {
        super(k0Var, z85.j.f552335z, "EmojiInfoDesc", f552337g);
        this.f552338d = k0Var;
        this.f552339e = android.preference.PreferenceManager.getDefaultSharedPreferences(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
    }

    @Override // l75.n0, l75.g0
    /* renamed from: insert */
    public boolean mo880xb970c2b9(l75.f0 f0Var) {
        z85.j jVar = (z85.j) f0Var;
        if (jVar == null) {
            return false;
        }
        java.lang.String str = jVar.f68951x4b6e68b9;
        if (str == null) {
            str = "";
        }
        if (!(str.length() == 32)) {
            return false;
        }
        jVar.f68952x62706db4 = jVar.f68951x4b6e68b9 + jVar.f68950x225e3613;
        long m17 = this.f552338d.m("EmojiInfoDesc", "md5_lang", jVar.mo9763xeb27878e());
        if (m17 != -1) {
            java.lang.String str2 = jVar.f68951x4b6e68b9;
            mo145247xf35bbb4(str2 != null ? str2 : "");
        }
        return m17 >= 0;
    }

    public void y0(r45.sq4 sq4Var, java.lang.String str, java.lang.String str2) {
        if (sq4Var.f467458d == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.emoji.EmojiInfoDescStorage", "msg desc list is null");
            return;
        }
        z85.j jVar = new z85.j();
        jVar.f68949x861009b5 = str;
        jVar.f68951x4b6e68b9 = str2;
        java.util.Iterator it = sq4Var.f467458d.iterator();
        while (it.hasNext()) {
            r45.j54 j54Var = (r45.j54) it.next();
            jVar.f68947x225aa2b6 = j54Var.f459128e;
            jVar.f68950x225e3613 = j54Var.f459127d;
            jVar.f68952x62706db4 = jVar.f68951x4b6e68b9 + jVar.f68950x225e3613;
            this.f552338d.m("EmojiInfoDesc", "md5_lang", jVar.mo9763xeb27878e());
        }
    }
}
