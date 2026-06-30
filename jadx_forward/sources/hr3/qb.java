package hr3;

/* loaded from: classes11.dex */
public class qb implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hr3.rb f365454d;

    public qb(hr3.rb rbVar) {
        this.f365454d = rbVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/profile/ui/NormalUserFooterPreference$VertifyCardHandler$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        hr3.rb rbVar = this.f365454d;
        if (rbVar.f365481h.L.o2()) {
            c01.e2.F0(rbVar.f365481h.L);
            rbVar.f365481h.L.r3();
            rbVar.f();
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.C16861xdcf09668 c16861xdcf09668 = rbVar.f365481h;
            android.content.Context context = c16861xdcf09668.f279303d;
            db5.e1.u(context, context.getString(com.p314xaae8f345.mm.p2621x8fb0427b.z3.m4(c16861xdcf09668.L.d1()) ? com.p314xaae8f345.mm.R.C30867xcad56011.bfe : com.p314xaae8f345.mm.R.C30867xcad56011.bfd), rbVar.f365481h.f279303d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.bfc), new hr3.pb(this), null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/profile/ui/NormalUserFooterPreference$VertifyCardHandler$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
