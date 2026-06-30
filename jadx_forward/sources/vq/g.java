package vq;

/* loaded from: classes.dex */
public final class g extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.emoji.debug.EmojiDebugUI f520692d;

    public g(com.tencent.mm.emoji.debug.EmojiDebugUI emojiDebugUI) {
        this.f520692d = emojiDebugUI;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return this.f520692d.e.size();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17) {
        vq.h holder = (vq.h) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        com.tencent.mm.emoji.debug.EmojiDebugUI emojiDebugUI = this.f520692d;
        sb6.append(((vq.a) emojiDebugUI.e.get(i17)).c());
        sb6.append(": ");
        java.util.LinkedList linkedList = emojiDebugUI.e;
        sb6.append(((vq.a) linkedList.get(i17)).d());
        java.lang.String sb7 = sb6.toString();
        float b17 = ((vq.a) linkedList.get(i17)).b();
        android.widget.TextView textView = holder.f520695d;
        textView.setText(sb7);
        textView.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.auo);
        if (b17 > 0.0f) {
            textView.setTextSize(b17);
        } else {
            textView.setTextSize(2, 18.0f);
        }
        textView.setOnClickListener(new vq.f(emojiDebugUI, i17));
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup parent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0092xf45d4375 c0092xf45d4375 = new p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0092xf45d4375(parent.getContext(), null);
        c0092xf45d4375.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-1, i65.a.b(parent.getContext(), 48)));
        c0092xf45d4375.setTextColor(-16777216);
        c0092xf45d4375.setGravity(17);
        c0092xf45d4375.setTextSize(2, 18.0f);
        return new vq.h(this.f520692d, c0092xf45d4375);
    }
}
