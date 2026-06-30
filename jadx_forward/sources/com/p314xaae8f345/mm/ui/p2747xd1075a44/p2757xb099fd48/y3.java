package com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48;

/* loaded from: classes5.dex */
public abstract class y3 {
    public static db5.d5 a(android.app.Activity activity, int i17, int i18, int i19, java.lang.String str, int i27, android.view.View.OnClickListener onClickListener, android.widget.PopupWindow.OnDismissListener onDismissListener, android.view.View.OnClickListener onClickListener2) {
        android.view.View inflate = android.view.View.inflate(activity, com.p314xaae8f345.mm.R.C30864xbddafb2a.d1b, null);
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) inflate.findViewById(com.p314xaae8f345.mm.R.id.af8);
        if (i17 == 1) {
            linearLayout.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.b78);
        }
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.obb);
        textView.setText(str);
        textView.setOnClickListener(onClickListener);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) inflate.findViewById(com.p314xaae8f345.mm.R.id.ob_);
        if (i18 == 0) {
            c22699x3dcdb352.setVisibility(8);
            int a17 = com.p314xaae8f345.mm.ui.zk.a(activity, 16);
            textView.setPadding(a17, 0, a17, 0);
        } else {
            c22699x3dcdb352.setImageResource(i18);
            c22699x3dcdb352.m82040x7541828(i19);
        }
        db5.d5 d5Var = new db5.d5(inflate);
        d5Var.setWidth(-1);
        d5Var.setHeight(-2);
        android.graphics.Rect rect = new android.graphics.Rect();
        activity.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
        int i28 = rect.top;
        int a18 = com.p314xaae8f345.mm.ui.bl.a(activity);
        if (i28 == 0) {
            i28 = com.p314xaae8f345.mm.ui.bl.j(activity);
        }
        d5Var.showAtLocation(activity.getWindow().getDecorView(), 48, 0, i28 + a18);
        android.widget.ImageView imageView = (android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.oba);
        if (i27 == 0) {
            imageView.setVisibility(8);
        } else {
            imageView.setImageResource(i27);
        }
        imageView.setOnClickListener(new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.x3(d5Var, onClickListener2));
        if (onDismissListener != null) {
            d5Var.setOnDismissListener(onDismissListener);
        }
        return d5Var;
    }

    public static db5.d5 b(android.app.Activity activity, int i17, int i18, int i19, java.lang.String str, long j17) {
        android.view.View inflate = android.view.View.inflate(activity, i17, null);
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.obb);
        textView.setText(str);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) inflate.findViewById(com.p314xaae8f345.mm.R.id.ob_);
        if (i18 == 0) {
            c22699x3dcdb352.setVisibility(8);
            int a17 = com.p314xaae8f345.mm.ui.zk.a(activity, 16);
            textView.setPadding(a17, 0, a17, 0);
        } else {
            c22699x3dcdb352.setImageResource(i18);
            c22699x3dcdb352.m82040x7541828(i19);
        }
        db5.d5 d5Var = new db5.d5(inflate);
        d5Var.setWidth(-1);
        d5Var.setHeight(-2);
        android.graphics.Rect rect = new android.graphics.Rect();
        activity.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
        int i27 = rect.top;
        int a18 = com.p314xaae8f345.mm.ui.bl.a(activity);
        if (i27 == 0) {
            i27 = com.p314xaae8f345.mm.ui.bl.j(activity);
        }
        d5Var.showAtLocation(activity.getWindow().getDecorView(), 48, 0, i27 + a18);
        if (j17 > 0) {
            new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.w3(d5Var).sendEmptyMessageDelayed(0, j17);
        }
        return d5Var;
    }
}
