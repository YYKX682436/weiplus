package y35;

/* loaded from: classes11.dex */
public class g implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ y35.d f540744d;

    public g(y35.d dVar) {
        this.f540744d = dVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/pluginsdk/ui/preference/FMessageItemView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        y35.k kVar = this.f540744d.f540734i;
        if (kVar != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.r0 r0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.r0) kVar;
            java.lang.String d17 = r0Var.f235130b.f234954e.d1();
            ((ku5.t0) ku5.t0.f394148d).g(new com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.f0(r0Var, d17));
        }
        android.view.View inflate = android.view.View.inflate(this.f540744d.f540729d, com.p314xaae8f345.mm.R.C30864xbddafb2a.ckf, null);
        ((android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.mmq)).setVisibility(8);
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21503x6e5a020a c21503x6e5a020a = (com.p314xaae8f345.mm.ui.p2642x2e06d1.C21503x6e5a020a) inflate.findViewById(com.p314xaae8f345.mm.R.id.mmp);
        android.content.Context context = this.f540744d.f540729d;
        if (context instanceof android.app.Activity) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.p2.Bi(((android.app.Activity) context).getIntent(), 28, 1, y35.d.f540728o.f540752a);
        }
        android.content.Context context2 = this.f540744d.f540729d;
        db5.e1.x(context2, context2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572074y0), null, inflate, new y35.e(this, c21503x6e5a020a), null);
        c21503x6e5a020a.post(new y35.f(this));
        yj0.a.h(this, "com/tencent/mm/pluginsdk/ui/preference/FMessageItemView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
