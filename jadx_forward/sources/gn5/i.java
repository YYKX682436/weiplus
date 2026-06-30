package gn5;

/* loaded from: classes12.dex */
public class i implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2776x373aa5.p2784xe8855c76.C22838xaf7a8190 f355210d;

    public i(com.p314xaae8f345.mm.p2776x373aa5.p2784xe8855c76.C22838xaf7a8190 c22838xaf7a8190) {
        this.f355210d = c22838xaf7a8190;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/view/popview/EmojiPopView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        nr.f.f420577a.a(3);
        com.p314xaae8f345.mm.p2776x373aa5.p2784xe8855c76.C22838xaf7a8190 c22838xaf7a8190 = this.f355210d;
        c22838xaf7a8190.f295221x = 1;
        c22838xaf7a8190.f295213p.setActivated(true);
        c22838xaf7a8190.f295213p.setVisibility(0);
        c22838xaf7a8190.f295213p.setText(com.p314xaae8f345.mm.R.C30867xcad56011.bx9);
        yj0.a.h(this, "com/tencent/mm/view/popview/EmojiPopView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
