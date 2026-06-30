package y63;

/* loaded from: classes5.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f541185a = "";

    /* renamed from: b, reason: collision with root package name */
    public int f541186b = 0;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f541187c = " ";

    /* renamed from: d, reason: collision with root package name */
    public long f541188d = com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.f58001x610e5697;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f541189e = "";

    /* renamed from: f, reason: collision with root package name */
    public int f541190f = 0;

    public static boolean b(java.lang.String str, java.lang.String str2) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            return false;
        }
        return com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(str.replaceAll(j62.e.g().j("clicfg_android_solitaire_content_equal_white_list_regex", "(\\.|。|,|，|:|：|;|；|、|-|\\s)", true, true), "").replace(" ", "").toLowerCase(), str2.replaceAll(j62.e.g().j("clicfg_android_solitaire_content_equal_white_list_regex", "(\\.|。|,|，|:|：|;|；|、|-|\\s)", true, true), "").replace(" ", "").toLowerCase());
    }

    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public y63.b m176557x5a5dd5d() {
        y63.b bVar;
        java.lang.Exception e17;
        try {
            bVar = new y63.b();
            try {
                bVar.f541185a = this.f541185a;
                bVar.f541186b = this.f541186b;
                bVar.f541187c = this.f541187c;
                bVar.f541188d = this.f541188d;
                bVar.f541189e = this.f541189e;
                bVar.f541190f = this.f541190f;
            } catch (java.lang.Exception e18) {
                e17 = e18;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.groupsolitaire.GroupSolitatireItem", "clone() Exception:%s %s", e17.getClass(), e17.getMessage());
                return bVar;
            }
        } catch (java.lang.Exception e19) {
            bVar = null;
            e17 = e19;
        }
        return bVar;
    }

    /* renamed from: equals */
    public boolean m176558xb2c87fbf(java.lang.Object obj) {
        y63.b bVar = (y63.b) obj;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(this.f541185a, bVar.f541185a)) {
            return com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(this.f541189e.trim(), bVar.f541189e.trim());
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(this.f541189e.trim(), bVar.f541189e.trim())) {
            return true;
        }
        return b(this.f541189e.trim(), bVar.f541189e.trim());
    }

    /* renamed from: hashCode */
    public int m176559x8cdac1b() {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f541189e) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f541189e.trim())) {
            return 0;
        }
        return this.f541189e.trim().replaceAll(j62.e.g().j("clicfg_android_solitaire_content_equal_white_list_regex", "(\\.|。|,|，|:|：|;|；|、|-|\\s)", true, true), "").replace(" ", "").toLowerCase().hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m176560x9616526c() {
        return "GroupSolitatireItem{username='" + this.f541185a + "', asheader=" + this.f541186b + ", separator='" + this.f541187c + "', createtime=" + this.f541188d + ", content='" + this.f541189e + "', orderNum='" + this.f541190f + "'}";
    }
}
