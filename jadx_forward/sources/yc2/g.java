package yc2;

/* loaded from: classes2.dex */
public final class g extends xc2.o {
    @Override // xc2.o
    public void v(in5.s0 holder, android.view.View jumpView, xc2.p0 infoEx) {
        java.lang.String str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jumpView, "jumpView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(infoEx, "infoEx");
        android.content.Context context = holder.f374654e;
        android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
        if (activity == null) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.s sVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.s();
        sVar.f225700d = new yc2.i(activity);
        infoEx.R = sVar;
        int i17 = infoEx.f534789r;
        int i18 = i17 != 1 ? i17 != 6 ? 0 : 3 : 2;
        if (i18 > 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = activity instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) activity).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
            if (nyVar == null || (str = nyVar.f216915p) == null) {
                str = "";
            }
            java.lang.String str2 = str + '_' + java.lang.System.currentTimeMillis();
            infoEx.S = str2;
            r45.k74 m76504xa819f0c7 = infoEx.f534767a.m76504xa819f0c7();
            if (m76504xa819f0c7 != null) {
                m76504xa819f0c7.set(2, xc2.r0.a(m76504xa819f0c7.m75945x2fec8307(2), kz5.c1.k(new jz5.l("from_scene", java.lang.Integer.valueOf(i18)), new jz5.l("jumper_click_sessionid", str2))));
            }
        }
        super.v(holder, jumpView, infoEx);
    }
}
