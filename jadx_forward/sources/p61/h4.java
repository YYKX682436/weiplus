package p61;

/* loaded from: classes11.dex */
public class h4 extends p61.z3 {

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f433815o;

    /* renamed from: p, reason: collision with root package name */
    public p61.x3 f433816p;

    /* renamed from: q, reason: collision with root package name */
    public final p61.y3 f433817q;

    public h4(android.content.Context context, com.p314xaae8f345.mm.ui.y9 y9Var) {
        super(context, new r61.a());
        this.f433817q = new p61.a4(this);
        this.f294144h = y9Var;
        this.f294141e = context;
        r(true);
    }

    public static void t(p61.h4 h4Var, r61.a aVar) {
        h4Var.getClass();
        ns.k kVar = (ns.k) i95.n0.c(ns.k.class);
        android.content.Context context = h4Var.f294141e;
        p61.c4 c4Var = new p61.c4(h4Var);
        ((ms.a) kVar).getClass();
        r35.a aVar2 = new r35.a(context, c4Var);
        aVar2.f450540e = new p61.d4(h4Var, aVar);
        android.content.Context context2 = h4Var.f294141e;
        if (context2 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1009x2e243d.ui.ActivityC11370x9b57e494) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1009x2e243d.ui.ActivityC11370x9b57e494) context2).m78545xde66c1f2(new p61.e4(h4Var, aVar));
        }
        aVar2.f450557y = aVar.e();
        aVar2.f450555w = false;
        java.util.LinkedList linkedList = new java.util.LinkedList();
        linkedList.add(13);
        aVar2.b(aVar.i(), linkedList, false, "");
    }

    @Override // com.p314xaae8f345.mm.ui.z9
    public java.lang.Object d(java.lang.Object obj, android.database.Cursor cursor) {
        r61.a aVar = (r61.a) obj;
        if (aVar == null) {
            aVar = new r61.a();
        }
        aVar.b(cursor);
        return aVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x013d, code lost:
    
        if (r0 != 2) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0159  */
    @Override // android.widget.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View getView(int r13, android.view.View r14, android.view.ViewGroup r15) {
        /*
            Method dump skipped, instructions count: 458
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p61.h4.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    @Override // com.p314xaae8f345.mm.ui.z9
    public void q() {
        java.lang.String str;
        c();
        ((m61.i) ((y61.e) i95.n0.c(y61.e.class))).getClass();
        r61.b wi6 = m61.k.wi();
        java.lang.String str2 = this.f433815o;
        wi6.getClass();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        if (str2 != null && str2.length() > 0) {
            sb6.append(" and ( ");
            sb6.append("addr_upload2.realname like '%" + str2 + "%' or ");
            sb6.append("addr_upload2.realnamepyinitial like '%" + str2 + "%' or ");
            sb6.append("addr_upload2.realnamequanpin like '%" + str2 + "%' or ");
            sb6.append("addr_upload2.username like '%" + str2 + "%' or ");
            sb6.append("addr_upload2.nickname like '%" + str2 + "%' or ");
            sb6.append("addr_upload2.nicknamepyinitial like '%" + str2 + "%' or ");
            sb6.append("addr_upload2.nicknamequanpin like '%" + str2 + "%' )");
        }
        sb6.append(" and (addr_upload2.status=1 or addr_upload2.status=2)");
        java.lang.String str3 = (java.lang.String) gm0.j1.u().c().l(6, null);
        if (android.text.TextUtils.isEmpty(str3)) {
            str = "select addr_upload2.id,addr_upload2.md5,addr_upload2.peopleid,addr_upload2.uploadtime,addr_upload2.realname,addr_upload2.realnamepyinitial,addr_upload2.realnamequanpin,addr_upload2.username,addr_upload2.nickname,addr_upload2.nicknamepyinitial,addr_upload2.nicknamequanpin,addr_upload2.type,addr_upload2.moblie,addr_upload2.email,addr_upload2.status,addr_upload2.reserved1,addr_upload2.reserved2,addr_upload2.reserved3,addr_upload2.reserved4,addr_upload2.lvbuf,addr_upload2.showhead from addr_upload2  where type = 0" + ((java.lang.Object) sb6) + " order by showhead";
        } else {
            str = "select addr_upload2.id,addr_upload2.md5,addr_upload2.peopleid,addr_upload2.uploadtime,addr_upload2.realname,addr_upload2.realnamepyinitial,addr_upload2.realnamequanpin,addr_upload2.username,addr_upload2.nickname,addr_upload2.nicknamepyinitial,addr_upload2.nicknamequanpin,addr_upload2.type,addr_upload2.moblie,addr_upload2.email,addr_upload2.status,addr_upload2.reserved1,addr_upload2.reserved2,addr_upload2.reserved3,addr_upload2.reserved4,addr_upload2.lvbuf,addr_upload2.showhead from addr_upload2  where type = 0 and moblie <> " + str3 + ((java.lang.Object) sb6) + " order by showhead";
        }
        s(wi6.f474352d.B(str, null));
        int[] iArr = new int[getCount()];
        p61.x3 x3Var = this.f433816p;
        if (x3Var != null && this.f433815o != null) {
            int count = j().getCount();
            com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1009x2e243d.ui.ActivityC11370x9b57e494 activityC11370x9b57e494 = ((p61.v4) x3Var).f433931a;
            if (count > 0) {
                activityC11370x9b57e494.f154623n.setVisibility(8);
            } else {
                activityC11370x9b57e494.f154623n.setVisibility(0);
            }
        }
        notifyDataSetChanged();
    }
}
