package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes9.dex */
public abstract class g0 implements com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.q {

    /* renamed from: STATUS_EDIT */
    public static final int f39485x4cf10237 = 1;

    /* renamed from: STATUS_NORMAL */
    public static final int f39486xe4b3f5d4 = 0;

    /* renamed from: _hellAccFlag_ */
    private byte f39487x7f11beae;

    /* renamed from: avatarIV */
    public com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.C21894x47dd8601 f39488x6a87d846;

    /* renamed from: avatarMask */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.C21522xf5a6e956 f39489xe7f4e7e5;

    /* renamed from: chattingItem */
    public com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0 f39491xbb6bd679;

    /* renamed from: checkBox */
    public android.widget.CheckBox f39492x5b9aa3a3;

    /* renamed from: clickArea */
    public android.view.View f39493x8ad70635;

    /* renamed from: convertView */
    public android.view.View f39494xbf64baf8;

    /* renamed from: historyMsgTip */
    public android.view.View f39495xb7c8f70e;

    /* renamed from: maskView */
    public android.view.View f39496x10665fb1;

    /* renamed from: noMoreMsgTip */
    public android.view.View f39497x4c46e5b0;

    /* renamed from: stateIV */
    public android.widget.ImageView f39499x8eebed7e;

    /* renamed from: timeTV */
    public android.widget.TextView f39500xcbecde0f;

    /* renamed from: uploadingPB */
    public android.widget.ProgressBar f39501x4004bbf3;

    /* renamed from: userTV */
    public android.widget.TextView f39502xce2b2f8d;

    /* renamed from: chatHolder */
    private com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.q f39490x8a046b24 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.p.f279970a;

    /* renamed from: quoteView */
    private q31.n f39498xa79c4f41 = null;

    /* renamed from: create */
    public void mo80050xaf65a0fc(android.view.View view) {
        this.f39494xbf64baf8 = view;
        this.f39500xcbecde0f = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.f565229br1);
        this.f39488x6a87d846 = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.C21894x47dd8601) view.findViewById(com.p314xaae8f345.mm.R.id.f565175bk1);
        this.f39495xb7c8f70e = view.findViewById(com.p314xaae8f345.mm.R.id.bm7);
        this.f39497x4c46e5b0 = view.findViewById(com.p314xaae8f345.mm.R.id.bpw);
        this.f39492x5b9aa3a3 = (android.widget.CheckBox) view.findViewById(com.p314xaae8f345.mm.R.id.bkf);
        this.f39489xe7f4e7e5 = (com.p314xaae8f345.mm.ui.p2642x2e06d1.C21522xf5a6e956) view.findViewById(com.p314xaae8f345.mm.R.id.f565178bk4);
        this.f39493x8ad70635 = view.findViewById(com.p314xaae8f345.mm.R.id.bkg);
        this.f39499x8eebed7e = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.bqx);
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.q
    /* renamed from: getAdapterPosition */
    public int mo79416xf806b362() {
        return this.f39490x8a046b24.mo79416xf806b362();
    }

    /* renamed from: getCurrentMsgInfo */
    public com.p314xaae8f345.mm.p2621x8fb0427b.f9 m80051xdfe7150c(yb5.d dVar) {
        return com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er.b(this.f39490x8a046b24, dVar);
    }

    /* renamed from: getMainContainerView */
    public android.view.View mo79945xb0f558d7() {
        return this.f39493x8ad70635;
    }

    /* renamed from: getQuoteView */
    public q31.n m80052xa709c08b() {
        return this.f39498xa79c4f41;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.q
    /* renamed from: getViewHolderScope */
    public p3325xe03a0797.p3326xc267989b.y0 mo79417x33dec1ed() {
        return this.f39490x8a046b24.mo79417x33dec1ed();
    }

    /* renamed from: resetChatBubbleWidth */
    public void m80053x54fd00d3(android.view.View view, int i17) {
        if (view != null) {
            android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.width = (int) (i17 / j65.f.f379476g);
            view.setLayoutParams(layoutParams);
            view.requestLayout();
        }
    }

    /* renamed from: resetChatBubbleWidthWithNewStyle */
    public void m80054x4906274a(android.view.View view, int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingItem", "resetChatBubbleWidthWithNewStyle, use new style");
        if (view != null) {
            int c17 = (int) (com.p314xaae8f345.mm.ui.gk.c() * 5.0d);
            android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.width = c17;
            view.setLayoutParams(layoutParams);
            view.requestLayout();
        }
    }

    /* renamed from: setChatHolder */
    public void m80055xa6697126(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.q qVar) {
        this.f39490x8a046b24 = qVar;
    }

    /* renamed from: setChattingItem */
    public void m80056x52a763fb(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0 a0Var) {
        this.f39491xbb6bd679 = a0Var;
    }

    /* renamed from: setQuoteView */
    public void m80057x35d80ff(q31.n nVar) {
        this.f39498xa79c4f41 = nVar;
    }

    /* renamed from: showEditView */
    public void m80058x2cb5f9ec(boolean z17) {
        int i17 = z17 ? 0 : 8;
        android.widget.CheckBox checkBox = this.f39492x5b9aa3a3;
        if (checkBox != null && checkBox.getVisibility() != i17) {
            this.f39492x5b9aa3a3.setVisibility(i17);
        }
        android.view.View view = this.f39496x10665fb1;
        if (view == null || view.getVisibility() == i17) {
            return;
        }
        android.view.View view2 = this.f39496x10665fb1;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChattingItem$BaseViewHolder", "showEditView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/ui/chatting/viewitems/ChattingItem$BaseViewHolder", "showEditView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
