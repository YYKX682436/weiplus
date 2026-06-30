package ui2;

/* loaded from: classes8.dex */
public final class i extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final si2.a f509632e;

    public i(si2.a aVar) {
        this.f509632e = aVar;
    }

    @Override // in5.r
    public int e() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.eah;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        vi2.b item = (vi2.b) cVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        android.view.ViewGroup.LayoutParams layoutParams = holder.f3639x46306858.getLayoutParams();
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1164x587b7ff1.LayoutParams layoutParams2 = layoutParams instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1164x587b7ff1.LayoutParams ? (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1164x587b7ff1.LayoutParams) layoutParams : null;
        if (layoutParams2 != null) {
            layoutParams2.f93474i = true;
        }
        android.view.View findViewById = holder.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.f566253tm2);
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) holder.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.f566251tm0);
        findViewById.setOnClickListener(new ui2.g(this));
        viewGroup.setOnClickListener(new ui2.h(this));
    }
}
