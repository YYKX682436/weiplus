package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui;

/* loaded from: classes9.dex */
public class s6 extends com.p314xaae8f345.mm.p2802xd031a825.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16370x5a91dd69 f228943d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s6(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16370x5a91dd69 activityC16370x5a91dd69) {
        super(false);
        this.f228943d = activityC16370x5a91dd69;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.z1
    /* renamed from: onRealClick */
    public void mo27114xc7e50b6b(android.view.View view) {
        gb3.p.f351575a.a(16);
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16370x5a91dd69 activityC16370x5a91dd69 = this.f228943d;
        if (activityC16370x5a91dd69.H == null) {
            activityC16370x5a91dd69.getClass();
            android.view.View inflate = android.view.LayoutInflater.from(activityC16370x5a91dd69).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.bvb, (android.view.ViewGroup) null);
            com.p314xaae8f345.mm.ui.C21391x3d89d23a c21391x3d89d23a = (com.p314xaae8f345.mm.ui.C21391x3d89d23a) inflate.findViewById(com.p314xaae8f345.mm.R.id.j7h);
            com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.w6 w6Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.w6(activityC16370x5a91dd69);
            java.util.List list = activityC16370x5a91dd69.E;
            if (list == null) {
                w6Var.f229168d = new java.util.ArrayList();
            } else {
                w6Var.f229168d = list;
            }
            w6Var.notifyDataSetChanged();
            w6Var.f229169e = 0;
            c21391x3d89d23a.setAdapter((android.widget.ListAdapter) w6Var);
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a aVar = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a();
            aVar.f293242a = of5.b.a(activityC16370x5a91dd69).getString(com.p314xaae8f345.mm.R.C30867xcad56011.gnm);
            aVar.L = inflate;
            aVar.G = null;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 j0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0(activityC16370x5a91dd69, com.p314xaae8f345.mm.R.C30868x68b1db1.f576324wd);
            j0Var.e(aVar);
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.d0 d0Var = aVar.f293256m;
            if (d0Var != null) {
                d0Var.a(j0Var.f293370r);
            }
            activityC16370x5a91dd69.H = j0Var;
            c21391x3d89d23a.setOnItemClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.t6(activityC16370x5a91dd69, w6Var));
            activityC16370x5a91dd69.H = activityC16370x5a91dd69.H;
        }
        activityC16370x5a91dd69.H.show();
    }
}
