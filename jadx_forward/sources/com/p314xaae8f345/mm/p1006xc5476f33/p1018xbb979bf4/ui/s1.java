package com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui;

/* loaded from: classes15.dex */
public final class s1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4 f156155d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.ActivityC11495xd59e7ca0 f156156e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s1(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4 f4Var, com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.ActivityC11495xd59e7ca0 activityC11495xd59e7ca0) {
        super(1);
        this.f156155d = f4Var;
        this.f156156e = activityC11495xd59e7ca0;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        boolean z17;
        r45.zi5 zi5Var = (r45.zi5) obj;
        this.f156155d.dismiss();
        boolean z18 = zi5Var == null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.ActivityC11495xd59e7ca0 activityC11495xd59e7ca0 = this.f156156e;
        if (!z18) {
            java.util.Map map = com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.ActivityC11495xd59e7ca0.H;
            activityC11495xd59e7ca0.getClass();
            java.util.List i17 = kz5.c0.i(zi5Var.f473649n, zi5Var.f473650o, zi5Var.f473644f, zi5Var.f473645g, zi5Var.f473646h, zi5Var.f473652q, zi5Var.f473648m, zi5Var.f473647i);
            if (!i17.isEmpty()) {
                java.util.Iterator it = i17.iterator();
                while (it.hasNext()) {
                    if (((r45.du5) it.next()).f454290e) {
                        z17 = false;
                        break;
                    }
                }
            }
            z17 = true;
            if (!z17) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.C11487xdaa53b89 c11487xdaa53b89 = activityC11495xd59e7ca0.f156013y;
                if (c11487xdaa53b89 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("addrRegion");
                    throw null;
                }
                java.util.List I = kz5.z.I(new r45.du5[]{zi5Var.f473644f, zi5Var.f473645g, zi5Var.f473646h, zi5Var.f473652q});
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.util.Iterator it6 = ((java.util.ArrayList) I).iterator();
                while (it6.hasNext()) {
                    java.lang.Object next = it6.next();
                    java.lang.String str = ((r45.du5) next).f454289d;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "toString(...)");
                    if (str.length() > 0) {
                        arrayList.add(next);
                    }
                }
                c11487xdaa53b89.m48724x765074af(kz5.n0.g0(arrayList, " ", null, null, 0, null, null, 62, null));
                com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.C11487xdaa53b89 c11487xdaa53b892 = activityC11495xd59e7ca0.f156014z;
                if (c11487xdaa53b892 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("addrDetailed");
                    throw null;
                }
                java.lang.String str2 = zi5Var.f473648m.f454289d;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str2, "toString(...)");
                c11487xdaa53b892.m48724x765074af(str2);
                com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.C11487xdaa53b89 c11487xdaa53b893 = activityC11495xd59e7ca0.A;
                if (c11487xdaa53b893 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("addrName");
                    throw null;
                }
                java.lang.String str3 = zi5Var.f473649n.f454289d;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str3, "toString(...)");
                c11487xdaa53b893.m48724x765074af(str3);
                com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.C11487xdaa53b89 c11487xdaa53b894 = activityC11495xd59e7ca0.B;
                if (c11487xdaa53b894 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("addrPhone");
                    throw null;
                }
                c11487xdaa53b894.m48717x7648dd6f(zi5Var.f473653r.f454289d);
                com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.C11487xdaa53b89 c11487xdaa53b895 = activityC11495xd59e7ca0.B;
                if (c11487xdaa53b895 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("addrPhone");
                    throw null;
                }
                java.lang.String str4 = zi5Var.f473650o.f454289d;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str4, "toString(...)");
                c11487xdaa53b895.m48724x765074af(str4);
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2750xade22732.C22661xa3a2b3c0 c22661xa3a2b3c0 = activityC11495xd59e7ca0.D;
                if (c22661xa3a2b3c0 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("addrFinish");
                    throw null;
                }
                c22661xa3a2b3c0.setEnabled(activityC11495xd59e7ca0.X6());
                r45.du5 du5Var = zi5Var.f473651p;
                if (du5Var != null) {
                    java.lang.String str5 = du5Var.f454289d;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str5, "toString(...)");
                    activityC11495xd59e7ca0.C = str5;
                }
                return jz5.f0.f384359a;
            }
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(activityC11495xd59e7ca0.mo55332x76847179());
        e4Var.f293309c = activityC11495xd59e7ca0.getString(com.p314xaae8f345.mm.R.C30867xcad56011.mcv);
        e4Var.c();
        return jz5.f0.f384359a;
    }
}
