package j93;

/* loaded from: classes.dex */
public final class q2 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j93.v2 f380017a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r45.ip4 f380018b;

    public q2(j93.v2 v2Var, r45.ip4 ip4Var) {
        this.f380017a = v2Var;
        this.f380018b = ip4Var;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        if (fVar == null) {
            return null;
        }
        int i17 = fVar.f152148a;
        j93.v2 v2Var = this.f380017a;
        if (i17 != 0 || fVar.f152149b != 0) {
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 context = v2Var.m158354x19263085();
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4 f4Var = v2Var.f380057n;
            java.lang.String string = v2Var.m158354x19263085().getString(com.p314xaae8f345.mm.R.C30867xcad56011.mba);
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
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 k17 = ((em.l2) ((jz5.n) v2Var.f380050d).mo141623x754a37bb()).k();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(k17, "getSelectContactRv(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1925x6c8df6be.C16718x7059cefe a17 = xm3.u0.a(k17);
        if (a17 != null) {
            java.util.LinkedList<r45.gw6> UserLabelInfoList = this.f380018b.f458789e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(UserLabelInfoList, "UserLabelInfoList");
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(UserLabelInfoList, 10));
            for (r45.gw6 gw6Var : UserLabelInfoList) {
                ri5.h hVar = ri5.j.I;
                java.lang.String UserName = gw6Var.f457114d;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(UserName, "UserName");
                arrayList.add(hVar.a(UserName, ri5.j.Z, 0));
            }
            a17.t(arrayList);
        }
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 context2 = v2Var.m158354x19263085();
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4 f4Var2 = v2Var.f380057n;
        java.lang.String string2 = v2Var.m158354x19263085().getString(com.p314xaae8f345.mm.R.C30867xcad56011.mb_);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context2, "context");
        if (f4Var2 != null) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var3 = f4Var2.f293324d;
            e4Var3.getClass();
            e4Var3.f293309c = string2;
            e4Var3.b(com.p314xaae8f345.mm.R.raw.f78821xb211a201);
            e4Var3.e();
            return fVar;
        }
        int i19 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var4 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(context2);
        e4Var4.f293309c = string2;
        e4Var4.b(com.p314xaae8f345.mm.R.raw.f78821xb211a201);
        e4Var4.c();
        return fVar;
    }
}
