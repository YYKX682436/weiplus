package v24;

/* loaded from: classes5.dex */
public class q extends com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 {
    public final android.widget.TextView L;
    public final android.widget.TextView M;
    public final android.widget.Button N;
    public final android.widget.Button P;
    public final android.widget.TextView Q;
    public boolean R;
    public final android.widget.LinearLayout S;
    public final android.view.View T;

    public q(android.content.Context context) {
        super(context);
        this.R = false;
        if (!(context instanceof android.app.Activity)) {
            android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.bix, (android.view.ViewGroup) null);
            this.T = inflate;
            this.L = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.f568864ob2);
            this.M = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.oad);
            this.N = (android.widget.Button) inflate.findViewById(com.p314xaae8f345.mm.R.id.kao);
            this.P = (android.widget.Button) inflate.findViewById(com.p314xaae8f345.mm.R.id.b5i);
            android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.oae);
            this.Q = textView;
            textView.setText(context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574547io2));
            com.p314xaae8f345.mm.p2776x373aa5.C22791xb8ff38fd c22791xb8ff38fd = (com.p314xaae8f345.mm.p2776x373aa5.C22791xb8ff38fd) inflate.findViewById(com.p314xaae8f345.mm.R.id.f568284mc2);
            this.S = (android.widget.LinearLayout) inflate.findViewById(com.p314xaae8f345.mm.R.id.f564971au5);
            if (c22791xb8ff38fd != null) {
                int i17 = context.getResources().getDisplayMetrics().heightPixels;
                if (i17 == 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMHalfBottomTipsDoubleBtnDialog", "screenHeight is 0");
                    return;
                }
                c22791xb8ff38fd.m82588x25bfb969((int) (i17 * 0.45f));
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMHalfBottomTipsDoubleBtnDialog", "screenHeight = " + i17);
                return;
            }
            return;
        }
        i(com.p314xaae8f345.mm.R.C30864xbddafb2a.bix);
        this.L = (android.widget.TextView) this.f293591g.findViewById(com.p314xaae8f345.mm.R.id.f568864ob2);
        this.M = (android.widget.TextView) this.f293591g.findViewById(com.p314xaae8f345.mm.R.id.oad);
        this.N = (android.widget.Button) this.f293591g.findViewById(com.p314xaae8f345.mm.R.id.kao);
        this.P = (android.widget.Button) this.f293591g.findViewById(com.p314xaae8f345.mm.R.id.b5i);
        android.widget.TextView textView2 = (android.widget.TextView) this.f293591g.findViewById(com.p314xaae8f345.mm.R.id.oae);
        this.Q = textView2;
        textView2.setText(context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574547io2));
        com.p314xaae8f345.mm.p2776x373aa5.C22791xb8ff38fd c22791xb8ff38fd2 = (com.p314xaae8f345.mm.p2776x373aa5.C22791xb8ff38fd) this.f293591g.findViewById(com.p314xaae8f345.mm.R.id.f568284mc2);
        this.S = (android.widget.LinearLayout) this.f293591g.findViewById(com.p314xaae8f345.mm.R.id.f564971au5);
        if (c22791xb8ff38fd2 != null) {
            if (!(c22791xb8ff38fd2.getContext() instanceof android.app.Activity)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMHalfBottomTipsDoubleBtnDialog", "display is null");
                return;
            }
            android.util.DisplayMetrics displayMetrics = c22791xb8ff38fd2.getContext().getResources().getDisplayMetrics();
            if (displayMetrics == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMHalfBottomTipsDoubleBtnDialog", "displayMetrics is null");
                return;
            }
            c22791xb8ff38fd2.m82588x25bfb969((int) (displayMetrics.heightPixels * 0.45f));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMHalfBottomTipsDoubleBtnDialog", "displayMetrics.heightPixels = " + displayMetrics.heightPixels);
        }
    }
}
