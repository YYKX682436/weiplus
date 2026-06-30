package hb5;

/* loaded from: classes11.dex */
public class e extends com.p314xaae8f345.mm.ui.z9 {

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.String[] f361691o;

    /* renamed from: p, reason: collision with root package name */
    public final java.util.List f361692p;

    /* renamed from: q, reason: collision with root package name */
    public final s01.h f361693q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f361694r;

    /* renamed from: s, reason: collision with root package name */
    public o11.g f361695s;

    public e(android.content.Context context, s01.a0 a0Var, s01.h hVar, java.lang.String[] strArr, java.util.List list) {
        super(context, a0Var);
        this.f361695s = null;
        this.f361693q = hVar;
        this.f361691o = strArr;
        this.f361692p = list;
        o11.f fVar = new o11.f();
        fVar.f423616g = s01.r.k(hVar.f69170x75756b18);
        fVar.f423611b = true;
        fVar.f423628s = true;
        fVar.f423624o = com.p314xaae8f345.mm.R.raw.f78922x61de8d17;
        this.f361695s = fVar.a();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.x.K0(context.getResources().getDrawable(com.p314xaae8f345.mm.R.raw.f78561x5a5719bf));
    }

    @Override // com.p314xaae8f345.mm.ui.z9
    public java.lang.Object d(java.lang.Object obj, android.database.Cursor cursor) {
        s01.a0 a0Var = new s01.a0();
        a0Var.mo9015xbf5d97fd(cursor);
        return a0Var;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        hb5.f fVar;
        if (view == null) {
            view = android.view.View.inflate(this.f294141e, com.p314xaae8f345.mm.R.C30864xbddafb2a.f569691iq, null);
            fVar = new hb5.f(null);
            fVar.f361717a = (com.p314xaae8f345.mm.ui.p2642x2e06d1.C21522xf5a6e956) view.findViewById(com.p314xaae8f345.mm.R.id.a5y);
            fVar.f361718b = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.a5z);
            view.setTag(fVar);
        } else {
            fVar = (hb5.f) view.getTag();
        }
        if (i17 == 0 && com.p314xaae8f345.mm.ui.p2646xfa354eeb.ActivityC21583x3a52b428.f279419o) {
            fVar.getClass();
            throw null;
        }
        s01.a0 a0Var = (s01.a0) getItem(i17 - (com.p314xaae8f345.mm.ui.p2646xfa354eeb.ActivityC21583x3a52b428.f279419o ? 1 : 0));
        fVar.f361718b.setTextColor(i65.a.e(this.f294141e, com.p314xaae8f345.mm.R.C30859x5a72f63.f560946yk));
        n11.a.b().h(a0Var.f65837x35be6339, (android.widget.ImageView) fVar.f361717a.m79176xc2a54588(), this.f361695s);
        fVar.f361717a.m79178xd0b5cd2c(null);
        java.lang.String str = a0Var.f65840x13fe5d2b;
        s01.h hVar = this.f361693q;
        java.lang.String v07 = hVar != null ? hVar.v0(str) : null;
        android.widget.TextView textView = fVar.f361718b;
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        android.content.Context context = this.f294141e;
        float textSize = fVar.f361718b.getTextSize();
        ((ke0.e) xVar).getClass();
        textView.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(context, v07, textSize));
        return view;
    }

    @Override // com.p314xaae8f345.mm.ui.z9
    public int m() {
        return com.p314xaae8f345.mm.ui.p2646xfa354eeb.ActivityC21583x3a52b428.f279419o ? 1 : 0;
    }

    @Override // com.p314xaae8f345.mm.ui.z9
    public /* bridge */ /* synthetic */ java.lang.Object n() {
        return null;
    }

    @Override // com.p314xaae8f345.mm.ui.z9
    public void o() {
        q();
    }

    @Override // com.p314xaae8f345.mm.ui.z9
    public boolean p(int i17) {
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.z9
    public void q() {
        java.lang.String str;
        java.lang.String str2;
        c();
        s01.d0 Vi = r01.q3.Vi();
        java.lang.String str3 = this.f361694r;
        Vi.getClass();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("select *  from BizChatUserInfo where ");
        java.lang.String[] strArr = this.f361691o;
        java.lang.String str4 = "";
        if (strArr == null || strArr.length == 0) {
            str = "";
        } else {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder(" 1=1 ");
            java.util.List list = this.f361692p;
            if (list == null || list.size() <= 0) {
                str2 = "";
            } else {
                java.util.Iterator it = list.iterator();
                str2 = "";
                while (it.hasNext()) {
                    str2 = str2 + " and userId != '" + ((java.lang.String) it.next()) + "'";
                }
            }
            sb7.append(str2);
            sb7.append(" and userId in(");
            for (int i17 = 0; i17 < strArr.length; i17++) {
                if (i17 > 0) {
                    sb7.append(" , ");
                }
                sb7.append(" '");
                sb7.append(strArr[i17]);
                sb7.append("' ");
            }
            sb7.append(" )");
            str = sb7.toString();
        }
        sb6.append(str);
        if (str3 != null && !str3.equals("")) {
            str4 = " and (userName like '%" + str3 + "%' )";
        }
        sb6.append(str4);
        sb6.append(" order by  case when length(BizChatUserInfo.userNamePY) > 0 then upper(BizChatUserInfo.userNamePY)  else upper(BizChatUserInfo.userName) end asc,  upper(BizChatUserInfo.userNamePY) asc,  upper(BizChatUserInfo.userName) asc ");
        s(Vi.f483392e.B(sb6.toString(), null));
        notifyDataSetChanged();
    }
}
