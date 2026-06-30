package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class ef implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.mg f193938d;

    public ef(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.mg mgVar) {
        this.f193938d = mgVar;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        jz5.l lVar = (jz5.l) obj;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.mg mgVar = this.f193938d;
        cn2.y0 y0Var = (cn2.y0) ((jz5.n) mgVar.F).mo141623x754a37bb();
        r45.ai1 info = (r45.ai1) lVar.f384366d;
        java.lang.String hotWordClientMsgId = (java.lang.String) lVar.f384367e;
        y0Var.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(hotWordClientMsgId, "hotWordClientMsgId");
        if (info.m75939xb282bd08(3) < info.m75939xb282bd08(4) || info.m75939xb282bd08(3) <= 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveHotCommentWidget", "hotCommentWidget Show content:" + info.m75945x2fec8307(1) + ", from " + info.m75939xb282bd08(3) + " to " + info.m75939xb282bd08(4));
            java.lang.String m75945x2fec8307 = info.m75945x2fec8307(1);
            if (m75945x2fec8307 == null) {
                m75945x2fec8307 = "";
            }
            if (m75945x2fec8307.length() > 10) {
                java.lang.String substring = m75945x2fec8307.substring(0, 10);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring, "substring(...)");
                m75945x2fec8307 = substring.concat("...");
            }
            jz5.g gVar = y0Var.f125176c;
            if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(m75945x2fec8307, ((android.widget.TextView) ((jz5.n) gVar).mo141623x754a37bb()).getText())) {
                y0Var.d();
            }
            y0Var.f125184k = hotWordClientMsgId;
            ((android.widget.TextView) ((jz5.n) gVar).mo141623x754a37bb()).setText(m75945x2fec8307);
            int m75939xb282bd08 = info.m75939xb282bd08(3);
            if (kz5.z.G(cn2.y0.f125173n, java.lang.Integer.valueOf(m75939xb282bd08)) && m75939xb282bd08 - 1 < 1) {
                m75939xb282bd08 = 1;
            }
            java.util.List list = y0Var.f125182i;
            if (list.isEmpty()) {
                y0Var.c().setText("x" + m75939xb282bd08);
                y0Var.b(java.lang.Math.min(info.m75939xb282bd08(3) + 1, info.m75939xb282bd08(4)), info.m75939xb282bd08(4));
                y0Var.c().post(new cn2.x0(y0Var));
            } else {
                java.lang.Integer num = (java.lang.Integer) kz5.n0.i0(list);
                int m75939xb282bd082 = info.m75939xb282bd08(4);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(num);
                if (m75939xb282bd082 >= num.intValue()) {
                    int m75939xb282bd083 = info.m75939xb282bd08(3);
                    int intValue = num.intValue() + 1;
                    if (m75939xb282bd083 < intValue) {
                        m75939xb282bd083 = intValue;
                    }
                    y0Var.b(m75939xb282bd083, info.m75939xb282bd08(4));
                }
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveHotCommentWidget", "[show] return. info = " + pm0.b0.g(info));
        }
        ((cn2.y0) ((jz5.n) mgVar.F).mo141623x754a37bb()).f125185l = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.df(mgVar);
    }
}
