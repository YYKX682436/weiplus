package ix3;

/* loaded from: classes10.dex */
public final class n1 extends in5.r {
    @Override // in5.r
    public int e() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f570937dw2;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        ix3.l1 item = (ix3.l1) cVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        android.view.View view = holder.f3639x46306858;
        android.widget.TextView textView = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.k3s);
        com.p314xaae8f345.mm.vfs.x1 x1Var = item.f377012d;
        textView.setText(x1Var.f294765b);
        long j17 = x1Var.f294768e;
        if (x1Var.f294769f) {
            ((com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) view.findViewById(com.p314xaae8f345.mm.R.id.rkn)).setVisibility(0);
            ((android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.mzv)).setText("文件夹");
            ((android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.o7z)).setText(k35.m1.e(j17));
        } else {
            java.lang.String D = x1Var.f294770g.D(x1Var.f294764a, false);
            android.widget.TextView textView2 = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.o7z);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(x1Var instanceof com.p314xaae8f345.mm.vfs.k5 ? "Link-" : "");
            sb6.append(k35.m1.e(j17));
            sb6.append(" wxam:");
            sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.y1.g(D));
            textView2.setText(sb6.toString());
            ((com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) view.findViewById(com.p314xaae8f345.mm.R.id.rkn)).setVisibility(4);
            long j18 = x1Var.f294766c;
            if (j18 < 1048576) {
                ((android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.mzv)).setText(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f0(j18));
            } else if (j18 < 1073741824) {
                ((android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.mzv)).setText(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.h0(j18));
            } else {
                ((android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.mzv)).setText(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.e0(j18, 10.0d));
            }
        }
        if (item.f377014f) {
            ((android.widget.LinearLayout) view.findViewById(com.p314xaae8f345.mm.R.id.hhb)).setBackgroundResource(com.p314xaae8f345.mm.R.C30859x5a72f63.f77770xf2a9a295);
        } else {
            ((android.widget.LinearLayout) view.findViewById(com.p314xaae8f345.mm.R.id.hhb)).setBackgroundResource(com.p314xaae8f345.mm.R.C30859x5a72f63.f560023b);
        }
    }
}
