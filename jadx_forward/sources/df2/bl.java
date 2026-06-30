package df2;

/* loaded from: classes3.dex */
public final class bl implements com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.v1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ df2.pl f311349a;

    public bl(df2.pl plVar) {
        this.f311349a = plVar;
    }

    public void a() {
        df2.pl plVar = this.f311349a;
        int c76 = plVar.c7();
        java.util.LinkedList linkedList = plVar.A;
        boolean z17 = ((android.widget.TextView) linkedList.get(c76)).getText().toString().length() == 0;
        ((android.widget.TextView) linkedList.get(c76)).setText("");
        if (z17) {
            int i17 = c76 - 1;
            if (i17 < 0) {
                i17 = 0;
            }
            android.widget.TextView textView = (android.widget.TextView) linkedList.get(i17);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(textView);
            plVar.e7(textView);
            ((android.widget.TextView) linkedList.get(i17)).setText("");
        } else {
            android.widget.TextView textView2 = (android.widget.TextView) kz5.n0.a0(linkedList, c76);
            if (textView2 != null) {
                plVar.e7(textView2);
            }
        }
        android.view.View view = plVar.f312625r;
        if (view != null) {
            view.setEnabled(false);
        }
        android.widget.TextView textView3 = plVar.f312632y;
        if (textView3 != null) {
            textView3.setVisibility(4);
        }
        plVar.g7();
        df2.pl.a7(plVar);
    }
}
