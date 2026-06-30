package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes.dex */
public final class x40 implements com.p314xaae8f345.mm.ui.zc {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.q50 f201820a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f201821b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r45.re2 f201822c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f201823d;

    public x40(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.q50 q50Var, boolean z17, r45.re2 re2Var, boolean z18) {
        this.f201820a = q50Var;
        this.f201821b = z17;
        this.f201822c = re2Var;
        this.f201823d = z18;
    }

    @Override // com.p314xaae8f345.mm.ui.zc
    public final void a(int i17, android.content.Intent intent) {
        byte[] byteArrayExtra;
        if (intent == null || (byteArrayExtra = intent.getByteArrayExtra("KEY_PARAMS_WHITE_LIST")) == null) {
            return;
        }
        r45.re2 re2Var = new r45.re2();
        re2Var.mo11468x92b714fd(byteArrayExtra);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.q50 q50Var = this.f201820a;
        r45.re2 re2Var2 = q50Var.f201037z1;
        re2Var2.m75941xfb821914(2).clear();
        re2Var2.m75941xfb821914(1).clear();
        re2Var2.m75941xfb821914(0).clear();
        re2Var2.m75941xfb821914(2).addAll(re2Var.m75941xfb821914(2));
        re2Var2.m75941xfb821914(1).addAll(re2Var.m75941xfb821914(1));
        re2Var2.m75941xfb821914(0).addAll(re2Var.m75941xfb821914(0));
        boolean z17 = this.f201821b;
        r45.re2 re2Var3 = this.f201822c;
        if (z17) {
            if (re2Var3 != null) {
                java.util.LinkedList m75941xfb821914 = re2Var.m75941xfb821914(0);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getChatroom_id_list(...)");
                pm0.v.d0(m75941xfb821914, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.u40(re2Var3));
                java.util.LinkedList m75941xfb8219142 = re2Var.m75941xfb821914(1);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb8219142, "getUsername_list(...)");
                pm0.v.d0(m75941xfb8219142, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.v40(re2Var3));
                java.util.LinkedList m75941xfb8219143 = re2Var.m75941xfb821914(2);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb8219143, "getContact_list(...)");
                pm0.v.d0(m75941xfb8219143, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.w40(re2Var3));
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("add white-list, chatroom_id_list = ");
            java.util.LinkedList m75941xfb8219144 = re2Var.m75941xfb821914(0);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb8219144, "getChatroom_id_list(...)");
            sb6.append(kz5.n0.g0(m75941xfb8219144, "|", null, null, 0, null, null, 62, null));
            sb6.append(", username_list = ");
            java.util.LinkedList m75941xfb8219145 = re2Var.m75941xfb821914(1);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb8219145, "getUsername_list(...)");
            sb6.append(kz5.n0.g0(m75941xfb8219145, "|", null, null, 0, null, null, 62, null));
            sb6.append(", contact_list = ");
            java.util.LinkedList m75941xfb8219146 = re2Var.m75941xfb821914(2);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb8219146, "getContact_list(...)");
            sb6.append(kz5.n0.g0(m75941xfb8219146, "|", null, null, 0, null, null, 62, null));
            sb6.append(", ");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLivingWhiteListPanel", sb6.toString());
        } else if (this.f201823d) {
            if (re2Var3 != null) {
                java.util.LinkedList m75941xfb8219147 = re2Var3.m75941xfb821914(0);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb8219147, "getChatroom_id_list(...)");
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (java.lang.Object obj : m75941xfb8219147) {
                    if (!re2Var.m75941xfb821914(0).contains((java.lang.String) obj)) {
                        arrayList.add(obj);
                    }
                }
                re2Var.set(0, new java.util.LinkedList(arrayList));
                java.util.LinkedList m75941xfb8219148 = re2Var3.m75941xfb821914(1);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb8219148, "getUsername_list(...)");
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                for (java.lang.Object obj2 : m75941xfb8219148) {
                    if (!re2Var.m75941xfb821914(1).contains((java.lang.String) obj2)) {
                        arrayList2.add(obj2);
                    }
                }
                re2Var.set(1, new java.util.LinkedList(arrayList2));
                java.util.LinkedList m75941xfb8219149 = re2Var3.m75941xfb821914(2);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb8219149, "getContact_list(...)");
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                for (java.lang.Object obj3 : m75941xfb8219149) {
                    if (!re2Var.m75941xfb821914(2).contains((java.lang.String) obj3)) {
                        arrayList3.add(obj3);
                    }
                }
                re2Var.set(2, new java.util.LinkedList(arrayList3));
            }
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("remove white-list, chatroom_id_list = ");
            java.util.LinkedList m75941xfb82191410 = re2Var.m75941xfb821914(0);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb82191410, "getChatroom_id_list(...)");
            sb7.append(kz5.n0.g0(m75941xfb82191410, "|", null, null, 0, null, null, 62, null));
            sb7.append(", username_list = ");
            java.util.LinkedList m75941xfb82191411 = re2Var.m75941xfb821914(1);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb82191411, "getUsername_list(...)");
            sb7.append(kz5.n0.g0(m75941xfb82191411, "|", null, null, 0, null, null, 62, null));
            sb7.append(", contact_list = ");
            java.util.LinkedList m75941xfb82191412 = re2Var.m75941xfb821914(2);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb82191412, "getContact_list(...)");
            sb7.append(kz5.n0.g0(m75941xfb82191412, "|", null, null, 0, null, null, 62, null));
            sb7.append(", ");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLivingWhiteListPanel", sb7.toString());
        }
        r45.re2 re2Var4 = q50Var.f201036y1;
        if (re2Var4 == null) {
            q50Var.f201036y1 = re2Var;
        } else {
            if (re2Var4 != null) {
                re2Var4.set(0, re2Var.m75941xfb821914(0));
            }
            r45.re2 re2Var5 = q50Var.f201036y1;
            if (re2Var5 != null) {
                re2Var5.set(1, re2Var.m75941xfb821914(1));
            }
            r45.re2 re2Var6 = q50Var.f201036y1;
            if (re2Var6 != null) {
                re2Var6.set(2, re2Var.m75941xfb821914(2));
            }
        }
        q50Var.i0();
    }
}
