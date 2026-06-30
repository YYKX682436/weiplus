package rf4;

/* loaded from: classes5.dex */
public final class j1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.C18484xfde93083 f476608d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f476609e;

    public j1(com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.C18484xfde93083 c18484xfde93083, android.content.Context context) {
        this.f476608d = c18484xfde93083;
        this.f476609e = context;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/story/ui/view/StoryMsgInputView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.C18484xfde93083 c18484xfde93083 = this.f476608d;
        int inputType = c18484xfde93083.getInputType();
        android.content.Context context = this.f476609e;
        if (inputType == 0) {
            c18484xfde93083.m71442xc17f97e2(2);
            c18484xfde93083.m71437x7a40225b(true);
            c18484xfde93083.f253520h.setImageDrawable(com.p314xaae8f345.mm.ui.uk.e(context, com.p314xaae8f345.mm.R.raw.f79915x64991f25, -1));
        } else {
            if (c18484xfde93083.f253526q) {
                c18484xfde93083.m71442xc17f97e2(0);
                c18484xfde93083.m71437x7a40225b(false);
            } else {
                c18484xfde93083.m71442xc17f97e2(0);
                c18484xfde93083.f253518f.setVisibility(0);
            }
            c18484xfde93083.f253520h.setImageDrawable(com.p314xaae8f345.mm.ui.uk.e(context, com.p314xaae8f345.mm.R.raw.f79773xe53a66d8, -1));
        }
        yj0.a.h(this, "com/tencent/mm/plugin/story/ui/view/StoryMsgInputView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
