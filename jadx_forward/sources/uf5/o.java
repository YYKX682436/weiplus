package uf5;

/* loaded from: classes3.dex */
public final class o extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uf5.x f508810d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(uf5.x xVar) {
        super(2);
        this.f508810d = xVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        uf5.l lVar;
        android.view.View anchorView = (android.view.View) obj;
        int intValue = ((java.lang.Number) obj2).intValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(anchorView, "anchorView");
        uf5.x xVar = this.f508810d;
        if (intValue == -1) {
            xVar.getClass();
        } else {
            j75.f Q6 = xVar.Q6();
            if (Q6 != null && (lVar = (uf5.l) Q6.mo140437x75286adb()) != null) {
                java.util.ArrayList arrayList = (java.util.ArrayList) lVar.f508800f;
                int max = java.lang.Math.max(0, arrayList.size() - 4) + intValue;
                if (max >= 0 && max < arrayList.size()) {
                    java.lang.String str = (java.lang.String) arrayList.get(max);
                    p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = xVar.m158354x19263085();
                    uf5.v vVar = new uf5.v(xVar, str);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
                    android.view.View inflate = android.view.LayoutInflater.from(activity).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.dz6, (android.view.ViewGroup) null);
                    android.widget.PopupWindow popupWindow = new android.widget.PopupWindow(inflate, -2, -2, true);
                    popupWindow.setBackgroundDrawable(new android.graphics.drawable.ColorDrawable(0));
                    popupWindow.setOutsideTouchable(true);
                    inflate.setOnClickListener(new uf5.b(vVar, popupWindow));
                    inflate.measure(0, 0);
                    popupWindow.showAsDropDown(anchorView, (anchorView.getWidth() - inflate.getMeasuredWidth()) / 2, -(inflate.getMeasuredHeight() + anchorView.getHeight() + activity.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561179bl)));
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
