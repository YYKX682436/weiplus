package j93;

/* loaded from: classes11.dex */
public final class s0 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j93.x0 f380025a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f380026b;

    public s0(j93.x0 x0Var, java.lang.String str) {
        this.f380025a = x0Var;
        this.f380026b = str;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        java.util.ArrayList arrayList;
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        if (fVar == null) {
            return null;
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.g) vg3.n3.f518269n1.a()).wi(new vg3.e(vg3.d.f518217m, vg3.b.f518179f, vg3.c.f518203y, fVar.f152149b, null, 16, null));
        int i17 = fVar.f152148a;
        j93.x0 x0Var = this.f380025a;
        if (i17 != 0 || fVar.f152149b != 0) {
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 context = x0Var.m158354x19263085();
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4 f4Var = x0Var.f380066f;
            java.lang.String string = x0Var.m158354x19263085().getString(com.p314xaae8f345.mm.R.C30867xcad56011.mba);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
            if (f4Var != null) {
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var = f4Var.f293324d;
                e4Var.getClass();
                e4Var.f293309c = string;
                e4Var.b(com.p314xaae8f345.mm.R.raw.f79770xc84f57c6);
                e4Var.e();
                return fVar;
            }
            int i18 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var2 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(context);
            e4Var2.f293309c = string;
            e4Var2.b(com.p314xaae8f345.mm.R.raw.f79770xc84f57c6);
            e4Var2.c();
            return fVar;
        }
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 context2 = x0Var.m158354x19263085();
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4 f4Var2 = x0Var.f380066f;
        java.lang.String string2 = x0Var.m158354x19263085().getString(com.p314xaae8f345.mm.R.C30867xcad56011.mb_);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context2, "context");
        if (f4Var2 != null) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var3 = f4Var2.f293324d;
            e4Var3.getClass();
            e4Var3.f293309c = string2;
            e4Var3.b(com.p314xaae8f345.mm.R.raw.f78821xb211a201);
            e4Var3.e();
        } else {
            int i19 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var4 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(context2);
            e4Var4.f293309c = string2;
            e4Var4.b(com.p314xaae8f345.mm.R.raw.f78821xb211a201);
            e4Var4.c();
        }
        java.lang.String str = x0Var.f380064d;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("doInsertOrUpdateLabel() called with: id = ");
        java.lang.String str2 = this.f380026b;
        sb6.append(str2);
        sb6.append(", name = ");
        sb6.append(str);
        sb6.append(", isNewLabel = false");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ReNameLabelDialogUIC", sb6.toString());
        java.lang.Integer h17 = r26.h0.h(str2);
        if (h17 != null) {
            com.p314xaae8f345.mm.p2621x8fb0427b.d4 n17 = b93.r.wi().n1(str2);
            if (n17 == null) {
                n17 = new com.p314xaae8f345.mm.p2621x8fb0427b.d4();
            }
            n17.f66585x70ce48ca = h17.intValue();
            n17.f66586x7661fe9a = str;
            n17.f66587x68c44467 = x51.k.a(str);
            n17.f66588xb0759da4 = x51.k.b(str);
            b93.r.wi().mo9952xce0038c9(n17, "labelID");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ReNameLabelDialogUIC", "id is not integer type: ".concat(str2));
        }
        x0Var.m158359x1e885992().putExtra("label_name", x0Var.f380064d);
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 k17 = ((em.l2) ((jz5.n) x0Var.f380065e).mo141623x754a37bb()).k();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(k17, "getSelectContactRv(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1925x6c8df6be.C16718x7059cefe a17 = xm3.u0.a(k17);
        java.lang.String str3 = x0Var.f380064d + '(' + ((a17 == null || (arrayList = a17.f233598o) == null) ? 0 : arrayList.size()) + ')';
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = x0Var.m158354x19263085();
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = m158354x19263085 instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf ? (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) m158354x19263085 : null;
        if (abstractActivityC21394xb3d2c0cf == null) {
            return fVar;
        }
        abstractActivityC21394xb3d2c0cf.mo54450xbf7c1df6(str3);
        return fVar;
    }
}
