package ga2;

/* loaded from: classes10.dex */
public final class h extends in5.r {
    @Override // in5.r
    public int e() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.ed7;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        ha2.a item = (ha2.a) cVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        super.h(holder, item, i17, i18, z17, list);
        com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078 abstractC15633xee433078 = item.f361328h;
        if (abstractC15633xee433078 == null) {
            return;
        }
        java.lang.String str = abstractC15633xee433078.f219963e;
        if (str == null) {
            str = "";
        }
        android.view.ViewGroup.LayoutParams layoutParams = holder.f3639x46306858.getLayoutParams();
        layoutParams.width = com.p314xaae8f345.mm.ui.bh.a(holder.f374654e).f278668a;
        holder.f3639x46306858.setLayoutParams(layoutParams);
        nz5.b.a(false, false, null, null, 0, new ga2.g(abstractC15633xee433078, str, holder), 31, null);
    }
}
