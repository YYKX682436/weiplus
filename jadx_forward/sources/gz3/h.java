package gz3;

/* loaded from: classes15.dex */
public class h extends com.p314xaae8f345.mm.ui.z9 {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2040x373fe494.ui.ActivityC17273xa70a65ea f359287o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2040x373fe494.ui.ActivityC17273xa70a65ea activityC17273xa70a65ea) {
        super(activityC17273xa70a65ea, new fz3.a());
        this.f359287o = activityC17273xa70a65ea;
        r(true);
    }

    @Override // com.p314xaae8f345.mm.ui.z9
    public java.lang.Object d(java.lang.Object obj, android.database.Cursor cursor) {
        fz3.a aVar = (fz3.a) obj;
        if (aVar == null) {
            aVar = new fz3.a();
        }
        aVar.mo9015xbf5d97fd(cursor);
        return aVar;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        gz3.i iVar;
        java.lang.String str;
        fz3.a aVar = (fz3.a) getItem(i17);
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2040x373fe494.ui.ActivityC17273xa70a65ea activityC17273xa70a65ea = this.f359287o;
        if (view == null) {
            view = android.view.View.inflate(activityC17273xa70a65ea.mo55332x76847179(), com.p314xaae8f345.mm.R.C30864xbddafb2a.chr, null);
            iVar = new gz3.i(activityC17273xa70a65ea, null);
            iVar.f359288a = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.hhr);
            iVar.f359289b = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.hjn);
            iVar.f359290c = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.hjl);
            iVar.f359291d = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.hhg);
            view.setTag(iVar);
        } else {
            iVar = (gz3.i) view.getTag();
        }
        e04.n3 b17 = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.k0.b(aVar.f69421xcba638c7, aVar.f69417x70042dc3);
        iVar.f359289b.setText(b17.f69644x29dd02d3);
        iVar.f359290c.setText(k35.m1.f(activityC17273xa70a65ea, aVar.f69416xec8974af, true, false));
        iVar.f359291d.setText(b17.f69642xa2f255bd);
        int dimensionPixelSize = activityC17273xa70a65ea.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.a9d);
        iVar.f359288a.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.ccy);
        if (android.text.TextUtils.isEmpty(b17.f69643x7b28c57e)) {
            iVar.f359288a.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.ccy);
        } else {
            o11.f fVar = new o11.f();
            fVar.f423616g = lp0.b.D();
            com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.m1 Ai = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.m1.Ai();
            java.lang.String str2 = b17.f69643x7b28c57e;
            Ai.getClass();
            if (gm0.j1.a()) {
                str = java.lang.String.format("%s/scanbook_%s", Ai.f240289d + "image/scan/img", kk.k.g(str2.getBytes()));
            } else {
                str = "";
            }
            fVar.f423615f = str;
            fVar.f423611b = true;
            fVar.f423629t = false;
            fVar.f423610a = true;
            fVar.f423620k = dimensionPixelSize;
            fVar.f423619j = dimensionPixelSize;
            fVar.f423624o = com.p314xaae8f345.mm.R.C30861xcebc809e.ccy;
            n11.a.b().h(b17.f69643x7b28c57e, iVar.f359288a, fVar.a());
        }
        return view;
    }

    @Override // com.p314xaae8f345.mm.ui.z9
    public void o() {
        c();
        q();
    }

    @Override // com.p314xaae8f345.mm.ui.z9
    public void q() {
        s(com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.m1.Ai().Bi().mo78085xb5882a6b());
        notifyDataSetChanged();
    }
}
