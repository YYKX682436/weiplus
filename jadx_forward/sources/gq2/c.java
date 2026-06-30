package gq2;

/* loaded from: classes2.dex */
public final class c implements oa.c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gq2.d f356082d;

    public c(gq2.d dVar) {
        this.f356082d = dVar;
    }

    @Override // oa.c
    public void h0(oa.i t17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(t17, "t");
    }

    @Override // oa.c
    public void l4(oa.i t17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(t17, "t");
        java.lang.Object obj = t17.f425311a;
        boolean z17 = obj instanceof gq2.a;
        gq2.d dVar = this.f356082d;
        if (z17) {
            gq2.a aVar = (gq2.a) obj;
            dVar.getClass();
            android.widget.TextView textView = aVar.f356079d;
            if (textView != null) {
                android.view.View view = aVar.f356077b.f425316f;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view);
                textView.setTextColor(view.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77647x5878209d));
            }
            aVar.a(false);
        }
        com.p176xb6135e39.p177xcca8366f.p244x11d36527.p261x36337e.C2718xca2902ff c2718xca2902ff = dVar.f356086d;
        if (c2718xca2902ff != null) {
            c2718xca2902ff.announceForAccessibility(dVar.f356083a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ech, java.lang.String.valueOf(t17.f425313c)));
        }
    }

    @Override // oa.c
    public void u1(oa.i t17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(t17, "t");
        java.lang.Object obj = t17.f425311a;
        if (obj instanceof gq2.a) {
            gq2.a aVar = (gq2.a) obj;
            gq2.d dVar = this.f356082d;
            dVar.getClass();
            android.widget.TextView textView = aVar.f356079d;
            if (textView != null) {
                android.view.View view = aVar.f356077b.f425316f;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view);
                textView.setTextColor(view.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77656x773eb619));
            }
            aVar.a(true);
            dVar.f356085c.mo146xb9724478(java.lang.Integer.valueOf(t17.f425315e));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LiveTabListConvert", "onTabSelected position = " + t17.f425315e);
        }
    }
}
