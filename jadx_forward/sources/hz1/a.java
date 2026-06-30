package hz1;

/* loaded from: classes13.dex */
public class a {

    /* renamed from: q, reason: collision with root package name */
    public static int f367818q;

    /* renamed from: r, reason: collision with root package name */
    public static java.util.List f367819r;

    /* renamed from: a, reason: collision with root package name */
    public final int f367820a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f367821b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f367822c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f367823d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f367824e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f367825f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f367826g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f367827h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f367828i;

    /* renamed from: k, reason: collision with root package name */
    public int f367830k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f367831l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f367832m;

    /* renamed from: p, reason: collision with root package name */
    public final int f367835p;

    /* renamed from: j, reason: collision with root package name */
    public int f367829j = -1;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f367833n = "";

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f367834o = "";

    public a(java.lang.String str) {
        p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f mo7430x19263085;
        if (str != null && !(str instanceof hz1.a)) {
            int hashCode = str.hashCode();
            this.f367820a = hashCode;
            java.lang.String simpleName = str.getClass().getSimpleName();
            this.f367822c = simpleName;
            this.f367821b = simpleName + "_" + hashCode;
            this.f367823d = str.getClass().getCanonicalName();
            boolean c17 = c(str.getClass().getSimpleName());
            this.f367826g = c17;
            boolean c18 = u46.l.c(str.getClass().getCanonicalName(), "com.tencent.mm.ui.chatting.ChattingUIFragment");
            this.f367827h = c18;
            boolean z17 = str instanceof p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670;
            this.f367825f = (!z17 || c18 || c17) ? false : true;
            this.f367824e = str instanceof p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f;
            this.f367828i = u46.l.c(simpleName, "MMFlutterViewActivity");
            if (str instanceof android.app.Activity) {
                this.f367830k = ((android.app.Activity) str).getTaskId();
            } else if (z17 && (mo7430x19263085 = ((p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670) str).mo7430x19263085()) != null) {
                this.f367830k = mo7430x19263085.getTaskId();
                this.f367835p = mo7430x19263085.hashCode();
            }
            if (this.f367830k <= 0) {
                this.f367830k = f367818q;
                return;
            }
            return;
        }
        if (sz1.a.j()) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Create SubstitutePage use illegal argument, page is ");
            sb6.append(str == null ? "null" : str);
            throw new java.lang.IllegalArgumentException(sb6.toString());
        }
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("Create SubstitutePage use illegal argument, page is ");
        sb7.append(str == null ? "null" : str);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Amoeba.SubstitutePage", sb7.toString());
    }

    public java.lang.String a() {
        return this.f367832m ? "mutil_task" : !u46.l.e(this.f367833n) ? this.f367833n : "";
    }

    public java.lang.String b() {
        return this.f367832m ? "mutil_task" : !u46.l.e(this.f367834o) ? this.f367834o : "";
    }

    public final boolean c(java.lang.String str) {
        if (u46.l.e(str)) {
            return false;
        }
        if (f367819r == null) {
            f367819r = new java.util.ArrayList(4);
            java.lang.String Zi = h62.d.vj().Zi(e42.d0.clicfg_data_report_4tab_page_config, "MainUI|MvvmAddressUIFragment|FindMoreFriendsUI|MoreTabUI", true);
            if (!u46.l.e(Zi)) {
                for (java.lang.String str2 : Zi.split("\\|")) {
                    if (!((java.util.ArrayList) f367819r).contains(str2)) {
                        ((java.util.ArrayList) f367819r).add(str2);
                    }
                }
            }
        }
        java.util.Iterator it = ((java.util.ArrayList) f367819r).iterator();
        while (it.hasNext()) {
            if (u46.l.c(str, (java.lang.String) it.next())) {
                return true;
            }
        }
        return false;
    }

    public boolean d(hz1.a aVar) {
        return aVar != null && u46.l.c(aVar.f367822c, this.f367822c) && u46.l.c(aVar.f367823d, this.f367823d) && aVar.f367820a == this.f367820a;
    }

    /* renamed from: toString */
    public java.lang.String m134282x9616526c() {
        return "SubstitutePage{pageHash=" + this.f367820a + ", simplePageName='" + this.f367822c + "', canonicalPageName='" + this.f367823d + "', stackDeep='" + this.f367829j + "', isSubPage=" + this.f367825f + "', isParentPage=" + this.f367824e + "', isFlutterPage=" + this.f367828i + "', isSubPage=" + this.f367825f + "', is4TabOfLauncherUI=" + this.f367826g + "', title=null', taskId=" + this.f367830k + "', isBackground=" + this.f367831l + "', isMutilTask=" + this.f367832m + "', origEnterMethod=" + this.f367834o + "', currEnterMethod=" + this.f367833n + "', isChattingUIFragment=" + this.f367827h + '}';
    }

    public a(int i17, java.lang.String str, java.lang.String str2) {
        this.f367820a = i17;
        this.f367822c = str;
        this.f367821b = str + "_" + i17;
        this.f367823d = str2;
        boolean c17 = c(str);
        this.f367826g = c17;
        boolean c18 = u46.l.c(str2, "com.tencent.mm.ui.chatting.ChattingUIFragment");
        this.f367827h = c18;
        this.f367825f = (!u46.l.c(str2, "androidx.fragment.app.Fragment") || c18 || c17) ? false : true;
        this.f367824e = u46.l.c(str2, "androidx.fragment.app.FragmentActivity");
        this.f367828i = u46.l.c(str, "MMFlutterViewActivity");
    }
}
