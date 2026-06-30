package vi1;

/* loaded from: classes7.dex */
public final class c2 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1176xef7fce37.ActivityC12544xcfbd2e8a f518821d;

    public c2(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1176xef7fce37.ActivityC12544xcfbd2e8a activityC12544xcfbd2e8a) {
        this.f518821d = activityC12544xcfbd2e8a;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        boolean z17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        vi1.h0 h0Var = this.f518821d.B;
        if (h0Var != null) {
            vi1.b2 b2Var = (vi1.b2) h0Var;
            if (b2Var.f518815f.size() >= 0) {
                java.util.Iterator it6 = b2Var.f518815f.iterator();
                while (it6.hasNext()) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1176xef7fce37.C12542x3a17e581 c12542x3a17e581 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1176xef7fce37.C12542x3a17e581) it6.next();
                    vi1.l2 l2Var = vi1.l2.f518934a;
                    vi1.j2 a17 = l2Var.a(b2Var.f518811b);
                    if (a17 != null) {
                        vi1.j2 a18 = l2Var.a(b2Var.f518811b);
                        java.lang.Long valueOf = a18 != null ? java.lang.Long.valueOf(a18.f518905u) : null;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(valueOf);
                        a17.f518905u = valueOf.longValue() + 1;
                    }
                    java.lang.String appId = b2Var.f518811b;
                    java.lang.String mobile = c12542x3a17e581.f168932d;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mobile, "mobile");
                    vi1.a2 a2Var = new vi1.a2(b2Var);
                    r45.ys6 ys6Var = new r45.ys6();
                    ys6Var.f472871d = appId;
                    ys6Var.f472872e = mobile;
                    ys6Var.f472873f = 1;
                    ((km5.q) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1162xe37ee6f4.c0) nd.f.a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1162xe37ee6f4.c0.class)).e1("/cgi-bin/mmbiz-bin/wxaapp/customphone/updateuserphone", appId, ys6Var, r45.zs6.class).n(new vi1.r(a2Var))).s(new vi1.s(a2Var));
                }
            }
            vi1.o0 o0Var = vi1.o0.f518949a;
            java.util.ArrayList arrayList = b2Var.f518815f;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(arrayList);
            synchronized (o0Var) {
                java.util.ArrayList arrayList2 = (java.util.ArrayList) o0Var.b();
                java.util.Iterator it7 = arrayList.iterator();
                while (it7.hasNext()) {
                    arrayList2.remove((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1176xef7fce37.C12542x3a17e581) it7.next());
                }
                java.util.Iterator it8 = arrayList2.iterator();
                while (true) {
                    if (!it8.hasNext()) {
                        z17 = false;
                        break;
                    }
                    if (((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1176xef7fce37.C12542x3a17e581) it8.next()).f168940o) {
                        z17 = true;
                        break;
                    }
                }
                if (!z17 && arrayList2.size() >= 1) {
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1176xef7fce37.C12542x3a17e581) arrayList2.get(0)).f168940o = true;
                }
                o0Var.d(arrayList2);
            }
        }
        this.f518821d.U6(false);
        this.f518821d.V6();
        return true;
    }
}
