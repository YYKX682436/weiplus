package dv2;

/* loaded from: classes2.dex */
public final class l extends zx2.c {

    /* renamed from: l, reason: collision with root package name */
    public final java.lang.String f325417l;

    /* renamed from: m, reason: collision with root package name */
    public android.view.View f325418m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.TextView f325419n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(dv2.v vVar, java.lang.String titleText) {
        super("");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(titleText, "titleText");
        this.f325417l = titleText;
    }

    @Override // zx2.k, zx2.i
    public int a() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.ecl;
    }

    @Override // zx2.c, zx2.k, zx2.i
    public void c(android.view.ViewGroup viewGroup) {
        super.c(viewGroup);
        this.f325418m = viewGroup;
        if (viewGroup != null) {
            java.lang.String str = this.f325417l;
            viewGroup.setContentDescription(str);
            android.widget.TextView textView = (android.widget.TextView) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.qqf);
            this.f325419n = textView;
            if (textView != null) {
                textView.setText(str);
            }
            android.widget.TextView textView2 = this.f325419n;
            if (textView2 != null) {
                textView2.setVisibility(0);
            }
            android.widget.TextView textView3 = this.f325419n;
            if (textView3 != null) {
                textView3.setTextColor(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77762x20e833));
            }
            android.widget.TextView textView4 = this.f325419n;
            if (textView4 != null) {
                com.p314xaae8f345.mm.ui.fk.c(textView4);
            }
        }
    }

    @Override // zx2.k, zx2.i
    public void d(boolean z17, android.view.ViewGroup tabView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tabView, "tabView");
        super.d(z17, tabView);
        if (z17) {
            android.widget.TextView textView = this.f325419n;
            if (textView != null) {
                textView.setTextColor(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a0c));
            }
            android.widget.TextView textView2 = this.f325419n;
            if (textView2 != null) {
                com.p314xaae8f345.mm.ui.fk.a(textView2);
                return;
            }
            return;
        }
        android.widget.TextView textView3 = this.f325419n;
        if (textView3 != null) {
            textView3.setTextColor(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77762x20e833));
        }
        android.widget.TextView textView4 = this.f325419n;
        if (textView4 != null) {
            com.p314xaae8f345.mm.ui.fk.c(textView4);
        }
    }

    @Override // zx2.c
    public android.view.View m() {
        android.view.View view = this.f325418m;
        return view == null ? this.f558585j : view;
    }

    @Override // zx2.c
    public int[] n() {
        return new int[]{0, 0};
    }

    @Override // zx2.c
    public android.view.View o() {
        android.view.View view = this.f325418m;
        return view == null ? this.f558585j : view;
    }
}
