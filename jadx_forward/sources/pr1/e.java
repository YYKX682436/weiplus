package pr1;

/* loaded from: classes9.dex */
public class e implements fb5.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1291x2e06d1.ViewOnCreateContextMenuListenerC12986xffd38cd1 f439470a;

    public e(com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1291x2e06d1.ViewOnCreateContextMenuListenerC12986xffd38cd1 viewOnCreateContextMenuListenerC12986xffd38cd1) {
        this.f439470a = viewOnCreateContextMenuListenerC12986xffd38cd1;
    }

    @Override // fb5.l
    public android.view.View a(fb5.n nVar, android.view.View view, android.view.ViewGroup viewGroup, int i17, int i18, boolean z17, boolean z18) {
        pr1.k kVar;
        android.view.View view2;
        java.lang.String string;
        boolean z19 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        android.os.SystemClock.elapsedRealtime();
        com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1291x2e06d1.ViewOnCreateContextMenuListenerC12986xffd38cd1 viewOnCreateContextMenuListenerC12986xffd38cd1 = this.f439470a;
        android.content.Context context = viewOnCreateContextMenuListenerC12986xffd38cd1.getContext();
        if (view == null) {
            view2 = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f569781o2, (android.view.ViewGroup) null);
            kVar = new pr1.k();
            kVar.f439476c = (android.widget.TextView) view2.findViewById(com.p314xaae8f345.mm.R.id.bdd);
            kVar.f439475b = view2.findViewById(com.p314xaae8f345.mm.R.id.cgr);
            kVar.f439478e = (android.widget.ImageView) view2.findViewById(com.p314xaae8f345.mm.R.id.f564616w4);
            kVar.f439477d = (android.widget.ImageView) view2.findViewById(com.p314xaae8f345.mm.R.id.k9j);
            kVar.f439479f = (android.widget.TextView) view2.findViewById(com.p314xaae8f345.mm.R.id.awx);
            kVar.f439480g = view2.findViewById(com.p314xaae8f345.mm.R.id.mkr);
            kVar.f439481h = (android.widget.TextView) view2.findViewById(com.p314xaae8f345.mm.R.id.t3k);
            view2.setTag(kVar);
        } else {
            kVar = (pr1.k) view.getTag();
            view2 = view;
        }
        r45.co coVar = (r45.co) nVar.f342431b;
        if (coVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BrandServiceSortView", "should not be empty");
            return view2;
        }
        pr1.i iVar = viewOnCreateContextMenuListenerC12986xffd38cd1.F;
        if (iVar != null) {
            iVar.X5(i17, coVar.f453209d);
        }
        if (viewOnCreateContextMenuListenerC12986xffd38cd1.f279405p && z17) {
            kVar.f439476c.setText(nVar.f342430a);
            kVar.f439476c.setVisibility(0);
        } else {
            kVar.f439476c.setVisibility(8);
        }
        if (viewOnCreateContextMenuListenerC12986xffd38cd1.f175587y) {
            kVar.f439481h.setVisibility(0);
            pr1.h hVar = viewOnCreateContextMenuListenerC12986xffd38cd1.G;
            if (hVar != null) {
                android.widget.TextView textView = kVar.f439481h;
                java.lang.String username = coVar.f453209d;
                tw.i iVar2 = (tw.i) hVar;
                iVar2.getClass();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
                if (android.text.TextUtils.isEmpty(username)) {
                    string = "";
                } else {
                    e31.k U6 = iVar2.U6();
                    boolean n17 = U6 != null ? ((g31.l) U6).n(username) : false;
                    if (n17) {
                        e31.k U62 = iVar2.U6();
                        int l17 = U62 != null ? ((g31.l) U62).l(username) : 0;
                        if (l17 > 0) {
                            string = iVar2.m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.o6c, java.lang.Integer.valueOf(l17));
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
                        }
                    }
                    string = iVar2.m80379x76847179().getString(n17 ? com.p314xaae8f345.mm.R.C30867xcad56011.o5p : com.p314xaae8f345.mm.R.C30867xcad56011.f573652o34);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
                }
                textView.setText(string);
            }
        } else {
            kVar.f439481h.setVisibility(8);
        }
        java.lang.String str = coVar.f453209d;
        kVar.f439474a = str;
        kVar.f439478e.setTag(str);
        ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.z) i95.n0.c(kv.z.class))).Ni(kVar.f439478e, kVar.f439474a);
        java.lang.String g27 = coVar.f453210e.g2();
        android.widget.TextView textView2 = kVar.f439479f;
        int textSize = (int) textView2.getTextSize();
        viewOnCreateContextMenuListenerC12986xffd38cd1.getClass();
        if (textView2 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.BrandServiceSortView", "display area is null");
        } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(g27)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.BrandServiceSortView", "remark is null");
        } else {
            java.util.HashMap hashMap = viewOnCreateContextMenuListenerC12986xffd38cd1.f175581s;
            android.text.SpannableString spannableString = (android.text.SpannableString) hashMap.get(g27);
            if (spannableString == null) {
                try {
                    android.text.SpannableString spannableString2 = new android.text.SpannableString(((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).bj(context, g27, textSize));
                    hashMap.put(g27, spannableString2);
                    textView2.setText(spannableString2);
                } catch (java.lang.Exception unused) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.BrandServiceSortView", "error, set empty str");
                    textView2.setText("");
                }
            } else {
                textView2.setText(spannableString);
            }
        }
        int i19 = coVar.f453211f.f66745x10a0fed7;
        android.widget.ImageView imageView = kVar.f439477d;
        viewOnCreateContextMenuListenerC12986xffd38cd1.getClass();
        imageView.setVisibility(8);
        if (viewOnCreateContextMenuListenerC12986xffd38cd1.m79354xfb82a219() == 0 && z18) {
            kVar.f439480g.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f562843q6);
        } else {
            kVar.f439480g.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.bfj);
        }
        if (viewOnCreateContextMenuListenerC12986xffd38cd1.f279406q) {
            android.view.View view3 = kVar.f439475b;
            view3.setPadding(view3.getPaddingLeft(), kVar.f439475b.getPaddingTop(), (int) viewOnCreateContextMenuListenerC12986xffd38cd1.getContext().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561094d), kVar.f439475b.getPaddingBottom());
        } else {
            android.view.View view4 = kVar.f439475b;
            view4.setPadding(view4.getPaddingLeft(), kVar.f439475b.getPaddingTop(), (int) viewOnCreateContextMenuListenerC12986xffd38cd1.getContext().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.i_), kVar.f439475b.getPaddingBottom());
        }
        android.os.SystemClock.elapsedRealtime();
        pr1.i iVar3 = viewOnCreateContextMenuListenerC12986xffd38cd1.F;
        if (iVar3 != null) {
            iVar3.S4(i17, coVar.f453209d);
        }
        return view2;
    }
}
