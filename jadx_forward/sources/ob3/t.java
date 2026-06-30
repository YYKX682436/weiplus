package ob3;

/* loaded from: classes9.dex */
public class t implements com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.a4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.text.SpannableString f425617a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1821x45c4fe06.ui.p1823xed060d07.ActivityC16326x540b7c63 f425618b;

    public t(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1821x45c4fe06.ui.p1823xed060d07.ActivityC16326x540b7c63 activityC16326x540b7c63, android.text.SpannableString spannableString) {
        this.f425618b = activityC16326x540b7c63;
        this.f425617a = spannableString;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.a4
    /* renamed from: onClick */
    public void mo73850xaf6b9ae9(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1821x45c4fe06.ui.p1823xed060d07.ActivityC16326x540b7c63 activityC16326x540b7c63 = this.f425618b;
        int m66199x7498fe14 = activityC16326x540b7c63.f226566m.m66199x7498fe14();
        double m66033x7498fe14 = activityC16326x540b7c63.f226567n.m66033x7498fe14();
        lb3.i iVar = lb3.i.FIX_NORMAL;
        activityC16326x540b7c63.f226565i = iVar;
        activityC16326x540b7c63.f226567n.m66043x7650bebc(iVar);
        activityC16326x540b7c63.f226567n.m66041xd192c3d9(false);
        activityC16326x540b7c63.f226567n.m66042x53bfe316(activityC16326x540b7c63.getString(com.p314xaae8f345.mm.R.C30867xcad56011.go9));
        if (m66033x7498fe14 > 0.0d && m66199x7498fe14 > 0) {
            activityC16326x540b7c63.f226567n.m66035x406a75a(com.p314xaae8f345.mm.p2802xd031a825.ui.r1.o(m66033x7498fe14 / m66199x7498fe14));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1821x45c4fe06.ui.C16323xdfbab327 c16323xdfbab327 = activityC16326x540b7c63.f226567n;
        lb3.h.GLOBAL.getClass();
        c16323xdfbab327.m66037x1a41789a(200.0d);
        activityC16326x540b7c63.f226574u.setText(this.f425617a);
    }
}
