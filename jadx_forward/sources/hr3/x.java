package hr3;

/* loaded from: classes4.dex */
public class x implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.C16835xc2052bf9 f365697d;

    public x(com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.C16835xc2052bf9 c16835xc2052bf9) {
        this.f365697d = c16835xc2052bf9;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/profile/ui/BizBindWxaInfoPreference$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.Object tag = view.getTag();
        if (tag == null || !(tag instanceof java.lang.String)) {
            yj0.a.h(this, "com/tencent/mm/plugin/profile/ui/BizBindWxaInfoPreference$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.C12559xbdae8559 c12559xbdae8559 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.C12559xbdae8559();
        c12559xbdae8559.f169323f = com.p314xaae8f345.p2926x359365.C25483x77a9a59f.f46407x44d8fa6c;
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.C16835xc2052bf9 c16835xc2052bf9 = this.f365697d;
        c12559xbdae8559.f169324g = c16835xc2052bf9.P.f66748xdec927b;
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.xc) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6.class))).Vi(c16835xc2052bf9.f279303d, (java.lang.String) tag, null, 0, 0, null, c12559xbdae8559, c16835xc2052bf9.P.f66730x28d45f97);
        yj0.a.h(this, "com/tencent/mm/plugin/profile/ui/BizBindWxaInfoPreference$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
