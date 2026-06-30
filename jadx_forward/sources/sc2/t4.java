package sc2;

/* loaded from: classes2.dex */
public class t4 extends ad2.h {

    /* renamed from: w, reason: collision with root package name */
    public final java.lang.String f487794w = "Finder.FeedJumperLivingStatusObserver";

    @Override // ad2.h
    public gs2.a j(com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 info) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        return info.m76480xe2ee1ca3() == 2 ? gs2.a.f356585h : super.j(info);
    }

    @Override // ad2.h
    public java.lang.String k() {
        return this.f487794w;
    }

    @Override // ad2.h
    public boolean m(xc2.p0 infoEx) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(infoEx, "infoEx");
        return true;
    }

    @Override // ad2.h
    public void q(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 feed, in5.s0 holder, android.view.View jumpView, xc2.p0 infoEx, java.lang.String source) {
        java.util.LinkedList<r45.wf6> m76521x7528c3fb;
        java.lang.Object obj;
        r45.z84 z84Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feed, "feed");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jumpView, "jumpView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(infoEx, "infoEx");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        super.q(feed, holder, jumpView, infoEx, source);
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862 = infoEx.f534767a;
        if (c19786x6a1e2862 == null || (m76521x7528c3fb = c19786x6a1e2862.m76521x7528c3fb()) == null) {
            return;
        }
        java.util.Iterator<T> it = m76521x7528c3fb.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((r45.wf6) obj).m75939xb282bd08(2) == 16) {
                    break;
                }
            }
        }
        r45.wf6 wf6Var = (r45.wf6) obj;
        if (wf6Var == null || (z84Var = (r45.z84) wf6Var.m75936x14adae67(23)) == null) {
            return;
        }
        if (!o(holder, c19786x6a1e2862)) {
            D(8);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f487794w, "[onBindView] priority not ok");
            return;
        }
        if (infoEx.f534777f == null) {
            return;
        }
        android.view.View findViewById = jumpView.findViewById(com.p314xaae8f345.mm.R.id.i_q);
        android.widget.TextView textView = (android.widget.TextView) jumpView.findViewById(com.p314xaae8f345.mm.R.id.ihp);
        android.widget.TextView textView2 = (android.widget.TextView) jumpView.findViewById(com.p314xaae8f345.mm.R.id.ihn);
        android.content.Context context = holder.f374654e;
        textView.setMaxWidth((int) (context.getResources().getDisplayMetrics().widthPixels * 0.5d));
        textView2.setMaxWidth((int) (context.getResources().getDisplayMetrics().widthPixels * 0.5d));
        textView2.setTextSize(0, context.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561161b3));
        java.lang.String m75945x2fec8307 = z84Var.m75945x2fec8307(0);
        if (m75945x2fec8307 == null || m75945x2fec8307.length() == 0) {
            textView2.setVisibility(8);
        } else {
            java.lang.String m75945x2fec83072 = z84Var.m75945x2fec8307(0);
            if (m75945x2fec83072 == null) {
                m75945x2fec83072 = "";
            }
            textView2.setText(hc2.l.d(m75945x2fec83072));
            textView2.setVisibility(0);
        }
        java.lang.String m75945x2fec83073 = z84Var.m75945x2fec8307(1);
        if (m75945x2fec83073 == null || m75945x2fec83073.length() == 0) {
            textView.setText(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.cvy));
        } else {
            java.lang.String m75945x2fec83074 = z84Var.m75945x2fec8307(1);
            textView.setText(hc2.l.d(m75945x2fec83074 != null ? m75945x2fec83074 : ""));
        }
        if (textView2.getVisibility() == 0) {
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(source, "timeline")) {
                textView.setTextSize(0, context.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561321f9) * i65.a.q(context));
            } else {
                textView.setTextSize(0, context.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561321f9));
            }
            textView.setTextColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560785u4));
            com.p314xaae8f345.mm.ui.fk.c(textView);
        } else {
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(source, "timeline")) {
                textView.setTextSize(0, context.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561161b3) * i65.a.q(context));
            } else {
                textView.setTextSize(0, context.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561161b3));
            }
            textView.setTextColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560787u6));
            com.p314xaae8f345.mm.ui.fk.a(textView);
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(source, "timeline")) {
            android.view.ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
            layoutParams.width = i65.a.b(findViewById.getContext(), 16);
            layoutParams.height = i65.a.b(findViewById.getContext(), 16);
        }
        if (this.f84683n == 39) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            pf5.z zVar = pf5.z.f435481a;
            if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            so2.o2.f492050f.a().g(this.f84678f, ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class)).f216913n, so2.h2.f491919f);
        }
        gs2.c.f356605a.e(holder, jumpView, j(c19786x6a1e2862), false);
    }
}
