package hr3;

/* loaded from: classes8.dex */
public final class p2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16844x18232797 f365406d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p2(com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16844x18232797 activityC16844x18232797) {
        super(2);
        this.f365406d = activityC16844x18232797;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.CharSequence charSequence;
        pr3.c item = (pr3.c) obj;
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 contact = (com.p314xaae8f345.mm.p2621x8fb0427b.z3) obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "$this$item");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contact, "contact");
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16844x18232797 activityC16844x18232797 = this.f365406d;
        java.lang.String stringExtra = activityC16844x18232797.getIntent().getStringExtra("inviteer");
        if (stringExtra == null || r26.n0.N(stringExtra)) {
            item.f439489g = null;
        } else {
            java.lang.String f17 = com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.n2.f(activityC16844x18232797.f235214m, stringExtra);
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = activityC16844x18232797.mo55332x76847179();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo55332x76847179, "getContext(...)");
            if (f17 == null) {
                charSequence = "";
            } else {
                le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
                java.lang.String string = mo55332x76847179.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572502be4, f17);
                ((ke0.e) xVar).getClass();
                android.text.SpannableString spannableString = new android.text.SpannableString(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(mo55332x76847179, string));
                spannableString.setSpan(new com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.x1(null), 0, f17.length(), 33);
                charSequence = spannableString;
            }
            item.f439489g = charSequence;
            item.f439499t = new hr3.o2(activityC16844x18232797);
        }
        return jz5.f0.f384359a;
    }
}
