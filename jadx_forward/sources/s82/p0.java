package s82;

/* loaded from: classes9.dex */
public class p0 extends s82.c {
    @Override // s82.c
    public android.view.View e(android.view.View view, android.view.ViewGroup viewGroup, o72.r2 r2Var) {
        android.view.View view2;
        s82.o0 o0Var;
        android.content.Context context = viewGroup.getContext();
        if (view == null) {
            o0Var = new s82.o0();
            view2 = android.view.View.inflate(context, com.p314xaae8f345.mm.R.C30864xbddafb2a.abk, null);
            a(view2, o0Var, r2Var);
            o0Var.f486356q = (android.widget.TextView) view2.findViewById(com.p314xaae8f345.mm.R.id.dwn);
        } else {
            view2 = view;
            o0Var = (s82.o0) view.getTag();
        }
        g(o0Var, r2Var);
        java.lang.String str = r2Var.f67640x5ab01132.f452507s;
        if (str == null || str.length() <= 0) {
            o0Var.f486356q.setText("");
            return view2;
        }
        android.widget.TextView textView = o0Var.f486356q;
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        android.content.Context context2 = o0Var.f486356q.getContext();
        java.lang.String str2 = r2Var.f67640x5ab01132.f452507s;
        float textSize = o0Var.f486356q.getTextSize();
        ((ke0.e) xVar).getClass();
        textView.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(context2, str2, textSize));
        return view2;
    }

    @Override // s82.c
    public void f(android.view.View view, r45.dq0 dq0Var) {
        s82.o0 o0Var = (s82.o0) view.getTag();
        android.content.Context context = view.getContext();
        ((x82.i) ((o72.l4) i95.n0.c(o72.l4.class))).wi(context, o0Var.f486307a, dq0Var);
    }
}
