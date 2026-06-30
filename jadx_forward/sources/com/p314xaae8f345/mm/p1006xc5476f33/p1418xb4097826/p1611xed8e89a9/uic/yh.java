package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic;

/* loaded from: classes2.dex */
public final class yh implements ly1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.C14908x54e651e6 f205932a;

    public yh(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.C14908x54e651e6 c14908x54e651e6) {
        this.f205932a = c14908x54e651e6;
    }

    @Override // ly1.a
    public final java.util.Map b(java.lang.String str) {
        java.lang.String str2;
        java.lang.String m75945x2fec8307;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.C14908x54e651e6 c14908x54e651e6 = this.f205932a;
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 context = c14908x54e651e6.m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = context instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a(context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
        r45.qt2 V6 = nyVar != null ? nyVar.V6() : null;
        jz5.l[] lVarArr = new jz5.l[6];
        java.lang.String str3 = "";
        if (V6 == null || (str2 = V6.m75945x2fec8307(2)) == null) {
            str2 = "";
        }
        jz5.l lVar = new jz5.l("finder_tab_context_id", str2);
        int i17 = 0;
        lVarArr[0] = lVar;
        if (V6 != null && (m75945x2fec8307 = V6.m75945x2fec8307(1)) != null) {
            str3 = m75945x2fec8307;
        }
        lVarArr[1] = new jz5.l("finder_context_id", str3);
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = c14908x54e651e6.m158354x19263085();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14075x761bf857 activityC14075x761bf857 = m158354x19263085 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14075x761bf857 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14075x761bf857) m158354x19263085 : null;
        if (activityC14075x761bf857 != null) {
            i17 = activityC14075x761bf857.getD();
        } else if (V6 != null) {
            i17 = V6.m75939xb282bd08(5);
        }
        lVarArr[2] = new jz5.l("comment_scene", java.lang.Integer.valueOf(i17));
        lVarArr[3] = new jz5.l("profile_tab_name", c14908x54e651e6.m80379x76847179().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f0d));
        lVarArr[4] = new jz5.l("profile_tab_type", 3);
        lVarArr[5] = new jz5.l("profile_whole_tab", 1);
        return kz5.c1.k(lVarArr);
    }
}
