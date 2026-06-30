package db5;

/* loaded from: classes8.dex */
public class g3 extends com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 {
    public final android.widget.TextView L;
    public final android.widget.TextView M;
    public final android.widget.Button N;
    public final android.widget.Button P;
    public final android.widget.TextView Q;
    public final android.widget.ImageView R;
    public final android.widget.ImageView S;
    public boolean T;

    public g3(android.content.Context context) {
        super(context);
        this.T = false;
        i(com.p314xaae8f345.mm.R.C30864xbddafb2a.biv);
        this.L = (android.widget.TextView) this.f293591g.findViewById(com.p314xaae8f345.mm.R.id.f568864ob2);
        this.M = (android.widget.TextView) this.f293591g.findViewById(com.p314xaae8f345.mm.R.id.oad);
        this.N = (android.widget.Button) this.f293591g.findViewById(com.p314xaae8f345.mm.R.id.kao);
        this.P = (android.widget.Button) this.f293591g.findViewById(com.p314xaae8f345.mm.R.id.b5i);
        this.Q = (android.widget.TextView) this.f293591g.findViewById(com.p314xaae8f345.mm.R.id.oae);
        com.p314xaae8f345.mm.p2776x373aa5.C22791xb8ff38fd c22791xb8ff38fd = (com.p314xaae8f345.mm.p2776x373aa5.C22791xb8ff38fd) this.f293591g.findViewById(com.p314xaae8f345.mm.R.id.f568284mc2);
        this.S = (android.widget.ImageView) this.f293591g.findViewById(com.p314xaae8f345.mm.R.id.ocb);
        if (c22791xb8ff38fd != null) {
            c22791xb8ff38fd.setVisibility(0);
            if (c22791xb8ff38fd.getContext() instanceof android.app.Activity) {
                android.util.DisplayMetrics displayMetrics = c22791xb8ff38fd.getContext().getResources().getDisplayMetrics();
                if (displayMetrics != null) {
                    c22791xb8ff38fd.m82588x25bfb969((int) (displayMetrics.heightPixels * 0.45f));
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMHalfBottomTipsDoubleBtnDialog", "displayMetrics.heightPixels = " + displayMetrics.heightPixels);
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMHalfBottomTipsDoubleBtnDialog", "displayMetrics is null");
                }
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMHalfBottomTipsDoubleBtnDialog", "display is null");
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMHalfBottomTipsDoubleBtnDialog", "scroll is null");
        }
        this.R = (android.widget.ImageView) this.f293591g.findViewById(com.p314xaae8f345.mm.R.id.d9m);
    }

    public db5.g3 D(android.view.View.OnClickListener onClickListener) {
        this.P.setOnClickListener(onClickListener);
        return this;
    }

    public db5.g3 E(android.view.View.OnClickListener onClickListener) {
        this.N.setOnClickListener(onClickListener);
        return this;
    }

    public db5.g3 F(java.lang.String str) {
        this.N.setText(str);
        return this;
    }

    public db5.g3 G(java.lang.String str) {
        android.widget.TextView textView = this.L;
        textView.setText(str);
        textView.setVisibility(0);
        return this;
    }

    public db5.g3 H(boolean z17) {
        this.Q.setVisibility(8);
        return this;
    }
}
