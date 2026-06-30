package ir1;

/* loaded from: classes5.dex */
public final class g1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ir1.i1 f375508d;

    public g1(ir1.i1 i1Var) {
        this.f375508d = i1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ir1.i1 i1Var = this.f375508d;
        android.view.View inflate = android.view.LayoutInflater.from(i1Var.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.dzk, (android.view.ViewGroup) null);
        android.widget.PopupWindow popupWindow = new android.widget.PopupWindow(inflate, -2, -2);
        popupWindow.setOutsideTouchable(true);
        popupWindow.setFocusable(false);
        popupWindow.setBackgroundDrawable(new android.graphics.drawable.ColorDrawable(0));
        inflate.measure(0, 0);
        popupWindow.showAsDropDown(i1Var.N, i1Var.N.getWidth() - inflate.getMeasuredWidth(), ((-inflate.getMeasuredHeight()) - i1Var.N.getHeight()) - 4);
        i1Var.N.postDelayed(new ir1.c1(popupWindow), 3000L);
        inflate.findViewById(com.p314xaae8f345.mm.R.id.hkr).setOnClickListener(new ir1.d1(popupWindow));
        popupWindow.setOnDismissListener(ir1.e1.f375500d);
        inflate.post(new ir1.f1(i1Var, inflate));
    }
}
