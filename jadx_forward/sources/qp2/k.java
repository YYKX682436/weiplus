package qp2;

/* loaded from: classes2.dex */
public final class k implements oa.c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qp2.y f447323d;

    public k(qp2.y yVar) {
        this.f447323d = yVar;
    }

    @Override // oa.c
    public void h0(oa.i t17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(t17, "t");
    }

    @Override // oa.c
    public void l4(oa.i t17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(t17, "t");
        java.lang.Object obj = t17.f425311a;
        boolean z17 = obj instanceof qp2.i;
        qp2.y yVar = this.f447323d;
        if (z17) {
            qp2.i iVar = (qp2.i) obj;
            int i17 = yVar.f447347n ? com.p314xaae8f345.mm.R.C30859x5a72f63.f77647x5878209d : com.p314xaae8f345.mm.R.C30859x5a72f63.f560406jj;
            android.widget.TextView textView = iVar.f447320d;
            if (textView != null) {
                android.view.View view = iVar.f447317a.f425316f;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view);
                textView.setTextColor(view.getContext().getResources().getColor(i17));
            }
            iVar.a(false);
        }
        yVar.R6().announceForAccessibility(yVar.m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ech, java.lang.String.valueOf(t17.f425313c)));
    }

    @Override // oa.c
    public void u1(oa.i t17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(t17, "t");
        java.lang.Object obj = t17.f425311a;
        if (obj instanceof qp2.i) {
            qp2.i iVar = (qp2.i) obj;
            qp2.y yVar = this.f447323d;
            int i17 = yVar.f447347n ? com.p314xaae8f345.mm.R.C30859x5a72f63.f77656x773eb619 : com.p314xaae8f345.mm.R.C30859x5a72f63.a0c;
            android.widget.TextView textView = iVar.f447320d;
            if (textView != null) {
                android.view.View view = iVar.f447317a.f425316f;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view);
                textView.setTextColor(view.getContext().getResources().getColor(i17));
            }
            iVar.a(true);
            p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 m158358x197d1fc6 = yVar.m158358x197d1fc6();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m158358x197d1fc6);
            p012xc85e97e9.p093xedfae76a.c1 a17 = pf5.z.f435481a.b(m158358x197d1fc6).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.p1577xcaac591d.C14513x218d4a07.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.p1577xcaac591d.C14513x218d4a07.T6((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.p1577xcaac591d.C14513x218d4a07) a17, iVar.f447318b, false, null, 6, null);
        }
    }
}
