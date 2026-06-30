package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes3.dex */
public class xg extends android.widget.RelativeLayout {

    /* renamed from: d, reason: collision with root package name */
    public boolean f287521d;

    public xg(android.view.LayoutInflater layoutInflater, int i17) {
        super(layoutInflater.getContext());
        android.graphics.drawable.Drawable drawable;
        setClipChildren(false);
        xn5.q1 q1Var = xn5.q1.f537246a;
        android.widget.TextView textView = (android.widget.TextView) q1Var.c(getContext(), "com.tencent.mm.view.x2c.X2CTextView");
        textView = textView == null ? new android.widget.TextView(getContext()) : textView;
        textView.setTextSize(0, i65.a.h(getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561463ja));
        textView.setPadding(0, i65.a.h(getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn), 0, i65.a.h(getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn));
        textView.setTextColor(i65.a.d(getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.f560765tk));
        textView.setGravity(17);
        textView.setText(com.p314xaae8f345.mm.R.C30867xcad56011.b4v);
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-1, -2);
        textView.setId(com.p314xaae8f345.mm.R.id.bpw);
        layoutParams.setMargins(0, getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.i_), 0, getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.i_));
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(textView, arrayList.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemContainer", com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82, "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        textView.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(textView, "com/tencent/mm/ui/chatting/viewitems/ChattingItemContainer", com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82, "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        addView(textView, layoutParams);
        android.view.View inflate = layoutInflater.inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.dba, (android.view.ViewGroup) null);
        android.widget.RelativeLayout.LayoutParams layoutParams2 = new android.widget.RelativeLayout.LayoutParams(-1, -2);
        inflate.setId(com.p314xaae8f345.mm.R.id.bm7);
        layoutParams2.setMargins(0, getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.i_), 0, getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.i_));
        layoutParams2.addRule(3, com.p314xaae8f345.mm.R.id.bpw);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(inflate, arrayList2.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemContainer", com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82, "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        inflate.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(inflate, "com/tencent/mm/ui/chatting/viewitems/ChattingItemContainer", com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82, "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        addView(inflate, layoutParams2);
        android.widget.TextView textView2 = (android.widget.TextView) q1Var.c(getContext(), "com.tencent.mm.view.x2c.X2CTextView");
        textView2 = textView2 == null ? new android.widget.TextView(getContext(), null, 0) : textView2;
        textView2.setId(com.p314xaae8f345.mm.R.id.f565229br1);
        int h17 = i65.a.h(getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561463ja);
        int h18 = i65.a.h(getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561463ja);
        if (h18 != h17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChattingItemContainer", "warn!!! cacheSize:%s sysSize:%s", java.lang.Integer.valueOf(h18), java.lang.Integer.valueOf(h17));
        }
        textView2.setTextColor(i65.a.d(getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.f560839vm));
        textView2.setTextSize(0, h17);
        textView2.setGravity(1);
        textView2.setVisibility(8);
        textView2.setPadding(0, i65.a.b(getContext(), 11) + getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.i_), 0, i65.a.b(getContext(), 6) + getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.i_));
        android.widget.RelativeLayout.LayoutParams layoutParams3 = new android.widget.RelativeLayout.LayoutParams(-2, -2);
        layoutParams3.addRule(3, com.p314xaae8f345.mm.R.id.bm7);
        layoutParams3.addRule(14);
        addView(textView2, layoutParams3);
        android.widget.CheckBox checkBox = (android.widget.CheckBox) q1Var.c(getContext(), "com.tencent.mm.view.x2c.X2CCheckBox");
        if (checkBox == null) {
            drawable = null;
            checkBox = new android.widget.CheckBox(getContext(), null, 0);
        } else {
            drawable = null;
        }
        checkBox.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.aoe);
        checkBox.setButtonDrawable(drawable);
        checkBox.setId(com.p314xaae8f345.mm.R.id.bkf);
        int b17 = i65.a.b(getContext(), 24);
        android.widget.RelativeLayout.LayoutParams layoutParams4 = new android.widget.RelativeLayout.LayoutParams(b17, b17);
        layoutParams4.setMargins(getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561457j3), getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561106p), -getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561179bl), 0);
        layoutParams4.addRule(3, com.p314xaae8f345.mm.R.id.f565229br1);
        layoutParams4.addRule(9);
        layoutParams4.width = b17;
        layoutParams4.height = b17;
        addView(checkBox, layoutParams4);
        android.view.View inflate2 = layoutInflater.inflate(i17, (android.view.ViewGroup) null);
        int id6 = inflate2.getId();
        if (-1 == id6) {
            id6 = com.p314xaae8f345.mm.R.id.bkj;
            inflate2.setId(com.p314xaae8f345.mm.R.id.bkj);
        }
        if (-1 == getId()) {
            setId(com.p314xaae8f345.mm.R.id.f565197bn1);
        }
        android.widget.RelativeLayout.LayoutParams layoutParams5 = new android.widget.RelativeLayout.LayoutParams(-1, -2);
        layoutParams5.addRule(3, com.p314xaae8f345.mm.R.id.f565229br1);
        layoutParams5.addRule(1, com.p314xaae8f345.mm.R.id.bkf);
        addView(inflate2, layoutParams5);
        android.view.View view = new android.view.View(getContext());
        view.setId(com.p314xaae8f345.mm.R.id.bpa);
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(8);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view, arrayList3.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemContainer", com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82, "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/ui/chatting/viewitems/ChattingItemContainer", com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82, "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.widget.RelativeLayout.LayoutParams layoutParams6 = new android.widget.RelativeLayout.LayoutParams(-1, -1);
        layoutParams6.addRule(6, id6);
        layoutParams6.addRule(8, id6);
        addView(view, layoutParams6);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        if (this.f287521d) {
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    /* renamed from: setInterceptTouchEvent */
    public void m80371x6543613b(boolean z17) {
        this.f287521d = z17;
    }
}
