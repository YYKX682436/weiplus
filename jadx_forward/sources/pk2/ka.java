package pk2;

/* loaded from: classes3.dex */
public final class ka extends qk2.h {

    /* renamed from: h, reason: collision with root package name */
    public final int f437458h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f437459i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ka(pk2.o9 helper, int i17) {
        super(helper, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(helper, "helper");
        this.f437458h = helper.f437645u;
        this.f437459i = "";
    }

    @Override // qk2.h
    public void B(pk2.o9 o9Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.yx yxVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(o9Var, "<this>");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.sx sxVar = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.yx.f202011f;
        pk2.o9 o9Var2 = this.f445960a;
        if (sxVar.b(o9Var2.f437611d, o9Var2.f437607b)) {
            java.lang.Object obj = null;
            pk2.f8.f437280a.c(1, 2, null);
            java.util.List list = ((mm2.o4) o9Var.c(mm2.o4.class)).f410860v;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(list, "<get-audienceLinkMicUserList>(...)");
            synchronized (list) {
                java.util.Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    java.lang.Object next = it.next();
                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(((km2.q) next).f390703a, ((mm2.c1) o9Var.c(mm2.c1.class)).m8())) {
                        obj = next;
                        break;
                    }
                }
            }
            boolean z17 = obj != null;
            boolean E7 = ((mm2.o4) o9Var.c(mm2.o4.class)).E7();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(o9Var.f437605a, "showCustomerVideoLevel linking:" + z17 + ",linkWait:" + E7);
            if (z17 || E7) {
                db5.t7.b(this.f445960a.f437611d, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.egv));
                return;
            }
            boolean z18 = ((mm2.c1) o9Var.c(mm2.c1.class)).V4 != 0;
            boolean m40080x23b734ff = com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40080x23b734ff(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
            if (!z18 && m40080x23b734ff) {
                pk2.d9 d9Var = o9Var.f437615f;
                if (d9Var == null || (yxVar = d9Var.f437200j) == null) {
                    return;
                }
                yxVar.b(o9Var.h(), 1);
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(o9Var.f437605a, "anchor pause live:" + z18 + ",networkEnable:" + m40080x23b734ff + '!');
            db5.t7.b(this.f445960a.f437611d, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.egu));
        }
    }

    @Override // qk2.f
    public java.lang.String i() {
        return this.f437459i;
    }

    @Override // qk2.f
    public boolean o() {
        java.lang.Object obj;
        boolean z17;
        java.lang.String str;
        ae2.in inVar = ae2.in.f85221a;
        if (((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.f85461y4).mo141623x754a37bb()).r()).intValue() != 0 || zl2.r4.f555483a.X1(((mm2.e1) this.f445960a.c(mm2.e1.class)).f410522s)) {
            return false;
        }
        java.util.List list = ((mm2.o4) this.f445960a.c(mm2.o4.class)).f410860v;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(list, "<get-audienceLinkMicUserList>(...)");
        synchronized (list) {
            java.util.Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(((km2.q) obj).f390703a, ((mm2.c1) this.f445960a.c(mm2.c1.class)).m8())) {
                    break;
                }
            }
        }
        boolean z18 = obj != null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.sx sxVar = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.yx.f202011f;
        kn0.r c17 = sxVar.c(z18);
        if (c17 != null && (str = c17.f391131c) != null) {
            if (str.length() == 0) {
                z17 = true;
                if (z17 && sxVar.a()) {
                    return true;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f445960a.f437605a, "showLevel:" + c17 + ", and not contain video level!");
                return false;
            }
        }
        z17 = false;
        if (z17) {
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f445960a.f437605a, "showLevel:" + c17 + ", and not contain video level!");
        return false;
    }

    @Override // qk2.h
    public void v(pk2.o9 o9Var, db5.g4 menu) {
        java.lang.Object obj;
        java.lang.String str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(o9Var, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(menu, "menu");
        java.util.List list = ((mm2.o4) o9Var.c(mm2.o4.class)).f410860v;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(list, "<get-audienceLinkMicUserList>(...)");
        synchronized (list) {
            java.util.Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(((km2.q) obj).f390703a, ((mm2.c1) o9Var.c(mm2.c1.class)).m8())) {
                        break;
                    }
                }
            }
        }
        kn0.r c17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.yx.f202011f.c(obj != null);
        if (c17 == null || (str = c17.f391131c) == null) {
            str = "";
        }
        java.lang.String str2 = str;
        java.lang.String string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573217dx3, str2);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        menu.l(this.f437458h, pk2.o9.b(o9Var, string, str2, 0, 4, null), com.p314xaae8f345.mm.R.raw.f79199x17646e55, ((mm2.c1) o9Var.c(mm2.c1.class)).f8());
        pk2.d9 d9Var = o9Var.f437615f;
        if (d9Var != null) {
            d9Var.f437200j = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.yx(o9Var.f437611d, o9Var.f437607b);
        }
        pk2.d9 d9Var2 = o9Var.f437615f;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.yx yxVar = d9Var2 != null ? d9Var2.f437200j : null;
        if (yxVar != null) {
            yxVar.f202015d = c17;
        }
        pk2.f8.f437280a.c(1, 1, null);
    }

    @Override // qk2.h
    public int y() {
        return this.f437458h;
    }
}
