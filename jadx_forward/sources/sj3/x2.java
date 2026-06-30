package sj3;

/* loaded from: classes14.dex */
public final class x2 implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sj3.g3 f490337d;

    public x2(sj3.g3 g3Var) {
        this.f490337d = g3Var;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        sj3.g3 g3Var;
        java.lang.Object obj2;
        java.util.List list = (java.util.List) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(list);
        java.util.Iterator it = list.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            g3Var = this.f490337d;
            if (!hasNext) {
                obj2 = null;
                break;
            } else {
                obj2 = it.next();
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.t) obj2).f231830b, g3Var.i().getCurrentUsername())) {
                    break;
                }
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.t tVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.t) obj2;
        if (tVar != null) {
            int i17 = tVar.f231836h;
            if (i17 == 102) {
                g3Var.i().e(true);
                return;
            }
            if (i17 != 104 && i17 != 100) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.p1889xd1075a44.C16588x7b895f5a i18 = g3Var.i();
                int i19 = i18.f231890e;
                if (i19 == 2 || i19 == 3) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MT.ScreenCastBigView", "dismissPauseOrStop");
                    i18.d();
                    return;
                }
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.p1889xd1075a44.C16588x7b895f5a i27 = g3Var.i();
            i27.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MT.ScreenCastBigView", "showStop");
            android.view.View view = i27.f231893h;
            if (view != null) {
                i27.removeView(view);
                i27.f231893h = null;
            }
            android.widget.TextView textView = new android.widget.TextView(i27.getContext());
            textView.setTextColor(textView.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560086an));
            textView.setText(com.p314xaae8f345.mm.R.C30867xcad56011.h2t);
            textView.setTextSize(0, i65.a.b(textView.getContext(), 17));
            pm0.v.X(new sj3.n5(i27, textView));
        }
    }
}
