package hr3;

/* loaded from: classes8.dex */
public final class z1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f365757d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16844x18232797 f365758e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.z3 f365759f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z1(int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16844x18232797 activityC16844x18232797, com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var) {
        super(0);
        this.f365757d = i17;
        this.f365758e = activityC16844x18232797;
        this.f365759f = z3Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        int i17 = this.f365757d;
        o13.p.d(i17);
        if (i17 > 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16844x18232797 activityC16844x18232797 = this.f365758e;
            com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.p2.Bi(activityC16844x18232797.getIntent(), 44, 1, this.f365759f.d1());
            android.content.Intent intent = new android.content.Intent(activityC16844x18232797, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16839xcb4450c0.class);
            intent.putExtra("Select_Talker_Name", activityC16844x18232797.f235209e);
            com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16844x18232797 activityC16844x182327972 = this.f365758e;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(activityC16844x182327972, arrayList.toArray(), "com/tencent/mm/plugin/profile/ui/ContactMoreInfoUI$initCommonChatroom$1$1", "invoke", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            activityC16844x182327972.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(activityC16844x182327972, "com/tencent/mm/plugin/profile/ui/ContactMoreInfoUI$initCommonChatroom$1$1", "invoke", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
        return jz5.f0.f384359a;
    }
}
