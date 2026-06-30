package ey2;

/* loaded from: classes2.dex */
public final class c0 extends pf5.o0 implements xy2.g {

    /* renamed from: e, reason: collision with root package name */
    public bw5.a00 f338862e;

    /* renamed from: f, reason: collision with root package name */
    public r45.yp2 f338863f;

    public void N6(r45.xb1 resp) {
        java.lang.Object obj;
        java.lang.Object obj2;
        com.p314xaae8f345.mm.p2495xc50a8b8b.g m75934xbce7f2f;
        com.p314xaae8f345.mm.p2495xc50a8b8b.g m75934xbce7f2f2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        java.util.LinkedList m75941xfb821914 = resp.m75941xfb821914(30);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getFinder_config_item(...)");
        java.util.Iterator it = m75941xfb821914.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                obj2 = null;
                break;
            } else {
                obj2 = it.next();
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((r45.yy0) obj2).m75945x2fec8307(0), "finder_video_template_config")) {
                    break;
                }
            }
        }
        r45.yy0 yy0Var = (r45.yy0) obj2;
        if (yy0Var != null && (m75934xbce7f2f2 = yy0Var.m75934xbce7f2f(1)) != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderFeedPostConfigVM", "[initVideoTemplateConfig]");
            bw5.a00 a00Var = new bw5.a00();
            a00Var.mo11468x92b714fd(m75934xbce7f2f2.g());
            this.f338862e = a00Var;
        }
        java.util.LinkedList m75941xfb8219142 = resp.m75941xfb821914(30);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb8219142, "getFinder_config_item(...)");
        java.util.Iterator it6 = m75941xfb8219142.iterator();
        while (true) {
            if (!it6.hasNext()) {
                break;
            }
            java.lang.Object next = it6.next();
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((r45.yy0) next).m75945x2fec8307(0), "post_mandatory_declare_config")) {
                obj = next;
                break;
            }
        }
        r45.yy0 yy0Var2 = (r45.yy0) obj;
        if (yy0Var2 == null || (m75934xbce7f2f = yy0Var2.m75934xbce7f2f(1)) == null) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderFeedPostConfigVM", "[initMandatorDeclareConfig]");
        r45.yp2 yp2Var = new r45.yp2();
        yp2Var.mo11468x92b714fd(m75934xbce7f2f.g());
        this.f338863f = yp2Var;
    }
}
