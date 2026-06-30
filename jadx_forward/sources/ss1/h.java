package ss1;

/* loaded from: classes15.dex */
public final class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1304xd1075a44.C13025x6878a547 f493435d;

    public h(com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1304xd1075a44.C13025x6878a547 c13025x6878a547) {
        this.f493435d = c13025x6878a547;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.ViewParent parent;
        com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1304xd1075a44.C13025x6878a547 c13025x6878a547 = this.f493435d;
        android.widget.TextView textView = c13025x6878a547.f176124m;
        if (textView != null) {
            textView.setVisibility(0);
        }
        android.widget.TextView textView2 = c13025x6878a547.f176124m;
        if (textView2 != null) {
            textView2.setMaxLines(c13025x6878a547.f176121g);
        }
        android.widget.TextView textView3 = c13025x6878a547.f176124m;
        if (textView3 != null) {
            textView3.setText(c13025x6878a547.f176118d);
        }
        android.widget.TextView textView4 = c13025x6878a547.f176125n;
        if (textView4 != null) {
            textView4.setPadding(0, 0, 0, 0);
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039 c22624x85d69039 = c13025x6878a547.f176123i;
        if (c22624x85d69039 != null) {
            c22624x85d69039.setVisibility(8);
        }
        android.widget.TextView textView5 = c13025x6878a547.f176125n;
        android.view.ViewGroup.LayoutParams layoutParams = textView5 != null ? textView5.getLayoutParams() : null;
        if (layoutParams != null && (layoutParams instanceof android.widget.RelativeLayout.LayoutParams)) {
            android.widget.RelativeLayout.LayoutParams layoutParams2 = (android.widget.RelativeLayout.LayoutParams) layoutParams;
            layoutParams2.removeRule(12);
            layoutParams2.removeRule(3);
            layoutParams2.addRule(3, com.p314xaae8f345.mm.R.id.f565465ci3);
        }
        android.widget.TextView textView6 = c13025x6878a547.f176125n;
        if (textView6 == null || (parent = textView6.getParent()) == null) {
            return;
        }
        parent.requestLayout();
    }
}
