package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.biz;

/* loaded from: classes5.dex */
public class g0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f280314d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f280315e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f280316f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View.OnClickListener f280317g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.biz.a f280318h;

    public g0(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.biz.a aVar, boolean z17, java.lang.String str, java.lang.String str2, android.view.View.OnClickListener onClickListener) {
        this.f280318h = aVar;
        this.f280314d = z17;
        this.f280315e = str;
        this.f280316f = str2;
        this.f280317g = onClickListener;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z17 = this.f280314d;
        java.lang.String str = this.f280315e;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.biz.a aVar = this.f280318h;
        if (!z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingUI.BizComponent", "updateBizTopSysMsgView hide, trace : %s", str);
            android.view.View view = aVar.D;
            if (view != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/chatting/component/biz/BizComponent$7", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/ui/chatting/component/biz/BizComponent$7", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                aVar.D = null;
                return;
            }
            return;
        }
        java.lang.String str2 = this.f280316f;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingUI.BizComponent", "updateBizTopSysMsgView show, trace : %s, wording : %s", str, str2);
        if (aVar.D == null) {
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.z4.j(aVar.f280113d.f542250l, com.p314xaae8f345.mm.R.id.vnd);
            aVar.D = aVar.f280113d.c(com.p314xaae8f345.mm.R.id.s7o);
        }
        android.view.View view2 = aVar.D;
        if (view2 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/ui/chatting/component/biz/BizComponent$7", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/ui/chatting/component/biz/BizComponent$7", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            int b17 = i65.a.b(aVar.f280113d.g(), 60);
            android.view.ViewGroup f17 = aVar.f280113d.p().f();
            if (f17.getTag(com.p314xaae8f345.mm.R.id.bgd) instanceof java.lang.Integer) {
                int intValue = ((java.lang.Integer) f17.getTag(com.p314xaae8f345.mm.R.id.bgd)).intValue();
                if (b17 != intValue) {
                    int i17 = b17 - intValue;
                    f17.setTag(com.p314xaae8f345.mm.R.id.bgd, java.lang.Integer.valueOf(i17));
                    f17.setPadding(f17.getPaddingLeft(), f17.getPaddingTop() + i17, f17.getPaddingRight(), f17.getPaddingBottom());
                }
            } else {
                f17.setTag(com.p314xaae8f345.mm.R.id.bgd, java.lang.Integer.valueOf(b17));
                f17.setPadding(f17.getPaddingLeft(), f17.getPaddingTop() + b17, f17.getPaddingRight(), f17.getPaddingBottom());
            }
            android.widget.TextView textView = (android.widget.TextView) aVar.f280113d.c(com.p314xaae8f345.mm.R.id.siv);
            if (textView != null) {
                textView.setText(str2);
            }
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) aVar.f280113d.c(com.p314xaae8f345.mm.R.id.sis);
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3522 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) aVar.f280113d.c(com.p314xaae8f345.mm.R.id.siw);
            android.view.View.OnClickListener onClickListener = this.f280317g;
            if (onClickListener != null) {
                aVar.D.setOnClickListener(onClickListener);
                if (c22699x3dcdb352 != null) {
                    c22699x3dcdb352.setVisibility(0);
                }
                if (c22699x3dcdb3522 != null) {
                    c22699x3dcdb3522.setVisibility(8);
                    return;
                }
                return;
            }
            aVar.D.setOnClickListener(null);
            if (c22699x3dcdb352 != null) {
                c22699x3dcdb352.setVisibility(8);
            }
            if (c22699x3dcdb3522 != null) {
                c22699x3dcdb3522.setVisibility(0);
            }
        }
    }
}
