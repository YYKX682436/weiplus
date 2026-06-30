package zb3;

/* loaded from: classes9.dex */
public class t implements com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.a4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.text.SpannableString f552824a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.sns.ActivityC16343x55c0d8b f552825b;

    public t(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.sns.ActivityC16343x55c0d8b activityC16343x55c0d8b, android.text.SpannableString spannableString) {
        this.f552825b = activityC16343x55c0d8b;
        this.f552824a = spannableString;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.a4
    /* renamed from: onClick */
    public void mo73850xaf6b9ae9(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.sns.ActivityC16343x55c0d8b activityC16343x55c0d8b = this.f552825b;
        int m66199x7498fe14 = activityC16343x55c0d8b.f227289g.m66199x7498fe14();
        double m66174x7498fe14 = activityC16343x55c0d8b.f227290h.m66174x7498fe14();
        activityC16343x55c0d8b.f227305z = 1;
        activityC16343x55c0d8b.f227290h.m66188x7650bebc(1);
        activityC16343x55c0d8b.f227290h.m66187x53bfe316(activityC16343x55c0d8b.getString(com.p314xaae8f345.mm.R.C30867xcad56011.go8));
        activityC16343x55c0d8b.f227290h.m66186xd192c3d9(true);
        if (m66174x7498fe14 > 0.0d && m66199x7498fe14 > 0) {
            activityC16343x55c0d8b.f227290h.m66177x406a75a(com.p314xaae8f345.mm.p2802xd031a825.ui.r1.o(m66174x7498fe14 * m66199x7498fe14));
        }
        activityC16343x55c0d8b.f227290h.m66181x1a41789a(activityC16343x55c0d8b.E.f226716e);
        activityC16343x55c0d8b.f227297r.setText(this.f552824a);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11701, 4, 0, 0, java.lang.Integer.valueOf(activityC16343x55c0d8b.W6()), 2);
    }
}
