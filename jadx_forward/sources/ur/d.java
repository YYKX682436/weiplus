package ur;

/* loaded from: classes14.dex */
public class d implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p685x8ad1196e.ui.C10452xae330a2a f511805d;

    public d(com.p314xaae8f345.mm.p685x8ad1196e.ui.C10452xae330a2a c10452xae330a2a) {
        this.f511805d = c10452xae330a2a;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/emojisearch/ui/EmojiSearchEditTextView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ur.g gVar = ur.g.ClearText;
        com.p314xaae8f345.mm.p685x8ad1196e.ui.C10452xae330a2a c10452xae330a2a = this.f511805d;
        c10452xae330a2a.f146488m = gVar;
        c10452xae330a2a.f146484f.setText("");
        c10452xae330a2a.f146484f.setHint(c10452xae330a2a.f146485g);
        c10452xae330a2a.f146483e.setVisibility(8);
        c10452xae330a2a.f146488m = ur.g.UserInput;
        c10452xae330a2a.getClass();
        yj0.a.h(this, "com/tencent/mm/emojisearch/ui/EmojiSearchEditTextView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
