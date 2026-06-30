package ix3;

/* loaded from: classes5.dex */
public final class s3 extends wm3.a {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f377088d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s3(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f377088d = jz5.h.b(new ix3.r3(this));
    }

    public final em.j3 T6() {
        return (em.j3) ((jz5.n) this.f377088d).mo141623x754a37bb();
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: getLayoutId */
    public int mo569x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.emm;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        java.lang.String str;
        java.lang.String U1;
        com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0 P6 = P6();
        if (P6 != null) {
            P6.mo54450xbf7c1df6("修改消息type");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0 P62 = P6();
        if (P62 != null) {
            P62.mo54448x9c8c0d33(new ix3.p3(this));
        }
        long longExtra = m158359x1e885992().getLongExtra("Chat_Msg_Id", 0L);
        java.lang.String stringExtra = m158359x1e885992().getStringExtra("Chat_User");
        java.lang.String str2 = "";
        if (stringExtra == null) {
            stringExtra = "";
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 k17 = pt0.f0.f439742b1.k(stringExtra, longExtra);
        l15.c cVar = new l15.c();
        if (k17 != null && (U1 = k17.U1()) != null) {
            str2 = U1;
        }
        cVar.m126731xdc93280d(str2, true);
        em.j3 T6 = T6();
        if (T6.f336007c == null) {
            T6.f336007c = (android.widget.TextView) T6.f336005a.findViewById(com.p314xaae8f345.mm.R.id.t2a);
        }
        android.widget.TextView textView = T6.f336007c;
        v05.b k18 = cVar.k();
        if (k18 == null || (str = java.lang.Integer.valueOf(k18.m75939xb282bd08(k18.f449898d + 6)).toString()) == null) {
            str = com.p159x477cd522.p160x333422.C1461x7397cc93.f4739x19d1382a;
        }
        textView.setText(str);
        em.j3 T62 = T6();
        if (T62.f336008d == null) {
            T62.f336008d = (android.widget.Button) T62.f336005a.findViewById(com.p314xaae8f345.mm.R.id.uh6);
        }
        T62.f336008d.setOnClickListener(new ix3.q3(k17, this, cVar));
    }
}
