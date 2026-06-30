package o12;

/* loaded from: classes10.dex */
public final class t implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1366xb20c216d.p1367x4fe3eeaf.C13260x7cd1df1e f423713d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ o12.u f423714e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1366xb20c216d.p1367x4fe3eeaf.C13257xd7c65e84 f423715f;

    public t(com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1366xb20c216d.p1367x4fe3eeaf.C13260x7cd1df1e c13260x7cd1df1e, o12.u uVar, com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1366xb20c216d.p1367x4fe3eeaf.C13257xd7c65e84 c13257xd7c65e84) {
        this.f423713d = c13260x7cd1df1e;
        this.f423714e = uVar;
        this.f423715f = c13257xd7c65e84;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/emoji/editor/widgets/EmojiEditorTextDecorationsContainer$attach$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1366xb20c216d.p1367x4fe3eeaf.C13260x7cd1df1e c13260x7cd1df1e = this.f423713d;
        if (c13260x7cd1df1e.isEnabled()) {
            yz5.l onUpdateText = c13260x7cd1df1e.getOnUpdateText();
            if (onUpdateText != null) {
                onUpdateText.mo146xb9724478(this.f423714e);
            }
            c13260x7cd1df1e.removeView(this.f423715f);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/emoji/editor/widgets/EmojiEditorTextDecorationsContainer$attach$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
